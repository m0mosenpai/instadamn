package X;

import android.graphics.Bitmap;

/* renamed from: X.Stl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63791Stl implements InterfaceC65558Tme, InterfaceC65321Ti1 {
    public final Bitmap A00;
    public final InterfaceC65571Tn4 A01;

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

    @Override // X.InterfaceC65321Ti1
    public final void initialize() {
        this.A00.prepareToDraw();
    }

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
        this.A01.E6v(this.A00);
    }

    public C63791Stl(Bitmap bitmap, InterfaceC65571Tn4 interfaceC65571Tn4) {
        if (bitmap != null) {
            this.A00 = bitmap;
            if (interfaceC65571Tn4 != null) {
                this.A01 = interfaceC65571Tn4;
                return;
            }
            throw AbstractC166987dD.A15("BitmapPool must not be null");
        }
        throw AbstractC166987dD.A15("Bitmap must not be null");
    }
}
