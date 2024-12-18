package X;

import java.security.MessageDigest;

/* renamed from: X.Ssg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63726Ssg implements InterfaceC65617To8 {
    public final Object A00;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        messageDigest.update(this.A00.toString().getBytes(InterfaceC65617To8.A00));
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (obj instanceof C63726Ssg) {
            return this.A00.equals(((C63726Ssg) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C63726Ssg(Object obj) {
        Rs8.A00(obj);
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ObjectKey{object=");
        return AbstractC58320PtC.A11(this.A00, A1C);
    }
}
