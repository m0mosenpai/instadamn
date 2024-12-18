package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G6q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36466G6q implements InterfaceC37224GaZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32678Ea5 A01;

    @Override // X.InterfaceC37224GaZ
    public final boolean Ceu(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdG(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdH(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        C14360o3.A0B(directShareTarget, 0);
        return this.A01.A0K(directShareTarget, i, i2, i3, this.A00);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdK(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdO(View view) {
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdP() {
    }

    public C36466G6q(C32678Ea5 c32678Ea5, int i) {
        this.A01 = c32678Ea5;
        this.A00 = i;
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Cci(DirectShareTarget directShareTarget) {
        return this.A01.A0E.contains(directShareTarget);
    }

    @Override // X.InterfaceC37224GaZ
    public final void DAR(DirectShareTarget directShareTarget) {
        this.A01.A0B.DAR(directShareTarget);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean EiQ(DirectShareTarget directShareTarget) {
        C32678Ea5 c32678Ea5 = this.A01;
        InterfaceC37290Gbr interfaceC37290Gbr = c32678Ea5.A0B;
        if ((interfaceC37290Gbr.CLb() || interfaceC37290Gbr.EiR(((E01) c32678Ea5).A01, directShareTarget)) && !c32678Ea5.A0E.contains(directShareTarget)) {
            return true;
        }
        return false;
    }
}
