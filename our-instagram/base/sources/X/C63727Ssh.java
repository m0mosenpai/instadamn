package X;

import java.security.MessageDigest;

/* renamed from: X.Ssh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63727Ssh implements InterfaceC65617To8 {
    public final InterfaceC65617To8 A00;
    public final InterfaceC65617To8 A01;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        this.A01.FAj(messageDigest);
        this.A00.FAj(messageDigest);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C63727Ssh)) {
            return false;
        }
        C63727Ssh c63727Ssh = (C63727Ssh) obj;
        if (!this.A01.equals(c63727Ssh.A01) || !this.A00.equals(c63727Ssh.A00)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C63727Ssh(InterfaceC65617To8 interfaceC65617To8, InterfaceC65617To8 interfaceC65617To82) {
        this.A01 = interfaceC65617To8;
        this.A00 = interfaceC65617To82;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DataCacheKey{sourceKey=");
        A1C.append(this.A01);
        A1C.append(", signature=");
        return AbstractC58320PtC.A11(this.A00, A1C);
    }
}
