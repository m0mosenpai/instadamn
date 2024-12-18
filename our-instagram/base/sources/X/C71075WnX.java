package X;

import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;

/* renamed from: X.WnX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71075WnX implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ LimitedCommentsFragment A00;

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return false;
    }

    public C71075WnX(LimitedCommentsFragment limitedCommentsFragment) {
        this.A00 = limitedCommentsFragment;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C38321qM c38321qM = this.A00.A01;
        if (c38321qM != null && c38321qM.A0X) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        LimitedCommentsFragment limitedCommentsFragment = this.A00;
        C166467cF.A00(limitedCommentsFragment.A04, limitedCommentsFragment.A0G, false);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (CLJ()) {
            Chd();
        }
    }
}
