<template>
  <div class="login">
    <div class="enter">
      <span class="text">密码</span>
      <input type="password" maxlength="16" class="pwd" @keydown.enter="enterPasswordHandler"/>
    </div>
  </div>
</template>

<script>
export default{
  data(){
    return {

    }
  },
  methods:{
    enterPasswordHandler(){
      console.log("enter password");
      this.$router.push('/back')
    }
  }
}

</script>

<style scoped lang="scss">
.login{
  background:#2f3542 ;
  height: 100vh;
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;

  .enter{
    display: flex;
    align-items: center;

    .text{
      padding: 10px;
      font-weight: bold;
      color: #dfe4ea;
    }

    .pwd{
      height: 35px;
      width: 300px;
      border: 1px solid #dfe4ea;
      border-radius: 10px;
      font-size: 20px;
      padding: 10px;
    }
  }


}
</style>