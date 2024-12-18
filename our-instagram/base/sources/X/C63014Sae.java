package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: X.Sae, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63014Sae {
    public static final C63014Sae A04;
    public static final C63014Sae A05;
    public static final C63014Sae A06;
    public static final C63014Sae A07;
    public static final C63290Sgq[] A08;
    public static final C63290Sgq[] A09;
    public final boolean A00;
    public final boolean A01;
    public final String[] A02;
    public final String[] A03;

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, X.RqX] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.RqX] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.RqX] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.RqX] */
    static {
        C63290Sgq c63290Sgq = C63290Sgq.A04;
        C63290Sgq c63290Sgq2 = C63290Sgq.A05;
        C63290Sgq c63290Sgq3 = C63290Sgq.A06;
        C63290Sgq c63290Sgq4 = C63290Sgq.A0i;
        C63290Sgq c63290Sgq5 = C63290Sgq.A0v;
        C63290Sgq c63290Sgq6 = C63290Sgq.A0l;
        C63290Sgq c63290Sgq7 = C63290Sgq.A0y;
        C63290Sgq c63290Sgq8 = C63290Sgq.A0m;
        C63290Sgq c63290Sgq9 = C63290Sgq.A0z;
        C63290Sgq[] c63290SgqArr = {c63290Sgq, c63290Sgq2, c63290Sgq3, c63290Sgq4, c63290Sgq5, c63290Sgq6, c63290Sgq7, c63290Sgq8, c63290Sgq9};
        A09 = c63290SgqArr;
        C63290Sgq[] c63290SgqArr2 = {c63290Sgq, c63290Sgq2, c63290Sgq3, c63290Sgq4, c63290Sgq5, c63290Sgq6, c63290Sgq7, c63290Sgq8, c63290Sgq9, C63290Sgq.A0t, C63290Sgq.A0w, C63290Sgq.A1k, C63290Sgq.A1n, C63290Sgq.A1i, C63290Sgq.A1l, C63290Sgq.A1h};
        A08 = c63290SgqArr2;
        ?? obj = new Object();
        obj.A01 = true;
        obj.A02(c63290SgqArr);
        RhU rhU = RhU.TLS_1_3;
        RhU rhU2 = RhU.TLS_1_2;
        obj.A03(rhU, rhU2);
        if (obj.A01) {
            obj.A00 = true;
            A07 = new C63014Sae(obj);
            ?? obj2 = new Object();
            obj2.A01 = true;
            obj2.A02(c63290SgqArr2);
            obj2.A03(rhU, rhU2);
            if (obj2.A01) {
                obj2.A00 = true;
                A06 = new C63014Sae(obj2);
                ?? obj3 = new Object();
                obj3.A01 = true;
                obj3.A02(c63290SgqArr2);
                obj3.A03(rhU, rhU2, RhU.TLS_1_1, RhU.TLS_1_0);
                if (obj3.A01) {
                    obj3.A00 = true;
                    A05 = new C63014Sae(obj3);
                    ?? obj4 = new Object();
                    obj4.A01 = false;
                    A04 = new C63014Sae(obj4);
                    return;
                }
                throw AbstractC166987dD.A14("no TLS extensions for cleartext connections");
            }
            throw AbstractC166987dD.A14("no TLS extensions for cleartext connections");
        }
        throw AbstractC166987dD.A14("no TLS extensions for cleartext connections");
    }

    public final boolean A00(SSLSocket sSLSocket) {
        int length;
        int length2;
        int length3;
        int length4;
        if (!this.A01) {
            return false;
        }
        String[] strArr = this.A03;
        if (strArr != null) {
            Comparator comparator = AbstractC63404SjZ.A01;
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (enabledProtocols == null || (length3 = strArr.length) == 0 || (length4 = enabledProtocols.length) == 0) {
                return false;
            }
            int i = 0;
            do {
                String str = strArr[i];
                int i2 = 0;
                while (comparator.compare(str, enabledProtocols[i2]) != 0) {
                    i2++;
                    if (i2 >= length4) {
                        i++;
                    }
                }
            } while (i < length3);
            return false;
        }
        String[] strArr2 = this.A02;
        if (strArr2 != null) {
            Comparator comparator2 = C63290Sgq.A01;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            byte[] bArr = AbstractC63404SjZ.A07;
            if (enabledCipherSuites == null || (length = strArr2.length) == 0 || (length2 = enabledCipherSuites.length) == 0) {
                return false;
            }
            int i3 = 0;
            do {
                String str2 = strArr2[i3];
                int i4 = 0;
                while (comparator2.compare(str2, enabledCipherSuites[i4]) != 0) {
                    i4++;
                    if (i4 >= length2) {
                        i3++;
                    }
                }
            } while (i3 < length);
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C63014Sae) {
            if (obj != this) {
                C63014Sae c63014Sae = (C63014Sae) obj;
                boolean z = this.A01;
                if (z != c63014Sae.A01 || (z && (!Arrays.equals(this.A02, c63014Sae.A02) || !Arrays.equals(this.A03, c63014Sae.A03) || this.A00 != c63014Sae.A00))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A01) {
            return ((((527 + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A03)) * 31) + (!this.A00 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        List list2;
        if (!this.A01) {
            return "ConnectionSpec()";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ConnectionSpec(cipherSuites=");
        String[] strArr = this.A02;
        if (strArr != null) {
            ArrayList A17 = AbstractC25225BEi.A17(strArr.length);
            for (String str : strArr) {
                A17.add(C63290Sgq.A01(str));
            }
            list = Collections.unmodifiableList(A17);
        } else {
            list = null;
        }
        String str2 = "[all enabled]";
        String str3 = "[all enabled]";
        if (list != null) {
            str3 = list.toString();
        }
        A1C.append(str3);
        A1C.append(", tlsVersions=");
        String[] strArr2 = this.A03;
        if (strArr2 != null) {
            ArrayList A172 = AbstractC25225BEi.A17(strArr2.length);
            for (String str4 : strArr2) {
                A172.add(RhU.A00(str4));
            }
            list2 = Collections.unmodifiableList(A172);
        } else {
            list2 = null;
        }
        if (list2 != null) {
            str2 = list2.toString();
        }
        A1C.append(str2);
        A1C.append(", supportsTlsExtensions=");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(")", A1C);
    }

    public C63014Sae(C61608RqX c61608RqX) {
        this.A01 = c61608RqX.A01;
        this.A02 = c61608RqX.A02;
        this.A03 = c61608RqX.A03;
        this.A00 = c61608RqX.A00;
    }
}
