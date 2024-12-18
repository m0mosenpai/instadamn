package X;

import java.util.List;

/* renamed from: X.Ux5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67737Ux5 extends C4BE {
    public final List A00;

    @Override // X.C4BE
    public final boolean A08() {
        return true;
    }

    public C67737Ux5(C4B0 c4b0, List list, List list2, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        super(c4b0, list, i, j, j2, j3, j4, j5, j6, j7, j8);
        this.A00 = list2;
    }

    @Override // X.C4BE
    public final long A01(long j) {
        return this.A00.size();
    }

    @Override // X.C4BE
    public final C4B0 A06(C4BB c4bb, long j) {
        return (C4B0) this.A00.get((int) (j - this.A05));
    }
}
