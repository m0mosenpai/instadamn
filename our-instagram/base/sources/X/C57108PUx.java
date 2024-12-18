package X;

/* renamed from: X.PUx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57108PUx implements InterfaceC14180ni, InterfaceC57967PnD {
    public final /* synthetic */ C68033V7e A00;

    public C57108PUx(C68033V7e c68033V7e) {
        this.A00 = c68033V7e;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C68033V7e.class, "getGridPosition", "getGridPosition(Lcom/instagram/discovery/recyclerview/model/GridItemViewModel;)Lcom/instagram/common/recyclerview/grid/model/GridPosition;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC57967PnD
    public final /* bridge */ /* synthetic */ C5qT BAM(Object obj) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        C14360o3.A0B(abstractC127945qN, 0);
        return this.A00.BAL(abstractC127945qN);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57967PnD) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
