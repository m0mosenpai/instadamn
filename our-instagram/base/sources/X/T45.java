package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T45 implements InterfaceC65396TjT {
    public final SGG A00;
    public final SEF A01;
    public final Map A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // X.InterfaceC65396TjT
    public final synchronized InterfaceC65397TjU AXF(String str) {
        String format;
        InterfaceC65397TjU t46;
        ?? r11;
        PackageManager packageManager;
        Map map = this.A02;
        if (map.containsKey(str)) {
            t46 = (InterfaceC65397TjU) map.get(str);
        } else {
            SEF sef = this.A01;
            Map map2 = sef.A00;
            Map map3 = map2;
            if (map2 == null) {
                Context context = sef.A01;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                    android.util.Log.w("BackendRegistry", "Application info not found.");
                }
                if (packageManager == null) {
                    android.util.Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        android.util.Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        Bundle bundle = ((PackageItemInfo) serviceInfo).metaData;
                        if (bundle != null) {
                            r11 = AbstractC166987dD.A1G();
                            Iterator A14 = AbstractC58319PtB.A14(bundle);
                            while (A14.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(A14);
                                Object obj = bundle.get(A1B);
                                if ((obj instanceof String) && A1B.startsWith("backend:")) {
                                    String[] split = ((String) obj).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
                                    for (String str2 : split) {
                                        String trim = str2.trim();
                                        if (!trim.isEmpty()) {
                                            r11.put(trim, A1B.substring(8));
                                        }
                                    }
                                }
                            }
                            sef.A00 = r11;
                            map3 = r11;
                        }
                    }
                }
                android.util.Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                r11 = Collections.emptyMap();
                sef.A00 = r11;
                map3 = r11;
            }
            String A1A = AbstractC166987dD.A1A(str, map3);
            if (A1A != null) {
                try {
                    if (((InterfaceC65240TgW) AbstractC58320PtC.A0t(Class.forName(A1A).asSubclass(InterfaceC65240TgW.class))) != null) {
                        SGG sgg = this.A00;
                        Context context2 = sgg.A00;
                        InterfaceC65401TjY interfaceC65401TjY = sgg.A02;
                        InterfaceC65401TjY interfaceC65401TjY2 = sgg.A01;
                        if (context2 != null) {
                            if (interfaceC65401TjY != null) {
                                if (interfaceC65401TjY2 != null) {
                                    if (str != null) {
                                        t46 = new T46(context2, interfaceC65401TjY, interfaceC65401TjY2);
                                        map.put(str, t46);
                                    } else {
                                        throw AbstractC166987dD.A15("Null backendName");
                                    }
                                } else {
                                    throw AbstractC166987dD.A15("Null monotonicClock");
                                }
                            } else {
                                throw AbstractC166987dD.A15("Null wallClock");
                            }
                        } else {
                            throw AbstractC166987dD.A15("Null applicationContext");
                        }
                    }
                } catch (ClassNotFoundException e) {
                    e = e;
                    format = String.format("Class %s is not found.", A1A);
                    android.util.Log.w("BackendRegistry", format, e);
                    t46 = null;
                    return t46;
                } catch (IllegalAccessException | InstantiationException e2) {
                    e = e2;
                    format = String.format("Could not instantiate %s.", A1A);
                    android.util.Log.w("BackendRegistry", format, e);
                    t46 = null;
                    return t46;
                } catch (NoSuchMethodException | InvocationTargetException e3) {
                    e = e3;
                    format = String.format("Could not instantiate %s", A1A);
                    android.util.Log.w("BackendRegistry", format, e);
                    t46 = null;
                    return t46;
                }
            }
            t46 = null;
        }
        return t46;
    }

    public T45(Context context, SGG sgg) {
        SEF sef = new SEF(context);
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = sef;
        this.A00 = sgg;
    }
}
