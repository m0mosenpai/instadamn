package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: X.MMb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50374MMb extends AbstractC23681Dy {
    public final LWT A00;

    public C50374MMb(C12W c12w) {
        super(c12w, true, true);
        this.A00 = new LWT(this);
    }

    @Override // X.AbstractC23681Dy
    public final void A0Y(Object obj) {
        this.A00.A01.set(obj);
    }

    @Override // X.AbstractC23681Dy
    public final void A0Z(boolean z, Throwable th) {
        LWT lwt = this.A00;
        boolean z2 = th instanceof CancellationException;
        SettableFuture settableFuture = lwt.A01;
        if (z2) {
            settableFuture.set(new C47468Kxx((CancellationException) th));
        } else {
            if (!settableFuture.setException(th)) {
                return;
            }
            lwt.A00 = true;
        }
    }
}
