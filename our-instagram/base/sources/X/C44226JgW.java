package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JgW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44226JgW implements InterfaceC132105xl {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final boolean A02;
    public final UserSession A03;

    public C44226JgW(InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = z;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static String A02(AbstractC02600Aj abstractC02600Aj, C44226JgW c44226JgW, String str) {
        abstractC02600Aj.A0R("container_module", c44226JgW.A00.getModuleName());
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        return A06;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB Ckd(String str, String str2, String str3) {
        return null;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CmK(String str, String str2, String str3, String str4, int i, int i2) {
        return A08(str, str2, str3, str4, null, i, i2);
    }

    @Override // X.InterfaceC132105xl
    public final /* bridge */ /* synthetic */ C0eB CmL(String str, String str2, String str3, String str4, String str5, double d, int i, int i2, boolean z) {
        Long l;
        C14360o3.A0B(str, 0);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_vpvd_impression"), 273);
        Long l2 = null;
        if (AbstractC25226BEj.A1Z(A0A)) {
            A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
            if (str3 != null) {
                l = AbstractC003100w.A0k(10, str3);
            } else {
                l = null;
            }
            A0A.A0Q("quick_promotion_id", l);
            if (str2 != null) {
                l2 = AbstractC003100w.A0k(10, str2);
            }
            A0A.A0Q("netego_id", l2);
            A0A.A0P(AbstractC111324zv.A00(136), Double.valueOf(d));
            A0A.A0O("is_sub_impression", Boolean.valueOf(z));
            A05(A0A, str5, this.A02);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIM(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C14360o3.A0B(str, 0);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_like_tap"), 262);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIN(String str, String str2, String str3, String str4, int i, int i2) {
        C14360o3.A0B(str, 0);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_not_interested"), 265);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIO(String str, String str2, String str3, String str4, int i, int i2) {
        C14360o3.A0B(str, 0);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_undo_not_interested"), 272);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIQ(String str, String str2, String str3, String str4, int i, int i2) {
        C14360o3.A0B(str, 0);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_report"), 268);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.Cht();
        return C0eB.A00;
    }

    public static Long A00(AbstractC02600Aj abstractC02600Aj, Long l, String str) {
        abstractC02600Aj.A0Q("quick_promotion_id", l);
        if (str == null) {
            return null;
        }
        return AbstractC003100w.A0k(10, str);
    }

    public static void A03(AbstractC02600Aj abstractC02600Aj, C44226JgW c44226JgW) {
        abstractC02600Aj.A0R("container_module", c44226JgW.A00.getModuleName());
    }

    public static void A04(AbstractC02600Aj abstractC02600Aj, C44226JgW c44226JgW, Long l) {
        abstractC02600Aj.A0Q("netego_id", l);
        abstractC02600Aj.A0O("is_barcelona_installed", Boolean.valueOf(c44226JgW.A02));
    }

    public static void A06(C25531Mh c25531Mh, Integer num, String str, String str2, int i) {
        c25531Mh.A0R("nav_chain", str);
        c25531Mh.A0f(Integer.valueOf(i));
        c25531Mh.A0e(num);
        c25531Mh.A0R("tifu_type", str2);
    }

    public static void A07(C25531Mh c25531Mh, String str, String str2, int i, int i2) {
        c25531Mh.A0R("nav_chain", str);
        c25531Mh.A0f(Integer.valueOf(i));
        c25531Mh.A0e(Integer.valueOf(i2));
        c25531Mh.A0R("tifu_type", str2);
    }

    public final C0eB A08(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_non_ufi_tap"), 264);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A03(A0A, this);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A06))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CkZ(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_media_tap"), 263);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A0A.A0Q("netego_id", A00(A0A, l, str2));
        A05(A0A, str5, z);
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB Ckp(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        long j;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_open_app_tap"), 266);
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A03(A0A, this);
        if (str != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
            if (A0j != null) {
                j = A0j.longValue();
                A06(A0A, num, A01(A0A, j), str4, i);
                A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str3));
                A0A.A0Q("netego_id", AbstractC37302Gc3.A0W(str2));
                A05(A0A, str5, z);
                return C0eB.A00;
            }
        }
        j = 0;
        A06(A0A, num, A01(A0A, j), str4, i);
        A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str3));
        A0A.A0Q("netego_id", AbstractC37302Gc3.A0W(str2));
        A05(A0A, str5, z);
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CmH(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        long j;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_dismiss"), 260);
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A03(A0A, this);
        if (str != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
            if (A0j != null) {
                j = A0j.longValue();
                A06(A0A, num, A01(A0A, j), str5, i);
                A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str4));
                A04(A0A, this, AbstractC37302Gc3.A0W(str2));
                A0A.Cht();
                return C0eB.A00;
            }
        }
        j = 0;
        A06(A0A, num, A01(A0A, j), str5, i);
        A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str4));
        A04(A0A, this, AbstractC37302Gc3.A0W(str2));
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CmI(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        long j;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_undo_dismiss"), 271);
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A03(A0A, this);
        if (str != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
            if (A0j != null) {
                j = A0j.longValue();
                A06(A0A, num, A01(A0A, j), str5, i);
                A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str4));
                A04(A0A, this, AbstractC37302Gc3.A0W(str2));
                A0A.Cht();
                return C0eB.A00;
            }
        }
        j = 0;
        A06(A0A, num, A01(A0A, j), str5, i);
        A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str4));
        A04(A0A, this, AbstractC37302Gc3.A0W(str2));
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CmJ(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_container_impression"), 259);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A03(A0A, this);
        A0A.A0R("nav_chain", AbstractC31178DnM.A0b());
        A0A.A0f(Integer.valueOf(i));
        A0A.A0R("tifu_type", str5);
        A0A.A0Q("quick_promotion_id", AbstractC37302Gc3.A0W(str3));
        A0A.A0Q("netego_id", AbstractC37302Gc3.A0W(str2));
        A0A.A0P(AbstractC111324zv.A00(136), null);
        A0A.A0O("is_sub_impression", null);
        A0A.A0O("is_barcelona_installed", Boolean.valueOf(this.A02));
        if (num2 != null) {
            l = AbstractC25229BEm.A0n(num2);
        }
        A0A.A0Q(AbstractC111324zv.A00(963), l);
        A0A.A0R("search_query_text", str6);
        A0A.A0R("search_session_id", str7);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIL(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, boolean z) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_1px_impression"), 258);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A0A.A0R("nav_chain", A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))));
        A0A.A0f(num2);
        A0A.A0e(num);
        A0A.A0R("tifu_type", str4);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A0A.A0Q("netego_id", A00(A0A, l, str2));
        A0A.A0O("is_sub_impression", Boolean.valueOf(z));
        A05(A0A, str5, this.A02);
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIP(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_reply_tap"), 267);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIR(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_repost_tap"), 269);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIS(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_reshare_tap"), 270);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIT(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A01, "ig_threads_unit_expand_post_tap"), 261);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A07(A0A, A01(A0A, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A02(A0A, this, str)))), str4, i2, i);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        A04(A0A, this, A00(A0A, l, str2));
        A0A.A0R("search_query_text", str5);
        A0A.Cht();
        return C0eB.A00;
    }

    public static String A01(AbstractC02600Aj abstractC02600Aj, long j) {
        abstractC02600Aj.A0Q("media_id", Long.valueOf(j));
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void A05(AbstractC02600Aj abstractC02600Aj, String str, boolean z) {
        abstractC02600Aj.A0O("is_barcelona_installed", Boolean.valueOf(z));
        abstractC02600Aj.A0R("search_query_text", str);
        abstractC02600Aj.Cht();
    }
}
