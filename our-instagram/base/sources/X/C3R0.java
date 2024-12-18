package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3R0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R0 extends AbstractC73453Qw {
    public ListenableFuture A00;
    public ScheduledFuture A01;

    @Override // X.AbstractC25011Ke
    public final String A07() {
        ListenableFuture listenableFuture = this.A00;
        ScheduledFuture scheduledFuture = this.A01;
        if (listenableFuture != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC111324zv.A00(2541));
            sb.append(listenableFuture);
            sb.append("]");
            String obj = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return AnonymousClass001.A0s(obj, ", remaining delay=[", " ms]", delay);
                }
                return obj;
            }
            return obj;
        }
        return null;
    }

    @Override // X.AbstractC25011Ke
    public final void A08() {
        A0B(this.A00);
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A00 = null;
        this.A01 = null;
    }
}
