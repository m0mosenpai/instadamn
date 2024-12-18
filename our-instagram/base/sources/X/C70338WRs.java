package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WRs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70338WRs implements InterfaceC71878X8l {
    public final long A00;
    public final C70166WEi A01;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        long j2;
        C70166WEi c70166WEi = this.A01;
        C68878Vda c68878Vda = c70166WEi.A0B;
        WDn.A00(c68878Vda);
        long[] jArr = c68878Vda.A01;
        long[] jArr2 = c68878Vda.A00;
        long j3 = c70166WEi.A07;
        int A02 = Util.A02(jArr, AbstractC65703TsZ.A09((j * j3) / 1000000, c70166WEi.A09 - 1), false);
        long j4 = 0;
        if (A02 == -1) {
            j2 = 0;
        } else {
            j2 = jArr[A02];
            j4 = jArr2[A02];
        }
        long j5 = this.A00;
        W5N w5n = new W5N((j2 * 1000000) / j3, j5 + j4);
        if (w5n.A01 != j && A02 != jArr.length - 1) {
            int i = A02 + 1;
            return new C69736VuW(w5n, new W5N((jArr[i] * 1000000) / j3, j5 + jArr2[i]));
        }
        return new C69736VuW(w5n, w5n);
    }

    public C70338WRs(C70166WEi c70166WEi, long j) {
        this.A01 = c70166WEi;
        this.A00 = j;
    }
}
