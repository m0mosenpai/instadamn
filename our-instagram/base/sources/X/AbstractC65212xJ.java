package X;

/* renamed from: X.2xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65212xJ extends C2US implements InterfaceC61752rc {
    public final C61742rb A00;

    @Override // X.InterfaceC61752rc
    public final void DNG(Object obj, int i) {
        C61742rb c61742rb = this.A00;
        if (c61742rb != null) {
            C61742rb.A00(c61742rb, obj, i);
        }
    }

    @Override // X.InterfaceC61752rc
    public final void DNl() {
    }

    @Override // X.InterfaceC61752rc
    public final void DNz() {
        C61742rb c61742rb = this.A00;
        if (c61742rb != null) {
            c61742rb.DNz();
        }
    }

    public AbstractC65212xJ(C61742rb c61742rb, boolean z, boolean z2) {
        super(z2);
        this.A00 = z ? c61742rb : null;
    }
}
