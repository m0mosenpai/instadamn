package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: X.S4k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62265S4k {
    public static SharedPreferencesC63448SkR A00(Context context) {
        try {
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
            context.getApplicationContext();
            if ("_androidx_security_master_key_".equals(build.getKeystoreAlias())) {
                KeyGenParameterSpec keyGenParameterSpec = AbstractC62293S5o.A00;
                if (build.getKeySize() == 256) {
                    if (Arrays.equals(build.getBlockModes(), new String[]{"GCM"})) {
                        if (build.getPurposes() == 3) {
                            if (Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                                if (build.isUserAuthenticationRequired() && build.getUserAuthenticationValidityDurationSeconds() < 1) {
                                    throw AbstractC166987dD.A12("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                                }
                                String keystoreAlias = build.getKeystoreAlias();
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                if (!keyStore.containsAlias(keystoreAlias)) {
                                    try {
                                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                        keyGenerator.init(build);
                                        keyGenerator.generateKey();
                                    } catch (ProviderException e) {
                                        throw new GeneralSecurityException(e.getMessage(), e);
                                    }
                                }
                                try {
                                    return SharedPreferencesC63448SkR.A00(context, build.getKeystoreAlias());
                                } catch (IOException | GeneralSecurityException e2) {
                                    throw new KeyStoreException(e2);
                                }
                            }
                            throw AbstractC167007dF.A0c("invalid padding mode, want NoPadding got ", Arrays.toString(build.getEncryptionPaddings()));
                        }
                        throw AbstractC25230BEn.A0n("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ", build.getPurposes());
                    }
                    throw AbstractC167007dF.A0c("invalid block mode, want GCM got ", Arrays.toString(build.getBlockModes()));
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0c("invalid key size, want 256 bits got ", " bits", build.getKeySize()));
            }
            throw AbstractC58319PtB.A0i("KeyGenParamSpec's key alias does not match provided alias (", "_androidx_security_master_key_", " vs ", build.getKeystoreAlias());
        } catch (IOException | GeneralSecurityException e3) {
            throw new KeyStoreException(e3);
        }
    }
}
