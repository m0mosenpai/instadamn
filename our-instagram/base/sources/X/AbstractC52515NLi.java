package X;

/* renamed from: X.NLi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52515NLi extends AbstractC127945qN implements InterfaceC154036wC {
    public int A00;
    public boolean A01;
    public final InterfaceC58008Pns A02;

    public AbstractC52515NLi(InterfaceC58008Pns interfaceC58008Pns) {
        super(AbstractC127905qJ.A02(1, 1), interfaceC58008Pns.getId());
        this.A02 = interfaceC58008Pns;
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
