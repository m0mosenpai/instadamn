package X;

import android.graphics.Point;

/* renamed from: X.82e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812782e implements InterfaceC1812882f {
    public final int A00;
    public final int A01;

    @Override // X.InterfaceC1812882f
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC1812882f
    public final int getWidth() {
        return this.A01;
    }

    public C1812782e(int i, int i2) {
        int i3;
        if (i / i2 < 0.5625f) {
            i3 = i / 9;
        } else {
            i3 = i2 / 16;
        }
        i3 = i3 % 2 != 0 ? i3 - 1 : i3;
        int i4 = i3 * 9;
        int i5 = i3 * 16;
        if (i4 / i5 == 0.5625f) {
            Point point = new Point(i4, i5);
            this.A01 = point.x;
            this.A00 = point.y;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
