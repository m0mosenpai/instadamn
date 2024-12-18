package X;

import android.view.View;

/* renamed from: X.BRh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25545BRh implements Runnable {
    public final /* synthetic */ C25541BRd A00;

    public RunnableC25545BRh(C25541BRd c25541BRd) {
        this.A00 = c25541BRd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        Integer num2;
        View A07;
        C25541BRd c25541BRd = this.A00;
        C120985dq c120985dq = c25541BRd.A01;
        if (c120985dq != null) {
            C37644Ghd C09 = c25541BRd.A08.A0A.C09(c120985dq);
            C37556GgC c37556GgC = ((AbstractC37623GhI) c25541BRd).A02;
            if (c37556GgC != null && (A07 = c37556GgC.A07(c37556GgC.A03())) != null) {
                A07.performHapticFeedback(0);
            }
            boolean z = C09.A0R;
            if (!z) {
                c25541BRd.A07.EWU(c120985dq, false);
                c25541BRd.A06.getWindow().setFlags(8192, 8192);
                BKQ bkq = c25541BRd.A0C;
                if (C25541BRd.A06(c120985dq, c25541BRd)) {
                    num2 = C05F.A0C;
                } else {
                    num2 = C05F.A0N;
                }
                bkq.A02(num2);
            } else {
                c25541BRd.A0B();
                c25541BRd.A06.getWindow().clearFlags(8192);
                BKQ bkq2 = c25541BRd.A0C;
                if (C25541BRd.A06(c120985dq, c25541BRd)) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                bkq2.A01(num);
            }
            c25541BRd.A07.EWT(c120985dq, !z);
        }
    }
}
