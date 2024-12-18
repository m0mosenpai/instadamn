package X;

/* renamed from: X.Wbq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70530Wbq implements XLI {
    public long A00;
    public final C131905xQ A01;
    public final C131905xQ A02;
    public final long A03;

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return true;
    }

    @Override // X.XLI
    public final long Avh() {
        return this.A03;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A00;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        C131905xQ c131905xQ = this.A02;
        int i = c131905xQ.A00 - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (c131905xQ.A00(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < c131905xQ.A00 && c131905xQ.A00(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        long A00 = c131905xQ.A00(i2);
        C131905xQ c131905xQ2 = this.A01;
        W5Q w5q = new W5Q(A00, c131905xQ2.A00(i2));
        if (w5q.A01 != j && i2 != c131905xQ.A00 - 1) {
            int i6 = i2 + 1;
            return new C69745Vuf(w5q, new W5Q(c131905xQ.A00(i6), c131905xQ2.A00(i6)));
        }
        return new C69745Vuf(w5q, w5q);
    }

    @Override // X.XLI
    public final long C8V(long j) {
        C131905xQ c131905xQ = this.A01;
        int i = c131905xQ.A00 - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (c131905xQ.A00(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < c131905xQ.A00 && c131905xQ.A00(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        return this.A02.A00(i2);
    }

    public C70530Wbq(long j, long j2, long j3) {
        this.A00 = j;
        this.A03 = j3;
        C131905xQ c131905xQ = new C131905xQ();
        this.A02 = c131905xQ;
        C131905xQ c131905xQ2 = new C131905xQ();
        this.A01 = c131905xQ2;
        c131905xQ.A01(0L);
        c131905xQ2.A01(j2);
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A00;
    }
}
