package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.530, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass530 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(Drawable drawable, Drawable drawable2) {
        if (drawable == 0) {
            return drawable2 == 0;
        }
        if (drawable2 == 0) {
            return false;
        }
        if ((drawable instanceof InterfaceC85603rp) && (drawable2 instanceof InterfaceC85603rp)) {
            return ((InterfaceC85603rp) drawable).CTy((InterfaceC85603rp) drawable2);
        }
        return drawable.equals(drawable2);
    }
}
