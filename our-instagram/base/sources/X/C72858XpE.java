package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XpE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72858XpE {
    public InterfaceC99294cv A00;
    public InterfaceC99354d5 A01;
    public InterfaceC99374d7 A02;
    public ReplyControlStr A03;
    public InterfaceC99404dC A04;
    public TextAppSearchDiscussionTopic A05;
    public InterfaceC99414dE A06;
    public InterfaceC99344d3 A07;
    public TextPostAppHeaderFollowVariant A08;
    public InterfaceC99394dA A09;
    public TextPostAppPostUnavailableReason A0A;
    public InterfaceC99384d8 A0B;
    public C38321qM A0C;
    public C4d0 A0D;
    public User A0E;
    public User A0F;
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
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Long A0b;
    public Long A0c;
    public String A0d;
    public String A0e;
    public List A0f;
    public List A0g;
    public final InterfaceC99334d2 A0h;

    public final C99324d1 A00() {
        URR urr;
        C99284cu c99284cu;
        C99364d6 c99364d6;
        C66642URg c66642URg;
        C4d9 c4d9;
        URP urp;
        TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl;
        C99314cz c99314cz;
        C38792H6h c38792H6h;
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        Boolean bool = this.A0G;
        Boolean bool2 = this.A0H;
        InterfaceC99344d3 interfaceC99344d3 = this.A07;
        if (interfaceC99344d3 != null) {
            urr = interfaceC99344d3.F38();
        } else {
            urr = null;
        }
        Long l = this.A0b;
        Integer num = this.A0S;
        Long l2 = this.A0c;
        InterfaceC99294cv interfaceC99294cv = this.A00;
        if (interfaceC99294cv != null) {
            c99284cu = interfaceC99294cv.EtT();
        } else {
            c99284cu = null;
        }
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = this.A08;
        InterfaceC99354d5 interfaceC99354d5 = this.A01;
        UQu EuC = interfaceC99354d5 != null ? interfaceC99354d5.EuC() : null;
        Integer num2 = this.A0T;
        Boolean bool3 = this.A0I;
        Boolean bool4 = this.A0J;
        Boolean bool5 = this.A0K;
        Boolean bool6 = this.A0L;
        Boolean bool7 = this.A0M;
        Boolean bool8 = this.A0N;
        InterfaceC99374d7 interfaceC99374d7 = this.A02;
        if (interfaceC99374d7 != null) {
            c99364d6 = interfaceC99374d7.Evs();
        } else {
            c99364d6 = null;
        }
        C38321qM c38321qM = this.A0C;
        InterfaceC99384d8 interfaceC99384d8 = this.A0B;
        if (interfaceC99384d8 != null) {
            c66642URg = interfaceC99384d8.F4k(c1dy);
        } else {
            c66642URg = null;
        }
        Integer num3 = this.A0U;
        InterfaceC99394dA interfaceC99394dA = this.A09;
        if (interfaceC99394dA != null) {
            c4d9 = interfaceC99394dA.F39();
        } else {
            c4d9 = null;
        }
        String str = this.A0d;
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = this.A0A;
        User user = this.A0E;
        Integer num4 = this.A0V;
        InterfaceC99404dC interfaceC99404dC = this.A04;
        if (interfaceC99404dC != null) {
            urp = interfaceC99404dC.F2x();
        } else {
            urp = null;
        }
        List list = this.A0f;
        ReplyControlStr replyControlStr = this.A03;
        Integer num5 = this.A0W;
        List list2 = this.A0g;
        Integer num6 = this.A0X;
        User user2 = this.A0F;
        Integer num7 = this.A0Y;
        Integer num8 = this.A0Z;
        TextAppSearchDiscussionTopic textAppSearchDiscussionTopic = this.A05;
        if (textAppSearchDiscussionTopic != null) {
            textAppSearchDiscussionTopicImpl = textAppSearchDiscussionTopic.F2y();
        } else {
            textAppSearchDiscussionTopicImpl = null;
        }
        Integer num9 = this.A0a;
        C4d0 c4d0 = this.A0D;
        if (c4d0 != null) {
            c99314cz = c4d0.F4t(c1dy);
        } else {
            c99314cz = null;
        }
        Boolean bool9 = this.A0O;
        Boolean bool10 = this.A0P;
        String str2 = this.A0e;
        InterfaceC99414dE interfaceC99414dE = this.A06;
        if (interfaceC99414dE != null) {
            c38792H6h = interfaceC99414dE.F32(c1dy);
        } else {
            c38792H6h = null;
        }
        return new C99324d1(c99284cu, EuC, c99364d6, replyControlStr, urp, textAppSearchDiscussionTopicImpl, c38792H6h, urr, textPostAppHeaderFollowVariant, c4d9, textPostAppPostUnavailableReason, c66642URg, c38321qM, c99314cz, user, user2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, this.A0Q, this.A0R, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, str, str2, list, list2);
    }

    public final InterfaceC99334d2 A01() {
        Object A00;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        String str3;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        InterfaceC99334d2 interfaceC99334d2 = this.A0h;
        if (interfaceC99334d2 instanceof V97) {
            C09530e4[] c09530e4Arr = new C09530e4[43];
            C09530e4 A1L = AbstractC166987dD.A1L("can_private_reply", this.A0G);
            C09530e4 A1L2 = AbstractC166987dD.A1L("can_reply", this.A0H);
            InterfaceC99344d3 interfaceC99344d3 = this.A07;
            if (interfaceC99344d3 != null) {
                treeUpdaterJNI = interfaceC99344d3.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L3 = AbstractC166987dD.A1L("debug_info", treeUpdaterJNI);
            C09530e4 A1L4 = AbstractC166987dD.A1L("delete_timestamp", this.A0b);
            C09530e4 A1L5 = AbstractC166987dD.A1L("direct_reply_count", this.A0S);
            C09530e4 A1L6 = AbstractC166987dD.A1L("expiry_timestamp", this.A0c);
            InterfaceC99294cv interfaceC99294cv = this.A00;
            if (interfaceC99294cv != null) {
                treeUpdaterJNI2 = interfaceC99294cv.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L7 = AbstractC166987dD.A1L("fediverse_info", treeUpdaterJNI2);
            TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = this.A08;
            if (textPostAppHeaderFollowVariant != null) {
                str = textPostAppHeaderFollowVariant.A00;
            } else {
                str = null;
            }
            C09530e4 A1L8 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2447), str);
            InterfaceC99354d5 interfaceC99354d5 = this.A01;
            if (interfaceC99354d5 != null) {
                treeUpdaterJNI3 = interfaceC99354d5.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            C09530e4 A1L9 = AbstractC166987dD.A1L("hush_info", treeUpdaterJNI3);
            C09530e4 A1L10 = AbstractC166987dD.A1L(AbstractC111324zv.A00(443), this.A0T);
            C09530e4 A1L11 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1032), this.A0I);
            C09530e4 A1L12 = AbstractC166987dD.A1L("is_first_post", this.A0J);
            C09530e4 A1L13 = AbstractC166987dD.A1L("is_parent_edited", this.A0K);
            C09530e4 A1L14 = AbstractC166987dD.A1L("is_post_unavailable", this.A0L);
            C09530e4 A1L15 = AbstractC166987dD.A1L("is_reply", this.A0M);
            C09530e4 A1L16 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2633), this.A0N);
            InterfaceC99374d7 interfaceC99374d7 = this.A02;
            if (interfaceC99374d7 != null) {
                treeUpdaterJNI4 = interfaceC99374d7.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            C09530e4 A1L17 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2667), treeUpdaterJNI4);
            C38321qM c38321qM = this.A0C;
            if (c38321qM != null) {
                treeUpdaterJNI5 = c38321qM.A1D();
            } else {
                treeUpdaterJNI5 = null;
            }
            C09530e4 A1L18 = AbstractC166987dD.A1L("linked_inline_media", treeUpdaterJNI5);
            InterfaceC99384d8 interfaceC99384d8 = this.A0B;
            if (interfaceC99384d8 != null) {
                treeUpdaterJNI6 = interfaceC99384d8.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            C09530e4 A1L19 = AbstractC166987dD.A1L("loop_community_info", treeUpdaterJNI6);
            C09530e4 A1L20 = AbstractC166987dD.A1L("mention_count", this.A0U);
            InterfaceC99394dA interfaceC99394dA = this.A09;
            if (interfaceC99394dA != null) {
                treeUpdaterJNI7 = interfaceC99394dA.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            C09530e4 A1L21 = AbstractC166987dD.A1L("pinned_post_info", treeUpdaterJNI7);
            C09530e4 A1L22 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2888), this.A0d);
            TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = this.A0A;
            if (textPostAppPostUnavailableReason != null) {
                str2 = textPostAppPostUnavailableReason.A00;
            } else {
                str2 = null;
            }
            C09530e4 A1L23 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2890), str2);
            User user = this.A0E;
            if (user != null) {
                treeUpdaterJNI8 = user.A07();
            } else {
                treeUpdaterJNI8 = null;
            }
            C09530e4 A1L24 = AbstractC166987dD.A1L(AbstractC111324zv.A00(2906), treeUpdaterJNI8);
            C09530e4 A1L25 = AbstractC166987dD.A1L("quote_count", this.A0V);
            InterfaceC99404dC interfaceC99404dC = this.A04;
            if (interfaceC99404dC != null) {
                treeUpdaterJNI9 = interfaceC99404dC.F7o();
            } else {
                treeUpdaterJNI9 = null;
            }
            System.arraycopy(new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, AbstractC166987dD.A1L("related_trends_info", treeUpdaterJNI9), AbstractC166987dD.A1L(AbstractC111324zv.A00(3004), this.A0f)}, 0, c09530e4Arr, 0, 27);
            ReplyControlStr replyControlStr = this.A03;
            if (replyControlStr != null) {
                str3 = replyControlStr.A00;
            } else {
                str3 = null;
            }
            C09530e4 A1L26 = AbstractC166987dD.A1L("reply_control", str3);
            C09530e4 A1L27 = AbstractC166987dD.A1L("reply_count", this.A0W);
            List list = this.A0g;
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC31178DnM.A1U(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            C09530e4 A1L28 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1232), arrayList);
            C09530e4 A1L29 = AbstractC166987dD.A1L("reply_level", this.A0X);
            User user2 = this.A0F;
            if (user2 != null) {
                treeUpdaterJNI10 = user2.A07();
            } else {
                treeUpdaterJNI10 = null;
            }
            C09530e4 A1L30 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1233), treeUpdaterJNI10);
            C09530e4 A1L31 = AbstractC166987dD.A1L("repost_count", this.A0Y);
            C09530e4 A1L32 = AbstractC166987dD.A1L("reshare_count", this.A0Z);
            TextAppSearchDiscussionTopic textAppSearchDiscussionTopic = this.A05;
            if (textAppSearchDiscussionTopic != null) {
                treeUpdaterJNI11 = textAppSearchDiscussionTopic.F7o();
            } else {
                treeUpdaterJNI11 = null;
            }
            C09530e4 A1L33 = AbstractC166987dD.A1L(AbstractC111324zv.A00(3053), treeUpdaterJNI11);
            C09530e4 A1L34 = AbstractC166987dD.A1L("self_thread_count", this.A0a);
            C4d0 c4d0 = this.A0D;
            if (c4d0 != null) {
                treeUpdaterJNI12 = c4d0.F7o();
            } else {
                treeUpdaterJNI12 = null;
            }
            C09530e4 A1L35 = AbstractC166987dD.A1L("share_info", treeUpdaterJNI12);
            C09530e4 A1L36 = AbstractC166987dD.A1L(AbstractC111324zv.A00(3094), this.A0O);
            C09530e4 A1L37 = AbstractC166987dD.A1L("show_header_follow", this.A0P);
            C09530e4 A1L38 = AbstractC166987dD.A1L(MSV.A00(582), this.A0e);
            InterfaceC99414dE interfaceC99414dE = this.A06;
            System.arraycopy(new C09530e4[]{A1L26, A1L27, A1L28, A1L29, A1L30, A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, AbstractC166987dD.A1L("text_fragments", interfaceC99414dE != null ? interfaceC99414dE.F7o() : null), AbstractC166987dD.A1L(AbstractC58317Pt9.A00(388), this.A0Q), AbstractC166987dD.A1L(AbstractC111324zv.A00(3316), this.A0R)}, 0, c09530e4Arr, 27, 16);
            A00 = AbstractC37303Gc4.A06(interfaceC99334d2, c09530e4Arr);
        } else {
            A00 = A00();
        }
        return (InterfaceC99334d2) A00;
    }

    public C72858XpE(InterfaceC99334d2 interfaceC99334d2) {
        this.A0h = interfaceC99334d2;
        this.A0G = interfaceC99334d2.Akb();
        this.A0H = interfaceC99334d2.Aki();
        this.A07 = interfaceC99334d2.Avu();
        this.A0b = interfaceC99334d2.Awf();
        this.A0S = interfaceC99334d2.Axb();
        this.A0c = interfaceC99334d2.B3G();
        this.A00 = interfaceC99334d2.B5U();
        this.A08 = interfaceC99334d2.BDD();
        this.A01 = interfaceC99334d2.BEQ();
        this.A0T = interfaceC99334d2.BH7();
        this.A0I = interfaceC99334d2.CQ1();
        this.A0J = interfaceC99334d2.CUr();
        this.A0K = interfaceC99334d2.Ca2();
        this.A0L = interfaceC99334d2.Cam();
        this.A0M = interfaceC99334d2.Cbs();
        this.A0N = interfaceC99334d2.Ccw();
        this.A02 = interfaceC99334d2.BNR();
        this.A0C = interfaceC99334d2.BNd();
        this.A0B = interfaceC99334d2.BPK();
        this.A0U = interfaceC99334d2.BSL();
        this.A09 = interfaceC99334d2.BdJ();
        this.A0d = interfaceC99334d2.Bf4();
        this.A0A = interfaceC99334d2.BfA();
        this.A0E = interfaceC99334d2.Bgg();
        this.A0V = interfaceC99334d2.Bjq();
        this.A04 = interfaceC99334d2.BmB();
        this.A0f = interfaceC99334d2.BmG();
        this.A03 = interfaceC99334d2.BnB();
        this.A0W = interfaceC99334d2.BnC();
        this.A0g = interfaceC99334d2.BnD();
        this.A0X = interfaceC99334d2.BnG();
        this.A0F = interfaceC99334d2.BnR();
        this.A0Y = interfaceC99334d2.Bnp();
        this.A0Z = interfaceC99334d2.BoO();
        this.A05 = interfaceC99334d2.BrJ();
        this.A0a = interfaceC99334d2.Bt0();
        this.A0D = interfaceC99334d2.BuA();
        this.A0O = interfaceC99334d2.BvH();
        this.A0P = interfaceC99334d2.BwR();
        this.A0e = interfaceC99334d2.Bz5();
        this.A06 = interfaceC99334d2.C6L();
        this.A0Q = interfaceC99334d2.CGD();
        this.A0R = interfaceC99334d2.CHk();
    }
}
