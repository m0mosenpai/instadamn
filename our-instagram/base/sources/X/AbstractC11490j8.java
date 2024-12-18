package X;

import android.util.Pair;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.0j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11490j8 {
    public static final DateFormat A00 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    public static AnalyticsEventDebugInfo A00(C0CA c0ca) {
        AnalyticsEventDebugInfo analyticsEventDebugInfo = new AnalyticsEventDebugInfo(2);
        for (int i = 0; i < c0ca.A00; i++) {
            A05(analyticsEventDebugInfo, c0ca.A0C(i), c0ca.A0D(i));
        }
        return analyticsEventDebugInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19260xA A01(java.util.Map r5) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC11490j8.A01(java.util.Map):X.0xA");
    }

    public static C0x9 A02(Iterable iterable) {
        C0x9 c0x9 = new C0x9();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A06(c0x9, it.next());
        }
        return c0x9;
    }

    public static HashMap A03(C19260xA c19260xA) {
        Object obj;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            C11420j0 c11420j0 = c19260xA.A00;
            if (i < c11420j0.A00) {
                String A03 = c11420j0.A03(i);
                i++;
                Pair pair = new Pair(A03, c11420j0.A01(i2));
                Object obj2 = pair.second;
                if (obj2 instanceof String) {
                    obj = pair.first;
                } else if (obj2 instanceof Integer) {
                    obj = pair.first;
                    obj2 = Integer.toString(((Number) obj2).intValue());
                } else if (obj2 instanceof Double) {
                    obj = pair.first;
                    obj2 = Double.toString(((Number) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    obj = pair.first;
                    obj2 = Float.toString(((Number) obj2).floatValue());
                } else if (obj2 instanceof Long) {
                    obj = pair.first;
                    obj2 = Long.toString(((Number) obj2).longValue());
                } else if (obj2 instanceof Boolean) {
                    obj = pair.first;
                    obj2 = Boolean.toString(((Boolean) obj2).booleanValue());
                } else if ((obj2 instanceof C19260xA) || (obj2 instanceof C0x9)) {
                    obj = pair.first;
                    obj2 = obj2.toString();
                }
                hashMap.put(obj, obj2);
            } else {
                return hashMap;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.instagram.common.analytics.intf.AnalyticsEventEntry, java.lang.Object] */
    public static void A05(AnalyticsEventDebugInfo analyticsEventDebugInfo, Object obj, String str) {
        AnalyticsEventDebugInfo analyticsEventDebugInfo2;
        AnalyticsEventEntry analyticsEventEntry;
        if (obj instanceof InterfaceC11310in) {
            analyticsEventDebugInfo2 = ((InterfaceC11310in) obj).EqF();
        } else if (obj instanceof C0CA) {
            analyticsEventDebugInfo2 = A00((C0CA) obj);
        } else if (obj instanceof C0CW) {
            C0CW c0cw = (C0CW) obj;
            analyticsEventDebugInfo2 = new AnalyticsEventDebugInfo(2);
            int i = 0;
            while (true) {
                ArrayList arrayList = c0cw.A00;
                if (i >= arrayList.size()) {
                    break;
                }
                A05(analyticsEventDebugInfo2, arrayList.get(i), null);
                i++;
            }
        } else {
            analyticsEventEntry = new AnalyticsEventEntry(str, obj);
            analyticsEventDebugInfo.A01.add(analyticsEventEntry);
        }
        ?? obj2 = new Object();
        obj2.A02 = str;
        obj2.A00 = analyticsEventDebugInfo2;
        analyticsEventEntry = obj2;
        analyticsEventDebugInfo.A01.add(analyticsEventEntry);
    }

    public static void A06(C0x9 c0x9, Object obj) {
        String str;
        if (obj == null) {
            str = null;
        } else {
            if (obj instanceof InterfaceC02580Ag) {
                A06(c0x9, ((InterfaceC02580Ag) obj).F7g());
                return;
            }
            if (!(obj instanceof List)) {
                if (obj instanceof Map) {
                    obj = A01((Map) obj);
                } else if (!(obj instanceof java.util.Set)) {
                    if (!(obj instanceof String)) {
                        if (!(obj instanceof Integer)) {
                            if (!(obj instanceof Long)) {
                                if (!(obj instanceof Float)) {
                                    if (obj instanceof Double) {
                                        c0x9.A00(((Number) obj).doubleValue());
                                        return;
                                    }
                                    if (obj instanceof Boolean) {
                                        c0x9.A05(((Boolean) obj).booleanValue());
                                        return;
                                    }
                                    if (!(obj instanceof C19260xA) && !(obj instanceof C0x9)) {
                                        if (obj instanceof C0Zx) {
                                            obj = A01(((C0Zx) obj).A00);
                                        } else if (obj instanceof InterfaceC02530Ab) {
                                            obj = ((InterfaceC02530Ab) obj).getValue();
                                            if (!(obj instanceof String)) {
                                                if (!(obj instanceof Integer)) {
                                                    if (!(obj instanceof Long)) {
                                                        throw new IllegalArgumentException(AnonymousClass001.A0R("Enum type expects String, Integer or Long, but got: ", obj.toString()));
                                                    }
                                                }
                                            }
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Unknown value type: ");
                                            sb.append(obj.getClass());
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                    }
                                }
                            }
                            c0x9.A02(((Number) obj).longValue());
                            return;
                        }
                        c0x9.A01(((Number) obj).intValue());
                        return;
                    }
                    str = (String) obj;
                }
                c0x9.A00.add(obj);
                return;
            }
            obj = A02((Iterable) obj);
            c0x9.A00.add(obj);
            return;
        }
        c0x9.A04(str);
    }

    public static void A07(StringBuilder sb, String str, Object obj) {
        String obj2;
        String A0R;
        if (obj == null) {
            obj2 = "null";
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue > currentTimeMillis - 315360000000L && longValue < currentTimeMillis + 315360000000L) {
                DateFormat dateFormat = A00;
                dateFormat.setTimeZone(TimeZone.getDefault());
                obj2 = AnonymousClass001.A0u(Long.toString(longValue), " (", dateFormat.format(new Date(longValue)), ")");
            } else {
                obj2 = Long.toString(longValue);
            }
        } else if (obj instanceof C19260xA) {
            sb.append("{\n");
            ((C19260xA) obj).A0B(sb, AnonymousClass001.A0R(str, "  "));
            obj2 = "}";
        } else {
            if (obj instanceof C0x9) {
                C0x9 c0x9 = (C0x9) obj;
                A0R = AnonymousClass001.A0R(str, "  ");
                sb.append("[\n");
                int i = 0;
                while (true) {
                    ArrayList arrayList = c0x9.A00;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    sb.append(AnonymousClass001.A0R(A0R, "  "));
                    A07(sb, AnonymousClass001.A0R(A0R, "  "), arrayList.get(i));
                    sb.append('\n');
                    i++;
                }
            } else {
                if (obj instanceof C0CA) {
                    A04((C0CA) obj, AnonymousClass001.A0R(str, "  "), sb);
                    return;
                }
                if (obj instanceof C0CW) {
                    A0R = AnonymousClass001.A0R(str, "  ");
                    C0CW c0cw = (C0CW) obj;
                    sb.append("[\n");
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList2 = c0cw.A00;
                        if (i2 >= arrayList2.size()) {
                            break;
                        }
                        sb.append(AnonymousClass001.A0R(A0R, "  "));
                        A07(sb, AnonymousClass001.A0R(A0R, "  "), arrayList2.get(i2));
                        sb.append('\n');
                        i2++;
                    }
                } else {
                    obj2 = obj.toString();
                }
            }
            sb.append(A0R);
            obj2 = "]";
        }
        sb.append(obj2);
    }

    public static void A04(C0CA c0ca, String str, StringBuilder sb) {
        sb.append("{\n");
        for (int i = 0; i < c0ca.A00; i++) {
            sb.append(str);
            sb.append(c0ca.A0D(i));
            sb.append(" = ");
            A07(sb, str, c0ca.A0C(i));
            sb.append('\n');
        }
        sb.append("}");
    }
}
