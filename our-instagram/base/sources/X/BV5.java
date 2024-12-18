package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BV5 extends AbstractC77583di {
    public final float A00;
    public final float A01;
    public final C65850TvB A02;
    public final C120985dq A03;
    public final C37644Ghd A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC31137Dmc A07;
    public final C27345C5a A08;
    public final C5Z A09;
    public final AbstractC25398BLp A0A;
    public final InterfaceC30978DjZ A0B;
    public final C25348BJr A0C;
    public final ScaleGestureDetectorOnScaleGestureListenerC65851TvC A0D;
    public final HashMap A0E;
    public final ClipsViewerConfig A0F;
    public final SPM A0G;
    public final boolean A0H;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C2YW c2yw = new C2YW(Integer.MAX_VALUE, Integer.MAX_VALUE);
        C51722Yv c51722Yv = null;
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0j(BV6.A00, false), BWY.A00, C30170DRa.A00(this, c77993eR, 28));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        Integer num2 = C05F.A00;
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(C9CV.A00(AbstractC25230BEn.A0d(A0d, num2, 100.0f, 0), C05F.A04, DRT.A00(this, 7), 4), num2, DRT.A00(this, 8), null), num, DRT.A00(this, 9), null);
        if (this.A03.CdW()) {
            c51722Yv = AbstractC25233BEq.A0N(EnumC77673dr.A0K, null);
        }
        return AbstractC25225BEi.A0g(A0e.A00(c51722Yv), c2yw, A0c);
    }

    public static final BV3 A03(C51722Yv c51722Yv, C38321qM c38321qM, BV5 bv5, int i) {
        UserSession userSession = bv5.A06;
        AbstractC25398BLp abstractC25398BLp = bv5.A0A;
        C37644Ghd c37644Ghd = bv5.A04;
        C27345C5a c27345C5a = bv5.A08;
        C9CV A0o = AbstractC25228BEl.A0o(C05F.A02, BV7.A00);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0o);
        C25348BJr c25348BJr = bv5.A0C;
        SPM spm = bv5.A0G;
        float f = bv5.A00;
        C120985dq c120985dq = bv5.A03;
        return new BV3(A0h, c37644Ghd, userSession, c38321qM, spm, c27345C5a, abstractC25398BLp, c25348BJr, f, i, c120985dq.A0F(), c120985dq.A0I());
    }

    public static final C26528Bnn A04(C51722Yv c51722Yv, BV5 bv5, int i) {
        UserSession userSession = bv5.A06;
        AbstractC25398BLp abstractC25398BLp = bv5.A0A;
        WeakReference A16 = AbstractC25225BEi.A16(bv5.A07);
        HashMap hashMap = bv5.A0E;
        InterfaceC30978DjZ interfaceC30978DjZ = bv5.A0B;
        C5Z c5z = bv5.A09;
        return new C26528Bnn(c51722Yv, bv5.A0F, userSession, abstractC25398BLp, interfaceC30978DjZ, bv5.A0C, c5z, A16, hashMap, i, i, bv5.A03.A0F(), bv5.A0H);
    }

    public BV5(C65850TvB c65850TvB, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SPM spm, InterfaceC31137Dmc interfaceC31137Dmc, C27345C5a c27345C5a, C5Z c5z, AbstractC25398BLp abstractC25398BLp, InterfaceC30978DjZ interfaceC30978DjZ, C25348BJr c25348BJr, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC, HashMap hashMap, float f, float f2, boolean z) {
        AbstractC167017dG.A1Q(userSession, c37644Ghd);
        AbstractC25234BEr.A0k(4, interfaceC31137Dmc, hashMap, abstractC25398BLp, scaleGestureDetectorOnScaleGestureListenerC65851TvC);
        AbstractC167007dF.A1J(c27345C5a, 8, c5z);
        AbstractC25229BEm.A1P(interfaceC11380iw, 10, clipsViewerConfig);
        this.A06 = userSession;
        this.A03 = c120985dq;
        this.A04 = c37644Ghd;
        this.A07 = interfaceC31137Dmc;
        this.A0E = hashMap;
        this.A0A = abstractC25398BLp;
        this.A0D = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
        this.A08 = c27345C5a;
        this.A09 = c5z;
        this.A05 = interfaceC11380iw;
        this.A0C = c25348BJr;
        this.A0B = interfaceC30978DjZ;
        this.A01 = f;
        this.A00 = f2;
        this.A0H = z;
        this.A0F = clipsViewerConfig;
        this.A0G = spm;
        this.A02 = c65850TvB;
    }
}
