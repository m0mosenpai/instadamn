package X;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes10.dex */
public final class TYR extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom;
        try {
            try {
                try {
                    try {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                        } catch (GeneralSecurityException unused) {
                            secureRandom = new SecureRandom();
                        }
                    } catch (GeneralSecurityException unused2) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                    }
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                }
            } catch (GeneralSecurityException unused3) {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            }
        } catch (GeneralSecurityException unused4) {
            secureRandom = SecureRandom.getInstance("SHA1PRNG", (Provider) AbstractC50523MSb.A0R("newProvider", Class.forName("org.conscrypt.Conscrypt")));
        }
        secureRandom.nextLong();
        return secureRandom;
    }
}
