package X;

import android.util.Pair;
import androidx.media3.common.util.Util;
import com.facebook.forker.Process;

/* loaded from: classes11.dex */
public final class WSH implements InterfaceC72041XGk {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        double d;
        Long valueOf;
        Long valueOf2;
        int A02 = Util.A02(jArr, j, true);
        long j2 = jArr[A02];
        long j3 = jArr2[A02];
        int i = A02 + 1;
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

    @Override // X.InterfaceC72041XGk
    public final int Aem() {
        return Process.WAIT_RESULT_STOPPED;
    }

    @Override // X.InterfaceC72041XGk
    public final long Avh() {
        return -1L;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        Pair A00 = A00(this.A02, this.A01, Util.A04(AbstractC65703TsZ.A09(j, this.A00)));
        W5N w5n = new W5N(Util.A03(((Number) A00.first).longValue()), ((Number) A00.second).longValue());
        return new C69736VuW(w5n, w5n);
    }

    @Override // X.InterfaceC72041XGk
    public final long C8V(long j) {
        return Util.A03(((Number) A00(this.A01, this.A02, j).second).longValue());
    }

    public WSH(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? Util.A03(jArr2[jArr2.length - 1]) : j;
    }
}
