package X;

import android.view.ViewGroup;

/* renamed from: X.AyW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24810AyW implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144336fF A02;

    public RunnableC24810AyW(C41181vS c41181vS, C84823qW c84823qW, C144336fF c144336fF) {
        this.A02 = c144336fF;
        this.A01 = c84823qW;
        this.A00 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144336fF c144336fF = this.A02;
        ViewGroup A01 = AbstractC124845kp.A01(c144336fF.A00());
        AbstractC167017dG.A17(c144336fF.A00(), this.A00, this.A01, A01.getWidth(), A01.getHeight());
    }
}
