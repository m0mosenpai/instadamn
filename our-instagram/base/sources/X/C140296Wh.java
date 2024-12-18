package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.6Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140296Wh extends C93R {
    public SJE A00;
    public C103804lz A01;
    public ScheduledFuture A02;
    public boolean A03;
    public final C0JM A04;
    public final InterfaceC65486Tl6 A05 = new C64072Syo(this);
    public final C103724lq A06;
    public final C103774lw A07;
    public final AbstractC128665rZ A08;
    public final ScheduledExecutorService A09;

    public static void A00(C140296Wh c140296Wh, Throwable th) {
        c140296Wh.A03 = false;
        c140296Wh.A08.A06();
        ScheduledFuture scheduledFuture = c140296Wh.A02;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c140296Wh.A02 = null;
        }
        c140296Wh.A02(th);
    }

    @Override // X.C93R
    public final synchronized void A03() {
        A00(this, new CancellationException());
    }

    public C140296Wh(C0JM c0jm, C103724lq c103724lq, C103774lw c103774lw, AbstractC128665rZ abstractC128665rZ, ScheduledExecutorService scheduledExecutorService) {
        this.A06 = c103724lq;
        this.A08 = abstractC128665rZ;
        this.A07 = c103774lw;
        this.A04 = c0jm;
        this.A09 = scheduledExecutorService;
    }
}
