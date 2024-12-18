package X;

import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Iqu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42453Iqu implements InterfaceC43438JHc {
    public final UserSession A00;
    public final InterfaceC686136y A01;
    public final C81053ja A02;
    public final InterfaceC60442pS A03;
    public final C676533f A04;

    public C42453Iqu(UserSession userSession, InterfaceC686136y interfaceC686136y, C81053ja c81053ja, InterfaceC60442pS interfaceC60442pS, C676533f c676533f) {
        C14360o3.A0B(c81053ja, 4);
        this.A01 = interfaceC686136y;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A02 = c81053ja;
        this.A04 = c676533f;
    }

    @Override // X.InterfaceC43438JHc
    public final void DmV(C3Y6 c3y6, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
        long j;
        Long A0j;
        AbstractC167007dF.A1K(c38321qM, c75113Zb);
        C14360o3.A0B(c3y6, 4);
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_tap_collection_main_product");
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        AbstractC37301Gc2.A0z(A0f, j);
        AbstractC37301Gc2.A1B(A0f, false);
        AbstractC37303Gc4.A0f(A0f, c38321qM);
        AbstractC37300Gc1.A0o(A0f, c38321qM.A33());
        A0f.Cht();
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "collection_main_media_tap");
        A0F.A74 = C2Fb.A1C.toString();
        C32U.A0E(userSession, A0F, c38321qM, interfaceC60442pS, c75113Zb.A03);
        if (c3y6.A0A.getIgImageView().A0G()) {
            this.A02.A00(c3y6.A0F, c38321qM, c37905Gm2, c3y6, c75113Zb, c3y6.A0C, i);
        }
    }

    @Override // X.InterfaceC43438JHc
    public final void D5u(C3Y6 c3y6, C38321qM c38321qM, C75113Zb c75113Zb, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk, int i) {
        C676533f c676533f = this.A04;
        if (!c676533f.A02()) {
            MediaFrameLayout mediaFrameLayout = c3y6.A0F;
            if (mediaFrameLayout.getParent() instanceof InterfaceC73933Tf) {
                ViewParent parent = mediaFrameLayout.getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.ZoomableViewContainer");
                c676533f.A01(mediaFrameLayout, (InterfaceC73933Tf) parent, c38321qM, scaleGestureDetectorOnScaleGestureListenerC81153jk, c75113Zb.A03, i);
            }
        }
    }

    @Override // X.InterfaceC43438JHc
    public final void DBO(C3Y6 c3y6, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
        if (c3y6.A0A.getIgImageView().A0G()) {
            this.A02.A01(c3y6.A01, c38321qM, c37905Gm2, c75113Zb, i);
        }
    }
}
