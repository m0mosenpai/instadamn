package X;

import java.util.HashMap;

/* renamed from: X.TNu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64638TNu implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Q4O A01;

    public RunnableC64638TNu(Q4O q4o, int i) {
        this.A01 = q4o;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q4O q4o = this.A01;
        HashMap hashMap = q4o.A02;
        Integer valueOf = Integer.valueOf(this.A00);
        hashMap.remove(valueOf);
        q4o.A01.remove(valueOf);
        q4o.invalidate();
    }
}
