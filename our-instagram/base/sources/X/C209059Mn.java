package X;

import android.graphics.Point;

/* renamed from: X.9Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209059Mn {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C209059Mn) && this.A00 == ((C209059Mn) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("LimitHeight(limitHeight=", ')', this.A00);
    }

    public final Point A00(Point point) {
        int i = point.y;
        if (i != 0) {
            int i2 = this.A00;
            return new Point((point.x * i2) / i, i2);
        }
        return point;
    }

    public C209059Mn(int i) {
        this.A00 = i;
    }
}
