package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GPG implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C189478aR A02;

    public GPG(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C189478aR c189478aR) {
        this.A02 = c189478aR;
        this.A00 = fragmentActivity;
        this.A01 = abstractC59962oe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189478aR c189478aR = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        C14360o3.A0A(abstractC59962oe);
        c189478aR.A02(fragmentActivity, abstractC59962oe);
    }
}
