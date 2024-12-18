package X;

import android.view.View;

/* renamed from: X.NFo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52372NFo extends C3PD {
    public final /* synthetic */ C3G4 A00;
    public final /* synthetic */ InterfaceC64002vL A01;

    public C52372NFo(C3G4 c3g4, InterfaceC64002vL interfaceC64002vL) {
        this.A01 = interfaceC64002vL;
        this.A00 = c3g4;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        InterfaceC64002vL interfaceC64002vL = this.A01;
        if (interfaceC64002vL != null) {
            interfaceC64002vL.D1e(this.A00.A03);
            return true;
        }
        return true;
    }
}
