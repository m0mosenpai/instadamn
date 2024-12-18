package X;

import android.graphics.PointF;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.WnS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71070WnS implements YQQ {
    public double A00;
    public C69609VsC A01;
    public final float A02;
    public final float A03;
    public final Point2 A06 = new PointF(0.0f, 0.0f);
    public final Point2 A05 = new PointF(0.0f, 0.0f);
    public final Point2 A07 = new PointF(0.0f, 0.0f);
    public final Point2 A04 = new PointF(0.0f, 0.0f);

    @Override // X.YQQ
    public final void EV5(W92 w92) {
        C14360o3.A0B(w92, 0);
        this.A05.set(w92.A04);
        long j = w92.A03;
        while (this.A00 + 8.0d < j) {
            A00();
        }
    }

    @Override // X.YQQ
    public final void En3(W92 w92) {
        C14360o3.A0B(w92, 0);
        this.A01 = new C69609VsC(w92.A04, w92.A03);
        this.A00 = w92.A03;
        this.A06.set(w92.A04);
        this.A07.set(0.0f, 0.0f);
    }

    public final void A00() {
        Point2 point2 = this.A04;
        Point2 point22 = this.A05;
        Point2 point23 = this.A06;
        float f = ((PointF) point22).x - ((PointF) point23).x;
        ((PointF) point2).x = f;
        float f2 = ((PointF) point22).y - ((PointF) point23).y;
        ((PointF) point2).y = f2;
        float f3 = this.A03;
        float f4 = f * f3;
        ((PointF) point2).x = f4;
        float f5 = f2 * f3;
        ((PointF) point2).y = f5;
        Point2 point24 = this.A07;
        float f6 = ((PointF) point24).x + f4;
        ((PointF) point24).x = f6;
        float f7 = ((PointF) point24).y + f5;
        ((PointF) point24).y = f7;
        float f8 = this.A02;
        float f9 = f6 * f8;
        ((PointF) point24).x = f9;
        float f10 = f7 * f8;
        ((PointF) point24).y = f10;
        ((PointF) point23).x += f9;
        ((PointF) point23).y += f10;
        this.A00 += 8.0d;
        C69609VsC c69609VsC = this.A01;
        C14360o3.A0A(c69609VsC);
        c69609VsC.A00(point23, (long) this.A00);
    }

    @Override // X.YQQ
    public final void AIm(long j) {
        Point2 point2 = this.A06;
        Point2 point22 = this.A05;
        float A00 = (float) AbstractC43594JPz.A00(((PointF) point2).x - ((PointF) point22).x, ((PointF) point2).y - ((PointF) point22).y);
        float f = A00;
        PointF pointF = new PointF(0.0f, 0.0f);
        while (f > 0.0f && A00 > 0.0f) {
            pointF.set(point2);
            A00();
            A00 = (float) AbstractC43594JPz.A00(((PointF) point2).x - pointF.x, ((PointF) point2).y - pointF.y);
            f -= A00;
        }
    }

    @Override // X.YQQ
    public final W5C BuO() {
        C69609VsC c69609VsC = this.A01;
        C14360o3.A0A(c69609VsC);
        W5C w5c = c69609VsC.A02;
        C14360o3.A07(w5c);
        return w5c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public C71070WnS(float f, float f2) {
        this.A03 = f;
        this.A02 = f2;
    }
}
