package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Lro, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49356Lro implements MQ7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C43803JYq A01;
    public final /* synthetic */ boolean A02;

    public C49356Lro(FragmentActivity fragmentActivity, C43803JYq c43803JYq, boolean z) {
        this.A02 = z;
        this.A01 = c43803JYq;
        this.A00 = fragmentActivity;
    }

    @Override // X.MQ7
    public final void onFailure() {
    }

    @Override // X.MQ7
    public final void onSuccess() {
        FragmentActivity fragmentActivity;
        Runnable runnableC49893M1m;
        if (this.A02) {
            new LFw(this.A01.A00).A00("igd_nudity_detection_model_loading_nux");
            fragmentActivity = this.A00;
            runnableC49893M1m = new RunnableC49892M1l(fragmentActivity);
        } else {
            fragmentActivity = this.A00;
            runnableC49893M1m = new RunnableC49893M1m(fragmentActivity);
        }
        fragmentActivity.runOnUiThread(runnableC49893M1m);
    }
}
