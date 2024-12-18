package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79923hh {
    public static final C79923hh A00 = new Object();

    public static final OEK A00(C82G c82g, InterfaceC57926PmW interfaceC57926PmW, UserSession userSession, C38321qM c38321qM, Integer num) {
        C14360o3.A0B(userSession, 0);
        Integer A02 = A02(userSession);
        if (A02 != null) {
            List singletonList = Collections.singletonList(MSV.A00(681));
            C14360o3.A07(singletonList);
            return new OEK(c82g, interfaceC57926PmW, c38321qM, A02, num, C0HM.A00().toString(), singletonList);
        }
        throw new IllegalStateException("crossAppShareType cannot be null");
    }

    public static final Integer A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C200108tF c200108tF = C200108tF.A01;
        if (c200108tF.A0D(null, userSession, false)) {
            return C05F.A01;
        }
        if (!C173057nJ.A00.A00(userSession, true) || c200108tF.A0D(null, userSession, false)) {
            return null;
        }
        return C05F.A00;
    }

    public static final void A03(Context context, OEK oek, UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        Integer num2 = C05F.A00;
        if (num == num2 || num == C05F.A01) {
            C79923hh c79923hh = A00;
            boolean z = false;
            if (num == num2) {
                z = true;
            }
            c79923hh.A0C(context, oek, userSession, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        if (r1 != 5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        if (r0.length() != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r0 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r0.length() != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
    
        r1 = r14.getResources();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        r2 = r13.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0104, code lost:
    
        r3 = new android.text.SpannableStringBuilder(X.AbstractC07900bA.A01(r1, new java.lang.String[]{r2, r5}, r3));
        r0 = X.C18U.A04(X.C06090Tz.A05, r12, 36878036607434900L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        X.C54982OTq.A00(X.EnumC201098ur.SUPPRESS, r9, X.MSV.A00(1146));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r13 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r13 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(androidx.fragment.app.Fragment r13, X.OEK r14, com.instagram.common.session.UserSession r15) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79923hh.A05(androidx.fragment.app.Fragment, X.OEK, com.instagram.common.session.UserSession):void");
    }

    public static final void A07(EnumC31334Dpz enumC31334Dpz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, AbstractC53534Nm0 abstractC53534Nm0, Integer num) {
        int i;
        String str;
        C14360o3.A0B(enumC31334Dpz, 4);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                i = 2957;
            } else {
                throw new RuntimeException();
            }
        } else {
            i = 862;
        }
        String A002 = AbstractC111324zv.A00(i);
        String A2u = c38321qM.A2u();
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        AbstractC73317Y7a.A06(A00.A0B(enumC31334Dpz, userSession, abstractC53534Nm0), interfaceC11380iw, userSession, A002, A2u, str);
    }

    public static final void A08(EnumC31334Dpz enumC31334Dpz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, AbstractC53534Nm0 abstractC53534Nm0, Integer num) {
        int i;
        String str;
        C14360o3.A0B(num, 3);
        C14360o3.A0B(enumC31334Dpz, 4);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                i = 2957;
            } else {
                throw new RuntimeException();
            }
        } else {
            i = 862;
        }
        String A002 = AbstractC111324zv.A00(i);
        String A2u = c38321qM.A2u();
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        AbstractC73317Y7a.A05(A00.A0B(enumC31334Dpz, userSession, abstractC53534Nm0), interfaceC11380iw, userSession, null, null, "direct_share_sheet", A002, A2u, str, c38321qM.A0C.getLoggingInfoToken(), null, null, null, null);
    }

    public static final boolean A09(UserSession userSession, C38321qM c38321qM) {
        User A2E;
        C14360o3.A0B(userSession, 0);
        if (c38321qM == null || (A2E = c38321qM.A2E(userSession)) == null || c38321qM.A1z() != ProductType.CLIPS || !C14360o3.A0K(userSession.userId, A2E.getId()) || A02(userSession) == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, Integer num) {
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                return A002.A0C();
            }
            throw new RuntimeException();
        }
        return C200108tF.A06(userSession);
    }

    public final void A0C(Context context, OEK oek, UserSession userSession, boolean z) {
        String str;
        C38321qM c38321qM = oek.A02;
        String A38 = c38321qM.A38();
        if (A38 != null) {
            C84923qg A1V = c38321qM.A1V();
            if (A1V != null) {
                str = A1V.A0e;
            } else {
                str = null;
            }
            C25621Ms A002 = AbstractC54204Nxi.A00(userSession, oek.A04, A38, str, oek.A05, "clips_share_later");
            A002.A9s("cross_app_share_type", AbstractC54209Nxn.A00(oek.A03));
            A002.AA6("cross_app_share_fb_validation_check_bypass", AbstractC13590ml.A00(oek.A06));
            A002.A0R = true;
            C1ON A0N = A002.A0N();
            A0N.A00 = new C52216N9f(context, oek, z);
            C1GJ.A03(A0N);
            A06(oek, EnumC76753cN.A06, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final EnumC31334Dpz A01(C38321qM c38321qM) {
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && C14360o3.A0K(clipsMetadata.Cd0(), true)) {
            return EnumC31334Dpz.A03;
        }
        List AtP = c38321qM.A0C.AtP();
        if (AtP != null && AtP.contains("FB")) {
            return EnumC31334Dpz.A02;
        }
        return EnumC31334Dpz.A04;
    }

    public static final void A04(Context context, C38321qM c38321qM, int i) {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = context.getString(i);
        c146106i8.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        c146106i8.A09 = c38321qM.A1S();
        c146106i8.A03();
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    public static final void A06(OEK oek, EnumC76753cN enumC76753cN, boolean z) {
        ArrayList arrayList;
        Integer num = oek.A03;
        Integer num2 = C05F.A00;
        C38321qM c38321qM = oek.A02;
        if (num == num2) {
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata != null) {
                C128865s0 c128865s0 = new C128865s0(clipsMetadata);
                c128865s0.A0S = Boolean.valueOf(z);
                c38321qM.A43(c128865s0.A00());
            }
        } else {
            List AtP = c38321qM.A0C.AtP();
            if (AtP != null) {
                arrayList = new ArrayList(AtP);
            } else {
                arrayList = new ArrayList();
            }
            if (z && !arrayList.contains("FB")) {
                arrayList.add("FB");
            } else {
                arrayList.remove("FB");
            }
            c38321qM.A0C.ESW(arrayList);
        }
        c38321qM.A4H(EnumC76753cN.A06);
        oek.A01.Dlm(enumC76753cN);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.E4T, X.0Zx] */
    public final E4T A0B(EnumC31334Dpz enumC31334Dpz, UserSession userSession, AbstractC53534Nm0 abstractC53534Nm0) {
        String name;
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        boolean A03 = C196068lw.A03(C196068lw.A00(userSession).A00(CallerContext.A01("ClipsShareLaterUtils")));
        ?? c0Zx = new C0Zx();
        boolean A003 = enumC31334Dpz.A00();
        c0Zx.A03(AbstractC111324zv.A00(725), Boolean.valueOf(A003));
        Enum r7 = enumC31334Dpz;
        if (!A003) {
            if (abstractC53534Nm0 instanceof C52740NVi) {
                name = null;
                c0Zx.A06(AbstractC111324zv.A00(1008), name);
                c0Zx.A03(MSV.A00(1326), Boolean.valueOf(A03));
                c0Zx.A03("reels_ccp_xpost_setting", Boolean.valueOf(C200108tF.A06(userSession)));
                c0Zx.A03("reels_xar_xpost_setting", Boolean.valueOf(A002.A0C()));
                return c0Zx;
            }
            if (abstractC53534Nm0 instanceof NVh) {
                r7 = ((NVh) abstractC53534Nm0).A00();
            } else {
                throw new RuntimeException();
            }
        }
        name = r7.name();
        c0Zx.A06(AbstractC111324zv.A00(1008), name);
        c0Zx.A03(MSV.A00(1326), Boolean.valueOf(A03));
        c0Zx.A03("reels_ccp_xpost_setting", Boolean.valueOf(C200108tF.A06(userSession)));
        c0Zx.A03("reels_xar_xpost_setting", Boolean.valueOf(A002.A0C()));
        return c0Zx;
    }
}
