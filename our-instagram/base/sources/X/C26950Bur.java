package X;

/* renamed from: X.Bur, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26950Bur extends AbstractC166097bd {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26950Bur) {
                C26950Bur c26950Bur = (C26950Bur) obj;
                if (!C14360o3.A0K(this.A02, c26950Bur.A02) || this.A00 != c26950Bur.A00 || this.A03 != c26950Bur.A03 || !C14360o3.A0K(this.A01, c26950Bur.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26950Bur(String str, String str2, int i, boolean z) {
        super(AnonymousClass001.A0c("feedback_from_threads_row", str, i));
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A01 = str2;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0J(this.A02) + this.A00) * 31));
    }
}
