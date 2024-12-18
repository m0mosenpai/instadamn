package X;

import java.util.List;

/* renamed from: X.AuG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24559AuG implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C176527tA A01;

    public RunnableC24559AuG(C176527tA c176527tA, long j) {
        this.A01 = c176527tA;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C176307sn c176307sn = this.A01.A00.A0G;
        if (c176307sn != null) {
            long j = this.A00;
            List list = c176307sn.A00.A01.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC208269Jl.A00(((C174777qD) list.get(i)).A00.A0J).A05(j);
            }
        }
    }
}
