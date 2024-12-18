package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Syo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64072Syo implements InterfaceC65486Tl6 {
    public final /* synthetic */ C140296Wh A00;

    public C64072Syo(C140296Wh c140296Wh) {
        this.A00 = c140296Wh;
    }

    @Override // X.InterfaceC65486Tl6
    public final void DE7(C58601PyU c58601PyU) {
        C140296Wh c140296Wh = this.A00;
        synchronized (c140296Wh) {
            if (c140296Wh.A03) {
                C140296Wh.A00(c140296Wh, c58601PyU);
            }
        }
    }

    @Override // X.InterfaceC65486Tl6
    public final void DQA(C103804lz c103804lz) {
        long now;
        C140296Wh c140296Wh = this.A00;
        synchronized (c140296Wh) {
            if (c140296Wh.A03) {
                c140296Wh.A01 = c103804lz;
                if (c103804lz.A03() == null) {
                    now = Long.MIN_VALUE;
                } else {
                    now = c140296Wh.A04.now() - c103804lz.A03().longValue();
                }
                if (now <= c140296Wh.A00.A02 && c103804lz.A01() != null && c103804lz.A01().floatValue() <= c140296Wh.A00.A00) {
                    c140296Wh.A03 = false;
                    c140296Wh.A08.A06();
                    ScheduledFuture scheduledFuture = c140296Wh.A02;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        c140296Wh.A02 = null;
                    }
                    c140296Wh.A01(c103804lz);
                }
            }
        }
    }
}
