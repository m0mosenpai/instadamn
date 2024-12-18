package X;

/* renamed from: X.Jw6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45016Jw6 extends C0T6 {
    public final C45051Jwg A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45016Jw6) {
                C45016Jw6 c45016Jw6 = (C45016Jw6) obj;
                if (!C14360o3.A0K(this.A00, c45016Jw6.A00) || this.A01 != c45016Jw6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = AbstractC166987dD.A0G(this.A00);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "ContainingThread";
        } else {
            str = "ReplyThreads";
        }
        return A0G + AbstractC25226BEj.A02(str, intValue);
    }

    public C45016Jw6(C45051Jwg c45051Jwg, Integer num) {
        this.A00 = c45051Jwg;
        this.A01 = num;
    }
}
