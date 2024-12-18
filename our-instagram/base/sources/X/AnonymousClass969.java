package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.969, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass969 {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public final void A00() {
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A00.ARD();
        ARD.E7G("bigfoot_reporter_last_foreground_measurement", currentTimeMillis);
        ARD.apply();
        this.A00.set(false);
    }
}
