package X;

import android.graphics.Point;
import com.facebook.android.maps.model.LatLng;

/* loaded from: classes11.dex */
public final class W48 {
    public final C70394WTw A00;

    public final LatLng A00(float f, float f2) {
        WFW wfw = this.A00.A0J;
        Point point = new Point((int) f, (int) f2);
        return wfw.A04(point.x, point.y);
    }

    public W48(C70394WTw c70394WTw) {
        this.A00 = c70394WTw;
    }

    public W48() {
    }
}
