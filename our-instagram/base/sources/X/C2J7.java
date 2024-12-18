package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2J7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2J7 {
    public static final void A01(C2J6 c2j6) {
        C14360o3.A0B(c2j6, 0);
        String str = "managerInstance";
        if (C2J8.A06 == null) {
            ReentrantLock reentrantLock = C2J8.A05;
            reentrantLock.lock();
            try {
                if (C2J8.A06 == null) {
                    C2J8.A06 = new C2J8();
                    C2J8 c2j8 = C2J8.A06;
                    if (c2j8 == null) {
                        C14360o3.A0F("managerInstance");
                        throw C00O.createAndThrow();
                    }
                    c2j8.A00 = c2j6;
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        C2J8 c2j82 = C2J8.A06;
        if (c2j82 != null) {
            C2J6 c2j62 = c2j82.A00;
            if (c2j62 == null) {
                str = "appConfig";
            } else {
                if (c2j62 != c2j6) {
                    throw new IllegalStateException(" W3CConfig is already initialized for the app");
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C2J8 A00() {
        if (C2J8.A06 != null) {
            C2J8 c2j8 = C2J8.A06;
            if (c2j8 == null) {
                C14360o3.A0F("managerInstance");
                throw C00O.createAndThrow();
            }
            return c2j8;
        }
        throw new IllegalStateException("W3CAppClient is not initialized yet");
    }

    public final C62761SPt A02() {
        return (C62761SPt) A00().A02.getValue();
    }
}
