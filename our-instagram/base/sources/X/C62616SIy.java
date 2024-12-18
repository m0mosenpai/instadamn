package X;

import android.content.Context;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: X.SIy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62616SIy {
    public final EnumC61189Rgp A00;
    public final EnumC61177Rgd A01;
    public final EnumC61179Rgf A02;
    public final EnumC61151RgC A03;
    public final KeyPair A04;
    public final ECPrivateKey A05;
    public final ECPublicKey A06;

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, X.Rpe] */
    public C62616SIy(Context context, String str, String str2) {
        if (C61558Rpe.A01 == null) {
            synchronized (C61558Rpe.class) {
                if (C61558Rpe.A01 == null) {
                    ?? obj = new Object();
                    obj.A00 = context.getApplicationContext();
                    C61558Rpe.A01 = obj;
                }
            }
        }
        try {
            try {
                Context context2 = C61558Rpe.A01.A00;
                try {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
                    context2.getApplicationContext();
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
                                            SharedPreferencesC63448SkR A00 = SharedPreferencesC63448SkR.A00(context2, build.getKeystoreAlias());
                                            String string = A00.getString(AnonymousClass001.A0R("pk_", str), null);
                                            String string2 = A00.getString(AnonymousClass001.A0R("sk_", str), null);
                                            if (string != null && string2 != null) {
                                                try {
                                                    KeyPair A12 = AbstractC58321PtD.A12(string, string2);
                                                    this.A04 = A12;
                                                    if (A12.getPublic() instanceof ECPublicKey) {
                                                        ECPublicKey eCPublicKey = (ECPublicKey) A12.getPublic();
                                                        this.A06 = eCPublicKey;
                                                        SVD.A00(eCPublicKey.getW());
                                                        if (A12.getPrivate() instanceof ECPrivateKey) {
                                                            this.A05 = (ECPrivateKey) A12.getPrivate();
                                                            try {
                                                                long parseLong = Long.parseLong(str2, 16);
                                                                long j = 255 & (parseLong >> 8);
                                                                long j2 = (parseLong >> 16) & 65535;
                                                                long j3 = (parseLong >> 32) & 65535;
                                                                long j4 = (parseLong >> 48) & 65535;
                                                                EnumC61151RgC enumC61151RgC = (EnumC61151RgC) EnumC61151RgC.A01.get(Byte.valueOf((byte) j));
                                                                if (enumC61151RgC != null) {
                                                                    this.A03 = enumC61151RgC;
                                                                    EnumC61189Rgp enumC61189Rgp = (EnumC61189Rgp) AbstractC58319PtB.A0n(EnumC61189Rgp.A04, (int) j2);
                                                                    if (enumC61189Rgp != null) {
                                                                        this.A00 = enumC61189Rgp;
                                                                        EnumC61179Rgf enumC61179Rgf = (EnumC61179Rgf) AbstractC58319PtB.A0n(EnumC61179Rgf.A02, (int) j3);
                                                                        if (enumC61179Rgf != null) {
                                                                            this.A02 = enumC61179Rgf;
                                                                            EnumC61177Rgd enumC61177Rgd = (EnumC61177Rgd) AbstractC58319PtB.A0n(EnumC61177Rgd.A02, (int) j4);
                                                                            if (enumC61177Rgd != null) {
                                                                                this.A01 = enumC61177Rgd;
                                                                                return;
                                                                            }
                                                                            throw new NoSuchAlgorithmException("Algorithm kdf does not exist for value");
                                                                        }
                                                                        throw new NoSuchAlgorithmException("Algorithm kdf does not exist for value");
                                                                    }
                                                                    throw new NoSuchAlgorithmException("Algorithm aead does not exist for value");
                                                                }
                                                                throw new NoSuchAlgorithmException("Algorithm mode does not exist for value");
                                                            } catch (Exception e2) {
                                                                throw new NoSuchAlgorithmException(AnonymousClass001.A0R("Error parsing ciphersuite string: ", str2), e2);
                                                            }
                                                        }
                                                        throw new KeyStoreException("Key retrieved from keystore is not an ECPrivateKey");
                                                    }
                                                    throw new KeyStoreException("Key retrieved from keystore is not an ECPublicKey");
                                                } catch (NoSuchAlgorithmException | InvalidKeySpecException e3) {
                                                    throw new KeyStoreException(e3);
                                                }
                                            }
                                            throw new Resources.NotFoundException(AnonymousClass001.A0g("Key specified by keyAlias: ", str, " does not exist in EncryptedSharedPreferences"));
                                        } catch (IOException | GeneralSecurityException e4) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException | GeneralSecurityException e5) {
                }
            } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e6) {
                throw new KeyStoreException(e6);
            }
        } catch (Resources.NotFoundException e7) {
            throw e7;
        }
    }
}
