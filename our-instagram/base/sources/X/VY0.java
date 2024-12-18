package X;

import android.content.Context;

/* loaded from: classes11.dex */
public abstract class VY0 {
    public static InterfaceC71946XBv A00;

    public static void A00(Context context) {
        if (A00 == null) {
            try {
                A00 = (InterfaceC71946XBv) Class.forName("DefaultLocationProvider").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Exception e) {
                throw new RuntimeException("GeoAPI is not available. Please register your own location provider.", e);
            }
        }
    }
}
