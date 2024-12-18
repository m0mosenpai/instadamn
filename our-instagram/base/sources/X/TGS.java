package X;

/* loaded from: classes10.dex */
public final class TGS implements InterfaceC191378do {
    public final int A00;
    public final Object A01;

    public TGS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        switch (this.A00) {
            case 3:
                ((InterfaceC65500TlP) this.A01).DBk();
                return;
            case 4:
                ((AnonymousClass198) this.A01).A0L(AbstractC166997dE.A0a());
                return;
            default:
                ((AbstractC25011Ke) this.A01).set(AbstractC166997dE.A0a());
                return;
        }
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 3:
                ((InterfaceC65500TlP) obj).DBm(null);
                return;
            case 4:
                ((AnonymousClass198) obj).A0L(AbstractC166997dE.A0b());
                return;
            default:
                ((AbstractC25011Ke) obj).set(AbstractC166997dE.A0b());
                return;
        }
    }
}
