package X;

/* renamed from: X.Mrp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51658Mrp extends C0T6 {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51658Mrp) {
                C51658Mrp c51658Mrp = (C51658Mrp) obj;
                if (!C14360o3.A0K(this.A00, c51658Mrp.A00) || !C14360o3.A0K(this.A01, c51658Mrp.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C51658Mrp(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(leftIconResId=");
        A1C.append(this.A00);
        A1C.append(", title=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
