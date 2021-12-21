<template>
  <div class="management">
<!--    筛选-->


<!--    表格-->
    <el-table
        :data="tableData"
        border
        @selection-change="handleSelectionChange"
        style="width: 100%">
      <el-table-column
          type="selection"
          width="55">
      </el-table-column>
      <el-table-column
          prop="name"
          label="书名"
          width="200">
      </el-table-column>

      <el-table-column
          prop="province"
          label="作者"
          width="150">
      </el-table-column>
      <el-table-column
          prop="city"
          label="类型"
          width="120">
      </el-table-column>
      <el-table-column
          prop="address"
          label="出版社"
          width="300">
      </el-table-column>
      <el-table-column
          prop="zip"
          label="字数"
          width="120">
      </el-table-column>
      <el-table-column
          prop="date"
          label="读完的日期"
          width="150">
      </el-table-column>
      <el-table-column
          fixed="right"
          label="操作"
          width="150">
        <template slot-scope="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
          <el-button type="text" size="small">编辑</el-button>
          <el-button type="text" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
<!--    分页-->
    <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage"
        :page-sizes="[100, 200, 300, 400]"
        :page-size="100"
        layout="total, sizes, prev, pager, next, jumper"
        :total="400"
        class="pagination"
    >
    </el-pagination>

  </div>
</template>

<script>
export default {
  name: "manage",
  data() {
    return {
      tableData: [{
        date: '2016-05-02',
        name: '书名1',
        province: '上海',
        city: '普陀区',
        address: '上海市沙江路 1518 弄',
        zip: 200333
      }, {
        date: '2016-05-04',
        name: '书名1',
        province: '上海',
        city: '普陀区',
        address: '上海市普陀路 1517 弄',
        zip: 200333
      }, {
        date: '2016-05-01',
        name: '书名1',
        province: '上海',
        city: '普陀区',
        address: '上海市沙江路 1519 弄',
        zip: 200333
      }, {
        date: '2016-05-03',
        name: '书名1',
        province: '上海',
        city: '普陀区',
        address: '上海516 弄',
        zip: 200333
      }],
      multipleSelection: [],
      currentPage: 1,
    };
  },
  methods: {
    handleClick(row) {
      console.log(row)
    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    }
  }
}
</script>

<style scoped lang="scss">
.management{
  background-color: white;
  margin: 0 10%;
  padding: 20px;

  .pagination{
    margin-top: 20px;
  }
}
</style>