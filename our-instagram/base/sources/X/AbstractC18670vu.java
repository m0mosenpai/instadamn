package X;

import android.content.res.AssetManager;
import android.util.Base64;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.0vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18670vu implements X509TrustManager {
    public C20710zq A00;
    public final java.util.Set A01 = new HashSet();
    public final X509TrustManager A02;
    public final long A03;
    public final boolean A04;

    public final void A00(List list) {
        if (this.A04 && System.currentTimeMillis() > this.A03) {
            return;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (this.A01.contains(ByteBuffer.wrap(MessageDigest.getInstance("SHA-256").digest(((Certificate) it.next()).getPublicKey().getEncoded())))) {
                        return;
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new CertificateException(e);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("pinning error, trusted chain: ");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(Base64.encodeToString(((Certificate) it2.next()).getEncoded(), 0));
                sb.append("\n");
            }
            throw new CertificateException(sb.toString());
        }
        throw new CertificateException("pinning error: certificate chain empty");
    }

    public final void A01(X509Certificate[] x509CertificateArr) {
        C20710zq c20710zq = this.A00;
        if (c20710zq != null) {
            A00(Arrays.asList(AbstractC20720zs.A00(c20710zq, x509CertificateArr)));
            return;
        }
        throw new CertificateException("SystemKeystore is not intialized.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A02.checkServerTrusted(x509CertificateArr, str);
        A01(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.A02.getAcceptedIssuers();
    }

    public AbstractC18670vu(C20710zq c20710zq, long j) {
        X509TrustManager A00;
        this.A00 = c20710zq;
        try {
            try {
                A00 = C0US.A00();
            } catch (NullPointerException unused) {
                AssetManager.class.getMethod("getSystem", new Class[0]).invoke(null, new Object[0]);
                A00 = C0US.A00();
            }
            this.A02 = A00;
            this.A04 = j > 0;
            this.A03 = j + 31536000000L;
            String[] strArr = C0UR.A00;
            int i = 0;
            do {
                this.A01.add(ByteBuffer.wrap(Base64.decode(strArr[i], 0)));
                i++;
            } while (i < 18);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Failure reinitializing TrustManager", e);
        }
    }
}
