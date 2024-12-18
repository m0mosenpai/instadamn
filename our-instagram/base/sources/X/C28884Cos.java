package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.Cos, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28884Cos implements C07W {
    public final /* synthetic */ C70843Fw A00;

    public C28884Cos(C70843Fw c70843Fw) {
        this.A00 = c70843Fw;
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void onFragmentResumed() {
        AbstractC19590xm.A09(this.A00.A04, new C25310BIf(true, 13));
    }
}
