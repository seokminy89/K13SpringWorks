<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>나만의 맞춤 피자 Free</title>

    <!-- font 영역 -->
    <link rel="stylesheet" href="../font/font.css">
    <!-- style 영역 -->
    <link rel="stylesheet" href="../style/common.css">
    <link rel="stylesheet" href="../style/sub.css">
    <link rel="stylesheet" href="../style/regist.css">
    <link rel="stylesheet" href="../style/layout.css">
    <!-- icon영역 -->
    <link
        href="https://fonts.googleapis.com/css?family=Material+Icons|Material+Icons+Outlined|Material+Icons+Two+Tone|Material+Icons+Round|Material+Icons+Sharp"
        rel="stylesheet">
    <!-- js 라이브러리 영역 -->
    <script src="../js/jquery-3.6.0.js"></script>
    <script>
        $('input.all-check-agree').click(function(){
            var state = $('.all-check-agree').is(':checked');
            if(state){		
                $("#agree_all").parents(".agree").find("input").prop("checked",this.checked);
                $("#agree_all").parents(".agree").find(".chk-box").addClass("selected");
                $("#agree_all2").parents(".agree").find("input").prop("checked",this.checked);
                $("#agree_all2").parents(".agree").find(".chk-box").addClass("selected");
            }
            else{
                $("#agree_all").parents(".agree").find("input").prop("checked",this.checked);
                $("#agree_all").parents(".agree").find(".chk-box").removeClass("selected");
                $("#agree_all2").parents(".agree").find("input").prop("checked",this.checked);
                $("#agree_all2").parents(".agree").find(".chk-box").removeClass("selected");
            }
        });
    </script>
    <style>
        
    </style>
</head>
<body>
    <!-- header s -->
    <header id="header">
        <%@ include file="../common/header.jsp" %>
    </header>
    <!-- header e -->

