package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2IE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2IE {
    public static final C2ID A02 = new Object();
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(C2IF.A00);
    public final String A00;
    public final KeyPair A01;

    public C2IE(String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        KeyPair keyPair;
        C14360o3.A0B(str, 1);
        this.A00 = str;
        synchronized (A02) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            C14360o3.A07(keyPairGenerator);
            if (z && C2ID.A00().containsAlias(str)) {
                C2ID.A00().deleteEntry(str);
            }
            if (!C2ID.A00().containsAlias(str)) {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, i);
                interfaceC16660sJ.invoke(builder);
                builder.setKeySize(C3OO.FLAG_MOVED);
                KeyGenParameterSpec build = builder.build();
                C14360o3.A07(build);
                keyPairGenerator.initialize(build);
                C14360o3.A07(keyPairGenerator.generateKeyPair());
            }
            KeyStore A00 = C2ID.A00();
            PublicKey publicKey = A00.getCertificate(str).getPublicKey();
            KeyStore.Entry entry = A00.getEntry(str, null);
            C14360o3.A0C(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            keyPair = new KeyPair(publicKey, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        }
        this.A01 = keyPair;
    }

    public final String A02(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(this.A01.getPrivate());
        signature.update(bArr);
        byte[] sign = signature.sign();
        C14360o3.A07(sign);
        String encodeToString = Base64.encodeToString(sign, 11);
        C14360o3.A07(encodeToString);
        return encodeToString;
    }

    public final String A01(String str) {
        PrivateKey privateKey = this.A01.getPrivate();
        C14360o3.A07(privateKey);
        List A0Q = AbstractC001900j.A0Q(str, new char[]{'.'}, 0);
        if (A0Q.size() == 5) {
            String str2 = (String) A0Q.get(0);
            String str3 = (String) A0Q.get(1);
            String str4 = (String) A0Q.get(2);
            String str5 = (String) A0Q.get(3);
            String str6 = (String) A0Q.get(4);
            byte[] decode = Base64.decode(str3, 8);
            C14360o3.A07(decode);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            C14360o3.A07(cipher);
            cipher.init(2, privateKey, new OAEPParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
            byte[] doFinal = cipher.doFinal(decode);
            C14360o3.A07(doFinal);
            byte[] decode2 = Base64.decode(str5, 8);
            C14360o3.A07(decode2);
            byte[] bytes = str2.getBytes(C15W.A01);
            C14360o3.A07(bytes);
            byte[] decode3 = Base64.decode(str4, 8);
            C14360o3.A07(decode3);
            byte[] decode4 = Base64.decode(str6, 8);
            C14360o3.A07(decode4);
            if (decode4.length * 8 == 128) {
                Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher2.init(2, new SecretKeySpec(doFinal, "AES"), new GCMParameterSpec(128, decode3));
                cipher2.updateAAD(bytes);
                cipher2.update(decode2);
                byte[] doFinal2 = cipher2.doFinal(decode4);
                C14360o3.A07(doFinal2);
                return new String(doFinal2, C15W.A05);
            }
            throw new SecurityException("Tag size is invalid");
        }
        throw new SecurityException("JWE format is invalid");
    }

    public final byte[] A03() {
        byte[] encoded = this.A01.getPublic().getEncoded();
        C14360o3.A07(encoded);
        return encoded;
    }

    public final String A00() {
        String encodeToString = Base64.encodeToString(A03(), 11);
        C14360o3.A07(encodeToString);
        return encodeToString;
    }
}
