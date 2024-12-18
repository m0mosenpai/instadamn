package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25435BNa extends AbstractC51572Yf {
    public final C25377BKu A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC31137Dmc A06;
    public final InterfaceC31048Dkm A07;

    public C25435BNa(C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31048Dkm interfaceC31048Dkm) {
        AbstractC167007dF.A1I(c37644Ghd, 5, interfaceC31137Dmc);
        this.A07 = interfaceC31048Dkm;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A00 = c25377BKu;
        this.A01 = clipsViewerConfig;
        this.A06 = interfaceC31137Dmc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a0, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36325617913836751L) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (X.C14360o3.A0K(r1.A01(r0), r8.A09(r0)) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x055a  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r36) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25435BNa.A0Y(X.3bS):X.2Vc");
    }

    private final C51722Yv A03(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2Z1 c2z1, boolean z) {
        C51722Yv c51722Yv = C51722Yv.A02;
        C51722Yv A0W = AbstractC25231BEo.A0W(c2z1.ArD(), AbstractC25225BEi.A0h(null, AbstractC25233BEq.A0h()), EnumC76913cd.GLOBAL, "element_above_username");
        if (z) {
            ValueAnimator A0u = AbstractC25232BEp.A0u(new float[]{0.9f, 1.0f});
            A0u.setDuration(250L);
            A0u.addUpdateListener(new BFF(c2xi, 26));
            ValueAnimator A0u2 = AbstractC25232BEp.A0u(new float[]{0.0f, 1.0f});
            A0u2.setDuration(250L);
            A0u2.addUpdateListener(new BFF(c2xi2, 25));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(A0u, A0u2);
            animatorSet.addListener(new BQM(c2xi3, 4));
            C51722Yv A0A = AbstractC25234BEr.A0A(c2xi, null, new C9CV(c2xi, C05F.A1F));
            Integer num = C05F.A00;
            c51722Yv = AbstractC25225BEi.A0h(AbstractC25230BEn.A0e(AbstractC25231BEo.A0X(c2xi2, A0A, num), num, new C30177DRh(37, c2xi, c2xi2, c2xi3, animatorSet), null), new C77863eE(C05F.A01, C30170DRa.A00(c2xi, c2xi2, 39), null));
        }
        return A0W.A00(c51722Yv);
    }
}
