package X;

import android.view.View;

/* renamed from: X.LxL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49690LxL implements InterfaceC37205GaG {
    public final /* synthetic */ C164547Xt A00;

    public C49690LxL(C164547Xt c164547Xt) {
        this.A00 = c164547Xt;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        C9GR.A0B(this.A00.A00.requireContext(), "something_went_wrong");
    }

    @Override // X.InterfaceC37205GaG
    public final void onFinish() {
        View view = this.A00.A00.mView;
        if (view != null) {
            AbstractC31557Dth.A00(view, false);
        }
    }

    @Override // X.InterfaceC37205GaG
    public final void onStart() {
        View view = this.A00.A00.mView;
        if (view != null) {
            AbstractC31557Dth.A00(view, true);
        }
    }

    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        C164547Xt c164547Xt = this.A00;
        AbstractC59962oe abstractC59962oe = c164547Xt.A00;
        C9GR.A07(abstractC59962oe.requireContext(), 2131952120);
        if (abstractC59962oe.isResumed()) {
            C164517Xq c164517Xq = c164547Xt.A04.A00;
            c164517Xq.A0A.invoke();
            c164517Xq.A07.invoke();
        }
        c164547Xt.A04.A00.A09.invoke();
    }
}
