package X;

import java.io.File;

/* renamed from: X.Sti, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63788Sti implements InterfaceC65558Tme {
    public final Object A00;

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return 1;
    }

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return this.A00.getClass();
    }

    @Override // X.InterfaceC65558Tme
    public final Object get() {
        return this.A00;
    }

    public C63788Sti(File file) {
        Rs8.A00(file);
        this.A00 = file;
    }
}
