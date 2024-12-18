package X;

import com.facebook.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6FQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FQ {
    public static final C6FR A0G = new Object();
    public C6FR A00;
    public InterfaceC103074ki A01;
    public final InterfaceC102974kY A02;
    public final C6FG A03;
    public final AnonymousClass632 A04;
    public final InterfaceC136406Ft A05;
    public final C63162tt A06;
    public final C6FS A07;
    public final InterfaceC103384lE A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final WeakReference A0C;
    public final List A0D;
    public final Map A0E;
    public final Map A0F;

    public static C6FQ A00(InterfaceC102974kY interfaceC102974kY, C6FQ c6fq, List list) {
        List list2 = list;
        InterfaceC102974kY interfaceC102974kY2 = interfaceC102974kY;
        C6FG c6fg = c6fq.A03;
        InterfaceC103384lE interfaceC103384lE = c6fq.A08;
        if (list == null) {
            list2 = c6fq.A0D;
        }
        Map map = c6fq.A0E;
        AnonymousClass632 anonymousClass632 = c6fq.A04;
        InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
        Map map2 = c6fq.A0F;
        InterfaceC103074ki interfaceC103074ki = c6fq.A01;
        C63162tt c63162tt = c6fq.A06;
        String str = c6fq.A0B;
        if (interfaceC102974kY2 == null) {
            interfaceC102974kY2 = c6fq.A02;
        }
        String str2 = c6fq.A0A;
        return new C6FQ(interfaceC102974kY2, c6fg, (C6FG) c6fq.A0C.get(), anonymousClass632, interfaceC136406Ft, c63162tt, interfaceC103384lE, interfaceC103074ki, c6fq.A09, str, str2, list2, map, map2);
    }

    public static C6FQ A01(C6FG c6fg, InterfaceC103384lE interfaceC103384lE, List list) {
        InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
        InterfaceC103074ki A05 = AnonymousClass634.A05(c6fg);
        return new C6FQ(null, c6fg, null, null, null, interfaceC62872tQ.AgS().AgX(), interfaceC103384lE, A05, C05F.A01, (String) c6fg.A01.get(R.id.bk_context_key_logging_id), null, list, null, null);
    }

    public C6FQ(InterfaceC102974kY interfaceC102974kY, C6FG c6fg, C6FG c6fg2, AnonymousClass632 anonymousClass632, InterfaceC136406Ft interfaceC136406Ft, C63162tt c63162tt, InterfaceC103384lE interfaceC103384lE, final InterfaceC103074ki interfaceC103074ki, Integer num, String str, String str2, List list, Map map, Map map2) {
        C6FR c6fr = A0G;
        this.A07 = new C6FS();
        if (interfaceC103074ki instanceof C6FU) {
            this.A01 = interfaceC103074ki;
        } else {
            this.A01 = new InterfaceC103074ki(interfaceC103074ki) { // from class: X.6FU
                public final InterfaceC103074ki A00;

                {
                    this.A00 = interfaceC103074ki;
                }

                @Override // X.InterfaceC103074ki
                public final Object AT6(C6FQ c6fq, C6FW c6fw, String str3) {
                    int i = 0;
                    switch (str3.hashCode()) {
                        case -1882328740:
                            if (str3.equals("bk.action.f32.Sqrt")) {
                                return C6DZ.A00(Math.sqrt(((Number) c6fw.A03(0)).doubleValue()));
                            }
                            break;
                        case -1666855539:
                            if (str3.equals("bk.action.string.ToUpperCase")) {
                                return ((String) c6fw.A00.get(0)).toUpperCase(Locale.ROOT);
                            }
                            break;
                        case -1606945202:
                            if (str3.equals("bk.action.array.Reduce")) {
                                List list2 = c6fw.A00;
                                List list3 = (List) list2.get(0);
                                C1344465q c1344465q = (C1344465q) c6fw.A03(1);
                                Object obj = list2.get(2);
                                if (list3 != null) {
                                    for (int i2 = 0; i2 < list3.size(); i2++) {
                                        C6FX c6fx = new C6FX();
                                        c6fx.A03(obj, 0);
                                        c6fx.A03(list3.get(i2), 1);
                                        c6fx.A03(Integer.valueOf(i2), 2);
                                        try {
                                            obj = C6FY.A00(c6fq, new C6FW(c6fx.A00), c1344465q.A00);
                                        } catch (C1338562t e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                }
                                return obj;
                            }
                            break;
                        case -1225336055:
                            if (str3.equals("bk.action.string.Contains")) {
                                return Boolean.valueOf(((String) c6fw.A03(0)).contains((String) c6fw.A03(1)));
                            }
                            break;
                        case -965327084:
                            if (str3.equals("bk.action.string.Join")) {
                                List list4 = c6fw.A00;
                                String str4 = (String) list4.get(0);
                                list4.get(1);
                                List list5 = (List) list4.get(1);
                                if (str4 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    while (i < list5.size()) {
                                        String str5 = (String) list5.get(i);
                                        if (str5 != null) {
                                            sb.append(str5);
                                            if (i < list5.size() - 1) {
                                                sb.append(str4);
                                            }
                                            i++;
                                        } else {
                                            throw new IllegalArgumentException("element must not be null");
                                        }
                                    }
                                    return sb.toString();
                                }
                                throw new IllegalArgumentException("delimeter must not be null");
                            }
                            break;
                        case -240276909:
                            if (str3.equals("bk.action.map.Merge")) {
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    List list6 = c6fw.A00;
                                    if (i >= list6.size()) {
                                        return hashMap;
                                    }
                                    Map map3 = (Map) list6.get(i);
                                    if (map3 != null) {
                                        hashMap.putAll(map3);
                                    }
                                    i++;
                                }
                            }
                            break;
                        case 944474301:
                            if (str3.equals("bk.action.map.Filter")) {
                                Map map4 = (Map) c6fw.A03(0);
                                C1344465q c1344465q2 = (C1344465q) c6fw.A03(1);
                                HashMap hashMap2 = new HashMap();
                                for (Map.Entry entry : map4.entrySet()) {
                                    C6FX c6fx2 = new C6FX();
                                    c6fx2.A03(entry.getKey(), 0);
                                    c6fx2.A03(entry.getValue(), 1);
                                    try {
                                        if (C6DZ.A01(C6FY.A00(c6fq, new C6FW(c6fx2.A00), c1344465q2.A00))) {
                                            hashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    } catch (C1338562t e2) {
                                        throw new RuntimeException(e2);
                                    }
                                }
                                return hashMap2;
                            }
                            break;
                        case 975567453:
                            if (str3.equals("bk.action.string.ValueOfNumberInBase")) {
                                long longValue = ((Number) c6fw.A03(0)).longValue();
                                long intValue = ((Number) c6fw.A03(1)).intValue();
                                if (intValue >= 2 && intValue <= 36) {
                                    return Long.toString(longValue, (int) intValue);
                                }
                                throw new IllegalArgumentException("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                            }
                            break;
                        case 1377663097:
                            if (str3.equals("bk.action.map.Keys")) {
                                return new ArrayList(((Map) c6fw.A03(0)).keySet());
                            }
                            break;
                        case 1395153511:
                            if (str3.equals("bk.action.map.Values")) {
                                return new ArrayList(((Map) c6fw.A03(0)).values());
                            }
                            break;
                        case 1740388232:
                            if (str3.equals("bk.action.f32.Log")) {
                                return C6DZ.A00(Math.log(((Number) c6fw.A03(0)).doubleValue()));
                            }
                            break;
                        case 1740392092:
                            if (str3.equals("bk.action.f32.Pow")) {
                                return C6DZ.A00(Math.pow(((Number) c6fw.A03(0)).doubleValue(), ((Number) c6fw.A03(1)).doubleValue()));
                            }
                            break;
                        case 1867263777:
                            if (str3.equals("bk.action.string.StartsWith")) {
                                List list7 = c6fw.A00;
                                return Boolean.valueOf(((String) list7.get(0)).startsWith((String) list7.get(1)));
                            }
                            break;
                        case 1890080876:
                            if (str3.equals("bk.action.string.ToLowerCase")) {
                                return ((String) c6fw.A00.get(0)).toLowerCase(Locale.ROOT);
                            }
                            break;
                    }
                    InterfaceC103074ki interfaceC103074ki2 = this.A00;
                    if (interfaceC103074ki2 != null) {
                        return interfaceC103074ki2.AT6(c6fq, c6fw, str3);
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("unknown function ", str3));
                }
            };
        }
        this.A00 = c6fr;
        if (list == null) {
            this.A0D = Collections.emptyList();
        } else {
            this.A0D = list;
        }
        this.A02 = interfaceC102974kY;
        this.A03 = c6fg;
        this.A08 = interfaceC103384lE;
        this.A0E = map;
        this.A04 = anonymousClass632;
        this.A05 = interfaceC136406Ft;
        this.A0F = map2;
        this.A06 = c63162tt;
        this.A0B = str;
        this.A09 = num;
        this.A0C = new WeakReference(c6fg2);
        C6FS c6fs = this.A07;
        c6fs.A00.add(new Object());
        if (str2 == null) {
            this.A0A = Long.toString(new Random().nextLong());
        } else {
            this.A0A = str2;
        }
    }

    public static C6FQ A02(C6FQ c6fq, List list) {
        if (list == c6fq.A0D) {
            return c6fq;
        }
        C6FG c6fg = c6fq.A03;
        InterfaceC103384lE interfaceC103384lE = c6fq.A08;
        Map map = c6fq.A0E;
        AnonymousClass632 anonymousClass632 = c6fq.A04;
        InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
        Map map2 = c6fq.A0F;
        InterfaceC103074ki interfaceC103074ki = c6fq.A01;
        C6FQ c6fq2 = new C6FQ(null, c6fg, null, anonymousClass632, interfaceC136406Ft, c6fq.A06, interfaceC103384lE, interfaceC103074ki, c6fq.A09, c6fq.A0B, c6fq.A0A, list, map, map2);
        C6FS c6fs = c6fq2.A07;
        CopyOnWriteArraySet copyOnWriteArraySet = c6fq.A07.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            c6fs.A00.addAll(copyOnWriteArraySet);
        }
        return c6fq2;
    }
}
