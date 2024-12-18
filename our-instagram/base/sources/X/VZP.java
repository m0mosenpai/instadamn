package X;

import android.os.Build;
import android.util.Property;

/* loaded from: classes11.dex */
public abstract class VZP {
    public static final Property A00;
    public static final Property A01;
    public static final VKI A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VKI] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        ?? r0;
        if (Build.VERSION.SDK_INT >= 29) {
            r0 = new UKA();
        } else {
            r0 = new Object();
        }
        A02 = r0;
        A01 = new C66041Tyd(6);
        A00 = new C66041Tyd(7);
    }
}
