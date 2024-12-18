package X;

import android.graphics.PointF;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.VsC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69609VsC {
    public Point2 A00;
    public Point2 A01;
    public final W5C A02;
    public final long A03;
    public final Point2 A04;

    /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public final void A00(PointF pointF, long j) {
        if (j >= this.A03) {
            Point2 point2 = this.A00;
            Point2 point22 = this.A01;
            if (point2 == point22) {
                this.A00 = new PointF(pointF.x, pointF.y);
                return;
            }
            Point2 point23 = this.A04;
            float f = pointF.x - ((PointF) point22).x;
            ((PointF) point23).x = f;
            float f2 = pointF.y - ((PointF) point22).y;
            ((PointF) point23).y = f2;
            ((PointF) point23).x = f * 0.5f;
            ((PointF) point23).y = f2 * 0.5f;
            this.A02.A00(point2, point23, (float) j);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw new IllegalStateException("events must deliver in order");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public C69609VsC(PointF pointF, long j) {
        W5C w5c = new W5C();
        this.A02 = w5c;
        ?? pointF2 = new PointF(0.0f, 0.0f);
        this.A04 = pointF2;
        ?? pointF3 = new PointF(pointF.x, pointF.y);
        this.A00 = pointF3;
        this.A01 = pointF3;
        this.A03 = j;
        w5c.A00(pointF3, pointF2, (float) j);
    }
}
