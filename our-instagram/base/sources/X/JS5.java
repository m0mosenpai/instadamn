package X;

/* loaded from: classes8.dex */
public final class JS5 extends AbstractC46439Kgz {
    public final int A00;
    public final C3o9 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JS5) {
                JS5 js5 = (JS5) obj;
                if (!C14360o3.A0K(this.A01, js5.A01) || this.A00 != js5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public JS5(C3o9 c3o9, int i) {
        this.A01 = c3o9;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OpenThread(threadKey=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(3450));
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
