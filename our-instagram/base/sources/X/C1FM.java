package X;

import android.util.Base64;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: X.1FM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FM extends SSLSocketFactory implements C1FN {
    public SSLSocketFactory A00;
    public boolean A01;
    public SF9 A02;

    private synchronized void A00() {
        try {
            if (this.A00 == null) {
                try {
                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(null, null);
                    KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init(C20710zq.A00().A00);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(keyManagers, trustManagers, null);
                    SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
                    clientSessionContext.getClass();
                    clientSessionContext.setSessionCacheSize(0);
                    System.currentTimeMillis();
                    this.A00 = sSLContext.getSocketFactory();
                } catch (Exception e) {
                    throw new IllegalStateException("Failure initializing default SSL context", e);
                }
            }
            if (this.A02 == null) {
                boolean z = this.A01;
                System.currentTimeMillis();
                C20710zq A00 = C20710zq.A00();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArr = CMK.A00;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = C63162SeL.A00().iterator();
                    while (it.hasNext()) {
                        byte[] encoded = ((X509Certificate) it.next()).getPublicKey().getEncoded();
                        if (encoded != null) {
                            String encodeToString = Base64.encodeToString(AbstractC62825SSx.A00(S5W.A00(encoded)).A00, 2);
                            C14360o3.A07(encodeToString);
                            arrayList.add(encodeToString);
                        } else {
                            throw new IllegalArgumentException("Public key doesn't support encoding");
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(Arrays.asList(strArr));
                    arrayList2.addAll(arrayList);
                    strArr = (String[]) arrayList2.toArray(strArr);
                }
                for (String str : strArr) {
                    String[] strArr2 = {AnonymousClass001.A0R("sha1/", str)};
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    java.util.Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                    C14360o3.A07(unmodifiableSet);
                    java.util.Set set = (java.util.Set) linkedHashMap.put("*.instagram.com", unmodifiableSet);
                    if (set != null) {
                        linkedHashSet.addAll(set);
                    }
                    String str2 = strArr2[0];
                    if (AbstractC002300n.A0h(str2, "sha1/", false)) {
                        String substring = str2.substring(5);
                        C14360o3.A07(substring);
                        byte[] decode = Base64.decode(substring, 2);
                        if (decode != null) {
                            linkedHashSet.add(new C64530TIk(decode));
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0R("pins must be base64: ", str2));
                        }
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0R("pins must start with 'sha1/': ", str2));
                    }
                }
                SF9 sf9 = new SF9(linkedHashMap, A00);
                System.currentTimeMillis();
                this.A02 = sf9;
            }
        } finally {
            System.currentTimeMillis();
        }
    }

    @Override // X.C1FN
    public final void AHD(String str, Certificate[] certificateArr) {
        A00();
        this.A02.getClass();
        try {
            SF9 sf9 = this.A02;
            C14360o3.A0B(certificateArr, 1);
            Map map = sf9.A00;
            java.util.Set set = (java.util.Set) map.get(str);
            java.util.Set<C64530TIk> set2 = null;
            int A04 = AbstractC001900j.A04(str, '.', 0);
            if (A04 != AbstractC001900j.A05(str, '.', str.length() - 1)) {
                String substring = str.substring(A04 + 1);
                C14360o3.A07(substring);
                set2 = (java.util.Set) map.get(AnonymousClass001.A0R("*.", substring));
            }
            if (set == null) {
                if (set2 == null) {
                    return;
                }
            } else if (set2 != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(set);
                linkedHashSet.addAll(set2);
                set2 = linkedHashSet;
            } else {
                set2 = set;
            }
            try {
                X509Certificate[] A00 = AbstractC20720zs.A00(sf9.A01, certificateArr);
                for (X509Certificate x509Certificate : A00) {
                    C14360o3.A0C(x509Certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    if (set2.contains(AbstractC62825SSx.A01(x509Certificate))) {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Certificate pinning failure!");
                sb.append("\n  Peer certificate chain:");
                for (X509Certificate x509Certificate2 : A00) {
                    C14360o3.A0C(x509Certificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    sb.append("\n    ");
                    if (x509Certificate2 != null) {
                        String encodeToString = Base64.encodeToString(AbstractC62825SSx.A01(x509Certificate2).A00, 2);
                        C14360o3.A07(encodeToString);
                        sb.append(AnonymousClass001.A0R("sha1/", encodeToString));
                        sb.append(": ");
                        sb.append(x509Certificate2.getSubjectDN().getName());
                    } else {
                        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
                    }
                }
                sb.append("\n  Pinned certificates for ");
                sb.append(str);
                sb.append(":");
                for (C64530TIk c64530TIk : set2) {
                    sb.append("\n    sha1/");
                    String encodeToString2 = Base64.encodeToString(c64530TIk.A00, 2);
                    C14360o3.A07(encodeToString2);
                    sb.append(encodeToString2);
                }
            } catch (CertificateException e) {
            }
        } catch (SSLPeerUnverifiedException e2) {
            C0w9.A07("ssl_pin_error", e2);
            throw e2;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        C62955SYx c62955SYx;
        A00();
        this.A00.getClass();
        Socket createSocket = this.A00.createSocket(socket, str, i, z);
        synchronized (C62955SYx.class) {
            synchronized (C62955SYx.A04) {
                c62955SYx = (C62955SYx) C62955SYx.A05.getValue();
            }
        }
        c62955SYx.A00(str, createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        A00();
        this.A00.getClass();
        return this.A00.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        A00();
        this.A00.getClass();
        return this.A00.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        throw new UnsupportedOperationException("Shouldn't be called for SSLSocketFactory");
    }
}
