package X;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SaK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62996SaK {
    public final List A00;
    public final C63290Sgq A01;
    public final List A02;
    public final RhU A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62996SaK)) {
            return false;
        }
        C62996SaK c62996SaK = (C62996SaK) obj;
        if (!this.A03.equals(c62996SaK.A03) || !this.A01.equals(c62996SaK.A01) || !this.A00.equals(c62996SaK.A00) || !this.A02.equals(c62996SaK.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, JQ0.A01(this.A03.hashCode())) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    public C62996SaK(List list, List list2, C63290Sgq c63290Sgq, RhU rhU) {
        this.A03 = rhU;
        this.A01 = c63290Sgq;
        this.A00 = list;
        this.A02 = list2;
    }

    public static ArrayList A00(List list) {
        String type;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                type = String.valueOf(((X509Certificate) certificate).getSubjectDN());
            } else {
                type = certificate.getType();
            }
            A1E.add(type);
        }
        return A1E;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Handshake{tlsVersion=");
        A1C.append(this.A03);
        A1C.append(" cipherSuite=");
        A1C.append(this.A01);
        A1C.append(" peerCertificates=");
        A1C.append(A00(this.A00));
        A1C.append(" localCertificates=");
        return AbstractC58320PtC.A11(A00(this.A02), A1C);
    }
}
