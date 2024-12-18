package com.facebook.mobilenetwork.internal.certificateverifier;

import X.AbstractC18670vu;
import X.AnonymousClass001;
import X.C09400dp;
import X.C0UP;
import X.C0UQ;
import X.C1FY;
import X.InterfaceC18690vw;
import X.QKA;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DalvikInternals;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CertificateVerifier {
    public static final byte[] CRL_PUBLIC_KEY_BYTES = {48, -126, 1, 34, 48, DalvikInternals.IOPRIO_CLASS_SHIFT, 6, 9, 42, -122, 72, -122, -9, DalvikInternals.IOPRIO_CLASS_SHIFT, 1, 1, 1, 5, 0, 3, -126, 1, 15, 0, 48, -126, 1, 10, 2, -126, 1, 1, 0, -69, 110, 57, -95, 80, -27, 35, 65, -65, -55, 5, 75, -31, 6, 19, 113, -119, -19, -80, 120, 45, 54, 79, -46, -86, -93, 50, 63, 47, 53, 105, -28, 35, -69, -120, 103, -72, -17, -9, -106, 2, 117, 126, -15, -115, 86, 3, -109, -11, -4, 76, -104, -92, -31, -7, 44, 49, 101, -79, -13, 64, -22, -59, -90, 20, 20, -90, -126, 38, 12, 53, -108, -113, 39, -80, Byte.MAX_VALUE, 125, 42, 70, -70, -108, -90, 121, 3, 78, -103, -82, 75, 6, 111, -106, 124, 68, -23, -69, 62, -114, 14, 100, -95, 84, 36, -109, -68, 43, 105, -95, 44, -126, 60, -76, 26, -50, 39, 54, 70, 27, -109, 89, 111, 126, 111, 94, -68, 126, -61, 101, -27, 105, 85, 46, -2, -59, 55, 64, 70, 5, 22, -54, 114, -110, -97, 87, 83, 5, -103, -60, -84, 77, 113, 120, 25, -88, -88, 102, -110, -69, -66, -89, 125, -40, -125, -122, 8, 84, -80, -65, 64, -98, 31, -48, 27, -8, 28, -42, -62, 122, 45, 111, -69, 47, -56, -12, -20, 19, -13, Byte.MAX_VALUE, -104, 85, 71, -14, 28, -63, 31, 86, -70, -99, -116, 74, Byte.MAX_VALUE, 72, -65, 66, -3, -19, -20, 99, -60, 111, -56, 24, 76, 87, -25, -81, 100, 8, 16, 41, -20, -19, -91, -1, 72, -96, -99, -58, -92, -64, -56, 87, 116, -20, -104, 96, 9, 88, -34, -113, 5, -75, -52, 1, DalvikInternals.IOPRIO_CLASS_SHIFT, 3, 100, -120, -81, -36, 95, -93, -55, -100, 110, -110, -67, 2, 3, 1, 0, 1};
    public final C09400dp mFbHostnameVerifier;
    public final C1FY mFbPinningSSLContextFactory;
    public Set revokedCertificateSerials = new HashSet();

    public void verify(byte[][] bArr, String str) {
        verify(bArr, str, true);
    }

    public void setCertificateRevocationList(String str) {
        Boolean bool;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                boolean equalsIgnoreCase = jSONObject.getJSONObject("signature_algorithm").getString("algorithm").equalsIgnoreCase("sha256_rsa");
                if (equalsIgnoreCase && string.length() != 512) {
                    throw new Exception("Invalid CRL signature length.");
                }
                for (char c : string.toCharArray()) {
                    if (c < '0' || (c > '9' && (c < 'A' || (c > 'F' && (c < 'a' || c > 'f'))))) {
                        bool = false;
                        break;
                    }
                }
                bool = true;
                if (!bool.booleanValue()) {
                    throw new Exception("Invalid CRL signature format.");
                }
                String string2 = jSONObject.getString("tbs_cert_list");
                if (equalsIgnoreCase) {
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(CRL_PUBLIC_KEY_BYTES));
                    Signature signature = Signature.getInstance("SHA256withRSA");
                    signature.initVerify(generatePublic);
                    signature.update(string2.getBytes(StandardCharsets.UTF_8));
                    int length = string.length();
                    byte[] bArr = new byte[length / 2];
                    for (int i = 0; i < length; i += 2) {
                        bArr[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
                    }
                    if (signature.verify(bArr)) {
                        JSONArray jSONArray = new JSONObject(string2).getJSONArray("revoked_certificates");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String string3 = jSONArray.getJSONObject(i2).getString("user_certificate");
                            if (!string3.substring(0, 2).equalsIgnoreCase("0x")) {
                                throw new Exception("Invalid CRL serial number format.");
                            }
                            if (string3.substring(2).length() > 40) {
                                throw new Exception("Invalid CRL serial number length.");
                            }
                            this.revokedCertificateSerials.add(new BigInteger(string3.substring(2), 16));
                        }
                    }
                }
            } catch (Exception e) {
                throw new CertificateException(AnonymousClass001.A0R("Invalid CRL: ", e.getMessage()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.0dp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1FY, X.0UP] */
    public CertificateVerifier(long j, boolean z) {
        ?? c0up = new C0UP(j, false);
        if (z) {
            X509TrustManager[] x509TrustManagerArr = c0up.A00;
            x509TrustManagerArr[0] = new QKA((C0UQ) x509TrustManagerArr[0]);
        }
        this.mFbPinningSSLContextFactory = c0up;
        this.mFbHostnameVerifier = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void verify(byte[][] bArr, String str, boolean z) {
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
        for (int i = 0; i < length; i++) {
            x509CertificateArr[i] = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr[i]));
        }
        BigInteger serialNumber = x509CertificateArr[0].getSerialNumber();
        if (serialNumber != null && this.revokedCertificateSerials.contains(serialNumber)) {
            throw new CertificateException(AnonymousClass001.A0R("Certificate is revoked. Serial=", serialNumber.toString()));
        }
        X509TrustManager x509TrustManager = this.mFbPinningSSLContextFactory.A00[0];
        if (x509TrustManager instanceof InterfaceC18690vw) {
            ((InterfaceC18690vw) x509TrustManager).AHH("ECDHE_ECDSA", str, x509CertificateArr, z);
        } else if (x509TrustManager instanceof AbstractC18670vu) {
            AbstractC18670vu abstractC18670vu = (AbstractC18670vu) x509TrustManager;
            abstractC18670vu.A02.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
            if (z) {
                abstractC18670vu.A01(x509CertificateArr);
            }
        } else if (x509TrustManager instanceof C0UQ) {
            ((C0UQ) x509TrustManager).AHG("ECDHE_ECDSA", str, x509CertificateArr);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
        }
        if (!this.mFbHostnameVerifier.A01(str, x509CertificateArr[0])) {
            throw new CertificateException("Hostname verification failed.");
        }
    }
}
