package X;

/* loaded from: classes11.dex */
public final class WlQ implements InterfaceC65242xM {
    public final /* synthetic */ C3FP A00;

    public WlQ(C3FP c3fp) {
        this.A00 = c3fp;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00.A03.A0A;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        C2UU c2uu = this.A00.A03.A0A;
        if (c2uu != null) {
            return c2uu.getItemCount();
        }
        return 0;
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        C2UU c2uu = this.A00.A03.A0A;
        if (c2uu != null) {
            return ((C66362zD) c2uu).A04(i);
        }
        return null;
    }
}
