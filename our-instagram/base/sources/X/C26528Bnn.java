package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Bnn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26528Bnn extends AbstractC51572Yf {
    public final ScaleGestureDetectorOnScaleGestureListenerC65851TvC A00;
    public final int A01;
    public final int A02;
    public final C51722Yv A03;
    public final ClipsViewerConfig A04;
    public final UserSession A05;
    public final AbstractC25398BLp A06;
    public final InterfaceC30978DjZ A07;
    public final C25348BJr A08;
    public final WeakReference A09;
    public final HashMap A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C38321qM c38321qM;
        ExtendedImageUrl A1q;
        C14360o3.A0B(c76223bS, 0);
        BN7 bn7 = BN7.A00;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(AbstractC25232BEp.A17(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), C05F.A01, 100.0f, 0), C05F.A00, 100.0f, 0);
        InterfaceC30978DjZ interfaceC30978DjZ = this.A07;
        AbstractC25398BLp abstractC25398BLp = this.A06;
        UserSession userSession = abstractC25398BLp.A0H;
        C51722Yv A00 = C9CV.A00(C9CV.A00(bn7.A00(AbstractC77363dM.A00(c76223bS), bn7.A01(AbstractC77363dM.A00(c76223bS), A0d, userSession, interfaceC30978DjZ), userSession), C05F.A02, DR5.A00, 4), C05F.A04, DRT.A00(this, 11), 4);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C120985dq c120985dq = abstractC25398BLp.A0D;
        List list = c120985dq.A0R;
        if (((list != null && (c38321qM = AbstractC25225BEi.A0x(list, this.A02)) != null) || (c38321qM = c120985dq.A02) != null) && (A1q = c38321qM.A1q(AbstractC25226BEj.A0O(A12))) != null) {
            UserSession userSession2 = this.A05;
            if (!this.A0B && C18U.A06(AbstractC25225BEi.A0j(userSession2, 0), userSession2, 36324887769461325L)) {
                A12.A00(new C26409Bls(AbstractC47069KrQ.A00(A1q), abstractC25398BLp.A0G));
            }
        }
        C51722Yv c51722Yv = this.A03;
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap hashMap = this.A0A;
        AbstractC25230BEn.A1H(new BNK(c75933ay, this.A04, c120985dq, abstractC25398BLp.A0E, abstractC25398BLp.A0G, userSession, Integer.valueOf(this.A02), this.A09, A1G, hashMap, false, this.A0C, false, false, false, false), A13, A12, c51722Yv);
        return AbstractC25227BEk.A0V(new BV4(abstractC25398BLp, this.A08, this.A01), A12, c76223bS, A00);
    }

    public C26528Bnn(C51722Yv c51722Yv, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AbstractC25398BLp abstractC25398BLp, InterfaceC30978DjZ interfaceC30978DjZ, C25348BJr c25348BJr, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC, WeakReference weakReference, HashMap hashMap, int i, int i2, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, abstractC25398BLp);
        AbstractC167007dF.A1I(hashMap, 5, scaleGestureDetectorOnScaleGestureListenerC65851TvC);
        AbstractC25229BEm.A1M(c51722Yv, 10, clipsViewerConfig);
        this.A05 = userSession;
        this.A06 = abstractC25398BLp;
        this.A01 = i;
        this.A09 = weakReference;
        this.A0A = hashMap;
        this.A07 = interfaceC30978DjZ;
        this.A02 = i2;
        this.A00 = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
        this.A08 = c25348BJr;
        this.A03 = c51722Yv;
        this.A0B = z;
        this.A0C = z2;
        this.A04 = clipsViewerConfig;
    }
}
