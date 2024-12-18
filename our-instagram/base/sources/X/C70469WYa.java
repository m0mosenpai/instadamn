package X;

import android.view.Surface;

/* renamed from: X.WYa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C70469WYa implements XL9 {
    public final XC8[] A00;

    public C70469WYa(XC8... xc8Arr) {
        C14360o3.A0B(xc8Arr, 1);
        this.A00 = xc8Arr;
    }

    @Override // X.XC8
    public final void Dr5(Surface surface) {
        for (XC8 xc8 : this.A00) {
            if (xc8 != null) {
                xc8.Dr5(surface);
            }
        }
    }

    @Override // X.XC8
    public final void DrB(Surface surface) {
        for (XC8 xc8 : this.A00) {
            if (xc8 != null) {
                xc8.DrB(surface);
            }
        }
    }
}
