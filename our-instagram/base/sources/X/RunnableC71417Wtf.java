package X;

import android.util.Pair;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.maps.ttrc.common.MapboxTTRC;

/* renamed from: X.Wtf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71417Wtf implements Runnable {
    public final /* synthetic */ C69271Vkf A00;
    public final /* synthetic */ C70397WTz A01;

    public RunnableC71417Wtf(C69271Vkf c69271Vkf, C70397WTz c70397WTz) {
        this.A01 = c70397WTz;
        this.A00 = c69271Vkf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WFW wfw = this.A00.A01.A0J;
        C66356UBx c66356UBx = wfw.A00.A0I;
        LatLng A04 = wfw.A04(0.0f, c66356UBx.A0E);
        LatLng A042 = wfw.A04(c66356UBx.A0G, c66356UBx.A0E);
        LatLng A043 = wfw.A04(0.0f, 0.0f);
        LatLng A044 = wfw.A04(c66356UBx.A0G, 0.0f);
        W52 w52 = new W52();
        w52.A02(A04);
        w52.A02(A043);
        w52.A02(A042);
        w52.A02(A044);
        LatLngBounds A01 = w52.A01();
        C70397WTz c70397WTz = this.A01;
        c70397WTz.A00.getClass();
        float f = c70397WTz.A00.A01.A02().A02;
        LatLng latLng = A01.A00;
        double d = latLng.A00;
        LatLng latLng2 = A01.A01;
        double d2 = latLng2.A00;
        double d3 = latLng.A01;
        double d4 = latLng2.A01;
        double d5 = f;
        synchronized (MapboxTTRC.class) {
            if (MapboxTTRC.sTTRCTrace != null) {
                int floor = (int) Math.floor(d5);
                Pair projectCoordinateToTile = MapboxTTRC.projectCoordinateToTile(d, d4, floor);
                Pair projectCoordinateToTile2 = MapboxTTRC.projectCoordinateToTile(d2, d3, floor);
                long floor2 = ((((int) Math.floor(((Double) projectCoordinateToTile2.second).doubleValue())) - ((int) Math.floor(((Double) projectCoordinateToTile.second).doubleValue()))) + 1) * ((((int) Math.floor(((Double) projectCoordinateToTile2.first).doubleValue())) - ((int) Math.floor(((Double) projectCoordinateToTile.first).doubleValue()))) + 1);
                if (floor2 < 1 || floor2 > 9) {
                    MapboxTTRC.sFbErrorReporter.EmN("MapboxTTRC", AnonymousClass001.A0Q("Bad expected tile count ", floor2));
                    MapboxTTRC.sTTRCTrace.CnU("midgard_tile_error", true);
                    floor2 = 1;
                }
                C69373VmJ c69373VmJ = MapboxTTRC.sMidgardRequestTracker;
                c69373VmJ.A00 = (int) floor2;
                c69373VmJ.A02 = floor;
                MapboxTTRC.sTTRCTrace.CnS("midgard_request_count", floor2);
            }
        }
    }
}
