package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.65Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65Z {
    public final C65a[] A09 = new C65a[4];
    public final Matrix[] A07 = new Matrix[4];
    public final Matrix[] A08 = new Matrix[4];
    public final PointF A03 = new PointF();
    public final Path A02 = new Path();
    public final Path A00 = new Path();
    public final C65a A04 = new C65a();
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final Path A01 = new Path();
    public final Path A0A = new Path();

    private boolean A00(Path path, int i) {
        Path path2 = this.A0A;
        path2.reset();
        this.A09[i].A04(this.A07[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[EDGE_INSN: B:37:0x00c8->B:38:0x00c8 BREAK  A[LOOP:0: B:2:0x001e->B:36:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Path r29, android.graphics.RectF r30, X.C65Q r31, X.InterfaceC1343365c r32, float r33) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65Z.A01(android.graphics.Path, android.graphics.RectF, X.65Q, X.65c, float):void");
    }

    public C65Z() {
        int i = 0;
        do {
            this.A09[i] = new C65a();
            this.A07[i] = new Matrix();
            this.A08[i] = new Matrix();
            i++;
        } while (i < 4);
    }
}
