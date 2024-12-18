package X;

import android.view.Choreographer;

/* renamed from: X.6kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC147346kK implements Choreographer.FrameCallback {
    public final /* synthetic */ C147326kI A00;

    public ChoreographerFrameCallbackC147346kK(C147326kI c147326kI) {
        this.A00 = c147326kI;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C147326kI c147326kI = this.A00;
        if (c147326kI.A07) {
            long j2 = c147326kI.A02;
            long currentTimeMillis = System.currentTimeMillis();
            c147326kI.A02 = currentTimeMillis;
            float f = c147326kI.A00 + (((float) (currentTimeMillis - j2)) / c147326kI.A01);
            c147326kI.A00 = f;
            InterfaceC147306kG interfaceC147306kG = c147326kI.A09;
            Object obj = c147326kI.A05;
            if (obj != null) {
                interfaceC147306kG.Dbz(obj, f);
                if (c147326kI.A00 >= 1.0f) {
                    Object obj2 = c147326kI.A05;
                    if (obj2 != null) {
                        interfaceC147306kG.Dbs(obj2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
