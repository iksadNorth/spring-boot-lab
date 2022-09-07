import { createWebHistory, createRouter } from 'vue-router';

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/view_Home.vue'), 
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/view_Login.vue'), 
  },
  {
    path: '/memo',
    name: 'Memo',
    component: () => import('../views/view_Memo.vue'), 
  },
  {
    path: '/dash',
    name: 'DashBoard',
    component: () => import('../views/view_DashBoard.vue'), 
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
