package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.Stm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63792Stm implements InterfaceC65558Tme, InterfaceC65321Ti1 {
    public final Resources A00;
    public final InterfaceC65558Tme A01;

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return BitmapDrawable.class;
    }

    @Override // X.InterfaceC65558Tme
    public final /* bridge */ /* synthetic */ Object get() {
        return new BitmapDrawable(this.A00, (Bitmap) this.A01.get());
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return this.A01.getSize();
    }

    @Override // X.InterfaceC65321Ti1
    public final void initialize() {
        InterfaceC65558Tme interfaceC65558Tme = this.A01;
        if (interfaceC65558Tme instanceof InterfaceC65321Ti1) {
            ((InterfaceC65321Ti1) interfaceC65558Tme).initialize();
        }
    }

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
        this.A01.recycle();
    }

    public C63792Stm(Resources resources, InterfaceC65558Tme interfaceC65558Tme) {
        Rs8.A00(resources);
        this.A00 = resources;
        this.A01 = interfaceC65558Tme;
    }
}
