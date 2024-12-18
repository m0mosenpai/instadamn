package X;

/* renamed from: X.SOm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62745SOm {
    public final int A00;
    public final EnumC61180Rgg A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62745SOm) {
                C62745SOm c62745SOm = (C62745SOm) obj;
                if (this.A01 != c62745SOm.A01 || this.A00 != c62745SOm.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C62745SOm(EnumC61180Rgg enumC61180Rgg, int i) {
        this.A01 = enumC61180Rgg;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("QPLEventPayload(type=");
        A1C.append(this.A01);
        A1C.append(", key=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
