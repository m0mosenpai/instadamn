package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class PH8 implements InterfaceC58304Psw {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C54845OMq A01;
    public final /* synthetic */ OL4 A02;
    public final /* synthetic */ boolean A03;

    public PH8(View view, C54845OMq c54845OMq, OL4 ol4, boolean z) {
        this.A00 = view;
        this.A02 = ol4;
        this.A03 = z;
        this.A01 = c54845OMq;
    }

    @Override // X.InterfaceC57996Png
    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        C54845OMq c54845OMq;
        InterfaceC58187Pqt interfaceC58187Pqt = (InterfaceC58187Pqt) obj;
        C14360o3.A0B(interfaceC58187Pqt, 0);
        View view = this.A00;
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.iglive_sup_disconnected_overlay_stub);
        OL4 ol4 = this.A02;
        interfaceC58187Pqt.Csd(A0M, ol4.A04, C57532Pg6.A00(AbstractC166997dE.A0L(view), ol4, 9));
        if (this.A03 && (c54845OMq = this.A01) != null) {
            InterfaceC57802PkU Csa = interfaceC58187Pqt.Csa(view, ol4.A06, R.id.iglive_capture_layout_sup_debug_stub);
            c54845OMq.A07 = Csa;
            InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
            interfaceC58276PsU.F9t();
            interfaceC58276PsU.Eem(Csa);
        }
    }
}
