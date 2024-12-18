package X;

import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IrY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42493IrY implements InterfaceC904641g {
    public final Fragment A00;
    public final InterfaceC686136y A01;
    public final C81053ja A02;
    public final C676533f A03;

    public C42493IrY(Fragment fragment, InterfaceC686136y interfaceC686136y, C81053ja c81053ja, C676533f c676533f) {
        C14360o3.A0B(c81053ja, 3);
        this.A01 = interfaceC686136y;
        this.A00 = fragment;
        this.A02 = c81053ja;
        this.A03 = c676533f;
    }

    @Override // X.InterfaceC904641g
    public final void DnZ(C81473kH c81473kH, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.A01(c81473kH.A01, c38321qM, c37905Gm2, c75113Zb, i);
    }

    @Override // X.InterfaceC904641g
    public final void Dna(C81473kH c81473kH, C38321qM c38321qM, C75113Zb c75113Zb, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk, int i) {
        AbstractC167007dF.A1F(c38321qM, 1, c81473kH);
        C676533f c676533f = this.A03;
        if (!c676533f.A02()) {
            MediaFrameLayout mediaFrameLayout = c81473kH.A09;
            if (mediaFrameLayout.getParent() instanceof InterfaceC73933Tf) {
                c676533f.A01(mediaFrameLayout, c81473kH.A02, c38321qM, scaleGestureDetectorOnScaleGestureListenerC81153jk, c75113Zb.A03, i);
            }
        }
    }

    @Override // X.InterfaceC904641g
    public final void Dnb(C81473kH c81473kH, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        if (this.A00.getActivity() != null) {
            if (c81473kH.A06.CXh() || c81473kH.A05.CXh()) {
                this.A02.A00(c81473kH.A09, c38321qM, c37905Gm2, null, c75113Zb, c81473kH.A07, i);
            }
        }
    }

    @Override // X.AnonymousClass374
    public final InterfaceC86433tG BRk() {
        return this.A01.BRk();
    }
}
