package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139446Sz {
    public static final C139446Sz A00 = new Object();
    public static final Map A01 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();
    public static final Map A03 = new LinkedHashMap();

    public static final int A00(String str, int i, int i2) {
        Number number;
        Map map = (Map) A01.get(new C9B2(i, i2, 0));
        if (map != null && (number = (Number) map.get(str)) != null) {
            return number.intValue();
        }
        return 0;
    }

    public static final void A01(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        Map map = (Map) A01.get(new C9B2(i, i2, 0));
        if (map != null) {
            Number number = (Number) map.get(str);
            if (number != null) {
                i3 = number.intValue();
            } else {
                i3 = 0;
            }
            map.put(str, Integer.valueOf(i3 + 1));
            quickPerformanceLogger.markerPoint(i, i2, str, str2, j, timeUnit);
        }
    }

    public static final void A02(QuickPerformanceLogger quickPerformanceLogger, String str, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        Map map = (Map) A01.get(new C9B2(i, i2, 0));
        if (map != null) {
            Number number = (Number) map.get(str);
            if (number != null) {
                i3 = number.intValue();
            } else {
                i3 = 0;
            }
            map.put(str, Integer.valueOf(i3 + 1));
            quickPerformanceLogger.markerPoint(i, i2, str, j, timeUnit);
        }
    }

    public static final void A03(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j) {
        C9B2 c9b2 = new C9B2(i, i2, 0);
        Map map2 = A01;
        if (!map2.containsKey(c9b2)) {
            map2.put(c9b2, new LinkedHashMap());
            quickPerformanceLogger.markerStart(i, i2, j, timeUnit);
            for (Map.Entry entry : map.entrySet()) {
                quickPerformanceLogger.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static final void A04(QuickPerformanceLogger quickPerformanceLogger, Map map, TimeUnit timeUnit, int i, int i2, long j, short s) {
        C9B2 c9b2 = new C9B2(i, i2, 0);
        Map map2 = A01;
        if (map2.containsKey(c9b2)) {
            for (Map.Entry entry : map.entrySet()) {
                quickPerformanceLogger.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
            }
            quickPerformanceLogger.markerEnd(i, i2, s, j, timeUnit);
            map2.remove(c9b2);
        }
    }

    public final void A05(QuickPerformanceLogger quickPerformanceLogger, AbstractC139906Uu abstractC139906Uu, TimeUnit timeUnit, int i, int i2, long j) {
        int i3;
        Map map = (Map) A01.get(new C9B2(i, i2, 0));
        if (map != null) {
            InterfaceC09390do interfaceC09390do = abstractC139906Uu.A06;
            Object value = interfaceC09390do.getValue();
            int i4 = 0;
            if (value != null && ((Boolean) abstractC139906Uu.A04.getValue()).booleanValue()) {
                Map map2 = A03;
                Number number = (Number) map2.get(value);
                if (number != null) {
                    Map map3 = A02;
                    AbstractC139906Uu abstractC139906Uu2 = (AbstractC139906Uu) map3.get(interfaceC09390do.getValue());
                    if ((((Boolean) abstractC139906Uu.A03.getValue()).booleanValue() && abstractC139906Uu2 != null && ((Boolean) abstractC139906Uu2.A05.getValue()).booleanValue()) || (((Boolean) abstractC139906Uu.A05.getValue()).booleanValue() && abstractC139906Uu2 != null && ((Boolean) abstractC139906Uu2.A03.getValue()).booleanValue())) {
                        map3.remove(value);
                        map2.remove(value);
                        i3 = number.intValue();
                    }
                }
                InterfaceC09390do interfaceC09390do2 = abstractC139906Uu.A02;
                Number number2 = (Number) map.get(interfaceC09390do2.getValue());
                if (number2 != null) {
                    i4 = number2.intValue();
                }
                i3 = i4 + 1;
                Integer valueOf = Integer.valueOf(i3);
                map.put(interfaceC09390do2.getValue(), valueOf);
                A02.put(value, abstractC139906Uu);
                map2.put(value, valueOf);
            } else {
                InterfaceC09390do interfaceC09390do3 = abstractC139906Uu.A02;
                Number number3 = (Number) map.get(interfaceC09390do3.getValue());
                if (number3 != null) {
                    i4 = number3.intValue();
                }
                i3 = i4 + 1;
                map.put(interfaceC09390do3.getValue(), Integer.valueOf(i3));
            }
            String A0d = AbstractC002300n.A0d(abstractC139906Uu.A00, "#", String.valueOf(i3), false);
            C0XJ c0xj = new C0XJ();
            for (Map.Entry entry : abstractC139906Uu.A01.entrySet()) {
                c0xj.A00((String) entry.getKey(), (String) entry.getValue(), 1);
            }
            quickPerformanceLogger.markerPoint(i, i2, 7, A0d, c0xj, j, timeUnit, 0);
        }
    }
}
