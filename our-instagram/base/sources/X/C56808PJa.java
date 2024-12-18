package X;

import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.PJa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56808PJa implements InterfaceC171787l8 {
    public final int A00;
    public final Object A01;

    public C56808PJa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC171787l8
    public final void Czv() {
        if (this.A00 != 0) {
            C143316dW c143316dW = (C143316dW) this.A01;
            c143316dW.A0G = true;
            c143316dW.A08();
        } else {
            C51048Mh0 A00 = OUU.A00((OUU) this.A01);
            A00.A01 = true;
            C51048Mh0.A03(A00);
        }
    }

    @Override // X.InterfaceC171787l8
    public final void D0E() {
        if (this.A00 != 0) {
            AbstractC13880nE.A0O(((C143316dW) this.A01).A02);
            return;
        }
        OUU ouu = (OUU) this.A01;
        ouu.A08.post(new POP(ouu));
        C51048Mh0.A04(OUU.A00(ouu));
    }

    @Override // X.InterfaceC171787l8
    public final void Ekt(EnumC168447fe enumC168447fe) {
        if (this.A00 != 0) {
            C14360o3.A0B(enumC168447fe, 0);
            if (EnumC168447fe.A0A == enumC168447fe) {
                C143316dW c143316dW = (C143316dW) this.A01;
                TextView A0N = AbstractC167007dF.A0N(c143316dW.A0Z, R.id.reel_viewer_composer_top_message);
                A0N.setText(AbstractC166997dE.A0p(AbstractC166997dE.A0L(c143316dW.A0X), 2131974707));
                C1YH.A04(AbstractC12220kQ.A02(c143316dW.A0e), C05F.A01, false);
                A0N.setVisibility(0);
                c143316dW.A0G = true;
            }
        }
    }
}
