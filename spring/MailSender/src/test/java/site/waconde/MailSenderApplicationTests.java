package site.waconde;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSenderApplicationTests {
    @Autowired
    private MailSenderService mss;

    @Test
    public void contextLoads() {
    }

    /**
     * 测试普通文本邮件
     *
     * @author side.wang
     * @since 2019年9月25日
     */
    @Test
    public void testSendTextMail() {
        mss.sendTextMail("2523890679@qq.com", "test for send mail service", "no more");
    }

    /**
     * 测试html邮件
     *
     * @author side.wang
     * @since 2019年9月25日
     */
    @Test
    public void testSendHtmlMail() {
        mss.sendHtmlMail("2523890679@qq.com", "test for send html mail service", "\n" +
                "<!doctype html><html itemscope=\"\" itemtype=\"http://schema.org/WebPage\" " +
                "lang=\"zh-CN\"><head><meta charset=\"UTF-8\"><meta content=\"origin\" name=\"referrer\"><meta " +
                "content=\"/images/branding/googleg/1x/googleg_standard_color_128dp.png\" itemprop=\"image\"><meta " +
                "content=\"origin\" name=\"referrer\"><title>Google</title><script " +
                "nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">(function(){window.google={kEI:'IimLXYibGcTXhwPXhL-ADA'," +
                "kEXPI:'31',authuser:0,kscs:'c9c918f0_IimLXYibGcTXhwPXhL-ADA',kGL:'ZZ',kBL:'xGob'};google" +
                ".sn='webhp';google.kHL='zh-CN';google.jsfs='Ffpdje';})();(function(){google.lc=[];google.li=0;" +
                "google.getEI=function(a){for(var b;a&&(!a.getAttribute||!(b=a.getAttribute(\"eid\")));)a=a" +
                ".parentNode;return b||google.kEI};google.getLEI=function(a){for(var b=null;a&&(!a" +
                ".getAttribute||!(b=a.getAttribute(\"leid\")));)a=a.parentNode;return b};google" +
                ".https=function(){return\"https:\"==window.location.protocol};google.ml=function(){return " +
                "null};google.time=function(){return(new Date).getTime()};google.log=function(a,b,e,c,g)" +
                "{if(a=google.logUrl(a,b,e,c,g)){b=new Image;var d=google.lc,f=google.li;d[f]=b;b" +
                ".onerror=b.onload=b.onabort=function(){delete d[f]};google.vel&&google.vel.lu&&google" +
                              ".vel.lu(a);b.src=a;google.li=f+1}};google.logUrl=function(a,b,e,c,g){var d=\"\"," +
                               "f=google.ls||\"\";e||-1!=b.search(\"&ei=\")||(d=\"&ei=\"+google.getEI(c),-1==b.search" +
                                "(\"&lei=\")&&(c=google.getLEI(c))&&(d+=\"&lei=\"+c));c=\"\";!e&&google.cshid&&-1==b" +
                                 ".search(\"&cshid=\")&&\"slh\"!=a&&(c=\"&cshid=\"+google.cshid);a=e||\"/\"+" +
                "(g||\"gen_204\")+\"?atyp=i&ct=\"+a+\"&cad=\"+b+d+f+\"&zx=\"+google.time()+c;" +
                "/^http:/i.test(a)&&google.https()&&(google.ml(Error(\"a\"),!1,{src:a,glmm:1})," +
                                    "a=\"\");return a};}).call(this);(function(){google.y={};google.x=function(a,b)" +
                                     "{if(a)var c=a.id;else{do c=Math.random();while(google.y[c])}google.y[c]=[a,b];" +
                                      "return!1};google.lm=[];google.plm=function(a){google.lm.push.apply(google.lm," +
                                       "a)};google.lq=[];google.load=function(a,b,c){google.lq.push([[a],b,c])};" +
                                        "google.loadAll=function(a,b){google.lq.push([a,b])};}).call(this);google" +
                                         ".f={};(function(){google.hs={h:true};})();(function(){google.c={};(function" +
                                          "(){var f=window.performance;var g=function(a,b,c){a.addEventListener?a" +
                                           ".addEventListener(b,c,!1):a.attachEvent&&a.attachEvent(\"on\"+b,c)};" +
                                            "google.timers={};google.startTick=function(a){google" +
                                             ".timers[a]={t:{start:google.time()},e:{},m:{}}};google.tick=function(a," +
                                              "b,c){google.timers[a]||google.startTick(a);c=void 0!==c?c:google.time" +
                                               "();b instanceof Array||(b=[b]);for(var e=0,d;d=b[e++];)google" +
                                                ".timers[a].t[d]=c};google.c.e=function(a,b,c){google.timers[a]" +
                                                 ".e[b]=c};google.c.b=function(a){var b=google.timers.load.m;" +
                "b[a]&&google.ml(Error(\"a\"),!1,{m:a});b[a]=!0};google.c" +
                ".u=function(a){var b=google.timers.load.m;if(b[a]){b[a]=!1;for(a " +
                                                    "in b)if(b[a])return;google.csiReport()}else google.ml(Error" +
                "(\"b\"),!1,{m:a})};google.rll=function(a,b,c){var e=function(d)" +
                                                      "{c(d);d=e;a.addEventListener?a.removeEventListener(\"load\",d," +
                                                       "!1):a.attachEvent&&a.detachEvent(\"onload\",d);d=e;a" +
                ".addEventListener?a.removeEventListener(\"error\",d,!1):a" +
                                                         ".attachEvent&&a.detachEvent(\"onerror\",d)};g(a,\"load\",e)" +
                                                          ";b&&g(a,\"error\",e)};google.aft=function(a){a" +
                                                           ".setAttribute(\"data-iml\",google.time())};google" +
                                                            ".startTick(\"load\");var h=google.timers.load;a:{var k=h" +
                ".t;if(f){var l=f.timing;if(l){var m=l.navigationStart," +
                "n=l.responseStart;if(n>m&&n<=k.start){k.start=n;h" +
                ".wsrt=n-m;break a}}f.now&&(h.wsrt=Math.floor(f.now())" +
                                                                ")}}google.c.b(\"pr\");google.c.b(\"xe\");}).call" +
                                                                 "(this);})();(function(){var b=[function(){google" +
                ".tick&&google.tick(\"load\",\"dcl\")}];google" +
                ".dclc=function(a){b.length?b.push(a):a()};" +
                "function c(){for(var a;a=b.shift();)a()}window" +
                                                                     ".addEventListener?(document.addEventListener" +
                                                                      "(\"DOMContentLoaded\",c,!1),window" +
                ".addEventListener(\"load\",c,!1)):window" +
                                                                        ".attachEvent&&window.attachEvent(\"onload\"," +
                                                                         "c);}).call(this);(function(){var b=[];" +
                                                                          "google.jsc={xx:b,x:function(a){b.push(a)}," +
                "mm:[],m:function(a){google.jsc.mm" +
                ".length||(google.jsc.mm=a)}};}).call" +
                "(this);(function(){var g=this||self," +
                "k=Date.now||function(){return+new " +
                                                                               "Date};var t={};var v=function(b,d){if" +
                "(null===d)return!1;if(\"contains\"in" +
                " b&&1==d.nodeType)return b.contains" +
                "(d);if(\"compareDocumentPosition" +
                "\"in b)return b==d||!!(b" +
                ".compareDocumentPosition(d)&16);" +
 "for(;d&&b!=d;)d=d.parentNode;" +
                "return d==b};var w=function(b," +
                "d){return function(a){a||" +
                "(a=window.event);return d" +
                ".call(b,a)}},B=function(b)" +
                                                                                          "{b=b.target||b.srcElement;" +
                                                                                           "!b.getAttribute&&b" +
                ".parentNode&&(b=b" +
                ".parentNode);return b}," +
                "C=\"undefined" +
                "\"!=typeof " +
                "navigator" +
                                                                                                 "&&/Macintosh/.test" +
                                                                                                  "(navigator" +
                                                                                                   ".userAgent)," +
                                                                                                    "D=\"undefined" +
                                                                                                     "\"!=typeof " +
                "navigator" +
                "&&!/Opera/" +
                                                                                                        ".test" +
                                                                                                         "(navigator" +
                                                                                                          ".userAgent)&&/WebKit/.test(navigator.userAgent),E={A:1,INPUT:1,TEXTAREA:1,SELECT:1,BUTTON:1},aa=function(){this._mouseEventsPrevented=!0},F={A:13,BUTTON:0,CHECKBOX:32,COMBOBOX:13,GRIDCELL:13,LINK:13,LISTBOX:13,MENU:0,MENUBAR:0,MENUITEM:0,MENUITEMCHECKBOX:0,MENUITEMRADIO:0,OPTION:0,RADIO:32,RADIOGROUP:32,RESET:0,SUBMIT:0,SWITCH:32,TAB:0,TREE:13,TREEITEM:13},G={CHECKBOX:!0,OPTION:!0,RADIO:!0},H={COLOR:!0,DATE:!0,DATETIME:!0,\"DATETIME-LOCAL\":!0,EMAIL:!0,MONTH:!0,NUMBER:!0,PASSWORD:!0,RANGE:!0,SEARCH:!0,TEL:!0,TEXT:!0,TEXTAREA:!0,TIME:!0,URL:!0,WEEK:!0},ba={A:!0,AREA:!0,BUTTON:!0,DIALOG:!0,IMG:!0,INPUT:!0,LINK:!0,MENU:!0,OPTGROUP:!0,OPTION:!0,PROGRESS:!0,SELECT:!0,TEXTAREA:!0};var I=function(){this.h=this.a=null},K=function(b,d){var a=J;a.a=b;a.h=d;return a};I.prototype.g=function(){var b=this.a;this.a&&this.a!=this.h?this.a=this.a.__owner||this.a.parentNode:this.a=null;return b};var L=function(){this.i=[];this.a=0;this.h=null;this.j=!1};L.prototype.g=function(){if(this.j)return J.g();if(this.a!=this.i.length){var b=this.i[this.a];this.a++;b!=this.h&&b&&b.__owner&&(this.j=!0,K(b.__owner,this.h));return b}return null};var J=new I,M=new L;var P=function(){this.o=[];this.a=[];this.g=[];this.j={};this.h=null;this.i=[];O(this,\"_custom\")},ca=\"undefined\"!=typeof navigator&&/iPhone|iPad|iPod/.test(navigator.userAgent),Q=String.prototype.trim?function(b){return b.trim()}:function(b){return b.replace(/^\\s+/,\"\").replace(/\\s+$/,\"\")},da=/\\s*;\\s*/,ia=function(b,d){return function(a){var c=d;if(\"_custom\"==c){c=a.detail;if(!c||!c._type)return;c=c._type}var e;if(\"click\"==c&&(C&&a.metaKey||!C&&a.ctrlKey||2==a.which||null==a.which&&4==a.button||a.shiftKey))c=\n" +
                "\"clickmod\";else{var f=a.which||a.keyCode||a.key;D&&3==f&&(f=13);if(13!=f&&32!=f)f=!1;else{var l=B" +
                 "(a),h=(l.getAttribute(\"role\")||l.type||l.tagName).toUpperCase(),m;(m=\"keydown\"!=a.type||!" +
                  "(\"getAttribute\"in l&&!((l.getAttribute(\"type\")||l.tagName).toUpperCase()in H)&&\"BUTTON\"!=l" +
                   ".tagName.toUpperCase()&&!l.isContentEditable)||a.ctrlKey||a.shiftKey||a.altKey||a.metaKey||(l" +
                    ".getAttribute(\"type\")||l.tagName).toUpperCase()in G&&32==f)||((m=l.tagName in E)||(m=l" +
                     ".getAttributeNode(\"tabindex\"),m=null!=m&&m.specified),m=!(m&&!l.disabled));m?f=!1:" +
                      "(l=\"INPUT\"!=l.tagName.toUpperCase()||l.type,m=!(h in F)&&13==f,f=(0==F[h]%f||m)&&!!l)}f&&" +
                       "(c=\"clickkey\")}h=a.srcElement||a.target;f=R(c,a,h,\"\",null);a.path?(M.i=a.path,M.a=0,M" +
                ".h=this,M.j=!1,l=M):l=K(h,this);for(;m=l.g();){m=e=m;var n=c;var p=m.__jsaction;if(!p){var " +
                "u;p=null;\"getAttribute\"in m&&(p=m.getAttribute(\"jsaction\"));if(u=p){p=t[u];if(!p){p={};" +
                          "for(var x=u.split(da),ea=x?x.length:0,y=0;y<ea;y++){var r=x[y];if(r){var z=r.indexOf" +
                "(\":\"),N=-1!=z,fa=N?Q(r.substr(0,z)):\"click\";r=N?Q(r.substr(z+1)):r;p[fa]=r}}t[u]=p}m" +
                            ".__jsaction=p}else p=ha,m.__jsaction=p}m=p;\"clickkey\"==n?n=\"click\":\"click\"!=n||m" +
                             ".click||(n=\"clickonly\");n={m:n,action:m[n]||\"\",event:null,s:!1};f=R(n.m,n.event||a," +
                "h,n.action||\"\",e,f.timeStamp);if(n.s||n.action)break}f&&\"touchend\"==f.eventType&&" +
                               "(f.event._preventMouseEvents=aa);if(n&&n.action){if(h=\"clickkey\"==c)h=B(a),h=(h" +
                ".type||h.tagName).toUpperCase(),(h=32==(a.which||a.keyCode||a.key)&&\"CHECKBOX\"!=h)" +
                                 "||(h=B(a),l=(h.getAttribute(\"role\")||h.tagName).toUpperCase()," +
                "h=\"BUTTON\"==l?!0:!(h.tagName.toUpperCase()in ba)||\"A\"==l||\"SELECT\"==l||(h" +
                                   ".getAttribute(\"type\")||h.tagName).toUpperCase()in G||(h.getAttribute(\"type\")" +
                "||h.tagName).toUpperCase()in H?!1:!0);h&&(a.preventDefault?a.preventDefault():a" +
                                     ".returnValue=!1);if(\"mouseenter\"==c||\"mouseleave\"==c)if(h=a.relatedTarget,!" +
                                      "(\"mouseover\"==a.type&&\"mouseenter\"==c||\"mouseout\"==a" +
                                       ".type&&\"mouseleave\"==c)||h&&(h===e||v(e,h)))f.action=\"\",f" +
                                        ".actionElement=null;else{c={};for(var q in a)\"function\"!==typeof " +
                                         "a[q]&&\"srcElement\"!==q&&\n" +
                "\"target\"!==q&&(c[q]=a[q]);c.type=\"mouseover\"==a.type?\"mouseenter\":\"mouseleave\";c.target=c" +
                 ".srcElement=e;c.bubbles=!1;f.event=c;f.targetElement=e}}else f.action=\"\",f.actionElement=null;" +
                  "e=f;b.h&&(q=R(e.eventType,e.event,e.targetElement,e.action,e.actionElement,e.timeStamp)," +
                   "\"clickonly\"==q.eventType&&(q.eventType=\"click\"),b.h(q,!0));if(e.actionElement){if(b.h)" +
                "\"A\"!=e.actionElement.tagName||\"click\"!=e.eventType&&\"clickmod\"!=e.eventType||(a" +
                     ".preventDefault?a.preventDefault():a.returnValue=!1),b.h(e);else{if((q=\n" +
                "g.document)&&!q.createEvent&&q.createEventObject)try{var A=q.createEventObject(a)}catch(la){A=a}else" +
                 " A=a;e.event=A;b.i.push(e)}if(\"touchend\"==e.event.type&&e.event._mouseEventsPrevented){a=e.event;" +
                  "for(var ma in a);k()}}}},R=function(b,d,a,c,e,f){return{eventType:b,event:d,targetElement:a," +
                   "action:c,actionElement:e,timeStamp:f||k()}},ha={},ja=function(b,d){return function(a){var c=b," +
                "e=d,f=!1;\"mouseenter\"==c?c=\"mouseover\":\"mouseleave\"==c&&(c=\"mouseout\");if(a" +
                     ".addEventListener){if(\"focus\"==c||\"blur\"==c||\n" +
                "\"error\"==c||\"load\"==c)f=!0;a.addEventListener(c,e,f)}else a.attachEvent&&" +
                 "(\"focus\"==c?c=\"focusin\":\"blur\"==c&&(c=\"focusout\"),e=w(a,e),a.attachEvent(\"on\"+c,e));" +
                  "return{m:c,l:e,capture:f}}},O=function(b,d){if(!b.j.hasOwnProperty(d)){var a=ia(b,d),c=ja(d,a);b" +
                   ".j[d]=a;b.o.push(c);for(a=0;a<b.a.length;++a){var e=b.a[a];e.g.push(c.call(null,e.a))" +
                    "}\"click\"==d&&O(b,\"keydown\")}};P.prototype.l=function(b){return this.j[b]};var V=function(b," +
                     "d){var a=new ka(d),c;a:{for(c=0;c<b.a.length;c++)if(S(b.a[c],d)){c=!0;break a}c=!1}if(c)return " +
                      "b.g.push(a),a;T(b,a);b.a.push(a);U(b);return a},U=function(b){for(var d=b.g.concat(b.a),a=[]," +
                       "c=[],e=0;e<b.a.length;++e){var f=b.a[e];W(f,d)?(a.push(f),X(f)):c.push(f)}for(e=0;e<b.g" +
                        ".length;++e)f=b.g[e],W(f,d)?a.push(f):(c.push(f),T(b,f));b.a=c;b.g=a},T=function(b,d){var " +
                         "a=d.a;ca&&(a.style.cursor=\"pointer\");for(a=0;a<b.o.length;++a)d.g.push(b.o[a].call(null,d" +
                ".a))},Y=function(b,d){b.h=d;b.i&&\n" +
                "(0<b.i.length&&d(b.i),b.i=null)},ka=function(b){this.a=b;this.g=[]},S=function(b,d){for(var a=b.a," +
                 "c=d;a!=c&&c.parentNode;)c=c.parentNode;return a==c},W=function(b,d){for(var a=0;a<d.length;++a)if" +
                  "(d[a].a!=b.a&&S(d[a],b.a))return!0;return!1},X=function(b){for(var d=0;d<b.g.length;++d){var a=b" +
                   ".a,c=b.g[d];a.removeEventListener?a.removeEventListener(c.m,c.l,c.capture):a.detachEvent&&a" +
                ".detachEvent(\"on\"+c.m,c.l)}b.g=[]};var Z=new P;V(Z,window.document.documentElement);O(Z," +
                     "\"click\");O(Z,\"focus\");O(Z,\"focusin\");O(Z,\"blur\");O(Z,\"focusout\");O(Z,\"error\");O(Z," +
                      "\"load\");O(Z,\"change\");O(Z,\"dblclick\");O(Z,\"input\");O(Z,\"keyup\");O(Z,\"keydown\");O" +
                       "(Z,\"keypress\");O(Z,\"mousedown\");O(Z,\"mouseenter\");O(Z,\"mouseleave\");O(Z,\"mouseout\")" +
                ";O(Z,\"mouseover\");O(Z,\"mouseup\");O(Z,\"paste\");O(Z,\"touchstart\");O(Z,\"touchend\");O" +
                "(Z,\"touchcancel\");O(Z,\"speech\");(function(b){google.jsad=function(d){Y(b,d)};google" +
                          ".jsaac=function(d){return V(b,d)};google.jsarc=function(d){X(d);for(var a=!1,c=0;c<b.a" +
                           ".length;++c)if(b.a[c]===d){b.a.splice(c,1);a=!0;break}if(!a)for(a=0;a<b.g.length;++a)if(b" +
                ".g[a]===d){b.g.splice(a,1);break}U(b)}})(Z);window.gws_wizbind=function(b)" +
                "{return{trigger:function(d){var a=b.l(d.type);a||(O(b,d.type),a=b.l(d.type));var c=d" +
                ".target||d.srcElement;a&&a.call(c.ownerDocument.documentElement,d)},bind:function(d){Y" +
                               "(b,d)}}}(Z);}).call(this);(function(){window.jsarwt=function(){return!1};}).call" +
                                "(this);var a=window.location,b=a.href.indexOf(\"#\");if(0<=b){var c=a.href.substring" +
                                 "(b+1);/(^|&)q=/.test(c)&&-1==c.indexOf(\"#\")&&a.replace(\"/search?\"+c.replace(/" +
                                  "(^|&)fp=[^&]*/g,\"\")+\"&cad=h\")};var k=\"function\"==typeof Object" +
                ".defineProperties?Object.defineProperty:function(a,e,c){a!=Array" +
                                    ".prototype&&a!=Object.prototype&&(a[e]=c.value)},l=\"undefined\"!=typeof " +
                                     "window&&window===this?this:\"undefined\"!=typeof " +
                "global&&null!=global?global:this,m=function(a,e){if(e){for(var c=l,b=a.split" +
                                       "(\".\"),f=0;f<b.length-1;f++){var d=b[f];d in c||(c[d]={});c=c[d]}b=b[b" +
                                        ".length-1];f=c[b];d=e(f);d!=f&&null!=d&&k(c,b,{configurable:!0,writable:!0," +
                                         "value:d})}};m(\"String.prototype.startsWith\",function(a){return " +
                                          "a?a:function(e,c){if(null==this)throw new TypeError(\"The 'this' value for" +
                                           " String.prototype.startsWith must not be null or undefined\");if(e " +
                "instanceof RegExp)throw new TypeError(\"First argument to String" +
                                             ".prototype.startsWith must not be a regular expression\");var " +
                                              "b=this+\"\";e+=\"\";for(var f=b.length,d=e.length,h=Math.max(0,Math" +
                                               ".min(c|0,b.length)),g=0;g<d&&h<f;)if(b[h++]!=e[g++])return!1;return " +
                "g>=d}});google.arwt=function(a){a.href=document.getElementById(a.id" +
                                                 ".substring(a.id.startsWith(\"vcs\")?3:1)).href;return!0};(function" +
                                                  "(){var g=function(a,b){this.g=a===e&&b||\"\";this.i=f};g.prototype" +
                ".l=!0;g.prototype.j=function(){return this.g.toString()};var h=/^" +
                                                    "(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,f={},e={};var " +
                                                     "l=/^((market|itms|intent|itms-appss):\\/\\/)/i,m=function(a)" +
                "{var b;a instanceof g||!l.test(a)?b=a:b=new g(e,a);return b};" +
                                                       "var n=function(a,b){if(b instanceof g)var c=b;else c=b,c " +
                                                        "instanceof g||(c=\"object\"==typeof c&&c.l?c.j():String(c),h" +
                                                         ".test(c)||(c=\"about:invalid#zClosurez\"),c=new g(e,c));a" +
                ".href=c instanceof g&&c.constructor===g&&c.i===f?c" +
                                                           ".g:\"type_error:SafeUrl\"};function p(a){return a?(a=a" +
                                                            ".getAttribute(\"data-ved\"))" +
                "?\"&ved=\"+a:\"\":\"\"}function q(a){return new Promise" +
                "(function(b){try{var c=new XMLHttpRequest;c.open" +
                                                               "(\"GET\",a);c.onreadystatechange=function(){4==c" +
                ".readyState&&b()};c.send()}catch(k){b()}})}function " +
                "r(a){return a.getAttribute(\"data-cts\")?\"&cts=\"+" +
                                                                  "(new Date).getTime():\"\"};google.ausb=function(a)" +
                                                                   "{if(!a)return google.ml(Error(\"a\"),!1),!0;if(a" +
                ".getAttribute(\"data-sbv2\")){var b=a.href," +
                "c=/[?&]adurl=([^&]+)/.exec(b);if(c&&/[?&]ae=1" +
                                                                      "(&|$)/.test(b)&&!/[?&]dsh=1(&|$)/.test(b))" +
                                                                       "try{var k=b.length;var d={a:b.slice(0,k)" +
                                                                        "+\"&act=1\"+b.slice(k),h:decodeURIComponent" +
                                                                         "(c[1])}}catch(t){d=null}else d=null;d&&(b=a" +
                                                                          ".getAttribute(\"data-sbd\")," +
                "\"1\"==b||\"2\"==b?(b=d" +
                                                                            ".a+\"&ri=8&shc=\"+b+\"&ictx=1\"+r(a)," +
                                                                             "navigator.sendBeacon&&navigator" +
                                                                              ".sendBeacon(b,\"\")?n(a,m(a" +
                                                                               ".href+\"&ri=9\")):n(a,m(a" +
                                                                                ".href+\"&ri=10\")),a.hasAttribute" +
                                                                                 "(\"data-fetch\")&&\n" +
                "(a=d.a+\"&ri=17&shc=1&ictx=1\"+r(a),fetch(a,{method:\"GET\",keepalive:!0}))):(b=0,a.dataset.ampAd&&" +
                "(c=a?(c=/[?&]ved=([^&]+)/.exec(a.href))?c[1]:\"\":\"\",a.dataset.ved=c,a.dataset.ampc?b=1:a.dataset" +
                  ".ampd&&(b=2),0!=b&&(c=d.a+\"&ri=5\",2==b&&(c+=\"&ampt=1&shc=1\",d.a+=\"&ampt=0\"),google.f.c9ZYY=q" +
                   "(c))),1==b?n(a,m(d.h)):(b=d.a+\"&ri=1\"+r(a),navigator.sendBeacon?navigator.sendBeacon(b,\"\")?n" +
                "(a,m(d.h)):n(a,m(a.href+\"&ri=2\")):n(a,m(a.href+\"&ri=16\")))))}else d=\"\",a.getAttribute" +
                     "(\"data-arwt\")?a.id&&(d=p(document.getElementById(a.id.substring(1)))):d=p(a),b=a.getAttribute" +
                      "(\"data-sbt\"),c=a.getAttribute(\"data-sbf\"),b&&c&&navigator.sendBeacon&&navigator.sendBeacon" +
                       "(b+d+\"&bt=1\",\"\")?n(a,c):a.href+=\"&bt=2\";return!0};}).call(this);" +
                        "(window['gbar']=window['gbar']||{})._CONFIG=[[[0,\"www.gstatic.com\",\"og.og2.en_US" +
                ".AuDUs7NCyCk.O\",\"com\",\"zh-CN\",\"1\",0,[3,2,\".40.\",\"\",\"1300102,3700328,3700653\"," +
                          "\"269824293\",\"0\"],\"40400\",\"IimLXdqFGsH6wQOIjJn4DQ\",0,0,\"og.og2.10z3xa7yjwqy6.L.W" +
                ".O\",\"AA2YrTtz9XE4151RFmiazDqL52i2oVVGvg\",\"AA2YrTt4kxhw47kJ-2mrua0bnD41xUhITA\",\"\"," +
                "2,0,200,\"ZZZ\",null,null,\"1\",\"1\",0],null,0,[\"m;/_/scs/abc-static/_/js/k=gapi.gapi" +
                             ".en.4CFxRrSvxq0.O/d=1/rs=AHpOoo8skdVJHB5uqGRXCunlhzuKwaF7Ag/m=__features__\"," +
                              "\"https://apis.google.com\",\"\",\"\",\"\",\"\",null,1,\"es_plusone_gc_20190803" +
                               ".0_p0\",\"zh-CN\",null,0],[\"1\",\"gci_91f30755d6a6b787dcc2a4062e6e9824.js\"," +
 "\"googleapis.client:plusone:gapi.iframes\",\"\",\"zh-CN\"],null,null,null,[0" +
                                 ".009999999776482582,\"com\",\"1\",[null,\"\",\"0\",null,1,5184000,null,null,\"\",0," +
                                  "1,\"\",0,0,0,0,0,0],null,[[\"\",\"\",\"0\",0,0,-1]],null,0,null,null,[\"5061451\"," +
                "\"google\\\\.(com|ru|ca|by|kz|com\\\\.mx|com\\\\.tr)$\",1]],null,[0,0,0,null," +
                                    "\"\",\"\",\"\",\"\"],[1,0.001000000047497451,1],[1,0.1000000014901161,2,1,0.5]," +
                                     "null,[1],[0,0,[\"lg\"],0,[\"lat\"]],[[\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"," +
                                      "\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"def\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"," +
                                       "\"aswid\"],[\"\"]],null,null,null,[30,127,1,0,60],null,null,null,null,null," +
                                        "[1,0],null,[1,1,0,40400,1,\"ZZZ\",\"zh-CN\",\"269824293.0\",1,0" +
                                         ".009999999776482582,0,0,null,null,1,0,\"3700653\",null,null,1," +
                                          "\"IimLXdqFGsH6wQOIjJn4DQ\"],null,[\"\"],[[[null,null,\"https://ogs.google" +
                                           ".com/widget/app/so?hl=zh-CN\",0,600,330,40,27,1,0,0,63,64,8000," +
                                            "\"https://www.google.com/intl/zh-CN/about/products?tab=wh\",67,1,69," +
                                             "null,1,70,\"加载应用集时出现问题。请过几分钟后重试，或者前往 %1$sGoogle 产品%2$s页面。\",3,1,0,74,0," +
                "0]],0,[null,null,null,\"https://www.gstatic.com/og/_/js/k=og.qtm.en_US" +
                                               ".W-9jlk6eI4c.O/rt=j/m=qdsh/d=1/ed=1/rs" +
                                                "=AA2YrTtIew2oWAjasf3JrUgbo_qmnZMc8w\"],\"1\",\"1\",0,0]]];" +
                                                 "(window['gbar']=window['gbar']||{})._LDD=[\"in\",\"fot\"];this" +
                                                  ".gbar_=this.gbar_||{};(function(_){var window=this;\n" +
                "try{\n" +
                "var aa,da,ka,la,ma,na,Ea,Fa;aa=function(a){var b=0;return function(){return b<a.length?{done:!1," +
                "value:a[b++]}:{done:!0}}};_.ba=function(a){var b=\"undefined\"!=typeof Symbol&&Symbol" +
                  ".iterator&&a[Symbol.iterator];return b?b.call(a):{next:aa(a)}};_.ca=\"function\"==typeof Object" +
                   ".create?Object.create:function(a){var b=function(){};b.prototype=a;return new b};\n" +
                "if(\"function\"==typeof Object.setPrototypeOf)da=Object.setPrototypeOf;else{var ea;a:{var fa={a:!0}," +
                 "ha={};try{ha.__proto__=fa;ea=ha.a;break a}catch(a){}ea=!1}da=ea?function(a,b){a.__proto__=b;if(a" +
                  ".__proto__!==b)throw new TypeError(\"a`\"+a);return a}:null}_.ia=da;ka=\"function\"==typeof Object" +
                   ".defineProperties?Object.defineProperty:function(a,b,c){a!=Array.prototype&&a!=Object.prototype&&" +
                    "(a[b]=c.value)};la=\"undefined\"!=typeof window&&window===this?this:\"undefined\"!=typeof " +
                "global&&null!=global?global:this;\n" +
                "ma=function(a,b){if(b){var c=la;a=a.split(\".\");for(var d=0;d<a.length-1;d++){var e=a[d];e in c||" +
                 "(c[e]={});c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&ka(c,a,{configurable:!0,writable:!0," +
                  "value:b})}};na=function(a,b,c){if(null==a)throw new TypeError(\"b`\"+c);if(b instanceof RegExp)" +
                   "throw new TypeError(\"c`\"+c);return a+\"\"};\n" +
                "ma(\"String.prototype.startsWith\",function(a){return a?a:function(b,c){var d=na(this,b," +
                 "\"startsWith\"),e=d.length,f=b.length;c=Math.max(0,Math.min(c|0,d.length));for(var g=0;g<f&&c<e;)if" +
                  "(d[c++]!=b[g++])return!1;return g>=f}});var oa=function(){oa=function(){};la.Symbol||(la" +
                   ".Symbol=pa)},qa=function(a,b){this.o=a;ka(this,\"description\",{configurable:!0,writable:!0," +
                    "value:b})};qa.prototype.toString=function(){return this.o};\n" +
                "var pa=function(){function a(c){if(this instanceof a)throw new TypeError(\"d\");return new qa" +
                 "(\"jscomp_symbol_\"+(c||\"\")+\"_\"+b++,c)}var b=0;return a}(),sa=function(){oa();var a=la.Symbol" +
                  ".iterator;a||(a=la.Symbol.iterator=la.Symbol(\"Symbol.iterator\"));\"function\"!=typeof Array" +
                   ".prototype[a]&&ka(Array.prototype,a,{configurable:!0,writable:!0,value:function(){return ra(aa" +
                    "(this))}});sa=function(){}},ra=function(a){sa();a={next:a};a[la.Symbol.iterator]=function()" +
                     "{return this};return a},ta=function(a,b){sa();\n" +
                "a instanceof String&&(a+=\"\");var c=0,d={next:function(){if(c<a.length){var e=c++;return{value:b(e," +
                 "a[e]),done:!1}}d.next=function(){return{done:!0,value:void 0}};return d.next()}};d[Symbol" +
                  ".iterator]=function(){return d};return d};ma(\"Array.prototype.keys\",function(a){return " +
                "a?a:function(){return ta(this,function(b){return b})}});ma(\"Array.prototype.values\",function(a)" +
                    "{return a?a:function(){return ta(this,function(b,c){return c})}});\n" +
                "var ua=function(a,b){return Object.prototype.hasOwnProperty.call(a,b)};\n" +
                "ma(\"WeakMap\",function(a){function b(){}function c(l){var m=typeof l;" +
                 "return\"object\"===m&&null!==l||\"function\"===m}function d(l){if(!ua(l,f)){var m=new b;ka(l,f," +
                "{value:m})}}function e(l){var m=Object[l];m&&(Object[l]=function(r){if(r instanceof b)return r;d" +
                   "(r);return m(r)})}if(function(){if(!a||!Object.seal)return!1;try{var l=Object.seal({}),m=Object" +
                    ".seal({}),r=new a([[l,2],[m,3]]);if(2!=r.get(l)||3!=r.get(m))return!1;r[\"delete\"](l);r.set(m," +
                     "4);return!r.has(l)&&4==r.get(m)}catch(w){return!1}}())return a;\n" +
                "var f=\"$jscomp_hidden_\"+Math.random();e(\"freeze\");e(\"preventExtensions\");e(\"seal\");var g=0," +
                 "h=function(l){this.ea=(g+=Math.random()+1).toString();if(l){l=_.ba(l);for(var m;!(m=l.next()).done;" +
                  ")m=m.value,this.set(m[0],m[1])}};h.prototype.set=function(l,m){if(!c(l))throw Error(\"e\");d(l);if" +
                   "(!ua(l,f))throw Error(\"f`\"+l);l[f][this.ea]=m;return this};h.prototype.get=function(l){return c" +
                    "(l)&&ua(l,f)?l[f][this.ea]:void 0};h.prototype.has=function(l){return c(l)&&ua(l,f)&&ua(l[f]," +
                     "this.ea)};h.prototype[\"delete\"]=\n" +
                "function(l){return c(l)&&ua(l,f)&&ua(l[f],this.ea)?delete l[f][this.ea]:!1};return h});\n" +
                "ma(\"Map\",function(a){if(function(){if(!a||\"function\"!=typeof a||!a.prototype" +
                 ".entries||\"function\"!=typeof Object.seal)return!1;try{var h=Object.seal({x:4}),l=new a(_.ba([[h," +
                  "\"s\"]]));if(\"s\"!=l.get(h)||1!=l.size||l.get({x:4})||l.set({x:4},\"t\")!=l||2!=l.size)return!1;" +
                   "var m=l.entries(),r=m.next();if(r.done||r.value[0]!=h||\"s\"!=r.value[1])return!1;r=m.next();" +
                    "return r.done||4!=r.value[0].x||\"t\"!=r.value[1]||!m.next().done?!1:!0}catch(w){return!1}}())" +
                     "return a;sa();var b=new WeakMap,c=function(h){this.w={};\n" +
                "this.o=f();this.size=0;if(h){h=_.ba(h);for(var l;!(l=h.next()).done;)l=l.value,this.set(l[0],l[1])" +
                 "}};c.prototype.set=function(h,l){h=0===h?0:h;var m=d(this,h);m.list||(m.list=this.w[m.id]=[]);m" +
                  ".Na?m.Na.value=l:(m.Na={next:this.o,Bb:this.o.Bb,head:this.o,key:h,value:l},m.list.push(m.Na),this" +
                   ".o.Bb.next=m.Na,this.o.Bb=m.Na,this.size++);return this};c.prototype[\"delete\"]=function(h){h=d" +
                    "(this,h);return h.Na&&h.list?(h.list.splice(h.index,1),h.list.length||delete this.w[h.id],h.Na" +
                ".Bb.next=h.Na.next,h.Na.next.Bb=\n" +
                "h.Na.Bb,h.Na.head=null,this.size--,!0):!1};c.prototype.clear=function(){this.w={};this.o=this.o.Bb=f" +
                 "();this.size=0};c.prototype.has=function(h){return!!d(this,h).Na};c.prototype.get=function(h)" +
                  "{return(h=d(this,h).Na)&&h.value};c.prototype.entries=function(){return e(this,function(h)" +
                   "{return[h.key,h.value]})};c.prototype.keys=function(){return e(this,function(h){return h.key})};c" +
                    ".prototype.values=function(){return e(this,function(h){return h.value})};c.prototype" +
                     ".forEach=function(h,l){for(var m=this.entries(),\n" +
                "r;!(r=m.next()).done;)r=r.value,h.call(l,r[1],r[0],this)};c.prototype[Symbol.iterator]=c.prototype" +
                 ".entries;var d=function(h,l){var m=l&&typeof l;\"object\"==m||\"function\"==m?b.has(l)?m=b.get(l):" +
                  "(m=\"\"+ ++g,b.set(l,m)):m=\"p_\"+l;var r=h.w[m];if(r&&ua(h.w,m))for(h=0;h<r.length;h++){var " +
                   "w=r[h];if(l!==l&&w.key!==w.key||l===w.key)return{id:m,list:r,index:h,Na:w}}return{id:m,list:r," +
                    "index:-1,Na:void 0}},e=function(h,l){var m=h.o;return ra(function(){if(m){for(;m.head!=h.o;)m=m" +
                     ".Bb;for(;m.next!=m.head;)return m=\n" +
                "m.next,{done:!1,value:l(m)};m=null}return{done:!0,value:void 0}})},f=function(){var h={};return h" +
                 ".Bb=h.next=h.head=h},g=0;return c});\n" +
                "ma(\"Set\",function(a){if(function(){if(!a||\"function\"!=typeof a||!a.prototype" +
                 ".entries||\"function\"!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(_.ba([c]))" +
                  ";if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d" +
                   ".entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f" +
                    ".done||f.value[0]==c||4!=f.value[0].x||f.value[1]!=f.value[0]?!1:e.next().done}catch(g)" +
                     "{return!1}}())return a;sa();var b=function(c){this.o=new Map;\n" +
                "if(c){c=_.ba(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.o.size};b.prototype" +
                 ".add=function(c){c=0===c?0:c;this.o.set(c,c);this.size=this.o.size;return this};b" +
                  ".prototype[\"delete\"]=function(c){c=this.o[\"delete\"](c);this.size=this.o.size;return c};b" +
                   ".prototype.clear=function(){this.o.clear();this.size=0};b.prototype.has=function(c){return this.o" +
                    ".has(c)};b.prototype.entries=function(){return this.o.entries()};b.prototype.values=function()" +
                     "{return this.o.values()};b.prototype.keys=b.prototype.values;\n" +
                "b.prototype[Symbol.iterator]=b.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.o" +
                 ".forEach(function(f){return c.call(d,f,f,e)})};return b});ma(\"Object.entries\",function(a){return " +
                  "a?a:function(b){var c=[],d;for(d in b)ua(b,d)&&c.push([d,b[d]]);return c}});ma(\"Object.is\"," +
                   "function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});\n" +
                "ma(\"Array.prototype.includes\",function(a){return a?a:function(b,c){var d=this;d instanceof " +
                 "String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if" +
                  "(f===b||Object.is(f,b))return!0}return!1}});ma(\"String.prototype.includes\",function(a){return " +
                "a?a:function(b,c){return-1!==na(this,b,\"includes\").indexOf(b,c||0)}});\n" +
                "ma(\"Array.from\",function(a){return a?a:function(b,c,d){c=null!=c?c:function(h){return h};var e=[]," +
                 "f=\"undefined\"!=typeof Symbol&&Symbol.iterator&&b[Symbol.iterator];if(\"function\"==typeof f){b=f" +
                  ".call(b);for(var g=0;!(f=b.next()).done;)e.push(c.call(d,f.value,g++))}else for(f=b.length,g=0;" +
                   "g<f;g++)e.push(c.call(d,b[g],g));return e}});_.va=_.va||{};_.n=this||self;_.wa=function(a)" +
                    "{return\"string\"==typeof a};_.xa=function(a){return\"number\"==typeof a};\n" +
                "_.ya=function(a,b){a=a.split(\".\");b=b||_.n;for(var c=0;c<a.length;c++)if(b=b[a[c]],null==b)return " +
                 "null;return b};_.za=function(){};_.Aa=function(a){a.ne=void 0;a.V=function(){return a.ne?a.ne:a" +
                  ".ne=new a}};\n" +
                "_.Ba=function(a){var b=typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if(a " +
                 "instanceof Object)return b;var c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)" +
                  "return\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefined\"!=typeof a" +
                   ".splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splice\"))" +
                    "return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof" +
                     " a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}else " +
                      "return\"null\";\n" +
                "else if(\"function\"==b&&\"undefined\"==typeof a.call)return\"object\";return b};_.Ca=function(a)" +
                 "{return\"array\"==_.Ba(a)};_.Da=\"closure_uid_\"+(1E9*Math.random()>>>0);Ea=function(a,b,c){return " +
                  "a.call.apply(a.bind,arguments)};Fa=function(a,b,c){if(!a)throw Error();if(2<arguments.length){var " +
                   "d=Array.prototype.slice.call(arguments,2);return function(){var e=Array.prototype.slice.call" +
                    "(arguments);Array.prototype.unshift.apply(e,d);return a.apply(b,e)}}return function(){return a" +
                     ".apply(b,arguments)}};\n" +
                "_.p=function(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"native" +
                " code\")?_.p=Ea:_.p=Fa;return _.p.apply(null,arguments)};_.Ga=Date.now||function(){return+new " +
                "Date};_.q=function(a,b){a=a.split(\".\");var c=_.n;a[0]in c||\"undefined\"==typeof c.execScript||c" +
                   ".execScript(\"var \"+a[0]);for(var d;a.length&&(d=a.shift());)a.length||void " +
                    "0===b?c[d]&&c[d]!==Object.prototype[d]?c=c[d]:c=c[d]={}:c[d]=b};\n" +
                "_.t=function(a,b){function c(){}c.prototype=b.prototype;a.M=b.prototype;a.prototype=new c;a" +
                 ".prototype.constructor=a};\n" +
                "var Ha=function(a,b,c){this.B=a;this.w=!1;this.o=b;this.A=c};Ha.prototype.Ma=function(a){if(this.w)" +
                 "throw Error(\"g`\"+this.o);try{a.apply(this.B,this.A),this.w=!0}catch(b){}};\n" +
                "_.u=function(){this.za=this.za;this.jb=this.jb};_.u.prototype.za=!1;_.u.prototype.ga=function(){this" +
                 ".za||(this.za=!0,this.S())};_.u.prototype.S=function(){if(this.jb)for(;this.jb.length;)this.jb" +
                  ".shift()()};\n" +
                "var Ia=function(a){_.u.call(this);this.A=a;this.o=[];this.w={}};_.t(Ia,_.u);Ia.prototype.B=function" +
                 "(a){var b=(0,_.p)(function(){this.o.push(new Ha(this.A,a,Array.prototype.slice.call(arguments)))}," +
                  "this);return this.w[a]=b};\n" +
                "Ia.prototype.Ma=function(){for(var a=this.o.length,b=this.o,c=[],d=0;d<a;++d){var e=b[d].o;a:{var " +
                 "f=this.A;for(var g=e.split(\".\"),h=g.length,l=0;l<h;++l)if(f[g[l]])f=f[g[l]];else{f=null;break " +
                  "a}f=f instanceof Function?f:null}if(f&&f!=this.w[e])try{b[d].Ma(f)}catch(m){}else c.push(b[d])" +
                   "}this.o=c.concat(b.slice(a))};\n" +
                "_.Ja=function(a){if(Error.captureStackTrace)Error.captureStackTrace(this,_.Ja);else{var b=Error()" +
                 ".stack;b&&(this.stack=b)}a&&(this.message=String(a))};_.t(_.Ja,Error);_.Ja.prototype" +
                  ".name=\"CustomError\";\n" +
                "_.Ka=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function" +
                 "(a,b){if(_.wa(a))return _.wa(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c in " +
                  "a&&a[c]===b)return c;return-1};_.La=Array.prototype.forEach?function(a,b,c){Array.prototype" +
                   ".forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=_.wa(a)?a.split(\"\"):a,f=0;f<d;f++)f " +
                "in e&&b.call(c,e[f],f,a)};\n" +
                "_.Ma=Array.prototype.filter?function(a,b,c){return Array.prototype.filter.call(a,b,c)}:function(a,b," +
                 "c){for(var d=a.length,e=[],f=0,g=_.wa(a)?a.split(\"\"):a,h=0;h<d;h++)if(h in g){var l=g[h];b.call" +
                "(c,l,h,a)&&(e[f++]=l)}return e};_.Na=Array.prototype.map?function(a,b,c){return Array.prototype" +
                ".map.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=Array(d),f=_.wa(a)?a.split(\"\"):a,g=0;" +
                    "g<d;g++)g in f&&(e[g]=b.call(c,f[g],g,a));return e};\n" +
                "_.Oa=Array.prototype.reduce?function(a,b,c){return Array.prototype.reduce.call(a,b,c)}:function(a,b," +
                 "c){var d=c;(0,_.La)(a,function(e,f){d=b.call(void 0,d,e,f,a)});return d};_.Pa=Array.prototype" +
                  ".some?function(a,b){return Array.prototype.some.call(a,b,void 0)}:function(a,b){for(var c=a" +
                ".length,d=_.wa(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;" +
                    "return!1};\n" +
                "var Xa;_.Qa=function(){this.o={};this.w={}};_.Aa(_.Qa);_.Ta=function(a,b){a.V=function(){return _.Ra" +
                 "(_.Qa.V(),b)};a.nj=function(){return _.Sa(_.Qa.V(),b)}};_.Va=function(a,b){var c=_.Qa.V();if(a in c" +
                ".o){if(c.o[a]!=b)throw new Ua(a);}else{c.o[a]=b;if(b=c.w[a])for(var d=0,e=b.length;d<e;d++)b[d].o" +
                "(c.o,a);delete c.w[a]}};_.Ra=function(a,b){if(b in a.o)return a.o[b];throw new Wa(b);};_" +
                ".Sa=function(a,b){return a.o[b]||null};Xa=function(a){_.Ja.call(this);this.ea=a};_.t(Xa,_.Ja);\n" +
                "var Ua=function(a){Xa.call(this,a)};_.t(Ua,Xa);var Wa=function(a){Xa.call(this,a)};_.t(Wa,Xa);\n" +
                "var Za;_.Ya=\"bbh bbr bbs has prm sngw so\".split(\" \");Za=new Ia(_.n);_.Va(\"api\",Za);\n" +
                "for(var $a=\"addExtraLink addLink aomc asmc close cp.c cp.l cp.me cp.ml cp.rc cp.rel ela elc elh " +
                 "gpca gpcr lGC lPWF ldb mls noam paa pc pca pcm pw.clk pw.hvr qfaae qfaas qfaau qfae qfas qfau qfhi " +
                  "qm qs qsi rtl sa setContinueCb snaw sncw som sp spd spn spp sps tsl tst up.aeh up.aop up.dpc up" +
                ".iic up.nap up.r up.sl up.spd up.tp upel upes upet\".split(\" \").concat(_.Ya),ab=(0,_.p)(Za.B," +
                    "Za),bb=0;bb<$a.length;bb++){var cb=\"gbar.\"+$a[bb];null==_.ya(cb,window)&&_.q(cb,ab(cb))}_.q" +
                     "(\"gbar.up.gpd\",function(){return\"\"});\n" +
                "var db;_.fb=function(a,b){this.o=a===db&&b||\"\";this.w=_.eb};_.fb.prototype.zb=!0;_.fb.prototype" +
                 ".kb=function(){return this.o};_.gb=function(a){return new _.fb(db,a)};_.eb={};db={};_.hb=_.gb(\"\")" +
                ";\n" +
                "var jb;_.ib=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\\s\\xa0]*([\\s\\S]*?)[\\s\\xa0]*$/.exec(a)[1]};\n" +
                "_.kb=function(a,b){var c=0;a=(0,_.ib)(String(a)).split(\".\");b=(0,_.ib)(String(b)).split(\".\");for" +
                 "(var d=Math.max(a.length,b.length),e=0;0==c&&e<d;e++){var f=a[e]||\"\",g=b[e]||\"\";do{f=/(\\d*)" +
                  "(\\D*)(.*)/.exec(f)||[\"\",\"\",\"\",\"\"];g=/(\\d*)(\\D*)(.*)/.exec(g)||[\"\",\"\",\"\",\"\"];if" +
                   "(0==f[0].length&&0==g[0].length)break;c=jb(0==f[1].length?0:parseInt(f[1],10),0==g[1]" +
                    ".length?0:parseInt(g[1],10))||jb(0==f[2].length,0==g[2].length)||jb(f[2],g[2]);f=f[3];" +
                     "g=g[3]}while(0==c)}return c};\n" +
                "jb=function(a,b){return a<b?-1:a>b?1:0};\n" +
                "var mb;_.nb=function(a,b){this.w=a===_.lb&&b||\"\";this.A=mb};_.nb.prototype.zb=!0;_.nb.prototype" +
                ".kb=function(){return this.w.toString()};_.nb.prototype.le=!0;_.nb.prototype.o=function(){return " +
                  "1};_.ob=function(a){if(a instanceof _.nb&&a.constructor===_.nb&&a.A===mb)return a.w;_.Ba(a);" +
                   "return\"type_error:SafeUrl\"};_.pb=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i;mb={};_" +
                    ".lb={};\n" +
                "_.rb=function(){this.o=\"\";this.w=_.qb};_.rb.prototype.zb=!0;_.qb={};_.rb.prototype.kb=function()" +
                "{return this.o};_.sb=function(a){var b=new _.rb;b.o=a;return b};_.tb=_.sb(\"\");\n" +
                "a:{var vb=_.n.navigator;if(vb){var wb=vb.userAgent;if(wb){_.ub=wb;break a}}_.ub=\"\"}_.v=function(a)" +
                 "{return-1!=_.ub.indexOf(a)};\n" +
                "var zb;_.xb=function(){return _.v(\"Trident\")||_.v(\"MSIE\")};_.yb=function(){return _.v" +
                 "(\"Firefox\")||_.v(\"FxiOS\")};zb=function(){return(_.v(\"Chrome\")||_.v(\"CriOS\"))&&!_.v" +
                "(\"Edge\")};\n" +
                "var Ab;_.Bb=function(){this.w=\"\";this.B=Ab;this.A=null};_.Bb.prototype.le=!0;_.Bb.prototype" +
                 ".o=function(){return this.A};_.Bb.prototype.zb=!0;_.Bb.prototype.kb=function(){return this.w" +
                  ".toString()};_.Cb=function(a){if(a instanceof _.Bb&&a.constructor===_.Bb&&a.B===Ab)return a.w;_.Ba" +
                "(a);return\"type_error:SafeHtml\"};Ab={};_.Eb=function(a,b){var c=new _.Bb;c.w=a;c.A=b;return c};" +
                "_.Eb(\"<!DOCTYPE html>\",0);_.Fb=_.Eb(\"\",0);_.Gb=_.Eb(\"<br>\",0);\n" +
                "_.Hb=function(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}(function(){var a=document" +
                 ".createElement(\"div\"),b=document.createElement(\"div\");b.appendChild(document.createElement" +
                "(\"div\"));a.appendChild(b);b=a.firstChild.firstChild;a.innerHTML=_.Cb(_.Fb);return!b" +
                   ".parentElement});\n" +
                "var Ib;Ib=function(){return _.v(\"iPhone\")&&!_.v(\"iPod\")&&!_.v(\"iPad\")};_.Jb=function(){return " +
                 "Ib()||_.v(\"iPad\")||_.v(\"iPod\")};\n" +
                "_.Kb=function(a){_.Kb[\" \"](a);return a};_.Kb[\" \"]=_.za;var Mb=function(a,b){var c=Lb;return " +
                 "Object.prototype.hasOwnProperty.call(c,a)?c[a]:c[a]=b(a)};\n" +
                "var Tb,bc,cc,Lb,kc;_.Nb=_.v(\"Opera\");_.x=_.xb();_.Ob=_.v(\"Edge\");_.Pb=_.Ob||_.x;_.Qb=_.v" +
                 "(\"Gecko\")&&!(-1!=_.ub.toLowerCase().indexOf(\"webkit\")&&!_.v(\"Edge\"))&&!(_.v(\"Trident\")||_.v" +
                  "(\"MSIE\"))&&!_.v(\"Edge\");_.Rb=-1!=_.ub.toLowerCase().indexOf(\"webkit\")&&!_.v(\"Edge\");Tb=_.n" +
 ".navigator||null;_.Sb=Tb&&Tb.platform||\"\";_.Ub=_.v(\"Macintosh\");_.Vb=_.v(\"Windows\");_.Wb=_" +
                    ".v(\"Linux\")||_.v(\"CrOS\");_.Xb=_.v(\"Android\");_.Yb=Ib();_.Zb=_.v(\"iPad\");_.$b=_.v" +
                     "(\"iPod\");_.ac=_.Jb();\n" +
                "bc=function(){var a=_.n.document;return a?a.documentMode:void 0};a:{var dc=\"\",ec=function(){var " +
                 "a=_.ub;if(_.Qb)return/rv:([^\\);]+)(\\)|;)/.exec(a);if(_.Ob)return/Edge\\/([\\d\\.]+)/.exec(a);if(_" +
                  ".x)return/\\b(?:MSIE|rv)[: ]([^\\);]+)(\\)|;)/.exec(a);if(_.Rb)return/WebKit\\/(\\S+)/.exec(a);if" +
                   "(_.Nb)return/(?:Version)[ \\/]?(\\S+)/.exec(a)}();ec&&(dc=ec?ec[1]:\"\");if(_.x){var fc=bc();if" +
                    "(null!=fc&&fc>parseFloat(dc)){cc=String(fc);break a}}cc=dc}_.gc=cc;Lb={};\n" +
                "_.hc=function(a){return Mb(a,function(){return 0<=_.kb(_.gc,a)})};_.jc=function(a){return Number(ic)" +
                ">=a};kc=_.n.document&&_.x?bc():void 0;var ic=kc;\n" +
                "_.lc=_.yb();_.mc=Ib()||_.v(\"iPod\");_.nc=_.v(\"iPad\");_.oc=_.v(\"Android\")&&!(zb()||_.yb()||_.v" +
                 "(\"Opera\")||_.v(\"Silk\"));_.pc=zb();_.qc=_.v(\"Safari\")&&!(zb()||_.v(\"Coast\")||_.v(\"Opera\")" +
                  "||_.v(\"Edge\")||_.v(\"Edg/\")||_.v(\"OPR\")||_.yb()||_.v(\"Silk\")||_.v(\"Android\"))&&!_.Jb();\n" +
                "var rc={},sc=null;\n" +
                "_.tc=function(a){this.o=0;this.w=a};_.tc.prototype.next=function(){return this.o<this.w" +
                 ".length?{done:!1,value:this.w[this.o++]}:{done:!0,value:void 0}};\"undefined\"!=typeof Symbol&&(_" +
                  ".tc.prototype[Symbol.iterator]=function(){return this});\n" +
                "var uc,wc,yc,Bc;_.y=function(){};uc=\"function\"==typeof Uint8Array;\n" +
                "_.z=function(a,b,c,d,e,f){a.o=null;b||(b=c?[c]:[]);a.J=c?String(c):void 0;a.C=0===c?-1:0;a.A=b;" +
                "a:{c=a.A.length;b=-1;if(c&&(b=c-1,c=a.A[b],!(null===c||\"object\"!=typeof c||_.Ca(c)||uc&&c " +
                  "instanceof Uint8Array))){a.D=b-a.C;a.B=c;break a}-1<d?(a.D=Math.max(d,b+1-a.C),a.B=null):a" +
                   ".D=Number.MAX_VALUE}a.H={};if(e)for(d=0;d<e.length;d++)b=e[d],b<a.D?(b+=a.C,a.A[b]=a.A[b]||_.vc):" +
                    "(wc(a),a.B[b]=a.B[b]||_.vc);if(f&&f.length)for(d=0;d<f.length;d++)_.xc(a,f[d])};_.vc=[];\n" +
                "wc=function(a){var b=a.D+a.C;a.A[b]||(a.B=a.A[b]={})};_.A=function(a,b){if(b<a.D){b+=a.C;var c=a" +
                 ".A[b];return c===_.vc?a.A[b]=[]:c}if(a.B)return c=a.B[b],c===_.vc?a.B[b]=[]:c};_.B=function(a,b)" +
                  "{a=_.A(a,b);return null==a?a:!!a};_.C=function(a,b,c){a=_.A(a,b);return null==a?c:a};_.D=function" +
                   "(a,b,c){b<a.D?a.A[b+a.C]=c:(wc(a),a.B[b]=c);return a};_.xc=function(a,b){for(var c,d,e=0;e<b" +
                    ".length;e++){var f=b[e],g=_.A(a,f);null!=g&&(c=f,d=g,_.D(a,f,void 0))}return c?(_.D(a,c,d),c)" +
                     ":0};\n" +
                "_.E=function(a,b,c){a.o||(a.o={});if(!a.o[c]){var d=_.A(a,c);d&&(a.o[c]=new b(d))}return a.o[c]};" +
                 "yc=function(a){if(a.o)for(var b in a.o){var c=a.o[b];if(_.Ca(c))for(var d=0;d<c.length;d++)" +
                  "c[d]&&c[d].La();else c&&c.La()}};_.y.prototype.La=function(){yc(this);return this.A};\n" +
                "_.y.prototype.w=uc?function(){var a=Uint8Array.prototype.toJSON;Uint8Array.prototype.toJSON=function" +
                 "(){var b;void 0===b&&(b=0);if(!sc){sc={};for(var " +
                  "c=\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789\".split(\"\"),d=[\"+/=\"," +
                "\"+/\",\"-_=\",\"-_.\",\"-_\"],e=0;5>e;e++){var f=c.concat(d[e].split(\"\"));rc[e]=f;for(var g=0;" +
                    "g<f.length;g++){var h=f[g];void 0===sc[h]&&(sc[h]=g)}}}b=rc[b];c=[];for(d=0;d<this.length;d+=3)" +
                     "{var l=this[d],m=(e=d+1<this.length)?this[d+1]:0;h=(f=d+2<this.length)?this[d+2]:0;g=\n" +
                "l>>2;l=(l&3)<<4|m>>4;m=(m&15)<<2|h>>6;h&=63;f||(h=64,e||(m=64));c.push(b[g],b[l],b[m]||\"\"," +
                "b[h]||\"\")}return c.join(\"\")};try{return JSON.stringify(this.A&&this.La(),zc)}finally{Uint8Array" +
                  ".prototype.toJSON=a}}:function(){return JSON.stringify(this.A&&this.La(),zc)};var zc=function(a,b)" +
                "{return _.xa(b)&&(isNaN(b)||Infinity===b||-Infinity===b)?String(b):b};_.y.prototype" +
                    ".toString=function(){yc(this);return this.A.toString()};_.y.prototype.clone=function(){return _" +
                     ".Ac(this)};_.Ac=function(a){return new a.constructor(Bc(a.La()))};\n" +
                "Bc=function(a){if(_.Ca(a)){for(var b=Array(a.length),c=0;c<a.length;c++){var d=a[c];null!=d&&" +
                "(b[c]=\"object\"==typeof d?Bc(d):d)}return b}if(uc&&a instanceof Uint8Array)return new Uint8Array" +
                "(a);b={};for(c in a)d=a[c],null!=d&&(b[c]=\"object\"==typeof d?Bc(d):d);return b};\n" +
                "_.Cc=function(a){_.z(this,a,0,-1,null,null)};_.t(_.Cc,_.y);\n" +
                "_.G=function(a,b){return null!=a?!!a:!!b};_.H=function(a,b){void 0==b&&(b=\"\");return null!=a?a:b};" +
                 "_.J=function(a,b){void 0==b&&(b=0);return null!=a?a:b};\n" +
                "var Dc=function(a){_.z(this,a,0,-1,null,null)};_.t(Dc,_.y);\n" +
                "var Ec=function(a){_.z(this,a,0,-1,null,null)};_.t(Ec,_.y);\n" +
                "var Fc=new Ec(window.gbar&&window.gbar._CONFIG?window.gbar._CONFIG[0]:[[,,,,,,,[]],[],[],[],[],[]," +
                 "[],[],[],[],[],[],[],[],[],[],[],[],[]]),Gc;Gc=_.B(Fc,3);_.Hc=_.G(Gc);\n" +
                "_.Ic=function(){};_.q(\"gbar_._DumpException\",function(a){_.Ic(a)});\n" +
                "var Jc=function(){_.u.call(this);this.o=Fc};_.t(Jc,_.u);_.Ta(Jc,\"cs\");_.K=function(){return Jc.V()" +
                ".o};_.Kc=function(){return _.E(_.K(),Dc,1)||new Dc};_.Va(\"cs\",new Jc);\n" +
                "var Lc=new function(){this.o=_.E(_.Kc(),_.Cc,8)||new _.Cc};_.q(\"gbar.bv\",{n:_.J(_.A(Lc.o,2)),r:_.H" +
                 "(_.A(Lc.o,4)),f:_.H(_.A(Lc.o,3)),e:_.H(_.A(Lc.o,5)),m:_.J(_.C(Lc.o,1,1),1)});_.q(\"gbar.kn\"," +
                "function(){return!0});_.q(\"gbar.sb\",function(){return!1});\n" +
                "_.Mc=!_.x||_.jc(9);_.Nc=!_.Qb&&!_.x||_.x&&_.jc(9)||_.Qb&&_.hc(\"1.9.1\");_.Oc=_.x&&!_.hc(\"9\");_" +
                ".Pc=_.x||_.Nb||_.Rb;\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "_.q(\"gbar.elr\",function(){return{es:{f:152,h:60,m:30},mo:\"md\",vh:window.innerHeight||0,vw:window" +
                 ".innerWidth||0}});\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "})(this.gbar_);\n" +
                "// Google Inc.\n" +
                "</script><style>@-webkit-keyframes gb__a{0%{opacity:0}50%{opacity:1}}@keyframes " +
                 "gb__a{0%{opacity:0}50%{opacity:1}}.gb_hd{display:inline-block;padding:0 0 0 15px;" +
                  "vertical-align:middle}.gb_hd:first-child,#gbsfw:first-child+.gb_hd{padding-left:0}" +
                   ".gb_Lf{position:relative}.gb_B{display:inline-block;outline:none;vertical-align:middle;" +
                    "-webkit-border-radius:2px;border-radius:2px;-webkit-box-sizing:border-box;box-sizing:border-box;" +
                     "height:30px;width:30px;color:#000;cursor:pointer;text-decoration:none}#gb#gb a.gb_B{color:#000;" +
                "cursor:pointer;text-decoration:none}.gb_Qa{border-color:transparent;border-bottom-color:#fff;" +
                "border-style:dashed dashed solid;border-width:0 8.5px 8.5px;display:none;position:absolute;" +
                        "left:6.5px;top:37px;z-index:1;height:0;width:0;-webkit-animation:gb__a .2s;animation:gb__a " +
                         ".2s}.gb_Ra{border-color:transparent;border-style:dashed dashed solid;border-width:0 8.5px 8" +
                          ".5px;display:none;position:absolute;left:6.5px;z-index:1;height:0;width:0;" +
                           "-webkit-animation:gb__a .2s;animation:gb__a .2s;border-bottom-color:#ccc;" +
                            "border-bottom-color:rgba(0,0,0,.2);top:36px}x:-o-prefocus,div" +
                ".gb_Ra{border-bottom-color:#ccc}.gb_D{background:#fff;border:1px solid #ccc;" +
                              "border-color:rgba(0,0,0,.2);color:#000;-webkit-box-shadow:0 2px 10px rgba(0,0,0,.2);" +
                "box-shadow:0 2px 10px rgba(0,0,0,.2);display:none;outline:none;overflow:hidden;" +
                "position:absolute;right:0;top:44px;-webkit-animation:gb__a .2s;animation:gb__a .2s;" +
                "-webkit-border-radius:2px;border-radius:2px;-webkit-user-select:text}.gb_hd.gb_Ec " +
                ".gb_Qa,.gb_hd.gb_Ec .gb_Ra,.gb_hd.gb_Ec .gb_D,.gb_Ec.gb_D{display:block}.gb_hd" +
                                   ".gb_Ec.gb_Mf .gb_Qa,.gb_hd.gb_Ec.gb_Mf .gb_Ra{display:none}" +
                                    ".gb_Nf{position:absolute;right:0;top:44px;z-index:-1}.gb_Aa .gb_Qa,.gb_Aa " +
                                     ".gb_Ra,.gb_Aa .gb_D{margin-top:-10px}.fFW7wc-OEVmcd{width:100%;height:100%;" +
                                      "border:0;overflow:hidden}.fFW7wc.XKSfm-Sx9Kwc-xJ5Hnf{position:absolute;top:0;" +
                                       "left:0;background-color:#fff}.fFW7wc.XKSfm-Sx9Kwc{position:absolute;top:0;" +
                "left:0;background-color:#fff;border:1px solid #acacac;width:auto;padding:0;" +
                                         "z-index:1001;overflow:auto;-webkit-box-shadow:rgba(0,0,0,.2) 0 4px 16px;" +
                                          "-webkit-box-shadow:rgba(0,0,0,.2) 0 4px 16px;box-shadow:rgba(0,0,0,.2) 0 " +
                                           "4px 16px;-webkit-transition:top .5s ease-in-out;-webkit-transition:top " +
                ".5s ease-in-out;transition:top .5s ease-in-out}" +
                                             ".fFW7wc-jJNx8e{position:absolute;z-index:1002}.fFW7wc" +
                                              ".XKSfm-Sx9Kwc-bN97Pc{font-size:0;padding:0}.fFW7wc" +
                                               ".XKSfm-Sx9Kwc-r4nke{height:0;margin:0}.fFW7wc" +
                                                ".XKSfm-Sx9Kwc-r4nke-fmcmS,.fFW7wc.XKSfm-Sx9Kwc-c6xFrd{display:none}" +
                                                 ".gb_xa{-webkit-background-size:32px 32px;background-size:32px 32px;" +
                                                  "-webkit-border-radius:50%;border-radius:50%;display:block;" +
                "margin:-1px;overflow:hidden;position:relative;height:32px;" +
                "width:32px;z-index:0}@media (min-resolution:1.25dppx)," +
                "(-o-min-device-pixel-ratio:5/4)," +
                "(-webkit-min-device-pixel-ratio:1.25)," +
                                                       "(min-device-pixel-ratio:1.25){" +
                ".gb_xa::before{display:inline-block;-webkit-transform:scale(" +
                ".5);transform:scale(.5);-webkit-transform-origin:left 0;" +
                                                          "transform-origin:left 0}" +
                ".gb_ya::before{display:inline-block;" +
                "-webkit-transform:scale(.5);transform:scale(.5);" +
                "-webkit-transform-origin:left 0;transform-origin:left " +
                "0}.gb_j .gb_ya::before{-webkit-transform:scale(0" +
                ".416666667);transform:scale(0.416666667)}}" +
                                                                ".gb_xa:hover,.gb_xa:focus{-webkit-box-shadow:0 1px 0" +
                " rgba(0,0,0,.15);box-shadow:0 1px 0 rgba(0,0,0,.15)" +
                                                                  "}.gb_xa:active{-webkit-box-shadow:inset 0 2px 0 " +
                "rgba(0,0,0,.15);box-shadow:inset 0 2px 0 rgba(0," +
                "0,0,.15)}.gb_xa:active::after{background:rgba(0," +
                "0,0,.1);-webkit-border-radius:50%;" +
                "border-radius:50%;content:'';display:block;" +
                                                                       "height:100%}.gb_za{cursor:pointer;" +
                                                                        "line-height:30px;min-width:30px;opacity:.75;" +
                                                                         "overflow:hidden;vertical-align:middle;" +
                "text-overflow:ellipsis}.gb_B" +
                ".gb_za{width:auto}.gb_za:hover," +
                                                                            ".gb_za:focus{opacity:.85}.gb_Aa .gb_za," +
                                                                             ".gb_Aa .gb_Ba{line-height:26px}#gb#gb" +
                ".gb_Aa a.gb_za,.gb_Aa " +
                ".gb_Ba{font-size:11px;height:auto}" +
                                                                                ".gb_Ca{border-top:4px solid #000;" +
                                                                                 "border-left:4px dashed transparent;" +
                                                                                  "border-right:4px dashed " +
                "transparent;display:inline-block;" +
                "margin-left:6px;opacity:.75;" +
                                                                                     "vertical-align:middle}" +
                                                                                      ".gb_Da:hover .gb_Ca{opacity:" +
                                                                                       ".85}.gb_fa>.gb_Ea{padding:3px" +
                                                                                        " 3px 3px 4px}.gb_Fa" +
                                                                                         ".gb_wa{color:#fff}.gb_h " +
                ".gb_za,.gb_h " +
                ".gb_Ca{opacity:1}#gb#gb" +
                                                                                            ".gb_h.gb_h a.gb_za," +
                                                                                             "#gb#gb .gb_h.gb_h a" +
                                                                                              ".gb_za{color:#fff}" +
                ".gb_h.gb_h " +
                ".gb_Ca{border-top" +
                "-color:#fff;" +
                                                                                                  "opacity:1}.gb_C " +
                                                                                                   ".gb_xa:hover," +
                                                                                                    ".gb_h " +
                                                                                                     ".gb_xa:hover," +
                                                                                                      ".gb_C " +
                                                                                                       ".gb_xa:focus," +
                                                                                                        ".gb_h " +
                                                                                                         ".gb_xa" +
                                                                                                          ":focus" +
                                                                                                           "{-webkit" +
                                                                                                            "-box-shadow:0 1px 0 rgba(0,0,0,.15),0 1px 2px rgba(0,0,0,.2);box-shadow:0 1px 0 rgba(0,0,0,.15),0 1px 2px rgba(0,0,0,.2)}.gb_Ha .gb_Ea,.gb_Ia .gb_Ea{position:absolute;right:1px}.gb_Ea.gb_g,.gb_Ja.gb_g,.gb_Da.gb_g{-webkit-flex:0 1 auto;flex:0 1 auto;-webkit-flex:0 1 main-size;flex:0 1 main-size}.gb_Ka.gb_La .gb_za{width:30px!important}.gb_Ma.gb_wa{display:none}.gb_Na{height:40px;position:absolute;right:-5px;top:-5px;width:40px}.gb_Oa .gb_Na,.gb_Pa .gb_Na{right:0;top:0}.gb_za~.gb_Qa,.gb_za~.gb_Ra{left:auto;right:6.5px}.gb_Sa{outline:none;-webkit-transform:translateZ(0);transform:translateZ(0)}.gb_j.gb_Sa{-webkit-border-radius:8px;border-radius:8px}.gb_Sa.gb_ka:not(.gb_j){width:320px}.gb_j.gb_Sa{margin-left:12px}@media screen and (min-width:361px){.gb_j.gb_Sa{width:354px}}@media screen and (max-width:361px){.gb_j.gb_Sa{width:calc(100vw - 12px*2)}}.gb_j.gb_Sa.gb_Ta{max-height:-webkit-calc(100vh - 44px - 100px);max-height:calc(100vh - 44px - 100px)}.gb_j.gb_Sa.gb_Ua{max-height:-webkit-calc(100vh - 44px - 15px - 100px);max-height:calc(100vh - 44px - 15px - 100px)}.gb_j.gb_Sa.gb_Va{background-color:#2d2e30}.gb_Wa.gb_Xa{color:#5f6368;font:400 12px/16px Roboto,RobotoDraft,Helvetica,Arial,sans-serif}.gb_Za.gb_Wa.gb_Xa{background-color:rgba(138,180,248,0.24);color:#e8eaed}.gb_0a,#gb a.gb_0a.gb_0a,.gb_1a a,#gb .gb_1a.gb_1a a{color:#36c;text-decoration:none}.gb_Wa>.gb_0a,#gb .gb_Wa>a.gb_0a.gb_0a{color:#0070ff;font:inherit;font-weight:500;outline:0}.gb_Za.gb_Wa>.gb_0a,#gb .gb_Za.gb_Wa>a.gb_0a.gb_0a{color:#8ab4f8}.gb_0a:active,#gb a.gb_0a.gb_0a:active,.gb_0a:hover,#gb a.gb_0a.gb_0a:hover,.gb_1a a:active,#gb .gb_1a a:active,.gb_1a a:hover,#gb .gb_1a a:hover,#gb .gb_Wa>a.gb_0a.gb_0a:focus{text-decoration:underline}.gb_2a{margin:20px;white-space:nowrap}.gb_j>.gb_2a{margin:20px 33px}.gb_3a,.gb_4a{display:inline-block;vertical-align:top}.gb_3a.gb_5a,.gb_4a.gb_6a{vertical-align:middle}.gb_j .gb_3a,.gb_j .gb_4a{display:block;vertical-align:top;text-align:center}.gb_5a{cursor:default}.gb_Sa.gb_ka:not(.gb_j) .gb_4a{max-width:164px}.gb_7a.gb_3a{margin-right:20px;position:relative}.gb_j .gb_3a{margin-bottom:10px;position:relative;height:86px;width:86px}.gb_8a{-webkit-border-radius:50%;border-radius:50%;overflow:hidden;-webkit-transform:translateZ(0)}.gb_ya{-webkit-background-size:96px 96px;background-size:96px 96px;border:none;vertical-align:top;height:96px;width:96px}.gb_9a{margin-bottom:11px;margin-top:4px}@media screen and (min-width:361px){.gb_j .gb_3a,.gb_9a{margin-left:101px}}@media screen and (max-width:361px){.gb_j .gb_3a,.gb_9a{margin-left:calc((calc(100vw - 12px*2) - 33px*2 - 86px)/2)}}.gb_ab.gb_ab{fill:#1a73e8}.gb_Va .gb_ab{fill:#8ab4f8}.gb_j .gb_ya{-webkit-background-size:80px 80px;background-size:80px 80px;height:80px;width:80px}.gb_j .gb_bb.gb_ya{-webkit-background-size:76px 76px;background-size:76px 76px;position:relative;left:2px;top:2px;height:76px;width:76px}.gb_Ma{background:rgba(78,144,254,.7);bottom:0;color:#fff;font-size:9px;font-weight:bold;left:0;line-height:9px;position:absolute;padding:7px 0;text-align:center;width:96px}.gb_j .gb_cb{background:#fff;bottom:0;position:absolute;right:0;overflow:visible;height:32px;width:32px}.gb_j.gb_Va .gb_cb{background:#2d2e30}.gb_db{bottom:0;-webkit-box-shadow:0 1px 1px 0 rgba(65,69,73,0.3),0 1px 3px 1px rgba(65,69,73,0.15);box-shadow:0 1px 1px 0 rgba(65,69,73,0.3),0 1px 3px 1px rgba(65,69,73,0.15);margin:0 2.5px 3px;outline:0;position:absolute;right:0;height:26px;width:26px}.gb_db:hover{background-color:#f8faff}.gb_db:focus,.gb_db:hover:focus{background-color:#f4f8ff}.gb_db:active,.gb_db:focus:active{background-color:#f4f8ff;-webkit-box-shadow:0 1px 3px 0 rgba(60,64,67,0.3),0 4px 8px 3px rgba(60,64,67,0.15);box-shadow:0 1px 3px 0 rgba(60,64,67,0.3),0 4px 8px 3px rgba(60,64,67,0.15)}.gb_db:hover>svg.gb_eb,.gb_db:focus>svg.gb_eb,.gb_db:active>svg.gb_eb{fill:#1a73e8}.gb_8a .gb_Ma{background:rgba(0,0,0,.54)}.gb_fb{font-weight:bold;margin:-4px 0 1px 0;text-overflow:ellipsis;overflow:hidden}.gb_j .gb_fb{color:#202124;font:500 16px/18px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:.29px;margin:0 0 2px 0;text-align:center;text-overflow:ellipsis;overflow:hidden}.gb_j.gb_Va .gb_fb{color:#e8eaed}.gb_hb{color:#666;text-overflow:ellipsis;overflow:hidden}.gb_j .gb_hb{color:#5f6368;font:400 14px/19px Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:normal;text-align:center;text-overflow:ellipsis;overflow:hidden}.gb_j.gb_Va .gb_hb{color:#e8eaed}.gb_6a>.gb_hb{color:#000;font-weight:bold;margin:-4px 0 1px 0;text-overflow:ellipsis;overflow:hidden}.gb_ib{color:#666;font-style:italic;font-weight:500;margin:4px 0;overflow:hidden}.gb_jb{color:#5f6368;font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:14px;line-height:19px;margin-top:4px;text-align:center}.gb_Va .gb_jb{color:#9aa0a6}.gb_kb{font-weight:500}.gb_lb.gb_lb{background-color:#ffffff;border:1px solid #dadce0;-webkit-border-radius:100px;border-radius:100px;color:#3c4043;display:inline-block;font:500 14px/16px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:.25px;margin:16px 0 0;max-width:254px;outline:0;padding:8px 16px;text-align:center;text-decoration:none;text-overflow:ellipsis;overflow:hidden}.gb_Va .gb_lb.gb_lb{background-color:#2d2e30;border:1px solid #5f6368;color:#e8eaed}.gb_lb:hover{background-color:#f7f8f8}.gb_lb:focus,.gb_lb:hover:focus{background-color:#f4f4f4}.gb_lb:active,.gb_lb:focus:active{background-color:#e8e8e9;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15)}.gb_1a{color:#ccc;margin:6px 0}.gb_Sa.gb_ka .gb_1a a{display:block;line-height:24px;margin:0}.gb_Sa.gb_ka .gb_1a a:first-child:last-child{line-height:normal}.gb_Sa:not(.gb_ka) .gb_1a a{margin:0 10px}.gb_Sa:not(.gb_ka) .gb_1a a:first-child{margin-left:0}.gb_Sa:not(.gb_ka) .gb_1a a:last-child{margin-right:0}.gb_mb{color:#5f6368;margin:14px 33px;text-align:center;white-space:normal}.gb_Va .gb_mb{color:#e8eaed}.gb_nb.gb_nb{-webkit-border-radius:4px;border-radius:4px;color:#5f6368;display:inline-block;font:400 12px/16px Roboto,RobotoDraft,Helvetica,Arial,sans-serif;outline:0;padding:4px 8px;text-decoration:none;text-align:center;white-space:normal}.gb_Va .gb_nb.gb_nb{border:1px solid transparent;color:#e8eaed}.gb_nb:hover{background-color:#f7f8f8}.gb_nb:focus,.gb_nb:hover:focus{background-color:#f4f4f4}.gb_nb:active,.gb_nb:active:focus{background-color:#e8e8e9}.gb_4a .gb_0{background:#4d90fe;border-color:#3079ed;font-weight:bold;margin:10px 0 0 0;color:#fff}#gb .gb_4a a.gb_0.gb_0{color:#fff}.gb_4a .gb_0:hover{background:#357ae8;border-color:#2f5bb7}.gb_ob.gb_O{border-top:none}.gb_ob{background:#f5f5f5;border-top:1px solid #ccc;border-color:rgba(0,0,0,.2);padding:10px 0;width:100%;display:table}.gb_ob .gb_pb{margin:0 20px;white-space:nowrap}.gb_ob>div{display:table-cell;text-align:right}.gb_ob>div:first-child{text-align:left}.gb_ob .gb_qb{display:block;text-align:center}.gb_rb .gb_Qa{border-bottom-color:#fef9db}.gb_Xa{background:#fef9db;font-size:11px;padding:10px 20px;white-space:normal}.gb_Wa.gb_Xa{background:#e8f0fe;-webkit-border-radius:4px;border-radius:4px;margin:4px;padding:4px 29px;text-align:center}.gb_Wa.gb_Xa>#gbpbt>span{white-space:nowrap;font-weight:500}.gb_Xa b,.gb_0a{white-space:nowrap}.gb_sb.gb_sb{background-color:#ffffff;color:#3c4043;display:table;font:500 14px/16px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:.25px;outline:0;padding:14px 41px;text-align:center;text-decoration:none;width:100%}.gb_Va .gb_sb.gb_sb{background-color:#2d2e30;border:1px solid transparent;color:#e8eaed;width:270px}.gb_sb:hover{background-color:#f7f8f8}.gb_sb:focus,.gb_sb:hover:focus{background-color:#f4f4f4}.gb_sb:active,.gb_sb:focus:active{background-color:#e8e8e9}.gb_tb{border:none;display:table-cell;vertical-align:middle;height:20px;width:20px}.gb_db>svg.gb_eb,.gb_tb>svg.gb_ub,.gb_vb>svg.gb_wb{color:#5f6368;fill:currentColor}.gb_Va .gb_vb>svg.gb_wb{fill:#9aa0a6}.gb_Va .gb_db{border:1px solid transparent;-webkit-box-shadow:0 1px 3px 0 rgba(0,0,0,0.3),0 4px 8px 3px rgba(0,0,0,0.15);box-shadow:0 1px 3px 0 rgba(0,0,0,0.3),0 4px 8px 3px rgba(0,0,0,0.15)}.gb_Va .gb_db>svg.gb_eb,.gb_Va .gb_tb>svg.gb_ub{color:#e8eaed;fill:currentColor}.gb_Va .gb_db:hover>svg.gb_eb,.gb_Va .gb_db:focus>svg.gb_eb,.gb_Va .gb_db:focus:hover>svg.gb_eb,.gb_Va .gb_db:active>svg.gb_eb{fill:#8ab4f8}.gb_Va .gb_db:hover{background-color:#353639;-webkit-box-shadow:0 2px 3px 0 rgba(0,0,0,0.3),0 6px 10px 4px rgba(0,0,0,0.15);box-shadow:0 2px 3px 0 rgba(0,0,0,0.3),0 6px 10px 4px rgba(0,0,0,0.15)}.gb_Va .gb_db:focus,.gb_Va .gb_db:focus:hover{background-color:#353639;border:1px solid #5f6368;-webkit-box-shadow:0 2px 3px 0 rgba(0,0,0,0.3),0 6px 10px 4px rgba(0,0,0,0.15);box-shadow:0 2px 3px 0 rgba(0,0,0,0.3),0 6px 10px 4px rgba(0,0,0,0.15)}.gb_Va .gb_db:active{background-color:rgba(255,255,255,0.12);-webkit-box-shadow:0 4px 4px 0 rgba(0,0,0,0.3),0 8px 12px 6px rgba(0,0,0,0.15);box-shadow:0 4px 4px 0 rgba(0,0,0,0.3),0 8px 12px 6px rgba(0,0,0,0.15)}.gb_xb{display:table-cell;padding:0 74px 0 16px;text-align:left;vertical-align:middle;white-space:normal}.gb_yb{border-bottom:1px solid #e8eaed;border-top:1px solid #e8eaed;padding:0 17px;text-align:center}.gb_Va .gb_yb{border-bottom:1px solid #5f6368;border-top:1px solid #5f6368}.gb_zb.gb_zb,.gb_Ab.gb_Ab{background-color:#ffffff;border:1px solid #dadce0;-webkit-border-radius:4px;border-radius:4px;display:inline-block;font:500 14px/16px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:.15px;margin:16px;outline:0;padding:10px 24px;text-align:center;text-decoration:none;white-space:normal}.gb_zb.gb_zb{color:#3c4043}.gb_Ab.gb_Ab{color:#1a73e8}.gb_Va .gb_Ab.gb_Ab,.gb_Va .gb_zb.gb_zb{background-color:#2d2e30;border:1px solid #5f6368;color:#e8eaed}.gb_zb:hover{background-color:#f7f8f8}.gb_zb:focus,.gb_zb:hover:focus{background-color:#f4f4f4}.gb_zb:active,.gb_zb:active:focus{background-color:#e8e8e9;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15)}.gb_Ab:hover{background-color:#f8fbff;border-color:#cce0fc}.gb_Ab:focus,.gb_Ab:hover:focus{background-color:#f4f8ff;border-color:#c9ddfc}.gb_Ab:active,.gb_Ab:active:focus{background-color:#ecf3fe;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15)}.gb_Eb{border-top:1px solid #e8eaed}.gb_Va .gb_Eb{border-top:1px solid #5f6368}.gb_Ib{background:#f5f5f5;border-top:1px solid #ccc;border-top-color:rgba(0,0,0,.2);max-height:230px;overflow:auto}.gb_j.gb_Sa{overflow-y:auto;overflow-x:hidden}.gb_Ib.gb_ka{max-height:170px}.gb_Ib.gb_ka.gb_Jb{max-height:124px}.gb_Kb{border-top:1px solid #ccc;border-top-color:rgba(0,0,0,.2);display:block;outline-offset:-2px;padding:10px 20px;position:relative;white-space:nowrap}.gb_Lb>.gb_Kb{border:none;cursor:pointer;height:35px;outline:0;padding:12px 33px 13px}.gb_Mb .gb_Kb:focus .gb_Nb{outline:1px dotted #fff}.gb_Kb:hover{background:#eee}.gb_Lb>.gb_Kb:hover{background-color:#f7f8f8}.gb_Lb>.gb_Kb:focus,.gb_Lb>.gb_Kb:hover:focus{background-color:#f4f4f4}.gb_Lb>.gb_Kb:active,.gb_Lb>.gb_Kb:focus:active{background-color:#e8e8e9}.gb_Va .gb_Ob:hover,.gb_Va .gb_sb:hover,.gb_Va .gb_nb:hover,.gb_Va .gb_Lb>.gb_Kb:hover{background-color:rgba(255,255,255,0.04);border:1px solid transparent}.gb_Va .gb_zb:hover,.gb_Va .gb_lb:hover{background-color:rgba(232,234,237,0.04);border:1px solid #5f6368}.gb_Va .gb_Ob:focus,.gb_Va .gb_Ob:hover:focus,.gb_Va .gb_lb:focus,.gb_Va .gb_lb:hover:focus,.gb_Va .gb_sb:focus,.gb_Va .gb_sb:hover:focus,.gb_Va .gb_zb:focus,.gb_Va .gb_zb:hover:focus,.gb_Va .gb_Lb>.gb_Kb:focus,.gb_Va .gb_Lb>.gb_Kb:hover:focus{background-color:rgba(232,234,237,0.12);border:1px solid #e8eaed}.gb_Va .gb_nb:focus,.gb_Va .gb_nb:hover:focus{background-color:rgba(232,234,237,0.12)}.gb_Va .gb_Ob:active,.gb_Va .gb_Ob:focus:active,.gb_Va .gb_sb:active,.gb_Va .gb_sb:focus:active,.gb_Va .gb_nb:active,.gb_Va .gb_nb:active:focus,.gb_Va .gb_Lb>.gb_Kb:active,.gb_Va .gb_Lb>.gb_Kb:focus:active{background-color:rgba(232,234,237,0.1);border:1px solid transparent}.gb_Pb{overflow-x:hidden}.gb_Va .gb_Lb>.gb_Kb{border:1px solid transparent}.gb_Va .gb_zb:active,.gb_Va .gb_zb:active:focus,.gb_Va .gb_lb:active,.gb_Va .gb_lb:focus:active{background-color:rgba(232,234,237,0.1);border:1px solid #5f6368}.gb_Kb[selected=\"true\"]{overflow:hidden}.gb_Kb[selected=\"true\"]>.gb_Qb{background-color:rgba(117,117,117,.9)}.gb_Lb>.gb_Kb[selected=\"true\"]{background-color:rgba(60,64,67,0.1)}.gb_Va .gb_Lb>.gb_Kb[selected=\"true\"]{background-color:rgba(255,255,255,0.12)}.gb_Kb[selected=\"true\"]>.gb_Rb{display:block;position:absolute;z-index:2}.gb_Rb::-moz-focus-inner{border:0}.gb_Rb{background-color:transparent;border:none;color:#fff;display:none;font-family:Roboto,Arial,sans-serif;font-weight:400;font-size:14px;min-height:36px;min-width:86px;text-align:center;top:16px;width:auto}.gb_Sb.gb_Rb{-webkit-border-radius:4px;border-radius:4px;-webkit-box-sizing:border-box;box-sizing:border-box;cursor:pointer;display:inline-block;font-family:Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-weight:500;letter-spacing:.25px;line-height:16px;margin-bottom:1px;min-width:86px;outline:none;padding:10px 24px;text-decoration:none}.gb_Sb.gb_Tb{background-color:#1a73e8;color:#fff;margin-left:0;margin-right:12px;margin-top:14px}.gb_Va .gb_Sb.gb_Tb{background-color:#8ab4f8;color:#2d2e30}.gb_Sb.gb_Ub{background-color:#ffffff;border:1px solid #dadce0;color:#3c4043;margin-left:0;margin-right:0;margin-top:11px}.gb_Va .gb_Sb.gb_Ub{background-color:rgba(218,220,224,0.01);border:1px solid #5f6368;color:#e8eaed}.gb_Sb.gb_Rb.gb_Ub:hover{background-color:#f7f8f8}.gb_Sb.gb_Rb.gb_Ub:focus,.gb_Sb.gb_Rb.gb_Ub:hover:focus{background-color:#f4f4f4}.gb_Sb.gb_Rb.gb_Ub:active{background-color:#f4f4f4;border:1px solid #5f6368;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 1px 3px 1px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 1px 3px 1px rgba(60,64,67,0.15)}.gb_Sb.gb_Rb.gb_Tb:hover{background-color:#2b7de9;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}.gb_Sb.gb_Rb.gb_Tb:focus,.gb_Sb.gb_Rb.gb_Tb:hover:focus{background-color:#5094ed;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}.gb_Sb.gb_Rb.gb_Tb:active{background-color:#63a0ef;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}.gb_Va .gb_Sb.gb_Rb.gb_Ub:hover{background-color:rgba(232,234,237,0.04)}.gb_Va .gb_Sb.gb_Rb.gb_Ub:focus,.gb_Va .gb_Sb.gb_Rb.gb_Ub:hover:focus{background-color:rgba(232,234,237,0.12);border:1px solid #e8eaed}.gb_Va .gb_Sb.gb_Rb.gb_Ub:active,.gb_Va .gb_Sb.gb_Rb.gb_Ub:active:focus{background-color:rgba(232,234,237,0.1);border:1px solid #5f6368;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15)}.gb_Va .gb_Sb.gb_Rb.gb_Tb:hover{background-color:#93b9f8;-webkit-box-shadow:0 1px 2px 0 rgba(0,0,0,0.3),0 1px 3px 1px rgba(0,0,0,0.15);box-shadow:0 1px 2px 0 rgba(0,0,0,0.3),0 1px 3px 1px rgba(0,0,0,0.15)}.gb_Va .gb_Sb.gb_Rb.gb_Tb:focus,.gb_Va .gb_Sb.gb_Rb.gb_Tb:hover:focus{background-color:#a5c5f9}.gb_Va .gb_Sb.gb_Rb.gb_Tb:active{background-color:#8ab4f8;-webkit-box-shadow:0 1px 2px 0 rgba(0,0,0,0.3),0 2px 6px 2px rgba(0,0,0,0.15);box-shadow:0 1px 2px 0 rgba(0,0,0,0.3),0 2px 6px 2px rgba(0,0,0,0.15)}.gb_Kb[selected=\"true\"]>.gb_Rb:focus{background-color:rgba(0,0,0,.24);-webkit-border-radius:2px;border-radius:2px;outline:0}.gb_Kb[selected=\"true\"]>.gb_Rb:hover,.gb_Kb[selected=\"true\"]>.gb_Rb:focus:hover{background-color:#565656;-webkit-border-radius:2px;border-radius:2px}.gb_Kb[selected=\"true\"]>.gb_Rb:active{-webkit-border-radius:2px;border-radius:2px;background-color:#212121}.gb_Ub{left:0;margin-left:5%}.gb_Tb{margin-right:5%;right:0}.gb_Kb:first-child,.gb_Vb:first-child+.gb_Kb{border-top:0}.gb_Va.gb_j .gb_Kb:first-child,.gb_Va.gb_j .gb_Vb:first-child+.gb_Kb{border-top:1px solid transparent}.gb_Va.gb_j .gb_Kb:first-child:focus:hover,.gb_Va.gb_j .gb_Vb:first-child+.gb_Kb:focus:hover,.gb_Va.gb_j .gb_Kb:first-child:focus,.gb_Va.gb_j .gb_Vb:first-child+.gb_Kb:focus{border-top:1px solid #e8eaed}.gb_Va.gb_j .gb_Kb:first-child:active,.gb_Va.gb_j .gb_Vb:first-child+.gb_Kb:active,.gb_Va.gb_j .gb_Kb:first-child:active:focus,.gb_Va.gb_j .gb_Vb:first-child+.gb_Kb:active:focus{border-top:1px solid transparent}.gb_Vb{display:none}.gb_Wb{cursor:default}.gb_Wb:hover{background:transparent}.gb_Lb>.gb_Wb{opacity:.38}.gb_Lb>.gb_Kb.gb_Wb:hover,.gb_Lb>.gb_Kb.gb_Wb:focus,.gb_Lb>.gb_Kb.gb_Wb:active{background-color:#fff}.gb_Xb{border:none;vertical-align:top;height:48px;width:48px}.gb_j .gb_Xb{height:32px;width:32px}.gb_Nb{display:inline-block;margin:6px 0 0 10px}.gb_j .gb_Nb{margin:0 0 0 12px}@media screen and (min-width:361px){.gb_j .gb_Nb{width:244px}}@media screen and (max-width:361px){.gb_j .gb_Nb{width:calc(calc(100vw - 12px*2) - 12px - 32px - 33px*2)}}.gb_Sa.gb_ka .gb_Nb{max-width:222px}.gb_Ib>.gb_Wb .gb_Xb,.gb_Ib>.gb_Wb .gb_Nb{opacity:.4}.gb_Zb .gb_Nb{margin-top:7px}.gb_0b .gb_Nb{margin-top:9px}.gb_1b{color:#000;text-overflow:ellipsis;overflow:hidden}.gb_j .gb_1b{color:#3c4043;font:500 14px/18px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;letter-spacing:.25px}.gb_j.gb_Va .gb_1b{color:#e8eaed}.gb_Ib>.gb_Wb .gb_1b{color:#666}.gb_2b .gb_1b{font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:12px;letter-spacing:normal;line-height:16px}.gb_3b{color:#666;text-overflow:ellipsis;overflow:hidden}.gb_Zb .gb_3b{color:#000;margin-bottom:2px}.gb_j.gb_Va .gb_3b{color:#bdc1c6}.gb_j .gb_3b{color:#5f6368;display:inline-block;font:400 12px/16px Roboto,RobotoDraft,Helvetica,Arial,sans-serif}@media screen and (min-width:361px){.gb_j .gb_3b{max-width:244px}}@media screen and (max-width:361px){.gb_j .gb_3b{max-width:calc(calc(100vw - 12px*2) - 12px - 32px - 33px*2)}}@media screen and (min-width:361px){.gb_Nb>.gb_3b.gb_4b{max-width:224px}}@media screen and (max-width:361px){.gb_Nb>.gb_3b.gb_4b{max-width:calc(calc(calc(100vw - 12px*2) - 12px - 32px - 33px*2) - 20px)}}.gb_Lb>.gb_Wb .gb_3b{color:#3c4043}.gb_2b .gb_3b{margin-top:2px}.gb_5b{color:#666;font-style:italic}.gb_j .gb_5b{color:#5d6369;display:block;float:right;font:italic 400 12px/14px Roboto,RobotoDraft,Helvetica,Arial,sans-serif;padding:3px 0 0 20px;text-align:right;visibility:visible}.gb_j.gb_Va .gb_5b{color:#9aa0a6}.gb_Qb{background-color:transparent;height:100%;left:0;position:absolute;text-align:center;top:0;width:100%;z-index:1}.gb_6b{background-color:transparent;display:none;left:0;overflow-wrap:break-word;position:relative;margin-left:44px;white-space:normal;width:100%;word-wrap:break-word;z-index:1}@media screen and (min-width:361px){.gb_6b{max-width:244px}}@media screen and (max-width:361px){.gb_6b{max-width:calc(calc(100vw - 12px*2) - 33px*2 - 44px)}}.gb_Kb[selected=\"true\"]>.gb_6b{display:block}.gb_Lb>.gb_Kb[selected=\"true\"]{height:auto;min-height:91px}.gb_Rb:hover{background-color:rgba(100,100,100,0.4)}.gb_7b{background:#f5f5f5;border-top:1px solid #ccc;border-top-color:rgba(0,0,0,.2)}.gb_8b{display:block;padding:10px 20px}.gb_Ob{outline:0;padding:14px 41px;width:280px}.gb_Ob:hover{background-color:#f7f8f8}.gb_Ob:focus,.gb_Ob:hover:focus{background-color:#f4f4f4}.gb_Ob:active,.gb_Ob:focus:active{background-color:#e8e8e9}.gb_9b{background-position:-244px 0;display:inline-block;margin:1px 0;vertical-align:middle;height:25px;width:25px}.gb_ac{display:inline-block;vertical-align:middle;height:20px;width:20px}.gb_c .gb_9b::before{left:-244px;top:0}.gb_bc{color:#427fed;display:inline-block;padding:0 25px 0 10px;vertical-align:middle;white-space:normal}.gb_cc{color:#3c4043;font:500 14px/18px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;padding:0 25px 0 16px;text-align:left}@media screen and (min-width:361px){.gb_cc{width:195px}}@media screen and (max-width:361px){.gb_cc{width:calc(calc(calc(100vw - 12px*2) - 12px - 32px - 33px*2) - 24px - 25px)}}.gb_Va .gb_cc{color:#e8eaed}.gb_dc{vertical-align:middle}.gb_ec{-webkit-transform:rotate(180deg);transform:rotate(180deg)}.gb_7b:hover .gb_bc{text-decoration:underline}.gb_ob .gb_pb:hover{-webkit-box-shadow:0 1px 1px rgba(0,0,0,0.1);box-shadow:0 1px 1px rgba(0,0,0,0.1);border-color:#c6c6c6;color:#222;background-color:#fff;background-image:-webkit-gradient(linear,left top,left bottom,from(#fff),to(#f8f8f8));background-image:-webkit-linear-gradient(top,#fff,#f8f8f8);background-image:-webkit-linear-gradient(top,#fff,#f8f8f8);background-image:linear-gradient(top,#fff,#f8f8f8);filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#ffffff',EndColorStr='#f8f8f8')}.gb_fc{height:108px;position:absolute;right:-6px;top:-6px;width:108px}.gb_gc{height:88px;position:absolute;right:2px;top:-4px;width:88px}@-webkit-keyframes progressmove{0%{margin-left:-100%}to{margin-left:100%}}@keyframes progressmove{0%{margin-left:-100%}to{margin-left:100%}}.gb_hc.gb_va,.gb_ic.gb_va{display:none}.gb_hc{background-color:#ccc;height:3px;overflow:hidden}.gb_hc.gb_ic{background-color:#d2e3fc}.gb_Va .gb_hc.gb_ic{background-color:rgba(138,180,248,0.24)}.gb_jc{background-color:#f4b400;height:100%;width:50%;-webkit-animation:progressmove 1.5s linear 0s infinite;animation:progressmove 1.5s linear 0s infinite}.gb_ic>.gb_jc{background-color:#1a73e8}.gb_Va .gb_ic>.gb_jc{background-color:#8ab4f8}.gb_wb,.gb_kc{height:20px;position:absolute;top:-2px;width:20px}.gb_Kb .gb_vb{display:inline-block;height:16px;position:relative;width:20px}.gb_wb{display:inline-block}.gb_Kb[selected=\"true\"] .gb_wb{-webkit-transform:rotate(180deg);transform:rotate(180deg)}.gb_vb{display:none}.gb_lc{background:#fce8e6;border:1px solid #fad2cf;color:#ea4335;font-size:11px;height:22px;left:-24px;line-height:22px;margin-top:8px;position:absolute;text-align:center;-webkit-transform:rotate(-45deg);transform:rotate(-45deg);width:90px;z-index:-1}.gb_Va>.gb_lc,.gb_lc.gb_mc{top:4px;z-index:auto}.gb_lc.gb_nc{-webkit-transform:rotate(45deg);transform:rotate(45deg)}.gb_Sa.gb_j::-webkit-scrollbar{width:16px}.gb_Sa.gb_j::-webkit-scrollbar-thumb{background:#dadce0;background-clip:padding-box;border:4px solid transparent;-webkit-border-radius:8px;border-radius:8px;-webkit-box-shadow:none;box-shadow:none}.gb_Va.gb_j::-webkit-scrollbar-thumb{background-color:#5f6368}.gb_A .gb_B{background-position:-132px -38px;opacity:.55}.gb_C .gb_A .gb_B{background-position:-132px -38px}.gb_h .gb_A .gb_B{background-position:-463px -35px;opacity:1}.gb_D.gb_E{min-height:196px;overflow-y:auto;width:320px}.gb_D.gb_E.gb_j{-webkit-border-radius:8px;border-radius:8px;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,.30),0 2px 6px 2px rgba(60,64,67,.15);box-shadow:0 1px 2px 0 rgba(60,64,67,.30),0 2px 6px 2px rgba(60,64,67,.15);width:328px}.gb_F{-webkit-transition:height .2s ease-in-out;transition:height .2s ease-in-out}.gb_H{background:#fff;margin:0;padding:28px;padding-right:27px;text-align:left;white-space:normal;width:265px}.gb_H:not(.gb_j){min-height:100px}.gb_E.gb_j>.gb_H{padding:12px 14px 20px 14px;width:300px}.gb_I{background:#f5f5f5;cursor:pointer;height:40px;overflow:hidden}.gb_J{position:relative}.gb_I{display:block;line-height:40px;text-align:center;width:320px}.gb_J{display:block;line-height:40px;text-align:center}.gb_J.gb_K{line-height:0}.gb_I,.gb_I:visited,.gb_I:active,.gb_J,.gb_J:visited{color:rgba(0,0,0,0.87);text-decoration:none}.gb_J:active{color:rgba(0,0,0,0.87)}#gb a.gb_I,#gb a.gb_I:visited,#gb a.gb_I:active,#gb a.gb_J,#gb a.gb_J:visited{color:rgba(0,0,0,0.87);text-decoration:none}#gb a.gb_J:active{color:rgba(0,0,0,0.87)}.gb_J:not(.gb_j),.gb_H:not(.gb_j){display:none}.gb_y,.gb_H.gb_y:not(.gb_j),.gb_y+.gb_J,.gb_L .gb_J,.gb_L .gb_H{display:block}.gb_j .gb_M,.gb_j .gb_N,.gb_L .gb_M,.gb_L .gb_N{display:inline-block}.gb_J:hover,.gb_J:active,#gb a.gb_J:hover,#gb a.gb_J:active{text-decoration:underline}.gb_J{border-bottom:1px solid #ebebeb;left:28px;width:264px}.gb_j .gb_J{border-bottom:1px solid #e8eaed;left:0;width:328px}a.gb_M,a.gb_N{background-color:#ffffff;border:1px solid #dadce0;-webkit-border-radius:4px;border-radius:4px;-webkit-box-sizing:border-box;box-sizing:border-box;color:#1a73e8;font:500 14px/16px Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;left:50%;margin:16px 0 18px 0;max-width:264px;outline:none;overflow:hidden;padding:10px 24px;position:relative;text-align:center;text-decoration:none;text-overflow:ellipsis;-webkit-transform:translateX(-50%);transform:translateX(-50%);white-space:nowrap}a.gb_M:visited,a.gb_N:visited{color:#1a73e8}.gb_N:hover,.gb_M:hover{background-color:#f8fbff;border-color:#cce0fc;text-decoration:none}.gb_N:focus,.gb_N:hover:focus,.gb_M:focus,.gb_M:hover:focus{background-color:#f4f8ff;border-color:#c9ddfc}.gb_N:active,.gb_N:active:focus,.gb_M:active,.gb_M:active:focus{background-color:#ecf3fe;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);box-shadow:0 1px 2px 0 rgba(60,64,67,0.3),0 2px 6px 2px rgba(60,64,67,0.15);text-decoration:none}.gb_L .gb_I{display:none}.gb_J:last-child{border-bottom-width:0}.gb_m .gb_d{display:initial}.gb_m.gb_O{height:100px;text-align:center}.gb_m.gb_O img{padding:34px 0;height:32px;width:32px}.gb_m .gb_p+img{border:0;margin:8px;height:48px;width:48px}.gb_m div.gb_P{background:#ffa;-webkit-border-radius:5px;border-radius:5px;padding:5px;text-align:center}.gb_j.gb_m.gb_Q,.gb_j.gb_m.gb_n,.gb_m.gb_Q,.gb_m.gb_n{padding-bottom:0}.gb_j.gb_m.gb_o,.gb_j.gb_m.gb_n,.gb_m.gb_o,.gb_m.gb_n{padding-top:0}.gb_m.gb_n a,.gb_m.gb_o a{top:0}.gb_R .gb_I{margin-top:0;position:static}.gb_S{display:inline-block}.gb_T:hover,#gb#gb .gb_T:hover{text-decoration:underline}.gb_U .gb_H{position:relative}.gb_U .gb_j>.gb_d{top:20px;left:20px}.gb_U .gb_d{position:absolute;top:28px;left:28px}.gb_I.gb_V{display:none;height:0}.gb_va{display:none!important}.gb_wa{visibility:hidden}#gb#gb a.gb_d,#gb#gb a.gb_e,#gb#gb span.gb_e{color:rgba(0,0,0,0.87);text-decoration:none}#gb#gb a.gb_e:hover,#gb#gb a.gb_e:focus{opacity:.85;text-decoration:underline}.gb_f.gb_g{display:none;padding-left:15px;vertical-align:middle}.gb_f.gb_g:first-child{padding-left:0}.gb_f .gb_e{display:inline-block;line-height:24px;outline:none;vertical-align:middle}#gb#gb.gb_h a.gb_e,#gb#gb.gb_h span.gb_e,#gb#gb .gb_h a.gb_e,#gb#gb .gb_h span.gb_e{color:#fff}#gb#gb.gb_h span.gb_e,#gb#gb .gb_h span.gb_e{opacity:.7}a.gb_W{border:none;color:#4285f4;cursor:default;font-weight:bold;outline:none;position:relative;text-align:center;text-decoration:none;text-transform:uppercase;white-space:nowrap;-webkit-user-select:none}a.gb_W:hover:after,a.gb_W:focus:after{background-color:rgba(0,0,0,.12);content:'';height:100%;left:0;position:absolute;top:0;width:100%}a.gb_W:hover,a.gb_W:focus{text-decoration:none}a.gb_W:active{background-color:rgba(153,153,153,.4);text-decoration:none}a.gb_X{background-color:#4285f4;color:#fff}a.gb_X:active{background-color:#0043b2}.gb_Z{-webkit-box-shadow:0 1px 1px rgba(0,0,0,.16);box-shadow:0 1px 1px rgba(0,0,0,.16)}.gb_W,.gb_X,.gb_0,.gb_1{display:inline-block;line-height:28px;padding:0 12px;-webkit-border-radius:2px;border-radius:2px}.gb_0{background:#f8f8f8;border:1px solid #c6c6c6}.gb_1{background:#f8f8f8}.gb_0,#gb a.gb_0.gb_0,.gb_1{color:#666;cursor:default;text-decoration:none}#gb a.gb_1.gb_1{cursor:default;text-decoration:none}.gb_1{border:1px solid #4285f4;font-weight:bold;outline:none;background:#4285f4;background:-webkit-linear-gradient(top,#4387fd,#4683ea);background:linear-gradient(top,#4387fd,#4683ea);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#4387fd,endColorstr=#4683ea,GradientType=0)}#gb a.gb_1.gb_1{color:#fff}.gb_1:hover{-webkit-box-shadow:0 1px 0 rgba(0,0,0,.15);box-shadow:0 1px 0 rgba(0,0,0,.15)}.gb_1:active{-webkit-box-shadow:inset 0 2px 0 rgba(0,0,0,.15);box-shadow:inset 0 2px 0 rgba(0,0,0,.15);background:#3c78dc;background:-webkit-linear-gradient(top,#3c7ae4,#3f76d3);background:linear-gradient(top,#3c7ae4,#3f76d3);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#3c7ae4,endColorstr=#3f76d3,GradientType=0)}.gb_oc{min-width:127px;overflow:hidden;position:relative;z-index:987}.gb_pc{position:absolute;padding:0 20px 0 15px}.gb_qc{display:inline-block;line-height:0;outline:none;vertical-align:middle}.gb_rc .gb_qc{position:relative;top:2px}.gb_qc .gb_sc,.gb_ia{display:block}.gb_tc{border:none;display:block;visibility:hidden}.gb_qc .gb_sc{background-position:0 -35px;height:33px;width:92px}img.gb_la{border:0;vertical-align:middle}.gb_h .gb_qc .gb_sc{background-position:-296px 0}.gb_C .gb_qc .gb_sc{background-position:-97px 0;opacity:.54}.gb_Of{display:inline-block;line-height:normal;position:relative;z-index:987}.gb_wg{color:#000;font:13px/27px Arial,sans-serif;left:0;min-width:1002px;position:absolute;top:0;-webkit-user-select:none;width:100%}.gb_Wf{font:13px/27px Arial,sans-serif;position:relative;height:60px;width:100%}.gb_Aa .gb_Wf{height:28px}#gba{height:60px}#gba.gb_Aa{height:28px}#gba.gb_xg{height:90px}#gba.gb_yg{height:132px}#gba.gb_xg.gb_Aa{height:58px}.gb_Wf>.gb_g{height:60px;line-height:58px;vertical-align:middle}.gb_Aa .gb_Wf>.gb_g{height:28px;line-height:26px}.gb_Wf::before{background:#e5e5e5;bottom:0;content:'';display:none;height:1px;left:0;position:absolute;right:0}.gb_Wf{background:#f1f1f1}.gb_zg .gb_Wf{background:#fff}.gb_zg .gb_Wf::before,.gb_Aa .gb_Wf::before{display:none}.gb_C .gb_Wf,.gb_h .gb_Wf,.gb_Aa .gb_Wf{background:transparent}.gb_C .gb_Wf::before{background:#e1e1e1;background:rgba(0,0,0,.12)}.gb_h .gb_Wf::before{background:#333;background:rgba(255,255,255,.2)}.gb_g{display:inline-block;-webkit-flex:0 0 auto;flex:0 0 auto;-webkit-flex:0 0 main-size;flex:0 0 main-size}.gb_g.gb_Ag{float:right;-webkit-order:1;order:1}.gb_Bg{white-space:nowrap}.gb_Tf .gb_Bg{display:-webkit-flex;display:flex}.gb_Bg,.gb_g{margin-left:0!important;margin-right:0!important}.gb_sc{background-image:url('//ssl.gstatic.com/gb/images/i1_1967ca6a.png');-webkit-background-size:528px 68px;background-size:528px 68px}@media (min-resolution:1.25dppx),(-webkit-min-device-pixel-ratio:1.25),(min-device-pixel-ratio:1.25){.gb_sc{background-image:url('//ssl.gstatic.com/gb/images/i2_2ec824b0.png')}}.gb_Ka{min-width:165px;padding-left:30px;padding-right:30px;position:relative;text-align:right;z-index:986;-webkit-align-items:center;align-items:center;-webkit-justify-content:flex-end;justify-content:flex-end;-webkit-user-select:none}.gb_Aa .gb_Ka{min-width:0}.gb_Ka.gb_g{-webkit-flex:1 1 auto;flex:1 1 auto;-webkit-flex:1 1 main-size;flex:1 1 main-size}.gb_Zc{line-height:normal;position:relative;text-align:left}.gb_Zc.gb_g,.gb_ce.gb_g,.gb_Ba.gb_g{-webkit-flex:0 1 auto;flex:0 1 auto;-webkit-flex:0 1 main-size;flex:0 1 main-size}.gb_mg,.gb_ng{display:inline-block;padding:0 0 0 15px;position:relative;vertical-align:middle}.gb_ce{line-height:normal;padding-right:15px}.gb_Ka .gb_ce{padding-right:0}.gb_Ba{color:#404040;line-height:30px;min-width:30px;overflow:hidden;vertical-align:middle;text-overflow:ellipsis}#gb.gb_Aa.gb_Aa .gb_de,#gb.gb_Aa.gb_Aa .gb_Zc>.gb_ng .gb_hg{background:none;border:none;color:#36c;cursor:pointer;filter:none;font-size:11px;line-height:26px;padding:0;-webkit-box-shadow:none;box-shadow:none}#gb.gb_Aa.gb_h .gb_de,#gb.gb_Aa.gb_h .gb_Zc>.gb_ng .gb_hg{color:#fff}.gb_Aa .gb_de{text-transform:uppercase}.gb_Ka.gb_Uf{padding-left:0;padding-right:29px}.gb_Ka.gb_og{max-width:400px}.gb_pg{background-clip:content-box;background-origin:content-box;opacity:.27;padding:22px;height:16px;width:16px}.gb_pg.gb_g{display:none}.gb_pg:hover,.gb_pg:focus{opacity:.55}.gb_qg{background-position:-219px -25px}.gb_rg{background-position:-194px 0;padding-left:30px;padding-right:14px;position:absolute;right:0;top:0;z-index:990}.gb_Ha:not(.gb_Ia) .gb_rg,.gb_Uf .gb_qg{display:inline-block}.gb_Ha .gb_qg{padding-left:30px;padding-right:0;width:0}.gb_Ha:not(.gb_Ia) .gb_sg{display:none}.gb_Ka.gb_g.gb_Uf,.gb_Uf:not(.gb_Ia) .gb_Zc{-webkit-flex:0 0 auto;flex:0 0 auto;-webkit-flex:0 0 main-size;flex:0 0 main-size}.gb_pg,.gb_Uf .gb_ce,.gb_Ia .gb_Zc{overflow:hidden}.gb_Ha .gb_ce{padding-right:0}.gb_Uf .gb_Zc{padding:1px 1px 1px 0}.gb_Ha .gb_Zc{width:75px}.gb_Ka.gb_tg,.gb_Ka.gb_tg .gb_qg,.gb_Ka.gb_tg .gb_qg::before,.gb_Ka.gb_tg .gb_ce,.gb_Ka.gb_tg .gb_Zc{-webkit-transition:width .5s ease-in-out,min-width .5s ease-in-out,max-width .5s ease-in-out,padding .5s ease-in-out,left .5s ease-in-out;transition:width .5s ease-in-out,min-width .5s ease-in-out,max-width .5s ease-in-out,padding .5s ease-in-out,left .5s ease-in-out}.gb_Tf .gb_Ka{min-width:0}.gb_Ka.gb_La,.gb_Ka.gb_La .gb_Zc,.gb_Ka.gb_ug,.gb_Ka.gb_ug .gb_Zc{min-width:0!important}.gb_Ka.gb_La,.gb_Ka.gb_La .gb_g{-webkit-flex:0 0 auto!important;-webkit-box-flex:0 0 auto!important;-webkit-flex:0 0 auto!important;flex:0 0 auto!important}.gb_Ka.gb_La .gb_Ba{width:30px!important}.gb_vg{margin-right:32px}.gb_wa{display:none}.gb_Wf ::-webkit-scrollbar{height:15px;width:15px}.gb_Wf ::-webkit-scrollbar-button{height:0;width:0}.gb_Wf ::-webkit-scrollbar-thumb{background-clip:padding-box;background-color:rgba(0,0,0,.3);border:5px solid transparent;-webkit-border-radius:10px;border-radius:10px;min-height:20px;min-width:20px;height:5px;width:5px}.gb_Wf ::-webkit-scrollbar-thumb:hover,.gb_Wf ::-webkit-scrollbar-thumb:active{background-color:rgba(0,0,0,.4)}#gb.gb_Eg{min-width:980px}#gb.gb_Eg .gb_Sf{min-width:0;position:static;width:0}.gb_6c{display:none}.gb_Eg .gb_Wf{background:transparent;border-bottom-color:transparent}.gb_Eg .gb_Wf::before{display:none}.gb_Eg.gb_Eg .gb_f{display:inline-block}.gb_Eg.gb_Ka .gb_ce{padding-right:15px}.gb_Eg.gb_Tf #gbqf{display:block}.gb_Eg #gbq{height:0;position:absolute}.gb_Eg.gb_Ka{z-index:987}sentinel{}#gbq .gbgt-hvr,#gbq .gbgt:focus{background-color:transparent;background-image:none}.gbqfh#gbq1{display:none}.gbxx{display:none !important}#gbq{line-height:normal;position:relative;top:0px;white-space:nowrap}#gbq{left:0;width:100%}#gbq2{top:0px;z-index:986}#gbq4{display:inline-block;max-height:29px;overflow:hidden;position:relative}.gbqfh#gbq2{z-index:985}.gbqfh#gbq2{margin:0;margin-left:0 !important;padding-top:0;position:relative;top:310px}.gbqfh #gbqf{margin:auto;min-width:534px;padding:0 !important}.gbqfh #gbqfbw{display:none}.gbqfh #gbqfbwa{display:block}.gbqfh #gbqf{max-width:572px;min-width:572px}.gbqfh .gbqfqw{border-right-width:1px}\n" +
                ".gbii::before{content:url(https://ssl.gstatic.com/gb/images/silhouette_27.png)}" +
                 ".gbip::before{content:url(https://ssl.gstatic.com/gb/images/silhouette_96.png)}@media " +
                  "(min-resolution:1.25dppx),(-o-min-device-pixel-ratio:5/4),(-webkit-min-device-pixel-ratio:1.25)," +
                   "(min-device-pixel-ratio:1.25){.gbii::before{content:url(https://ssl.gstatic" +
                    ".com/gb/images/silhouette_27.png)}.gbip::before{content:url(https://ssl.gstatic" +
                ".com/gb/images/silhouette_96.png)}}\n" +
                ".gbii{background-image:url(https://ssl.gstatic.com/gb/images/silhouette_27.png)}" +
                ".gbip{background-image:url(https://ssl.gstatic.com/gb/images/silhouette_96.png)}@media " +
                  "(min-resolution:1.25dppx),(-o-min-device-pixel-ratio:5/4),(-webkit-min-device-pixel-ratio:1.25)," +
                   "(min-device-pixel-ratio:1.25){.gbii{background-image:url(https://ssl.gstatic" +
                ".com/gb/images/silhouette_27.png)}.gbip{background-image:url(https://ssl.gstatic" +
                     ".com/gb/images/silhouette_96.png)}}\n" +
                "@-webkit-keyframes qs-timer {0%{}}</style></head><body jsmodel=\" \" class=\"hp vasq\" " +
                 "id=\"gsr\"><style>[dir='ltr'],[dir='rtl']{unicode-bidi:-webkit-isolate;" +
                "unicode-bidi:isolate}bdo[dir='ltr'],bdo[dir='rtl']{unicode-bidi:bidi-override;" +
                   "unicode-bidi:-webkit-isolate-override;unicode-bidi:isolate-override}#logo{display:block;" +
                    "overflow:hidden;position:relative}#logo img{border:0;}#logo span{background:url" +
                "(/images/nav_logo299.webp) no-repeat;cursor:pointer;overflow:hidden}#logocont{z-index:1;" +
                      "padding-left:13px;padding-right:10px;padding-top:7px}#logocont.ddl{padding-top:3px}.big " +
                       "#logocont{padding-left:13px;padding-right:12px}#searchform #logocont{padding-top:11px;" +
                "padding-right:28px;padding-left:30px}.sbibod{background-color:#fff;height:44px;" +
                         "vertical-align:top;border:1px solid #dfe1e5;border-radius:8px;box-shadow:none;" +
                "transition:box-shadow 200ms cubic-bezier(0.4, 0.0, 0.2, 1);}.lst{border:0;margin-top:5px;" +
                "margin-bottom:0}.lst:focus{outline:none}.gsfi,.lst{font:16px arial,sans-serif;" +
                "line-height:34px;height:34px !important}.lst-c{overflow:hidden}#gs_st0{line-height:44px;" +
                             "padding:0 8px;margin-top:-1px;position:static}.srp #gs_st0{padding:0 2px 0 8px}" +
                ".gsfs{font:16px arial,sans-serif}.lsb{background:transparent;border:0;font-size:0;" +
 "height:30px;outline:0;text-align:left;width:100%}.sbico{display:inline-block;" +
                                "height:0px;width:0px;cursor:pointer;vertical-align:middle;color:#4285f4}" +
                ".sbico-c{background:transparent;border:0;float:right;height:44px;line-height:44px;" +
                                  "margin-top:-1px;outline:0;padding-right:16px;position:relative;top:-1px}.hp " +
                                   ".sbico-c{display:none}#sblsbb{text-align:center;border-bottom-left-radius:0;" +
                "border-top-left-radius:0;height:44px;margin:0;padding:0;}#sbds{border:0;" +
                                     "margin-left:0}.hp .nojsb,.srp .jsb{display:none}.kpbb,.kprb,.kpgb," +
                                      ".kpgrb{border-radius:2px;border-radius:2px;color:#fff}.kpbb:hover,.kprb:hover," +
                ".kpgb:hover,.kpgrb:hover{box-shadow:0 1px 1px rgba(0,0,0,0.1);box-shadow:0 " +
                                        "1px 1px rgba(0,0,0,0.1);color:#fff}.kpbb:active,.kprb:active,.kpgb:active," +
                ".kpgrb:active{box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);box-shadow:inset 0" +
                                          " 1px 2px rgba(0,0,0,0.3)}.kpbb{background-image:-webkit-gradient(linear," +
                                           "left top,left bottom,from(#4d90fe),to(#4787ed));background-color:#4d90fe;" +
                "background-image:-webkit-linear-gradient(top,#4d90fe,#4787ed);" +
                                             "background-image:linear-gradient(top,#4d90fe,#4787ed);border:1px solid " +
                "#3079ed}.kpbb:hover{background-image:-webkit-gradient(linear,left top," +
                "left bottom,from(#4d90fe),to(#357ae8));background-color:#357ae8;" +
                "background-image:-webkit-linear-gradient(top,#4d90fe,#357ae8);" +
                                                 "background-image:linear-gradient(top,#4d90fe,#357ae8);border:1px " +
                                                  "solid #2f5bb7}a.kpbb:link,a.kpbb:visited{color:#fff}" +
                ".kprb{background-image:-webkit-gradient(linear,left top,left " +
                "bottom,from(#dd4b39),to(#d14836));background-color:#dd4b39;" +
                                                     "background-image:-webkit-linear-gradient(top,#dd4b39,#d14836);" +
                                                      "background-image:linear-gradient(top,#dd4b39,#d14836);" +
                "border:1px solid #dd4b39}" +
                ".kprb:hover{background-image:-webkit-gradient(linear,left " +
                                                         "top,left bottom,from(#dd4b39),to(#c53727));" +
                "background-color:#c53727;" +
                                                           "background-image:-webkit-linear-gradient(top,#dd4b39," +
                                                            "#c53727);background-image:linear-gradient(top,#dd4b39," +
                "#c53727);border:1px solid #b0281a;" +
                                                              "border-bottom-color:#af301f}" +
                                                               ".kprb:active{background-image:-webkit-gradient" +
                "(linear,left top,left bottom,from(#dd4b39),to" +
                                                                 "(#b0281a));background-color:#b0281a;" +
                                                                  "background-image:-webkit-linear-gradient(top," +
                                                                   "#dd4b39,#b0281a);background-image:linear-gradient" +
                                                                    "(top,#dd4b39,#b0281a)}" +
                                                                     ".kpgb{background-image:-webkit-gradient(linear," +
                "left top,left bottom,from(#3d9400),to(#398a00)" +
                                                                       ");background-color:#3d9400;" +
                                                                        "background-image:-webkit-linear-gradient" +
                                                                         "(top,#3d9400,#398a00);" +
                                                                          "background-image:linear-gradient(top," +
                                                                           "#3d9400,#398a00);border:1px solid " +
                                                                            "#29691d}.kpgb:hover{background-image" +
                                                                             ":-webkit-gradient(linear,left top,left " +
                "bottom,from(#3d9400),to(#368200));" +
                                                                               "background-color:#368200;" +
                                                                                "background-image:-webkit-linear" +
                                                                                 "-gradient(top,#3d9400,#368200);" +
                                                                                  "background-image:linear-gradient" +
                "(top,#3d9400,#368200);border:1px " +
                                                                                    "solid #2d6200}" +
                ".kpgrb{background-image:-webkit" +
                                                                                      "-gradient(linear,left top,left" +
                                                                                       " bottom,from(#f5f5f5),to" +
                "(#f1f1f1));" +
                                                                                         "background-color:#f5f5f5;" +
                "background-image:-webkit" +
                "-linear-gradient(top," +
                                                                                            "#f5f5f5,#f1f1f1);" +
                "background-image:linear" +
                                                                                              "-gradient(top,#f5f5f5," +
                                                                                               "#f1f1f1);border:1px " +
                "solid #dcdcdc;" +
                                                                                                 "color:#555}" +
                                                                                                  ".kpgrb:hover" +
                "{background-image" +
                                                                                                    ":-webkit" +
                                                                                                     "-gradient" +
                                                                                                      "(linear,left " +
                "top,left " +
                                                                                                        "bottom,from" +
                                                                                                         "(#f8f8f8)," +
                                                                                                          "to(#f1f1f1));background-color:#f8f8f8;background-image:-webkit-linear-gradient(top,#f8f8f8,#f1f1f1);background-image:linear-gradient(top,#f8f8f8,#f1f1f1);border:1px solid #dcdcdc;color:#333}a.kpgrb:link,a.kpgrb:visited{color:#555}#sfopt{display:inline-block;float:right;line-height:normal}.lsd{font-size:11px;position:absolute;top:3px;left:16px}.sbsb_g{margin:3px 0 4px}.jhp input[type=\"submit\"],.sbdd_a input,.gbqfba{background-image:-webkit-gradient(linear,left top,left bottom,from(#f5f5f5),to(#f1f1f1));background-image:-webkit-linear-gradient(top,#f5f5f5,#f1f1f1);-webkit-border-radius:2px;-webkit-user-select:none;background-color:#f2f2f2;border:1px solid #f2f2f2;border-radius:4px;color:#5F6368;cursor:pointer;font-family:arial,sans-serif;font-size:14px;margin:11px 4px;min-width:54px;padding:0 16px;text-align:center}.gbqfba.gbqfba-hvr{font-size:14px}.jhp input[type=\"submit\"],.gbqfba{height:36px;line-height:27px}.sbdd_a input{height:100%}.jhp input[type=\"submit\"]:hover,.sbdd_a input:hover,.gbqfba:hover{background-image:-webkit-gradient(linear,left top,left bottom,from(#f8f8f8),to(#f1f1f1));background-image:-webkit-linear-gradient(top,#f8f8f8,#f1f1f1);-webkit-box-shadow:0 1px 1px rgba(0,0,0,0.1);background-color:#f8f8f8;background-image:linear-gradient(top,#f8f8f8,#f1f1f1);background-image:-o-linear-gradient(top,#f8f8f8,#f1f1f1);border:1px solid #c6c6c6;box-shadow:0 1px 1px rgba(0,0,0,0.1);color:#222}.jhp input[type=\"submit\"]:focus,.sbdd_a input:focus{border:1px solid #4d90fe;outline:none}.sbdd_a input{margin:6px;}span.lsbb,.lsb input{-webkit-transition:all 0.18s}@media only screen and (max-height:650px){span.lsbb{height:17px}}.tsf{background:none}#sform{height:65px}#searchform{width:100%}.hp #searchform{position:absolute;top:311px}.srp #searchform{position:absolute;top:20px}.srp #tsf{position:relative;}.sfbg{height:69px;left:0;position:absolute;width:100%}.sfbgg{height:65px}#cnt{padding-top:20px;}#subform_ctrl{min-height:0px}</style><style data-jiis=\"cc\" id=\"gstyle\">html,body{height:100%;margin:0}#viewport{min-height:100%;position:relative;width:100%}.content{padding-bottom:35px}#footer{bottom:0;font-size:10pt;height:35px;position:absolute;width:100%}#gog{padding:3px 8px 0}td{line-height:.8em}.gac_m td{line-height:17px}body,td,a,p,.h{font-family:arial,sans-serif}.h{color:#1a0dab;font-size:20px}.q{color:#00c}.ts td{padding:0}.ts{border-collapse:collapse}em{color:#c03;font-style:normal;font-weight:normal}a em{text-decoration:underline}#lst-ib:hover{border-color:#a0a0a0 #b9b9b9 #b9b9b9 #b9b9b9 !important}#lst-ib.lst-d-f,#lst-ib:hover.lst-d-f{border-color:#4d90fe !important}.ds{display:inline-block;margin-left:4px}.ctr-p{margin:0 auto;min-width:980px}.big .ctr-p{min-width:1139px}a.gb1,a.gb2,a.gb3,a.gb4{color:#11c !important}body{background:#fff;color:#222}a{color:#1a0dab;text-decoration:none}a:hover,a:active{text-decoration:underline}.fl a{color:#1a0dab}a:visited{color:#609}a.gb1,a.gb4{text-decoration:underline}a.gb3:hover{text-decoration:none}#ghead a.gb2:hover{color:#fff !important}.sblc{padding-top:5px}.sblc a{display:block;margin:2px 0;margin-left:13px;font-size:11px}.lsbb{height:30px;display:block}.ftl,#footer a{color:#5f6368;margin:2px 10px 0}#footer a:active{color:#dd4b39}.lsb{border:none;color:#000;cursor:pointer;height:30px;margin:0;outline:0;vertical-align:top}.lst:focus{outline:none}body,html{font-size:small}h1,ol,ul,li{margin:0;padding:0}.nojsv{visibility:hidden}.hp #logocont.nojsv{display:none}#body,#footer{display:block}.gl{white-space:nowrap}.big .tsf-p{padding-left:150px;padding-right:352px}.hp .tsf-p{padding-left:173px;padding-right:173px}.hp #tsf{margin:0 auto;width:833px}#tsf{width:833px}.big #tsf,.hp .big #tsf{width:1139px}.tsf-p{padding-left:150px;padding-right:46px}.hp .big .tsf-p{padding-left:284px;padding-right:284px}#fll{float:right;text-align:right;width:100%}#ftby{padding-left:0}#ftby>div,#fll>div,#footer a{display:inline-block}@media only screen and (min-width:1222px){#ftby{margin:0 44px}}.logo-subtext{color:#4285f4;font:16px/16px roboto-regular, arial, sans-serif;left:215px;position:relative;top:76px;white-space:nowrap}</style><style>.gl{white-space:nowrap}.big .tsf-p{padding-left:150px;padding-right:352px}.hp .tsf-p{padding-left:173px;padding-right:173px}.hp #tsf{margin:0 auto;width:833px}#tsf{width:833px}.big #tsf,.hp .big #tsf{width:1139px}.tsf-p{padding-left:150px;padding-right:46px}.hp .big .tsf-p{padding-left:284px;padding-right:284px}</style><div class=\"ctr-p\" id=\"viewport\"><div id=\"doc-info\"></div><div id=\"cst\"><style>.y,.yp,.yf,.yi,.yl,.ye{}.z1asCe{display:inline-block;fill:currentColor;height:24px;line-height:24px;position:relative;width:24px}.z1asCe svg{display:block;height:100%;width:100%}.s2er{}.s2ml{}.s2ra{}.spch{}.spchc{}.spch-dlg{background:transparent;border:none}.spch{background:#fff;height:100%;left:0;opacity:0;overflow:hidden;position:fixed;text-align:left;top:0;visibility:hidden;width:100%;z-index:10000;transition:visibility 0s linear 0.218s,background-color 0.218s}.close-button{background:none;border:none;color:#777;cursor:pointer;font-size:26px;right:0;height:11px;line-height:15px;margin:15px;opacity:.6;padding:0;position:absolute;top:0;width:15px;z-index:10}.close-button:hover{opacity:.8}.close-button:active{opacity:1}.spchc{display:block;height:42px;position:absolute;pointer-events:none}.inner-container{height:100%;opacity:.1;pointer-events:none;width:100%;transition:opacity .318s ease-in}.s2ml .inner-container,.s2ra .inner-container,.s2er .inner-container{opacity:1;transition:opacity 0s}.s2fp{}.s2fp-h{}.s2fpm{}.s2fpm-h{}.s2tb{}.s2tb-h{}.spcht{}.spchta{}.spch-2l{}.spch-3l{}.spch-4l{}.spch-5l{}.text-container{pointer-events:none}.s2fp-h .text-container,.s2fp .text-container,.s2fpm-h .text-container,.s2fpm .text-container{position:absolute}.s2tb-h .text-container,.s2tb .text-container{position:relative}.spcht{font-weight:normal;line-height:1.2;opacity:0;pointer-events:none;position:absolute;text-align:left;-webkit-font-smoothing:antialiased;transition:opacity .1s ease-in,margin-left .5s ease-in,top 0s linear 0.218s}.s2fp-h .spcht,.s2fpm-h .spcht{margin-left:44px}.s2tb-h .spcht{margin-left:32px}.s2fp-h .spcht,.s2fp .spcht,.s2fpm-h .spcht,.s2fpm .spcht{left:-44px;top:-.2em}.s2fp-h .spcht,.s2fp .spcht{font-size:32px;width:460px}.s2fpm-h .spcht,.s2fpm .spcht{font-size:28px;width:300px}.s2tb-h .spcht,.s2tb .spcht{font-size:27px;left:7px;top:.2em;width:490px}.s2fp .spcht,.s2fpm .spcht,.s2tb .spcht{margin-left:0;opacity:1;transition:opacity .5s ease-out,margin-left .5s ease-out}.spchta{color:#1155cc;cursor:pointer;font-size:18px;font-weight:500;pointer-events:auto;text-decoration:underline}.spch-2l.spcht,.spch-3l.spcht,.spch-4l.spcht{transition:top 0.218s ease-out}.spch-2l.spcht{top:-.6em}.spch-3l.spcht{top:-1.3em}.spch-4l.spcht{top:-1.7em}.s2fp .spch-5l.spcht{top:-2.5em}.s2tb .spch-5l.spcht{font-size:24px;top:-1.7em;transition:font-size 0.218s ease-out}.s2wfp{}.permission-bar{margin-top:-100px;opacity:0;pointer-events:none;position:absolute;width:500px;transition:opacity 0.218s ease-in,margin-top .4s ease-in}.s2wfp .permission-bar{margin-top:-300px;opacity:1;transition:opacity .5s ease-out 0.218s,margin-top 0.218s ease-out 0.218s}.permission-bar-gradient{box-shadow:0 1px 0px #4285F4;height:80px;left:0;margin:0;opacity:0;pointer-events:none;position:fixed;right:0;top:-80px;transition:opacity 0.218s,box-shadow 0.218s}.s2wfp .permission-bar-gradient{box-shadow:0 1px 80px #4285F4;opacity:1;pointer-events:none;animation:allow-alert .75s 0 infinite;animation-direction:alternate;animation-timing-function:ease-out;transition:opacity 0.218s,box-shadow 0.218s}@-webkit-keyframes allow-alert {from{opacity:1}to{opacity:.35}}.s2fp.spch{opacity:1;visibility:visible;transition-delay:0s}.s2tb-h.spch{background:rgba(255,255,255,0);opacity:0;visibility:hidden}.s2tb.spch{background:rgba(255,255,255,0);opacity:1;visibility:visible;transition-delay:0s}.google-logo{background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALwAAABACAQAAAAKENVCAAAI/ElEQVR4Ae3ae3BU5RnH8e/ZTbIhhIRbRIJyCZcEk4ZyE4RBAiRBxRahEZBLQYUZAjIgoLUWB6wjKIK2MtAqOLVUKSqWQW0ZaOQq0IFAIZVrgFQhXAOShITEbHY7407mnPfc8u6ya2f0fN6/9rzvc87Z39nbed/l/8OhIKMDQ+hHKp1JJB6FKq5QQhH72MZ1IsDRhvkU4bds9WxlLNE4wqg9q6jBL9G+4knc/HB9qXmuG4goD89TjT+IVkimE/zt6sYh/EG3WmaiOMGHbgQ38YfY3ibKCV6GMabHWY0bo+Ps5jjnuYlCczrSk8Hcgd5U1rONoDnG48Ova2W8RGeMXAxiHfWakT4mOx81oRiG1/C5vYh47KSx5fZid4JvxxVd7MdIp3EK06kNNXYneIWtutgLaIasQUwkJE7wE3SxbycWR8SD93BOiL2YRBwRDN5FwOPchaqecZQTQQ4XAApz0FrFQSLPwQD8mlZNEt8L5841D62/cJVIi2cgPelEAlBOCYfYSxXymjKAXqSQAFRwloPspRp5dzOMHiTThEqK2c1OvGHIsg/30YUWKHzDKfZwEB+2xBn3gUSSwmA+MpluruYDySMPYD23TOrX0V/q+CPZYai+yHw8wKscbmhMD+IVfyevcMlkuvxXxGOphTD4Gi4iJ40C/DZtM12wk8Lfbes/oSN27mGPZW0RnVmvebxIMng3z1Bluddz5Mh9wm8icqZIzPHfZDxW8qhotL6cUVh5zP74XOBg0MEnsgW/bfMxzyIOYdgSIuV5/JJtPmZmSlb7mI6ZGTLVQQafSKHUvp7BxFxhSD6N8UsH4An5aT+J3mNB1T+K3hj8YQ/ezRbpvY3CYKEwYFLYgvfTkQZ9qTN8nS3lIdJJZwTLDdNztfwUrTTDp+hllmnqrxo+sLqi1dWwuFPKYnK5h0we5c/UhhT8fF1FHWsZTis8dGAyB4S+67RF5wVhwC/DGHxvAqI4Imyv50Vi0YpjsW4l4AAuGii63yE+lhCHVlOW6o79TxRN/ee64y/SHb8TO4MOvq3uYh6iO1oufiP0r0VnjtA9K4zBDzSdgKtjJGbyqBfG5dFguC62sZiZoLt0Qy3qvYzCKIZNQQYvXupdxGO0Rni5dLebl1wexuD7A4DuC+gprMwTxu2hwT+E7c9iZYEw7lMaiBPeczAXT3EQwcdwTbP1Eq3RiyaPvcIe/4igj9C5NYzBpwOQKmzbh4IVF4dMviOShHfCEdxYieKY8M5qCUCy8E4oxIWVnwcRfK4wdhqitiyk1JBHJc3UU4UT+HDRYADR1GEnB2s9WYrqssn41/BjxcdrrEOVzRogS4hqOfVY8fI6qzWXYTAbgRwUVMvwYeUzzpKCnMGobvIeDRTuZyajiMLoMG2oRONfwnV5kNDNFH5ZKAD8SbPtFrHYaSr8+nkLgCXC53sCdloJz+RlAFYJv5bisPOG9Cv+U+F+O6AZM4Sx2iz+QKZxWrgArSmEbiAIpwvQGdV/qMFOFUdRdTbUn6QCO9c4bajvJhy/GjuFyOqEqhhIZyUXWEk6esd4imTyKTIG/1e08kghNNEMR7WfgERUpTTmPKrmIdSXGupbiHu3dQFZCagy2MGXzCAekZcPySKDlVSYTwsf5QB9aeBiCWMJxcO0RPU5AW5UPuyJI9xhr/diz4ssF6ohGJXyFmu42Fj5MrTGMILgKTyHqpoCAipR3YE9cURFWOorUCVhrzWyKrFWwGg68hIXG79uGziG1rt0IFhPcC+qj6gioARVJm7sRPMTVCWG+u54sBNHqm19Ji7sZCDrv5gp53ekkcNGvHJvGB+zdVd+M60JRi/eREt9VIQqgfuxM5Q4VEcM9R5ysfMAUaA78iFUzRmIfb2sw+j9m6m042lOEqS1hv+R3Y2svpSJCxJCn9hjR5ztywSgg7BtGwpWFHYLY+8CIB2/5Jppj5BvoE7Qz/a8bCVSrIv+quQrYCLVQl0NXVEpnBF6f4aVX+guvELAPmH7GMk/ZX1BgKJb2szBnEJBEMFHUyY841SsjGcr7bGVabLC8z6dsJPC3ww1sxE9LfTeoAdmeumOPkNzYcUb776Y6aebOh5Hg6m6l1MaZhYGOUn2sjD6MAmYyeIWfiqYhoKNLJNlaC/ryCUGvRhyWUedYfx7KIiack4XfZ5ujMI4XewlxIpzMEL04w31k3STtEW4NWd6Uugr4yFEHt4Ielo4iRvC+P20R6QwTZPnFtpjI4dKi5veAlbwLPnM4NesZDs3Tcd9RgxGIw3jdjCeO1FQSGYiuw39D6A1CJ+u/wsm0pZA/STDEnY9A9DKMtRvZjStAIVOzOJMSAsh+YaMltGXGEChHVPYr+s/igsbPTmHP8T2IR7MvW46voZa0+2voLfAor7GdPtz6C0yHVfNt4S+9KewwXTJ8xtumWyv5T6w14pNIYTu40VcWHHzvvSe3sWFnsIq6foVKCb1qyOw2N2EnZJ7+5aRSFAYS2lQp3maLOy5WS61pyW4MKOwCJ/E5X8BBTMuXsW+tpITQQYPcXws8Zyuk420eOZyQSqqy8zDg4yH+cp2T2cYjp1sim3rTzEEO4/YPKNL9AvpD00K+ZTbnZXwc1KSh9FspNrmDbSZicQirwmzLMI7Qb7EnjxM57hp/TGmEUNjEljAZUNtHW/TGvhA+J6QCx4gicVcNT2r7TyIgoEiGf+99CeVLiTSDKimjK85QSH7qCJ4Cr0YRi9SaI6fG5zlIAUcwS9d34Nsen9Xz3f1hRRQJF0fzVCyyaQdcZRzil18zCUAPtHc3s3mTYIRzWCGkEEH4vFSxmn2s5kSJDgOGP/l4Ii8aOHetzeOsIhiNAX0wVq28O3lwXHbklnIeQJ/PHJhQbh72YXjts3Eq4n0t5h7BL+mzcVx29Kpxy9E70IvV5h7qiEJRxiswC+0feTgJkAhg3d098S/J8IUfhziOUAaouscoYJmpNIO0WXSuYYjLLpxFb9U85KNI4wyKJWKfQKOMEtmm33sXCCbCHC4mMxZIWpx/aglEeNwM4J3KNb8jvmaDTxBIt8jhR8vD22IpYYr1PBD5HA4HP8DxVcxdwELEFUAAAAASUVORK5CYII=) no-repeat center;background-size:94px 32px;height:32px;width:94px;top:8px;opacity:0;float:right;left:255px;pointer-events:none;position:relative;transition:opacity .5s ease-in,left .5s ease-in}.s2tb .google-logo{opacity:0.54;left:270px;transition:opacity .5s ease-out,left .5s ease-out}.s2fp .spchc,.s2fp-h .spchc{margin:auto;margin-top:312px;max-width:572px;min-width:534px;padding:0 223px;position:relative;top:0}.s2tb .spchc,.s2tb-h .spchc{background:#fff;box-shadow:0 2px 6px rgba(0,0,0,0.2);margin:0;min-width:100%;overflow:hidden;padding:51px 0 50px 126px;position:absolute}.s2tb-h .inner-container,.s2tb .inner-container{height:100%;width:572px;transition:opacity .318s ease-in}.button{background-color:#fff;border:1px solid #eee;border-radius:100%;bottom:0;box-shadow:0 2px 5px rgba(0,0,0,.1);cursor:pointer;display:inline-block;left:0;opacity:0;pointer-events:none;position:absolute;right:0;top:0;transition:background-color 0.218s,border 0.218s,box-shadow 0.218s}.s2tb-h .button{left:-83px;opacity:0;pointer-events:none;position:absolute;top:-83px;transition-delay:0}.s2fp-h .button,.s2fpm-h .button{opacity:0;pointer-events:none;position:absolute;transition-delay:0}.s2fp .button,.s2tb .button,.s2fpm .button{opacity:1;pointer-events:auto;position:absolute;transform:scale(1);transition-delay:0}.s2ra .button{background-color:#ff4444;border:0;box-shadow:none}.r8s4j{background-color:#dbdbdb;border-radius:100%;display:inline-block;height:301px;left:-69px;opacity:1;pointer-events:none;position:absolute;top:-69px;width:301px;transform:scale(.01);transition:opacity 0.218s}.s2tb-h .r8s4j,.s2tb .r8s4j{height:151px;left:-28px;top:-28px;width:151px}.button-container{pointer-events:none;position:relative;transition:transform 0.218s,opacity 0.218s ease-in}.s2fp-h .button-container,.s2fp .button-container{height:165px;right:-70px;top:-70px;width:165px;float:right}.s2fpm-h .button-container,.s2fpm .button-container{height:165px;margin:0 auto;top:150px;width:165px}.s2fp-h .button-container,.s2tb-h .button-container,.s2fpm-h .button-container{transform:scale(.1)}.s2fp .button-container,.s2fpm-h .button-container,.s2tb .button-container{transform:scale(1)}.s2tb-h .button-container,.s2tb .button-container{height:95px;right:-31px;top:-27px;width:95px;float:right}.s2ra .button:active{background-color:#cd0000}.button:active{background-color:#eee}.microphone{height:87px;left:43px;pointer-events:none;position:absolute;top:47px;width:42px;transform:scale(1)}.s2tb-h .microphone,.s2tb .microphone{left:17px;top:7px;transform:scale(.53)}.receiver{background-color:#999;border-radius:30px;height:46px;left:25px;pointer-events:none;position:absolute;width:24px}.wrapper{bottom:0;height:53px;left:11px;overflow:hidden;pointer-events:none;position:absolute;width:52px}.stem{background-color:#999;bottom:14px;height:14px;left:22px;pointer-events:none;position:absolute;width:9px;z-index:1}.shell{border:7px solid #999;border-radius:28px;bottom:27px;height:57px;pointer-events:none;position:absolute;width:38px;z-index:0;left:0px}.s2ml .receiver,.s2ml .stem{background-color:#f44}.s2ml .shell{border-color:#f44}.s2ra .receiver,.s2ra .stem{background-color:#fff}.s2ra .shell{border-color:#fff}</style></div><style>@media only screen and (max-width:580px){#gb div{display:none}}#gb{font-size:13px}#gb{position:relative;top:8px}div#searchform{min-width:980px;z-index:103}div.sfbg,div.sfbgg{min-width:980px;height:64px}.big form#tsf,form#tsf{width:auto;max-width:784px;overflow:hidden}#searchform.big>#tsf{max-width:784px}.big div.tsf-p,form>div.tsf-p{margin:-1px 0 0;padding-right:0}#gb{top:16px}div#viewport{position:absolute;top:0;width:100%}div#searchform.jhp{margin-top:0}#searchform.big.jhp>#tsf{max-width:none}.jhp>#tsf{max-width:none}</style> <div id=\"gb\">  <div id=\"gbw\">   <div style=\"top:0;left:0;right:0;width:100%\"> <div class=\"gb_Ka gb_Bg gb_g gb_Ag gb_Eg\" data-ogsr-up=\"\"><div class=\"gb_ce gb_g gb_Bg gb_sg\"><div class=\"gb_f gb_g\"><a class=\"gb_e\" data-pid=\"23\" href=\"https://mail.google.com/mail/?tab=wm&amp;ogbl\">Gmail</a></div><div class=\"gb_f gb_g\"><a class=\"gb_e\" data-pid=\"2\" href=\"https://www.google.com/imghp?hl=zh-CN&amp;tab=wi&amp;ogbl\">图片</a></div></div><div class=\"gb_Zc gb_Bg gb_g\"><div class=\"gb_A gb_hd gb_g\" data-ogsr-fb=\"true\" data-ogsr-alt=\"\" id=\"gbwa\"><div class=\"gb_Lf\"><a class=\"gb_B gb_sc\" href=\"https://www.google.com/intl/zh-CN/about/products?tab=wh\" title=\"Google 应用\" aria-expanded=\"false\" role=\"button\" tabindex=\"0\"></a><div class=\"gb_Ra\"></div><div class=\"gb_Qa\"></div></div></div><div class=\"gb_mg gb_g\"><div class=\"gb_Lf\"><a class=\"gb_de gb_1 gb_pb\" id=\"gb_70\" href=\"https://accounts.google.com/ServiceLogin?hl=zh-CN&amp;passive=true&amp;continue=https://www.google.com/\" target=\"_top\">登录</a><div class=\"gb_Ra\"></div><div class=\"gb_Qa\"></div></div></div></div></div> </div> </div> </div>  <div class=\"jhp\" id=\"searchform\"><script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">(function(){var _j=1280;try{var s=document.getElementById('searchform');var w=document['body']&&document.body['offsetWidth'];if(s&&w&&w>=_j){s.className+=' big';document['body'].className+=' big';}\n" +
                "}catch(e){}\n" +
                "})();</script><div class=\"sfbg nojsv\" style=\"margin-top:-20px\"><div " +
                 "class=\"sfbgg\"></div></div><form class=\"tsf nj\" action=\"/search\" style=\"overflow:visible\" " +
                  "id=\"tsf\" method=\"GET\" name=\"f\" onsubmit=\"return q.value!=''\" role=\"search\"><div " +
                   "id=\"tophf\"><input name=\"source\" type=\"hidden\" value=\"hp\"><input " +
                    "value=\"IimLXYibGcTXhwPXhL-ADA\" name=\"ei\" type=\"hidden\"></div> <div jsmodel=\"vWNDde\" " +
                     "jsdata=\"MuIEvd;;CB0Pik\"> <div jscontroller=\"mvYTse\" class=\"A8SBwf\" " +
                      "jsaction=\"DkpM0b:d3sQLd;IQOavd:dFyQEf;XzZZPe:jI3wzf;Aghsf:AVsnlb;iHd9U:Q7Cnrc;f5hEHe:G0jgYd;" +
                       "vmxUb:j3bJnb;R2c5O:LuRugf;qiCkJd:ANdidc;NOg9L:HLgh3;uGoIkd:epUokb;zLdLw:eaGBS;" +
                "rcuQ6b:npT2md\"><style>.emca{}.emcat{}.emcav{}.sbfc{}.iblpc{}.A8SBwf{position:relative;" +
                "margin:0 auto;padding-left:12px;padding-top:6px;width:484px;}#searchform.big " +
                ".A8SBwf{width:584px}.RNNXgb{background:#fff;display:flex;border-radius:8px;border:1px " +
                           "solid #dfe1e5;box-shadow:none;border-radius:24px;z-index:3;height:44px;margin:0 auto;" +
                "width:482px;}.minidiv .RNNXgb{height:32px;border-radius:16px;margin:10px 0 0}.emcav " +
                             ".RNNXgb{border-bottom-left-radius:0;border-bottom-right-radius:0;border-color:rgba(223," +
                "225,229,0);box-shadow:0 1px 6px 0 rgba(32,33,36,0.28)}.minidiv .emcav " +
                               ".RNNXgb{border-bottom-left-radius:0;border-bottom-right-radius:0}.emcav.emcat " +
                                ".RNNXgb{border-bottom-left-radius:24px;border-bottom-right-radius:24px}.minidiv " +
                ".emcav.emcat .RNNXgb{border-bottom-left-radius:16px;" +
                                  "border-bottom-right-radius:16px}.RNNXgb:hover,.sbfc .RNNXgb{box-shadow:0 1px 6px 0" +
                                   " rgba(32,33,36,0.28);border-color:rgba(223,225,229,0)}#searchform.big " +
                                    ".RNNXgb{width:582px}.SDkEP{flex:1;display:flex;padding:5px 8px 0 16px;" +
                "padding-left:14px;}.minidiv .SDkEP{padding-top:0}.FPdoLc{padding-top:18px;" +
                "position:absolute;top:53px;width:487px;z-index:0}#searchform.big " +
                ".FPdoLc{width:571px}.iblpc{display:flex;align-items:center;" +
                                        "padding-right:13px;margin-top:-5px}.minidiv .iblpc{margin-top:0}</style><div" +
                                         " class=\"RNNXgb\" jsname=\"RNNXgb\"><div class=\"SDkEP\"><div " +
                                          "class=\"iblpc\" jsname=\"uFMOof\"><style>.uFMOof{margin:auto}" +
                ".nS8rZ{color:#9AA0A6;height:20px;width:20px;margin-top:3px}</style><div " +
                "class=\"uFMOof\"><span class=\"nS8rZ z1asCe MZy1Rb\"><svg " +
                                             "focusable=\"false\" xmlns=\"http://www.w3.org/2000/svg\" viewbox=\"0 0 " +
                                              "24 24\"><path d=\"M15.5 14h-.79l-.28-.27A6.471 6.471 0 0 0 16 9.5 6.5 " +
                "6.5 0 1 0 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 " +
                "19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 " +
                "11.99 14 9.5 14z\"></path></svg></span></div></div><div " +
                "jscontroller=\"iDPoPb\" class=\"a4bIc\" jsname=\"gLFyf\" " +
                                                   "jsaction=\"h5M12e;input:d3sQLd;focus:dFyQEf;blur:jI3wzf\"><style>" +
                                                    ".gLFyf{background-color:transparent;border:none;margin:0;" +
                "padding:0;color:rgba(0,0,0,.87);word-wrap:break-word;" +
                "outline:none;display:flex;flex:100%;" +
                "-webkit-tap-highlight-color:transparent;margin-top:-37px}" +
                                                        ".minidiv .gLFyf{margin-top:-35px;}.a4bIc{display:flex;" +
                                                         "flex:1;flex-wrap:wrap}.vdLsw{color:transparent;flex:100%;" +
                "white-space:pre}.vdLsw span{background:url" +
                "(\"/images/experiments/wavy-underline.png\") repeat-x " +
                "scroll 0 100% transparent;padding:0 0 10px 0;" +
                                                             "}</style><div class=\"vdLsw gsfi\" " +
                                                              "jsname=\"vdLsw\"></div><input class=\"gLFyf gsfi\" " +
                                                               "maxlength=\"2048\" name=\"q\" type=\"text\" " +
                "jsaction=\"paste:puy29d\" aria-autocomplete=\"both\"" +
                                                                 " aria-haspopup=\"false\" autocapitalize=\"off\" " +
                                                                  "autocomplete=\"off\" autocorrect=\"off\" " +
                "role=\"combobox\" spellcheck=\"false\" " +
                "title=\"Google 搜索\" value=\"\" aria-label=\"搜索\"" +
                                                                     " data-ved" +
                "=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ39UDCAQ" +
                                                                       "\"></div><div class=\"dRYYxd\"><style>" +
                ".dRYYxd{display:flex;flex:0 0 auto;" +
                                                                         "margin-top:-5px;align-items:stretch;" +
                "flex-direction:row}.minidiv " +
                                                                           ".dRYYxd{margin-top:0}</style><style>" +
                                                                            ".JC0tCe{flex:1 0 auto;display:flex;" +
                                                                             "cursor:pointer;align-items:center;" +
                                                                              "border:0;background:transparent;" +
                                                                               "outline:none;padding:0 8px;" +
                                                                                "width:24px;line-height:44px}" +
                                                                                 ".hb2Smf{background:url('//www" +
                                                                                  ".gstatic.com/images/branding" +
                                                                                   "/googlemic/2x" +
                                                                                    "/googlemic_color_24dp.png') 0 0 " +
                "no-repeat;height:24px;" +
                                                                                      "width:24px;" +
                                                                                       "background-size:24px;" +
                                                                                        "vertical-align:middle}" +
                                                                                         ".minidiv " +
                                                                                          ".JC0tCe{line-height:32px}" +
                                                                                           ".minidiv " +
                ".hb2Smf{background-size" +
                                                                                             ":20px 20px;height:20px;" +
                                                                                              "width:16px}</style" +
                                                                                               "><div jscontroller" +
                                                                                                "=\"MC8mtf\" " +
                                                                                                 "class=\"JC0tCe\" " +
                                                                                                  "aria-label" +
                                                                                                   "=\"按语音搜索\" " +
                                                                                                    "role=\"button\" " +
                                                                                                     "tabindex=\"0\" " +
                                                                                                      "jsaction" +
                                                                                                       "=\"h5M12e;" +
                                                                                                        "rcuQ6b" +
                                                                                                         ":npT2md\" " +
                                                                                                          "data-ved" +
                                                                                                           "=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQvs8DCAU\"><span class=\"hb2Smf\"></span></div></div></div></div><div jscontroller=\"tg8oTe\" class=\"UUbT9\" style=\"display:none\" jsname=\"UUbT9\" jsaction=\"mouseout:ItzDCd;mouseleave:MWfikb;hBEIVb:nUZ9le;YMFC3:VKssTb\"><style>.UUbT9{position:relative;text-align:left;margin-top:-1px;z-index:3;cursor:default;-webkit-user-select:none}.aajZCb{background:#fff;display:flex;flex-direction:column;list-style-type:none;margin:0;padding:0;box-shadow:0 3px 8px 0 rgba(0,0,0,0.2),0 0 0 1px rgba(0,0,0,0.08);border:0;border-radius:0 0 24px 24px;box-shadow:0 4px 6px 0 rgba(32,33,36,0.28);padding-bottom:4px;overflow:hidden}.minidiv .aajZCb{border-bottom-left-radius:16px;border-bottom-right-radius:16px}.erkvQe{flex:auto;padding-bottom:0px;}.RjPuVb{height:1px;margin:0 26px 0 0}.S3nFnd{display:flex}.S3nFnd .RjPuVb,.S3nFnd .aajZCb{flex:0 0 auto}.lh87ke:link,.lh87ke:visited{color:#36c;cursor:pointer;font:11px arial,sans-serif;padding:0 5px;margin-top:-10px;text-decoration:none;flex:auto;align-self:flex-end;margin:0 16px 5px 0}.lh87ke:hover{text-decoration:underline}.xtSCL{border-top:1px solid #e8eaed;margin:0 20px 0 14px;padding-bottom:4px}.sb7{background:url() no-repeat ;min-height:0px;min-width:0px;height:0px;width:0px}.sb27{background:url(/images/searchbox/desktop_searchbox_sprites302_hr.webp) no-repeat 0 -21px;background-size:20px;min-height:20px;min-width:20px;height:20px;width:20px}.sb43{background:url(/images/searchbox/desktop_searchbox_sprites302_hr.webp) no-repeat 0 0;background-size:20px;min-height:20px;min-width:20px;height:20px;width:20px}.sb53.sb53{padding:0px 4px;margin:0}</style><div class=\"RjPuVb\" jsname=\"RjPuVb\"></div><div class=\"aajZCb\" jsname=\"aajZCb\"><div class=\"xtSCL\"></div><ul class=\"erkvQe\" jsname=\"erkvQe\" role=\"listbox\"></ul><style>#sbt{display:none}.sbct{display:flex;align-items:center;min-width:0;padding:0}.suggestions-inner-container{flex:auto;display:flex;margin:0 20px;align-items:center;margin:0 20px 0 14px}.sbtc{display:flex;flex:auto;flex-direction:column;min-width:0;padding:6px 0;}.sbic{display:flex;flex:0 1 auto;align-items:center;margin-right:14px}.sbl1{display:flex;font-size:16px;color:#212121;flex:auto;align-items:center;word-break:break-word;padding-right:8px}.minidiv .sbl1{font-size:14px}.sbl1p{color:#52188c}.sbl1>span{flex:auto}.sbab{display:flex;flex:0 1 auto;align-self:stretch}.sbdb:hover{color:#1a73e8;text-decoration:underline}.sbdb{color:#80868b;cursor:pointer;font:13px arial,sans-serif;align-self:center;padding-right:0}.sbhl{background:#eee}.mus_pc{display:block;margin:6px 0}.mus_il{font-family:Arial,HelveticaNeue-Light,HelveticaNeue,Helvetica;padding-top:7px;position:relative}.mus_il:first-child{padding-top:0}.mus_il_at{margin-left:10px}.mus_il_st{right:52px;position:absolute}.mus_il_i{align:left;margin-right:10px}.mus_it3{margin-bottom:3px;max-height:24px;vertical-align:bottom}.mus_tt3{color:#767676;font-size:12px;vertical-align:top}.mus_tt5{color:#dd4b39;font-size:14px}.mus_tt6{color:#3d9400;font-size:14px}.mus_tt8{font-size:16px;font-family:Arial,sans-serif}.mus_tt17{color:#212121;font-size:20px}.mus_tt18{color:#212121;font-size:24px}.mus_tt19{color:#767676;font-size:12px}.mus_tt20{color:#767676;font-size:14px}.mus_tt23{color:#767676;font-size:18px}</style><li data-view-type=\"1\" class=\"sbct\" id=\"sbt\" role=\"presentation\"><div class=\"suggestions-inner-container\"><div class=\"sbic\"></div><div class=\"sbtc\" role=\"option\"><div class=\"sbl1\"><span></span></div></div><div class=\"sbab\"><div class=\"sbai\">删除</div></div></div></li><div jsname=\"VlcLAe\" class=\"VlcLAe\"> <style>.VlcLAe{height:70px}</style> <center> <input class=\"gNO89b\" value=\"Google 搜索\" aria-label=\"Google 搜索\" name=\"btnK\" type=\"submit\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ4dUDCAY\"> <input class=\"RNmpXc\" value=\"&nbsp;手气不错&nbsp;\" aria-label=\"&nbsp;手气不错&nbsp;\" name=\"btnI\" type=\"submit\" jsaction=\"sf.lck\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ19QECAc\">  </center> </div></div><style>.JUypV{font-size:8pt;margin-top:-16px;position:absolute;right:16px}</style><div jsname=\"JUypV\" jscontroller=\"IvlUe\" class=\"JUypV\" data-async-context=\"async_id:duf3-46;authority:0;card_id:;entry_point:0;feature_id:;ftoe:0;header:0;open:0;suggestions:;suggestions_subtypes:;suggestions_types:;surface:0;title:;type:46\"><style>a.duf3{color:#70757a;float:right;font-style:italic;-webkit-tap-highlight-color:rgba(0,0,0,0);tap-highlight-color:rgba(0,0,0,0)}a.aciXEb{padding:0 5px;}.RTZ84b{color:#9e9e9e;cursor:pointer;padding-right:8px}.XEKxtf{color:#9e9e9e;float:right;font-size:12px;padding-bottom:4px}</style><div jscontroller=\"xz7cCd\" style=\"display:none\" jsaction=\"rcuQ6b:npT2md\"></div><div id=\"duf3-46\" data-jiis=\"up\" data-async-type=\"duffy3\" data-async-context-required=\"type,open,feature_id,async_id,entry_point,authority,card_id,ftoe,title,header,suggestions,surface,suggestions_types,suggestions_subtypes\" class=\"y yp\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ-0EICA\"></div><a class=\"duf3 aciXEb\" href=\"#\" id=\"sbfblt\" data-async-trigger=\"duf3-46\" jsaction=\"async.u\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQtw8ICQ\">举报不当的联想查询</a></div></div><div class=\"FPdoLc VlcLAe\">  <center> <input class=\"gNO89b\" value=\"Google 搜索\" aria-label=\"Google 搜索\" name=\"btnK\" type=\"submit\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ4dUDCAo\"> <input class=\"RNmpXc\" value=\"&nbsp;手气不错&nbsp;\" aria-label=\"&nbsp;手气不错&nbsp;\" name=\"btnI\" type=\"submit\" jsaction=\"sf.lck\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ19QECAs\">  </center> </div></div>  <div style=\"background:url(/images/searchbox/desktop_searchbox_sprites302_hr.webp)\"> </div> </div> </form></div><dialog class=\"spch-dlg\" id=\"spch-dlg\"><div class=\"spch s2fp-h\" style=\"display:none\" id=\"spch\"><button class=\"close-button\" id=\"spchx\" aria-label=\"close\">&times;</button><div class=\"spchc\" id=\"spchc\"><div class=\"inner-container\"><div class=\"button-container\"><span class=\"r8s4j\" id=\"spchl\"></span><span class=\"button\" id=\"spchb\"><div class=\"microphone\"><span class=\"receiver\"></span><div class=\"wrapper\"><span class=\"stem\"></span><span class=\"shell\"></span></div></div></span></div><div class=\"text-container\"><span class=\"spcht\" id=\"spchi\" style=\"color:#777\"></span><span class=\"spcht\" id=\"spchf\" style=\"color:#000\"></span></div><div class=\"google-logo\"></div></div><div class=\"permission-bar\"><div class=\"permission-bar-gradient\"></div></div></div></div></dialog><div jscontroller=\"fEVMic\" style=\"display:none\" data-u=\"0\" jsdata=\"C4mkuf;;CB0Pio\" jsaction=\"rcuQ6b:npT2md\"></div><div class=\"content\" id=\"main\"><span class=\"ctr-p\" id=\"body\"><center><div id=\"lga\"><style>#lga{height:233px;margin-top:89px}</style><img alt=\"Google\" height=\"92\" id=\"hplogo\" src=\"/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png\" srcset=\"/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png 1x, /images/branding/googlelogo/2x/googlelogo_color_272x92dp.png 2x\" style=\"padding-top:109px\" width=\"272\" onload=\"typeof google==='object'&&google.aft&&google.aft(this)\"></div><div style=\"height:118px\"></div><div id=\"prm-pt\" style=\"margin-top:12px\"><script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">window.gbar&&gbar.up&&gbar.up.tp&&gbar.up.tp();</script><div id=\"swml\"></div></div></center></span><div class=\"ctr-p\" id=\"footer\"><div id=\"fbarcnt\"> <div id=\"footcnt\"><style>.fmulti{}.GNlFYb{color:#5f6368}.p2Kmnc{color:#222;font-size:14px;font-weight:normal;-webkit-tap-highlight-color:rgba(0,0,0,0)}.Seo5Sb{display:inline-block;opacity:0.55;vertical-align:top}a.p2Kmnc:hover .Seo5Sb,a.p2Kmnc:active .Seo5Sb{opacity:1.0}.GNlFYb{margin:40px 0}.TfEe9d{margin-right:10px}.EvHmz{bottom:0;left:0;position:absolute;right:0}.M6hT6{background:#f2f2f2;left:0;right:0;-webkit-text-size-adjust:none}.hRvfYe #fsettl:hover{text-decoration:underline}.hRvfYe #fsett a:hover{text-decoration:underline}.hRvfYe a:hover{text-decoration:underline}.fbar p{display:inline}.fbar a,#fsettl{text-decoration:none;white-space:nowrap}.fbar{margin-left:-27px}.Fx4vi{padding-left:27px;margin:0 !important}.In26Ec{padding:0 !important;margin:0 !important}#fbarcnt{display:block}.smiUbb img{margin-right:4px}.smiUbb a,.M6hT6 #swml a{text-decoration:none}.fmulti{text-align:center}.fmulti #fsr{display:block;float:none}.fmulti #fuser{display:block;float:none}#fuserm{line-height:25px}#fsr{float:right;white-space:nowrap}#fsl{white-space:nowrap}#fsett{background:#fff;border:1px solid #999;bottom:30px;padding:10px 0;position:absolute;box-shadow:0 2px 4px rgba(0,0,0,0.2);box-shadow:0 2px 4px rgba(0,0,0,0.2);text-align:left;z-index:104}#fsett a{display:block;line-height:44px;padding:0 20px;text-decoration:none;white-space:nowrap}.p2Kmnc{padding:8px 16px;margin-right:10px}.B4GxFc{margin-left:166px}#fbar{background:#f2f2f2;border-top:1px solid #e4e4e4;line-height:40px;min-width:980px}.yBWvle{margin-left:166px}.fbar p,.fbar a,#fsettl,#fsett a{color:#5f6368}.fbar a:hover,#fsett a:hover{color:#333}.fbar{font-size:13px}#fuser{float:right}.smiUbb{margin-left:166px;line-height:15px;color:#5f6368;}</style><style>#fsl{margin-left:30px}#fsr{margin-right:30px}.fmulti #fsl{margin-left:0}.fmulti #fsr{margin-right:0}</style><div class=\"EvHmz hRvfYe\" id=\"fbar\"><div class=\"fbar\"><div class=\"b2hzT\"> <style>.b0KoTc{color:rgba(0,0,0,.54);padding-left:27px}.Q8LRLc{font-size:15px}.b0KoTc{margin-left:30px;text-align:left}</style>  <div class=\"b0KoTc\">   </div> </div><span id=\"fsr\"><a class=\"Fx4vi\" href=\"https://policies.google.com/privacy?fg=1\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://policies.google.com/privacy%3Ffg%3D1&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ8awCCA8\">隐私权</a><a class=\"Fx4vi\" href=\"https://policies.google.com/terms?fg=1\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://policies.google.com/terms%3Ffg%3D1&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQ8qwCCBA\">条款</a><span style=\"display:inline-block;position:relative\"><a class=\"Fx4vi\" href=\"https://www.google.com/preferences?hl=zh-CN\" id=\"fsettl\" aria-controls=\"fsett\" aria-expanded=\"false\" aria-haspopup=\"true\" role=\"button\" jsaction=\"foot.cst\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://www.google.com/preferences%3Fhl%3Dzh-CN&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQzq0CCBE\">设置</a><span id=\"fsett\" aria-labelledby=\"fsettl\" role=\"menu\" style=\"display:none\"><a href=\"https://www.google.com/preferences?hl=zh-CN&amp;fg=1\" role=\"menuitem\">搜索设置</a><a href=\"/advanced_search?hl=zh-CN&amp;fg=1\" role=\"menuitem\">高级搜索</a><a href=\"/history/privacyadvisor/search?utm_source=googlemenu&amp;fg=1\" role=\"menuitem\">您在 Google 搜索中的数据</a><a href=\"/history/optout?hl=zh-CN&amp;fg=1\" role=\"menuitem\">历史记录</a><a href=\"//support.google.com/websearch/?p=ws_results_help&amp;hl=zh-CN&amp;fg=1\" role=\"menuitem\">搜索帮助</a><a href=\"#\" data-bucket=\"websearch\" role=\"menuitem\" id=\"dk2qOd\" target=\"_blank\" jsaction=\"gf.sf\" data-ved=\"0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQLggS\">发送反馈</a></span></span></span><span id=\"fsl\"><a class=\"Fx4vi\" href=\"https://www.google.com/intl/zh-CN_zz/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpafooter&amp;fg=1\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://www.google.com/intl/zh-CN_zz/ads/%3Fsubid%3Dww-ww-et-g-awa-a-g_hpafoot1_1!o2%26utm_source%3Dgoogle.com%26utm_medium%3Dreferral%26utm_campaign%3Dgoogle_hpafooter%26fg%3D1&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQkdQCCBM\">广告</a><a class=\"Fx4vi\" href=\"https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&amp;utm_source=google.com&amp;utm_medium=referral&amp;utm_campaign=google_hpbfooter&amp;fg=1\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://www.google.com/services/%3Fsubid%3Dww-ww-et-g-awa-a-g_hpbfoot1_1!o2%26utm_source%3Dgoogle.com%26utm_medium%3Dreferral%26utm_campaign%3Dgoogle_hpbfooter%26fg%3D1&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQktQCCBQ\">商务</a><a class=\"Fx4vi\" href=\"https://www.google.com/intl/zh-CN_zz/about/?utm_source=google-ZZ&amp;utm_medium=referral&amp;utm_campaign=hp-footer&amp;fg=1\" ping=\"/url?sa=t&amp;rct=j&amp;source=webhp&amp;url=https://www.google.com/intl/zh-CN_zz/about/%3Futm_source%3Dgoogle-ZZ%26utm_medium%3Dreferral%26utm_campaign%3Dhp-footer%26fg%3D1&amp;ved=0ahUKEwiItKXjyuvkAhXE62EKHVfCD8AQkNQCCBU\">Google 大全</a><a class=\"Fx4vi\" href=\"//google.com/search/howsearchworks/?fg=1\">  Google 搜索的运作方式 </a></span></div></div></div>   </div></div><div id=\"footc\"><div id=\"xfoot\">  <script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">(function(){var u='/xjs/_/js/k\\x3dxjs.s.zh.Wq2FirVQW4I.O/ck\\x3dxjs.s.JsvW5WEO-1U.L.W.O/m\\x3dFkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff,d,csi/am\\x3dAgAAWATY7w4E-f8KAADgEwAABLgLNlggDoSKYXUgAg/d\\x3d1/dg\\x3d2/br\\x3d1/ct\\x3dzgms/rs\\x3dACT90oG84EcsUHO_rDRaXHFsPalW_vrYGw';setTimeout(function(){var a=document.createElement(\"script\");a.src=u;google.timers&&google.timers.load&&google.tick&&google.tick(\"load\",\"xjsls\");document.body.appendChild(a)},0);})();(function(){window.google.xjsu='/xjs/_/js/k\\x3dxjs.s.zh.Wq2FirVQW4I.O/ck\\x3dxjs.s.JsvW5WEO-1U.L.W.O/m\\x3dFkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff,d,csi/am\\x3dAgAAWATY7w4E-f8KAADgEwAABLgLNlggDoSKYXUgAg/d\\x3d1/dg\\x3d2/br\\x3d1/ct\\x3dzgms/rs\\x3dACT90oG84EcsUHO_rDRaXHFsPalW_vrYGw';})();function _DumpException(e){throw e;}\n" +
                "function _F_installCss(c){}\n" +
                "(function(){google.spjs=false;google.snet=true;google.em=[];google.emw=false;})();(function(){var " +
                "pmc='{\\x22/1S6iw\\x22:{},\\x22/nNC3A\\x22:{},\\x220pdxkA\\x22:{},\\x2210Kacw\\x22:{}," +
                  "\\x222kDaKA\\x22:{},\\x224RZUyg\\x22:{},\\x224q7JQg\\x22:{},\\x2263G1zA\\x22:{}," +
                   "\\x226A/KQA\\x22:{},\\x229CpKtw\\x22:{},\\x22A/Ucpg\\x22:{},\\x22BmJv2w\\x22:{}," +
                    "\\x22BzxUOg\\x22:{},\\x22C+zmgA\\x22:{},\\x22DDSUHw\\x22:{},\\x22Fkg7bd\\x22:{}," +
                "\\x22GDHetg\\x22:{},\\x22Gfzpng\\x22:{},\\x22HcFEGb\\x22:{},\\x22ITl3wQ\\x22:{}," +
                "\\x22IvlUe\\x22:{},\\x22Iz7bbg\\x22:{},\\x22J90jvw\\x22:{},\\x22MC8mtf\\x22:{}," +
                "\\x22NZvGvg\\x22:{},\\x22NpA8BQ\\x22:{},\\x22OF7gzc\\x22:{},\\x22OPd5MQ\\x22:{}," +
                "\\x22PUB9yA\\x22:{},\\x22RLN7pw\\x22:{},\\x22RMhBfe\\x22:{},\\x22RWGcrA\\x22:{}," +
                         "\\x22SnP02w\\x22:{},\\x22T4BAC\\x22:{},\\x22TI0G6A\\x22:{},\\x22TJw5qb\\x22:{}," +
                "\\x22TbaHGc\\x22:{},\\x22U5B21g\\x22:{},\\x22XLoAlg\\x22:{},\\x22XiiKIQ\\x22:{}," +
                           "\\x22Y33vzc\\x22:{},\\x22YFCs/g\\x22:{},\\x22YQeDTA\\x22:{},\\x22ZI/YVQ\\x22:{}," +
                            "\\x22aQRXjA\\x22:{},\\x22aa\\x22:{},\\x22abd\\x22:{\\x22abd\\x22:false," +
                "\\x22deb\\x22:false,\\x22det\\x22:false},\\x22async\\x22:{},\\x22bnhGTQ\\x22:{}," +
                              "\\x22c+PT4g\\x22:{},\\x22cdos\\x22:{\\x22cdobsel\\x22:false},\\x22cm4D8w\\x22:{}," +
                "\\x22csi\\x22:{},\\x22d\\x22:{},\\x22ddls\\x22:{}," +
                "\\x22dvl\\x22:{\\x22cookie_secure\\x22:true,\\x22cookie_timeout\\x22:86400," +
                "\\x22jsc\\x22:\\x22[null,null,null,30000,null,null,null,2,null,null,null,null,null," +
                                  "null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null," +
                                   "null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null," +
                "null,[\\\\\\x2286400000\\\\\\x22,\\\\\\x22604800000\\\\\\x22,2.0]\\\\n,null," +
                "1]\\\\n\\x22,\\x22msg_err\\x22:\\x22无法获取位置信息\\x22,\\x22msg_gps\\x22:\\x22使用 " +
                                      "GPS\\x22,\\x22msg_unk\\x22:\\x22未知\\x22,\\x22msg_upd\\x22:\\x22更新位置信息\\x22," +
                "\\x22msg_use\\x22:\\x22使用确切位置\\x22},\\x22eHsZNA\\x22:{},\\x22f4UHsg\\x22:{}," +
                                        "\\x22flRZRg\\x22:{},\\x22foot\\x22:{\\x22pf\\x22:true,\\x22po\\x22:false," +
                                         "\\x22qe\\x22:false},\\x22fyL1Mg\\x22:{},\\x22gf\\x22:{\\x22pid\\x22:196}," +
                                          "\\x22hmvvig\\x22:{},\\x22hsm\\x22:{},\\x22iDPoPb\\x22:{}," +
                                           "\\x22jZXiHA\\x22:{},\\x22jsG33w\\x22:{}," +
                "\\x22jsa\\x22:{\\x22csi\\x22:true,\\x22csir\\x22:100}," +
                "\\x22k9pyPA\\x22:{},\\x22llc\\x22:{},\\x22lu\\x22:{},\\x22m\\x22:{}," +
                                              "\\x22mUpTid\\x22:{},\\x22mVopag\\x22:{}," +
                "\\x22mu\\x22:{\\x22murl\\x22:\\x22https://adservice.google" +
                ".com/adsid/google/ui\\x22},\\x22mvYTse\\x22:{},\\x22puoTkg\\x22:{}," +
 "\\x22sb_wiz\\x22:{\\x22rfs\\x22:[]," +
                                                  "\\x22stok\\x22:\\x22moDvLCmhkgWLL9TEe4xc5ZN5NHQ\\x22}," +
                                                   "\\x22sf\\x22:{},\\x22sonic\\x22:{}," +
                                                    "\\x22spch\\x22:{\\x22ae\\x22:\\x22请检查您的麦克风。\\\\u003Ca " +
                                                     "href\\x3d\\\\\\x22https://support.google" +
                                                      ".com/chrome/?p\\x3dui_voice_search\\\\\\x22 " +
                "target\\x3d\\\\\\x22_blank\\\\\\x22\\\\u003E了解详情\\\\u003C/a" +
                                                        "\\\\u003E\\x22,\\x22hl\\x22:\\x22zh-Hans\\x22," +
                                                         "\\x22im\\x22:\\x22点击\\\\u003Cb\\\\u003E允许\\\\u003C/b" +
                                                          "\\\\u003E开始语音搜索\\x22,\\x22iw\\x22:\\x22正在等待...\\x22," +
                                                           "\\x22lm\\x22:\\x22正在收听…\\x22," +
                                                            "\\x22lu\\x22:\\x22目前尚未提供%1$s版语音搜索服务\\x22," +
                                                             "\\x22mb\\x22:false,\\x22ne\\x22:\\x22未连接到互联网\\x22," +
                "\\x22nt\\x22:\\x22不确定所说内容，\\\\u003Cspan\\\\u003E" +
                                                               "请重试\\\\u003C/span\\\\u003E\\x22," +
                                                                "\\x22nv\\x22:\\x22请检查您的麦克风和音频电平。\\\\u003Ca " +
                                                                 "href\\x3d\\\\\\x22https://support.google" +
                ".com/chrome/?p\\x3dui_voice_search\\\\\\x22 " +
                                                                   "target\\x3d\\\\\\x22_blank\\\\\\x22\\\\u003E" +
                                                                    "了解详情\\\\u003C/a\\\\u003E\\x22," +
                "\\x22pe\\x22:\\x22语音搜索功能处于关闭状态。\\\\u003Ca " +
                "href\\x3d\\\\\\x22https://support.google" +
                                                                       ".com/chrome/?p\\x3dui_voice_search\\\\\\x22 " +
                "target\\x3d\\\\\\x22_blank\\\\\\x22\\\\u003E" +
                                                                         "详细信息\\\\u003C/a\\\\u003E\\x22," +
                                                                          "\\x22rm\\x22:\\x22请开始说话\\x22}," +
                                                                           "\\x22su1rvw\\x22:{},\\x22swWDGA\\x22:{}," +
                                                                            "\\x22tg8oTe\\x22:{},\\x22uz938c\\x22:{}," +
                                                                             "\\x22v52Mdg\\x22:{}," +
                                                                              "\\x22vFi3Gw\\x22:{}," +
                                                                               "\\x22vWNDde\\x22:{}," +
                                                                                "\\x22ws9Tlc\\x22:{}," +
                                                                                 "\\x22yQ43ff\\x22:{}," +
                                                                                  "\\x22zobSAA\\x22:{}}';google" +
                                                                                   ".pmc=JSON.parse(pmc);})();" +
                                                                                    "(function(){var r=['sb_wiz'," +
                                                                                     "'aa','abd','async','dvl'," +
                                                                                      "'foot','lu','m','mUpTid','mu'," +
                                                                                       "'sf','sonic','spch'];google" +
                                                                                        ".plm(r);})();(function(){var" +
                " m=['CB0Pik'," +
                                                                                          "'[\\x22psy-ab\\x22," +
                                                                                           "\\x22gws-wiz\\x22," +
                "\\x22\\x22,\\x22\\x22," +
                "null,0,0,null,0,11," +
                                                                                              "\\x22zh-CN\\x22," +
                                                                                               "\\x22\\x22," +
                                                                                                "\\x22\\x22," +
                                                                                                 "\\x22IimLXYibGcTXhwPXhL-ADA\\x22,0,\\x22zh-CN\\x22,null,null,null,null,null,3,null,0,5,null,null,null,null,null,0,0,0,null,null,null,null,-1,null,0,null,0,0,\\x22\\x22,0,null,0,\\x22\\x22]\\n','CB0Pio','[null,null,1,30000,null,null,null,2,null,null,3,null,null,null,null,null,1,null,null,null,null,null,null,null,null,null,null,null,0,null,null,null,null,null,null,null,null,\\x221569401122\\x22,null,null,null,null,null,1,null,null,[\\x2286400000\\x22,\\x22604800000\\x22,2.0]\\n,null,1]\\n'];var a=m;window.W_jd=window.W_jd||{};for(var b=0;b<a.length;b+=2)window.W_jd[a[b]]=JSON.parse(a[b+1]);})();(function(){window.WIZ_global_data={\"Yllh3e\":\"%.@.1569401122413064,174189508,3222258263]\\n\",\"zChJod\":\"%.@.]\\n\",\"pxO4Zd\":\"0\",\"GWsdKe\":\"zh-Hans\",\"SIsrTd\":\"false\",\"LU5fGb\":\"false\",\"w2btAe\":\"%.@.\\\"105250506097979753968\\\",\\\"105250506097979753968\\\",\\\"0\\\",null,null,null,1]\\n\",\"mXOY5d\":\"%.@.]\\n\",\"SsQ4x\":\"oqM4gvmDpObPXEhX9c/FOA\\u003d\\u003d\"};})();google.x(null, function(){(function(){(function(){google.csct={};google.csct.ps='AOvVaw2UwsDi9L0UMZsij_O_neQ3\\x26ust\\x3d1569487522446087';})();})();(function(){(function(){google.csct.pi=true;})();})();(function(){google.drty&&google.drty();})();});</script></div></div><div id=\"lb\"></div></div><script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">this.gbar_=this.gbar_||{};(function(_){var window=this;\n" +
                "try{\n" +
                "var ad,ed,hd,jd,od,wd,xd,yd,zd,Ad,Bd,Cd,Ld,Md,Od;_.Tc=function(a){return void 0!==a};_.Uc=function" +
                 "(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var d=c.slice();d.push.apply" +
                  "(d,arguments);return a.apply(this,d)}};_.Vc=function(a){a&&\"function\"==typeof a.ga&&a.ga()};_" +
                ".Wc=function(a,b){b=_.Uc(_.Vc,b);a.za?_.Tc(void 0)?b.call(void 0):b():(a.jb||(a.jb=[]),a.jb.push" +
                    "(_.Tc(void 0)?(0,_.p)(b,void 0):b))};\n" +
                "_.L=function(a,b){a.prototype=(0,_.ca)(b.prototype);a.prototype.constructor=a;if(_.ia)(0,_.ia)(a,b);" +
                 "else for(var c in b)if(\"prototype\"!=c)if(Object.defineProperties){var d=Object" +
                ".getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.M=b.prototype};_" +
                   ".Xc=function(a){var b=_.Ba(a);return\"array\"==b||\"object\"==b&&\"number\"==typeof a.length};_" +
                    ".Yc=function(a){return\"function\"==_.Ba(a)};_.Zc=function(a){var b=typeof a;" +
                "return\"object\"==b&&null!=a||\"function\"==b};\n" +
                "ad=function(a){a:{var b=$c;for(var c=a.length,d=_.wa(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b" +
                 ".call(void 0,d[e],e,a)){b=e;break a}b=-1}return 0>b?null:_.wa(a)?a.charAt(b):a[b]};_.bd=function(a," +
                  "b){return 0<=(0,_.Ka)(a,b)};_.dd=function(a,b){b=(0,_.Ka)(a,b);var c;(c=0<=b)&&Array.prototype" +
                   ".splice.call(a,b,1);return c};ed=function(a){return Array.prototype.concat.apply([],arguments)};_" +
                ".fd=function(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return " +
                "c}return[]};\n" +
                "_.gd=function(a,b,c){for(var d in a)b.call(c,a[d],d,a)};hd=function(a,b){for(var c in a)if(b.call" +
                 "(void 0,a[c],c,a))return!0;return!1};_.id=function(a){var b=[],c=0,d;for(d in a)b[c++]=d;return b};" +
                  "jd=\"constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString " +
                   "valueOf\".split(\" \");_.kd=function(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];" +
                    "for(c in d)a[c]=d[c];for(var f=0;f<jd.length;f++)c=jd[f],Object.prototype.hasOwnProperty.call(d," +
                     "c)&&(a[c]=d[c])}};\n" +
                "_.ld=function(a){return _.Ra(_.Qa.V(),a)};_.md=function(a){return a instanceof _.fb&&a" +
                ".constructor===_.fb&&a.w===_.eb?a.o:\"type_error:Const\"};_.nd={};od={};_.pd=function(a,b,c){this" +
 ".w=a===_.nd&&b||\"\";this.A=a===_.nd&&c||null;this.B=od};_.pd.prototype.zb=!0;_.pd.prototype" +
                   ".kb=function(){return this.w.toString()};_.pd.prototype.le=!0;_.pd.prototype.o=function(){return " +
                    "1};_.rd=function(a){return _.qd(a).toString()};\n" +
                "_.qd=function(a){if(a instanceof _.pd&&a.constructor===_.pd&&a.B===od)return a.w;_.Ba(a);" +
                "return\"type_error:TrustedResourceUrl\"};_.sd=function(a){return a.A?a.A:_.rd(a)};_.td=function(a)" +
                  "{return new _.pd(_.nd,_.md(a),null)};_.ud=function(a,b){return 0==a.lastIndexOf(b,0)};_" +
                   ".vd=function(a){return/^[\\s\\xa0]*$/.test(a)};wd=/&/g;xd=/</g;yd=/>/g;zd=/\"/g;Ad=/'/g;" +
                    "Bd=/\\x00/g;Cd=/[\\x00&<>\"']/;\n" +
                "_.Dd=function(a,b){if(b)a=a.replace(wd,\"&amp;\").replace(xd,\"&lt;\").replace(yd,\"&gt;\").replace" +
                 "(zd,\"&quot;\").replace(Ad,\"&#39;\").replace(Bd,\"&#0;\");else{if(!Cd.test(a))return a;-1!=a" +
                ".indexOf(\"&\")&&(a=a.replace(wd,\"&amp;\"));-1!=a.indexOf(\"<\")&&(a=a.replace(xd,\"&lt;\"));" +
 "-1!=a.indexOf(\">\")&&(a=a.replace(yd,\"&gt;\"));-1!=a.indexOf('\"')&&(a=a.replace(zd,\"&quot;\")" +
                    ");-1!=a.indexOf(\"'\")&&(a=a.replace(Ad,\"&#39;\"));-1!=a.indexOf(\"\\x00\")&&(a=a.replace(Bd," +
                     "\"&#0;\"))}return a};\n" +
                "_.Ed=function(a){if(a instanceof _.nb)return a;a=\"object\"==typeof a&&a.zb?a.kb():String(a);_.pb" +
                ".test(a)||(a=\"about:invalid#zClosurez\");return new _.nb(_.lb,a)};_.Fd=function(a,b){a.src=_.sd(b)" +
                "};_.Gd=function(a){return encodeURIComponent(String(a))};_.Hd=function(a){return a=_.Dd(a,void 0)" +
                   "};_.Id=function(a){var b=Number(a);return 0==b&&_.vd(a)?NaN:b};_.Jd=function(a,b){try{return _.Kb" +
                    "(a[b]),!0}catch(c){}return!1};Ld=function(){this.o=Kd};Ld.prototype.w=function(){return!!this" +
                ".o};\n" +
                "Md={cellpadding:\"cellPadding\",cellspacing:\"cellSpacing\",colspan:\"colSpan\"," +
                 "frameborder:\"frameBorder\",height:\"height\",maxlength:\"maxLength\",nonce:\"nonce\"," +
                  "role:\"role\",rowspan:\"rowSpan\",type:\"type\",usemap:\"useMap\",valign:\"vAlign\"," +
                "width:\"width\"};_.Nd=function(a,b){_.gd(b,function(c,d){c&&\"object\"==typeof c&&c.zb&&(c=c.kb()" +
                    ");\"style\"==d?a.style.cssText=c:\"class\"==d?a.className=c:\"for\"==d?a.htmlFor=c:Md" +
                     ".hasOwnProperty(d)?a.setAttribute(Md[d],c):_.ud(d,\"aria-\")||_.ud(d,\"data-\")?a.setAttribute" +
                      "(d,c):a[d]=c})};\n" +
                "Od=function(a){if(a&&\"number\"==typeof a.length){if(_.Zc(a))return\"function\"==typeof a" +
                 ".item||\"string\"==typeof a.item;if(_.Yc(a))return\"function\"==typeof a.item}return!1};_" +
                ".Pd=function(a,b,c,d){function e(g){g&&b.appendChild(_.wa(g)?a.createTextNode(g):g)}for(;d<c" +
                   ".length;d++){var f=c[d];!_.Xc(f)||_.Zc(f)&&0<f.nodeType?e(f):(0,_.La)(Od(f)?_.fd(f):f,e)}};\n" +
                "_.Qd=function(a,b){var c=String(b[0]),d=b[1];if(!_.Mc&&d&&(d.name||d.type)){c=[\"<\",c];d.name&&c" +
                ".push(' name=\"',_.Hd(d.name),'\"');if(d.type){c.push(' type=\"',_.Hd(d.type),'\"');var e={};_.kd" +
                  "(e,d);delete e.type;d=e}c.push(\">\");c=c.join(\"\")}c=a.createElement(c);d&&(_.wa(d)?c" +
                ".className=d:_.Ca(d)?c.className=d.join(\" \"):_.Nd(c,d));2<b.length&&_.Pd(a,c,b,2);return c};_" +
                    ".Rd=function(a){_.z(this,a,0,-1,null,null)};_.t(_.Rd,_.y);\n" +
                "var Td;_.Sd=function(a){this.o=a||{cookie:\"\"}};_.k=_.Sd.prototype;_.k.set=function(a,b,c,d,e,f){if" +
                 "(/[;=\\s]/.test(a))throw Error(\"p`\"+a);if(/[;\\r\\n]/.test(b))throw Error(\"q`\"+b);_.Tc(c)||" +
                  "(c=-1);e=e?\";domain=\"+e:\"\";d=d?\";path=\"+d:\"\";f=f?\";secure\":\"\";c=0>c?\"\":0==c?\";" +
                   "expires=\"+(new Date(1970,1,1)).toUTCString():\";expires=\"+(new Date((0,_.Ga)()+1E3*c))" +
                    ".toUTCString();this.o.cookie=a+\"=\"+b+e+d+c+f};\n" +
                "_.k.get=function(a,b){for(var c=a+\"=\",d=(this.o.cookie||\"\").split(\";\"),e=0,f;e<d.length;e++)" +
                 "{f=(0,_.ib)(d[e]);if(0==f.lastIndexOf(c,0))return f.substr(c.length);if(f==a)return\"\"}return b};_" +
                  ".k.remove=function(a,b,c){var d=_.Tc(this.get(a));this.set(a,\"\",0,b,c);return d};_.k.Za=function" +
                   "(){return Td(this).keys};_.k.ab=function(){return Td(this).values};_.k.Hc=function(){return!this" +
                    ".o.cookie};_.k.clear=function(){for(var a=Td(this).keys,b=a.length-1;0<=b;b--)this.remove(a[b])" +
                     "};\n" +
                "Td=function(a){a=(a.o.cookie||\"\").split(\";\");for(var b=[],c=[],d,e,f=0;f<a.length;f++)e=(0,_.ib)" +
                 "(a[f]),d=e.indexOf(\"=\"),-1==d?(b.push(\"\"),c.push(e)):(b.push(e.substring(0,d)),c.push(e" +
                  ".substring(d+1)));return{keys:b,values:c}};_.Ud=new _.Sd(\"undefined\"==typeof " +
                   "document?null:document);\n" +
                "var Vd=function(a,b){this.A=a;this.B=b;this.w=0;this.o=null};Vd.prototype.get=function(){if(0<this" +
                 ".w){this.w--;var a=this.o;this.o=a.next;a.next=null}else a=this.A();return a};var Wd=function(a,b)" +
                  "{a.B(b);100>a.w&&(a.w++,b.next=a.o,a.o=b)};\n" +
                "var Xd=function(a){_.n.setTimeout(function(){throw a;},0)},Yd,Zd=function(){var a=_.n" +
                 ".MessageChannel;\"undefined\"===typeof a&&\"undefined\"!==typeof window&&window.postMessage&&window" +
                  ".addEventListener&&!_.v(\"Presto\")&&(a=function(){var e=document.createElement(\"IFRAME\");e" +
                   ".style.display=\"none\";_.Fd(e,_.td(_.hb));document.documentElement.appendChild(e);var f=e" +
 ".contentWindow;e=f.document;e.open();e.write(_.Cb(_.Fb));e.close();var g=\"callImmediate\"+Math" +
                ".random(),h=\"file:\"==f.location.protocol?\"*\":f.location.protocol+\n" +
                "\"//\"+f.location.host;e=(0,_.p)(function(l){if((\"*\"==h||l.origin==h)&&l.data==g)this.port1" +
                 ".onmessage()},this);f.addEventListener(\"message\",e,!1);this.port1={};this" +
                  ".port2={postMessage:function(){f.postMessage(g,h)}}});if(\"undefined\"!==typeof a&&!_.xb()){var " +
                   "b=new a,c={},d=c;b.port1.onmessage=function(){if(_.Tc(c.next)){c=c.next;var e=c.Ve;c.Ve=null;e()" +
                    "}};return function(e){d.next={Ve:e};d=d.next;b.port2.postMessage(0)" +
                     "}}return\"undefined\"!==typeof document&&\"onreadystatechange\"in document.createElement" +
                      "(\"SCRIPT\")?\n" +
                "function(e){var f=document.createElement(\"SCRIPT\");f.onreadystatechange=function(){f" +
                 ".onreadystatechange=null;f.parentNode.removeChild(f);f=null;e();e=null};document.documentElement" +
                  ".appendChild(f)}:function(e){_.n.setTimeout(e,0)}};\n" +
                "var $d=function(){this.w=this.o=null},be=new Vd(function(){return new ae},function(a){a.reset()});$d" +
                 ".prototype.add=function(a,b){var c=be.get();c.set(a,b);this.w?this.w.next=c:this.o=c;this.w=c};$d" +
                  ".prototype.remove=function(){var a=null;this.o&&(a=this.o,this.o=this.o.next,this.o||(this.w=null)" +
                ",a.next=null);return a};var ae=function(){this.next=this.scope=this.yb=null};ae.prototype" +
                    ".set=function(a,b){this.yb=a;this.scope=b;this.next=null};\n" +
                "ae.prototype.reset=function(){this.next=this.scope=this.yb=null};\n" +
                "var ce,de,ee,fe,he;_.ge=function(a,b){ce||de();ee||(ce(),ee=!0);fe.add(a,b)};de=function(){if(_.n" +
                 ".Promise&&_.n.Promise.resolve){var a=_.n.Promise.resolve(void 0);ce=function(){a.then(he)}}else " +
                  "ce=function(){var b=he;!_.Yc(_.n.setImmediate)||_.n.Window&&_.n.Window.prototype&&!_.v(\"Edge\")" +
                   "&&_.n.Window.prototype.setImmediate==_.n.setImmediate?(Yd||(Yd=Zd()),Yd(b)):_.n.setImmediate(b)" +
                    "}};ee=!1;fe=new $d;he=function(){for(var a;a=fe.remove();){try{a.yb.call(a.scope)}catch(b){Xd(b)" +
                     "}Wd(be,a)}ee=!1};\n" +
                "var je,ke,le;_.ie=!_.x||_.jc(9);je=!_.x||_.jc(9);ke=_.x&&!_.hc(\"9\");le=function(){if(!_.n" +
                 ".addEventListener||!Object.defineProperty)return!1;var a=!1,b=Object.defineProperty({},\"passive\"," +
                  "{get:function(){a=!0}});try{_.n.addEventListener(\"test\",_.za,b),_.n.removeEventListener" +
                   "(\"test\",_.za,b)}catch(c){}return a}();\n" +
                "_.me=function(a,b){this.type=a;this.o=this.target=b;this.w=!1;this.dg=!0};_.me.prototype" +
                 ".stopPropagation=function(){this.w=!0};_.me.prototype.preventDefault=function(){this.dg=!1};\n" +
                "_.ne=_.Rb?\"webkitTransitionEnd\":_.Nb?\"otransitionend\":\"transitionend\";\n" +
                "_.oe=function(a,b){_.me.call(this,a?a.type:\"\");this.relatedTarget=this.o=this.target=null;this" +
                 ".button=this.screenY=this.screenX=this.clientY=this.clientX=0;this.key=\"\";this.A=this.keyCode=0;" +
                "this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this.state=null;this.pointerId=0;this" +
                ".pointerType=\"\";this.Oa=null;a&&this.init(a,b)};_.t(_.oe,_.me);var pe={2:\"touch\",3:\"pen\"," +
                    "4:\"mouse\"};\n" +
                "_.oe.prototype.init=function(a,b){var c=this.type=a.type,d=a.changedTouches&&a.changedTouches" +
                ".length?a.changedTouches[0]:null;this.target=a.target||a.srcElement;this.o=b;(b=a.relatedTarget)?_" +
                  ".Qb&&(_.Jd(b,\"nodeName\")||(b=null)):\"mouseover\"==c?b=a.fromElement:\"mouseout\"==c&&(b=a" +
                   ".toElement);this.relatedTarget=b;d?(this.clientX=void 0!==d.clientX?d.clientX:d.pageX,this" +
                    ".clientY=void 0!==d.clientY?d.clientY:d.pageY,this.screenX=d.screenX||0,this.screenY=d" +
                     ".screenY||0):(this.clientX=void 0!==a.clientX?a.clientX:\n" +
                "a.pageX,this.clientY=void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a.screenX||0,this.screenY=a" +
                 ".screenY||0);this.button=a.button;this.keyCode=a.keyCode||0;this.key=a.key||\"\";this.A=a" +
                  ".charCode||(\"keypress\"==c?a.keyCode:0);this.ctrlKey=a.ctrlKey;this.altKey=a.altKey;this" +
                   ".shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.pointerId=a.pointerId||0;this.pointerType=_.wa(a" +
                    ".pointerType)?a.pointerType:pe[a.pointerType]||\"\";this.state=a.state;this.Oa=a;a" +
                     ".defaultPrevented&&this.preventDefault()};\n" +
                "_.oe.prototype.stopPropagation=function(){_.oe.M.stopPropagation.call(this);this.Oa" +
                ".stopPropagation?this.Oa.stopPropagation():this.Oa.cancelBubble=!0};_.oe.prototype" +
                  ".preventDefault=function(){_.oe.M.preventDefault.call(this);var a=this.Oa;if(a.preventDefault)a" +
                   ".preventDefault();else if(a.returnValue=!1,ke)try{if(a.ctrlKey||112<=a.keyCode&&123>=a.keyCode)a" +
                    ".keyCode=-1}catch(b){}};\n" +
                "var se;_.qe=\"closure_listenable_\"+(1E6*Math.random()|0);_.re=function(a){return!(!a||!a[_.qe])};" +
                "se=0;\n" +
                "var te=function(a,b,c,d,e){this.listener=a;this.o=null;this.src=b;this.type=c;this.capture=!!d;this" +
                 ".pd=e;this.key=++se;this.kc=this.Uc=!1},ue=function(a){a.kc=!0;a.listener=null;a.o=null;a.src=null;" +
                  "a.pd=null};\n" +
                "var ve=function(a){this.src=a;this.o={};this.w=0};ve.prototype.add=function(a,b,c,d,e){var f=a" +
                 ".toString();a=this.o[f];a||(a=this.o[f]=[],this.w++);var g=xe(a,b,d,e);-1<g?(b=a[g],c||(b.Uc=!1)):" +
                "(b=new te(b,this.src,f,!!d,e),b.Uc=c,a.push(b));return b};ve.prototype.remove=function(a,b,c,d)" +
                   "{a=a.toString();if(!(a in this.o))return!1;var e=this.o[a];b=xe(e,b,c,d);return-1<b?(ue(e[b])," +
                    "Array.prototype.splice.call(e,b,1),0==e.length&&(delete this.o[a],this.w--),!0):!1};\n" +
                "var ye=function(a,b){var c=b.type;if(!(c in a.o))return!1;var d=_.dd(a.o[c],b);d&&(ue(b),0==a.o[c]" +
                 ".length&&(delete a.o[c],a.w--));return d};ve.prototype.$b=function(a,b){a=this.o[a.toString()];var " +
                  "c=[];if(a)for(var d=0;d<a.length;++d){var e=a[d];e.capture==b&&c.push(e)}return c};ve.prototype" +
                ".Mb=function(a,b,c,d){a=this.o[a.toString()];var e=-1;a&&(e=xe(a,b,c,d));return-1<e?a[e]:null};\n" +
                "ve.prototype.hasListener=function(a,b){var c=_.Tc(a),d=c?a.toString():\"\",e=_.Tc(b);return hd(this" +
                 ".o,function(f){for(var g=0;g<f.length;++g)if(!(c&&f[g].type!=d||e&&f[g].capture!=b))return!0;" +
                "return!1})};var xe=function(a,b,c,d){for(var e=0;e<a.length;++e){var f=a[e];if(!f.kc&&f" +
                   ".listener==b&&f.capture==!!c&&f.pd==d)return e}return-1};\n" +
                "var ze,Ae,Be,Ee,Ge,He,Me,Le,Ie,Ne;ze=\"closure_lm_\"+(1E6*Math.random()|0);Ae={};Be=0;_.N=function" +
                 "(a,b,c,d,e){if(d&&d.once)return _.Ce(a,b,c,d,e);if(_.Ca(b)){for(var f=0;f<b.length;f++)_.N(a,b[f]," +
                  "c,d,e);return null}c=_.De(c);return _.re(a)?a.K(b,c,_.Zc(d)?!!d.capture:!!d,e):Ee(a,b,c,!1,d,e)};" +
                   "\n" +
                "Ee=function(a,b,c,d,e,f){if(!b)throw Error(\"r\");var g=_.Zc(e)?!!e.capture:!!e,h=_.Fe(a);h||" +
                 "(a[ze]=h=new ve(a));c=h.add(b,c,d,g,f);if(c.o)return c;d=Ge();c.o=d;d.src=a;d.listener=c;if(a" +
                  ".addEventListener)le||(e=g),void 0===e&&(e=!1),a.addEventListener(b.toString(),d,e);else if(a" +
                   ".attachEvent)a.attachEvent(He(b.toString()),d);else if(a.addListener&&a.removeListener)a" +
                    ".addListener(d);else throw Error(\"s\");Be++;return c};\n" +
                "Ge=function(){var a=Ie,b=je?function(c){return a.call(b.src,b.listener,c)}:function(c){c=a.call(b" +
                 ".src,b.listener,c);if(!c)return c};return b};_.Ce=function(a,b,c,d,e){if(_.Ca(b)){for(var f=0;f<b" +
                  ".length;f++)_.Ce(a,b[f],c,d,e);return null}c=_.De(c);return _.re(a)?a.fb(b,c,_.Zc(d)?!!d" +
                   ".capture:!!d,e):Ee(a,b,c,!0,d,e)};_.Je=function(a,b,c,d,e){if(_.Ca(b))for(var f=0;f<b.length;f++)" +
                    "_.Je(a,b[f],c,d,e);else d=_.Zc(d)?!!d.capture:!!d,c=_.De(c),_.re(a)?a.qa(b,c,d,e):a&&(a=_.Fe(a))" +
                "&&(b=a.Mb(b,c,d,e))&&_.Ke(b)};\n" +
                "_.Ke=function(a){if(_.xa(a)||!a||a.kc)return!1;var b=a.src;if(_.re(b))return b.Mc(a);var c=a.type," +
                 "d=a.o;b.removeEventListener?b.removeEventListener(c,d,a.capture):b.detachEvent?b.detachEvent(He(c)," +
                  "d):b.addListener&&b.removeListener&&b.removeListener(d);Be--;(c=_.Fe(b))?(ye(c,a),0==c.w&&(c" +
                   ".src=null,b[ze]=null)):ue(a);return!0};He=function(a){return a in Ae?Ae[a]:Ae[a]=\"on\"+a};\n" +
                "Me=function(a,b,c,d){var e=!0;if(a=_.Fe(a))if(b=a.o[b.toString()])for(b=b.concat(),a=0;a<b.length;" +
                 "a++){var f=b[a];f&&f.capture==c&&!f.kc&&(f=Le(f,d),e=e&&!1!==f)}return e};Le=function(a,b){var c=a" +
                  ".listener,d=a.pd||a.src;a.Uc&&_.Ke(a);return c.call(d,b)};\n" +
                "Ie=function(a,b){if(a.kc)return!0;if(!je){var c=b||_.ya(\"window.event\");b=new _.oe(c,this);var " +
                 "d=!0;if(!(0>c.keyCode||void 0!=c.returnValue)){a:{var e=!1;if(0==c.keyCode)try{c.keyCode=-1;break " +
                  "a}catch(g){e=!0}if(e||void 0==c.returnValue)c.returnValue=!0}c=[];for(e=b.o;e;e=e.parentNode)c" +
                   ".push(e);a=a.type;for(e=c.length-1;!b.w&&0<=e;e--){b.o=c[e];var f=Me(c[e],a,!0,b);d=d&&f}for(e=0;" +
                    "!b.w&&e<c.length;e++)b.o=c[e],f=Me(c[e],a,!1,b),d=d&&f}return d}return Le(a,new _.oe(b,this))};" +
                     "\n" +
                "_.Fe=function(a){a=a[ze];return a instanceof ve?a:null};Ne=\"__closure_events_fn_\"+(1E9*Math.random" +
                 "()>>>0);_.De=function(a){if(_.Yc(a))return a;a[Ne]||(a[Ne]=function(b){return a.handleEvent(b)});" +
                  "return a[Ne]};\n" +
                "_.Oe=function(a){_.u.call(this);this.Y=a;this.T={}};_.t(_.Oe,_.u);var Pe=[];_.Oe.prototype" +
                 ".K=function(a,b,c,d){return Qe(this,a,b,c,d)};_.Oe.prototype.A=function(a,b,c,d,e){return Qe(this," +
                  "a,b,c,d,e)};var Qe=function(a,b,c,d,e,f){_.Ca(c)||(c&&(Pe[0]=c.toString()),c=Pe);for(var g=0;g<c" +
                   ".length;g++){var h=_.N(b,c[g],d||a.handleEvent,e||!1,f||a.Y||a);if(!h)break;a.T[h.key]=h}return " +
                    "a};_.Oe.prototype.fb=function(a,b,c,d){return Re(this,a,b,c,d)};\n" +
                "var Re=function(a,b,c,d,e,f){if(_.Ca(c))for(var g=0;g<c.length;g++)Re(a,b,c[g],d,e,f);else{b=_.Ce(b," +
                "c,d||a.handleEvent,e,f||a.Y||a);if(!b)return a;a.T[b.key]=b}return a};_.Oe.prototype.qa=function(a," +
                  "b,c,d,e){if(_.Ca(b))for(var f=0;f<b.length;f++)this.qa(a,b[f],c,d,e);else c=c||this.handleEvent," +
                   "d=_.Zc(d)?!!d.capture:!!d,e=e||this.Y||this,c=_.De(c),d=!!d,b=_.re(a)?a.Mb(b,c,d,e):a?(a=_.Fe(a))" +
 "?a.Mb(b,c,d,e):null:null,b&&(_.Ke(b),delete this.T[b.key]);return this};\n" +
                "_.Se=function(a){_.gd(a.T,function(b,c){this.T.hasOwnProperty(c)&&_.Ke(b)},a);a.T={}};_.Oe.prototype" +
                 ".S=function(){_.Oe.M.S.call(this);_.Se(this)};_.Oe.prototype.handleEvent=function(){throw Error" +
                  "(\"t\");};\n" +
                "_.O=function(){_.u.call(this);this.sb=new ve(this);this.tg=this;this.ze=null};_.t(_.O,_.u);_.O" +
                 ".prototype[_.qe]=!0;_.k=_.O.prototype;_.k.ed=function(){return this.ze};_.k.Ie=function(a){this" +
                  ".ze=a};_.k.addEventListener=function(a,b,c,d){_.N(this,a,b,c,d)};_.k.removeEventListener=function" +
                   "(a,b,c,d){_.Je(this,a,b,c,d)};\n" +
                "_.k.dispatchEvent=function(a){var b,c=this.ed();if(c)for(b=[];c;c=c.ed())b.push(c);c=this.tg;var d=a" +
                ".type||a;if(_.wa(a))a=new _.me(a,c);else if(a instanceof _.me)a.target=a.target||c;else{var e=a;" +
                  "a=new _.me(d,c);_.kd(a,e)}e=!0;if(b)for(var f=b.length-1;!a.w&&0<=f;f--){var g=a.o=b[f];e=g.Yb(d," +
                   "!0,a)&&e}a.w||(g=a.o=c,e=g.Yb(d,!0,a)&&e,a.w||(e=g.Yb(d,!1,a)&&e));if(b)for(f=0;!a.w&&f<b.length;" +
                    "f++)g=a.o=b[f],e=g.Yb(d,!1,a)&&e;return e};_.k.S=function(){_.O.M.S.call(this);this.Ed();this" +
 ".ze=null};\n" +
                "_.k.K=function(a,b,c,d){return this.sb.add(String(a),b,!1,c,d)};_.k.fb=function(a,b,c,d){return this" +
                 ".sb.add(String(a),b,!0,c,d)};_.k.qa=function(a,b,c,d){return this.sb.remove(String(a),b,c,d)};_.k" +
                  ".Mc=function(a){return ye(this.sb,a)};_.k.Ed=function(a){if(this.sb){var b=this.sb;a=a&&a.toString" +
                   "();var c=0,d;for(d in b.o)if(!a||d==a){for(var e=b.o[d],f=0;f<e.length;f++)++c,ue(e[f]);delete b" +
                ".o[d];b.w--}b=c}else b=0;return b};\n" +
                "_.k.Yb=function(a,b,c){a=this.sb.o[String(a)];if(!a)return!0;a=a.concat();for(var d=!0,e=0;e<a" +
                 ".length;++e){var f=a[e];if(f&&!f.kc&&f.capture==b){var g=f.listener,h=f.pd||f.src;f.Uc&&this.Mc(f);" +
                  "d=!1!==g.call(h,c)&&d}}return d&&0!=c.dg};_.k.$b=function(a,b){return this.sb.$b(String(a),b)};_.k" +
                   ".Mb=function(a,b,c,d){return this.sb.Mb(String(a),b,c,d)};_.k.hasListener=function(a,b){return " +
                "this.sb.hasListener(_.Tc(a)?String(a):void 0,b)};\n" +
                "_.Te=\"StopIteration\"in _.n?_.n.StopIteration:{message:\"StopIteration\",stack:\"\"};_.Ue=function" +
                 "(){};_.Ue.prototype.next=function(){throw _.Te;};_.Ue.prototype.sc=function(){return this};\n" +
                "var Xe,We,$e,af,Ze;_.Ve=function(a){a=String(a);if(/^\\s*$/.test(a)?0:/^[\\]," +
                 ":{}\\s\\u2028\\u2029]*$/.test(a.replace(/\\\\[\"\\\\\\/bfnrtu]/g,\"@\").replace(/" +
                  "(?:\"[^\"\\\\\\n\\r\\u2028\\u2029\\x00-\\x08\\x0a-\\x1f]*\"|true|false|null|-?\\d+(?:\\.\\d*)?" +
                   "(?:[eE][+\\-]?\\d+)?)[\\s\\u2028\\u2029]*(?=:|,|]|}|$)/g,\"]\").replace(/(?:^|:|,)" +
                    "(?:[\\s\\u2028\\u2029]*\\[)+/g,\"\")))try{return eval(\"(\"+a+\")\")}catch(b){}throw Error" +
                     "(\"v`\"+a);};_.Ye=function(a){var b=[];We(new Xe,a,b);return b.join(\"\")};Xe=function(){};\n" +
                "We=function(a,b,c){if(null==b)c.push(\"null\");else{if(\"object\"==typeof b){if(_.Ca(b)){var d=b;b=d" +
                 ".length;c.push(\"[\");for(var e=\"\",f=0;f<b;f++)c.push(e),We(a,d[f],c),e=\",\";c.push(\"]\");" +
                  "return}if(b instanceof String||b instanceof Number||b instanceof Boolean)b=b.valueOf();else{c.push" +
                   "(\"{\");e=\"\";for(d in b)Object.prototype.hasOwnProperty.call(b,d)&&(f=b[d],\"function\"!=typeof" +
                    " f&&(c.push(e),Ze(d,c),c.push(\":\"),We(a,f,c),e=\",\"));c.push(\"}\");return}}switch(typeof b)" +
                     "{case \"string\":Ze(b,c);break;case \"number\":c.push(isFinite(b)&&\n" +
                "!isNaN(b)?String(b):\"null\");break;case \"boolean\":c.push(String(b));break;case \"function\":c" +
                 ".push(\"null\");break;default:throw Error(\"w`\"+typeof b);}}};$e={'\"':'\\\\\"'," +
                "\"\\\\\":\"\\\\\\\\\",\"/\":\"\\\\/\",\"\\b\":\"\\\\b\",\"\\f\":\"\\\\f\",\"\\n\":\"\\\\n\"," +
                   "\"\\r\":\"\\\\r\",\"\\t\":\"\\\\t\",\"\\x0B\":\"\\\\u000b\"};af=/\\uffff/.test(\"\\uffff\")" +
                    "?/[\\\\\"\\x00-\\x1f\\x7f-\\uffff]/g:/[\\\\\"\\x00-\\x1f\\x7f-\\xff]/g;Ze=function(a,b){b.push" +
                     "('\"',a.replace(af,function(c){var d=$e[c];d||(d=\"\\\\u\"+(c.charCodeAt(0)|65536).toString(16)" +
                      ".substr(1),$e[c]=d);return d}),'\"')};\n" +
                "_.bf=function(a){switch(a){case 200:case 201:case 202:case 204:case 206:case 304:case 1223:return!0;" +
                "default:return!1}};\n" +
                "_.cf=function(){};_.cf.prototype.w=null;var df=function(a){return a.w||(a.w=a.B())};\n" +
                "var ff;ff=function(){};_.t(ff,_.cf);ff.prototype.o=function(){var a=gf(this);return a?new " +
                 "ActiveXObject(a):new XMLHttpRequest};ff.prototype.B=function(){var a={};gf(this)&&(a[0]=!0,a[1]=!0)" +
                ";return a};var gf=function(a){if(!a.A&&\"undefined\"==typeof XMLHttpRequest&&\"undefined\"!=typeof" +
                   " ActiveXObject){for(var b=[\"MSXML2.XMLHTTP.6.0\",\"MSXML2.XMLHTTP.3.0\",\"MSXML2.XMLHTTP\"," +
                    "\"Microsoft.XMLHTTP\"],c=0;c<b.length;c++){var d=b[c];try{return new ActiveXObject(d),a" +
                ".A=d}catch(e){}}throw Error(\"x\");}return a.A};\n" +
                "_.ef=new ff;\n" +
                "_.hf=function(a){if(a.ab&&\"function\"==typeof a.ab)return a.ab();if(_.wa(a))return a.split(\"\");if" +
                 "(_.Xc(a)){for(var b=[],c=a.length,d=0;d<c;d++)b.push(a[d]);return b}b=[];c=0;for(d in a)" +
                  "b[c++]=a[d];return b};_.jf=function(a){if(a.Za&&\"function\"==typeof a.Za)return a.Za();if(!a" +
                ".ab||\"function\"!=typeof a.ab){if(_.Xc(a)||_.wa(a)){var b=[];a=a.length;for(var c=0;c<a;c++)b" +
                    ".push(c);return b}return _.id(a)}};\n" +
                "_.kf=function(a,b){if(a.forEach&&\"function\"==typeof a.forEach)a.forEach(b,void 0);else if(_.Xc(a)" +
                 "||_.wa(a))(0,_.La)(a,b,void 0);else for(var c=_.jf(a),d=_.hf(a),e=d.length,f=0;f<e;f++)b.call(void " +
                "0,d[f],c&&c[f],a)};\n" +
                "_.lf=function(a){a.prototype.$goog_Thenable=!0};_.mf=function(a){if(!a)return!1;try{return!!a" +
                 ".$goog_Thenable}catch(b){return!1}};\n" +
                "var pf,uf,yf,Bf,xf,vf,wf,Cf,Af,Df;_.of=function(a,b){this.o=0;this.F=void 0;this.B=this.w=this" +
                 ".A=null;this.C=this.D=!1;if(a!=_.za)try{var c=this;a.call(b,function(d){_.nf(c,2,d)},function(d){_" +
                  ".nf(c,3,d)})}catch(d){_.nf(this,3,d)}};pf=function(){this.next=this.context=this.w=this.A=this" +
                   ".o=null;this.B=!1};pf.prototype.reset=function(){this.context=this.w=this.A=this.o=null;this" +
                    ".B=!1};\n" +
                "var qf=new Vd(function(){return new pf},function(a){a.reset()}),rf=function(a,b,c){var d=qf.get();d" +
                 ".A=a;d.w=b;d.context=c;return d};_.of.prototype.then=function(a,b,c){return _.sf(this,_.Yc(a)" +
                  "?a:null,_.Yc(b)?b:null,c)};_.lf(_.of);_.of.prototype.cancel=function(a){0==this.o&&_.ge(function()" +
                   "{var b=new _.tf(a);uf(this,b)},this)};\n" +
                "uf=function(a,b){if(0==a.o)if(a.A){var c=a.A;if(c.w){for(var d=0,e=null,f=null,g=c.w;g&&(g.B||(d++,g" +
                 ".o==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.o&&1==d?uf(c,b):(f?(d=f,d.next==c.B&&(c.B=d),d" +
                  ".next=d.next.next):vf(c),wf(c,e,3,b)))}a.A=null}else _.nf(a,3,b)};yf=function(a,b){a.w||2!=a" +
                ".o&&3!=a.o||xf(a);a.B?a.B.next=b:a.w=b;a.B=b};\n" +
                "_.sf=function(a,b,c,d){var e=rf(null,null,null);e.o=new _.of(function(f,g){e.A=b?function(h){try{var" +
                 " l=b.call(d,h);f(l)}catch(m){g(m)}}:f;e.w=c?function(h){try{var l=c.call(d,h);!_.Tc(l)&&h " +
                "instanceof _.tf?g(h):f(l)}catch(m){g(m)}}:g});e.o.A=a;yf(a,e);return e.o};_.of.prototype" +
                   ".H=function(a){this.o=0;_.nf(this,2,a)};_.of.prototype.J=function(a){this.o=0;_.nf(this,3,a)};\n" +
                "_.nf=function(a,b,c){0==a.o&&(a===c&&(b=3,c=new TypeError(\"y\")),a.o=1,_.zf(c,a.H,a.J,a)||(a.F=c,a" +
                 ".o=b,a.A=null,xf(a),3!=b||c instanceof _.tf||Af(a,c)))};_.zf=function(a,b,c,d){if(a instanceof _" +
                  ".of)return yf(a,rf(b||_.za,c||null,d)),!0;if(_.mf(a))return a.then(b,c,d),!0;if(_.Zc(a))try{var " +
                   "e=a.then;if(_.Yc(e))return Bf(a,e,b,c,d),!0}catch(f){return c.call(d,f),!0}return!1};Bf=function" +
                "(a,b,c,d,e){var f=!1,g=function(l){f||(f=!0,c.call(e,l))},h=function(l){f||(f=!0,d.call(e,l))};" +
                     "try{b.call(a,g,h)}catch(l){h(l)}};\n" +
                "xf=function(a){a.D||(a.D=!0,_.ge(a.G,a))};vf=function(a){var b=null;a.w&&(b=a.w,a.w=b.next,b" +
                 ".next=null);a.w||(a.B=null);return b};_.of.prototype.G=function(){for(var a;a=vf(this);)wf(this,a," +
                  "this.o,this.F);this.D=!1};wf=function(a,b,c,d){if(3==c&&b.w&&!b.B)for(;a&&a.C;a=a.A)a.C=!1;if(b.o)" +
                   "b.o.A=null,Cf(b,c,d);else try{b.B?b.A.call(b.context):Cf(b,c,d)}catch(e){Df.call(null,e)}Wd(qf,b)" +
                    "};Cf=function(a,b,c){2==b?a.A.call(a.context,c):a.w&&a.w.call(a.context,c)};\n" +
                "Af=function(a,b){a.C=!0;_.ge(function(){a.C&&Df.call(null,b)})};Df=Xd;_.tf=function(a){_.Ja.call" +
                 "(this,a)};_.t(_.tf,_.Ja);_.tf.prototype.name=\"cancel\";\n" +
                "_.Ef=function(a,b){_.O.call(this);this.B=a||1;this.A=b||_.n;this.C=(0,_.p)(this.F,this);this.D=(0,_" +
                 ".Ga)()};_.t(_.Ef,_.O);_.Ef.prototype.w=!1;_.Ef.prototype.o=null;_.Ff=function(a,b){a.B=b;a.o&&a.w?" +
                  "(a.stop(),a.start()):a.o&&a.stop()};_.Ef.prototype.F=function(){if(this.w){var a=(0,_.Ga)()-this" +
                   ".D;0<a&&a<.8*this.B?this.o=this.A.setTimeout(this.C,this.B-a):(this.o&&(this.A.clearTimeout(this" +
                    ".o),this.o=null),this.dispatchEvent(\"tick\"),this.w&&(this.stop(),this.start()))}};\n" +
                "_.Ef.prototype.start=function(){this.w=!0;this.o||(this.o=this.A.setTimeout(this.C,this.B),this.D=" +
                 "(0,_.Ga)())};_.Ef.prototype.stop=function(){this.w=!1;this.o&&(this.A.clearTimeout(this.o),this" +
                  ".o=null)};_.Ef.prototype.S=function(){_.Ef.M.S.call(this);this.stop();delete this.A};_.Gf=function" +
                   "(a,b,c){if(_.Yc(a))c&&(a=(0,_.p)(a,c));else if(a&&\"function\"==typeof a.handleEvent)a=(0,_.p)(a" +
                    ".handleEvent,a);else throw Error(\"z\");return 2147483647<Number(b)?-1:_.n.setTimeout(a,b||0)};_" +
                     ".Hf=function(a){_.n.clearTimeout(a)};\n" +
                "_.If=function(a,b){this.w={};this.o=[];this.B=this.A=0;var c=arguments.length;if(1<c){if(c%2)throw " +
                 "Error(\"i\");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof _" +
                  ".If)for(c=a.Za(),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])};_" +
                ".k=_.If.prototype;_.k.ab=function(){Jf(this);for(var a=[],b=0;b<this.o.length;b++)a.push(this" +
                    ".w[this.o[b]]);return a};_.k.Za=function(){Jf(this);return this.o.concat()};_.k.Hc=function()" +
                     "{return 0==this.A};\n" +
                "_.k.clear=function(){this.w={};this.B=this.A=this.o.length=0};_.k.remove=function(a){return Kf(this" +
                 ".w,a)?(delete this.w[a],this.A--,this.B++,this.o.length>2*this.A&&Jf(this),!0):!1};var Jf=function" +
                  "(a){if(a.A!=a.o.length){for(var b=0,c=0;b<a.o.length;){var d=a.o[b];Kf(a.w,d)&&(a.o[c++]=d);b++}a" +
                   ".o.length=c}if(a.A!=a.o.length){var e={};for(c=b=0;b<a.o.length;)d=a.o[b],Kf(e,d)||(a.o[c++]=d," +
                "e[d]=1),b++;a.o.length=c}};_.k=_.If.prototype;_.k.get=function(a,b){return Kf(this.w,a)?this" +
                ".w[a]:b};\n" +
                "_.k.set=function(a,b){Kf(this.w,a)||(this.A++,this.o.push(a),this.B++);this.w[a]=b};_.k" +
                 ".forEach=function(a,b){for(var c=this.Za(),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f," +
                  "e,this)}};_.k.clone=function(){return new _.If(this)};_.k.sc=function(a){Jf(this);var b=0,c=this" +
                   ".B,d=this,e=new _.Ue;e.next=function(){if(c!=d.B)throw Error(\"B\");if(b>=d.o.length)throw _.Te;" +
                    "var f=d.o[b++];return a?f:d.w[f]};return e};var Kf=function(a,b){return Object.prototype" +
                     ".hasOwnProperty.call(a,b)};\n" +
                "var Nf;_.Lf=/^(?:([^:/?#.]+):)?(?:\\/\\/(?:([^/?#]*)@)?([^/#?]*?)(?::([0-9]+))?(?=[/#?]|$))?([^?#]+)" +
                 "?(?:\\?([^#]*))?(?:#([\\s\\S]*))?$/;_.Mf=function(a){a=a.match(_.Lf)[1]||null;!a&&_.n.self&&_.n" +
                  ".self.location&&(a=_.n.self.location.protocol,a=a.substr(0,a.length-1));return a?a.toLowerCase()" +
                   ":\"\"};\n" +
                "Nf=function(a,b){if(a){a=a.split(\"&\");for(var c=0;c<a.length;c++){var d=a[c].indexOf(\"=\")," +
                 "e=null;if(0<=d){var f=a[c].substring(0,d);e=a[c].substring(d+1)}else f=a[c];b(f," +
                  "e?decodeURIComponent(e.replace(/\\+/g,\" \")):\"\")}}};_.Of=function(a,b,c){if(_.Ca(b))for(var " +
                   "d=0;d<b.length;d++)_.Of(a,String(b[d]),c);else null!=b&&c.push(a+(\"\"===b?\"\":\"=\"+_.Gd(b)))};" +
                    "\n" +
                "var Wf,Yf,fg,Zf,ag,$f,dg,bg,Xf,gg;\n" +
                "_.Pf=function(a,b){this.bb=this.D=this.w=\"\";this.C=null;this.A=this.F=\"\";this.B=!1;var c;a " +
                 "instanceof _.Pf?(this.B=_.Tc(b)?b:a.B,_.Qf(this,a.w),this.D=a.D,_.Rf(this,a.bb),_.Sf(this,a.C),_.Tf" +
                  "(this,a.$a()),_.Uf(this,a.o.clone()),_.Vf(this,a.A)):a&&(c=String(a).match(_.Lf))?(this.B=!!b,_.Qf" +
 "(this,c[1]||\"\",!0),this.D=Wf(c[2]||\"\"),_.Rf(this,c[3]||\"\",!0),_.Sf(this,c[4]),_.Tf(this," +
                    "c[5]||\"\",!0),_.Uf(this,c[6]||\"\",!0),_.Vf(this,c[7]||\"\",!0)):(this.B=!!b,this.o=new Xf" +
                     "(null,this.B))};\n" +
                "_.Pf.prototype.toString=function(){var a=[],b=this.w;b&&a.push(Yf(b,Zf,!0),\":\");var c=this.bb;if" +
                 "(c||\"file\"==b)a.push(\"//\"),(b=this.D)&&a.push(Yf(b,Zf,!0),\"@\"),a.push(_.Gd(c).replace(/%25" +
                  "([0-9a-fA-F]{2})/g,\"%$1\")),c=this.C,null!=c&&a.push(\":\",String(c));if(c=this.$a())this" +
                ".bb&&\"/\"!=c.charAt(0)&&a.push(\"/\"),a.push(Yf(c,\"/\"==c.charAt(0)?$f:ag,!0));(c=this.o" +
                    ".toString())&&a.push(\"?\",c);(c=this.A)&&a.push(\"#\",Yf(c,bg));return a.join(\"\")};_.Pf" +
                     ".prototype.clone=function(){return new _.Pf(this)};\n" +
                "_.Qf=function(a,b,c){a.w=c?Wf(b,!0):b;a.w&&(a.w=a.w.replace(/:$/,\"\"));return a};_.Rf=function(a,b," +
                 "c){a.bb=c?Wf(b,!0):b;return a};_.Sf=function(a,b){if(b){b=Number(b);if(isNaN(b)||0>b)throw Error" +
                  "(\"C`\"+b);a.C=b}else a.C=null;return a};_.Pf.prototype.$a=function(){return this.F};_.Tf=function" +
                   "(a,b,c){a.F=c?Wf(b,!0):b;return a};_.Uf=function(a,b,c){b instanceof Xf?(a.o=b,cg(a.o,a.B)):(c||" +
                    "(b=Yf(b,dg)),a.o=new Xf(b,a.B));return a};_.eg=function(a,b,c){a.o.set(b,c);return a};\n" +
                "_.Vf=function(a,b,c){a.A=c?Wf(b):b;return a};Wf=function(a,b){return a?b?decodeURI(a.replace(/%25/g," +
                 "\"%2525\")):decodeURIComponent(a):\"\"};Yf=function(a,b,c){return _.wa(a)?(a=encodeURI(a).replace" +
                  "(b,fg),c&&(a=a.replace(/%25([0-9a-fA-F]{2})/g,\"%$1\")),a):null};fg=function(a){a=a.charCodeAt(0);" +
                   "return\"%\"+(a>>4&15).toString(16)+(a&15).toString(16)};Zf=/[#\\/\\?@]/g;ag=/[#\\?:]/g;" +
                    "$f=/[#\\?]/g;dg=/[#\\?@]/g;bg=/#/g;Xf=function(a,b){this.w=this.o=null;this.A=a||null;this" +
                     ".B=!!b};\n" +
                "gg=function(a){a.o||(a.o=new _.If,a.w=0,a.A&&Nf(a.A,function(b,c){a.add(decodeURIComponent(b.replace" +
                 "(/\\+/g,\" \")),c)}))};Xf.prototype.add=function(a,b){gg(this);this.A=null;a=hg(this,a);var c=this" +
                ".o.get(a);c||this.o.set(a,c=[]);c.push(b);this.w+=1;return this};Xf.prototype.remove=function(a)" +
                   "{gg(this);a=hg(this,a);return Kf(this.o.w,a)?(this.A=null,this.w-=this.o.get(a).length,this.o" +
                ".remove(a)):!1};Xf.prototype.clear=function(){this.o=this.A=null;this.w=0};\n" +
                "Xf.prototype.Hc=function(){gg(this);return 0==this.w};_.ig=function(a,b){gg(a);b=hg(a,b);return Kf(a" +
                 ".o.w,b)};_.k=Xf.prototype;_.k.forEach=function(a,b){gg(this);this.o.forEach(function(c,d){(0,_.La)" +
                  "(c,function(e){a.call(b,e,d,this)},this)},this)};_.k.Za=function(){gg(this);for(var a=this.o.ab()," +
                   "b=this.o.Za(),c=[],d=0;d<b.length;d++)for(var e=a[d],f=0;f<e.length;f++)c.push(b[d]);return c};\n" +
                "_.k.ab=function(a){gg(this);var b=[];if(_.wa(a))_.ig(this,a)&&(b=ed(b,this.o.get(hg(this,a))));" +
                 "else{a=this.o.ab();for(var c=0;c<a.length;c++)b=ed(b,a[c])}return b};_.k.set=function(a,b){gg(this)" +
                  ";this.A=null;a=hg(this,a);_.ig(this,a)&&(this.w-=this.o.get(a).length);this.o.set(a,[b]);this" +
                ".w+=1;return this};_.k.get=function(a,b){if(!a)return b;a=this.ab(a);return 0<a.length?String" +
                    "(a[0]):b};_.jg=function(a,b,c){a.remove(b);0<c.length&&(a.A=null,a.o.set(hg(a,b),_.fd(c)),a.w+=c" +
                     ".length)};\n" +
                "Xf.prototype.toString=function(){if(this.A)return this.A;if(!this.o)return\"\";for(var a=[],b=this.o" +
                 ".Za(),c=0;c<b.length;c++){var d=b[c],e=_.Gd(d);d=this.ab(d);for(var f=0;f<d.length;f++){var g=e;" +
                  "\"\"!==d[f]&&(g+=\"=\"+_.Gd(d[f]));a.push(g)}}return this.A=a.join(\"&\")};Xf.prototype" +
                ".clone=function(){var a=new Xf;a.A=this.A;this.o&&(a.o=this.o.clone(),a.w=this.w);return a};\n" +
                "var hg=function(a,b){b=String(b);a.B&&(b=b.toLowerCase());return b},cg=function(a,b){b&&!a.B&&(gg(a)" +
                ",a.A=null,a.o.forEach(function(c,d){var e=d.toLowerCase();d!=e&&(this.remove(d),_.jg(this,e,c))},a)" +
                  ");a.B=b};\n" +
                "var lg,mg,ng;_.kg=function(a){_.O.call(this);this.headers=new _.If;this.G=a||null;this.w=!1;this" +
                ".F=this.o=null;this.J=\"\";this.A=this.O=this.C=this.H=!1;this.D=0;this.B=null;this.R=\"\";this" +
                  ".P=this.N=!1};_.t(_.kg,_.O);lg=/^https?$/i;mg=[\"POST\",\"PUT\"];ng=[];_.og=function(a,b,c,d,e,f," +
                   "g){var h=new _.kg;ng.push(h);b&&h.K(\"complete\",b);h.fb(\"ready\",h.Y);f&&(h.D=Math.max(0,f));" +
                    "g&&(h.N=g);h.send(a,c,d,e)};_.kg.prototype.Y=function(){this.ga();_.dd(ng,this)};\n" +
                "_.kg.prototype.send=function(a,b,c,d){if(this.o)throw Error(\"E`\"+this.J+\"`\"+a);b=b?b.toUpperCase" +
                 "():\"GET\";this.J=a;this.H=!1;this.w=!0;this.o=this.G?this.G.o():_.ef.o();this.F=this.G?df(this.G)" +
                  ":df(_.ef);this.o.onreadystatechange=(0,_.p)(this.T,this);try{this.O=!0,this.o.open(b,String(a),!0)" +
                   ",this.O=!1}catch(f){pg(this);return}a=c||\"\";var e=this.headers.clone();d&&_.kf(d,function(f,g)" +
                "{e.set(g,f)});d=ad(e.Za());c=_.n.FormData&&a instanceof _.n.FormData;!_.bd(mg,b)||d||c||e.set" +
                     "(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\n" +
                "e.forEach(function(f,g){this.o.setRequestHeader(g,f)},this);this.R&&(this.o.responseType=this.R);" +
                "\"withCredentials\"in this.o&&this.o.withCredentials!==this.N&&(this.o.withCredentials=this.N);" +
                  "try{qg(this),0<this.D&&((this.P=rg(this.o))?(this.o.timeout=this.D,this.o.ontimeout=(0,_.p)(this" +
                ".Kc,this)):this.B=_.Gf(this.Kc,this.D,this)),this.C=!0,this.o.send(a),this.C=!1}catch(f){pg(this)" +
                    "}};var rg=function(a){return _.x&&_.hc(9)&&_.xa(a.timeout)&&_.Tc(a.ontimeout)},$c=function(a)" +
                     "{return\"content-type\"==a.toLowerCase()};\n" +
                "_.kg.prototype.Kc=function(){\"undefined\"!=typeof _.va&&this.o&&(this.dispatchEvent(\"timeout\")," +
                 "this.abort(8))};var pg=function(a){a.w=!1;a.o&&(a.A=!0,a.o.abort(),a.A=!1);sg(a);tg(a)},sg=function" +
                  "(a){a.H||(a.H=!0,a.dispatchEvent(\"complete\"),a.dispatchEvent(\"error\"))};_.kg.prototype" +
                   ".abort=function(){this.o&&this.w&&(this.w=!1,this.A=!0,this.o.abort(),this.A=!1,this" +
                    ".dispatchEvent(\"complete\"),this.dispatchEvent(\"abort\"),tg(this))};\n" +
                "_.kg.prototype.S=function(){this.o&&(this.w&&(this.w=!1,this.A=!0,this.o.abort(),this.A=!1),tg(this," +
                 "!0));_.kg.M.S.call(this)};_.kg.prototype.T=function(){this.za||(this.O||this.C||this.A?ug(this)" +
                  ":this.U())};_.kg.prototype.U=function(){ug(this)};\n" +
                "var ug=function(a){if(a.w&&\"undefined\"!=typeof _.va&&(!a.F[1]||4!=(a.o?a.o.readyState:0)||2!=a.tb" +
                 "()))if(a.C&&4==(a.o?a.o.readyState:0))_.Gf(a.T,0,a);else if(a.dispatchEvent(\"readystatechange\")," +
                  "4==(a.o?a.o.readyState:0)){a.w=!1;try{a.wd()?(a.dispatchEvent(\"complete\"),a.dispatchEvent" +
                   "(\"success\")):(a.tb(),sg(a))}finally{tg(a)}}},tg=function(a,b){if(a.o){qg(a);var c=a.o,d=a" +
                    ".F[0]?_.za:null;a.o=null;a.F=null;b||a.dispatchEvent(\"ready\");try{c.onreadystatechange=d}catch" +
                     "(e){}}},qg=function(a){a.o&&a.P&&(a.o.ontimeout=\n" +
                "null);a.B&&(_.Hf(a.B),a.B=null)};_.kg.prototype.wd=function(){var a=this.tb(),b;if(!(b=_.bf(a))){if" +
                "(a=0===a)a=_.Mf(String(this.J)),a=!lg.test(a);b=a}return b};_.kg.prototype.tb=function(){try{return" +
                  " 2<(this.o?this.o.readyState:0)?this.o.status:-1}catch(a){return-1}};_.kg.prototype.pf=function()" +
                   "{try{return this.o?this.o.responseText:\"\"}catch(a){return\"\"}};_.kg.prototype.de=function(){if" +
                "(this.o){a:{var a=this.o.responseText;if(_.n.JSON)try{var b=_.n.JSON.parse(a);break a}catch(c)" +
                     "{}b=_.Ve(a)}return b}};\n" +
                "/*\n" +
                "\n" +
                "Math.uuid.js (v1.4)\n" +
                "http://www.broofa.com\n" +
                "mailto:robert@broofa.com\n" +
                "Copyright (c) 2010 Robert Kieffer\n" +
                "Dual licensed under the MIT and GPL licenses.\n" +
                "*/\n" +
                "var Kd=function(a){_.z(this,a,0,-1,null,null)};_.t(Kd,_.y);\n" +
                "_.vg=new Ld;\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var xg,Ag,Bg;_.wg=function(a,b){return a.createElement(String(b))};_.yg=function(a,b,c){return " +
                 "2>=arguments.length?Array.prototype.slice.call(a,b):Array.prototype.slice.call(a,b,c)};_" +
                  ".zg=function(a,b,c,d){Array.prototype.splice.apply(a,_.yg(arguments,1))};Ag=function(a,b){return " +
                   "null!==a&&b in a?a[b]:void 0};Bg=function(a){var b=arguments.length;if(1==b&&_.Ca(arguments[0]))" +
                    "return Bg.apply(null,arguments[0]);for(var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};\n" +
                "_.Cg=function(a,b){if((0,_.Hb)())for(;a.lastChild;)a.removeChild(a.lastChild);a.innerHTML=_.Cb(b)};_" +
                 ".Dg=function(a){return 9==a.nodeType?a:a.ownerDocument||a.document};_.Eg=function(a){for(var b;b=a" +
                  ".firstChild;)a.removeChild(b)};_.Fg=function(a){return a&&a.parentNode?a.parentNode.removeChild(a)" +
                ":null};_.Gg=function(a){return _.Nc&&void 0!=a.children?a.children:(0,_.Ma)(a.childNodes,function" +
                    "(b){return 1==b.nodeType})};_.Hg=function(a){return _.Zc(a)&&1==a.nodeType};\n" +
                "_.Ig=function(a,b){if(!a||!b)return!1;if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if" +
                "(\"undefined\"!=typeof a.compareDocumentPosition)return a==b||!!(a.compareDocumentPosition(b)&16);" +
                  "for(;b&&a!=b;)b=b.parentNode;return b==a};_.Jg=function(a){this.o=a||_.n.document||document};_.k=_" +
                   ".Jg.prototype;_.k.L=function(a){return _.wa(a)?this.o.getElementById(a):a};_.k.ka=function(a,b,c)" +
                    "{return _.Qd(this.o,arguments)};_.k.createElement=function(a){return _.wg(this.o,a)};_.k" +
                     ".Cc=function(a,b){a.appendChild(b)};\n" +
                "_.k.qf=_.Eg;_.k.Dc=_.Fg;_.k.Ug=_.Gg;_.k.Tg=_.Ig;_.Kg=function(a){return a?new _.Jg(_.Dg(a)):xg||" +
                 "(xg=new _.Jg)};_.Lg=function(a,b){if(\"textContent\"in a)a.textContent=b;else if(3==a.nodeType)a" +
                ".data=String(b);else if(a.firstChild&&3==a.firstChild.nodeType){for(;a.lastChild!=a.firstChild;)a" +
                   ".removeChild(a.lastChild);a.firstChild.data=String(b)}else _.Eg(a),a.appendChild(_.Dg(a)" +
                    ".createTextNode(String(b)))};\n" +
                "Bg(\"A AREA BUTTON HEAD INPUT LINK MENU META OPTGROUP OPTION PROGRESS STYLE SELECT SOURCE TEXTAREA " +
                 "TITLE TRACK\".split(\" \"));\n" +
                "_.Mg=_.Qb?\"MozUserSelect\":_.Rb||_.Ob?\"WebkitUserSelect\":null;\n" +
                "_.Ng=function(){if(_.Vb){var a=/Windows NT ([0-9.]+)/;return(a=a.exec(_.ub))?a[1]:\"0\"}return _.Ub?" +
                 "(a=/10[_.][0-9_.]+/,(a=a.exec(_.ub))?a[0].replace(/_/g,\".\"):\"10\"):_.Xb?(a=/Android\\s+([^\\);" +
                  "]+)(\\)|;)/,(a=a.exec(_.ub))?a[1]:\"\"):_.Yb||_.Zb||_.$b?(a=/(?:iPhone|CPU)\\s+OS\\s+(\\S+)/,(a=a" +
                   ".exec(_.ub))?a[1].replace(/_/g,\".\"):\"\"):\"\"}();\n" +
                "var Og;Og=function(a){return(a=a.exec(_.ub))?a[1]:\"\"};_.Pg=function(){if(_.lc)return Og" +
                "(/Firefox\\/([0-9.]+)/);if(_.x||_.Ob||_.Nb)return _.gc;if(_.pc)return _.Jb()?Og(/CriOS\\/([0-9.]+)" +
 "/):Og(/Chrome\\/([0-9.]+)/);if(_.qc&&!_.Jb())return Og(/Version\\/([0-9.]+)/);if(_.mc||_.nc){var " +
                "a=/Version\\/(\\S+).*Mobile\\/(\\S+)/.exec(_.ub);if(a)return a[1]+\".\"+a[2]}else if(_.oc)return" +
                    "(a=Og(/Android\\s+([0-9.]+)/))?a:Og(/Version\\/([0-9.]+)/);return\"\"}();\n" +
                "_.Qg=function(){};_.Aa(_.Qg);_.Qg.prototype.o=0;_.Rg=function(a){return\":\"+(a.o++).toString(36)};" +
                 "\n" +
                "_.Tg=function(a){_.O.call(this);this.o=a||_.Kg();this.ia=Sg;this.ea=null;this.pa=!1;this.w=null;this" +
                 ".N=void 0;this.H=this.C=this.A=this.D=null;this.Aa=!1};_.t(_.Tg,_.O);_.Tg.prototype.eb=_.Qg.V();var" +
                  " Sg=null;_.Tg.prototype.getId=function(){return this.ea||(this.ea=_.Rg(this.eb))};_.Tg.prototype" +
                   ".L=function(){return this.w};var Ug=function(a,b){if(a==b)throw Error(\"G\");var c;if(c=b&&a.A&&a" +
                    ".ea){c=a.A;var d=a.ea;c=c.H&&d?Ag(c.H,d)||null:null}if(c&&a.A!=b)throw Error(\"G\");a.A=b;_.Tg.M" +
                     ".Ie.call(a,b)};\n" +
                "_.Tg.prototype.Ie=function(a){if(this.A&&this.A!=a)throw Error(\"H\");_.Tg.M.Ie.call(this,a)};_.Tg" +
                 ".prototype.lb=function(){this.w=this.o.createElement(\"DIV\")};_.Tg.prototype.ta=function(a){Vg" +
                  "(this,a)};var Vg=function(a,b,c){if(a.pa)throw Error(\"I\");a.w||a.lb();b?b.insertBefore(a.w," +
                "c||null):a.o.o.body.appendChild(a.w);a.A&&!a.A.pa||a.ra()};_.k=_.Tg.prototype;_.k.Ue=function()" +
                "{return!0};_.k.wb=function(a){this.w=a};_.k.ra=function(){this.pa=!0;_.Wg(this,function(a){!a" +
                     ".pa&&a.L()&&a.ra()})};\n" +
                "_.k.Ua=function(){_.Wg(this,function(a){a.pa&&a.Ua()});this.N&&_.Se(this.N);this.pa=!1};_.k" +
                ".S=function(){this.pa&&this.Ua();this.N&&(this.N.ga(),delete this.N);_.Wg(this,function(a){a.ga()})" +
                  ";!this.Aa&&this.w&&_.Fg(this.w);this.A=this.D=this.w=this.H=this.C=null;_.Tg.M.S.call(this)};\n" +
                "_.k.Jb=function(a,b,c){if(a.pa&&(c||!this.pa))throw Error(\"I\");if(0>b||b>_.Yg(this))throw Error" +
                "(\"K\");this.H&&this.C||(this.H={},this.C=[]);if(a.A==this){var d=a.getId();this.H[d]=a;_.dd(this" +
                  ".C,a)}else{d=this.H;var e=a.getId();if(null!==d&&e in d)throw Error(\"h`\"+e);d[e]=a}Ug(a,this);_" +
                   ".zg(this.C,b,0,a);a.pa&&this.pa&&a.A==this?(c=this.dc(),b=c.childNodes[b]||null,b!=a.L()&&c" +
                    ".insertBefore(a.L(),b)):c?(this.w||this.lb(),b=_.Zg(this,b+1),Vg(a,this.dc(),b?b.w:null)):this" +
                     ".pa&&!a.pa&&a.w&&a.w.parentNode&&\n" +
                "1==a.w.parentNode.nodeType&&a.ra()};_.k.dc=function(){return this.w};_.Yg=function(a){return a.C?a.C" +
                 ".length:0};_.Zg=function(a,b){return a.C?a.C[b]||null:null};_.Wg=function(a,b,c){a.C&&(0,_.La)(a.C," +
                  "b,c)};_.Tg.prototype.removeChild=function(a,b){if(a){var c=_.wa(a)?a:a.getId();a=this.H&&c?Ag(this" +
                   ".H,c)||null:null;if(c&&a){var d=this.H;c in d&&delete d[c];_.dd(this.C,a);b&&(a.Ua(),a.w&&_.Fg(a" +
                ".w));Ug(a,null)}}if(!a)throw Error(\"L\");return a};\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var gh;gh=[1,4,2];_.hh=function(a){return(_.ie?0==a.Oa.button:\"click\"==a.type?!0:!!(a.Oa" +
                 ".button&gh[0]))&&!(_.Rb&&_.Ub&&a.ctrlKey)};_.ih=function(a,b){return(b||document)" +
                  ".getElementsByTagName(String(a))};\n" +
                "var jh,lh;jh=function(){};_.kh=new jh;lh=[\"click\",\"keydown\",\"keyup\"];jh.prototype.K=function" +
                 "(a,b,c,d,e){var f=function(g){var h=_.De(b),l=_.Hg(g.target)?g.target.getAttribute(\"role\")" +
                "||null:null;\"click\"==g.type&&_.hh(g)?h.call(d,g):13!=g.keyCode&&3!=g.keyCode||\"keyup\"==g" +
                   ".type?32!=g.keyCode||\"keyup\"!=g.type||\"button\"!=l&&\"tab\"!=l||(h.call(d,g),g.preventDefault" +
                    "()):(g.type=\"keypress\",h.call(d,g))};f.nb=b;f.cj=d;e?e.K(a,lh,f,c):_.N(a,lh,f,c)};\n" +
                "jh.prototype.qa=function(a,b,c,d,e){for(var f,g=0;f=lh[g];g++){var h=a;var l=f;var m=!!c;l=_.re(h)?h" +
                 ".$b(l,m):h?(h=_.Fe(h))?h.$b(l,m):[]:[];for(h=0;m=l[h];h++){var r=m.listener;if(r.nb==b&&r.cj==d)" +
                  "{e?e.qa(a,f,m.listener,c,d):_.Je(a,f,m.listener,c,d);break}}}};\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "_.Ij=function(a,b,c){a=_.B(a,b);return null==a?c:a};\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var Mj,Vj,Wj,Xj,bk,ck,qk,rk,vk,xk,yk,zk,Uk,Vk,Wk;_.Jj=function(a,b,c){a=_.A(a,b);a=null==a?a:+a;" +
                 "return null==a?c:a};_.Kj=function(a,b,c){a.o||(a.o={});if(!a.o[c]){for(var d=_.A(a,c),e=[],f=0;f<d" +
                  ".length;f++)e[f]=new b(d[f]);a.o[c]=e}};_.Lj=function(a,b,c){_.Kj(a,b,c);b=a.o[c];b==_.vc&&(b=a" +
                   ".o[c]=[]);return b};Mj=function(a){_.z(this,a,0,-1,null,null)};_.t(Mj,_.y);var Nj=function(a){_.z" +
                    "(this,a,0,-1,null,null)};_.t(Nj,_.y);var Oj=function(a){_.z(this,a,0,-1,null,null)};_.t(Oj,_.y);" +
                     "\n" +
                "_.Pj=function(a){_.z(this,a,0,-1,null,null)};_.t(_.Pj,_.y);_.Rj=function(){var a=_.Qj();return _.A" +
                 "(a,9)};_.W=function(a,b,c){a.o||(a.o={});var d=c?c.La():c;a.o[b]=c;return _.D(a,b,d)};_.Sj=function" +
                  "(a,b){return a.o.get(b)};_.Tj=function(a,b,c){a.o||(a.o={});c=c||[];for(var d=[],e=0;e<c.length;" +
                   "e++)d[e]=c[e].La();a.o[b]=c;return _.D(a,b,d)};_.Uj=function(a){return a?a.parentWindow||a" +
                    ".defaultView:window};Vj=null;Wj=/^[\\w+/_-]+[=]{0,2}$/;\n" +
                "Xj=function(a){var b=b||0;return function(){return a.apply(this,Array.prototype.slice.call" +
                 "(arguments,0,b))}};_.Yj=function(a,b){a.src=_.qd(b);if(null===Vj)b:{b=_.n.document;if((b=b" +
                ".querySelector&&b.querySelector(\"script[nonce]\"))&&(b=b.nonce||b.getAttribute(\"nonce\"))&&Wj" +
                   ".test(b)){Vj=b;break b}Vj=\"\"}b=Vj;b&&a.setAttribute(\"nonce\",b)};_.Zj=function(a,b,c){_.A(a,b)" +
                    ".push(c);return a};_.Qj=function(){return _.E(_.K(),Nj,4)||new Nj};_.ak=function(){return _.E(_" +
                     ".K(),Mj,11)||new Mj};\n" +
                "bk=function(a,b){return a+Math.random()*(b-a)};ck=function(a){_.z(this,a,0,-1,null,null)};_.t(ck,_" +
                 ".y);var dk=[2],ek=function(a){_.z(this,a,0,-1,dk,null)};_.t(ek,_.y);var fk=[1,2,3,4],gk=function(a)" +
                  "{_.z(this,a,0,-1,fk,null)};_.t(gk,_.y);\n" +
                "var hk=function(a){if(!a)return\"\";a=a.split(\"#\")[0].split(\"?\")[0];a=a.toLowerCase();0==a" +
                 ".indexOf(\"//\")&&(a=window.location.protocol+a);/^[\\w\\-]*:\\/\\//.test(a)||(a=window.location" +
                  ".href);var b=a.substring(a.indexOf(\"://\")+3),c=b.indexOf(\"/\");-1!=c&&(b=b.substring(0,c));a=a" +
                   ".substring(0,a.indexOf(\"://\"));if(\"http\"!==a&&\"https\"!==a&&\"chrome-extension\"!==a&&\"file" +
                    "\"!==a&&\"android-app\"!==a&&\"chrome-search\"!==a&&\"app\"!==a)throw Error(\"o`\"+a);c=\"\";var" +
                     " d=b.indexOf(\":\");if(-1!=d){var e=b.substring(d+1);b=b.substring(0,\n" +
                "d);if(\"http\"===a&&\"80\"!==e||\"https\"===a&&\"443\"!==e)c=\":\"+e}return a+\"://\"+b+c}," +
                 "ik=function(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;" +
                  "e[4]=3285377520;r=m=0}function b(w){for(var I=g,F=0;64>F;F+=4)" +
                   "I[F/4]=w[F]<<24|w[F+1]<<16|w[F+2]<<8|w[F+3];for(F=16;80>F;F++)w=I[F-3]^I[F-8]^I[F-14]^I[F-16]," +
                    "I[F]=(w<<1|w>>>31)&4294967295;w=e[0];var S=e[1],M=e[2],ja=e[3],we=e[4];for(F=0;80>F;F++){if" +
                     "(40>F)if(20>F){var Db=ja^S&(M^ja);var cd=1518500249}else Db=S^M^ja,cd=1859775393;else 60>\n" +
                "F?(Db=S&M|ja&(S|M),cd=2400959708):(Db=S^M^ja,cd=3395469782);Db=((w<<5|w>>>27)&4294967295)" +
                 "+Db+we+cd+I[F]&4294967295;we=ja;ja=M;M=(S<<30|S>>>2)&4294967295;S=w;w=Db}e[0]=e[0]+w&4294967295;" +
                  "e[1]=e[1]+S&4294967295;e[2]=e[2]+M&4294967295;e[3]=e[3]+ja&4294967295;" +
                   "e[4]=e[4]+we&4294967295}function c(w,I){if(\"string\"===typeof w){w=unescape(encodeURIComponent" +
                "(w));for(var F=[],S=0,M=w.length;S<M;++S)F.push(w.charCodeAt(S));w=F}I||(I=w.length);F=0;if" +
                     "(0==m)for(;F+64<I;)b(w.slice(F,F+64)),F+=64,r+=64;for(;F<I;)if(f[m++]=\n" +
                "w[F++],r++,64==m)for(m=0,b(f);F+64<I;)b(w.slice(F,F+64)),F+=64,r+=64}function d(){var w=[],I=8*r;" +
                 "56>m?c(h,56-m):c(h,64-(m-56));for(var F=63;56<=F;F--)f[F]=I&255,I>>>=8;b(f);for(F=I=0;5>F;F++)for" +
                  "(var S=24;0<=S;S-=8)w[I++]=e[F]>>S&255;return w}for(var e=[],f=[],g=[],h=[128],l=1;64>l;++l)" +
                   "h[l]=0;var m,r;a();return{reset:a,update:c,digest:d,Ng:function(){for(var w=d(),I=\"\",F=0;F<w" +
                    ".length;F++)I+=\"0123456789ABCDEF\".charAt(Math.floor(w[F]/16))+\"0123456789ABCDEF\".charAt" +
                     "(w[F]%16);return I}}},jk=function(a){var b=\n" +
                "ik();b.update(a);return b.Ng().toLowerCase()},kk=function(a,b,c){var d=[],e=[];if(1==(_.Ca(c)?2:1))" +
                 "return e=[b,a],(0,_.La)(d,function(h){e.push(h)}),jk(e.join(\" \"));var f=[],g=[];(0,_.La)(c," +
                  "function(h){g.push(h.key);f.push(h.value)});c=Math.floor((new Date).getTime()/1E3);e=0==f" +
                   ".length?[c,b,a]:[f.join(\":\"),c,b,a];(0,_.La)(d,function(h){e.push(h)});a=jk(e.join(\" \"));" +
                    "a=[c,a];0==g.length||a.push(g.join(\"\"));return a.join(\"_\")},lk=function(a){var b=hk(String(_" +
                     ".n.location.href)),c=_.n.__OVERRIDE_SID;null==\n" +
                "c&&(c=(new _.Sd(document)).get(\"SID\"));if(c&&(b=(c=0==b.indexOf(\"https:\")||0==b.indexOf" +
                 "(\"chrome-extension:\"))?_.n.__SAPISID:_.n.__APISID,null==b&&(b=(new _.Sd(document)).get" +
                  "(c?\"SAPISID\":\"APISID\")),b)){c=c?\"SAPISIDHASH\":\"APISIDHASH\";var d=String(_.n.location.href)" +
                ";return d&&b&&c?[c,kk(hk(d),b,a||null)].join(\" \"):null}return null},mk=function(a){this.o=this" +
                    ".w=this.A=a};mk.prototype.reset=function(){this.o=this.w=this.A};mk.prototype.oa=function()" +
                     "{return this.w};\n" +
                "_.nk=function(a){var b=a.indexOf(\"#\");0>b&&(b=a.length);var c=a.indexOf(\"?\");if(0>c||c>b){c=b;" +
                "var d=\"\"}else d=a.substring(c+1,b);return[a.substr(0,c),d,a.substr(b)]};_.ok=function(a,b){return" +
                  " b?a?a+\"&\"+b:b:a};_.pk=function(a,b){if(!b)return a;a=_.nk(a);a[1]=_.ok(a[1],b);return a[0]+" +
                "(a[1]?\"?\"+a[1]:\"\")+a[2]};qk=function(a,b){var c=[];for(b=b||0;b<a.length;b+=2)_.Of(a[b]," +
 "a[b+1],c);return c.join(\"&\")};rk=function(a,b){var c=2==arguments.length?qk(arguments[1],0):qk" +
                     "(arguments,1);return _.pk(a,c)};\n" +
                "_.sk=function(a,b,c){c=null!=c?\"=\"+_.Gd(c):\"\";return _.pk(a,b+c)};_.tk=function(a,b,c,d){for(var" +
                 " e=c.length;0<=(b=a.indexOf(c,b))&&b<d;){var f=a.charCodeAt(b-1);if(38==f||63==f)if(f=a.charCodeAt" +
                "(b+e),!f||61==f||38==f||35==f)return b;b+=e+1}return-1};_.uk=/#|$/;vk=/[?&]($|#)/;_.wk=function(a," +
                   "b){for(var c=a.search(_.uk),d=0,e,f=[];0<=(e=_.tk(a,d,b,c));)f.push(a.substring(d,e)),d=Math.min" +
                    "(a.indexOf(\"&\",e)+1||c,c);f.push(a.substr(d));return f.join(\"\").replace(vk,\"$1\")};\n" +
                "xk=function(){return\"xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx\".replace(/[xy]/g,function(a){var " +
                 "b=16*Math.random()|0;return(\"x\"==a?b:b&3|8).toString(16)})};yk=function(a,b,c){_.og(a.url," +
                  "function(d){d=d.target;d.wd()?b(d.pf()):c(d.tb())},a.bj,a.body,a.aj,a.mj,a.withCredentials)};" +
                   "zk=function(a){_.z(this,a,0,-1,null,null)};_.t(zk,_.y);var Ak=function(a){_.z(this,a,0,-1,null," +
                    "null)};_.t(Ak,_.y);var Bk=[3,20,27],Ck=function(a){_.z(this,a,0,29,Bk,null)};_.t(Ck,_.y);\n" +
                "var Dk=[3,5],Ek=function(a){_.z(this,a,0,17,Dk,null)};_.t(Ek,_.y);var Fk=function(a){var b=(0,_.Ga)" +
                 "().toString();return _.D(a,4,b)},Gk=function(a,b){return _.Tj(a,3,b)},Hk=function(a,b){return _.D" +
                  "(a,14,b)},Ik=[5],Jk=function(a){_.z(this,a,0,6,Ik,null)};_.t(Jk,_.y);var Kk=function(){this" +
                   ".type=\"event-logged\"};_.t(Kk,_.me);\n" +
                "var Mk=function(a,b,c,d,e,f,g,h,l,m,r){_.O.call(this);this.$=a;this.R=b||_.za;this.C=new Ek;this" +
                 ".da=d;this.U=r;this.o=[];this.Y=\"\";this.ba=_.Uc(bk,0,1);this.H=e||null;this.F=c||null;this" +
                  ".J=g||!1;this.O=l||null;this.W=!1;this.X=this.P=-1;this.T=!1;this.A=null;this.ia=!h;this.N=0;this" +
                   ".ca=1;this.Z=f||!1;a=new Ak;a=_.D(a,1,1);f||(f=new zk,b=document.documentElement.getAttribute" +
                    "(\"lang\"),f=_.D(f,5,b),_.W(a,11,f));_.W(this.C,1,a);_.D(this.C,2,this.$);this.B=new mk(1E4);" +
                "this.w=new _.Ef(this.B.oa());_.Wc(this,\n" +
                "this.w);_.N(this.w,\"tick\",Xj(Lk(this,m)),!1,this);this.G=new _.Ef(6E5);_.Wc(this,this.G);_.N(this" +
                ".G,\"tick\",Xj(Lk(this,m)),!1,this);this.J||this.G.start();this.Z||(_.N(_.Uj(),\"beforeunload\"," +
                  "this.D,!1,this),_.N(_.Uj(),\"unload\",this.D,!1,this),_.N(document,\"pagehide\",this.D,!1,this))};" +
                   "_.t(Mk,_.O);var Lk=function(a,b){return b?function(){b().then(a.flush.bind(a))}:a.flush};Mk" +
                    ".prototype.S=function(){this.D();Mk.M.S.call(this)};\n" +
                "var Nk=function(a){a.H||(a.H=.01>a.ba()?\"https://www.google" +
                 ".com/log?format=json&hasfast=true\":\"https://play.google.com/log?format=json&hasfast=true\");" +
                  "return a.H};Mk.prototype.Ma=function(a){if(a instanceof Ck)this.log(a);else{var b=new Ck;a=a.w();" +
                   "b=_.D(b,8,a);this.log(b)}};var Ok=function(a,b){a.B=new mk(1>b?1:b);_.Ff(a.w,a.B.oa())};\n" +
                "Mk.prototype.log=function(a){a=_.Ac(a);var b=this.ca++;_.D(a,21,b);if(!_.A(a,1)){b=a;var c=(0,_.Ga)" +
                 "().toString();_.D(b,1,c)}this.A&&(b=_.Ac(this.A),_.W(a,16,b));for(;1E3<=this.o.length;)this.o.shift" +
                  "(),++this.N;this.o.push(a);this.dispatchEvent(new Kk(a));this.J||this.w.w||this.w.start()};\n" +
                "Mk.prototype.flush=function(a,b){if(0==this.o.length)a&&a();else{var c=(0,_.Ga)();if(this.X>c&&this" +
                ".P<c)b&&b(\"throttled\");else{var d=Hk(Gk(Fk(_.Ac(this.C)),this.o),this.N);c={};var e=this.R();e&&" +
                  "(c.Authorization=e);var f=Nk(this);this.F&&(c[\"X-Goog-AuthUser\"]=this.F,f=_.sk(f,\"authuser\"," +
                   "this.F));this.O&&(c[\"X-Goog-PageId\"]=this.O,f=_.sk(f,\"pageId\",this.O));if(e&&this.Y==e)b&&b" +
                "(\"stale-auth-token\");else{this.o=[];this.w.w&&this.w.stop();this.N=0;var g=d.w();c={url:f," +
                "body:g,lk:1,aj:c,bj:\"POST\",withCredentials:this.ia,\n" +
                "mj:0};f=(0,_.p)(function(h){this.B.reset();_.Ff(this.w,this.B.oa());if(h){try{var l=JSON.parse(h" +
                 ".replace(\")]}'\\n\",\"\"));var m=new Jk(l)}catch(r){}m&&(h=_.C(m,1,\"-1\"),h=Number(h),0<h&&(this" +
                  ".P=(0,_.Ga)(),this.X=this.P+h),m.B?(m.o||(m.o={}),_.vg.w()?(!m.o[175237375]&&m.B[175237375]&&(m" +
                   ".o[175237375]=new _.vg.o(m.B[175237375])),m=m.o[175237375]):m=m.B[175237375]):m=void 0,m&&(m=_.C" +
                    "(m,1,-1),-1!=m&&(this.T||Ok(this,m))))}a&&a()},this);g=(0,_.p)(function(h){var l=_.Lj(d,Ck,3)," +
                     "m=this.B;m.o=Math.min(3E5,2*m.o);\n" +
                "m.w=Math.min(3E5,m.o+Math.round(.2*(Math.random()-.5)*m.o));_.Ff(this.w,this.B.oa());401==h&&e&&" +
                "(this.Y=e);if(500<=h&&600>h||401==h||0==h)this.o=l.concat(this.o),this.J||this.w.w||this.w.start();" +
                  "b&&b(\"net-send-failed\",h)},this);this.U?this.U.send(c,f,g):this.da(c,f,g)}}}};Mk.prototype" +
                   ".D=function(){this.W&&Pk(this);this.flush()};\n" +
                "var Pk=function(a){Qk(a,function(b,c){b=_.sk(b,\"format\",\"json\");return _.Uj().navigator" +
                ".sendBeacon(b,c.w())})},Qk=function(a,b){if(0!=a.o.length){var c=_.wk(Nk(a),\"format\");c=rk(c," +
                "\"auth\",a.R(),\"authuser\",a.F||\"0\");for(var d=0;10>d&&a.o.length;++d){var e=a.o.slice(0,32)," +
                   "f=Gk(Fk(_.Ac(a.C)),e);if(!b(c,f))break;a.o=a.o.slice(e.length)}}},Rk=function(a,b,c,d,e,f,g){Mk" +
                    ".call(this,a,lk,b,yk,c,d,e,void 0,f,g)};_.t(Rk,Mk);\n" +
                "var Sk=[1,36],Tk=function(a,b,c){_.u.call(this);this.F=b;this.$=0;this.da=c;this.C=_.J(_.Jj(a,2," +
                 "1E-4),.001);this.B=_.J(_.Jj(a,10,0),0);this.X=_.H(_.A(a,21),\"\");this.Z=_.J(_.A(a,4),0);this.Y=_.J" +
                  "(_.A(a,5),-1);this.R=_.H(_.A(a,7),\"\");this.P=_.H(_.A(a,6),\"\");this.O=_.H(_.A(a,8),\"\");this" +
                   ".J=_.A(a,9);this.W=!!_.B(a,11);this.T=!!_.B(a,12);this.H=!!_.B(a,15);this.G=!!_.B(a,16);this" +
                    ".U=!!_.B(a,20);this.w=null!=_.A(a,17)?_.A(a,17).split(\",\"):[];c=Math.random();this.D=_.G(_.B" +
                     "(a,1))&&c<this.C;this.A=_.G(_.B(a,\n" +
                "1))&&c<this.B;this.N=\"og-\"+xk();if(this.D||this.A){a=_.B(a,3)?\"https://play.googleapis" +
                ".com/staging/log\":void 0;b=this.o=new Rk(373,_.H(_.A(b,5)),a);b.T=!0;Ok(b,1E3);this.o.W=!!_.Uj()" +
                  ".navigator.sendBeacon&&(_.pc||_.lc&&_.hc(45));if(0!=this.w.length){b=new gk;for(a=0;a<this.w" +
                   ".length;a++)c=Number(this.w[a]),isNaN(c)||0==c||_.Zj(b,3,c);a=this.o;b?(a.A||(a.A=new ek),b=b.w()" +
                    ",_.D(a.A,4,b)):a.A&&_.D(a.A,4,void 0)}_.Wc(this,this.o)}};_.t(Tk,_.u);\n" +
                "Tk.prototype.log=function(a,b){var c=36!=a||this.U?!_.bd(Sk,a):!0,d=c?this.D:this.A;if(d){var " +
                 "e=b||new _.Rd;_.D(e,1,a);var f=++this.$;_.D(e,38,f);_.D(e,2,this.Z);_.D(e,4,c?this.C:this.B);_.D(e," +
                "6,this.X);_.D(e,3,this.Y);_.D(e,11,this.P);_.D(e,10,this.R);_.D(e,5,this.O);window" +
                   ".performance&&window.performance.timing&&_.D(e,14,(new Date).getTime()-window.performance.timing" +
                    ".navigationStart);_.D(e,13,this.J);_.D(e,16,this.W);_.D(e,17,this.T);_.D(e,19,this.N);c=0;_.B" +
                     "(this.F,1)&&(c|=1);_.B(this.F,3)&&(c|=\n" +
                "4);_.D(e,12,c);_.D(e,25,this.H);_.D(e,26,this.G);c=new Ck;e=e.w();_.D(c,8,e);this.o.log(c)}this.da&&" +
                 "(console.log(\"Clearcut log called with event = \",a,\"(\"+(d?\"\":\"NOT \")+\"sent to server)\")," +
                "b&&null!=_.A(b,27)&&console.log(\"Widget state logged = \",_.A(b,27)))};Uk=0;Vk=[];Wk=function(a)" +
                   "{var b=new Image;b.onerror=b.onload=b.onabort=function(){Uk in Vk&&delete Vk[Uk]};Vk[Uk++]=b;b" +
                ".src=_.ob(a)};\n" +
                "_.Xk=function(a){var b=window.google&&window.google.logUrl?\"\":\"https://www.google.com\";" +
                 "b+=\"/gen_204?\";b+=a.w(2040-b.length);Wk(_.Ed(b))};_.Yk=function(){this.data={}};_.Yk.prototype" +
                  ".o=function(){window.console&&window.console.log&&window.console.log(\"Log data: \",this.data)};_" +
                   ".Yk.prototype.w=function(a){var b=[],c;for(c in this.data)b.push(encodeURIComponent(c)" +
                    "+\"=\"+encodeURIComponent(String(this.data[c])));return(\"atyp=i&zx=\"+(new Date).getTime()" +
                     "+\"&\"+b.join(\"&\")).substr(0,a)};\n" +
                "_.Zk=function(a,b){this.data={};var c=_.E(a,_.Cc,8)||new _.Cc;window.google&&window.google.kEI&&" +
 "(this.data.ei=window.google.kEI);this.data.sei=_.H(_.A(a,10));this.data.ogf=_.H(_.A(c,3));var " +
                "d=window.google&&window.google.sn?/.*hp$/.test(window.google.sn)?!1:!0:_.G(_.B(a,7));this.data" +
                   ".ogrp=d?\"1\":\"\";this.data.ogv=_.H(_.A(c,6))+\".\"+_.H(_.A(c,7));this.data.ogd=_.H(_.A(a,21));" +
                    "this.data.ogc=_.H(_.A(a,20));this.data.ogl=_.H(_.A(a,5));b&&(this.data.oggv=b)};_.t(_.Zk,_.Yk);" +
                "\n" +
                "_.$k=function(a,b,c,d,e){_.Zk.call(this,a,b);_.kd(this.data,{jexpid:_.H(_.A(a,9)),srcpg:\"prop=\"+_" +
                 ".H(_.A(a,6)),jsr:Math.round(1/d),emsg:c.name+\":\"+c.message});if(e){e._sn&&(e._sn=\"og.\"+e._sn);" +
                  "for(var f in e)this.data[encodeURIComponent(f)]=e[f]}};_.t(_.$k,_.Zk);\n" +
                "var al=function(a,b,c){this.w=_.Hc;this.J=b;this.za=c;this.C=_.J(_.Jj(a,2,.001),.001);this.H=_.G(_.B" +
                 "(a,1))&&Math.random()<this.C;this.F=_.J(_.C(a,3,1),1);this.B=0;this.o=null;this.G=_.G(_.Ij(a,4,!0)," +
                  "!0);this.A=_.J(_.Jj(a,5,.1),.1);this.D=Math.random()<this.A};\n" +
                "al.prototype.log=function(a,b){if(this.o&&this.D){var c=new ck;_.D(c,1,a.message);_.D(c,2,a.stack);_" +
                 ".D(c,3,a.lineNumber);_.D(c,4,this.A);_.D(c,5,1);var d=new _.Rd;_.W(d,40,c);this.o.log(98,d)}try{if" +
                  "(this.w||this.H&&this.B<this.F){try{var e=_.Ra(_.Qa.V(),\"lm\").o(a,b)}catch(f){e=new _.$k(this.J," +
                   "this.za,a,this.C,b)}b=e;this.w?b.o():_.Xk(b);this.B++}}catch(f){}if(this.w&&this.G)throw a;};\n" +
                "var bl;bl=null;_.cl=function(){if(!bl){var a=_.E(_.K(),_.Pj,13)||new _.Pj,b=_.Kc(),c=_.Rj();bl=new " +
                 "al(a,b,c)}return bl};_.Ic=function(a,b){_.cl().log(a,b)};\n" +
                "var dl;dl=null;_.el=function(){var a=_.E(_.K(),Oj,29)||new Oj,b=_.ak();if(dl)return dl;dl=a=new Tk" +
                 "(a,b,_.Hc);return _.cl().o=a};\n" +
                "var fl;fl=function(){this.w=!1;this.o=[]};_.hl=function(a){var b=_.gl;b.w?a():b.o.push(a)};fl" +
                ".prototype.A=function(a){if(!this.w){this.w=!0;_.el().log(1);for(var b=0;b<this.o.length;b++)" +
                  "try{this.o[b]()}catch(c){a(c)}this.o=null;try{_.ld(\"api\").Ma()}catch(c){}}};_.gl=new fl;\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var up=function(){_.u.call(this);this.o=new _.Oe},vp;_.L(up,_.u);up.prototype.K=function(a,b,c,d,e){" +
                 "(e||this.o).A(a,vp,b,c,d)};up.prototype.qa=function(a,b,c,d,e){(e||this.o).qa(a,vp,b,c,d)};up" +
                  ".prototype.S=function(){this.o.ga();_.u.prototype.S.call(this)};_.wp=new up;vp=[\"click\"," +
                   "\"keydown\",\"mousedown\",\"touchstart\"];\n" +
                "/*\n" +
                " Portions of this code are from MochiKit, received by\n" +
                " The Closure Authors under the MIT license. All other code is Copyright\n" +
                " 2005-2009 The Closure Authors. All Rights Reserved.\n" +
                "*/\n" +
                "_.xp=function(a,b){this.C=[];this.N=a;this.za=b||null;this.B=this.o=!1;this.A=void 0;this.H=this" +
                 ".O=this.F=!1;this.D=0;this.w=null;this.G=0};_.xp.prototype.cancel=function(a){if(this.o)this.A " +
                  "instanceof _.xp&&this.A.cancel();else{if(this.w){var b=this.w;delete this.w;a?b.cancel(a):(b.G--," +
                   "0>=b.G&&b.cancel())}this.N?this.N.call(this.za,this):this.H=!0;this.o||(a=new yp(this),_.zp(this)" +
                    ",_.Ap(this,!1,a))}};_.xp.prototype.J=function(a,b){this.F=!1;_.Ap(this,a,b)};\n" +
                "_.Ap=function(a,b,c){a.o=!0;a.A=c;a.B=!b;Bp(a)};_.zp=function(a){if(a.o){if(!a.H)throw new Cp(a);a" +
                 ".H=!1}};_.xp.prototype.Cb=function(a){_.zp(this);_.Ap(this,!0,a)};_.xp.prototype" +
                  ".addCallback=function(a,b){return Dp(this,a,null,b)};var Dp=function(a,b,c,d){a.C.push([b,c,d]);a" +
                   ".o&&Bp(a);return a};_.xp.prototype.then=function(a,b,c){var d,e,f=new _.of(function(g,h){d=g;" +
                    "e=h});Dp(this,d,function(g){g instanceof yp?f.cancel():e(g)});return f.then(a,b,c)};_.lf(_.xp);" +
                     "\n" +
                "_.xp.prototype.isError=function(a){return a instanceof Error};\n" +
                "var Ep=function(a){return(0,_.Pa)(a.C,function(b){return _.Yc(b[1])})},Bp=function(a){if(a.D&&a" +
                 ".o&&Ep(a)){var b=a.D,c=Fp[b];c&&(_.n.clearTimeout(c.ea),delete Fp[b]);a.D=0}a.w&&(a.w.G--,delete a" +
                  ".w);b=a.A;for(var d=c=!1;a.C.length&&!a.F;){var e=a.C.shift(),f=e[0],g=e[1];e=e[2];if(f=a.B?g:f)" +
                   "try{var h=f.call(e||a.za,b);void 0!==h&&(a.B=a.B&&(h==b||a.isError(h)),a.A=b=h);if(_.mf(b)" +
                    "||\"function\"===typeof _.n.Promise&&b instanceof _.n.Promise)d=!0,a.F=!0}catch(l){b=l,a.B=!0,Ep" +
                     "(a)||(c=!0)}}a.A=b;d&&(h=(0,_.p)(a.J,\n" +
                "a,!0),d=(0,_.p)(a.J,a,!1),b instanceof _.xp?(Dp(b,h,d),b.O=!0):b.then(h,d));c&&(b=new Gp(b),Fp[b" +
                 ".ea]=b,a.D=b.ea)},Cp=function(){_.Ja.call(this)};_.t(Cp,_.Ja);Cp.prototype.message=\"Deferred has " +
                  "already fired\";Cp.prototype.name=\"AlreadyCalledError\";var yp=function(){_.Ja.call(this)};_.t" +
                "(yp,_.Ja);yp.prototype.message=\"Deferred was canceled\";yp.prototype.name=\"CanceledError\";var " +
                    "Gp=function(a){this.ea=_.n.setTimeout((0,_.p)(this.w,this),0);this.o=a};\n" +
                "Gp.prototype.w=function(){delete Fp[this.ea];throw this.o;};var Fp={};\n" +
                "_.Hp=_.td(_.gb(\"https://apis.google.com/js/api.js\"));\n" +
                "_.Ip=new Map([[\"birthday\",14],[\"children\",1],[\"dinner\",2],[\"featured\",3],[\"holiday\",4]," +
                 "[\"nightlife\",5],[\"other\",6],[\"party\",7],[\"school\",8],[\"seasonal\",9],[\"sport\",10]," +
                  "[\"stationery\",11],[\"travel\",12],[\"wedding\",13]]);\n" +
                "_.Jp=_.n.document&&_.n.document.documentElement&&!!_.n.document.documentElement.setCapture&&!!_.n" +
                ".document.releaseCapture;\n" +
                "(function(){for(var a=[\"ms\",\"moz\",\"webkit\",\"o\"],b,c=0;b=a[c]&&!_.n.requestAnimationFrame;" +
                "++c)_.n.requestAnimationFrame=_.n[b+\"RequestAnimationFrame\"],_.n.cancelAnimationFrame=_" +
                  ".n[b+\"CancelAnimationFrame\"]||_.n[b+\"CancelRequestAnimationFrame\"];if(!_.n" +
                ".requestAnimationFrame){var d=0;_.n.requestAnimationFrame=function(e){var f=(new Date).getTime()," +
                    "g=Math.max(0,16-(f-d));d=f+g;return _.n.setTimeout(function(){e(f+g)},g)};_.n" +
                     ".cancelAnimationFrame||(_.n.cancelAnimationFrame=function(e){clearTimeout(e)})}})();\n" +
                "var Mp;_.Kp=_.x?_.td(_.gb('javascript:\"\"')):_.td(_.gb(\"about:blank\"));_.Lp=_.rd(_.Kp);Mp=_.x?_" +
                 ".td(_.gb('javascript:\"\"')):_.td(_.gb(\"javascript:undefined\"));_.rd(Mp);\n" +
                "var Rp,Sp,Tp,Up;_.Np=function(a){a||_.Kg();_.If.call(this)};_.t(_.Np,_.If);_.k=_.Np.prototype;_.k" +
                 ".Wc=null;_.k.mb=null;_.k.Vc=null;_.k.clear=function(){_.If.prototype.clear.call(this);this.Wc=this" +
                  ".Vc=null};_.k.set=function(a,b,c,d){_.If.prototype.set.call(this,a,b);c&&(this.Wc=a);d&&(this" +
                   ".Vc=a);return this};_.Op=function(a,b,c,d){return a.set(b.key,b.caption,c,d)};\n" +
                "_.Np.prototype.ta=function(){if(this.mb){_.Cg(this.mb,_.Fb);var a=_.Kg(this.mb);this.forEach" +
                 "(function(b,c){b=a.ka(\"BUTTON\",{name:c},b);c==this.Wc&&(b.className=\"gb_qa-buttonset-default\");" +
                "this.mb.appendChild(b)},this)}};_.Np.prototype.L=function(){return this.mb};_.Pp={key:\"ok\"," +
                   "caption:\"OK\"};_.Qp={key:\"cancel\",caption:\"Cancel\"};Rp={key:\"yes\",caption:\"Yes\"};" +
                    "Sp={key:\"no\",caption:\"No\"};Tp={key:\"save\",caption:\"Save\"};Up={key:\"continue\"," +
                     "caption:\"Continue\"};\n" +
                "\"undefined\"!=typeof document&&(_.Op(new _.Np,_.Pp,!0,!0),_.Op(_.Op(new _.Np,_.Pp,!0),_.Qp,!1,!0),_" +
                 ".Op(_.Op(new _.Np,Rp,!0),Sp,!1,!0),_.Op(_.Op(_.Op(new _.Np,Rp),Sp,!0),_.Qp,!1,!0),_.Op(_.Op(_.Op" +
                  "(new _.Np,Up),Tp),_.Qp,!0,!0));\n" +
                "_.Vp=_.td(_.gb(\"//www-onepick-opensocial.googleusercontent.com/gadgets/js/rpc" +
                ".js?c=1&container=onepick\"));_.Wp=_.td(_.gb(\"//apis.google.com/js/rpc.js\"));\n" +
                "var Xp=!1,Yp=\"\",Zp=function(a){a=a.match(/[\\d]+/g);if(!a)return\"\";a.length=3;return a.join(\"" +
                 ".\")};\n" +
                "(function(){if(navigator.plugins&&navigator.plugins.length){var a=navigator.plugins[\"Shockwave " +
                "Flash\"];if(a&&(Xp=!0,a.description)){Yp=Zp(a.description);return}if(navigator.plugins[\"Shockwave " +
                "Flash 2.0\"]){Xp=!0;Yp=\"2.0.0.11\";return}}if(navigator.mimeTypes&&navigator.mimeTypes.length&&" +
                   "(a=navigator.mimeTypes[\"application/x-shockwave-flash\"],Xp=!(!a||!a.enabledPlugin))){Yp=Zp(a" +
                    ".enabledPlugin.description);return}if(\"undefined\"!=typeof ActiveXObject){try{var b=new " +
                "ActiveXObject(\"ShockwaveFlash.ShockwaveFlash.7\");\n" +
                "Xp=!0;Yp=Zp(b.GetVariable(\"$version\"));return}catch(c){}try{b=new ActiveXObject(\"ShockwaveFlash" +
                 ".ShockwaveFlash.6\");Xp=!0;Yp=\"6.0.21\";return}catch(c){}try{b=new ActiveXObject(\"ShockwaveFlash" +
                  ".ShockwaveFlash\"),Xp=!0,Yp=Zp(b.GetVariable(\"$version\"))}catch(c){}}})();_.$p=Yp;\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "_.aq=function(){_.u.call(this);this.w=new _.O};_.t(_.aq,_.u);_.aq.prototype[_.qe]=!0;_.k=_.aq" +
                ".prototype;_.k.K=function(a,b,c,d){return this.w.K(a,b,c,d)};_.k.fb=function(a,b,c,d){return this.w" +
                ".fb(a,b,c,d)};_.k.qa=function(a,b,c,d){return this.w.qa(a,b,c,d)};_.k.Mc=function(a){return this.w" +
                   ".Mc(a)};_.k.dispatchEvent=function(a){return this.w.dispatchEvent(a)};_.k.Ed=function(a){return " +
                    "this.w.Ed(a)};_.k.ed=function(){return this.w.ed()};_.k.Yb=function(a,b,c){return this.w.Yb(a,b," +
                     "c)};\n" +
                "_.k.$b=function(a,b){return this.w.$b(a,b)};_.k.Mb=function(a,b,c,d){return this.w.Mb(a,b,c,d)};_.k" +
                 ".hasListener=function(a,b){return this.w.hasListener(a,b)};\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "_.bq=function(a){_.z(this,a,0,-1,null,null)};_.t(_.bq,_.y);_.bq.prototype.$a=function(){return _.A" +
                 "(this,6)};var cq=function(a,b){return null!==a&&b in a},dq=function(a){var b=arguments,c=b.length;" +
                  "return function(){for(var d=0;d<c;d++)if(b[d].apply(this,arguments))return!0;return!1}}," +
                   "eq=function(a){return function(){return!a.apply(this,arguments)}};\n" +
                "_.fq=function(a,b,c,d,e){_.u.call(this);this.B=b;this.X=d;this.F=e;this.N=!1;this.A={};this.w={};" +
                 "this.U=[];this.C=[];this.J=_.B(a,1)?\"http\":\"https\";this.T=[this.J+\"://\"+_.H(_.A(a,2))," +
                  "\"og/_/js\",\"k=\"+_.H(_.A(a,3)),\"rt=j\"];this.H=\"\"==_.H(_.A(a,14))?null:_.A(a,14);this.O=[this" +
                ".J+\"://\"+_.H(_.A(a,2)),\"og/_/ss\",\"k=\"+_.H(_.A(a,13))];this.G=\"\"==_.H(_.A(a,15))?null:_.A" +
                    "(a,15);this.R=_.G(_.B(a,1))?\"?host=www.gstatic.com&bust=\"+_.H(_.A(a,16)):\"\";this.P=_.G(_.B" +
                     "(a,1))?\"?host=www.gstatic.com&bust=\"+1E11*Math.random():\n" +
                "\"\";this.o=_.J(_.C(a,17,1),1);a=0;for(b=c[a];a<c.length;a++,b=c[a])this.A[b]=!0,this.w[b]=!0};_.t(_" +
                 ".fq,_.u);_.Ta(_.fq,\"m\");_.hq=function(a,b,c){b=(0,_.Ma)(b,eq(dq(_.vd,_.Uc(cq,a.A))));if(0<b" +
                  ".length){var d=a.T.join(\"/\")+\"/m=\"+b.join(\",\")+\"/exm=\"+_.id(a.A).join(\",\")" +
                "+\"/d=1/ed=1\";a.H&&(d+=\"/rs=\"+a.H);d+=a.R;gq(a,d,(0,_.p)(a.Y,a,c));a.U.push(d);for(c=0;c<b" +
                ".length;c++)a.A[b[c]]=!0}};_.fq.prototype.Y=function(a){for(var b=0;b<this.C.length;b++)this" +
                     ".C[b].call(null);a&&a.call(null)};\n" +
                "var gq=function(a,b,c,d){var e=_.wg(document,\"SCRIPT\");e.async=!0;e.type=\"text/javascript\";e" +
                 ".charset=\"UTF-8\";_.Yj(e,new _.pd(_.nd,b,null));var f=!0,g=d||1;d=(0,_.p)(function(){f=!1;this.F" +
                  ".log(47,{att:g,max:this.o,url:b});g<this.o?gq(this,b,c,g+1):this.X.log(Error(\"wa`\"+g+\"`\"+this" +
                   ".o),{url:b})},a);var h=(0,_.p)(function(){f&&(this.F.log(46,{att:g,max:this.o,url:b}),f=!1,c&&c" +
                    ".call(null))},a),l=function(m){\"loaded\"==m.readyState||\"complete\"==m.readyState?h()" +
                     ":f&&window.setTimeout(function(){l(m)},100)};\n" +
                "\"undefined\"!==typeof e.addEventListener?e.onload=function(){h()}:e.onreadystatechange=function(){e" +
                 ".onreadystatechange=null;l(e)};e.onerror=d;a.F.log(45,{att:g,max:a.o,url:b});_.ih(\"HEAD\")[0]" +
                  ".appendChild(e)};_.fq.prototype.Ad=function(a,b){a=(0,_.Ma)(a,eq(dq(_.vd,_.Uc(cq,this.w))));if(0<a" +
                   ".length){var c=this.O.join(\"/\")+\"/m=\"+a.join(\",\")+\"/excm=\"+_.id(this.w).join(\",\")" +
                    "+\"/d=1/ed=1\";this.G&&(c+=\"/rs=\"+this.G);iq(c+this.P,b);for(b=0;b<a.length;b++)this" +
                     ".w[a[b]]=!0}};\n" +
                "var iq=function(a,b){var c=_.wg(document,\"LINK\");c.setAttribute(\"rel\",\"stylesheet\");c" +
                 ".setAttribute(\"type\",\"text/css\");c.setAttribute(\"href\",a);c.onload=c" +
                  ".onreadystatechange=function(){c.readyState&&\"loaded\"!=c.readyState&&\"complete\"!=c" +
                   ".readyState||b&&b.call(null)};_.ih(\"HEAD\")[0].appendChild(c)};\n" +
                "_.fq.prototype.D=function(a,b){if(!this.N)if(void 0!=b)window.setTimeout((0,_.p)(this.D,this,a,void " +
                 "0),b);else{_.hq(this,_.A(this.B,1),a);a=_.A(this.B,2);if(_.B(this.B,3)){var c=(0,_.p)(this.Ad,this," +
                "a);a=function(){c()};\"undefined\"!==typeof window.addEventListener?window.addEventListener" +
 "(\"load\",a):window.attachEvent(\"onload\",a)}else this.Ad(a);this.N=!0}};\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var mq,nq,oq,pq,qq,sq;_.jq=function(a){_.z(this,a,0,-1,null,null)};_.t(_.jq,_.y);var kq=function(a)" +
                 "{_.z(this,a,0,-1,null,null)};_.t(kq,_.y);_.lq=function(a,b,c){return function(){try{return b.apply" +
                  "(c,arguments)}catch(d){a.log(d)}}};mq=[1,2,3,4,5,6,9,10,11,13,14,28,29,30,34,35,37,38,39,40,42,43," +
                   "48,49,50,51,52,53,62,500];nq=function(a){a=String(a);return a.replace(\".\",\"%2E\").replace(\"," +
                    "\",\"%2C\")};oq=null;pq=function(a){if(!oq){oq={};for(var b=0;b<mq.length;b++)" +
                     "oq[mq[b]]=!0}return!!oq[a]};\n" +
                "qq=function(a,b,c,d,e,f){_.Zk.call(this,a,b);_.kd(this.data,{oge:d,ogex:_.H(_.A(a,9)),ogp:_.H(_.A(a," +
                 "6)),ogsr:Math.round(1/(pq(d)?_.J(_.Jj(c,3,1)):_.J(_.Jj(c,2,1E-4)))),ogus:e});if(f){\"ogw\"in f&&" +
                  "(this.data.ogw=f.ogw,delete f.ogw);\"ved\"in f&&(this.data.ved=f.ved,delete f.ved);a=[];for(var g " +
                   "in f)0!=a.length&&a.push(\",\"),a.push(nq(g)),a.push(\".\"),a.push(nq(f[g]));f=a.join(\"\");" +
                    "\"\"!=f&&(this.data.ogad=f)}};_.t(qq,_.Zk);\n" +
                "var rq=function(a,b,c,d){this.o=_.Hc;this.F=a;this.D=b;this.G=d;this.C=_.J(_.Jj(a,2,1E-4),1E-4);this" +
                 ".A=_.J(_.Jj(a,3,1),1);b=Math.random();this.B=_.G(_.B(a,1))&&b<this.C;this.w=_.G(_.B(a,1))&&b<this" +
                  ".A;a=0;_.G(_.B(c,1))&&(a|=1);_.G(_.B(c,2))&&(a|=2);_.G(_.B(c,3))&&(a|=4);this.H=a};rq.prototype" +
                   ".log=function(a,b){try{if(this.o||(pq(a)?this.w:this.B)){var c=new qq(this.D,this.G,this.F,a,this" +
                    ".H,b);this.o?c.o():_.Xk(c)}}catch(d){}};sq=null;\n" +
                "_.tq=function(){if(!sq){var a=_.E(_.K(),kq,12)||new kq,b=_.Kc(),c=_.ak(),d=_.Rj();sq=new rq(a,b,c,d)" +
                 "}return sq};_.uq=function(a,b){_.tq().log(a,b)};_.uq(8,{m:\"BackCompat\"==document" +
                  ".compatMode?\"q\":\"s\"});\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "try{\n" +
                "var vq=function(){_.gl.A(_.Ic)},wq=function(a,b){var c=_.cl();c=_.lq(c,vq);a.addEventListener?a" +
                 ".addEventListener(b,c):a.attachEvent&&a.attachEvent(\"on\"+b,c)},xq=[1,2],yq=function(a){_.z(this," +
                  "a,0,-1,xq,null)};_.t(yq,_.y);var zq=function(a,b){a.C.push(b)},Aq=function(a,b){a.__PVT=b}," +
                   "Bq=function(a){_.u.call(this);this.C=a;this.A=null;this.o={};this.B={};this.w={}};_.t(Bq,_.u);var" +
                    " Cq=function(a){if(a.A)return a.A;for(var b in a.w)if(a.w[b].Hf()&&a.w[b].vb())return a.w[b];" +
                     "return null};_.k=Bq.prototype;\n" +
                "_.k.He=function(a){a&&Cq(this)&&a!=Cq(this)&&Cq(this).ve(!1);this.A=a};_.k.Kf=function(a){a=this" +
                 ".w[a]||a;return Cq(this)==a};_.k.We=function(){Cq(this)&&Cq(this).ve(!1);this.He(null)};_.k" +
                  ".zg=function(a){Cq(this)&&Cq(this).getId()==a&&this.We()};_.k.uc=function(a,b,c){this.o[a]=this" +
                   ".o[a]||{};this.o[a][b]=this.o[a][b]||[];this.o[a][b].push(c)};_.k.Yd=function(a,b){b=b.getId();if" +
                    "(this.o[a]&&this.o[a][b])for(var c=0;c<this.o[a][b].length;c++)try{this.o[a][b][c]()}catch(d)" +
                     "{this.C.log(d)}};\n" +
                "_.k.ij=function(a,b){this.B[a]=b};_.k.xg=function(a){return!this.B[a.getId()]};_.k.ji=function()" +
                 "{return!!Cq(this)&&Cq(this).If()};_.k.wg=function(){return!!Cq(this)};_.k.Tf=function(){Cq(this)" +
                  "&&Cq(this).ue()};_.k.we=function(a){this.w[a.getId()]=a};var Dq=function(){_.u.call(this);this" +
                   ".w=[];this.o=[]};_.L(Dq,_.u);Dq.prototype.A=function(a,b){this.w.push({Yc:a,options:b})};\n" +
                "Dq.prototype.init=function(a,b,c){window.gapi={};var d=window.___jsl={};d.h=_.H(_.A(a,1));null!=_.A" +
 "(a,12)&&(d.dpo=_.G(_.B(a,12)));d.ms=_.H(_.A(a,2));d.m=_.H(_.A(a,3));d.l=[];_.A(b,1)&&(a=_.A(b,3))" +
                "&&this.o.push(a);_.A(c,1)&&(c=_.A(c,2))&&this.o.push(c);_.q(\"gapi.load\",(0,_.p)(this.A,this));" +
                   "return this};\n" +
                "var Eq=function(a){_.u.call(this);this.D=a;this.A=this.o=null;this.F=0;this.C={};this.w=!1;a=window" +
                ".navigator.userAgent;0<=a.indexOf(\"MSIE\")&&0<=a.indexOf(\"Trident\")&&(a=/\\b(?:MSIE|rv)[: ]" +
                "([^\\);]+)(\\)|;)/.exec(a))&&a[1]&&9>parseFloat(a[1])&&(this.w=!0)};_.L(Eq,_.u);\n" +
                "var Fq=function(a,b,c){if(!a.w)if(c instanceof Array)for(var d in c)Fq(a,b,c[d]);else{d=(0,_.p)(a.G," +
                 "a,b);var e=a.F+c;a.F++;b.setAttribute(\"data-eqid\",e);a.C[e]=d;b&&b.addEventListener?b" +
                  ".addEventListener(c,d,!1):b&&b.attachEvent?b.attachEvent(\"on\"+c,d):a.D.log(Error(\"xa`\"+b))}};" +
                   "\n" +
                "Eq.prototype.B=function(a,b){if(this.w)return null;if(b instanceof Array){var c=null,d;for(d in b)" +
                 "{var e=this.B(a,b[d]);e&&(c=e)}return c}c=null;this.o&&this.o.type==b&&this.A==a&&(c=this.o,this" +
                ".o=null);if(d=a.getAttribute(\"data-eqid\"))a.removeAttribute(\"data-eqid\"),(d=this.C[d])?a" +
                   ".removeEventListener?a.removeEventListener(b,d,!1):a.detachEvent&&a.detachEvent(\"on\"+b,d):this" +
                ".D.log(Error(\"ya`\"+a));return c};\n" +
                "Eq.prototype.G=function(a,b){this.o=b;this.A=a;b.preventDefault?b.preventDefault():b" +
                ".returnValue=!1};\n" +
                "(function(){var a;window.gbar&&window.gbar._LDD?a=window.gbar._LDD:a=[];var b=_.ak();Aq(window,_.H(_" +
                 ".A(b,8)));b=_.Kc();var c=_.cl();a=new _.fq(b,_.E(_.K(),yq,17)||new yq,a,c,_.tq());_.Va(\"m\",a);var" +
                " d=function(){_.q(\"gbar.qm\",(0,_.p)(function(e){try{e()}catch(f){c.log(f)}},this));_.ld(\"api\")" +
                   ".Ma()};_.G(_.B(b,18),!0)?a.D(d):(b=_.J(_.A(b,19),200),b=(0,_.p)(a.D,a,d,b),_.hl(b))})();wq" +
                    "(document,\"DOMContentLoaded\");wq(window,\"load\");\n" +
                "_.q(\"gbar.ldb\",_.p(_.gl.A,_.gl,_.Ic));\n" +
                "_.q(\"gbar.mls\",function(){});\n" +
                "_.Va(\"eq\",new Eq(_.cl()));\n" +
                "_.Va(\"gs\",(new Dq).init(_.Qj(),_.E(_.K(),_.jq,5)||new _.jq,_.E(_.K(),_.bq,6)||new _.bq));\n" +
                "(function(){for(var a=function(e){return function(){_.uq(44,{n:e})}},b=0;b<_.Ya.length;b++){var " +
                 "c=\"gbar.\"+_.Ya[b];_.q(c,a(c))}var d=_.Qa.V();_.Ra(d,\"api\").Ma();zq(_.Ra(d,\"m\"),function(){_" +
                  ".Ra(d,\"api\").Ma()})})();\n" +
                "var Gq=function(a){_.hl(function(){var b=document.querySelector(\".\"+a);b&&(b=b.querySelector(\"" +
                ".gb_B\"))&&Fq(_.ld(\"eq\"),b,\"click\")})};\n" +
                "var Hq=document.querySelector(\".gb_A\"),Iq=/(\\s+|^)gb_dg(\\s+|$)/;Hq&&!Iq.test(Hq.className)&&Gq" +
                "(\"gb_A\");\n" +
                "var Jq=new Bq(_.cl());_.Va(\"dd\",Jq);_.q(\"gbar.close\",(0,_.p)(Jq.We,Jq));_.q(\"gbar.cls\",(0,_.p)" +
                "(Jq.zg,Jq));_.q(\"gbar.abh\",(0,_.p)(Jq.uc,Jq,0));_.q(\"gbar.adh\",(0,_.p)(Jq.uc,Jq,1));_.q(\"gbar" +
                ".ach\",(0,_.p)(Jq.uc,Jq,2));_.q(\"gbar.aeh\",(0,_.p)(Jq.ij,Jq));_.q(\"gbar.bsy\",(0,_.p)(Jq.ji,Jq)" +
                   ");_.q(\"gbar.op\",(0,_.p)(Jq.wg,Jq));\n" +
                "Gq(\"gb_Ea\");\n" +
                "_.hl(function(){var a=document.querySelector(\".gb_qc\");a&&Fq(_.ld(\"eq\"),a,\"click\")});\n" +
                "_.q(\"gbar.qfgw\",(0,_.p)(document.getElementById,document,\"gbqfqw\"));_.q(\"gbar.qfgq\",(0,_.p)" +
                 "(document.getElementById,document,\"gbqfq\"));_.q(\"gbar.qfgf\",(0,_.p)(document.getElementById," +
                  "document,\"gbqf\"));_.q(\"gbar.qfsb\",(0,_.p)(document.getElementById,document,\"gbqfb\"));\n" +
                "\n" +
                "}catch(e){_._DumpException(e)}\n" +
                "})(this.gbar_);\n" +
                "// Google Inc.\n" +
                "</script><div class=\"gb_va\"></div><style>@-webkit-keyframes " +
                 "gb__a{0%{opacity:0}50%{opacity:1}}@keyframes gb__a{0%{opacity:0}50%{opacity:1}}" +
                ".gb_va{display:none!important}.gb_wa{visibility:hidden}.gb_c .gbqfi::before{left:-428px;top:0}" +
                   ".gb_Mb .gbqfb:focus .gbqfi{outline:1px dotted #fff}.gb_c .gb_A .gb_B::before,.gb_c.gb_C .gb_A " +
                ".gb_B::before{left:-132px;top:-38px}.gb_c.gb_h .gb_A .gb_B::before{left:-463px;top:-35px}.gb_Mb " +
 ".gb_I{position:relative}.gb_A .gb_B:hover,.gb_A .gb_B:focus{opacity:.85}.gb_h .gb_A " +
                ".gb_B:hover,.gb_h .gb_A .gb_B:focus{opacity:1}@media (min-resolution:1.25dppx)," +
                "(-webkit-min-device-pixel-ratio:1.25),(min-device-pixel-ratio:1.25){.gb_m " +
                        ".gb_p{background-image:url('https://ssl.gstatic.com/gb/images/p2_547d5a41.png')}}.gb_c " +
                ".gb_qc .gb_sc::before{left:0;top:-35px}.gb_c.gb_h .gb_qc .gb_sc::before{left:-296px;top:0}" +
                          ".gb_c.gb_C .gb_qc .gb_sc::before{left:-97px;top:0}.gb_c " +
                           ".gb_ia{background-image:none!important}.gb_c .gb_tc{visibility:visible}.gb_Mb .gb_ne " +
                            "span{background:transparent}.gb_Ld{color:#ffffff;font-size:13px;font-weight:bold;" +
                             "height:25px;line-height:19px;padding-top:5px;padding-left:12px;position:relative;" +
                "background-color:#4d90fe}.gb_Ld .gb_Md{color:#ffffff;cursor:default;font-size:22px;" +
                "font-weight:normal;position:absolute;right:12px;top:5px}.gb_Ld .gb_qd,.gb_Ld " +
                ".gb_nd{color:#ffffff;display:inline-block;font-size:11px;margin-left:16px;padding:0 " +
                "8px;white-space:nowrap}.gb_Nd{background:none;background-image:-webkit-gradient" +
                "(linear,left top,left bottom,from(rgba(0,0,0,0.16)),to(rgba(0,0,0,0.2)));" +
                                   "background-image:-webkit-linear-gradient(top,rgba(0,0,0,0.16),rgba(0,0,0,0.2));" +
                "background-image:linear-gradient(top,rgba(0,0,0,0.16),rgba(0,0,0,0.2));" +
                                     "background-image:-webkit-linear-gradient(top,rgba(0,0,0,0.16),rgba(0,0,0,0.2));" +
                                      "border-radius:2px;border:1px solid #dcdcdc;border:1px solid rgba(0,0,0,0.1);" +
                                       "cursor:default!important;filter:progid:DXImageTransform.Microsoft.gradient" +
                "(startColorstr=#160000ff,endColorstr=#220000ff);" +
                                         "text-decoration:none!important;-webkit-border-radius:2px}" +
                ".gb_Nd:hover{background:none;background-image:-webkit-gradient(linear,left" +
                                           " top,left bottom,from(rgba(0,0,0,0.14)),to(rgba(0,0,0,0.2)));" +
                "background-image:-webkit-linear-gradient(top,rgba(0,0,0,0.14),rgba(0,0," +
                "0,0.2));background-image:linear-gradient(top,rgba(0,0,0,0.14),rgba(0,0," +
                                              "0,0.2));background-image:-webkit-linear-gradient(top,rgba(0,0,0,0.14)," +
                                               "rgba(0,0,0,0.2));border:1px solid rgba(0,0,0,0.2);box-shadow:0 1px " +
                "1px rgba(0,0,0,0.1);-webkit-box-shadow:0 1px 1px rgba(0,0,0,0.1);" +
                "filter:progid:DXImageTransform.Microsoft.gradient" +
                                                  "(startColorstr=#14000000,endColorstr=#22000000)}" +
                                                   ".gb_Nd:active{box-shadow:inset 0 1px 2px rgba(0,0,0,0.3);" +
                "-webkit-box-shadow:inset 0 1px 2px rgba(0,0,0,0.3)}.gb_hd" +
                                                     ".gb_id{padding:0}.gb_id .gb_D{background:#ffffff;border:solid " +
                "1px transparent;-webkit-border-radius:8px;border-radius:8px;" +
                                                       "-webkit-box-sizing:border-box;box-sizing:border-box;" +
                "padding:16px;right:0;top:72px;-webkit-box-shadow:0 1px 2px 0" +
                " rgba(65,69,73,0.3),0 3px 6px 2px rgba(65,69,73,0.15);" +
                                                          "box-shadow:0 1px 2px 0 rgba(65,69,73,0.3),0 3px 6px 2px " +
                                                           "rgba(65,69,73,0.15)}a.gb_jd{color:#5f6368!important;" +
                                                            "font-size:22px;height:24px;opacity:1;padding:8px;" +
                "position:absolute;right:8px;top:8px;" +
                                                              "text-decoration:none!important;width:24px}a" +
                                                               ".gb_jd:focus,a.gb_jd:active,a" +
                                                                ".gb_jd:focus:hover{background-color:#e8eaed;" +
                                                                 "-webkit-border-radius:50%;border-radius:50%;" +
                                                                  "outline:none}a.gb_jd:hover{background-color" +
                                                                   ":#f1f3f4;-webkit-border-radius:50%;" +
                                                                    "border-radius:50%;outline:none}svg" +
                                                                     ".gb_kd{fill:#5f6368;opacity:1}.gb_ld{padding:0;" +
                                                                      "white-space:normal;display:table}" +
                                                                       ".gb_md{line-height:normal;font-family:Roboto," +
                                                                        "RobotoDraft,Helvetica,Arial,sans-serif}" +
                                                                         ".gb_id .gb_1:active{outline:none;" +
                                                                          "-webkit-box-shadow:0 4px 5px rgba(0,0,0," +
                                                                           ".16);box-shadow:0 4px 5px rgba(0,0,0,.16)" +
                                                                            "}.gb_W.gb_nd.gb_od{-webkit-border-radius" +
                                                                             ":4px;border-radius:4px;cursor:pointer;" +
                                                                              "height:16px;color:#5f6368;" +
                "font-family:Google Sans,Roboto," +
                "RobotoDraft,Helvetica,Arial," +
                "sans-serif;font-weight:500;" +
                                                                                  "letter-spacing:.25px;" +
                                                                                   "line-height:16px;padding:8px 6px;" +
                                                                                    "text-transform:none;" +
                                                                                     "-webkit-font-smoothing" +
                                                                                      ":antialiased}.gb_W" +
                                                                                       ".gb_nd:hover{background-color" +
                                                                                        ":#f8f9fa}.gb_W.gb_nd:focus," +
                                                                                         ".gb_W.gb_nd:hover:focus" +
                                                                                          "{background-color:#f1f3f4;" +
                                                                                           "border-color:transparent}" +
                                                                                            ".gb_W.gb_nd:active" +
                                                                                             "{background-color" +
                                                                                              ":#f1f3f4;" +
                                                                                               "-webkit-box-shadow:0 " +
                                                                                                "1px 2px 0 rgba(60," +
                                                                                                 "64,67,0.3),0 1px " +
                                                                                                  "3px 1px rgba(60," +
                                                                                                   "64,67,0.15);" +
                                                                                                    "box-shadow:0 1px" +
                                                                                                     " 2px 0 rgba(60," +
                                                                                                      "64,67,0.3),0 " +
                                                                                                       "1px 3px 1px " +
                                                                                                        "rgba(60,64," +
                                                                                                         "67,0.15)}" +
                                                                                                          ".gb_gd" +
                                                                                                           "{color" +
                                                                                                            ":#5f6368;font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:14px;letter-spacing:.25px;line-height:20px;margin:0;margin-bottom:5px}.gb_pd{text-align:right;font-size:14px;padding-bottom:0;white-space:nowrap}.gb_pd .gb_qd{margin-left:12px;text-transform:none}a.gb_1.gb_qd:hover{background-color:#2b7de9;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}a.gb_1.gb_qd:focus,a.gb_1.gb_qd:hover:focus{background-color:#5094ed;border-color:transparent;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}a.gb_1.gb_qd:active{background-color:#63a0ef;-webkit-box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15);box-shadow:0 1px 2px 0 rgba(66,133,244,0.3),0 1px 3px 1px rgba(66,133,244,0.15)}.gb_pd .gb_qd.gb_rd{padding-left:6px;padding-right:14px}.gb_pd .gb_od.gb_qd img{background-color:inherit;-webkit-border-radius:initial;border-radius:initial;height:18px;margin:0 8px 0 4px;vertical-align:text-top;width:18px}.gb_sd .gb_ld .gb_td .gb_od{border:2px solid transparent}.gb_sd .gb_ld .gb_td .gb_od:focus:after,.gb_sd .gb_ld .gb_td .gb_od:hover:after{background-color:transparent}.gb_md{background-color:#404040;color:#fff;padding:16px;position:absolute;top:36px;min-width:328px;max-width:650px;right:0;-webkit-border-radius:2px;border-radius:2px;-webkit-box-shadow:4px 4px 12px rgba(0,0,0,0.4);box-shadow:4px 4px 12px rgba(0,0,0,0.4)}.gb_md a,.gb_md a:visited{color:#5e97f6;text-decoration:none}.gb_ud{text-transform:uppercase}.gb_vd{padding-left:50px}.gb_wd{color:#3c4043;font-family:Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:16px;font-weight:500;letter-spacing:.1px;line-height:20px;margin:0;margin-bottom:12px}.gb_gd a.gb_yd{text-decoration:none;color:#5e97f6}.gb_gd a.gb_yd:visited{color:#5e97f6}.gb_gd a.gb_yd:hover,.gb_gd a.gb_yd:active{text-decoration:underline}.gb_zd{position:absolute;background:transparent;top:-999px;z-index:-1;visibility:hidden;margin-top:1px;margin-left:1px}#gb .gb_id{margin:0}.gb_id .gb_pb{background:#4d90fe;border:2px solid transparent;-webkit-box-sizing:border-box;box-sizing:border-box;font-weight:500;margin-top:21px;min-width:70px;text-align:center;-webkit-font-smoothing:antialiased}.gb_id a.gb_1{background:#1a73e8;-webkit-border-radius:4px;border-radius:4px;color:#ffffff;font-family:Google Sans,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:14px;font-weight:500;letter-spacing:.25px;line-height:16px;padding:8px 22px;-webkit-font-smoothing:antialiased}.gb_id a.gb_1.gb_Ad{background:#d93025}.gb_id a.gb_1.gb_Ad:hover{background-color:#cc3127}.gb_id a.gb_1.gb_Ad:focus,.gb_id a.gb_1.gb_Ad:focus:hover{background-color:#b3332c}.gb_id a.gb_1.gb_Ad:active,.gb_id a.gb_1.gb_Ad:focus:active{background-color:#a6342e}.gb_id:not(.gb_sd) a.gb_1{float:right}#gb .gb_id a.gb_pb.gb_pb{color:#ffffff;cursor:pointer}.gb_id .gb_pb:hover{background:#357ae8;border-color:#2f5bb7}.gb_Bd,.gb_td{display:table-cell}.gb_Bd{vertical-align:middle}.gb_Bd img{height:48px;padding-left:4px;padding-right:20px;width:48px}.gb_td{padding-left:13px;width:100%}.gb_id .gb_td{padding-top:4px;min-width:326px;padding-left:0;width:326px}.gb_id.gb_Cd .gb_td{min-width:254px;width:254px}.gb_id:not(.gb_sd) .gb_td{padding-top:32px}.gb_Dd{display:block;display:inline-block;padding:1em 0 0 0;position:relative;width:100%}.gb_Ed{color:#ff0000;font-style:italic;margin:0;padding-left:46px}.gb_Dd .gb_Fd{float:right;margin:-20px 0;width:-webkit-calc(100% - 46px);width:calc(100% - 46px)}.gb_Hd svg{fill:grey}.gb_Hd.gb_Id svg{fill:#4285f4}.gb_Dd .gb_Fd label:after{background-color:#4285f4}.gb_Hd{display:inline;float:right;margin-right:22px;position:relative;top:2px}.gb_Pf{margin-bottom:32px;font-size:small}.gb_Pf .gb_Qf{margin-right:5px}.gb_Pf .gb_Rf{color:red}.gb_6c{display:none}.gb_6c.gb_Ec{display:block}.gb_7c{background-color:#fff;-webkit-box-shadow:0 1px 0 rgba(0,0,0,0.08);box-shadow:0 1px 0 rgba(0,0,0,0.08);color:#000;position:relative;z-index:986}.gb_8c{height:40px;padding:16px 24px;white-space:nowrap}.gb_9c{position:fixed;bottom:16px;padding:16px;right:16px;white-space:normal;width:328px;-webkit-transition:width .2s,bottom .2s,right .2s;transition:width .2s,bottom .2s,right .2s;-webkit-border-radius:2px;border-radius:2px;-webkit-box-shadow:0 5px 5px -3px rgba(0,0,0,0.2),0 8px 10px 1px rgba(0,0,0,0.14),0 3px 14px 2px rgba(0,0,0,0.12);box-shadow:0 5px 5px -3px rgba(0,0,0,0.2),0 8px 10px 1px rgba(0,0,0,0.14),0 3px 14px 2px rgba(0,0,0,0.12)}@media (max-width:400px){.gb_7c.gb_9c{max-width:368px;width:auto;bottom:0;right:0}}.gb_7c .gb_pb{border:0;font-weight:500;font-size:14px;line-height:36px;min-width:32px;padding:0 16px;vertical-align:middle}.gb_7c .gb_pb:before{content:'';height:6px;left:0;position:absolute;top:-6px;width:100%}.gb_7c .gb_pb:after{bottom:-6px;content:'';height:6px;left:0;position:absolute;width:100%}.gb_7c .gb_pb+.gb_pb{margin-left:8px}.gb_ad{height:48px;padding:4px;margin:-8px 0 0 -8px}.gb_9c .gb_ad{float:left;margin:-4px}.gb_bd{font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif;overflow:hidden;vertical-align:top}.gb_8c .gb_bd{display:inline-block;padding-left:8px;width:640px}.gb_9c .gb_bd{display:block;margin-left:56px;padding-bottom:16px}.gb_cd{background-color:inherit}.gb_8c .gb_cd{display:inline-block;position:absolute;top:18px;right:24px}.gb_9c .gb_cd{text-align:right;padding-right:24px;padding-top:6px}.gb_cd .gb_dd{height:1.5em;margin:-.25em 10px -.25em 0;vertical-align:text-top;width:1.5em}.gb_ed{line-height:20px;font-size:16px;font-weight:700;color:rgba(0,0,0,.87)}.gb_9c .gb_ed{color:rgba(0,0,0,.87);font-size:16px;line-height:20px;padding-top:8px}.gb_8c .gb_ed,.gb_8c .gb_fd{width:640px}.gb_fd .gb_gd,.gb_fd{line-height:20px;font-size:13px;font-weight:400;color:rgba(0,0,0,.54)}.gb_9c .gb_fd .gb_gd{font-size:14px}.gb_9c .gb_fd{padding-top:12px}.gb_9c .gb_fd a{color:rgba(66,133,244,1)}.gb_Mb .gb_Ra{border:0;border-left:1px solid rgba(0,0,0,.2);border-top:1px solid rgba(0,0,0,.2);height:14px;width:14px;-webkit-transform:rotate(45deg);transform:rotate(45deg)}.gb_Mb .gb_Qa{border:0;border-left:1px solid rgba(0,0,0,.2);border-top:1px solid rgba(0,0,0,.2);height:14px;width:14px;-webkit-transform:rotate(45deg);transform:rotate(45deg);border-color:#fff;background:#fff}.gb_c .gb_qg::before{clip:rect(25px 235px 41px 219px);left:-197px;top:-3px}.gb_c .gb_sc.gb_rg{position:absolute}.gb_c .gb_rg::before{clip:rect(0 210px 16px 194px);left:-164px;top:22px}.gb_c .gb_Ha .gb_qg::before{left:-189px}@media (min-resolution:1.25dppx),(-webkit-min-device-pixel-ratio:1.25),(min-device-pixel-ratio:1.25){.gb_c .gb_qg::before{clip:rect(50px 470px 82px 438px)}.gb_c .gb_rg::before{clip:rect(0 420px 32px 388px)}}.gb_c .gb_sc,.gb_c .gbii,.gb_c .gbip{background-image:none;overflow:hidden;position:relative}.gb_c .gb_sc::before{content:url('//ssl.gstatic.com/gb/images/i1_1967ca6a.png');position:absolute}@media (min-resolution:1.25dppx),(-webkit-min-device-pixel-ratio:1.25),(min-device-pixel-ratio:1.25){.gb_c .gb_sc::before{content:url('//ssl.gstatic.com/gb/images/i2_2ec824b0.png');-webkit-transform:scale(.5);transform:scale(.5);-webkit-transform-origin:0 0;transform-origin:0 0}}.gb_Mb a:focus{outline:1px dotted #fff!important}sentinel{}</style><script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">(function(){var m=['CB0Pik','[\\x22psy-ab\\x22,\\x22gws-wiz\\x22,\\x22\\x22,\\x22\\x22,null,0,0,null,0,11,\\x22zh-CN\\x22,\\x22\\x22,\\x22\\x22,\\x22IimLXYibGcTXhwPXhL-ADA\\x22,0,\\x22zh-CN\\x22,null,null,null,null,null,3,null,0,5,null,null,null,null,null,0,0,0,null,null,null,null,-1,null,0,null,0,0,\\x22\\x22,0,null,0,\\x22\\x22]\\n','CB0Pio','[null,null,1,30000,null,null,null,2,null,null,3,null,null,null,null,null,1,null,null,null,null,null,null,null,null,null,null,null,0,null,null,null,null,null,null,null,null,\\x221569401122\\x22,null,null,null,null,null,1,null,null,[\\x2286400000\\x22,\\x22604800000\\x22,2.0]\\n,null,1]\\n'];var a=m;window.W_jd=window.W_jd||{};for(var b=0;b<a.length;b+=2)window.W_jd[a[b]]=JSON.parse(a[b+1]);})();(function(){var s='/images/nav_logo299.webp';var k=this||self,l=function(){},m=function(a){var b=typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.propertyIsEnumerable&&\n" +
                "!a.propertyIsEnumerable(\"call\"))return\"function\"}else return\"null\";else if" +
                 "(\"function\"==b&&\"undefined\"==typeof a.call)return\"object\";return b},n=function(a){var " +
                  "b=typeof a;return\"object\"==b&&null!=a||\"function\"==b},aa=function(a,b){function c(){}c" +
                   ".prototype=b.prototype;a.l=b.prototype;a.prototype=new c;a.prototype.constructor=a};var ba=Array" +
                    ".prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b)" +
                     "{if(\"string\"==typeof a)return\"string\"==typeof b&&1==b.length?a.indexOf(b,0):-1;for(var c=0;" +
                      "c<a.length;c++)if(c in a&&a[c]===b)return c;return-1};var p=String.prototype.trim?function(a)" +
                "{return a.trim()}:function(a){return/^[\\s\\xa0]*([\\s\\S]*?)[\\s\\xa0]*$/.exec(a)[1]}," +
                        "q=function(a,b){return a<b?-1:a>b?1:0};var r;a:{var t=k.navigator;if(t){var u=t.userAgent;if" +
                "(u){r=u;break a}}r=\"\"};var v=function(a){v[\" \"](a);return a};v[\" \"]=l;var ca=-1!=r" +
                          ".indexOf(\"Opera\"),w=-1!=r.indexOf(\"Trident\")||-1!=r.indexOf(\"MSIE\"),da=-1!=r.indexOf" +
                           "(\"Edge\"),x=-1!=r.indexOf(\"Gecko\")&&!(-1!=r.toLowerCase().indexOf(\"webkit\")&&-1==r" +
                            ".indexOf(\"Edge\"))&&!(-1!=r.indexOf(\"Trident\")||-1!=r.indexOf(\"MSIE\"))&&-1==r" +
                             ".indexOf(\"Edge\"),ea=-1!=r.toLowerCase().indexOf(\"webkit\")&&-1==r.indexOf(\"Edge\")," +
                              "y=function(){var a=k.document;return a?a.documentMode:void 0},z;a:{var A=\"\"," +
                "B=function(){var a=r;if(x)return/rv:([^\\);]+)(\\)|;)/.exec(a);if(da)return/Edge\\/" +
                                "([\\d\\.]+)/.exec(a);if(w)return/\\b(?:MSIE|rv)[:]([^\\);]+)(\\)|;)/.exec(a);if(ea)" +
                                 "return/WebKit\\/(\\S+)/.exec(a);if(ca)return/(?:Version)[ \\/]?(\\S+)/.exec(a)}();" +
                                  "B&&(A=B?B[1]:\"\");if(w){var C=y();if(null!=C&&C>parseFloat(A)){z=String(C);break " +
                                   "a}}z=A}var fa=z,D={},E;E=k.document&&w?y():void 0;var F;(F=!w)||(F=9<=Number(E));" +
                                    "var G=F,H;if(H=w){var I;if(Object.prototype.hasOwnProperty.call(D,\"9\"))" +
                                     "I=D[\"9\"];else{for(var J=0,K=p(String(fa)).split(\".\"),L=p(\"9\").split(\"" +
                                      ".\"),ha=Math.max(K.length,L.length),M=0;0==J&&M<ha;M++){var O=K[M]||\"\"," +
                                       "P=L[M]||\"\";do{var Q=/(\\d*)(\\D*)(.*)/.exec(O)||[\"\",\"\",\"\",\"\"],R=/" +
                                        "(\\d*)(\\D*)(.*)/.exec(P)||[\"\",\"\",\"\",\"\"];if(0==Q[0].length&&0==R[0]" +
                                         ".length)break;J=q(0==Q[1].length?0:parseInt(Q[1],10),0==R[1]" +
                                          ".length?0:parseInt(R[1],10))||q(0==Q[2].length,0==R[2].length)||q(Q[2]," +
                                           "R[2]);O=Q[3];P=R[3]}while(0==J)}I=D[\"9\"]=0<=\n" +
                "J}H=!I}var ia=H,ja=function(){if(!k.addEventListener||!Object.defineProperty)return!1;var a=!1," +
                 "b=Object.defineProperty({},\"passive\",{get:function(){a=!0}});try{k.addEventListener(\"test\",l,b)" +
                  ",k.removeEventListener(\"test\",l,b)}catch(c){}return a}();var S=function(a,b){this.type=a;this" +
                   ".a=this.target=b};S.prototype.g=function(){};var T=function(a,b){S.call(this,a?a.type:\"\");this" +
                    ".relatedTarget=this.a=this.target=null;this.button=this.screenY=this.screenX=this.clientY=this" +
                     ".clientX=0;this.key=\"\";this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this" +
     ".pointerId=0;this.pointerType=\"\";this.j=null;if(a){var c=this.type=a.type,e=a" +
                       ".changedTouches&&a.changedTouches.length?a.changedTouches[0]:null;this.target=a.target||a" +
                ".srcElement;this.a=b;var d=a.relatedTarget;if(d){if(x){a:{try{v(d.nodeName);var f=!0;break " +
                         "a}catch(g){}f=!1}f||\n" +
                "(d=null)}}else\"mouseover\"==c?d=a.fromElement:\"mouseout\"==c&&(d=a.toElement);this" +
                 ".relatedTarget=d;e?(this.clientX=void 0!==e.clientX?e.clientX:e.pageX,this.clientY=void 0!==e" +
                  ".clientY?e.clientY:e.pageY,this.screenX=e.screenX||0,this.screenY=e.screenY||0):(this.clientX=void" +
                   " 0!==a.clientX?a.clientX:a.pageX,this.clientY=void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a" +
                    ".screenX||0,this.screenY=a.screenY||0);this.button=a.button;this.key=a.key||\"\";this.ctrlKey=a" +
                ".ctrlKey;this.altKey=a.altKey;this.shiftKey=\n" +
                "a.shiftKey;this.metaKey=a.metaKey;this.pointerId=a.pointerId||0;this.pointerType=\"string\"==typeof " +
                 "a.pointerType?a.pointerType:la[a.pointerType]||\"\";this.j=a;a.defaultPrevented&&this.g()}};aa(T,S)" +
                  ";var la={2:\"touch\",3:\"pen\",4:\"mouse\"};T.prototype.g=function(){T.l.g.call(this);var a=this" +
                   ".j;if(a.preventDefault)a.preventDefault();else if(a.returnValue=!1,ia)try{if(a.ctrlKey||112<=a" +
                    ".keyCode&&123>=a.keyCode)a.keyCode=-1}catch(b){}};var U=\"closure_listenable_\"+(1E6*Math.random" +
                     "()|0),ma=0;var na=function(a,b,c,e,d){this.listener=a;this.a=null;this.src=b;this.type=c;this" +
                      ".capture=!!e;this.g=d;this.key=++ma;this.h=this.i=!1},oa=function(a){a.h=!0;a.listener=null;a" +
                       ".a=null;a.src=null;a.g=null};var V=function(a){this.src=a;this.a={};this.g=0};V.prototype" +
                        ".add=function(a,b,c,e,d){var f=a.toString();a=this.a[f];a||(a=this.a[f]=[],this.g++);var g;" +
                         "a:{for(g=0;g<a.length;++g){var h=a[g];if(!h.h&&h.listener==b&&h.capture==!!e&&h.g==d)break " +
                          "a}g=-1}-1<g?(b=a[g],c||(b.i=!1)):(b=new na(b,this.src,f,!!e,d),b.i=c,a.push(b));return b};" +
                           "var W=\"closure_lm_\"+(1E6*Math.random()|0),X={},pa=0,ra=function(a,b,c,e,d){if(e&&e" +
 ".once)qa(a,b,c,e,d);else if(\"array\"==m(b))for(var f=0;f<b.length;f++)ra(a,b[f],c,e,d);" +
                             "else c=sa(c),a&&a[U]?a.a(b,c,n(e)?!!e.capture:!!e,d):ta(a,b,c,!1,e,d)},ta=function(a,b," +
                              "c,e,d,f){if(!b)throw Error(\"a\");var g=n(d)?!!d.capture:!!d,h=Y(a);h||(a[W]=h=new V" +
 "(a));c=h.add(b,c,e,g,f);if(!c.a){e=ua();c.a=e;e.src=a;e.listener=c;if(a" +
                                ".addEventListener)ja||(d=g),void 0===d&&(d=!1),a.addEventListener(b.toString(),e,d);" +
    "else if(a.attachEvent)a.attachEvent(va(b.toString()),e);else if(a.addListener&&a" +
 ".removeListener)a.addListener(e);else throw Error(\"b\");pa++}},ua=function(){var " +
 "a=wa,b=G?function(c){return a.call(b.src,b.listener,c)}:function(c){c=a.call(b" +
                                    ".src,b.listener,c);if(!c)return c};return b},qa=function(a,b,c,e,d){if" +
                                     "(\"array\"==m(b))for(var f=0;f<b.length;f++)qa(a,b[f],c,e,d);else c=sa(c)," +
                "a&&a[U]?a.g(b,c,n(e)?!!e.capture:!!e,d):ta(a,b,c,!0,e,d)},va=function(a)" +
                                       "{return a in X?X[a]:X[a]=\"on\"+a},ya=function(a,b,c,e){var d=!0;if(a=Y(a))if" +
                                        "(b=a.a[b.toString()])for(b=\n" +
                "b.concat(),a=0;a<b.length;a++){var f=b[a];f&&f.capture==c&&!f.h&&(f=xa(f,e),d=d&&!1!==f)}return d}," +
                 "xa=function(a,b){var c=a.listener,e=a.g||a.src;if(a.i&&\"number\"!=typeof a&&a&&!a.h){var d=a.src;" +
     "if(d&&d[U])d.j(a);else{var f=a.type,g=a.a;d.removeEventListener?d.removeEventListener(f,g,a" +
                   ".capture):d.detachEvent?d.detachEvent(va(f),g):d.addListener&&d.removeListener&&d.removeListener" +
                    "(g);pa--;if(f=Y(d)){g=a.type;var h;if(h=g in f.a){h=f.a[g];var N=ba(h,a),ka;(ka=0<=N)&&Array" +
 ".prototype.splice.call(h,N,1);h=ka}h&&(oa(a),0==f.a[g].length&&(delete f.a[g],f.g--));0==f.g&&" +
                      "(f.src=null,d[W]=null)}else oa(a)}}return c.call(e,b)},wa=function(a,b){if(a.h)return!0;if(!G)" +
    "{var c;if(!(c=b))a:{c=[\"window\",\"event\"];for(var e=k,d=0;d<c.length;d++)if(e=e[c[d]]," +
                        "null==e){c=null;break a}c=e}d=c;c=new T(d,this);e=!0;if(!(0>d.keyCode||void 0!=d" +
        ".returnValue)){a:{var f=!1;if(0==d.keyCode)try{d.keyCode=-1;break a}catch(N){f=!0}if" +
                          "(f||void 0==d.returnValue)d.returnValue=!0}d=[];for(f=c.a;f;f=f.parentNode)d.push(f);f=a" +
                           ".type;for(var g=d.length-1;0<=g;g--){c.a=d[g];var h=ya(d[g],f,!0,c);e=e&&h}for(g=0;g<d" +
                            ".length;g++)c.a=d[g],h=ya(d[g],f,!1,c),e=e&&h}return e}return xa(a,new T(b,this))}," +
                             "Y=function(a){a=a[W];return a instanceof V?a:null},Z=\"__closure_events_fn_\"+(1E9*Math" +
                              ".random()>>>0),sa=function(a){if(\"function\"==m(a))return a;a[Z]||(a[Z]=function(b)" +
        "{return a.handleEvent(b)});return a[Z]};ra(document,\"DOMContentLoaded\",function()" +
                                "{document.f&&(document.f.q.getAttribute(\"data-saf\")||document.f.q.focus());document.gbqf&&document.gbqf.q.focus();document.images&&((new Image).src=s)});})();</script></div><textarea class=\"csi\" name=\"csi\" style=\"display:none\"></textarea><script nonce=\"oqM4gvmDpObPXEhX9c/FOA==\">(function(){var k=function(a,b){var c=window,d=document;if(!a)return 0;if(!b){if(\"none\"==a.style.display)return 0;if(d.defaultView&&d.defaultView.getComputedStyle){var e=d.defaultView.getComputedStyle(a);if(e&&(\"hidden\"==e.visibility||\"0px\"==e.height&&\"0px\"==e.width))return 0}}if(!a.getBoundingClientRect)return 1;var f=a.getBoundingClientRect();e=f.left+c.pageXOffset;var m=f.top+c.pageYOffset,h=f.width;f=f.height;return!b&&0>=f&&0>=h?0:0>m+f?2:m>=(c.innerHeight||d.documentElement.clientHeight)?3:0>e+h||e>=(c.innerWidth||\n" +
                "d.documentElement.clientWidth)?4:1};var l,n=[\"aft\",\"hct\",\"prt\",\"pprt\",\"sct\"];function p(a){return(a=q.search.match(new RegExp(\"[?&]\"+a+\"=(\\\\d+)\")))?Number(a[1]):-1}function r(a){l.removeEventListener(\"click\",r);a.stopPropagation&&a.stopPropagation()}var q=location;var t=0,u=0,v=0,w=0,x=0,y,z;function A(a,b,c,d){var e=google.timers.load.t[a];e&&(c||d&&b&&b<e)||google.tick(\"load\",a,b)}function C(a,b){b=b||google.time();A(\"aft\",b,!1,!0);++x;D();E(a,b)}function E(a,b){var c=b||google.time();A(\"iml\",c,!1,!0);++u;F()}function F(){z||u!=t||google.c.u(\"il\")}\n" +
                "function D(){if(!y&&x==v){var a=\"&ima=\"+v+\"&imad=\"+w;google.timers.load.e.imn&&(a+=\"&imn=\"+google.timers.load.e.imn);var b=google.timers.load,c=p(\"qsubts\");if(0<c){var d=p(\"fbts\");0<d&&(b.t.start=Math.max(c,d))}var e=b.t,f=e.start;d={wsrt:b.wsrt};for(var m=0,h;h=n[m++];){var B=e[h];B&&f&&(d[h]=B-f)}0<c&&(d.gsasrt=Math.abs(b.t.start-c));b=\"/gen_204?s=\"+google.sn+\"&t=aft&atyp=csi&ei=\"+google.kEI+\"&rt=\";c=\"\";for(var g in d)b+=c+g+\".\"+d[g],c=\",\";google.cshid&&(b+=\"&cshid=\"+google.cshid);(g=window.performance&&\n" +
                "window.performance.navigation)&&2==g.type&&(b+=\"&bb=1\");\"gsasrt\"in d&&(g=p(\"qsd\"),0<g&&(b+=\"&qsd=\"+g));google.kBL&&(b+=\"&bl=\"+google.kBL);a=b+(a||\"\");(l=document.getElementById(\"csi-ping\"))?(l.addEventListener(\"click\",r),l.setAttribute(\"ping\",a),l.click()):navigator.sendBeacon?navigator.sendBeacon(a,\"\"):google.log(\"\",\"\",a)}}\n" +
                "function G(a){var b=\"string\"!=typeof a.src||!a.src,c=!!a.getAttribute(\"data-bsrc\"),d=a.getAttribute(\"data-deferred\"),e=(b||a.complete)&&!d&&!c;b=e&&Number(a.getAttribute(\"data-iml\"))||0;c=k(a,c);a.setAttribute(\"data-atf\",c);++t;e&&!b||a.hasAttribute(\"data-noaft\")?++u:(e=(c=1==c)?C:E,c&&(++v,d&&++w),b?e(void 0,b):google.rll(a,!0,e))};(function(){var a=google.time();if(google.timers&&google.timers.load.t){z=y=!0;google.c.b(\"il\");for(var b=document.getElementsByTagName(\"img\"),c=0,d=void 0;d=b[c++];)G(d);A(\"prt\",a);A(\"aft\",a,!0);A(\"iml\",a,!0);google.c.e(\"load\",\"imn\",String(t));y&&(y=!1,D());z=!1;F();google.rll(window,!1,function(){A(\"ol\",void 0);google.c.u(\"pr\")})}})();}).call(this);google.drty&&google.drty();</script></body></html>");
    }

    /**
     * 测试附件邮件
     *
     * @author side.wang
     * @since 2019年9月25日
     */
    @Test
    public void testSendAttachmentsMail() {
        mss.sendAttachmentsMail("2523890679@qq.com", "test for send attachment mail", "请查收附件", "F:\\SQLshell\\chutianyun.sql");
    }

    /**
     * 测试静态资源邮件
     *
     * @author side.wang
     * @since 2019年9月25日
     */
    @Test
    public void sendInlineResourceMail() {
        String fileId = "png01";
        String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + fileId + "\'></body></html>";
        String imgPath = "C:\\Users\\side.wang\\Pictures\\Saved Pictures\\20190925203626.png";

        mss.sendInlineResourceMail("2523890679@qq.com", "主题：这是有图片的邮件", content, imgPath, fileId);
    }
}
