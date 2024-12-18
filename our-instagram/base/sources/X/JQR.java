package X;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;

/* loaded from: classes8.dex */
public final class JQR extends AbstractC60592pi {
    public final /* synthetic */ JQS A00;

    public JQR(JQS jqs) {
        this.A00 = jqs;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A00.A07();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
        if (bundle != null) {
            JQS jqs = this.A00;
            if (((AbstractC69603Au) jqs).A01) {
                jqs.A05.markerDrop(jqs.A01(), ((AbstractC69603Au) jqs).A00);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        Looper.myQueue().addIdleHandler(this.A00.A02);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        MessageQueue myQueue = Looper.myQueue();
        JQS jqs = this.A00;
        myQueue.removeIdleHandler(jqs.A02);
        if (jqs.A00) {
            jqs.A0L();
        } else {
            jqs.A0M();
        }
    }
}
