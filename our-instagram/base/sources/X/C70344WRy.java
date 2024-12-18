package X;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.WRy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70344WRy implements InterfaceC71878X8l {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        long[] jArr = this.A04;
        int A02 = Util.A02(jArr, j, true);
        long j2 = jArr[A02];
        long[] jArr2 = this.A03;
        W5N w5n = new W5N(j2, jArr2[A02]);
        if (w5n.A01 < j && A02 != this.A00 - 1) {
            int i = A02 + 1;
            return new C69736VuW(w5n, new W5N(jArr[i], jArr2[i]));
        }
        return new C69736VuW(w5n, w5n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1546));
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1456));
        sb.append(Arrays.toString(this.A01));
        sb.append(AbstractC111324zv.A00(1439));
        sb.append(Arrays.toString(this.A03));
        sb.append(AbstractC111324zv.A00(1458));
        sb.append(Arrays.toString(this.A04));
        sb.append(AbstractC111324zv.A00(1410));
        sb.append(Arrays.toString(this.A02));
        return AbstractC166997dE.A0x(")", sb);
    }

    public C70344WRy(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }
}
