package X;

import android.util.Base64;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Saf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63015Saf {
    public int A00;
    public int A01;
    public String A02;
    public List A03;
    public List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C63015Saf c63015Saf = (C63015Saf) obj;
            if (!A00().equals(c63015Saf.A00()) || !this.A02.equals(c63015Saf.A02)) {
                return false;
            }
        }
        return true;
    }

    public final List A00() {
        List list = this.A03;
        List list2 = list;
        if (list == null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getByAddress(Base64.decode(AbstractC166987dD.A1B(it), 0));
                } catch (IllegalArgumentException | UnknownHostException unused) {
                }
                if (inetAddress != null) {
                    A1E.add(inetAddress);
                }
            }
            this.A03 = A1E;
            list2 = A1E;
        }
        return list2;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A02) + A00().hashCode();
    }

    public C63015Saf(String str, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = list;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(Base64.encodeToString(((InetAddress) it.next()).getAddress(), 0));
            }
            this.A04 = A1E;
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AE{'");
        AbstractC58319PtB.A1K(A1C, this.A02);
        A1C.append(", ");
        AbstractC58318PtA.A1V(A1C, A00());
        A1C.append(", ");
        A1C.append(this.A01);
        A1C.append(", ");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }

    public C63015Saf() {
        this("", null, 0, 0);
    }
}
