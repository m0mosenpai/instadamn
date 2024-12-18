package X;

import android.graphics.PointF;
import android.view.MotionEvent;

/* loaded from: classes11.dex */
public final class W92 {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public PointF A04;

    public W92(W92 w92) {
        this.A04 = new PointF(0.0f, 0.0f);
        this.A02 = -1;
        PointF pointF = w92.A04;
        this.A04 = new PointF(pointF.x, pointF.y);
        this.A03 = w92.A03;
        this.A00 = w92.A00;
        this.A01 = w92.A01;
        this.A02 = w92.A02;
    }

    public W92(MotionEvent motionEvent) {
        PointF pointF = new PointF(0.0f, 0.0f);
        this.A04 = pointF;
        this.A02 = -1;
        pointF.set(motionEvent.getX(), motionEvent.getY());
        this.A03 = motionEvent.getEventTime();
        this.A00 = motionEvent.getPressure();
        this.A01 = motionEvent.getSize();
    }

    public W92() {
        this.A04 = new PointF(0.0f, 0.0f);
        this.A02 = -1;
    }
}
