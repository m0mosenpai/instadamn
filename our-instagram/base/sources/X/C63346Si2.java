package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Si2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63346Si2 {
    public final SharedPreferences A00;
    public final REN A01;
    public final SW3 A02;
    public final String A03;
    public final List A04 = new CopyOnWriteArrayList();

    public static synchronized PublicKey A01(C63346Si2 c63346Si2, String str) {
        PublicKey publicKey;
        synchronized (c63346Si2) {
            SW3 sw3 = c63346Si2.A02;
            sw3.getClass();
            Certificate certificate = sw3.A01.getCertificate(AnonymousClass001.A0R(c63346Si2.A03, str));
            if (certificate != null) {
                publicKey = certificate.getPublicKey();
            } else {
                publicKey = null;
            }
        }
        return publicKey;
    }

    public final synchronized Exception A07(String str) {
        try {
            SharedPreferences.Editor edit = this.A00.edit();
            String str2 = this.A03;
            edit.remove(AnonymousClass001.A0R(str2, str)).apply();
            SW3 sw3 = this.A02;
            if (sw3 != null) {
                sw3.A01.deleteEntry(AnonymousClass001.A0R(str2, str));
            }
            List<C63152Se0> list = this.A04;
            for (C63152Se0 c63152Se0 : list) {
                if (str.equalsIgnoreCase(AnonymousClass001.A0R(str2, c63152Se0.A02))) {
                    list.remove(c63152Se0);
                }
            }
            e = null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                e = e;
                C0K8.A0F("DefaultAuthTicketManager", "Delete AT", e);
            }
        }
        return e;
    }

    public static C63346Si2 A00(Context context, SharedPreferences sharedPreferences, C58443PvM c58443PvM, SCT sct, String str) {
        SW3 sw3;
        try {
            sw3 = new SW3(context);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            C0K8.A0F("DefaultAuthTicketManager", "Failed to create store", e);
            sw3 = null;
        }
        return new C63346Si2(sharedPreferences, sw3, c58443PvM, sct, str);
    }

    public static Signature A02(C63346Si2 c63346Si2, String str) {
        PrivateKey privateKey;
        String str2;
        Signature signature;
        if (str.equalsIgnoreCase("MFT_TRUSTED_DEVICE")) {
            C49352Or c49352Or = new C49352Or("autofill_key");
            signature = Signature.getInstance("SHA256withRSA");
            privateKey = c49352Or.A01.getPrivate();
        } else {
            SW3 sw3 = c63346Si2.A02;
            if (sw3 != null) {
                privateKey = (PrivateKey) sw3.A01.getKey(AnonymousClass001.A0R(c63346Si2.A03, str), null);
                if (privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
                    str2 = "SHA256withRSA";
                } else {
                    str2 = "SHA256withECDSA";
                }
                signature = Signature.getInstance(str2);
            } else {
                throw AbstractC58318PtA.A0x("Key Store is null!");
            }
        }
        signature.initSign(privateKey);
        return signature;
    }

    public final C63152Se0 A04() {
        PublicKey A01 = A01(this, "MFT_TRUSTED_DEVICE");
        if (A01 == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(A01.getEncoded(), 2);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(A01.getEncoded());
        String A0x = AbstractC58319PtB.A0x(messageDigest.digest());
        C14360o3.A07(A0x);
        return C63152Se0.A01(C05F.A00, "MFT_TRUSTED_DEVICE", A0x, encodeToString, "MFT_TRUSTED_DEVICE", AbstractC166987dD.A1E());
    }

    public final C63152Se0 A05(SPK spk, C63152Se0 c63152Se0) {
        C02R.A06(c63152Se0.A05.equalsIgnoreCase(spk.A04), "Local Auth Ticket and Server At fingerprint does not match");
        C02R.A06(c63152Se0.A03.equalsIgnoreCase(spk.A02), "Auth Ticket and Server AT Type is differ!");
        C63152Se0 A00 = C63152Se0.A00(spk, c63152Se0.A00, c63152Se0.A02, c63152Se0.A07, System.currentTimeMillis());
        String str = A00.A02;
        AbstractC58318PtA.A1C(this.A00.edit(), AnonymousClass001.A0R(this.A03, str), A00.A06);
        this.A04.add(A00);
        return A00;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.SHh, java.lang.Object] */
    public final C63152Se0 A06(String str, List list) {
        Integer num;
        String A0x;
        String encodeToString;
        String str2 = "MFT_TRUSTED_DEVICE";
        if ("MFT_TRUSTED_DEVICE".equalsIgnoreCase(str)) {
            C49352Or c49352Or = new C49352Or("autofill_key");
            num = C05F.A0C;
            KeyPair keyPair = c49352Or.A01;
            PublicKey publicKey = keyPair.getPublic();
            C14360o3.A07(publicKey);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(publicKey.getEncoded());
            A0x = AbstractC58319PtB.A0x(messageDigest.digest());
            C14360o3.A07(A0x);
            PublicKey publicKey2 = keyPair.getPublic();
            C14360o3.A07(publicKey2);
            encodeToString = Base64.encodeToString(publicKey2.getEncoded(), 2);
        } else {
            str2 = AbstractC166997dE.A0o();
            num = C05F.A00;
            boolean equalsIgnoreCase = "BIO".equalsIgnoreCase(str);
            synchronized (this) {
                this.A02.getClass();
                String A0R = AnonymousClass001.A0R(this.A03, str2);
                ?? obj = new Object();
                obj.A00 = A0R;
                obj.A03 = equalsIgnoreCase;
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 20);
                if (obj.A01 == null) {
                    obj.A01 = BigInteger.ONE;
                }
                if (obj.A02 == null) {
                    obj.A02 = new X500Principal(AnonymousClass001.A0g("CN=", obj.A00, " CA Certificate"));
                }
                String str3 = obj.A00;
                str3.getClass();
                C62608SIp c62608SIp = new C62608SIp(str3, obj.A01, calendar.getTime(), calendar2.getTime(), obj.A02, obj.A03);
                KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(c62608SIp.A00, 12).setKeySize(256).setCertificateSerialNumber(c62608SIp.A01).setCertificateSubject(c62608SIp.A04).setCertificateNotBefore(c62608SIp.A03).setCertificateNotAfter(c62608SIp.A02).setUserAuthenticationRequired(c62608SIp.A05).setDigests("SHA-256");
                digests.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
                if (SSF.A01()) {
                    SW3.A00(digests, c62608SIp);
                }
                KeyGenParameterSpec build = digests.build();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                keyPairGenerator.initialize(build);
                PublicKey publicKey3 = keyPairGenerator.generateKeyPair().getPublic();
                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                messageDigest2.update(publicKey3.getEncoded());
                A0x = AbstractC58319PtB.A0x(messageDigest2.digest());
                C14360o3.A07(A0x);
            }
            synchronized (this) {
                PublicKey A01 = A01(this, str2);
                if (A01 != null) {
                    encodeToString = Base64.encodeToString(A01.getEncoded(), 2);
                } else {
                    C0K8.A0O("DefaultAuthTicketManager", "No public key found for alias %s", str2);
                    throw new KeyStoreException(AnonymousClass001.A0R("No public key found for alias ", str2));
                }
            }
        }
        return C63152Se0.A01(num, str, A0x, encodeToString, str2, list);
    }

    public final String A08(C63152Se0 c63152Se0, byte[] bArr) {
        PrivateKey privateKey;
        boolean equalsIgnoreCase;
        String str;
        Signature signature;
        String str2 = c63152Se0.A02;
        if (str2.equalsIgnoreCase("MFT_TRUSTED_DEVICE")) {
            C49352Or c49352Or = new C49352Or("autofill_key");
            equalsIgnoreCase = true;
            signature = Signature.getInstance("SHA256withRSA");
            privateKey = c49352Or.A01.getPrivate();
        } else {
            SW3 sw3 = this.A02;
            if (sw3 != null) {
                privateKey = (PrivateKey) sw3.A01.getKey(AnonymousClass001.A0R(this.A03, str2), null);
                equalsIgnoreCase = privateKey.getAlgorithm().equalsIgnoreCase("RSA");
                if (equalsIgnoreCase) {
                    str = "SHA256withRSA";
                } else {
                    str = "SHA256withECDSA";
                }
                signature = Signature.getInstance(str);
            } else {
                throw AbstractC58318PtA.A0x("Key Store is null!");
            }
        }
        signature.initSign(privateKey);
        return SSF.A00(signature, bArr, !equalsIgnoreCase);
    }

    public C63346Si2(SharedPreferences sharedPreferences, SW3 sw3, C58443PvM c58443PvM, SCT sct, String str) {
        this.A03 = str;
        this.A02 = sw3;
        this.A00 = sharedPreferences;
        this.A01 = new REN(this, c58443PvM, sct);
    }

    public static HashMap A03(C63346Si2 c63346Si2) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(c63346Si2.A00.getAll());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getValue() instanceof String) {
                String A17 = AbstractC31172DnG.A17(A1K);
                String str = c63346Si2.A03;
                if (A17.startsWith(str)) {
                    A1G.put(AbstractC31172DnG.A17(A1K).substring(str.length()), A1K.getValue());
                }
            }
        }
        return A1G;
    }
}
