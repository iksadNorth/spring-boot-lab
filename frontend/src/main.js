import { createApp } from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'

import axios from 'axios'
import store from './store'
import router from './route';

loadFonts()

const app = createApp(App)

app.config.globalProperties.$axios = axios;
axios.defaults.baseURL = 'http://localhost:8080'

app.use(vuetify)
app.use(store)
app.use(router)
app.mount('#app')
