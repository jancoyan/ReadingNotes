import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import App from './App'
import router from './router'

import waterfall2 from 'vue-waterfall2'

// import marked from 'marked'
// Vue.use(marked)
// import scroll from 'vue-scroll'
// Vue.use(scroll)

// 全局CSS
import './style/index.css'

Vue.use(ElementUI)
Vue.use(waterfall2)

Vue.config.productionTip = false

new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
