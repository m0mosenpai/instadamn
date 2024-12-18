package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.Executor;

/* renamed from: X.SrH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63651SrH implements InterfaceC49062Mz, InterfaceC65193Tfb {
    public int A00;
    public PowerManager.WakeLock A01;
    public boolean A02;
    public final int A03;
    public final Context A04;
    public final C1113750b A05;
    public final C63650SrG A06;
    public final C2N8 A07;
    public final C2WP A08;
    public final Executor A09;
    public final Executor A0A;
    public final C12T A0B;
    public final Object A0C;
    public volatile AnonymousClass195 A0D;

    static {
        C48442Kl.A01("DelayMetCommandHandler");
    }

    public static void A00(C63651SrH c63651SrH) {
        synchronized (c63651SrH.A0C) {
            if (c63651SrH.A0D != null) {
                c63651SrH.A0D.AGH(null);
            }
            c63651SrH.A06.A08.A00(c63651SrH.A08);
            PowerManager.WakeLock wakeLock = c63651SrH.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                C48442Kl.A00();
                AbstractC09820fg.A01(c63651SrH.A01);
            }
        }
    }

    @Override // X.InterfaceC49062Mz
    public final void D7K(C50a workSpec, C48412Ki state) {
        Runnable tji;
        boolean z = workSpec instanceof C50Z;
        Executor executor = this.A0A;
        if (z) {
            tji = new TJJ(this);
        } else {
            tji = new TJI(this);
        }
        executor.execute(tji);
    }

    public C63651SrH(Context context, C1113750b startId, C63650SrG dispatcher, int startStopToken) {
        this.A04 = context;
        this.A03 = startStopToken;
        this.A06 = dispatcher;
        this.A08 = startId.A00;
        this.A05 = startId;
        C2ME c2me = dispatcher.A06.A09;
        C2LB c2lb = (C2LB) dispatcher.A09;
        this.A0A = c2lb.A01;
        this.A09 = c2lb.A02;
        this.A0B = c2lb.A03;
        this.A07 = new C2N8(c2me);
        this.A02 = false;
        this.A00 = 0;
        this.A0C = AbstractC58318PtA.A0b();
    }
}
