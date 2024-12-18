package X;

import java.util.ArrayList;

/* renamed from: X.GNc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36881GNc implements Runnable {
    public final /* synthetic */ C2US A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC36881GNc(C2US c2us, ArrayList arrayList) {
        this.A00 = c2us;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.mDiffer.A01(this.A01, null);
    }
}
