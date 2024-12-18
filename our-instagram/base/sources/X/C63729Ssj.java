package X;

import java.security.MessageDigest;

/* renamed from: X.Ssj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63729Ssj implements InterfaceC65617To8 {
    public final C20030yX A00 = new C005001p(0);

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C20030yX c20030yX = this.A00;
            if (i < c20030yX.size()) {
                C62997SaL c62997SaL = (C62997SaL) c20030yX.A05(i);
                Object A06 = c20030yX.A06(i);
                InterfaceC65320Thz interfaceC65320Thz = c62997SaL.A00;
                if (c62997SaL.A03 == null) {
                    c62997SaL.A03 = c62997SaL.A02.getBytes(InterfaceC65617To8.A00);
                }
                interfaceC65320Thz.FA7(A06, messageDigest, c62997SaL.A03);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object A00(C62997SaL c62997SaL) {
        C20030yX c20030yX = this.A00;
        if (c20030yX.containsKey(c62997SaL)) {
            return c20030yX.get(c62997SaL);
        }
        return c62997SaL.A01;
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (obj instanceof C63729Ssj) {
            return this.A00.equals(((C63729Ssj) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Options{values=");
        return AbstractC58320PtC.A11(this.A00, A1C);
    }
}
