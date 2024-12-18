package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75343a1 {
    public static final String A00(UserSession userSession, C38321qM c38321qM) {
        List list;
        C75363a3 c75363a3;
        C14360o3.A0B(userSession, 0);
        String str = null;
        if (c38321qM != null) {
            list = c38321qM.A0C.CAf();
            c75363a3 = c38321qM.CFR();
        } else {
            list = null;
            c75363a3 = null;
        }
        if (A0A(userSession, c75363a3, list)) {
            if (c38321qM != null) {
                str = c38321qM.A0C.CFX();
            }
            return AbstractC75373a4.A00(userSession, str);
        }
        return "";
    }

    public static final void A02(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        if (c38321qM != null) {
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC60442pS;
            C18920wW A00 = c12210kP.A00();
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_video_subtitles_render_event");
            if (A002.isSampled()) {
                String id = c38321qM.getId();
                if (id == null) {
                    id = "";
                }
                A002.AAP("media_id", id);
                boolean z = false;
                Boolean bool = AbstractC24321Hb.A00(userSession).A01;
                if (bool != null && bool.booleanValue() && AbstractC41221vX.A00().A01 != 0) {
                    z = true;
                }
                A002.A7v("is_sound_on", Boolean.valueOf(z));
                A002.AAP("category", "shown");
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                if (A07 != null) {
                    A002.AAP("ad_id", A07);
                }
                String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
                if (A07 != null && A0F != null) {
                    A002.AAP("ad_tracking_token", A0F);
                }
                A002.Cht();
            }
        }
    }

    public static final void A04(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("show_video_captions", z);
        ARD.apply();
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC23021Ah.A00(userSession).A01.contains("generate_captions_for_dovetail_video")) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            return ((Boolean) A00.A7q.CES(A00, C23031Ai.A8c[28])).booleanValue();
        }
        if (AbstractC23021Ah.A00(userSession).A01.contains("igtv_captions_toggled_on_pref")) {
            boolean z = AbstractC23021Ah.A00(userSession).A01.getBoolean("igtv_captions_toggled_on_pref", false);
            if (Boolean.valueOf(z) != null) {
                return z;
            }
            return true;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        return A00.A01.getBoolean("show_video_captions", C18U.A06(C06090Tz.A05, userSession, 36315906992770752L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36322860545223368L) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.C38321qM r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r3 = 0
            if (r5 == 0) goto L4f
            X.1rF r0 = r5.A0C
            java.util.List r0 = r0.CFe()
            if (r0 == 0) goto L32
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            X.1rF r0 = r5.A0C
            java.util.List r1 = r0.CAf()
            X.3a3 r0 = r5.CFR()
            boolean r0 = A0A(r4, r0, r1)
            if (r0 == 0) goto L32
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322860545223368(0x810b7300062ac8, double:3.03406149699444E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L4e
        L32:
            X.3a3 r0 = r5.CFR()
            boolean r0 = X.AbstractC75373a4.A0B(r4, r0)
            if (r0 != 0) goto L4e
            boolean r0 = X.AbstractC75373a4.A08(r4, r5)
            if (r0 != 0) goto L48
            boolean r0 = X.AbstractC75373a4.A0A(r4, r5)
            if (r0 == 0) goto L4f
        L48:
            boolean r0 = X.AbstractC75373a4.A07(r4)
            if (r0 == 0) goto L4f
        L4e:
            r3 = 1
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75343a1.A08(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final boolean A09(UserSession userSession, C75363a3 c75363a3, Boolean bool, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str3;
        C14360o3.A0B(userSession, 0);
        if (z2) {
            if (!C14360o3.A0K(bool, true) && z3 && z4) {
                return !z;
            }
            return false;
        }
        if (!z3 || !z4) {
            return false;
        }
        if (C2TN.A05(userSession, str) && !z5) {
            return false;
        }
        if (!A07(userSession)) {
            if (!A0A(userSession, c75363a3, list)) {
                return false;
            }
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            String obj = C1Q2.A02().toString();
            C14360o3.A07(obj);
            java.util.Set A0J = A00.A0J(AbstractC16830sb.A06(C00Q.A03(obj, 2)));
            if (str2 != null) {
                str3 = C00Q.A03(str2, 2);
            } else {
                str3 = null;
            }
            if (A0J.contains(str3)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, C75363a3 c75363a3, List list) {
        C14360o3.A0B(userSession, 0);
        if (list == null || list.isEmpty() || AbstractC75373a4.A0B(userSession, c75363a3) || !C18U.A06(C06090Tz.A05, userSession, 36322860544895683L) || !AbstractC75373a4.A06(userSession)) {
            return false;
        }
        return true;
    }

    public static final String A01(String str) {
        if (str != null) {
            String language = Locale.forLanguageTag(AbstractC002300n.A0d(str, "_", "-", false)).getLanguage();
            C14360o3.A07(language);
            return language;
        }
        return "";
    }

    public static final void A03(UserSession userSession, boolean z) {
        String str;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322860545354442L);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        if (A06) {
            str = "auto_translate_reels_captions";
        } else {
            str = "auto_translate_reels";
        }
        ARD.E77(str, z);
        ARD.apply();
    }

    public static final boolean A05(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36322860545354442L);
    }

    public static final boolean A0B(C38321qM c38321qM) {
        if (c38321qM != null && (!C14360o3.A0K(c38321qM.A0C.CFW(), false))) {
            return true;
        }
        return false;
    }
}
