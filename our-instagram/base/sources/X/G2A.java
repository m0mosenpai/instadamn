package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class G2A implements InterfaceC37293Gbu {
    public final String A00;
    public final /* synthetic */ FOV A01;

    @Override // X.InterfaceC37224GaZ
    public final boolean Ceu(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final void DAR(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdG(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdH(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        C14360o3.A0B(directShareTarget, 0);
        C3DO c3do = C3DN.A00;
        FOV fov = this.A01;
        AbstractC31176DnK.A12(fov.A02, c3do);
        C32324ELs c32324ELs = fov.A06;
        c32324ELs.A0A.A0R(AbstractC31174DnI.A0z(directShareTarget));
        c32324ELs.DdR();
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdK(DirectShareTarget directShareTarget) {
        return true;
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdO(View view) {
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdP() {
    }

    @Override // X.InterfaceC37293Gbu
    public final void DjF() {
    }

    @Override // X.InterfaceC37293Gbu
    public final void DyO() {
    }

    public G2A(FOV fov) {
        String BjQ;
        this.A01 = fov;
        InterfaceC169517hR interfaceC169517hR = fov.A01;
        this.A00 = (interfaceC169517hR == null || (BjQ = interfaceC169517hR.BjQ()) == null) ? "" : BjQ;
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Cci(DirectShareTarget directShareTarget) {
        return AbstractC31174DnI.A1W(directShareTarget, this.A01.A0B);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean EiQ(DirectShareTarget directShareTarget) {
        return AbstractC31174DnI.A1W(directShareTarget, this.A01.A0B);
    }

    @Override // X.InterfaceC37293Gbu
    public final String BrI() {
        return this.A00;
    }
}
