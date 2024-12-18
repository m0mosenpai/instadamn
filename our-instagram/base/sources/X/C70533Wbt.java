package X;

import android.util.Pair;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Wbt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70533Wbt implements XLI {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        double d;
        Long valueOf;
        Long valueOf2;
        int A04 = Util.A04(jArr, j, true);
        long j2 = jArr[A04];
        long j3 = jArr2[A04];
        int i = A04 + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            if (j4 == j2) {
                d = 0.0d;
            } else {
                d = (j - j2) / (j4 - j2);
            }
            long j6 = ((long) (d * (j5 - j3))) + j3;
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(j6);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // X.XLI
    public final long Avh() {
        return -1L;
    }

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return true;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A00;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        Pair A00 = A00(this.A02, this.A01, Util.A08(AbstractC65703TsZ.A09(j, this.A00)));
        W5Q w5q = new W5Q(Util.A07(((Number) A00.first).longValue()), ((Number) A00.second).longValue());
        return new C69745Vuf(w5q, w5q);
    }

    @Override // X.XLI
    public final long C8V(long j) {
        return Util.A07(((Number) A00(this.A01, this.A02, j).second).longValue());
    }

    public C70533Wbt(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? Util.A07(jArr2[jArr2.length - 1]) : j;
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A00;
    }
}
