package X;

/* renamed from: X.2xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65442xg implements InterfaceC65452xh {
    public final C2UU A00;

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
        this.A00.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
        this.A00.notifyItemRangeInserted(i, i2);
    }

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
        this.A00.notifyItemMoved(i, i2);
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
        this.A00.notifyItemRangeRemoved(i, i2);
    }

    public C65442xg(C2UU c2uu) {
        this.A00 = c2uu;
    }
}
