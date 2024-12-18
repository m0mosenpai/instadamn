package X;

import android.os.CountDownTimer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gsg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CountDownTimerC38297Gsg extends CountDownTimer {
    public final C120985dq A00;
    public final long A01;
    public final /* synthetic */ C37562GgI A02;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        Long valueOf = Long.valueOf(j);
        C37562GgI c37562GgI = this.A02;
        ConcurrentHashMap concurrentHashMap = c37562GgI.A0B;
        C120985dq c120985dq = this.A00;
        concurrentHashMap.put(c120985dq.getId(), valueOf);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            C75113Zb BRZ = c37562GgI.A07.BRZ(c38321qM);
            long A03 = C36J.A03(C36H.A04(C36G.A09, c37562GgI.A08(c120985dq).A03));
            BRZ.A3Y.A00(BRZ, valueOf);
            if (j <= this.A01) {
                if (!AbstractC166987dD.A1a(BRZ.A3Z.A00)) {
                    c37562GgI.A08.A00(c120985dq, 0L, A03, j, false);
                }
                BRZ.A0i(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC38297Gsg(C120985dq c120985dq, C37562GgI c37562GgI, long j) {
        super(C36J.A03(C36H.A04(C36G.A09, c37562GgI.A08(c120985dq).A03)), 250L);
        this.A02 = c37562GgI;
        this.A00 = c120985dq;
        this.A01 = j;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C37562GgI.A04(this.A00, this.A02);
    }
}
