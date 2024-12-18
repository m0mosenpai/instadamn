package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.maps.raster.IgRasterMapView;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WWl implements X9E {
    public final int A00;
    public final Object A01;

    public WWl(UBT ubt, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = ubt;
        } else {
            this.A01 = ubt;
        }
    }

    @Override // X.X9E
    public final void DR3(C69271Vkf c69271Vkf) {
        switch (this.A00) {
            case 0:
                IgRasterMapView igRasterMapView = (IgRasterMapView) this.A01;
                C70394WTw c70394WTw = c69271Vkf.A01;
                VGB vgb = igRasterMapView.A0N.A03;
                AbstractC167017dG.A1N(c70394WTw, vgb);
                Context context = igRasterMapView.getContext();
                Drawable drawable = context.getDrawable(R.drawable.instagram_info_filled_16);
                if (drawable != null) {
                    ULU ulu = new ULU(drawable, c70394WTw, vgb, new ULZ(context));
                    igRasterMapView.A00 = ulu;
                    W55 w55 = igRasterMapView.A01;
                    if (w55 != null) {
                        ulu.A01 = w55;
                    }
                    c70394WTw.A0A(ulu);
                    ulu.A09(igRasterMapView.A03);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 1:
                UBT ubt = (UBT) this.A01;
                ubt.A01.getClass();
                C70397WTz c70397WTz = ubt.A01;
                c70397WTz.A01.getClass();
                c70397WTz.A00 = c69271Vkf;
                VJ6 vj6 = c70397WTz.A0A;
                UserFlowLogger userFlowLogger = vj6.A01;
                if (userFlowLogger != null) {
                    userFlowLogger.flowMarkPoint(vj6.A00, "map_ready");
                }
                if (c70397WTz.A01 == EnumC68183VFb.MAPBOX) {
                    c70397WTz.A05.postAtFrontOfQueue(new RunnableC71417Wtf(c69271Vkf, c70397WTz));
                    throw new UnsupportedOperationException("Facebook map doesn't support on start move listener");
                }
                ArrayList arrayList = c69271Vkf.A00;
                if (arrayList == null) {
                    MapboxTTRC.onMapRendered();
                } else {
                    arrayList.add(c70397WTz);
                }
                synchronized (MapboxTTRC.class) {
                    InterfaceC72008XEw interfaceC72008XEw = MapboxTTRC.sTTRCTrace;
                    if (interfaceC72008XEw != null) {
                        interfaceC72008XEw.EoN("style_loaded");
                    }
                }
                C70394WTw c70394WTw2 = c69271Vkf.A01;
                c70394WTw2.A0N.add(new C70379WTh(c69271Vkf, c70397WTz, 1));
                while (true) {
                    X9E x9e = (X9E) ubt.A08.poll();
                    if (x9e == null) {
                        return;
                    } else {
                        x9e.DR3(c69271Vkf);
                    }
                }
            case 2:
                V07 v07 = (V07) this.A01;
                C14360o3.A0A(c69271Vkf);
                v07.A05(c69271Vkf);
                return;
            case 3:
                C69800Vvm c69800Vvm = (C69800Vvm) this.A01;
                c69800Vvm.A00 = c69271Vkf;
                C70394WTw c70394WTw3 = c69271Vkf.A01;
                c69800Vvm.A01 = new C69717VuC(c69800Vvm.A02, c69271Vkf, c69800Vvm.A04.getMapLogger(), c69800Vvm.A05, c69800Vvm.A06);
                c69800Vvm.A03.DR4(c69800Vvm);
                c69271Vkf.A02.add(new C70457WWk(c69800Vvm));
                C70379WTh c70379WTh = new C70379WTh(c69271Vkf, new C70454WWh(c69800Vvm), 1);
                ArrayList arrayList2 = c70394WTw3.A0N;
                arrayList2.add(c70379WTh);
                arrayList2.add(new C70379WTh(c69271Vkf, new C70455WWi(c70394WTw3, c69800Vvm), 0));
                return;
            case 4:
                CameraPosition A02 = c69271Vkf.A01.A02();
                StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("dynamic_map_report_button");
                staticMapView$StaticMapOptions.A04 = "IgMapViewDelegate.java";
                LatLng latLng = A02.A03;
                StringBuilder sb = new StringBuilder();
                sb.append(latLng.A00);
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                sb.append(latLng.A01);
                staticMapView$StaticMapOptions.A02 = sb.toString();
                staticMapView$StaticMapOptions.A03((int) A02.A02);
                UBT ubt2 = (UBT) this.A01;
                int width = ubt2.getWidth();
                int height = ubt2.getHeight();
                Context context2 = ubt2.getContext();
                android.net.Uri A00 = IgStaticMapView.A00(context2.getResources(), staticMapView$StaticMapOptions, C2TD.A03, width, height);
                C14360o3.A07(A00);
                ULZ ulz = ubt2.A03;
                if (ulz == null) {
                    C14360o3.A0F("mapReporterLauncher");
                    throw C00O.createAndThrow();
                }
                ulz.A01(context2, A00);
                return;
            default:
                return;
        }
    }

    public WWl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
