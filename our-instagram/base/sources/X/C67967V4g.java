package X;

import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;

/* renamed from: X.V4g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67967V4g extends AbstractC70118W4q {
    public final int A00;
    public final Object A01;

    public C67967V4g(TurnAllocationCallback turnAllocationCallback, int i) {
        this.A00 = i;
        this.A01 = turnAllocationCallback;
    }

    @Override // X.AbstractC70118W4q
    public final void A03(Exception exc) {
        int i = this.A00;
        C14360o3.A0B(exc, 0);
        String message = exc.getMessage();
        if (i != 0) {
            if (message == null || message.length() == 0) {
                message = "Relays allocation failed with unknown error.";
            }
        } else if (message == null || message.length() == 0) {
            message = "Turn allocation failed with unknown error.";
        }
        ((TurnAllocationCallback) this.A01).error(message, -1);
    }
}
