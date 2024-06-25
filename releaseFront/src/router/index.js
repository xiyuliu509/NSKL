import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Home from '@/components/Home'
import ArticleList from '@/components/ArticleList'
import CateMana from '@/components/CateMana'
import DataCharts from '@/components/DataCharts'
import PostArticle from '@/components/PostArticle'
import UserMana from '@/components/UserMana'
import BlogDetail from '@/components/BlogDetail'
import Signin from '@/components/SignIn'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '登录',
      hidden: true,
      component: Login
    }, {
      path:'/signin',
      name:'注册',
      hidden:true,
      component:Signin
    },{
      path: '/home',
      name: '',
      component: Home,
      hidden: true
    }, {
      path: '/home',
      component: Home,
      name: '帖子管理',
      iconCls: 'fa fa-file-text-o',
      children: [
        {
          path: '/articleList',
          name: '帖子列表',
          component: ArticleList,
          meta: {
            keepAlive: true
          }
        }, {
          path: '/postArticle',
          name: '发表帖子',
          component: PostArticle,
          meta: {
            keepAlive: false
          }
        }, {
          path: '/blogDetail',
          name: '博客详情',
          component: BlogDetail,
          hidden: true,
          meta: {
            keepAlive: false
          }
        }, {
          path: '/editBlog',
          name: '编辑帖子',
          component: PostArticle,
          hidden: true,
          meta: {
            keepAlive: false
          }
        }
      ]
    }, {
      path: '/home',
      component: Home,
      name: '用户编辑',
      children: [
        {
          path: '/user',
          iconCls: 'fa fa-user-o',
          name: '用户编辑',
          component: UserMana
        }
      ]
    }, {
      path: '/home',
      component: Home,
      name: '分类编辑',
      children: [
        {
          path: '/cateMana',
          iconCls: 'fa fa-reorder',
          name: '分类编辑',
          component: CateMana
        }
      ]
    }
  ]
})
