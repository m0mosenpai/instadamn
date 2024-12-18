package X;

/* renamed from: X.5gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122225gI {
    public static final C122225gI A02 = new C122225gI(AbstractC118155Vz.A01(0), AbstractC118155Vz.A01(0));
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C122225gI) {
                long j = this.A00;
                C122225gI c122225gI = (C122225gI) obj;
                long j2 = c122225gI.A00;
                C118145Vy[] c118145VyArr = C118135Vx.A02;
                if (j != j2 || this.A01 != c122225gI.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextIndent(firstLine=");
        sb.append((Object) C118135Vx.A02(this.A00));
        sb.append(", restLine=");
        sb.append((Object) C118135Vx.A02(this.A01));
        sb.append(')');
        return sb.toString();
    }

    public C122225gI(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
