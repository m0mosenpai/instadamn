package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IMi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41219IMi {
    public WeakReference A00;
    public C684336g A01;

    public final void A00() {
        C684336g c684336g = this.A01;
        if (c684336g == null) {
            c684336g = new C684336g();
            c684336g.A04(this.A00);
            this.A01 = c684336g;
        }
        c684336g.A00();
    }

    public final void A01(InterfaceC684236f interfaceC684236f) {
        WeakReference weakReference;
        if (interfaceC684236f != null) {
            weakReference = AbstractC25225BEi.A16(interfaceC684236f);
        } else {
            weakReference = null;
        }
        this.A00 = weakReference;
        C684336g c684336g = this.A01;
        if (c684336g != null) {
            c684336g.A04(weakReference);
        }
    }
}
