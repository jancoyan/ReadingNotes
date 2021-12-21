<template>
  <div class="layout">
    <el-menu
        default-active="2"
        mode="horizontal"
        @select="handleSelect"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b">
      <el-menu-item index="1">主页</el-menu-item>
      <el-menu-item index="2">管理</el-menu-item>
      <el-menu-item index="3">添加</el-menu-item>
      <el-menu-item index="4">访客</el-menu-item>
    </el-menu>
    <router-view />
  </div>
</template>

<script>
export default {
  name: "index",
  data() {
    return {
    };
  },
  methods: {
    handleSelect(key) {
      let path = ['/', '/back/manage', '/back/add', '/back/viewer']
      if(path[key - 1] === this.$route.path) return
      this.$router.push(path[key-1])
    }
  }
}
</script>

<style lang="scss" scoped>

.layout{
  min-height: 100vh;
  width: 100vw;
  background-color: #dfe4ea;

  .el-menu{
    padding: 0 10%;
  }
}

</style>