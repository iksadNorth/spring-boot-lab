<template>
  <v-app>
    <v-layout>
      <v-app-bar color="header">
        <Header />
      </v-app-bar>

      <v-main class="main">
        <router-view></router-view>	
      </v-main>
    </v-layout>

    <v-footer class="footer">
      <Footer />
    </v-footer>
  </v-app>
</template>

<script>
import Header from './components/com_Header.vue'
import Footer from './components/com_Footer.vue'

export default {
  name: 'App',

  components: {
    Header, Footer
  },
}
</script>

<style>
  #header {
    max-height: 100px;
  }

  #footer {
    max-height: 100px;
  }
</style>
