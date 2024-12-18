package X;

import android.view.Choreographer;

/* renamed from: X.8o2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197318o2 {
    public Choreographer.FrameCallback A00;

    public void A00(long j) {
        C197308o1 c197308o1 = (C197308o1) this;
        C197268nx c197268nx = c197308o1.A01;
        long j2 = C197268nx.A05;
        if (c197268nx.A03 && !c197268nx.A04) {
            if (c197268nx.A00 <= j) {
                long j3 = C197268nx.A05;
                c197268nx.A00 = j3 * ((j / j3) + 1);
                c197308o1.A00.EGo();
                return;
            }
            c197268nx.A02.A00(c197268nx.A01);
        }
    }
}
