package X;

import android.text.TextUtils;

/* renamed from: X.SaL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62997SaL {
    public static final InterfaceC65320Thz A04 = new C63733Ssn();
    public final InterfaceC65320Thz A00;
    public final Object A01;
    public final String A02;
    public volatile byte[] A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C62997SaL) {
            return this.A02.equals(((C62997SaL) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C62997SaL(InterfaceC65320Thz interfaceC65320Thz, Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A02 = str;
            this.A01 = obj;
            Rs8.A00(interfaceC65320Thz);
            this.A00 = interfaceC65320Thz;
            return;
        }
        throw AbstractC166987dD.A12("Must not be null or empty");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Option{key='");
        AbstractC58319PtB.A1K(A1C, this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
