package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.LRc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48102LRc implements C07W {
    public C07X A00;
    public InterfaceC60122ou A01;
    public C56352iT A02;

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void attachActionBar() {
        C56352iT c56352iT;
        InterfaceC60122ou interfaceC60122ou = this.A01;
        if (interfaceC60122ou != null && (c56352iT = this.A02) != null) {
            c56352iT.A0X(interfaceC60122ou);
        }
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public final void removeFragmentLifecycleObserver() {
        C07T lifecycle;
        C07X c07x = this.A00;
        if (c07x != null && (lifecycle = c07x.getLifecycle()) != null) {
            lifecycle.A0A(this);
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
