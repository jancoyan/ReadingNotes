import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRoutes = [
    {
        path: '/index',
        name: 'index',
        component: () => import('./view/index/index'),
    },
    {
        path: '/statistic',
        name: 'statistic',
        component: () => import('./view/index/statistic'),
    },
    {
        path: '/table',
        name: 'table',
        component: () => import('./view/index/table'),
    },
    {
        path: '/404',
        component: () => import('./view/404'),
        hidden: true
    },

    { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
    scrollBehavior: () => ({ y: 0 }),
    routes: constantRoutes
})

const router = createRouter()

export function resetRouter() {
    const newRouter = createRouter()
    router.matcher = newRouter.matcher
}

export default router
