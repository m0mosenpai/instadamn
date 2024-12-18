package X;

import android.view.Choreographer;

/* renamed from: X.OiD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ChoreographerFrameCallbackC55351OiD implements Choreographer.FrameCallback {
    public long A00 = -1;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final C8MA A05;
    public final /* synthetic */ OMN A06;
    public final /* synthetic */ OMN A07;

    public ChoreographerFrameCallbackC55351OiD(OMN omn, C8MA c8ma, float f, float f2, long j) {
        this.A07 = omn;
        this.A06 = omn;
        this.A05 = c8ma;
        this.A04 = j;
        this.A02 = f;
        this.A03 = f2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2 = this.A00;
        if (j2 == -1) {
            this.A00 = j;
            j2 = j;
        }
        float f = this.A02;
        float f2 = this.A03;
        long j3 = j - j2;
        long j4 = this.A04;
        float f3 = f + (((f2 - f) * ((float) j3)) / ((float) j4));
        if (j3 < j4 && !this.A01) {
            this.A07.A02.postFrameCallback(this);
            f2 = f3;
        }
        this.A06.A03.A00 = f2;
        this.A05.EGV();
    }
}
