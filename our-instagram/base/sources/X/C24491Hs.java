package X;

import java.util.concurrent.Callable;

/* renamed from: X.1Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24491Hs {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Hu] */
    public final C24511Hu A00(final Callable callable, final int i, final int i2, final boolean z, final boolean z2) {
        return new AbstractC24481Hr(i, i2, z, z2) { // from class: X.1Hu
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    A0A(callable.call());
                } catch (Exception e) {
                    if (!(e instanceof RuntimeException)) {
                        A09(e);
                        return;
                    }
                    throw e;
                }
            }

            public final String toString() {
                return callable.toString();
            }
        };
    }
}
