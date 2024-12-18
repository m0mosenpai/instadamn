package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.WQc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70297WQc implements C07W {
    public final /* synthetic */ RunnableC71508WvD A00;

    public C70297WQc(RunnableC71508WvD runnableC71508WvD) {
        this.A00 = runnableC71508WvD;
    }

    @OnLifecycleEvent(C07R.ON_ANY)
    public void onAny(C07X c07x) {
        c07x.getLifecycle().A0A(this);
        AbstractC71193Hg.A00.set(false);
    }
}
