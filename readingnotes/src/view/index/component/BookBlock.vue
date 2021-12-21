<template>
  <div class="book">
    <!-- 图片 -->
    <el-image :src="imageUrl" alt="加载失败" @click="pictureClickHandler"/>
    <!-- 信息 -->
    <div class="book-info">
      <el-tag effect="dark" type="warning">标签一</el-tag>
      <el-tag effect="plain" type="warning">标签一</el-tag>
      <el-tag effect="plain" type="warning">标签一</el-tag>
      <el-tag effect="plain" type="warning">标签一</el-tag>
    </div>
  </div>
</template>

<script>
export default{
  name:"BookBlock",
  props:{
    imageUrl: String,
  },
  data(){
    return{

    }
  },
  methods:{
    pictureClickHandler(){
      console.log("点击了图片");
    }
  }
}

</script>

<style scoped lang="scss">
.book{
  border-radius: 10px;
  padding: 10px;
  display: flex;
  flex-direction: column;
  background: rgb(250, 246, 238);

  .el-image{
    border-radius: 8px;
  }

  &-info{
    padding-top: 5px;

    .el-tag{
      margin: 5px 3px;
    }
  }
}
</style>