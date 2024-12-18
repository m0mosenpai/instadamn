package X;

/* renamed from: X.4t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107604t5 extends AbstractC107574t2 implements InterfaceC107614t6 {
    public final long A03;
    public long A02 = Long.MIN_VALUE;
    public long A00 = Long.MIN_VALUE;
    public long A01 = Long.MIN_VALUE;

    @Override // X.InterfaceC107614t6
    public final boolean isFinished() {
        if (this.A01 < this.A00) {
            return false;
        }
        return true;
    }

    public C107604t5(int i) {
        this.A03 = i;
    }
}
