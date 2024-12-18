package X;

/* renamed from: X.ABb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22977ABb {
    public long A00;
    public Integer A01;
    public final long A02;
    public final int A03;

    public C22977ABb(Integer num, int i, long j, long j2) {
        this.A03 = i;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A03);
        A1C.append(';');
        A1C.append(this.A02);
        A1C.append(';');
        A1C.append(this.A00);
        A1C.append(';');
        A1C.append(A18.A00(this.A01));
        return A1C.toString();
    }
}
