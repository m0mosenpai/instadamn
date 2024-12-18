package X;

/* renamed from: X.Pwh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58513Pwh {
    public final Integer A00;
    public final Integer A01;
    public final java.util.Set A02;
    public final java.util.Set A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C58513Pwh c58513Pwh = (C58513Pwh) obj;
            if (this.A01 == c58513Pwh.A01 && this.A00 == c58513Pwh.A00 && this.A03.equals(c58513Pwh.A03)) {
                return this.A02.equals(c58513Pwh.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int A0C = AbstractC25230BEn.A0C(num, AbstractC103784lx.A00(num)) * 31;
        Integer num2 = this.A00;
        return ((AbstractC167017dG.A0L(num2, AbstractC58517Pwl.A00(num2), A0C) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    public C58513Pwh(Integer num, Integer num2, java.util.Set set, java.util.Set set2) {
        this.A01 = num;
        this.A00 = num2;
        this.A03 = set;
        this.A02 = set2;
    }
}