<!-- content s -->
<div id="container">
    <section id="content">
        <div class="sub-type member">
            <div class="inner-box">
                <div class="page-title-wrap v2">
                    <h2 class="page-title">회원가입</h2>
                    <div class="depth-area">
                        <ol>
                            <li><a href="/FreeP/index.html">홈</a></li>
                            <li><strong>회원가입</strong></li>
                        </ol>
                    </div>
                </div>
                <article class="join-area">
                    <div class="join-step2">
                        <div class="step-list">
                            <ul>
                                <li>01 약관동의</li>
                                <li class="active">02 개인정보입력</li>
                                <li>03 가입완료</li>
                            </ul>
                        </div>
                        <div class="myinfo-wrap">
                            <div class="form">
                            <form name="regFrm" id="regFrm" action="./regist3.do" method="post">
                                <dl>
                                    <dt class="center">이름</dt>
                                    <dd>
                                        <div class="form-item name">
                                            <input type="text" placeholder="" id="name" name="name" value="" >
                                        </div>
                                    </dd>
                                </dl>
                                <dl>
                                    <dt class="top">아이디</dt>
                                    <dd>
                                        <div class="form-item name">
                                            <input type="text" name="id" id="id" maxlength="16">
                                            <a href="javascript:idCheck($(&#39;#id&#39;));" class="btn-type v7">중복확인</a>
                                        </div>
                                        <div class="text-type4" id="id_alert" style="display:none;"></div>
                                    </dd>
                                    
                                </dl>
                                <dl>
                                    <dt class="top">비밀번호</dt>
                                    <dd class="mb">
                                        <div class="form-item number">
                                            <input type="password" name="passwd" id="passwd" maxlength="16" placeholder="8~16자 영문대소문자,숫자, 특수문자 사용가능">
                                        </div>
                                        <div class="text-type4" id="passwd_alert" style="display:none;"></div>
                                    </dd>
                                    <dt class="top">비밀번호 확인</dt>
                                    <dd>
                                        <div class="form-item number">
                                            <input type="password" name="confirmpw" id="confirmpw" maxlength="16" value="">
                                        </div>
                                        <div class="text-type4" id="confirmpw_alert" style="display:none;"></div>
                                    </dd>
                                </dl>
                                
                                <dl>
                                    <dt class="top">휴대전화</dt>
                                    <dd>
                                        <div class="form-group v2">
                                            <div class="form-item">
                                                <div class="select-type2">
                                                <input type="hidden" name="sel_hand_tel_agency" id="sel_hand_tel_agency" value="SKT">
                                                    <select name="sel_hand_tel1" id="sel_hand_tel1" class="selected" title="휴대전화번호">
                                                        <option value="010">010</option>
                                                        <option value="011">011</option>
                                                        <option value="016">016</option>
                                                        <option value="017">017</option>
                                                        <option value="018">018</option>
                                                        <option value="019">019</option>
                                                    </select>
                                                </div>
                                                <input type="text" name="hand_tel2" id="hand_tel2" maxlength="4" value=""  class="i_text" onkeyup="checkNum($(this), '숫자만 입력해주세요.');" title="휴대전화번호">
                                                <input type="text" name="hand_tel3" id="hand_tel3" maxlength="4" value=""  class="i_text" onkeyup="checkNum($(this), '숫자만 입력해주세요.');" title="휴대전화번호">
                                                <br>
                                                
                                                <a href="javascript:void(0)" class="btn-type v7">
                                                            인증완료
                                                        </a>	
                                                    </div> <!-- //form-item -->
                                            <div class="text-type4" id="tel_alert" style="display:none;"></div>
                                        </div>
                                    </dd> 
                                </dl>
                                
                                <dl>
                                    <dt class="center">이메일</dt>
                                    <dd>
                                        <div class="form-group v2">
                                            <div class="form-item e-mail">
                                                <input type="text" name="email1" id="email1">
                                                <span>@</span>
                                                <input type="text" name="email2" id="email2">
                                                <div class="select-type2">
                                                    <select name="email3" id="email3" onchange="checkEmailState($('#email3'),$('#email2'))" class="selected">
                                                        <option value="naver.com">네이버</option>
                                                        <option value="hanmail.net">한메일</option>
                                                        <option value="gmail.com">지메일</option>
                                                        <option value="hotmail.com">핫메일</option>
                                                        <option value="nate.com">네이트</option>
                                                        <option value="WRITE" selected="">직접입력</option>
                                                    </select>
                                                </div>
                                                <a href="javaScript:doCheckEmail();" class="btn-type v7">중복확인</a>
                                            </div>
                                            <div class="text-type4" id="email_alert" style="display:none;"></div>
                                        </div>
                                    </dd>
                                </dl>
                                
                                <dl>
                                    <dt>약관 및 광고성 정보 수신<br>전체 동의</dt>
                                    <dd>
                                        <div class="form agree">
                                            <div class="chk-box v4">
                                                <input type="checkbox" id="all3" name="agreeType3" class="all-check-agree">
                                                <label class="checkbox" for="all3"></label>
                                                <label for="all3">전체 동의하기</label>
                                            </div>
                                        </div>
                                        <div class="text-type">
                                            - 위 항목에는 필수 및 선택정보에 대한 동의를 모두 포함하고 있으며, 개별적으로도 동의 여부를 선택하실 수 있습니다.<br>
                                            - 선택항목에 대한 동의를 거부하시는 경우에도 서비스 이용이 가능합니다.<br>
                                            <span style="color: #ff143c;">이메일, 문자(SMS 등) 모두 수신 동의 시 피자 방문포장 40% 할인 쿠폰을 드립니다.</span>
                                        </div>
                                    </dd>
                                </dl>
                                <dl>
                                    <dt>약관 전체동의</dt>
                                    <dd>
                                        <div class="form agree">
                                            <div class="chk-box v4">
                                                <input type="checkbox" id="agree_all" name="agree_chk" value="Y" class="all-check">
                                                <label class="checkbox" for="agree_all"></label>
                                                <label for="agree_all">전체 동의하기</label>
                                            </div>
                                            <ul>
                                                <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" name="agree_2" id="agree_2" value="Y">
                                                        <label class="checkbox" for="agree_2"></label>
                                                        <label for="agree_2">개인정보 수집 및 이용 동의(필수)</label>
                                                        <a href="javascript:UI.layerPopUp({selId:&#39;#pop-terms-p2&#39;})" class="btn-link">보기</a>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" name="agree_1" id="agree_1" value="Y">
                                                        <label class="checkbox" for="agree_1"></label>
                                                        <label for="agree_1">이용약관 동의(필수)</label>
                                                        <a href="" class="btn-link">보기</a>
                                                    </div>
                                                </li>
                                                <li>
                                                        <div class="chk-box v4">
                                                            <input type="checkbox" id="location_yn" name="location_yn" value="Y">
                                                            <label class="checkbox" for="location_yn"></label>
                                                            <label for="location_yn">위치기반 서비스 약관 동의(필수)</label>
                                                            <a href="" class="btn-link">보기</a>
                                                        </div>
                                                    </li>
                                                <!-- <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" name="agree_3" id="agree_3" value="Y">
                                                        <label class="checkbox" for="agree_3"></label>
                                                        <label for="agree_3">개인정보 제3자 제공 동의(선택)</label>
                                                        <a href="javascript:UI.layerPopUp({selId:'#pop-terms-p3'})" class="btn-link">보기</a>
                                                    </div>
                                                </li> -->
                                            </ul>
                                        </div>

                                    </dd>
                                </dl>
                                <dl>
                                    <dt>광고성 정보 수신 전체 동의</dt>
                                    <dd>
                                        <div class="form agree">
                                            <div class="chk-box v4">
                                                <input type="checkbox" id="agree_all2" name="agreeType1" class="all-check">
                                                <label class="checkbox" for="agree_all2"></label>
                                                <label for="agree_all2">전체 동의하기</label>
                                            </div>
                                            <ul>
                                                <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" id="chk_ds_fl" name="chk_ds_fl" value="Y">
                                                        <label class="checkbox" for="chk_ds_fl"></label>
                                                        <label for="chk_ds_fl">문자메세지(선택)</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" id="chk_dm_fl" name="chk_dm_fl" value="Y">
                                                        <label class="checkbox" for="chk_dm_fl"></label>
                                                        <label for="chk_dm_fl">이메일(선택)</label>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="chk-box v4">
                                                        <input type="checkbox" id="chk_o_dm_fl" name="chk_o_dm_fl" value="Y">
                                                        <label class="checkbox" for="chk_o_dm_fl"></label>
                                                        <label for="chk_o_dm_fl">DM 우편(최근 배달주소로 배송)(선택)</label>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>

                                    </dd>
                                </dl>
                                <div class="btn-wrap">
                                	<button type="submit" class="btn-type v6">가입하기</button>
                            	</div>
                            </form></div>
                            
                        </div>
                    </div>
                </article>
            </div>
        </div> 
    </section> 
</div>
<!-- content e -->

	<!-- footer s -->
    <footer id="footer">
        <%@ include file="../common/footer.jsp" %>
    </footer>
    <!-- footer e -->

    <!-- script area -->
    <script src="../js/includeHTML.js"></script>
    <script>includeHTML();</script>
    
    <script src="../js/motion.js"></script>
    <script src="../js/ui.js"></script>
</body>
</html>