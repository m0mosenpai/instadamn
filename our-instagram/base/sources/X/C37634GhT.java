package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37634GhT {
    public C37638GhX A00;
    public C37637GhW A01;
    public C37636GhV A02;
    public boolean A03;
    public final Context A04;
    public final FragmentActivity A05;
    public final ClipsViewerConfig A06;
    public final ClipsViewerSource A07;
    public final C120985dq A08;
    public final UserSession A09;
    public final InterfaceC60442pS A0A;
    public final C33R A0B;
    public final C75113Zb A0C;
    public final C1M1 A0D;
    public final C37546Gg2 A0E;
    public final C37560GgG A0F;
    public final C37556GgC A0G;
    public final String A0H;
    public final boolean A0I;
    public final C37635GhU A0J;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0067, code lost:
    
        if (r4 == X.C05F.A01) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C37634GhT r7) {
        /*
            X.3DO r6 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r5 = r7.A05
            X.3DN r0 = r6.A00(r5)
            r1 = 0
            if (r0 == 0) goto L59
            X.3DP r0 = (X.C3DP) r0
            java.lang.Integer r4 = r0.A0K
        Lf:
            java.lang.Integer r2 = X.C05F.A15
            r3 = 1
            com.instagram.clips.intf.ClipsViewerConfig r0 = r7.A06
            if (r4 != r2) goto L3b
            com.instagram.clips.intf.ClipsWatchAndBrowseData r4 = r0.A0K
            r2 = 1
            if (r4 == 0) goto L39
            boolean r0 = r4.A0D
            if (r0 != r3) goto L39
            X.3DN r0 = r6.A00(r5)
            if (r0 == 0) goto L39
            X.3DP r0 = (X.C3DP) r0
            int r1 = r0.A06
            r0 = 2
            if (r1 != r0) goto L39
            java.lang.Integer r1 = r4.A07
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L36
            boolean r0 = r4.A0C
            if (r0 != r3) goto L39
        L36:
            r6 = r2 ^ 1
        L38:
            return r6
        L39:
            r2 = 0
            goto L36
        L3b:
            com.instagram.clips.intf.ClipsWatchAndBrowseData r5 = r0.A0K
            r6 = 0
            if (r5 == 0) goto L5b
            boolean r0 = r5.A0D
            if (r0 != r3) goto L5b
            java.lang.Integer r0 = X.C05F.A1I
            if (r4 == r0) goto L38
            java.lang.Integer r0 = X.C05F.A0N
            if (r4 == r0) goto L38
            java.lang.Integer r0 = X.C05F.A0Y
            if (r4 == r0) goto L38
            java.lang.Integer r0 = X.C05F.A0j
            if (r4 == r0) goto L38
            java.lang.Integer r0 = X.C05F.A0u
            if (r4 != r0) goto L5b
            return r6
        L59:
            r4 = r1
            goto Lf
        L5b:
            java.lang.Integer r0 = X.C05F.A1F
            if (r4 == r0) goto L70
            if (r5 == 0) goto L74
            boolean r0 = r5.A0J
            if (r0 != r3) goto L74
            java.lang.Integer r0 = X.C05F.A01
            if (r4 != r0) goto L74
        L69:
            java.lang.Integer r2 = r5.A08
        L6b:
            java.lang.Integer r0 = X.C05F.A0Y
            if (r2 != r0) goto L74
            return r6
        L70:
            if (r5 != 0) goto L69
            r2 = r1
            goto L6b
        L74:
            java.lang.Integer r0 = X.C05F.A0C
            if (r4 != r0) goto L81
            if (r5 == 0) goto L7c
            java.lang.Integer r1 = r5.A09
        L7c:
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L81
            return r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37634GhT.A00(X.GhT):boolean");
    }

    public C37634GhT(Context context, FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37546Gg2 c37546Gg2, C37560GgG c37560GgG, C37556GgC c37556GgC, String str) {
        C75113Zb c75113Zb;
        C38321qM c38321qM;
        InterfaceC39541sb A0F;
        InterfaceC88193wT BFe;
        C38321qM c38321qM2;
        AbstractC167017dG.A1P(context, clipsViewerConfig);
        AbstractC25234BEr.A0k(3, c37556GgC, userSession, fragmentActivity, interfaceC60442pS);
        C14360o3.A0B(str, 8);
        AbstractC25229BEm.A1J(c37560GgG, 9, c37546Gg2);
        this.A04 = context;
        this.A06 = clipsViewerConfig;
        this.A0G = c37556GgC;
        this.A08 = c120985dq;
        this.A09 = userSession;
        this.A05 = fragmentActivity;
        this.A0A = interfaceC60442pS;
        this.A0H = str;
        this.A0F = c37560GgG;
        this.A0E = c37546Gg2;
        this.A07 = clipsViewerConfig.A0J;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = null;
        if (c120985dq != null && (c38321qM2 = c120985dq.A02) != null) {
            c75113Zb = c37546Gg2.BRZ(c38321qM2);
        } else {
            c75113Zb = null;
        }
        this.A0C = c75113Zb;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null && (A0F = AbstractC37300Gc1.A0F(c38321qM)) != null && (BFe = A0F.BFe()) != null) {
            iGAdsFeedVideoWBViewerTypeEnum = BFe.BFM();
        }
        this.A0I = AbstractC167007dF.A1X(iGAdsFeedVideoWBViewerTypeEnum, IGAdsFeedVideoWBViewerTypeEnum.A0A);
        this.A0B = new BF0(this, 15);
        this.A0J = new C37635GhU(userSession);
        this.A0D = C1M3.A00();
    }
}
