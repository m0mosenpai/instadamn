package X;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.4sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107364sh extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C77123cy A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C107314sc A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107364sh(C77123cy c77123cy, C51762Yz c51762Yz, C107314sc c107314sc, long j) {
        super(1);
        this.A01 = c77123cy;
        this.A03 = c107314sc;
        this.A00 = j;
        this.A02 = c51762Yz;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Timer timer;
        C77123cy c77123cy = this.A01;
        final C107314sc c107314sc = this.A03;
        InterfaceC89793zL interfaceC89793zL = C107314sc.A04;
        String A0R = AnonymousClass001.A0R("CyclicSubtitleComponent_", c107314sc.A03.A09.A00.getId());
        long j = this.A00;
        final C51762Yz c51762Yz = this.A02;
        if (A0R == null) {
            timer = new Timer(true);
        } else {
            timer = new Timer(A0R, true);
        }
        timer.scheduleAtFixedRate(new TimerTask() { // from class: X.4tC
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C51762Yz.this.A03(new C206849Dp(c107314sc, 33));
            }
        }, j, j);
        C2XV.A00();
        c77123cy.A00 = timer;
        return C0eB.A00;
    }
}
