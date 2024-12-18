package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XpF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72859XpF {
    public ClientDisplayMethod A00;
    public C5FH A01;
    public CommentGiphyMediaInfoIntf A02;
    public C5FM A03;
    public CommentRestrictStatus A04;
    public PrivateReplyStatus A05;
    public C5FP A06;
    public C5FJ A07;
    public InterfaceC110874yz A08;
    public User A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Boolean A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T;
    public Boolean A0U;
    public Boolean A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Long A0g;
    public Long A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public List A0v;
    public List A0w;
    public List A0x;
    public List A0y;
    public List A0z;
    public List A10;
    public Map A11;
    public final InterfaceC38901rP A12;

    public final C38891rO A00() {
        C38706H2r c38706H2r;
        C5FI c5fi;
        ArrayList arrayList;
        CommentGiphyMediaInfo commentGiphyMediaInfo;
        C38707H2t c38707H2t;
        C110864yy c110864yy;
        C5FO c5fo;
        HashMap hashMap;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        C5FH c5fh = this.A01;
        if (c5fh != null) {
            c38706H2r = c5fh.EsM();
        } else {
            c38706H2r = null;
        }
        String str = this.A0i;
        String str2 = this.A0j;
        Boolean bool = this.A0A;
        Boolean bool2 = this.A0B;
        C5FJ c5fj = this.A07;
        if (c5fj != null) {
            c5fi = c5fj.F5j();
        } else {
            c5fi = null;
        }
        List list = this.A0v;
        if (list != null) {
            arrayList3 = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((InterfaceC43528JKo) it.next()).Ere());
            }
        }
        Integer num = this.A0W;
        Integer num2 = this.A0X;
        Boolean bool3 = this.A0C;
        Integer num3 = this.A0Y;
        Integer num4 = this.A0Z;
        List list2 = this.A0w;
        Long l = this.A0g;
        Long l2 = this.A0h;
        String str3 = this.A0k;
        Boolean bool4 = this.A0D;
        List list3 = this.A0x;
        List list4 = this.A0y;
        List list5 = this.A0z;
        if (list5 != null) {
            arrayList = AbstractC167007dF.A0i(list5);
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(((JLO) it2.next()).EtS());
            }
        } else {
            arrayList = null;
        }
        Integer num5 = this.A0a;
        CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf = this.A02;
        if (commentGiphyMediaInfoIntf != null) {
            commentGiphyMediaInfo = commentGiphyMediaInfoIntf.EsP();
        } else {
            commentGiphyMediaInfo = null;
        }
        Boolean bool5 = this.A0E;
        Boolean bool6 = this.A0F;
        Boolean bool7 = this.A0G;
        Boolean bool8 = this.A0H;
        Boolean bool9 = this.A0I;
        String str4 = this.A0l;
        C5FM c5fm = this.A03;
        if (c5fm != null) {
            c38707H2t = c5fm.EsQ();
        } else {
            c38707H2t = null;
        }
        ClientDisplayMethod clientDisplayMethod = this.A00;
        Boolean bool10 = this.A0J;
        Boolean bool11 = this.A0K;
        Boolean bool12 = this.A0L;
        Boolean bool13 = this.A0M;
        Boolean bool14 = this.A0N;
        Boolean bool15 = this.A0O;
        Boolean bool16 = this.A0P;
        Boolean bool17 = this.A0Q;
        Boolean bool18 = this.A0R;
        Boolean bool19 = this.A0S;
        Boolean bool20 = this.A0T;
        InterfaceC110874yz interfaceC110874yz = this.A08;
        if (interfaceC110874yz != null) {
            c110864yy = interfaceC110874yz.F5m();
        } else {
            c110864yy = null;
        }
        String str5 = this.A0m;
        String str6 = this.A0n;
        C5FP c5fp = this.A06;
        if (c5fp != null) {
            c5fo = c5fp.F4W(c1dy);
        } else {
            c5fo = null;
        }
        Map map = this.A11;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        String str7 = this.A0o;
        String str8 = this.A0p;
        Integer num6 = this.A0b;
        Integer num7 = this.A0c;
        String str9 = this.A0q;
        Integer num8 = this.A0d;
        String str10 = this.A0r;
        List list6 = this.A10;
        if (list6 != null) {
            arrayList2 = AbstractC167007dF.A0i(list6);
            Iterator it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((InterfaceC38901rP) it3.next()).F4U(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        PrivateReplyStatus privateReplyStatus = this.A05;
        String str11 = this.A0s;
        return new C38891rO(clientDisplayMethod, c38706H2r, commentGiphyMediaInfo, c38707H2t, this.A04, privateReplyStatus, c5fo, c5fi, c110864yy, this.A09, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, this.A0U, this.A0V, num, num2, num3, num4, num5, num6, num7, num8, this.A0e, this.A0f, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, this.A0t, this.A0u, hashMap, arrayList3, list2, list3, list4, arrayList, arrayList2);
    }

    public final InterfaceC38901rP A01() {
        Object A00;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        ArrayList arrayList5;
        String str2;
        String str3;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        InterfaceC38901rP interfaceC38901rP = this.A12;
        if (interfaceC38901rP instanceof C37956Gmy) {
            C09530e4[] c09530e4Arr = new C09530e4[64];
            C5FH c5fh = this.A01;
            if (c5fh != null) {
                treeUpdaterJNI = c5fh.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L = AbstractC166987dD.A1L("avatar_media_info", treeUpdaterJNI);
            C09530e4 A1L2 = AbstractC166987dD.A1L("background_color", this.A0i);
            C09530e4 A1L3 = AbstractC166987dD.A1L("background_color_alpha", this.A0j);
            C09530e4 A1L4 = AbstractC166987dD.A1L("can_viewer_hide", this.A0A);
            C09530e4 A1L5 = AbstractC166987dD.A1L("can_viewer_unhide", this.A0B);
            C5FJ c5fj = this.A07;
            if (c5fj != null) {
                treeUpdaterJNI2 = c5fj.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L6 = AbstractC166987dD.A1L("caption_area", treeUpdaterJNI2);
            List<InterfaceC43528JKo> list = this.A0v;
            if (list != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43528JKo interfaceC43528JKo : list) {
                    if (interfaceC43528JKo != null) {
                        arrayList.add(interfaceC43528JKo.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            C09530e4 A1L7 = AbstractC166987dD.A1L(MSV.A00(404), arrayList);
            C09530e4 A1L8 = AbstractC166987dD.A1L("child_comment_count", this.A0W);
            C09530e4 A1L9 = AbstractC166987dD.A1L("child_comment_index", this.A0X);
            C09530e4 A1L10 = AbstractC166987dD.A1L("comment_has_a_visual_reply_media", this.A0C);
            C09530e4 A1L11 = AbstractC166987dD.A1L("comment_index", this.A0Y);
            C09530e4 A1L12 = AbstractC166987dD.A1L("comment_like_count", this.A0Z);
            List list2 = this.A0w;
            if (list2 != null) {
                arrayList2 = AbstractC167007dF.A0i(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC31178DnM.A1U(arrayList2, it);
                }
            } else {
                arrayList2 = null;
            }
            C09530e4 A1L13 = AbstractC166987dD.A1L("comment_social_context_likers", arrayList2);
            C09530e4 A1L14 = AbstractC166987dD.A1L("created_at", this.A0g);
            C09530e4 A1L15 = AbstractC166987dD.A1L("created_at_utc", this.A0h);
            C09530e4 A1L16 = AbstractC166987dD.A1L("default_caption", this.A0k);
            C09530e4 A1L17 = AbstractC166987dD.A1L("did_report_as_spam", this.A0D);
            C09530e4 A1L18 = AbstractC166987dD.A1L("distinct_emojis_used", this.A0x);
            List list3 = this.A0y;
            if (list3 != null) {
                arrayList3 = AbstractC167007dF.A0i(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AbstractC31178DnM.A1U(arrayList3, it2);
                }
            } else {
                arrayList3 = null;
            }
            C09530e4 A1L19 = AbstractC166987dD.A1L(AbstractC111324zv.A00(208), arrayList3);
            List<JLO> list4 = this.A0z;
            if (list4 != null) {
                arrayList4 = AbstractC166987dD.A1E();
                for (JLO jlo : list4) {
                    if (jlo != null) {
                        arrayList4.add(jlo.F7o());
                    }
                }
            } else {
                arrayList4 = null;
            }
            C09530e4 A1L20 = AbstractC166987dD.A1L("fb_mentioned_users", arrayList4);
            C09530e4 A1L21 = AbstractC166987dD.A1L("first_sentence_length", this.A0a);
            CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf = this.A02;
            if (commentGiphyMediaInfoIntf != null) {
                treeUpdaterJNI3 = commentGiphyMediaInfoIntf.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            System.arraycopy(new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AbstractC166987dD.A1L(AbstractC111324zv.A00(423), treeUpdaterJNI3), AbstractC166987dD.A1L("has_liked_comment", this.A0E), AbstractC166987dD.A1L(MSV.A00(456), this.A0F), AbstractC166987dD.A1L(MSV.A00(458), this.A0G), AbstractC166987dD.A1L("has_translation", this.A0H), AbstractC166987dD.A1L("hide_username", this.A0I)}, 0, c09530e4Arr, 0, 27);
            C09530e4 A1L22 = AbstractC166987dD.A1L(MSV.A00(99), this.A0l);
            C5FM c5fm = this.A03;
            if (c5fm != null) {
                treeUpdaterJNI4 = c5fm.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            C09530e4 A1L23 = AbstractC166987dD.A1L("imagine_create_media_info", treeUpdaterJNI4);
            ClientDisplayMethod clientDisplayMethod = this.A00;
            if (clientDisplayMethod != null) {
                str = clientDisplayMethod.A00;
            } else {
                str = null;
            }
            C09530e4 A1L24 = AbstractC166987dD.A1L(AbstractC111324zv.A00(446), str);
            C09530e4 A1L25 = AbstractC166987dD.A1L("is_covered", this.A0J);
            C09530e4 A1L26 = AbstractC166987dD.A1L("is_created_by_media_owner", this.A0K);
            C09530e4 A1L27 = AbstractC166987dD.A1L(MSV.A00(492), this.A0L);
            C09530e4 A1L28 = AbstractC166987dD.A1L("is_high_value", this.A0M);
            C09530e4 A1L29 = AbstractC166987dD.A1L("is_liked_by_media_owner", this.A0N);
            C09530e4 A1L30 = AbstractC166987dD.A1L("is_limited", this.A0O);
            C09530e4 A1L31 = AbstractC166987dD.A1L("is_new", this.A0P);
            C09530e4 A1L32 = AbstractC166987dD.A1L("is_pinned", this.A0Q);
            C09530e4 A1L33 = AbstractC166987dD.A1L("is_question", this.A0R);
            C09530e4 A1L34 = AbstractC166987dD.A1L("is_ranked_comment", this.A0S);
            C09530e4 A1L35 = AbstractC166987dD.A1L("is_viewer_followed_by_comment_author", this.A0T);
            InterfaceC110874yz interfaceC110874yz = this.A08;
            if (interfaceC110874yz != null) {
                treeUpdaterJNI5 = interfaceC110874yz.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            C09530e4 A1L36 = AbstractC166987dD.A1L("keyword_highlight_info", treeUpdaterJNI5);
            C09530e4 A1L37 = AbstractC166987dD.A1L("media_code", this.A0m);
            C09530e4 A1L38 = AbstractC166987dD.A1L("media_id", this.A0n);
            C5FP c5fp = this.A06;
            if (c5fp != null) {
                treeUpdaterJNI6 = c5fp.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            C09530e4 A1L39 = AbstractC166987dD.A1L("media_info", treeUpdaterJNI6);
            C09530e4 A1L40 = AbstractC166987dD.A1L("mention_user_list", this.A11);
            C09530e4 A1L41 = AbstractC166987dD.A1L(MSV.A00(520), this.A0o);
            C09530e4 A1L42 = AbstractC166987dD.A1L(MSV.A00(521), this.A0p);
            C09530e4 A1L43 = AbstractC166987dD.A1L(MSV.A00(532), this.A0b);
            C09530e4 A1L44 = AbstractC166987dD.A1L(MSV.A00(533), this.A0c);
            C09530e4 A1L45 = AbstractC166987dD.A1L("parent_comment_id", this.A0q);
            C09530e4 A1L46 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2853), this.A0d);
            C09530e4 A1L47 = AbstractC166987dD.A1L("pk", this.A0r);
            List<InterfaceC38901rP> list5 = this.A10;
            if (list5 != null) {
                arrayList5 = AbstractC166987dD.A1E();
                for (InterfaceC38901rP interfaceC38901rP2 : list5) {
                    if (interfaceC38901rP2 != null) {
                        arrayList5.add(interfaceC38901rP2.F7o());
                    }
                }
            } else {
                arrayList5 = null;
            }
            System.arraycopy(new C09530e4[]{A1L22, A1L23, A1L24, A1L25, A1L26, A1L27, A1L28, A1L29, A1L30, A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, A1L39, A1L40, A1L41, A1L42, A1L43, A1L44, A1L45, A1L46, A1L47, AbstractC166987dD.A1L("preview_child_comments", arrayList5)}, 0, c09530e4Arr, 27, 27);
            PrivateReplyStatus privateReplyStatus = this.A05;
            if (privateReplyStatus != null) {
                str2 = privateReplyStatus.A00;
            } else {
                str2 = null;
            }
            C09530e4 A1L48 = AbstractC166987dD.A1L("private_reply_status", str2);
            C09530e4 A1L49 = AbstractC166987dD.A1L("replied_to_comment_id", this.A0s);
            CommentRestrictStatus commentRestrictStatus = this.A04;
            if (commentRestrictStatus != null) {
                str3 = commentRestrictStatus.A00;
            } else {
                str3 = null;
            }
            C09530e4 A1L50 = AbstractC166987dD.A1L("restricted_status", str3);
            C09530e4 A1L51 = AbstractC166987dD.A1L("show_fanclub_badge", this.A0U);
            C09530e4 A1L52 = AbstractC166987dD.A1L("show_reshare_nudge", this.A0V);
            C09530e4 A1L53 = AbstractC166987dD.A1L("text", this.A0t);
            C09530e4 A1L54 = AbstractC166987dD.A1L("text_color", this.A0u);
            C09530e4 A1L55 = AbstractC166987dD.A1L("text_size", this.A0e);
            C09530e4 A1L56 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A0f);
            User user = this.A09;
            System.arraycopy(new C09530e4[]{A1L48, A1L49, A1L50, A1L51, A1L52, A1L53, A1L54, A1L55, A1L56, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user != null ? user.A07() : null)}, 0, c09530e4Arr, 54, 10);
            A00 = AbstractC37303Gc4.A06(interfaceC38901rP, c09530e4Arr);
        } else {
            A00 = A00();
        }
        return (InterfaceC38901rP) A00;
    }

    public C72859XpF(InterfaceC38901rP interfaceC38901rP) {
        this.A12 = interfaceC38901rP;
        this.A01 = interfaceC38901rP.AeV();
        this.A0i = interfaceC38901rP.getBackgroundColor();
        this.A0j = interfaceC38901rP.Aeu();
        this.A0A = interfaceC38901rP.AlD();
        this.A0B = interfaceC38901rP.AlM();
        this.A07 = interfaceC38901rP.Ale();
        this.A0v = interfaceC38901rP.Am4();
        this.A0W = interfaceC38901rP.AnX();
        this.A0X = interfaceC38901rP.AnY();
        this.A0C = interfaceC38901rP.ApZ();
        this.A0Y = interfaceC38901rP.Apa();
        this.A0Z = interfaceC38901rP.Apd();
        this.A0w = interfaceC38901rP.Aph();
        this.A0g = interfaceC38901rP.Asa();
        this.A0h = interfaceC38901rP.Asc();
        this.A0k = interfaceC38901rP.AwB();
        this.A0D = interfaceC38901rP.AxM();
        this.A0x = interfaceC38901rP.Aym();
        this.A0y = interfaceC38901rP.B07();
        this.A0z = interfaceC38901rP.B4l();
        this.A0a = interfaceC38901rP.B6i();
        this.A02 = interfaceC38901rP.B9s();
        this.A0E = interfaceC38901rP.BC2();
        this.A0F = interfaceC38901rP.BC8();
        this.A0G = interfaceC38901rP.BCA();
        this.A0H = interfaceC38901rP.BCr();
        this.A0I = interfaceC38901rP.BDu();
        this.A0l = interfaceC38901rP.BFC();
        this.A03 = interfaceC38901rP.BH1();
        this.A00 = interfaceC38901rP.BHo();
        this.A0J = interfaceC38901rP.CRq();
        this.A0K = interfaceC38901rP.CRr();
        this.A0L = interfaceC38901rP.CVO();
        this.A0M = interfaceC38901rP.CVs();
        this.A0N = interfaceC38901rP.CXR();
        this.A0O = interfaceC38901rP.CXS();
        this.A0P = interfaceC38901rP.CZM();
        this.A0Q = interfaceC38901rP.CaI();
        this.A0R = interfaceC38901rP.CbP();
        this.A0S = interfaceC38901rP.CbW();
        this.A0T = interfaceC38901rP.Cfs();
        this.A08 = interfaceC38901rP.BKr();
        this.A0m = interfaceC38901rP.BQW();
        this.A0n = interfaceC38901rP.getMediaId();
        this.A06 = interfaceC38901rP.BR3();
        this.A11 = interfaceC38901rP.BSP();
        this.A0o = interfaceC38901rP.BWz();
        this.A0p = interfaceC38901rP.BX0();
        this.A0b = interfaceC38901rP.BXf();
        this.A0c = interfaceC38901rP.BY4();
        this.A0q = interfaceC38901rP.BbH();
        this.A0d = interfaceC38901rP.BbI();
        this.A0r = interfaceC38901rP.getPk();
        this.A10 = interfaceC38901rP.Bfk();
        this.A05 = interfaceC38901rP.Bgi();
        this.A0s = interfaceC38901rP.Bn2();
        this.A04 = interfaceC38901rP.Boq();
        this.A0U = interfaceC38901rP.BwH();
        this.A0V = interfaceC38901rP.Bwn();
        this.A0t = interfaceC38901rP.getText();
        this.A0u = interfaceC38901rP.getTextColor();
        this.A0e = interfaceC38901rP.C6j();
        this.A0f = interfaceC38901rP.CBl();
        this.A09 = interfaceC38901rP.CDj();
    }
}
