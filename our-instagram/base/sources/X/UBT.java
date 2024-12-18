package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.maps.raster.IgRasterMapView;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes11.dex */
public final class UBT extends FrameLayout {
    public XC2 A00;
    public C70397WTz A01;
    public MapOptions A02;
    public ULZ A03;
    public boolean A04;
    public X7W A05;
    public UserSession A06;
    public final MapOptions A07;
    public final Queue A08;

    public final void A05(UserSession userSession) {
        int intValue;
        C14360o3.A0B(userSession, 0);
        this.A06 = userSession;
        this.A03 = new ULZ(AbstractC166997dE.A0L(this));
        VY0.A00 = new WU1(userSession);
        MapOptions mapOptions = this.A07;
        if (mapOptions.A05 == EnumC68183VFb.MAPBOX) {
            mapOptions.A05 = EnumC68183VFb.FACEBOOK;
        }
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C0w9 c0w9 = C0w9.A01;
        this.A01 = new C70397WTz(this, c0w9, new C69374VmK(c0w9, c006802i), c006802i, new UserFlowLoggerImpl(c006802i));
        synchronized (MapboxTTRC.class) {
            C69374VmK c69374VmK = MapboxTTRC.sTTRCTraceProvider;
            QuickPerformanceLogger quickPerformanceLogger = c69374VmK.A04;
            C103284l3 c103284l3 = c69374VmK.A02;
            InterfaceC103334l8 interfaceC103334l8 = c69374VmK.A00;
            InterfaceC103314l6 interfaceC103314l6 = c69374VmK.A01;
            synchronized (c69374VmK) {
                try {
                    Map map = c69374VmK.A05;
                    Integer num = (Integer) map.get(19152862);
                    if (num == null) {
                        AbstractC37301Gc2.A1T(19152862, map, 1);
                    } else {
                        AbstractC37301Gc2.A1T(19152862, map, num.intValue() + 1);
                    }
                    intValue = ((Integer) map.get(19152862)).intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            long now = c69374VmK.A03.now();
            AbstractC167027dH.A0a(1, quickPerformanceLogger, c103284l3, interfaceC103334l8, interfaceC103314l6);
            U3t u3t = new U3t(interfaceC103334l8, interfaceC103314l6, c103284l3, quickPerformanceLogger, null, 19152862, intValue, now, -1L, false, true);
            c103284l3.A00(u3t);
            try {
                InterfaceC72008XEw interfaceC72008XEw = MapboxTTRC.sTTRCTrace;
                if (interfaceC72008XEw != null) {
                    interfaceC72008XEw.AUk("trace in progress already");
                    MapboxTTRC.sFbErrorReporter.EmN("MapboxTTRC", "trace in progress already");
                    MapboxTTRC.clearTrace();
                }
                MapboxTTRC.sTTRCTrace = u3t;
                u3t.AAO("style_loaded");
                MapboxTTRC.sTTRCTrace.AAO("map_rendered");
            } catch (Throwable th2) {
            }
        }
    }

    public final void A00() {
        C70397WTz c70397WTz = this.A01;
        if (c70397WTz != null) {
            MapboxTTRC.cancel("maps_perf_logger_on_destroy");
            VJ6 vj6 = c70397WTz.A0A;
            UserFlowLogger userFlowLogger = vj6.A01;
            if (userFlowLogger != null) {
                userFlowLogger.flowEndSuccess(vj6.A00);
            }
            vj6.A01 = null;
            c70397WTz.A05.removeCallbacksAndMessages(null);
        }
    }

    public final void A01() {
        this.A00.getClass();
        this.A01.getClass();
        this.A01.A09.A00(19136515);
        this.A01.A00(19136515);
    }

    public final void A02() {
        this.A00.getClass();
        this.A01.getClass();
        this.A01.A09.A00(19136514);
        this.A01.A00(19136514);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A03(Bundle bundle) {
        MapOptions mapOptions = this.A02;
        if (mapOptions != null) {
            C70397WTz c70397WTz = this.A01;
            if (c70397WTz != null) {
                EnumC68183VFb enumC68183VFb = mapOptions.A05;
                String str = mapOptions.A08;
                if (str != null && !str.isEmpty()) {
                    if (enumC68183VFb != EnumC68183VFb.UNKNOWN) {
                        c70397WTz.A01 = enumC68183VFb;
                        String obj = enumC68183VFb.toString();
                        String str2 = mapOptions.A08;
                        String str3 = mapOptions.A06;
                        boolean A1R = AbstractC167007dF.A1R(0, obj, str2);
                        boolean contains = VYC.A00.contains(str2);
                        synchronized (MapboxTTRC.class) {
                            InterfaceC72008XEw interfaceC72008XEw = MapboxTTRC.sTTRCTrace;
                            if (interfaceC72008XEw != null) {
                                if (contains) {
                                    interfaceC72008XEw.AAO("midgard_data_done");
                                }
                                MarkerEditor FEA = MapboxTTRC.sTTRCTrace.FEA();
                                FEA.point("map_code_start");
                                FEA.annotate("surface", str2);
                                FEA.annotate(CacheBehaviorLogger.SOURCE, obj);
                                if (str3 == null) {
                                    str3 = "unset";
                                }
                                FEA.annotate(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
                                FEA.markerEditingCompleted();
                            }
                        }
                        C69598Vs1 c69598Vs1 = c70397WTz.A09;
                        c69598Vs1.A00 = obj;
                        c69598Vs1.A01 = str2;
                        VJ6 vj6 = c70397WTz.A0A;
                        UserFlowLogger userFlowLogger = vj6.A01;
                        if (userFlowLogger != null) {
                            long generateNewFlowId = userFlowLogger.generateNewFlowId(19146604);
                            vj6.A00 = generateNewFlowId;
                            userFlowLogger.flowStart(generateNewFlowId, new UserFlowConfig.UserFlowConfigBuilder(str2, false).build());
                            UserFlowLogger userFlowLogger2 = vj6.A01;
                            if (userFlowLogger2 != null) {
                                userFlowLogger2.flowAnnotate(vj6.A00, CacheBehaviorLogger.SOURCE, obj);
                            }
                            UserFlowLogger userFlowLogger3 = vj6.A01;
                            if (userFlowLogger3 != null) {
                                userFlowLogger3.flowAnnotate(vj6.A00, "surface", str2);
                            }
                        }
                        c69598Vs1.A00(19136523);
                        this.A01.A09.A00(19136513);
                        try {
                            this.A01.getClass();
                            MapOptions mapOptions2 = this.A07;
                            if (mapOptions2.A05 == EnumC68183VFb.FACEBOOK) {
                                if (mapOptions2.A06 == null) {
                                    mapOptions2.A06 = "IgMapViewDelegate.java";
                                }
                                double d = C66356UBx.A0p;
                                Context A0L = AbstractC166997dE.A0L(this);
                                W3L w3l = new W3L();
                                w3l.A04 = mapOptions2.A04;
                                w3l.A07 = mapOptions2.A09;
                                w3l.A02 = mapOptions2.A02;
                                w3l.A09 = mapOptions2.A0D;
                                w3l.A0A = mapOptions2.A0E;
                                w3l.A0B = mapOptions2.A0G;
                                w3l.A0C = mapOptions2.A0H;
                                w3l.A0D = mapOptions2.A0I;
                                w3l.A0E = mapOptions2.A0J;
                                w3l.A00 = mapOptions2.A00;
                                w3l.A01 = mapOptions2.A01;
                                w3l.A06 = mapOptions2.A08;
                                String str4 = mapOptions2.A06;
                                if (str4 != null && str4.length() > 0) {
                                    w3l.A05 = str4;
                                }
                                w3l.A03 = mapOptions2.A03;
                                w3l.A08 = mapOptions2.A0A;
                                IgRasterMapView igRasterMapView = new IgRasterMapView(A0L, w3l);
                                this.A00 = igRasterMapView;
                                igRasterMapView.D7y(bundle);
                                XC2 xc2 = this.A00;
                                xc2.setMapEventHandler(this.A01);
                                addView((View) xc2);
                                if (!this.A04) {
                                    AbstractC43593JPy.A1Q(this.A00);
                                }
                                A04(new WWl(this, A1R ? 1 : 0));
                                return;
                            }
                            throw new IllegalStateException("Unsupported renderer");
                        } finally {
                            this.A01.A00(19136513);
                        }
                    }
                    throw new IllegalArgumentException("Must set a renderer in MapOptions");
                }
                throw new IllegalArgumentException("Must set a surface in MapOptions");
            }
            throw new IllegalStateException("Must call setMapLogger() before onCreate()");
        }
        throw new IllegalStateException("Must provide map options before onCreate()");
    }

    public final void A04(X9E x9e) {
        XC2 xc2 = this.A00;
        if (xc2 != null) {
            IgRasterMapView igRasterMapView = (IgRasterMapView) xc2;
            igRasterMapView.A0F(new C70388WTq(x9e, igRasterMapView));
        } else {
            this.A08.add(x9e);
        }
    }

    public C70397WTz getMapLogger() {
        C70397WTz c70397WTz = this.A01;
        if (c70397WTz != null) {
            return c70397WTz;
        }
        throw new IllegalStateException("Must call setMapLogger() before getMapLogger()");
    }

    public VCR getMapType() {
        this.A02.getClass();
        if (this.A02.A05 == EnumC68183VFb.MAPBOX) {
            return VCR.A02;
        }
        return VCR.A01;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        Object obj = this.A00;
        if (obj != null) {
            this.A04 = AbstractC167007dF.A1N(((View) obj).getVisibility());
        }
        return this.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.A04 = z;
        XC2 xc2 = this.A00;
        if (xc2 != null) {
            ((View) xc2).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public UBT(Context context, MapOptions mapOptions) {
        super(context);
        this.A08 = new LinkedList();
        this.A04 = true;
        this.A02 = mapOptions;
        this.A07 = mapOptions;
    }

    public Locale getDeviceLocale() {
        return C1Q2.A02();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setMapOptions(MapOptions mapOptions) {
        this.A02 = mapOptions;
    }

    public void setOnInterceptTouchEventListener(X7W x7w) {
        this.A05 = x7w;
    }
}
