<template>
  <div class="dashboard-container">
    <waterfall :col="8" :data="[1,2,3,4,5,6,7,8,9,10]">
      <template>
        <div
          class="pr pbImgBox"
          v-for="(item,index) in [1,2,3,4,5,6,7,8,9,10]"
          :key="index">
          <img :src="'../../assets/images/' + index + '.png'" alt="加载错误" />
        </div>
      </template>
    </waterfall>
  </div>
</template>

<script>

export default {
  name: 'Dashboard',
  data() {
    return {}
  },
  computed: {
    itemWidth() {
      return (138 * 0.5 * (document.documentElement.clientWidth / 375)) // #rem布局 计算宽度
    },
    gutterWidth() {
      return (9 * 0.5 * (document.documentElement.clientWidth / 375))	// #rem布局 计算x轴方向margin(y轴方向的margin自定义在css中即可)
    }
  },
  methods: {
    scroll(scrollData) {
      console.log(scrollData)
    },
    switchCol(col) {
      this.col = col
      console.log(this.col)
    },
    loadmore(index) {
      this.data = this.data.concat(this.data)
    }
  }
}
</script>

<style lang="scss" scoped>

</style>
