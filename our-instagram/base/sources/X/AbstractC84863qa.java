package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.3qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84863qa {
    public static final C55942hf A00 = C55942hf.A04(60.0d, 5.0d);

    public static final int A02(Context context) {
        C14360o3.A0B(context, 0);
        return (AbstractC13890nF.A00(context) - C30D.A00) - A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r1 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A03(com.instagram.common.session.UserSession r6, X.C41181vS r7, X.C41551w4 r8, float r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            boolean r0 = A0D(r6, r8)
            if (r0 == 0) goto L1a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36598966816083288(0x82069100380d58, double:3.2086722144769673E-306)
            long r5 = X.C18U.A01(r2, r6, r0)
            return r5
        L1a:
            boolean r5 = r7.A1C()
            if (r5 == 0) goto L26
            X.1vY r1 = r7.A0e
            X.1vY r0 = X.EnumC41231vY.A06
            if (r1 == r0) goto L55
        L26:
            boolean r0 = r7.A1V()
            if (r0 != 0) goto L55
            boolean r0 = r7.A1U()
            if (r0 == 0) goto L3d
            r1 = 0
            java.lang.String r0 = "Suggested products unit is missing suggested products model"
        L35:
            X.C18C.A07(r1, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3d:
            X.1vY r2 = r7.A0e
            X.1vY r0 = X.EnumC41231vY.A0O
            if (r2 != r0) goto L47
            r1 = 0
            java.lang.String r0 = "Suggested shops unit is missing suggested shops model"
            goto L35
        L47:
            boolean r0 = r7.A1T()
            if (r0 == 0) goto L65
            r1 = 0
            r0 = 3775(0xebf, float:5.29E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L35
        L55:
            X.4ms r1 = r7.A09
            java.lang.String r0 = "SU unit is missing suggested users model"
            X.C18C.A07(r1, r0)
            X.1qx r0 = r1.A00
            int r1 = r0.A00
            int r0 = r1 * 1000
            if (r1 != 0) goto L74
            goto L72
        L65:
            boolean r0 = r7.A1R()
            if (r0 == 0) goto L76
            X.4px r1 = r7.A07
            java.lang.String r0 = "Trending in story unit is missing prompt in story model"
            X.C18C.A07(r1, r0)
        L72:
            r0 = 15000(0x3a98, float:2.102E-41)
        L74:
            long r5 = (long) r0
            return r5
        L76:
            boolean r0 = r7.A1W()
            if (r0 == 0) goto L7f
            r5 = 15000(0x3a98, double:7.411E-320)
            return r5
        L7f:
            X.1vY r0 = X.EnumC41231vY.A0B
            if (r2 != r0) goto L93
            X.4py r1 = r7.A0A
            java.lang.String r0 = "Bloks netego model is missing bloks model."
            X.C18C.A07(r1, r0)
            X.1pZ r0 = r1.A01
            int r0 = r0.A00
            if (r0 != 0) goto L74
            r0 = 5000(0x1388, float:7.006E-42)
            goto L74
        L93:
            X.1vY r1 = X.EnumC41231vY.A0S
            r0 = 0
            if (r2 != r1) goto L99
            r0 = 1
        L99:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto Lb1
            if (r5 != 0) goto Lb1
            X.1vY r0 = X.EnumC41231vY.A0T
            if (r2 != r0) goto Lb4
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 37172357831918141(0x8410100009023d, double:3.5712870017512266E-306)
            double r0 = X.C18U.A00(r2, r6, r0)
            long r5 = (long) r0
        Laf:
            long r5 = r5 * r3
            return r5
        Lb1:
            r5 = 10
            goto Laf
        Lb4:
            X.1vY r0 = X.EnumC41231vY.A0E
            if (r2 != r0) goto Lc2
            X.4pr r1 = r7.A0C
            java.lang.String r0 = "Meta Gallery Stories Netego is missing data in story model"
            X.C18C.A07(r1, r0)
            int r0 = r1.A00
            goto L74
        Lc2:
            long r5 = (long) r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC84863qa.A03(com.instagram.common.session.UserSession, X.1vS, X.1w4, float):long");
    }

    public static final AndroidLink A04(Context context, UserSession userSession, C41181vS c41181vS) {
        ReelCTAIntf reelCTAIntf;
        List BNi;
        int ordinal = c41181vS.A0e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                return null;
            }
            C105814ps c105814ps = c41181vS.A0d;
            if (c105814ps != null) {
                List list = c105814ps.A00.A4Z;
                if (list == null || (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0O(list, 0)) == null || (BNi = reelCTAIntf.BNi()) == null) {
                    return null;
                }
                return (AndroidLink) BNi.get(0);
            }
            throw new IllegalStateException("Required value was null.");
        }
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            AndroidLink A01 = AbstractC905941u.A01(context, userSession, c38321qM, c38321qM.A3p(), false);
            if (A01 == null && c41181vS.A0s()) {
                A01 = AbstractC905941u.A01(context, userSession, c38321qM, c38321qM.A3Y(), false);
            }
            if (A01 != null || !c41181vS.A0s()) {
                return A01;
            }
            for (AndroidLink androidLink : c38321qM.A3Y()) {
                String Aw8 = androidLink.Aw8();
                if (Aw8 != null && AbstractC002300n.A0h(Aw8, "instagram://run_bloks_action", true)) {
                    return androidLink;
                }
            }
            return null;
        }
        throw new IllegalStateException("Reel item is of MEDIA type but doesn't have a media!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0226, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x023a, code lost:
    
        if (X.C54P.A01(r8, r9) != true) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r0 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence A05(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C41181vS r10, java.lang.Boolean r11, java.lang.Integer r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC84863qa.A05(android.content.Context, com.instagram.common.session.UserSession, X.1vS, java.lang.Boolean, java.lang.Integer, java.lang.String):java.lang.CharSequence");
    }

    public static final String A06(Context context, UserSession userSession, C41181vS c41181vS) {
        Object[] objArr;
        int i;
        Object A05;
        List C1N;
        ReelCTAIntf reelCTAIntf;
        C14360o3.A0B(context, 1);
        if (c41181vS == null) {
            return null;
        }
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (C1N = c38321qM.A0C.C1N()) != null && (reelCTAIntf = (ReelCTAIntf) AbstractC001800i.A0J(C1N)) != null && reelCTAIntf.Ati() != null) {
            return reelCTAIntf.Ati();
        }
        if (c41181vS.A0p()) {
            objArr = new Object[1];
            i = 2131971842;
        } else if (c41181vS.A0z()) {
            objArr = new Object[1];
            i = 2131971847;
        } else if (c41181vS.A0q()) {
            objArr = new Object[1];
            i = 2131971843;
        } else if (c41181vS.A0x()) {
            objArr = new Object[1];
            i = 2131971845;
        } else if (!c41181vS.A0y() && !c41181vS.A0u()) {
            if (c41181vS.A0m()) {
                objArr = new Object[1];
                i = 2131971841;
            } else {
                AndroidLink A04 = A04(context, userSession, c41181vS);
                if (A04 != null) {
                    String C5F = A04.C5F();
                    if (C5F != null && C5F.length() != 0) {
                        return C5F;
                    }
                    EnumC906041v A01 = AbstractC114965Hm.A01(A04);
                    if (A01 != null) {
                        if (A01 == EnumC906041v.AD_DESTINATION_WEB) {
                            objArr = new Object[1];
                            i = 2131971848;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                objArr = new Object[1];
                A05 = A05(context, userSession, c41181vS, false, null, null);
                objArr[0] = A05;
                return context.getString(2131971844, objArr);
            }
        } else {
            objArr = new Object[1];
            i = 2131971846;
        }
        A05 = context.getString(i);
        objArr[0] = A05;
        return context.getString(2131971844, objArr);
    }

    public static final void A08(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
            view.animate().cancel();
            view.setAlpha(1.0f);
            return;
        }
        view.animate().alpha(0.0f).setDuration(200L).start();
    }

    public static final boolean A09(UserSession userSession, C41181vS c41181vS) {
        C14360o3.A0B(userSession, 0);
        if (!c41181vS.CY4() && !c41181vS.A13() && c41181vS.A0e != EnumC41231vY.A04 && !c41181vS.A1s(userSession) && !c41181vS.A1m()) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 1);
        if (C14360o3.A0K(C17060sy.A01.A01(userSession), c41181vS.A0i) && c41181vS.A0e == EnumC41231vY.A09 && (c41181vS.A01() > 0 || C18U.A06(C06090Tz.A05, userSession, 36317247022568407L))) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            if (c38321qM.A4f()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, C41181vS c41181vS) {
        C38321qM c38321qM;
        InterfaceC43507JJt BH4;
        C14360o3.A0B(userSession, 0);
        if (c41181vS.CY4() && (c38321qM = c41181vS.A0b) != null && (BH4 = c38321qM.A0C.BH4()) != null && BH4.Bcm() != null) {
            if ((C14360o3.A0K(C08730cb.A00(userSession).A00(), c41181vS.A0i) && C18U.A06(C06090Tz.A05, userSession, 36323625049730487L)) || C18U.A06(C06090Tz.A05, userSession, 36323625049009584L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (A0F(r7) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0C(com.instagram.common.session.UserSession r6, X.C41181vS r7, X.C3G2 r8) {
        /*
            r5 = 0
            if (r7 == 0) goto L1f
            boolean r0 = r7.CY4()
            if (r0 == 0) goto L10
            boolean r0 = A0F(r7)
            r2 = 1
            if (r0 != 0) goto L11
        L10:
            r2 = 0
        L11:
            boolean r1 = r7.A1X()
            boolean r0 = r7.A1j()
            if (r2 != 0) goto L20
            if (r1 != 0) goto L20
            if (r0 != 0) goto L20
        L1f:
            return r5
        L20:
            com.instagram.user.model.User r1 = r7.A0i
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r4 = r0 ^ 1
            X.3G2 r3 = X.C3G2.A1c
            X.3G2 r2 = X.C3G2.A03
            X.3G2 r1 = X.C3G2.A05
            X.3G2 r0 = X.C3G2.A04
            X.3G2[] r0 = new X.C3G2[]{r3, r2, r1, r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            boolean r0 = r0.contains(r8)
            if (r4 != 0) goto L4a
            if (r0 != 0) goto L4a
            X.4pv r0 = r7.A0f
            if (r0 == 0) goto L1f
        L4a:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC84863qa.A0C(com.instagram.common.session.UserSession, X.1vS, X.3G2):boolean");
    }

    public static final boolean A0D(UserSession userSession, C41551w4 c41551w4) {
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(userSession, 1);
        if (C41551w4.A00(userSession, c41551w4).isEmpty() && c41551w4.A0H.A1X) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0E(com.instagram.common.session.UserSession r6, X.C41551w4 r7, X.C3G2 r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r4 = 1
            X.C14360o3.A0B(r6, r4)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            int r5 = r7.A01
            com.instagram.model.reels.Reel r2 = r7.A0H
            int r0 = r2.A00
            r3 = 0
            r1 = 0
            if (r5 != r0) goto L17
            r1 = 1
        L17:
            boolean r0 = r8.A01()
            if (r0 == 0) goto L2a
            boolean r0 = r2.A17(r6)
            if (r0 == 0) goto L2a
            boolean r0 = r7.A07
            if (r0 != 0) goto L2a
            r2 = 1
            if (r1 != 0) goto L2b
        L2a:
            r2 = 0
        L2b:
            java.util.List r0 = X.C41551w4.A00(r6, r7)
            int r0 = r0.size()
            if (r0 == 0) goto L44
            int r1 = r7.A01
            java.util.List r0 = X.C41551w4.A00(r6, r7)
            int r0 = r0.size()
            int r0 = r0 - r4
            if (r1 == r0) goto L44
            if (r2 == 0) goto L45
        L44:
            r3 = 1
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC84863qa.A0E(com.instagram.common.session.UserSession, X.1w4, X.3G2):boolean");
    }

    public static final float A00(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            int i = configuration.screenWidthDp;
            if (Integer.valueOf(i) != null && AbstractC52812bN.A02(AbstractC52892bV.A00(i))) {
                return 0.35f;
            }
        }
        return 0.2f;
    }

    public static final int A01() {
        int i = 0;
        if (!AbstractC13440mV.A07()) {
            return 0;
        }
        int A01 = AbstractC13440mV.A01();
        if (C57992lC.A03()) {
            i = C57992lC.A01();
        }
        return Math.max(A01, i);
    }

    public static final void A07(Activity activity, float f) {
        if (!AbstractC72723Nt.A00(activity) && AbstractC56402iY.A0A(activity)) {
            AbstractC56402iY.A02(activity, AbstractC13950nL.A02(f, -16777216, -1));
            boolean z = false;
            if (f > 0.6d) {
                z = true;
            }
            AbstractC56402iY.A06(activity, z);
        }
    }

    public static final boolean A0F(C41181vS c41181vS) {
        if (!A0G(c41181vS) && !c41181vS.A0h()) {
            if (c41181vS.A1F() && !c41181vS.A0Q && !c41181vS.A0S) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0G(C41181vS c41181vS) {
        if (!c41181vS.A0p() && !c41181vS.A0z() && !c41181vS.A0q() && !c41181vS.A0x() && !c41181vS.A0y() && !c41181vS.A0u() && !c41181vS.A0m() && !c41181vS.A0s()) {
            return false;
        }
        return true;
    }
}
