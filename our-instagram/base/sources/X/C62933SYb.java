package X;

import android.graphics.PointF;

/* renamed from: X.SYb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62933SYb {
    public final PointF A00;
    public final PointF A01;
    public final PointF A02;

    public final String toString() {
        PointF pointF = this.A02;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.A00;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.A01;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C62933SYb(PointF pointF, PointF pointF2, PointF pointF3) {
        this.A00 = pointF;
        this.A01 = pointF2;
        this.A02 = pointF3;
    }

    public C62933SYb() {
        this.A00 = new PointF();
        this.A01 = new PointF();
        this.A02 = new PointF();
    }
}
