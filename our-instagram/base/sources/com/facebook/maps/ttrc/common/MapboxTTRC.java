package com.facebook.maps.ttrc.common;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC37301Gc2;
import X.AnonymousClass001;
import X.C0Gd;
import X.C69373VmJ;
import X.C69374VmK;
import X.C69564VrT;
import X.InterfaceC72008XEw;
import X.RunnableC71202Wpr;
import X.VG9;
import android.util.Pair;
import com.facebook.quicklog.MarkerEditor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class MapboxTTRC {
    public static C0Gd sFbErrorReporter = null;
    public static MapboxTTRC sInstance = null;
    public static int sStyleImageMissingCount = 1;
    public static InterfaceC72008XEw sTTRCTrace = null;
    public static C69374VmK sTTRCTraceProvider = null;
    public static int sUncategorizedResponseCount = 0;
    public static int sUnknownEndMarkerId = 900;
    public static final Map mSeenUrls = new HashMap();
    public static final C69564VrT sMidgardRequests = new C69564VrT();
    public static final C69373VmJ sMidgardRequestTracker = new C69373VmJ(new RunnableC71202Wpr());

    public static Pair projectCoordinateToTile(double d, double d2, int i) {
        double d3 = 1 << i;
        return new Pair(Double.valueOf(((d2 + 180.0d) * d3) / 360.0d), Double.valueOf(((180.0d - (Math.log(Math.tan(((Math.max(-85.0511287798066d, Math.min(85.0511287798066d, d)) * 3.141592653589793d) / 360.0d) + 0.7853981633974483d)) * 57.29577951308232d)) * d3) / 360.0d));
    }

    public static synchronized void cancel(String str) {
        synchronized (MapboxTTRC.class) {
            InterfaceC72008XEw interfaceC72008XEw = sTTRCTrace;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.Ch8(str);
            }
            clearTrace();
        }
    }

    public static synchronized void clearTrace() {
        synchronized (MapboxTTRC.class) {
            mSeenUrls.clear();
            C69564VrT c69564VrT = sMidgardRequests;
            c69564VrT.A02.clear();
            c69564VrT.A00 = 0;
            c69564VrT.A01 = 0;
            sStyleImageMissingCount = 1;
            C69373VmJ c69373VmJ = sMidgardRequestTracker;
            c69373VmJ.A02 = -1;
            c69373VmJ.A06.clear();
            c69373VmJ.A00 = 0;
            c69373VmJ.A01 = 0;
            c69373VmJ.A03 = false;
            sUncategorizedResponseCount = 0;
            sTTRCTrace = null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.maps.ttrc.common.MapboxTTRC, java.lang.Object] */
    public static synchronized void initialize(C0Gd c0Gd, C69374VmK c69374VmK) {
        synchronized (MapboxTTRC.class) {
            if (sInstance == null) {
                ?? obj = new Object();
                sTTRCTraceProvider = c69374VmK;
                sFbErrorReporter = c0Gd;
                for (VG9 vg9 : VG9.values()) {
                    mSeenUrls.put(vg9, new C69564VrT());
                }
                sInstance = obj;
            }
        }
    }

    public static synchronized void onMapRendered() {
        synchronized (MapboxTTRC.class) {
            InterfaceC72008XEw interfaceC72008XEw = sTTRCTrace;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.CnR("uncat_unrequested_resp_count", sUncategorizedResponseCount);
                Iterator A15 = AbstractC166997dE.A15(mSeenUrls);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    sTTRCTrace.CnR(AnonymousClass001.A0g(((VG9) entry.getKey()).A00, "_", "unrequested_resp_count"), ((C69564VrT) entry.getValue()).A01);
                }
                sTTRCTrace.CnR("midgard_unrequested_resp_count", sMidgardRequests.A01);
                sTTRCTrace.EoN("map_rendered");
            }
        }
    }

    public static synchronized void onMidgardRequest(String str, int i, int i2, int i3, String str2) {
        int i4;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C69564VrT c69564VrT = sMidgardRequests;
                Map map = c69564VrT.A02;
                if (!map.containsKey(str) && (i4 = c69564VrT.A00) <= 20) {
                    int i5 = i4 + 1;
                    c69564VrT.A00 = i5;
                    AbstractC37301Gc2.A1T(str, map, i5);
                }
                C69373VmJ c69373VmJ = sMidgardRequestTracker;
                InterfaceC72008XEw interfaceC72008XEw = sTTRCTrace;
                if (!c69373VmJ.A03) {
                    if (c69373VmJ.A02 == -1) {
                        interfaceC72008XEw.CnU("zoom_invalid", true);
                        c69373VmJ.A05.run();
                        c69373VmJ.A03 = true;
                    }
                    if (i == c69373VmJ.A02) {
                        Set set = c69373VmJ.A06;
                        if (!set.contains(str)) {
                            set.add(str);
                        }
                    }
                }
                String A0O = AnonymousClass001.A0O("midgard_request_", c69564VrT.A00(str));
                MarkerEditor FEA = sTTRCTrace.FEA();
                FEA.point(AnonymousClass001.A0g(A0O, "_", "begin"));
                FEA.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onMidgardResponse(String str, int i, int i2, int i3) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C69564VrT c69564VrT = sMidgardRequests;
                if (!c69564VrT.A02.containsKey(str)) {
                    c69564VrT.A01++;
                }
                C69373VmJ c69373VmJ = sMidgardRequestTracker;
                if (!c69373VmJ.A03) {
                    Set set = c69373VmJ.A06;
                    if (set.contains(str)) {
                        int i4 = c69373VmJ.A01 + 1;
                        c69373VmJ.A01 = i4;
                        if (i4 == c69373VmJ.A00) {
                            c69373VmJ.A05.run();
                            c69373VmJ.A03 = true;
                        } else {
                            set.remove(str);
                        }
                    }
                }
                String A0O = AnonymousClass001.A0O("midgard_request_", c69564VrT.A00(str));
                MarkerEditor FEA = sTTRCTrace.FEA();
                FEA.point(AnonymousClass001.A0g(A0O, "_", "end"));
                FEA.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onUrlRequest(int i, int i2, String str, String str2) {
        int i3;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                VG9 A00 = VG9.A00(i2);
                if (A00 == VG9.STYLE) {
                    sTTRCTrace.CnT("style_url", str);
                    sTTRCTrace.CnU("using_facebook_tiles", AbstractC167007dF.A1N(str.toLowerCase(Locale.US).contains("mapbox") ? 1 : 0));
                }
                Map map = mSeenUrls;
                C69564VrT c69564VrT = (C69564VrT) map.get(A00);
                if (c69564VrT == null) {
                    c69564VrT = new C69564VrT();
                    map.put(A00, c69564VrT);
                }
                Map map2 = c69564VrT.A02;
                if (!map2.containsKey(str) && (i3 = c69564VrT.A00) <= 20) {
                    int i4 = i3 + 1;
                    c69564VrT.A00 = i4;
                    AbstractC37301Gc2.A1T(str, map2, i4);
                }
                String A0o = AnonymousClass001.A0o(A00.A00, "_", "_", c69564VrT.A00(str), i);
                MarkerEditor FEA = sTTRCTrace.FEA();
                FEA.point(AnonymousClass001.A0g(A0o, "_", "begin"));
                FEA.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onUrlResponse(int i, int i2, String str, boolean z, int i3) {
        int i4;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C69564VrT c69564VrT = (C69564VrT) mSeenUrls.get(VG9.A00(i2));
                if (c69564VrT != null) {
                    i4 = c69564VrT.A00(str);
                    if (!c69564VrT.A02.containsKey(str)) {
                        c69564VrT.A01++;
                    }
                    if (i4 == 999) {
                    }
                    String A0o = AnonymousClass001.A0o(VG9.A00(i2).A00, "_", "_", i4, i);
                    MarkerEditor FEA = sTTRCTrace.FEA();
                    FEA.point(AnonymousClass001.A0g(A0o, "_", "end"));
                    FEA.annotate(AnonymousClass001.A0g(A0o, "_", "cached"), z);
                    FEA.annotate(AnonymousClass001.A0g(A0o, "_", "size"), i3);
                    FEA.markerEditingCompleted();
                    VG9.A00(i2);
                } else {
                    sUncategorizedResponseCount++;
                }
                i4 = sUnknownEndMarkerId;
                sUnknownEndMarkerId = i4 + 1;
                String A0o2 = AnonymousClass001.A0o(VG9.A00(i2).A00, "_", "_", i4, i);
                MarkerEditor FEA2 = sTTRCTrace.FEA();
                FEA2.point(AnonymousClass001.A0g(A0o2, "_", "end"));
                FEA2.annotate(AnonymousClass001.A0g(A0o2, "_", "cached"), z);
                FEA2.annotate(AnonymousClass001.A0g(A0o2, "_", "size"), i3);
                FEA2.markerEditingCompleted();
                VG9.A00(i2);
            }
        }
    }
}
