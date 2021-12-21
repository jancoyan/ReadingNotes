<template>
  <div class="add">
    <el-form ref="form" :model="form" label-width="80px" inline class="form">
      <el-form-item label="书名">
        <el-input v-model="form.title"></el-input>
      </el-form-item>
      <el-form-item label="出版社">
        <el-select v-model="form.publisher" filterable placeholder="选择或搜索">
<!--          <el-option v-for="item in typeList" :key="item.typeId" :label="item.typeName"-->
<!--                     :value="item.typeId">-->
<!--          </el-option>-->
        </el-select>
      </el-form-item>
      <el-form-item label="类型">
        <el-select v-model="form.publisher" filterable placeholder="选择或搜索">
<!--          <el-option v-for="item in typeList" :key="item.typeId" :label="item.typeName"-->
<!--                     :value="item.typeId">-->
<!--          </el-option>-->
        </el-select>
      </el-form-item>
      <el-form-item label="字数(w)">
        <el-input v-model="form.title" :inline="true"></el-input>
      </el-form-item>
      <el-form-item label="读完时间">
        <el-date-picker type="date" placeholder="选择日期" v-model="form.date"></el-date-picker>
      </el-form-item>
      <el-form-item
          v-for="(tag, index) in form.tags"
          :label="'标签' + (index + 1)"
          :key="tag.key"
          :prop="'tags.' + index + '.value'"
      >
        <el-select v-model="tag.value" filterable placeholder="选择或搜索">
          <!--          <el-option v-for="item in typeList" :key="item.typeId" :label="item.typeName"-->
          <!--                     :value="item.typeId">-->
          <!--          </el-option>-->
        </el-select>
        <el-button @click.prevent="removeTag(tag)">删除</el-button>
      </el-form-item>
      <el-button @click="addTag" type="primary">新增标签</el-button>
      <el-form-item>
        <el-button type="primary" class="submit" @click="onSubmit">提交</el-button>
      </el-form-item>
    </el-form>
    <div class="mdcontainer">
      <markdown
          :mdValuesP="'Hello World'"
          :fullPageStatusP="false"
          :editStatusP="true"
          :previewStatusP="true"
          :navStatusP="true"
          :icoStatusP="true"
          @childevent="childEventHandler"
      ></markdown>
    </div>
    <div class="cropper">
      <cropper-image
          :Name="cropperName"
          @uploadImgSuccess="handleUploadSuccess"
          ref="child"
      >
      </cropper-image>
    </div>
  </div>
</template>

<script>
import CropperImage from './components/CropperImage'
import markdown from './components/markdown'
export default {
  name: "add",
  data() {
    return {
      form: {
        title: '',
        publisher: '',
        type: '',
        tags: [
            {value: ''}
        ],
        wordcount: 0,
        date: '',
        note: ''
      },
      cropperName: 'CropperImage',
    };
  },
  components: {
    markdown,
    CropperImage
  },
  methods: {
    onSubmit() {
      console.log('submit!');
    },
    // 监听事件，接收子组件传过来的数据
    childEventHandler:function(res){
      // res会传回一个data,包含属性mdValue和htmlValue，具体含义请自行翻译
      this.msg=res;
    },
    removeTag(item) {
      let index = this.form.tags.indexOf(item)
      if (index !== -1) {
        this.form.tags.splice(index, 1)
      }
    },
    addTag() {
      this.form.tags.push({
        value: '',
        key: Date.now()
      });
    },
    //图片上传成功后
    handleUploadSuccess(data) {

    },
  }
}
</script>

<style scoped lang="scss">

.add{
  margin: 0 10%;
  padding: 20px;
  height: auto;
  background-color: white;
  overflow: auto;
  .mdcontainer{
    height: 500px;
  }

  .submit{
    margin-left: 20px;
  }

  .cropper{
    margin: 20px 0;
  }

}

</style>