package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.OdK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55156OdK {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006a, code lost:
    
        if (r4 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r12, X.AbstractC59962oe r13, com.instagram.common.session.UserSession r14, X.C131995xZ r15, X.OAD r16, X.C54799OJt r17, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r18) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55156OdK.A00(android.content.Context, X.2oe, com.instagram.common.session.UserSession, X.5xZ, X.OAD, X.OJt, instagram.features.stories.dashboard.fragment.ReelDashboardFragment):void");
    }

    public static final void A01(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, OAD oad, C54799OJt c54799OJt, ReelDashboardFragment reelDashboardFragment, boolean z, boolean z2) {
        if (!oad.A01 && AbstractC50624MWl.A00 == null) {
            C56033Ou5 c56033Ou5 = new C56033Ou5(0, context, abstractC59962oe, userSession, oad, c54799OJt, reelDashboardFragment);
            AbstractC50624MWl.A00 = c56033Ou5;
            AbstractC25651Mw.A00(userSession).A01(c56033Ou5, C211849aB.class);
        }
        C55040OZm c55040OZm = new C55040OZm(C82G.A0w, abstractC59962oe, userSession, new OAE(oad, c54799OJt, reelDashboardFragment));
        C41181vS c41181vS = oad.A02;
        if (z2) {
            C55040OZm.A00(c55040OZm, c41181vS, AbstractC25231BEo.A0p(), z);
            return;
        }
        UserSession userSession2 = c55040OZm.A04;
        if (!C180377zR.A07(userSession2)) {
            DHP dhp = new DHP(17, c55040OZm, z);
            EnumC53382NjX.A05.A06(c55040OZm.A03, userSession2, new C56726PFu(c55040OZm, c41181vS, dhp), EnumC72412Xd8.A0g);
            return;
        }
        C55040OZm.A01(c55040OZm, c41181vS, z);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Zx, X.MnJ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Zx, X.MnJ] */
    public static final void A02(EnumC201098ur enumC201098ur, C82H c82h, UserSession userSession, OAD oad, String str) {
        String str2;
        String str3;
        C82G c82g = C82G.A0w;
        C82I A0H = MSW.A0H();
        C38321qM c38321qM = oad.A02.A0b;
        String str4 = null;
        if (c38321qM != null) {
            str2 = c38321qM.getId();
        } else {
            str2 = null;
        }
        A0H.A06("ig_media_id", str2);
        MSX.A1I(A0H, oad.A01);
        A0H.A06("suppress_reason", str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        if (enumC201098ur == EnumC201098ur.VIEW && c82h == C82H.A0u) {
            MU0 mu0 = MU0.VIEW;
            MU1 mu1 = MU1.STORY;
            ?? c0Zx = new C0Zx();
            if (c38321qM != null) {
                str3 = c38321qM.getId();
            } else {
                str3 = null;
            }
            c0Zx.A06("media_id", str3);
            AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession);
        }
        if (enumC201098ur == EnumC201098ur.ACCEPT && c82h == C82H.A0u) {
            MU0 mu02 = MU0.SHARE_CLICK;
            MU1 mu12 = MU1.STORY;
            ?? c0Zx2 = new C0Zx();
            if (c38321qM != null) {
                str4 = c38321qM.getId();
            }
            c0Zx2.A06("media_id", str4);
            AbstractC50568MTz.A00(mu02, mu12, c82g, c0Zx2, userSession);
        }
    }

    public static final boolean A03(OAD oad) {
        C38321qM c38321qM = oad.A02.A0b;
        if (c38321qM == null) {
            return false;
        }
        if (!c38321qM.A5W() && c38321qM.A13() != 19) {
            return false;
        }
        return true;
    }
}
