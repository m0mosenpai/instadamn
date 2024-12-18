package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.StO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63768StO implements InterfaceC65570Tn3 {
    public Object A00;
    public final InterfaceC65537Tm9 A01;
    public final File A02;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return this.A01.Avg();
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        try {
            Object E2J = this.A01.E2J(this.A02);
            this.A00 = E2J;
            interfaceC65471Tko.D9H(E2J);
        } catch (FileNotFoundException e) {
            android.util.Log.isLoggable("FileLoader", 3);
            interfaceC65471Tko.DPj(e);
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                this.A01.AIC(obj);
            } catch (IOException unused) {
            }
        }
    }

    public C63768StO(InterfaceC65537Tm9 interfaceC65537Tm9, File file) {
        this.A02 = file;
        this.A01 = interfaceC65537Tm9;
    }
}
