package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes9.dex */
public final class P25 implements InterfaceC37209GaK {
    public final InterfaceC58308Pt0 A00;
    public final /* synthetic */ C52199N8o A01;

    public P25(InterfaceC58308Pt0 interfaceC58308Pt0, C52199N8o c52199N8o) {
        this.A01 = c52199N8o;
        this.A00 = interfaceC58308Pt0;
    }

    @Override // X.InterfaceC37209GaK
    public final int BYu(TextView textView) {
        return this.A01.A05(textView);
    }

    @Override // X.InterfaceC37209GaK
    public final boolean Cco(DirectShareTarget directShareTarget) {
        C52199N8o c52199N8o = this.A01;
        if (!c52199N8o.A0i) {
            if (directShareTarget.A0V() && AbstractC1337462f.A00(c52199N8o.A0B)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37209GaK
    public final void Dkm(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        this.A00.Dkm(directShareTarget, i, i2, i3);
    }

    @Override // X.InterfaceC37209GaK
    public final void Dqj(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        this.A00.Dqj(view, directShareTarget, i, i2, i3);
    }

    @Override // X.InterfaceC37209GaK
    public final void DwC(DirectShareTarget directShareTarget, int i, int i2) {
        this.A00.DwC(directShareTarget, i, i2);
    }
}
