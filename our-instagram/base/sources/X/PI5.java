package X;

import android.view.Surface;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public final class PI5 implements InterfaceC58085PpA {
    public final /* synthetic */ OL3 A00;
    public final /* synthetic */ C53020Ncs A01;

    public PI5(OL3 ol3, C53020Ncs c53020Ncs) {
        this.A01 = c53020Ncs;
        this.A00 = ol3;
    }

    @Override // X.InterfaceC58085PpA
    public final void EpW(Surface surface, int i, int i2) {
        C53020Ncs c53020Ncs = this.A01;
        ConstraintLayout constraintLayout = this.A00.A03;
        ((AbstractC55102ObF) c53020Ncs).A01 = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        ((AbstractC55102ObF) c53020Ncs).A00 = height;
        C55142Ocx c55142Ocx = c53020Ncs.A08;
        if (c55142Ocx != null) {
            c55142Ocx.A01 = ((AbstractC55102ObF) c53020Ncs).A01;
            c55142Ocx.A00 = height;
        }
        ((C54817OKs) AbstractC54266Nym.A00(((AbstractC55102ObF) c53020Ncs).A07, EnumC142806cg.A04).A07.getValue()).A01(null, MSY.A0D(Integer.valueOf(c53020Ncs.A01), c53020Ncs.A00), null);
        ((AbstractC55102ObF) c53020Ncs).A09.A09.obtainMessage(6, i, i2, null).sendToTarget();
        C55142Ocx c55142Ocx2 = c53020Ncs.A08;
        if (c55142Ocx2 != null) {
            Surface surface2 = c53020Ncs.A04;
            c55142Ocx2.A03 = i;
            c55142Ocx2.A02 = i2;
            if (c55142Ocx2.A0E) {
                c55142Ocx2.A04();
                c55142Ocx2.A05(surface2);
            }
        }
        c53020Ncs.A03 = i;
        c53020Ncs.A02 = i2;
        C55142Ocx c55142Ocx3 = c53020Ncs.A08;
        if (c55142Ocx3 != null) {
            Surface surface3 = c53020Ncs.A04;
            c55142Ocx3.A03 = i;
            c55142Ocx3.A02 = i2;
            if (c55142Ocx3.A0E) {
                c55142Ocx3.A04();
                c55142Ocx3.A05(surface3);
            }
        }
        if (!C14360o3.A0K(c53020Ncs.A04, surface)) {
            c53020Ncs.A04 = surface;
            if (!c53020Ncs.A0F) {
                C53020Ncs.A02(c53020Ncs);
            }
        }
    }

    @Override // X.InterfaceC58085PpA
    public final void EpY() {
        this.A01.A04 = null;
    }
}
