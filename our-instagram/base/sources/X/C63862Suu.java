package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Suu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63862Suu implements InterfaceC65326Ti7 {
    public final InterfaceC65571Tn4 A00;
    public final InterfaceC65326Ti7 A01;
    public final InterfaceC65326Ti7 A02;

    public C63862Suu(InterfaceC65571Tn4 interfaceC65571Tn4, InterfaceC65326Ti7 interfaceC65326Ti7, InterfaceC65326Ti7 interfaceC65326Ti72) {
        this.A00 = interfaceC65571Tn4;
        this.A01 = interfaceC65326Ti7;
        this.A02 = interfaceC65326Ti72;
    }

    @Override // X.InterfaceC65326Ti7
    public final InterfaceC65558Tme F8B(C63729Ssj c63729Ssj, InterfaceC65558Tme interfaceC65558Tme) {
        C63791Stl c63791Stl;
        Drawable drawable = (Drawable) interfaceC65558Tme.get();
        if (drawable instanceof BitmapDrawable) {
            InterfaceC65326Ti7 interfaceC65326Ti7 = this.A01;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            InterfaceC65571Tn4 interfaceC65571Tn4 = this.A00;
            if (bitmap == null) {
                c63791Stl = null;
            } else {
                c63791Stl = new C63791Stl(bitmap, interfaceC65571Tn4);
            }
            return interfaceC65326Ti7.F8B(c63729Ssj, c63791Stl);
        }
        if (drawable instanceof Q2P) {
            return this.A02.F8B(c63729Ssj, interfaceC65558Tme);
        }
        return null;
    }
}
