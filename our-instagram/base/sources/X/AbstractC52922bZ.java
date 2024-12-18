package X;

import java.io.Closeable;
import java.util.Iterator;
import kotlin.Deprecated;

/* renamed from: X.2bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC52922bZ {
    public final C53022bj impl = new C53022bj();

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        C14360o3.A0B(closeable, 0);
        C53022bj c53022bj = this.impl;
        if (c53022bj != null) {
            c53022bj.A01(closeable);
        }
    }

    public final AutoCloseable getCloseable(String str) {
        AutoCloseable autoCloseable;
        C14360o3.A0B(str, 0);
        C53022bj c53022bj = this.impl;
        if (c53022bj != null) {
            synchronized (c53022bj.A00) {
                autoCloseable = (AutoCloseable) c53022bj.A01.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void onCleared() {
    }

    public final void clear$lifecycle_viewmodel_release() {
        C53022bj c53022bj = this.impl;
        if (c53022bj != null && !c53022bj.A03) {
            c53022bj.A03 = true;
            synchronized (c53022bj.A00) {
                Iterator it = c53022bj.A01.values().iterator();
                while (it.hasNext()) {
                    C53022bj.A00((AutoCloseable) it.next());
                }
                java.util.Set set = c53022bj.A02;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    C53022bj.A00((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        onCleared();
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(autoCloseable, 1);
        C53022bj c53022bj = this.impl;
        if (c53022bj != null) {
            if (c53022bj.A03) {
                C53022bj.A00(autoCloseable);
                return;
            }
            synchronized (c53022bj.A00) {
                autoCloseable2 = (AutoCloseable) c53022bj.A01.put(str, autoCloseable);
            }
            C53022bj.A00(autoCloseable2);
        }
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        C14360o3.A0B(autoCloseable, 0);
        C53022bj c53022bj = this.impl;
        if (c53022bj != null) {
            c53022bj.A01(autoCloseable);
        }
    }
}
