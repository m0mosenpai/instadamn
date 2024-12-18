package X;

import android.graphics.Bitmap;

/* renamed from: X.YHk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73520YHk implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C48544Ldh A01;

    public RunnableC73520YHk(Bitmap bitmap, C48544Ldh c48544Ldh) {
        this.A01 = c48544Ldh;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72793XnE c72793XnE = (C72793XnE) this.A01.A01;
        int A00 = C72793XnE.A00(this.A00);
        c72793XnE.A01 = A00;
        C72738XmA c72738XmA = c72793XnE.A03;
        if (c72738XmA != null) {
            c72738XmA.A00.A02("sBrush", A00);
        }
    }
}
