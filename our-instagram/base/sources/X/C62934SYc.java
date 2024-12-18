package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.SYc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62934SYc {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public C62934SYc(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = AbstractC166987dD.A1F(list);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShapeData{numCurves=");
        A1C.append(this.A02.size());
        A1C.append("closed=");
        A1C.append(this.A01);
        return AbstractC167027dH.A0R(A1C);
    }

    public C62934SYc() {
        this.A02 = AbstractC166987dD.A1E();
    }
}
