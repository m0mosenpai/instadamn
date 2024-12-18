package X;

import java.util.Queue;

/* renamed from: X.Sts, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63798Sts implements InterfaceC65322Ti2 {
    public int A00;
    public Class A01;
    public final QBE A02;

    @Override // X.InterfaceC65322Ti2
    public final void Cts() {
        Queue queue = this.A02.A00;
        if (queue.size() < 20) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63798Sts)) {
            return false;
        }
        C63798Sts c63798Sts = (C63798Sts) obj;
        if (this.A00 != c63798Sts.A00 || this.A01 != c63798Sts.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC25235BEs.A06(this.A01);
    }

    public C63798Sts(QBE qbe) {
        this.A02 = qbe;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Key{size=");
        A1C.append(this.A00);
        A1C.append("array=");
        return AbstractC58320PtC.A11(this.A01, A1C);
    }
}
