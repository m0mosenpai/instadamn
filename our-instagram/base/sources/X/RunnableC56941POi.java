package X;

import android.view.ViewGroup;

/* renamed from: X.POi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56941POi implements Runnable {
    public final /* synthetic */ C52819NZc A00;

    public RunnableC56941POi(C52819NZc c52819NZc) {
        this.A00 = c52819NZc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52819NZc c52819NZc = this.A00;
        if (((PJ0) c52819NZc).A04.mView != null) {
            InterfaceC09390do interfaceC09390do = c52819NZc.A0B;
            ViewGroup.LayoutParams layoutParams = AbstractC166987dD.A0d(interfaceC09390do).getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = AbstractC166987dD.A0d(c52819NZc.A0A).getMeasuredHeight() + AbstractC43594JPz.A0E(((PJ0) c52819NZc).A03).getMeasuredHeight();
            AbstractC166987dD.A0d(interfaceC09390do).setLayoutParams(layoutParams);
        }
    }
}
