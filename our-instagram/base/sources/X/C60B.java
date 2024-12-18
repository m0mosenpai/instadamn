package X;

import com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider;

/* renamed from: X.60B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60B {
    public static IGSecureMessageMasterKeyProvider A00;

    public static synchronized void A00() {
        synchronized (C60B.class) {
            IGSecureMessageMasterKeyProvider iGSecureMessageMasterKeyProvider = A00;
            if (iGSecureMessageMasterKeyProvider != null) {
                synchronized (iGSecureMessageMasterKeyProvider) {
                    try {
                        IGSecureMessageMasterKeyProvider.sInitialized = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (C60C.class) {
                try {
                    C60C.A00 = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            A00 = null;
        }
    }
}
