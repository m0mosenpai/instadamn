package X;

/* renamed from: X.33b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C676233b {
    public int A00;
    public Integer A01;
    public Integer A02;

    public final Integer A00() {
        return this.A01;
    }

    public final void A01(int i) {
        Integer num;
        if (i == 0) {
            num = C05F.A0C;
        } else if (i > 0) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        this.A01 = num;
    }

    public C676233b(Integer num) {
        this.A02 = num;
        this.A01 = num;
        this.A00 = num == C05F.A01 ? -1 : Integer.MAX_VALUE;
    }
}
