package X;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: X.Sf4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63201Sf4 {
    public static final C63201Sf4 A02 = new C63201Sf4(new LinkedHashSet(AbstractC166987dD.A1E()), null);
    public final java.util.Set A00;
    public final AbstractC61529Rp5 A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C63201Sf4) {
                C63201Sf4 c63201Sf4 = (C63201Sf4) obj;
                if (!C2I7.A00(this.A01, c63201Sf4.A01) || !this.A00.equals(c63201Sf4.A00)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static String A00(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            try {
                return AnonymousClass001.A0R("sha256/", SUM.A00(C64531TIl.A03(MessageDigest.getInstance("SHA-256").digest(C64531TIl.A03(certificate.getPublicKey().getEncoded()).data)).data));
            } catch (NoSuchAlgorithmException e) {
                throw AbstractC58318PtA.A0W(e);
            }
        }
        throw AbstractC166987dD.A12("Certificate pinning requires X509 certificates");
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + this.A00.hashCode();
    }

    public C63201Sf4(java.util.Set set, AbstractC61529Rp5 abstractC61529Rp5) {
        this.A00 = set;
        this.A01 = abstractC61529Rp5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.AbstractCollection, java.util.AbstractList, java.lang.Object, java.util.ArrayList] */
    public final void A01(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("matches");
        }
        if (emptyList.isEmpty()) {
            return;
        }
        AbstractC61529Rp5 abstractC61529Rp5 = this.A01;
        if (abstractC61529Rp5 != null) {
            if (abstractC61529Rp5 instanceof C65164Ted) {
                C65164Ted c65164Ted = (C65164Ted) abstractC61529Rp5;
                ArrayDeque arrayDeque = new ArrayDeque((Collection) list);
                list = AbstractC166987dD.A1E();
                list.add(arrayDeque.removeFirst());
                int i = 0;
                boolean z = false;
                do {
                    X509Certificate x509Certificate = (X509Certificate) list.get(list.size() - 1);
                    X509Certificate AVO = c65164Ted.A00.AVO(x509Certificate);
                    if (AVO != null) {
                        if (list.size() > 1 || !x509Certificate.equals(AVO)) {
                            list.add(AVO);
                        }
                        if (AVO.getIssuerDN().equals(AVO.getSubjectDN())) {
                            try {
                                AVO.verify(AVO.getPublicKey());
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        z = true;
                        i++;
                    } else {
                        Iterator it2 = arrayDeque.iterator();
                        while (it2.hasNext()) {
                            X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                            if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    it2.remove();
                                    list.add(x509Certificate2);
                                    i++;
                                } catch (GeneralSecurityException unused2) {
                                    continue;
                                }
                            }
                        }
                        if (!z) {
                            throw new SSLPeerUnverifiedException(AbstractC167017dG.A0n(x509Certificate, "Failed to find a trusted cert that signed ", AbstractC166987dD.A1C()));
                        }
                    }
                } while (i < 9);
                throw new SSLPeerUnverifiedException(AbstractC167017dG.A0n(list, "Certificate chain too long: ", AbstractC166987dD.A1C()));
            }
            C65165Tee c65165Tee = (C65165Tee) abstractC61529Rp5;
            try {
                list = (List) c65165Tee.A01.invoke(c65165Tee.A00, list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw AbstractC58318PtA.A0W(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            if (0 < emptyList.size()) {
                emptyList.get(0);
                throw AbstractC166987dD.A15("hashAlgorithm");
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Certificate pinning failure!");
        A1C.append("\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X509Certificate x509Certificate3 = (X509Certificate) list.get(i3);
            A1C.append("\n    ");
            A1C.append(A00(x509Certificate3));
            A1C.append(": ");
            A1C.append(x509Certificate3.getSubjectDN().getName());
        }
        A1C.append("\n  Pinned certificates for ");
        A1C.append(str);
        A1C.append(":");
        int size3 = emptyList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            emptyList.get(i4);
            A1C.append("\n    ");
            A1C.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(A1C.toString());
    }
}
