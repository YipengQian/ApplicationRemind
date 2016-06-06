package remind.jingteng.com.applicationremind.ui.fragment;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.ui.base.BaseFragment;

/**
 * Created by qianyipeng on 2016/3/2.
 */
public class TabFragment1 extends BaseFragment {

@Bind(R.id.tv_name)
    TextView tv_name;

    @Override
    protected View innerCreaetView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1,null);
    }

    @Override
    protected void afterInflater(View view) {
        super.afterInflater(view);
        initView();
        initEvent();
    }

    private void initView() {
        String html="<html lang=\"en\" style=\"font-size: 20.1067px;\"><head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n" +
                "    <meta name=\"format-detection\" content=\"telephone=no\">\n" +
                "    <title>京腾租车</title>\n" +
                "    <link rel=\"stylesheet\" href=\"http://www.jtcar.com.cn/m/css/styles.css\">\n" +
                "</head>\n" +
                "<body class=\"\">\n" +
                "\n" +
                "<nav class=\"sub-nav\">\n" +
                "    <div class=\"wrap\">\n" +
                "        <a href=\"javascript:history.back(-1);\" class=\"ic return\"></a>\n" +
                "        <h2 class=\"title\">帕萨特 1.4TSI尊荣行政版</h2>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "    <div class=\"main_con\">\n" +
                "        <div class=\"m-focus\">\n" +
                "            <div class=\"m-focus-box m-focus-box1\">\n" +
                "                <div class=\"swiper-container swiper-container-horizontal\" id=\"m-focus-box\" style=\"cursor: -webkit-grab;\">\n" +
                "                    <ul class=\"swiper-wrapper\" style=\"transform: translate3d(-754px, 0px, 0px); transition-duration: 0ms;\"><li class=\"swiper-slide swiper-slide-duplicate swiper-slide-prev\" data-swiper-slide-index=\"0\" style=\"width: 754px;\">\n" +
                "                            <a href=\"javascript:void();\">\n" +
                "                                <img src=\"http://www.jtcar.com.cn/admin/jt_img/c69f3e38-68f5-4e15-93fc-53813777f1e0.jpg\" alt=\"\">\n" +
                "                                <span></span>\n" +
                "                            </a>\n" +
                "                        </li>\n" +
                "                        \n" +
                "                        <li class=\"swiper-slide swiper-slide-active\" data-swiper-slide-index=\"0\" style=\"width: 754px;\">\n" +
                "                            <a href=\"javascript:void();\">\n" +
                "                                <img src=\"http://www.jtcar.com.cn/admin/jt_img/c69f3e38-68f5-4e15-93fc-53813777f1e0.jpg\" alt=\"\">\n" +
                "                                <span></span>\n" +
                "                            </a>\n" +
                "                        </li>\n" +
                "                    <li class=\"swiper-slide swiper-slide-duplicate swiper-slide-next\" data-swiper-slide-index=\"0\" style=\"width: 754px;\">\n" +
                "                            <a href=\"javascript:void();\">\n" +
                "                                <img src=\"http://www.jtcar.com.cn/admin/jt_img/c69f3e38-68f5-4e15-93fc-53813777f1e0.jpg\" alt=\"\">\n" +
                "                                <span></span>\n" +
                "                            </a>\n" +
                "                        </li></ul>\n" +
                "                    <div class=\"swiper-pagination swiper-pagination-clickable swiper-pagination-bullets\"><span class=\"swiper-pagination-bullet swiper-pagination-bullet-active\"></span></div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"d_tit pd\">\n" +
                "            <h4>帕萨特 1.4TSI尊荣行政版</h4>\n" +
                "            <p class=\"gray999\">指导价 ： <em>20.88万</em></p>\n" +
                "        </div>\n" +
                "        <section class=\"d_summ\">\n" +
                "            <div class=\"sec d_summ_price\">\n" +
                "                <span class=\"price_bar\"><em class=\"price-symbols\">¥</em> <em id=\"rent_select\" class=\"price-num\">13953</em>/月</span>\n" +
                "                <span id=\"firstPay_select\">保证金：3.96万</span>\n" +
                "            </div>\n" +
                "            <ul class=\"clearfix d_summ_info\">\n" +
                "                <li><a href=\"javascript:;\" id=\"rate_select\">保证金：20%</a></li>\n" +
                "                <li><a href=\"javascript:;\" id=\"timelimit_select\">租期：12期</a></li>\n" +
                "                <li><a href=\"javascript:;\"><span class=\"icon2_left\" id=\"city_select\">上海</span></a></li>\n" +
                "            </ul>\n" +
                "        </section>\n" +
                "        <div class=\"d_s_info\">\n" +
                "            <span class=\"icon2_left\">含购置税、车船税</span>\n" +
                "            <span class=\"icon2_left\">送保险</span>\n" +
                "            <span class=\"icon2_left\">送车牌</span>\n" +
                "        </div>\n" +
                "\n" +
                "        <section class=\"d-ways\">\n" +
                "            <a href=\"#d_mask\" class=\"info icon2_right toinfo_mask\" id=\"xzfa\">选择方案</a>\n" +
                "        </section>\n" +
                "        <section class=\"d_sec4 intros\">\n" +
                "            <div class=\"d_tabs\" id=\"ctab\">\n" +
                "                <ul class=\"clearfix\">\n" +
                "                    <li class=\"\"><a href=\"#gintro\">购车说明</a></li>\n" +
                "                    <li class=\"\"><a href=\"#ginfo\">车辆信息</a></li>\n" +
                "                    <li class=\"active\"><a href=\"#gques\">常见问题</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "            <div class=\"d_tabs d_Ctab \" id=\"Ctab\" style=\"display: none;\">\n" +
                "                <ul class=\"clearfix\">\n" +
                "                    <li class=\"active\"><a href=\"#gintro\">购车说明</a></li>\n" +
                "                    <li class=\"\"><a href=\"#ginfo\">车辆信息</a></li>\n" +
                "                    <li class=\"\"><a href=\"#gques\">常见问题</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "            <div class=\"vehicle\">\n" +
                "                <div class=\"vehicle-para vehicle-intro active\">\n" +
                "                    <div class=\"justmg\">\n" +
                "                        <a name=\"ginfo\" id=\"gintro\" style=\"display:block;margin-top:-4rem;visibility:hidden\"></a>\n" +
                "                    </div>\n" +
                "                    <div class=\"secs\" id=\"intro_item2\" name=\"sec2\">\n" +
                "                        <div class=\"sec sec1\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>产品说明</span>\n" +
                "                            </div>\n" +
                "                            <p class=\"txt-row\">\n" +
                "                                <b class=\"sqr\"></b>月租中已包含购置税、车船使用税；\n" +
                "                            </p>\n" +
                "                            <p class=\"txt-row\">\n" +
                "                                <b class=\"sqr\"></b>京腾补贴车辆保险，包含交强险、车损险、第三责任险（100）万、盗抢险、不计免赔险；\n" +
                "                            </p>\n" +
                "                            <p class=\"txt-row\">\n" +
                "                                <b class=\"sqr\"></b>所有手续均不收办理费用，由京腾免费办理;\n" +
                "                            </p>\n" +
                "                            <p class=\"txt-row\">\n" +
                "                                <b class=\"sqr\"></b>客户不需办理牌照，上京腾牌照，租赁期满后可自由选择过户到客户名下\n" +
                "                            </p>\n" +
                "                            <p class=\"pic-row pad3\"><img src=\"http://www.jtcar.com.cn/m/images/in_03.jpg\" alt=\"\"></p>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec sec2\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>申请所需材料</span>\n" +
                "                            </div>\n" +
                "                            <div class=\"lt-rp clearfix\">\n" +
                "                                <div class=\"fl pad\">\n" +
                "                                    <p class=\"txt-row p1\">\n" +
                "                                        <b class=\"sqr\"></b>只需一张身份证\n" +
                "                                    </p>\n" +
                "                                    <p class=\"txt-row\">\n" +
                "                                        更低首付，需提供\n" +
                "                                    </p>\n" +
                "                                    <p class=\"txt-row\">\n" +
                "                                        <b class=\"sqr\"></b>银行流水\n" +
                "                                    </p>\n" +
                "                                    <p class=\"txt-row\">\n" +
                "                                        <b class=\"sqr\"></b>信用记录/房产证\n" +
                "                                    </p>\n" +
                "                                </div>\n" +
                "                                <div class=\"pic2 fr\">\n" +
                "                                    <p><img src=\"http://www.jtcar.com.cn/m/images/in_07.jpg\" alt=\"\"></p>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec sec3\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>购车流程</span>\n" +
                "                            </div>\n" +
                "                            <p class=\"pic-row\"><img src=\"http://www.jtcar.com.cn/m/images/instep_11.jpg\" alt=\"\"></p>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec sec4\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>已开通城市</span>\n" +
                "                            </div>\n" +
                "                            <div class=\"opencitylist\">\n" +
                "                                <ul class=\"clearfix\">\n" +
                "                                    <li>上海</li>\n" +
                "                                    <li>北京</li>\n" +
                "                                    <li>合肥</li>\n" +
                "                                    <li>武汉</li>\n" +
                "                                    <li>成都</li>\n" +
                "                                    <li>广州</li>\n" +
                "                                    <li>大连</li>\n" +
                "                                    <li>沈阳</li>\n" +
                "                                    <li>青岛</li>\n" +
                "                                    <li>济南</li>\n" +
                "                                    <li>南京</li>\n" +
                "                                    <li>杭州</li>\n" +
                "                                    <li>长沙</li>\n" +
                "                                    <li>郑州</li>\n" +
                "                                    <li>徐州</li>\n" +
                "                                    <li>佛山</li>\n" +
                "                                    <li>宁波</li>\n" +
                "                                    <li>苏州</li>\n" +
                "                                    <li>珠海</li>\n" +
                "                                    <li>宜昌</li>\n" +
                "                                    <li>福州</li>\n" +
                "                                    <li>安庆</li>\n" +
                "                                </ul>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec sec5\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>为您承诺</span>\n" +
                "                            </div>\n" +
                "                            <div class=\"promised-list\">\n" +
                "                                <ul>\n" +
                "                                    <li class=\"icon2_left\">\n" +
                "                                       <p>真优惠<em>厂家直供，底价保证</em></p> \n" +
                "                                    </li>\n" +
                "                                    <li class=\"icon2_left\">\n" +
                "                                       <p>门槛低<em>一证贷款，快捷简单</em></p> \n" +
                "                                    </li>\n" +
                "                                    <li class=\"icon2_left\">\n" +
                "                                       <p>方案灵活<em>月租金你说了算</em></p> \n" +
                "                                    </li>\n" +
                "                                    <li class=\"icon2_left\">\n" +
                "                                       <p>包牌送险<em>省心，轻松开新车</em></p> \n" +
                "                                    </li>\n" +
                "                                </ul>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec sec5\">\n" +
                "                            <div class=\"sec_tit\">\n" +
                "                                <div class=\"line\"></div>\n" +
                "                                <span>提车图片</span>\n" +
                "                            </div>\n" +
                "                            <p class=\"pic-row\"><img src=\"http://www.jtcar.com.cn/m/images/in_show_15.jpg\" alt=\"\"></p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"vehicle-para vehicle-info\">\n" +
                "                    <div class=\"justmg\">\n" +
                "                        <a name=\"ginfo\" id=\"ginfo\" style=\"display:block;margin-top:-4rem;visibility:hidden\"></a>\n" +
                "                    </div>\n" +
                "                    <div class=\"secs\">\n" +
                "                        <div class=\"sec sec1\">\n" +
                "                            <ul class=\"config clearfix\">\n" +
                "                                <li class=\"bd\">\n" +
                "                                    <b></b>\n" +
                "                                    <dl>\n" +
                "                                        <dt>类级级别</dt>\n" +
                "                                        <dd>紧凑车型</dd>\n" +
                "                                    </dl>\n" +
                "                                </li>\n" +
                "                                <li>\n" +
                "                                    <b></b>\n" +
                "                                    <dl>\n" +
                "                                        <dt>发动机怕凉</dt>\n" +
                "                                        <dd>1.5L</dd>\n" +
                "                                    </dl>\n" +
                "                                </li>\n" +
                "                                <li class=\"bd\">\n" +
                "                                    <b></b>\n" +
                "                                    <dl>\n" +
                "                                        <dt>油耗(L/100km)</dt>\n" +
                "                                        <dd>6.9-7.3L</dd>\n" +
                "                                    </dl>\n" +
                "                                </li>\n" +
                "                                <li>\n" +
                "                                    <b></b>\n" +
                "                                    <dl>\n" +
                "                                        <dt>变速箱</dt>\n" +
                "                                        <dd>自动档</dd>\n" +
                "                                    </dl>\n" +
                "                                </li>\n" +
                "                            </ul>\n" +
                "                            <p class=\"txt\">越级风尚，德系大两厢，搭载1.4TSI涡轮增压发动机，动力澎湃。配合7速DSG双离合变速箱，收放自如。昕动，雷霆之力，为你所用。越级风尚，德系大两厢，搭载1.4TSI涡轮增压发动机，动力澎湃。配合7速DSG双离合变速箱，收放自如</p>\n" +
                "                        </div>\n" +
                "                        <div class=\"sec\">\n" +
                "                            <p><img src=\"http://www.jtcar.com.cn/m/images/comp_17.png\" alt=\"\"></p>\n" +
                "                            <p><img src=\"http://www.jtcar.com.cn/m/images/in_show_15.jpg\" alt=\"\"></p>\n" +
                "                            <p><img src=\"http://www.jtcar.com.cn/m/images/banner_m_3.jpg\" alt=\"\"></p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"vehicle-para vehicle-ques\">\n" +
                "                    <div class=\"justmg\">\n" +
                "                        <a name=\"ginfo\" id=\"gques\" style=\"display:block;margin-top:-4rem;visibility:hidden\"></a>\n" +
                "                    </div>\n" +
                "                    <div class=\"secs\" id=\"intro_item3\">\n" +
                "                        <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">什么是“以租代购”？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">客户（个人或企业）向租赁公司提出车辆购买申请，租赁资质审核后，与租赁公司签订合同并支付保证金，然后以出租的形式使用车辆。期间客户按月支付租金，租赁期满后，车辆所有权过户给客户。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">京腾租车是一家什么样的公司？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">京腾是中国互联网租车共享服务领导品牌，是腾讯系下公司，成立于2015年，总部位于上海，目前已在全国各大区主要城市设有分站。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">保证金最低是多少？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">保证金最低可低至2成，越低则需要的申请材料越多；更重要的是门槛低，审批快，更易通过。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">都有几年期限的？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">京腾提供1-3年的以租代购业务方案，客户可根据需求灵活选择适合的方案；不过期限越长，享受到的优惠越多，还可享受京腾赠送保险，性价比更高。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">购车需要提供哪些资料？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">保证金比例越高、融资额越低，申请材料也越少，最少只需一张身份证：<br>\n" +
                "保证金大于40%，只需身份证；<br>\n" +
                "保证金30%，身份证、流水\\信用记录\\房产证（三选其一）；<br>\n" +
                "保证金20%，身份证、流水、信用记录\\房产证（二选其一）；<br>\n" +
                "所提交的申请资料越全面，越易通过，详询客服热线400-820-7163。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">购车时，我还要缴纳购置税和车辆保险吗？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">不需要。租金中已包含购置税和车船税；京腾赠送租期内的车险，包括交强险、车损险、第三者责任险（100万），全车盗抢险、不计免赔险（车损险、第三者责任险、盗抢险）。也就是说您只要支付保证金，不再需其他费用，就可以把车开回家，是不是很省钱，很省心？</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">赠送保险是哪家的保险公司？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">京腾与太平洋财产保险有限公司达成合作，用户可拨打24小时热线电话95589，享受全天候全年无休服务，包括报案、咨询、投保、道路救援、法律服务咨询等增值服务。</p>\n" +
                "                             </dd>\n" +
                "                         </dl>\n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">融资租赁车辆上哪里牌照？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">租赁期间车辆所有权归京腾所有，上京腾名下车牌，用户拥有使用权；期满后车辆可自由选择过户到用户名下；限牌城市（北京、天津、上海、杭州、广州、深圳），京腾提供邻近城市车牌。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">你们“车”源放心不？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">“京腾租车”平台上所有车辆全部是正规汽车制造厂商生产的、经检验合格的全新车。所有车辆拥有可溯源的唯一车辆识别代号（VIN），消费者可凭“三包凭证”和购车发票依法享受“三包”权益。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">购车前可以试驾吗？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">京腾所有待售车辆，是未办理保险和牌照的新车，受法规约束不得上路行驶，所有车辆均统一存放在总部仓库及分仓进行管理，欢迎到我们总部及分站门面实地看车。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">享受“汽车三包”吗？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">“汽车三包”指销售者因汽车产品质量问题，依法对消费者承担汽车产品修理、更换、退货的责任。销售者依照规定承担三包责任后，属于生产者的责任或者属于其他经营者的责任的，销售者有权向生产者、其他经营者追偿。【依据《家用汽车产品修理、更换、退货责任规定》（2013年10月1日施行）（也称“汽车三包规定”）】<br>\n" +
                "                                 “京腾租车”所有车辆全部是正规汽车制造厂商生产的经检验合格的新车，拥有可溯源的唯一车辆识别代号（VIN），消费者可凭“三包凭证”和购车发票依法享受同等的“三包”权益。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">日常保养与维修怎么做？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">与汽车产品质量问题无关的日常保养或维修，客户可就近选择同品牌4S店，也可选择京腾合作的特约4S店，享受优惠服务。在4S店进行日常保养或维修，只需出具行驶证和保养手册。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                         <dl>\n" +
                "                             <dt>\n" +
                "                                <em class=\"ic ic1\">问</em>\n" +
                "                                 <p class=\"ask-tit\">异地购车需注意哪些事项？</p>\n" +
                "                             </dt>\n" +
                "                             <dd>\n" +
                "                                <em class=\"ic ic2\">答</em>\n" +
                "                                 <p class=\"ans-ctx\">我们目前在全国20多个城市开展业务，其他城市的客户不能提供各项服务。</p>\n" +
                "                             </dd>\n" +
                "                         </dl> \n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                \n" +
                "            </div>\n" +
                "        </section>\n" +
                "\n" +
                "    </div>\n" +
                "    <footer class=\"footer\">\n" +
                "        <div class=\"wrap\">\n" +
                "            <nav>\n" +
                "                <a href=\"#\">我的</a><span>|</span><a href=\"#\">常见问题</a><span>|</span><a href=\"#\">关于我们</a><span>|</span><a href=\"#\">联系我们</a><br><a href=\"#\" class=\"cur\">触屏版</a><span>|</span><a href=\"#\">标准版</a><span>|</span><a href=\"#\">客户端</a>\n" +
                "            </nav>\n" +
                "            <div class=\"copyright\">\n" +
                "                <p>购车热线: <span><a href=\"tel:4008207163\">400-820-7163</a></span> (9:00-18:00)<br>copyright©2016 jtcar.com.cn</p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </footer>\n" +
                "    <div class=\"d_mask popup-layer-f full-element-show\" id=\"d_mask\" style=\"display: none;\">\n" +
                "        <dic class=\"section section_xzfa swiper-in-right-layer\">\n" +
                "            <a href=\"javascript:void();\" class=\"d_close\" id=\"close\">×</a>\n" +
                "            <div class=\"sec\">\n" +
                "                <h6 class=\"d_mask_tit\">保证金比例</h6>\n" +
                "                <ul class=\"clearfix ul_rate\">\n" +
                "                \t<li class=\"active\"><a tag=\"20\" href=\"javascript:;\">20%</a></li>\n" +
                "                \t<li><a tag=\"30\" href=\"javascript:;\">30%</a></li>\n" +
                "                \t<li><a tag=\"40\" href=\"javascript:;\">40%</a></li>\n" +
                "                \t<li><a tag=\"50\" href=\"javascript:;\">50%</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "            <div class=\"sec\">\n" +
                "                <h6 class=\"d_mask_tit\">期限</h6>\n" +
                "                <ul class=\"clearfix ul_time\">\n" +
                "                \t<li cityid=\"0\" funcid=\"360\" tag=\"20\" class=\"active\"><a href=\"javascript:;\">12期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"361\" tag=\"20\"><a href=\"javascript:;\">24期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"362\" tag=\"20\"><a href=\"javascript:;\">36期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"363\" tag=\"30\" style=\"display:none\"><a href=\"javascript:;\">12期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"364\" tag=\"30\" style=\"display:none\"><a href=\"javascript:;\">24期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"365\" tag=\"30\" style=\"display:none\"><a href=\"javascript:;\">36期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"366\" tag=\"40\" style=\"display:none\"><a href=\"javascript:;\">12期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"367\" tag=\"40\" style=\"display:none\"><a href=\"javascript:;\">24期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"368\" tag=\"40\" style=\"display:none\"><a href=\"javascript:;\">36期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"369\" tag=\"50\" style=\"display:none\"><a href=\"javascript:;\">12期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"370\" tag=\"50\" style=\"display:none\"><a href=\"javascript:;\">24期</a></li>\n" +
                "                \t<li cityid=\"0\" funcid=\"371\" tag=\"50\" style=\"display:none\"><a href=\"javascript:;\">36期</a></li>\n" +
                "                </ul>\n" +
                "            </div>\n" +
                "            <div class=\"sec\">\n" +
                "                <h6 class=\"d_mask_tit\">购车城市</h6>\n" +
                "                <ul class=\"clearfix ul_city\"><li funcid=\"360\" cityid=\"0\" class=\"active li_city\"><a href=\"javascript:;\">上海</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">北京</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">合肥</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">武汉</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">成都</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">广州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">大连</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">沈阳</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">青岛</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">济南</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">南京</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">杭州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">长沙</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">郑州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">徐州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">佛山</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">宁波</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">苏州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">珠海</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">宜昌</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">福州</a></li><li funcid=\"360\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">安庆</a></li></ul>\n" +
                "            </div>\n" +
                "            <div class=\"d_mask_btn clearfix\" id=\"d-submit-btn\"><a href=\"javascript:void(0);\">取消</a><a id=\"bt_yes\" href=\"javascript:void(0);\">确定</a></div>\n" +
                "        </dic>\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<script src=\"http://www.jtcar.com.cn/m/js/libs/jquery-1.11.2.min.js\"></script>\n" +
                "<script src=\"http://www.jtcar.com.cn/m/js/libs/swiper.min.js\"></script>\n" +
                "<script src=\"http://www.jtcar.com.cn/m/js/libs/jquery.pageslide.min.js\"></script><div id=\"pageslide\" style=\"display: none;\"></div>\n" +
                "<script src=\"http://www.jtcar.com.cn/m/js/common.js\"></script>\n" +
                "<script>\n" +
                "$(function() {\n" +
                "    // 焦点图片\n" +
                "    var mySwiperfocus = new Swiper('#m-focus-box', {\n" +
                "        pagination: '.swiper-pagination',\n" +
                "        loop: true,\n" +
                "        grabCursor: true,\n" +
                "        paginationClickable: true,\n" +
                "        calculateHeight: true\n" +
                "    });\n" +
                "    //更多方案的弹层的关闭按钮\n" +
                "    $(\"#close\").click(function(event) {\n" +
                "        $(\".d_mask\").removeClass('show');\n" +
                "    });\n" +
                "\n" +
                "   \n" +
                "});\n" +
                "\n" +
                "\n" +
                "\n" +
                "$(window).bind(\"scroll\", function(){\n" +
                "    var scrollTop = document.documentElement.scrollTop || window.pageYOffset || document.body.scrollTop;\n" +
                "    var tabT =$(\"#ctab\").offset().top;\n" +
                "\n" +
                "    //购买横条出现在最上方\n" +
                "    if(scrollTop>tabT){\n" +
                "        $(\"#Ctab\").show();\n" +
                "    }else{\n" +
                "        $(\"#Ctab\").hide();\n" +
                "    }\n" +
                "});\n" +
                "\n" +
                "\n" +
                "var dataList = [{\"func_id\":360,\"car_id\":231,\"city_id\":0,\"func_name\":20,\"timelimit\":12,\"firstpay\":39600,\"rent\":13953,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":361,\"car_id\":231,\"city_id\":0,\"func_name\":20,\"timelimit\":24,\"firstpay\":39600,\"rent\":7338,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":362,\"car_id\":231,\"city_id\":0,\"func_name\":20,\"timelimit\":36,\"firstpay\":39600,\"rent\":5134,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":363,\"car_id\":231,\"city_id\":0,\"func_name\":30,\"timelimit\":12,\"firstpay\":59400,\"rent\":12213,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":364,\"car_id\":231,\"city_id\":0,\"func_name\":30,\"timelimit\":24,\"firstpay\":59400,\"rent\":6426,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":365,\"car_id\":231,\"city_id\":0,\"func_name\":30,\"timelimit\":36,\"firstpay\":59400,\"rent\":4496,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":366,\"car_id\":231,\"city_id\":0,\"func_name\":40,\"timelimit\":12,\"firstpay\":79200,\"rent\":10474,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":367,\"car_id\":231,\"city_id\":0,\"func_name\":40,\"timelimit\":24,\"firstpay\":79200,\"rent\":5513,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":368,\"car_id\":231,\"city_id\":0,\"func_name\":40,\"timelimit\":36,\"firstpay\":79200,\"rent\":3858,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":369,\"car_id\":231,\"city_id\":0,\"func_name\":50,\"timelimit\":12,\"firstpay\":99000,\"rent\":8734,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":370,\"car_id\":231,\"city_id\":0,\"func_name\":50,\"timelimit\":24,\"firstpay\":99000,\"rent\":4601,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0},{\"func_id\":371,\"car_id\":231,\"city_id\":0,\"func_name\":50,\"timelimit\":36,\"firstpay\":99000,\"rent\":3220,\"add_time\":{\"date\":1,\"day\":5,\"hours\":15,\"minutes\":49,\"month\":3,\"nanos\":0,\"seconds\":41,\"time\":1459496981000,\"timezoneOffset\":-480,\"year\":116},\"is_delete\":false,\"end_pay\":0}];\n" +
                "var cityList = [{\"city_id\":64,\"city_name\":\"上海\",\"is_delete\":false},{\"city_id\":65,\"city_name\":\"北京\",\"is_delete\":false},{\"city_id\":66,\"city_name\":\"合肥\",\"is_delete\":false},{\"city_id\":67,\"city_name\":\"武汉\",\"is_delete\":false},{\"city_id\":68,\"city_name\":\"成都\",\"is_delete\":false},{\"city_id\":69,\"city_name\":\"广州\",\"is_delete\":false},{\"city_id\":70,\"city_name\":\"大连\",\"is_delete\":false},{\"city_id\":71,\"city_name\":\"沈阳\",\"is_delete\":false},{\"city_id\":72,\"city_name\":\"青岛\",\"is_delete\":false},{\"city_id\":73,\"city_name\":\"济南\",\"is_delete\":false},{\"city_id\":74,\"city_name\":\"南京\",\"is_delete\":false},{\"city_id\":75,\"city_name\":\"杭州\",\"is_delete\":false},{\"city_id\":76,\"city_name\":\"长沙\",\"is_delete\":false},{\"city_id\":77,\"city_name\":\"郑州\",\"is_delete\":false},{\"city_id\":78,\"city_name\":\"徐州\",\"is_delete\":false},{\"city_id\":79,\"city_name\":\"佛山\",\"is_delete\":false},{\"city_id\":80,\"city_name\":\"宁波\",\"is_delete\":false},{\"city_id\":81,\"city_name\":\"苏州\",\"is_delete\":false},{\"city_id\":82,\"city_name\":\"珠海\",\"is_delete\":false},{\"city_id\":83,\"city_name\":\"宜昌\",\"is_delete\":false},{\"city_id\":84,\"city_name\":\"福州\",\"is_delete\":false},{\"city_id\":85,\"city_name\":\"安庆\",\"is_delete\":false}];\n" +
                "\n" +
                "$(function(){\n" +
                "\t$(\".ul_rate li a\").click(function(){\n" +
                "\t\tvar tag=$(this).attr(\"tag\");\n" +
                "\t\t$(\".ul_time li\").css(\"display\",\"none\");\n" +
                "\t\tvar obj = $(\".ul_time li[tag='\"+ tag +\"']\");\n" +
                "\t\tobj.css(\"display\",\"block\").removeClass(\"active\");\n" +
                "\t\tobj.eq(0).addClass(\"active\");\n" +
                "\t\t\n" +
                "\t\tupdateCity(obj.eq(0).attr(\"funcid\"), obj.eq(0).attr(\"cityid\"));\n" +
                "\t\t\n" +
                "\t});\n" +
                "\t\n" +
                "\tupdateCity($(\".ul_time .active\").attr(\"funcid\"), $(\".ul_time .active\").attr(\"cityid\"));\n" +
                "\t\n" +
                "\t$(\"#bt_yes\").click(function(){\n" +
                "\t\tvar rate = $(this).parents(\".d_mask\").find(\".ul_rate\").find(\".active\").find(\"a\").html();\n" +
                "\t\tvar tt = $(this).parents(\".d_mask\").find(\".ul_time\").find(\".active\").find(\"a\").html();\n" +
                "\t\tvar city = $(this).parents(\".d_mask\").find(\".ul_city\").find(\".active\").find(\"a\").html();\n" +
                "\t\t\n" +
                "\t\t$(\"#timelimit_select\").html(\"租期：\"+ tt);\n" +
                "\t\t$(\"#rate_select\").html(\"保证金：\"+ rate);\n" +
                "\t\t$(\"#city_select\").html(city);\n" +
                "\t\t\n" +
                "\t\tfor(var i=0; i<dataList.length; i++){\n" +
                "\t\t\tvar mm = dataList[i];\n" +
                "\t\t\t\n" +
                "\t\t\tif(rate==mm.func_id+\"%\" && tt==mm.timelimit+\"期\"){\n" +
                "\t\t\t\t$(\"#rent_select\").html(mm.rent);\n" +
                "\t\t\t\t$(\"#firstPay_select\").html(\"保证金：\"+ mm.firstpay/10000 +\"万\");\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t$('#d_mask').removeClass('element-show').hide();\n" +
                "\t});\n" +
                "\n" +
                "});\n" +
                "\n" +
                "\n" +
                "function updateCity(funcid, cityid){\n" +
                "\t$(\".ul_city\").empty();\n" +
                "\t\n" +
                "\tif(cityid==\"0\"){\n" +
                "\t\tfor(var i=0; i<cityList.length; i++){\n" +
                "\t\t\tvar mm = cityList[i];\n" +
                "\t\t\tvar str = '<li funcid=\"'+ funcid +'\" cityid=\"0\" class=\"li_city\"><a href=\"javascript:;\">'+ mm.city_name +'</a></li>';\n" +
                "\t\t\tif(i==0){\n" +
                "\t\t\t\tstr = '<li funcid=\"'+ funcid +'\" cityid=\"0\" class=\"active li_city\"><a href=\"javascript:;\">'+ mm.city_name +'</a></li>';\n" +
                "\t\t\t}\n" +
                "\t\t\t$(\".ul_city\").append(str);\n" +
                "\t\t}\n" +
                "\t} else {\n" +
                "\t\t\n" +
                "\t}\n" +
                "\t\n" +
                "\t$('.li_city').on('click', function(event){\n" +
                "\t\t$(this).parent().find(\"li\").removeClass(\"active\");\n" +
                "\t\t$(this).addClass(\"active\");\n" +
                "\t\t\n" +
                "\t\treturn;\n" +
                "\t\t\n" +
                "\t\tvar funcid = $(this).attr(\"funcid\");\n" +
                "\t\t$(\"#city_select\").html($(this).find(\"a\").html());\n" +
                "\t\t\n" +
                "\t\tfor(var i=0; i<dataList.length; i++){\n" +
                "\t\t\tvar mm = dataList[i];\n" +
                "\t\t\t\n" +
                "\t\t\tif(funcid==mm.func_id+\"\"){\n" +
                "\t\t\t\t$(\"#timelimit_select\").html(\"租期：\"+ mm.timelimit +\"期\");\n" +
                "\t\t\t\t$(\"#rate_select\").html(\"保证金：\"+ mm.func_name + \"%\");\n" +
                "\t\t\t\t$(\"#rent_select\").html(mm.rent);\n" +
                "\t\t\t\t$(\"#firstPay_select\").html(\"保证金：\"+ mm.firstpay/10000 +\"万\");\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t});\n" +
                "}\n" +
                "\n" +
                "</script>\n" +
                " \n" +
                "\n" +
                "</body></html>";
            tv_name.setMovementMethod(ScrollingMovementMethod.getInstance());//滚动
            tv_name.setText(Html.fromHtml(html));

    }

    private void initEvent() {

    }
}
