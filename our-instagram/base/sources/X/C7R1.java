package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.7R1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7R1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable.Callback callback, Drawable drawable, InterfaceC162877Qy interfaceC162877Qy) {
        InterfaceC162887Qz interfaceC162887Qz;
        if (drawable != 0) {
            drawable.setCallback(callback);
            if ((drawable instanceof InterfaceC162887Qz) && (interfaceC162887Qz = (InterfaceC162887Qz) drawable) != null) {
                interfaceC162887Qz.Eg9(interfaceC162877Qy);
            }
        }
    }

    public static final void A01(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }
}
