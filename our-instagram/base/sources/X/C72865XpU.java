package X;

/* renamed from: X.XpU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72865XpU {
    public final Object A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C72865XpU c72865XpU = (C72865XpU) obj;
            if (this.A01 == c72865XpU.A01) {
                Object obj2 = this.A00;
                Object obj3 = c72865XpU.A00;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.A01 ? 1 : 0) * 31;
        Object obj = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public C72865XpU(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GeneratorValue{done=");
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(15));
        A1C.append(this.A00);
        A1C.append('}');
        return A1C.toString();
    }
}
