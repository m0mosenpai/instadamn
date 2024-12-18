package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Wbr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70531Wbr implements XLI {
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return true;
    }

    @Override // X.XLI
    public final long Avh() {
        return this.A01;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A00;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        long[] jArr = this.A03;
        int A04 = Util.A04(jArr, j, true);
        long j2 = jArr[A04];
        long[] jArr2 = this.A02;
        W5Q w5q = new W5Q(j2, jArr2[A04]);
        if (w5q.A01 < j && A04 != jArr.length - 1) {
            int i = A04 + 1;
            return new C69745Vuf(w5q, new W5Q(jArr[i], jArr2[i]));
        }
        return new C69745Vuf(w5q, w5q);
    }

    @Override // X.XLI
    public final long C8V(long j) {
        return this.A03[Util.A04(this.A02, j, true)];
    }

    public C70531Wbr(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A00;
    }
}
