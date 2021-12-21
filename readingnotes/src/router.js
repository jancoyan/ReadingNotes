import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRoutes = [
    {
        path: '/',
        name: 'index',
        component: () => import('./view/index/index'),
        children:[
            {
                path: '/',
                name: 'index',
                component: () => import('./view/index/BookWaterfall'),
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
        ]
    },
    {
        path:'/login',
        name:'login',
        component: () => import('./view/back/login')
    },
    {
        path:"/back",
        name: "back",
        redirect: '/back/manage',
        component: () => import('./view/back/index'),
        children: [
            {
                path: '/back/manage',
                name: 'manage',
                component: () => import('./view/back/manage'),
            },
            {
                path: '/back/add',
                name: 'add',
                component: () => import('./view/back/add'),
            },
            {
                path: '/back/viewer',
                name: 'viewer',
                component: () => import('./view/back/viewer'),
            },
        ]
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
