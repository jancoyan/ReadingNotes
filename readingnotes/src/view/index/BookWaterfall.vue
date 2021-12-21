<template>
  <div class="waterfall">
    <waterfall :col="5" :data="[1,2,3,4,5,6,7,8]">
        <template>
          <div
            class="waterfall-item"
            v-for="(item,index) in [1,2,3,4,5,6,7,8,9,10,11,12,13,14]"
            :key="index"
          >
            <book-block :imageUrl="'http://101.201.64.102:8000/picture/waterfall/' + (index+7) + '.png'" />
          </div>
        </template>
      </waterfall>
      <!-- 回到顶部 -->
      <el-backtop></el-backtop>
  </div>
</template>

<script>
import BookBlock from './component/BookBlock.vue'

export default {
  name: 'BookWaterfall',
  components:{
    BookBlock
  },
}
</script>

<style scoped lang="scss">

  .waterfall{
    margin:0 15%;
    .waterfall-item{
      display: flex;
      flex-direction: row;
      box-sizing: border-box;
      padding: 20px;
    }
  }

</style>
