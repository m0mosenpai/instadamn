package X;

/* renamed from: X.NLh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52514NLh extends AbstractC127945qN implements InterfaceC154036wC {
    public int A00;
    public boolean A01;
    public final InterfaceC57960Pn6 A02;

    public AbstractC52514NLh(InterfaceC57960Pn6 interfaceC57960Pn6) {
        super(AbstractC127905qJ.A02(1, 1), interfaceC57960Pn6.getId());
        this.A02 = interfaceC57960Pn6;
        this.A00 = -1;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        return false;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 0L;
    }

    @Override // X.InterfaceC154036wC
    public final int Bsu() {
        return this.A00;
    }

    @Override // X.InterfaceC154036wC
    public final boolean Cce() {
        return this.A01;
    }

    @Override // X.InterfaceC154036wC
    public final void EdT(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC154036wC
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.AbstractC127945qN, X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
