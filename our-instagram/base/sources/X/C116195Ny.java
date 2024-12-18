package X;

import androidx.window.extensions.WindowExtensionsProvider;
import java.util.Map;

/* renamed from: X.5Ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116195Ny {
    public static final int A00() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }

    static {
        Map map = C0YZ.A03;
        AbstractC13230m9.A01(C116195Ny.class);
    }
}
