package X;

/* renamed from: X.BfF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26026BfF extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26026BfF) {
                C26026BfF c26026BfF = (C26026BfF) obj;
                if (!C14360o3.A0K(this.A01, c26026BfF.A01) || this.A00 != c26026BfF.A00 || !C14360o3.A0K(this.A02, c26026BfF.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + this.A00) * 31);
    }

    public C26026BfF(String str, int i, String str2) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeedbackFromThreadsRowModel(strippedMediaId=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(570));
        A1C.append(this.A00);
        A1C.append(", thUnifiedFeedbackRowTapTargetUrl=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
