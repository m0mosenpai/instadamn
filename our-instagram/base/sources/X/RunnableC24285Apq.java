package X;

import java.util.List;

/* renamed from: X.Apq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24285Apq implements Runnable {
    public final /* synthetic */ C8f3 A00;

    public RunnableC24285Apq(C8f3 c8f3) {
        this.A00 = c8f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A01;
        if (list != null) {
            list.clear();
        }
    }
}
