package X;

import android.os.Bundle;

/* renamed from: X.WvD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71508WvD implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AbstractC10360h2 A01;

    public RunnableC71508WvD(Bundle bundle, AbstractC10360h2 abstractC10360h2) {
        this.A01 = abstractC10360h2;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        if (!abstractC10360h2.A11() && abstractC10360h2.A0Q("feedbackAlertDialog") == null && AbstractC71193Hg.A00.compareAndSet(false, true)) {
            C0SG c0sg = new C0SG();
            c0sg.setArguments(this.A00);
            c0sg.mLifecycleRegistry.A09(new C70297WQc(this));
            c0sg.A0B(abstractC10360h2, "feedbackAlertDialog");
        }
    }
}
