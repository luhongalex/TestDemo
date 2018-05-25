package com.example.dell.androidexam.data.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public class Login {

    /**
     * status : 0
     * msg : 登录成功
     * user : {"userId":"758","key":"422b2f694538413939524f376d52536a6a6c4763755a50726547696436684b556d4e2b446b46334545663943782b4956494c55775343714a6d367472644d444d4439637a554853675076593d","phone":"13252028551","name":"李大腾腾","pic":"http://file.8lingling.com/lingling/201805/20180522165146208","sex":"1","birthday":"","disc":"123","integral":"60","type":"2","province":"重庆","city":"合川区","isThird":"false","isDisabled":"0","isManager":"1","teachAge":"","teachType":""}
     * org : [{"id":"95997226","name":"铃铃官方","pic":"http://file.8lingling.com/common/image/org_20180411100324218770.jpg","picStyle":"http://file.8lingling.com/common/image/org_20180411100324218770.jpg,http://file.8lingling.com/common/image/org_20180411100324685280.jpg,http://file.8lingling.com/common/image/org_20180411100324871859.jpg,http://file.8lingling.com/lingling/201804/20180410093958943,http://file.8lingling.com/lingling/201804/20180410093958971,http://file.8lingling.com/common/image/org_20180411100613318700.jpg","logo":"http://file.8lingling.com/common/image/user_20180411100147328589.jpg","disc":"这里下午在咯一开心","type":"51","province":"","city":"","area":"","address":"创客广场(北京市昌平区)338号","contacts":"","phone":"13252028551","labelid":"51","label":"音乐","colorflg":"5","isYz":"0","yztype":"1","yzmap":"http://file.8lingling.com/org/000/image/exchange_20180402185228843276.jpg","longitude":"0.0","latitude":"0.0"}]
     */

    public int status;
    public String msg;
    public UserBean user;
    public List<OrgBean> org;

    public static Login objectFromData(String str) {

        return new Gson().fromJson(str, Login.class);
    }

    public static class UserBean {
        /**
         * userId : 758
         * key : 422b2f694538413939524f376d52536a6a6c4763755a50726547696436684b556d4e2b446b46334545663943782b4956494c55775343714a6d367472644d444d4439637a554853675076593d
         * phone : 13252028551
         * name : 李大腾腾
         * pic : http://file.8lingling.com/lingling/201805/20180522165146208
         * sex : 1
         * birthday :
         * disc : 123
         * integral : 60
         * type : 2
         * province : 重庆
         * city : 合川区
         * isThird : false
         * isDisabled : 0
         * isManager : 1
         * teachAge :
         * teachType :
         */

        public String userId;
        public String key;
        public String phone;
        public String name;
        public String pic;
        public String sex;
        public String birthday;
        public String disc;
        public String integral;
        public String type;
        public String province;
        public String city;
        public String isThird;
        public String isDisabled;
        public String isManager;
        public String teachAge;
        public String teachType;

        public static UserBean objectFromData(String str) {

            return new Gson().fromJson(str, UserBean.class);
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public String getIntegral() {
            return integral;
        }

        public void setIntegral(String integral) {
            this.integral = integral;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getIsThird() {
            return isThird;
        }

        public void setIsThird(String isThird) {
            this.isThird = isThird;
        }

        public String getIsDisabled() {
            return isDisabled;
        }

        public void setIsDisabled(String isDisabled) {
            this.isDisabled = isDisabled;
        }

        public String getIsManager() {
            return isManager;
        }

        public void setIsManager(String isManager) {
            this.isManager = isManager;
        }

        public String getTeachAge() {
            return teachAge;
        }

        public void setTeachAge(String teachAge) {
            this.teachAge = teachAge;
        }

        public String getTeachType() {
            return teachType;
        }

        public void setTeachType(String teachType) {
            this.teachType = teachType;
        }
    }

    public static class OrgBean {
        /**
         * id : 95997226
         * name : 铃铃官方
         * pic : http://file.8lingling.com/common/image/org_20180411100324218770.jpg
         * picStyle : http://file.8lingling.com/common/image/org_20180411100324218770.jpg,http://file.8lingling.com/common/image/org_20180411100324685280.jpg,http://file.8lingling.com/common/image/org_20180411100324871859.jpg,http://file.8lingling.com/lingling/201804/20180410093958943,http://file.8lingling.com/lingling/201804/20180410093958971,http://file.8lingling.com/common/image/org_20180411100613318700.jpg
         * logo : http://file.8lingling.com/common/image/user_20180411100147328589.jpg
         * disc : 这里下午在咯一开心
         * type : 51
         * province :
         * city :
         * area :
         * address : 创客广场(北京市昌平区)338号
         * contacts :
         * phone : 13252028551
         * labelid : 51
         * label : 音乐
         * colorflg : 5
         * isYz : 0
         * yztype : 1
         * yzmap : http://file.8lingling.com/org/000/image/exchange_20180402185228843276.jpg
         * longitude : 0.0
         * latitude : 0.0
         */

        public String id;
        public String name;
        public String pic;
        public String picStyle;
        public String logo;
        public String disc;
        public String type;
        public String province;
        public String city;
        public String area;
        public String address;
        public String contacts;
        public String phone;
        public String labelid;
        public String label;
        public String colorflg;
        public String isYz;
        public String yztype;
        public String yzmap;
        public String longitude;
        public String latitude;

        public static OrgBean objectFromData(String str) {

            return new Gson().fromJson(str, OrgBean.class);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getPicStyle() {
            return picStyle;
        }

        public void setPicStyle(String picStyle) {
            this.picStyle = picStyle;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContacts() {
            return contacts;
        }

        public void setContacts(String contacts) {
            this.contacts = contacts;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getLabelid() {
            return labelid;
        }

        public void setLabelid(String labelid) {
            this.labelid = labelid;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getColorflg() {
            return colorflg;
        }

        public void setColorflg(String colorflg) {
            this.colorflg = colorflg;
        }

        public String getIsYz() {
            return isYz;
        }

        public void setIsYz(String isYz) {
            this.isYz = isYz;
        }

        public String getYztype() {
            return yztype;
        }

        public void setYztype(String yztype) {
            this.yztype = yztype;
        }

        public String getYzmap() {
            return yzmap;
        }

        public void setYzmap(String yzmap) {
            this.yzmap = yzmap;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }
    }
}
