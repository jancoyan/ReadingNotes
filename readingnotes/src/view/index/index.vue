<template>
  <div class="index">
    <header>
      <a href="#" class="logo">Logo</a>
      <ul>
        <li><a href="#">List</a></li>
        <li><a href="#">Statistic</a></li>
        <li><a href="#">Login</a></li>
      </ul>
    </header>

    <!-- 背景 -->
    <div class="bg">
      <div class="text"></div>
      
    </div>

    <!-- 瀑布流 -->
    <div class="waterfall">
      
    </div>

    <!-- 回到顶部 -->
     <el-backtop></el-backtop>
  </div>
</template>

<script>
export default {
  name: "index",
  data() {
    return {};
  },
  methods: {

  }
}
</script>

<style scoped lang="scss">

.index{
  /* 背景渐变 */
  background: linear-gradient(#643932, #C77C55);
  /* body的最小高度为100%视窗 */
  min-height: 100vh;
  /* x轴上超出部分隐藏 */
  overflow-x: hidden;

  header{
    /* 导航栏绝对定位 */
    position: absolute;
    /* 定位在页面的顶部，并且长度为100% */
    top: 0;
    left: 0;
    width: 100%;
    padding: 30px 100px;
    /* 弹性盒子，分散对齐，垂直居中 */
    display: flex;
    justify-content: space-between;
    align-items: center;
    /* 显示在最顶层 */
    z-index: 1000;

    .logo{
      color: white;
      font-weight: 700;
      text-decoration: none;
      font-size: 2em;
      /* 大写 */
      text-transform: uppercase;
      /* 字符间距 */
      letter-spacing: 2px;
    }

    ul{
      /* 弹性盒模型 */
      display: flex;
      justify-content: center;
      align-items: center;

      li{
        list-style: none;
        margin-left: 20px;

        a {
          text-decoration: none;
          padding: 6px 15px;
          color: #fff;
          border-radius: 20px;

          &:hover,&:active{
            background: #fff;
            color: #2b1055;
          }
        }
      }
    }

  }

  .bg{
    /* 子绝父相-父元素相对定位，宽高占满屏 */
    position: relative;
    background-image: url("../../assets/background.png");
    width: 100%;
    height: 100vh;
    padding: 100px;
    /* 弹性盒模型，文字和按钮居中显示 */
    display: flex;
    justify-content: center;
    align-items: center;
    /* 滑动的时候超出，这时候隐藏 */
    overflow: hidden;
    
    // 背景向下渐变逐渐消失
    &::before{
      content: '';
      position: absolute;
      bottom: 0;
      width: 100%;
      height: 100px;
      background: linear-gradient(to top, #764538, transparent);
      z-index: 1000;
    }

    .text{
      position: relative;
      color: #fff;
      font-size: 3em;
    }

  }

  .waterfall{
    height: 5000px;
  }





}

</style>