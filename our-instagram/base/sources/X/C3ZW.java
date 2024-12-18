package X;

/* renamed from: X.3ZW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZW implements C3ZQ {
    public final C9BP A00;

    public C3ZW(C9BP c9bp) {
        C14360o3.A0B(c9bp, 1);
        this.A00 = c9bp;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ boolean DR6(Object obj) {
        return true;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ void DR7(Object obj) {
    }

    @Override // X.C3ZQ
    public final Object Ava() {
        return this.A00.A03;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[SimpleGraphNode] data = ");
        sb.append(this.A00.A03);
        return sb.toString();
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        return C16930sl.A00;
    }
}
