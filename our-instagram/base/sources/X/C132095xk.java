package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.5xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132095xk implements InterfaceC132105xl {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    @Override // X.InterfaceC132105xl
    public final C0eB CmK(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        String str5;
        Long l;
        Long l2;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_tap"), C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
        Long l3 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        try {
            str5 = C38801rC.A04(str);
        } catch (IndexOutOfBoundsException unused) {
            str5 = null;
        }
        if (str5 != null) {
            l = AbstractC003100w.A0k(10, str5);
        } else {
            l = null;
        }
        c25531Mh.A0Q("media_author_id", l);
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l2 = AbstractC003100w.A0k(10, str3);
        } else {
            l2 = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l2);
        if (str2 != null) {
            l3 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l3);
        c25531Mh.A0R("interaction_source", "main_card_tap");
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final /* bridge */ /* synthetic */ C0eB CmL(String str, String str2, String str3, String str4, String str5, double d, int i, int i2, boolean z) {
        long j;
        Long l;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_vpvd_imp"), 257);
        Long l2 = null;
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0R("container_module", this.A00.getModuleName());
            C38801rC c38801rC = C38321qM.A0h;
            String A06 = C38801rC.A06(str);
            C14360o3.A0B(A06, 0);
            Long A0k = AbstractC003100w.A0k(10, A06);
            if (A0k != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            c25531Mh.A0Q("media_id", Long.valueOf(j));
            String A04 = C38801rC.A04(str);
            C14360o3.A0B(A04, 0);
            c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
            c25531Mh.A0f(Integer.valueOf(i2));
            c25531Mh.A0e(Integer.valueOf(i));
            c25531Mh.A0t(C1QM.A00.A02.A00);
            if (str3 != null) {
                l = AbstractC003100w.A0k(10, str3);
            } else {
                l = null;
            }
            c25531Mh.A0Q("quick_promotion_id", l);
            if (str2 != null) {
                l2 = AbstractC003100w.A0k(10, str2);
            }
            c25531Mh.A0Q("netego_id", l2);
            c25531Mh.A0P("sum_duration_ms", Double.valueOf(d));
            c25531Mh.A0O("is_sub_impression", Boolean.valueOf(z));
            c25531Mh.Cht();
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIL(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, boolean z) {
        long j;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_card_1px"), 244);
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        c25531Mh.A0O("is_sub_impression", Boolean.valueOf(z));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(num2);
        c25531Mh.A0e(num);
        c25531Mh.A0t(C1QM.A00.A02.A00);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIM(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_ufi_like_tap"), 251);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIN(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_not_interested"), 248);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIO(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_undo_not_interested"), 256);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIP(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_ufi_reply_tap"), 252);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIQ(String str, String str2, String str3, String str4, int i, int i2) {
        long j;
        Long l;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_report"), 249);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIR(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_ufi_repost_tap"), 253);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIS(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_ufi_reshare_tap"), 254);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB EIT(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        long j;
        Long l;
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "ig_threads_in_feed_unit_expand_post_tap"), 246);
        Long l2 = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R("container_module", this.A00.getModuleName());
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str);
        C14360o3.A0B(A06, 0);
        Long A0k = AbstractC003100w.A0k(10, A06);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        c25531Mh.A0Q("media_id", Long.valueOf(j));
        String A04 = C38801rC.A04(str);
        C14360o3.A0B(A04, 0);
        c25531Mh.A0Q("media_author_id", AbstractC003100w.A0k(10, A04));
        c25531Mh.A0f(Integer.valueOf(i2));
        c25531Mh.A0e(Integer.valueOf(i));
        c25531Mh.A0t(C1QM.A00.A02.A00);
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        c25531Mh.A0Q("quick_promotion_id", l);
        if (str2 != null) {
            l2 = AbstractC003100w.A0k(10, str2);
        }
        c25531Mh.A0Q("netego_id", l2);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB CkZ(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        UserSession userSession = this.A02;
        AbstractC151386rg.A03(this.A00, userSession, Integer.valueOf(i), Integer.valueOf(i2), null, "threads_in_feed_unit_card", userSession.userId, str, str3, str2, z);
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB Ckd(String str, String str2, String str3) {
        C18920wW c18920wW = this.A01;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_netego_click"), 299);
        Long l = null;
        if (!((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            return null;
        }
        c25531Mh.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "threads_in_feed_unit");
        InterfaceC11380iw interfaceC11380iw = this.A00;
        c25531Mh.A0R("container_module", interfaceC11380iw.getModuleName());
        c25531Mh.A0R("source_of_action", interfaceC11380iw.getModuleName());
        c25531Mh.A0Q("ig_userid", C4SX.A00(this.A02.userId).A00);
        c25531Mh.A0R("netego_id", str);
        c25531Mh.A0R("tracking_token", str2);
        if (str3 != null) {
            C38801rC c38801rC = C38321qM.A0h;
            String A06 = C38801rC.A06(str3);
            C14360o3.A0B(A06, 0);
            l = AbstractC003100w.A0k(10, A06);
        }
        c25531Mh.A0Q("media_id", l);
        c25531Mh.A0t(C1QM.A00.A02.A00);
        c25531Mh.Cht();
        return C0eB.A00;
    }

    @Override // X.InterfaceC132105xl
    public final C0eB Ckp(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        UserSession userSession = this.A02;
        AbstractC151386rg.A03(this.A00, userSession, num, Integer.valueOf(i), null, "threads_in_feed_unit_header", userSession.userId, str, str3, str2, z);
        return C0eB.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    @Override // X.InterfaceC132105xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C0eB CmH(java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            X.0wW r2 = r6.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_dismiss"
            X.0kM r0 = r2.A00
            X.0Ai r1 = r2.A00(r0, r1)
            r0 = 245(0xf5, float:3.43E-43)
            X.1Mh r3 = new X.1Mh
            r3.<init>(r1, r0)
            X.0Ai r0 = r3.A00
            boolean r0 = r0.isSampled()
            r1 = 0
            if (r0 == 0) goto L92
            X.0iw r0 = r6.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r3.A0R(r0, r2)
            if (r8 == 0) goto L99
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r2 = X.C38801rC.A06(r8)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r2)
            if (r0 == 0) goto L99
            long r4 = r0.longValue()
        L3d:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "media_id"
            r3.A0Q(r0, r2)
            java.lang.String r0 = "ranking_info_token"
            r3.A0R(r0, r10)
            if (r8 == 0) goto L97
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r2 = X.C38801rC.A04(r8)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r0 = 10
            java.lang.Long r2 = X.AbstractC003100w.A0k(r0, r2)
        L5d:
            java.lang.String r0 = "media_author_id"
            r3.A0Q(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A0f(r0)
            r3.A0e(r7)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            r3.A0t(r0)
            if (r11 == 0) goto L95
            r0 = 10
            java.lang.Long r2 = X.AbstractC003100w.A0k(r0, r11)
        L7d:
            java.lang.String r0 = "quick_promotion_id"
            r3.A0Q(r0, r2)
            if (r9 == 0) goto L8a
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r9)
        L8a:
            java.lang.String r0 = "netego_id"
            r3.A0Q(r0, r1)
            r3.Cht()
        L92:
            X.0eB r0 = X.C0eB.A00
            return r0
        L95:
            r2 = r1
            goto L7d
        L97:
            r2 = r1
            goto L5d
        L99:
            r4 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132095xk.CmH(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0eB");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    @Override // X.InterfaceC132105xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C0eB CmI(java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r6 = this;
            X.0wW r2 = r6.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_undo_dismiss"
            X.0kM r0 = r2.A00
            X.0Ai r1 = r2.A00(r0, r1)
            r0 = 255(0xff, float:3.57E-43)
            X.1Mh r3 = new X.1Mh
            r3.<init>(r1, r0)
            X.0Ai r0 = r3.A00
            boolean r0 = r0.isSampled()
            r1 = 0
            if (r0 == 0) goto L85
            X.0iw r0 = r6.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r3.A0R(r0, r2)
            if (r8 == 0) goto L8a
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r2 = X.C38801rC.A06(r8)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r2)
            if (r0 == 0) goto L8a
            long r4 = r0.longValue()
        L3d:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "media_id"
            r3.A0Q(r0, r2)
            java.lang.String r0 = "ranking_info_token"
            r3.A0R(r0, r10)
            if (r8 == 0) goto L88
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r2 = X.C38801rC.A04(r8)
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r0 = 10
            java.lang.Long r2 = X.AbstractC003100w.A0k(r0, r2)
        L5d:
            java.lang.String r0 = "media_author_id"
            r3.A0Q(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A0f(r0)
            r3.A0e(r7)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            r3.A0t(r0)
            if (r11 == 0) goto L7d
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r11)
        L7d:
            java.lang.String r0 = "quick_promotion_id"
            r3.A0Q(r0, r1)
            r3.Cht()
        L85:
            X.0eB r0 = X.C0eB.A00
            return r0
        L88:
            r2 = r1
            goto L5d
        L8a:
            r4 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132095xk.CmI(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0eB");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    @Override // X.InterfaceC132105xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0eB CmJ(java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r4 = this;
            X.0wW r2 = r4.A01
            java.lang.String r1 = "ig_threads_in_feed_unit_impression"
            X.0kM r0 = r2.A00
            X.0Ai r1 = r2.A00(r0, r1)
            r0 = 247(0xf7, float:3.46E-43)
            X.1Mh r2 = new X.1Mh
            r2.<init>(r1, r0)
            X.0Ai r0 = r2.A00
            boolean r0 = r0.isSampled()
            r3 = 0
            if (r0 == 0) goto L99
            X.0iw r0 = r4.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            r2.A0R(r0, r1)
            if (r7 == 0) goto La0
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r1 = X.C38801rC.A06(r7)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
            if (r0 == 0) goto La0
            long r0 = r0.longValue()
        L3d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_id"
            r2.A0Q(r0, r1)
            if (r7 == 0) goto L9e
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r1 = X.C38801rC.A04(r7)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r1)
        L58:
            java.lang.String r0 = "media_author_id"
            r2.A0Q(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A0f(r0)
            r2.A0e(r5)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r0 = r0.A00
            r2.A0t(r0)
            if (r9 == 0) goto L9c
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r9)
        L78:
            java.lang.String r0 = "quick_promotion_id"
            r2.A0Q(r0, r1)
            if (r8 == 0) goto L9a
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r8)
        L85:
            java.lang.String r0 = "netego_id"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "sum_duration_ms"
            r2.A0P(r0, r3)
            java.lang.String r0 = "ranking_info_token"
            r2.A0R(r0, r10)
            r2.Cht()
            X.0eB r3 = X.C0eB.A00
        L99:
            return r3
        L9a:
            r1 = r3
            goto L85
        L9c:
            r1 = r3
            goto L78
        L9e:
            r1 = r3
            goto L58
        La0:
            r0 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132095xk.CmJ(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):X.0eB");
    }

    public C132095xk(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
