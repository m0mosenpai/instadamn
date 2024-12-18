package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WSF implements InterfaceC72041XGk {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final long[] A04;

    @Override // X.InterfaceC72041XGk
    public final int Aem() {
        return this.A00;
    }

    @Override // X.InterfaceC72041XGk
    public final long Avh() {
        return this.A01;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        long[] jArr = this.A04;
        int A02 = Util.A02(jArr, j, true);
        long j2 = jArr[A02];
        long[] jArr2 = this.A03;
        W5N w5n = new W5N(j2, jArr2[A02]);
        if (w5n.A01 < j && A02 != jArr.length - 1) {
            int i = A02 + 1;
            return new C69736VuW(w5n, new W5N(jArr[i], jArr2[i]));
        }
        return new C69736VuW(w5n, w5n);
    }

    @Override // X.InterfaceC72041XGk
    public final long C8V(long j) {
        return this.A04[Util.A02(this.A03, j, true)];
    }

    public WSF(long[] jArr, long[] jArr2, int i, long j, long j2) {
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }
}
