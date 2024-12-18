package X;

import android.graphics.Bitmap;

/* renamed from: X.Stf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63785Stf implements InterfaceC65558Tme {
    public final Bitmap A00;

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return Bitmap.class;
    }

    @Override // X.InterfaceC65558Tme
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return C63375Sim.A01(this.A00);
    }

    public C63785Stf(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
