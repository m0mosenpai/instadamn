package X;

import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89163yI implements InterfaceC12870lZ {
    public static C89163yI A05;
    public long A00;
    public final SharedPreferences A01;
    public final C89183yK A02;
    public final C23111Aq A03;
    public final ScheduledExecutorService A04;

    public C89163yI(C23111Aq c23111Aq) {
        C89173yJ c89173yJ;
        SharedPreferences sharedPreferences = c23111Aq.A05.getSharedPreferences("stash_utilization_metrics", 0);
        synchronized (C89173yJ.class) {
            c89173yJ = C89173yJ.A02;
            if (c89173yJ == null) {
                c89173yJ = new C89173yJ();
                C89173yJ.A02 = c89173yJ;
            }
        }
        this.A00 = 0L;
        this.A03 = c23111Aq;
        this.A02 = new C89183yK(sharedPreferences, c89173yJ, c23111Aq.A03(C05F.A01));
        this.A01 = sharedPreferences;
        this.A04 = C14250np.A00().A00;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1121844769);
        C89183yK c89183yK = this.A02;
        c89183yK.A03.execute(new RunnableC71421Wtj(c89183yK, C89183yK.A04));
        C0f9.A0A(708344107, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1294444040, C0f9.A03(612862373));
    }
}
