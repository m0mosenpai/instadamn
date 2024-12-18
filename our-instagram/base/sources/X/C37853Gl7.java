package X;

/* renamed from: X.Gl7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37853Gl7 extends C0T6 {
    public final Integer A00;
    public final Long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37853Gl7) {
                C37853Gl7 c37853Gl7 = (C37853Gl7) obj;
                if (!C14360o3.A0K(this.A02, c37853Gl7.A02) || !C14360o3.A0K(this.A01, c37853Gl7.A01) || !C14360o3.A0K(this.A00, c37853Gl7.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C37853Gl7(Integer num, Long l, String str) {
        this.A02 = str;
        this.A01 = l;
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsItemCacheData(id=");
        A1C.append(this.A02);
        A1C.append(", rankedAtSecond=");
        A1C.append(this.A01);
        A1C.append(", type=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
