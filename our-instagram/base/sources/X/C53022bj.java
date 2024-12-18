package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.2bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53022bj {
    public final C53032bk A00 = new Object();
    public final Map A01 = new LinkedHashMap();
    public final java.util.Set A02 = new LinkedHashSet();
    public volatile boolean A03;

    public static final void A00(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A01(AutoCloseable autoCloseable) {
        if (this.A03) {
            A00(autoCloseable);
            return;
        }
        synchronized (this.A00) {
            this.A02.add(autoCloseable);
        }
    }
}
