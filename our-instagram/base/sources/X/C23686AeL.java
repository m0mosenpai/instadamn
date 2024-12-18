package X;

import android.view.View;

/* renamed from: X.AeL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23686AeL implements C3PE {
    public final /* synthetic */ InterfaceC187328Rz A00;
    public final /* synthetic */ C9V0 A01;

    public C23686AeL(InterfaceC187328Rz interfaceC187328Rz, C9V0 c9v0) {
        this.A00 = interfaceC187328Rz;
        this.A01 = c9v0;
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        InterfaceC187328Rz interfaceC187328Rz = this.A00;
        if (interfaceC187328Rz != null) {
            interfaceC187328Rz.DNZ(this.A01);
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        InterfaceC187328Rz interfaceC187328Rz = this.A00;
        if (interfaceC187328Rz != null) {
            interfaceC187328Rz.DNs(this.A01);
            return true;
        }
        return true;
    }
}
