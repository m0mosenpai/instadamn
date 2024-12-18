package X;

/* renamed from: X.MqQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51572MqQ extends C0T6 {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51572MqQ) {
                C51572MqQ c51572MqQ = (C51572MqQ) obj;
                if (!C14360o3.A0K(this.A01, c51572MqQ.A01) || this.A03 != c51572MqQ.A03 || this.A00 != c51572MqQ.A00 || this.A02 != c51572MqQ.A02 || this.A04 != c51572MqQ.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A02, (AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A01)) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Builder(queryText=");
        A1C.append(this.A01);
        A1C.append(", isTypeaheadQuery=");
        A1C.append(this.A03);
        A1C.append(", keywordCount=");
        A1C.append(this.A00);
        A1C.append(AbstractC43591JPw.A00(230));
        A1C.append(this.A02);
        A1C.append(", isUserSearchAction=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }
}
