package X;

import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HKb extends C127995qS implements InterfaceC154036wC {
    public int A00;
    public boolean A01;
    public final User A02;

    public HKb(C127915qK c127915qK, C38321qM c38321qM, User user) {
        super(c127915qK, null, c38321qM);
        this.A02 = user;
        this.A00 = -1;
    }

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        return false;
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
