package X;

/* renamed from: X.Bej, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25995Bej extends C0T6 {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C6KV A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25995Bej) {
                C25995Bej c25995Bej = (C25995Bej) obj;
                long j = this.A01;
                long j2 = c25995Bej.A01;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A02 != c25995Bej.A02 || this.A05 != c25995Bej.A05 || !C14360o3.A0K(this.A04, c25995Bej.A04) || Float.compare(this.A00, c25995Bej.A00) != 0 || this.A03 != c25995Bej.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        long j = this.A01;
        long j2 = C1132359l.A01;
        int A07 = AbstractC167007dF.A07(this.A02, AbstractC25227BEk.A03(j));
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "PILL";
                break;
            case 2:
                str = "CIRCLE";
                break;
            default:
                str = "ROUNDED_RECT";
                break;
        }
        int A00 = AbstractC166997dE.A00((AbstractC25231BEo.A0H(str, intValue, A07) + AbstractC167017dG.A0M(this.A04)) * 31, this.A00);
        long j3 = this.A03;
        return A00 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C25995Bej(C6KV c6kv, Integer num, float f, long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A05 = num;
        this.A04 = c6kv;
        this.A00 = f;
        this.A03 = j3;
    }
}
