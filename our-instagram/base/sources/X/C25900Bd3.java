package X;

/* renamed from: X.Bd3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25900Bd3 extends AbstractC65392xb {
    public final /* synthetic */ C152816u9 A00;

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2) {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "range_changed", new C57263Pbl(c152816u9, i, this, i2, 0));
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "insert", new C57263Pbl(c152816u9, i, this, i2, 1));
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeMoved(int i, int i2, int i3) {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "moved", new X38(c152816u9, this, i, i2, i3, 1));
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeRemoved(int i, int i2) {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "remove", new C57263Pbl(c152816u9, i, this, i2, 2));
    }

    public C25900Bd3(C152816u9 c152816u9) {
        this.A00 = c152816u9;
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "all_changed", C29899DGn.A00(this, c152816u9, 15));
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C152816u9 c152816u9 = this.A00;
        C152816u9.A04(c152816u9, "changed_with_payload", new C29716D8m(i2, i, 1, this, c152816u9, obj));
    }
}
