package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98444bN implements InterfaceC98454bO {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return true;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A01;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        long[] jArr = this.A05;
        int A04 = Util.A04(jArr, j, true);
        long j2 = jArr[A04];
        long[] jArr2 = this.A04;
        W5Q w5q = new W5Q(j2, jArr2[A04]);
        if (w5q.A01 < j && A04 != this.A00 - 1) {
            int i = A04 + 1;
            return new C69745Vuf(w5q, new W5Q(jArr[i], jArr2[i]));
        }
        return new C69745Vuf(w5q, w5q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1546));
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1456));
        sb.append(Arrays.toString(this.A02));
        sb.append(AbstractC111324zv.A00(1439));
        sb.append(Arrays.toString(this.A04));
        sb.append(AbstractC111324zv.A00(1458));
        sb.append(Arrays.toString(this.A05));
        sb.append(AbstractC111324zv.A00(1410));
        sb.append(Arrays.toString(this.A03));
        sb.append(")");
        return sb.toString();
    }

    public C98444bN(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A02 = iArr;
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A05 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A01 = jArr2[i] + jArr3[i];
        }
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A01;
    }
}
