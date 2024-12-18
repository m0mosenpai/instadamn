package X;

/* renamed from: X.JuI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44904JuI extends AbstractC46355Kfd {
    public final Integer A00;
    public final String A01;

    public C44904JuI(String str, Integer num) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44904JuI) {
                C44904JuI c44904JuI = (C44904JuI) obj;
                if (!C14360o3.A0K(this.A01, c44904JuI.A01) || this.A00 != c44904JuI.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166987dD.A0J(this.A01);
        Integer num = this.A00;
        return A0J + AbstractC25230BEn.A0C(num, AbstractC46552Kir.A00(num));
    }

    public final String toString() {
        String str;
        String str2 = this.A01;
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC46552Kir.A00(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0v("ExpressoError(message=", str2, ", error=", str, ')');
    }
}
