package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1J3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J3 extends AbstractC208410g {
    public static final C1J3 A06 = new C1J3();
    public QuickPerformanceLogger A00;
    public boolean A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final java.util.Set A05;

    @Override // X.C0Xc
    public final String getName() {
        return "ux_logging_validation";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerAnnotate(C0XX c0xx) {
        Map map;
        C140876Yp c140876Yp;
        C14360o3.A0B(c0xx, 0);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId())) && (map = (Map) this.A03.get(Integer.valueOf(c0xx.getMarkerId()))) != null && (c140876Yp = (C140876Yp) map.get(Integer.valueOf(c0xx.BIb()))) != null) {
            C0Wv c0Wv = c140876Yp.A03;
            C0Wv Ac2 = c0xx.Ac2();
            synchronized (c0Wv) {
                c0Wv.A08 = null;
                c0Wv.A07 = null;
                c0Wv.A05.add(AnonymousClass001.A0R("x_", (String) Ac2.A05.get(r1.size() - 1)));
                byte b = Ac2.A09[Ac2.A03 - 1];
                switch (b) {
                    case 1:
                    case 4:
                    case 5:
                    case 7:
                    case 9:
                    case 10:
                        c0Wv.A06.add(Ac2.A06.get(r1.size() - 1));
                        break;
                    case 2:
                        C0Wv.A02(c0Wv, Ac2.A0B[Ac2.A02 - 1]);
                        break;
                    case 3:
                        C0Wv.A02(c0Wv, Ac2.A0B[Ac2.A02 - 1]);
                        break;
                    case 6:
                        C0Wv.A01(c0Wv, Ac2.A0A[Ac2.A00 - 1]);
                        break;
                    case 8:
                        C0Wv.A02(c0Wv, Ac2.A0B[Ac2.A02 - 1]);
                        break;
                    default:
                        throw new UnsupportedOperationException(AnonymousClass001.A0c("Type ", " is not supported yet", b));
                }
                C0Wv.A00(c0Wv, b);
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerDrop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId()))) {
            A02(c0xx, (short) 216);
        } else if (this.A04.containsKey(Integer.valueOf(c0xx.getMarkerId()))) {
            A01(c0xx);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i) {
        Map map;
        C140876Yp c140876Yp;
        StringBuilder sb;
        C14360o3.A0B(c0xx, 0);
        C14360o3.A0B(str, 1);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId())) && (map = (Map) this.A03.get(Integer.valueOf(c0xx.getMarkerId()))) != null && (c140876Yp = (C140876Yp) map.get(Integer.valueOf(c0xx.BIb()))) != null) {
            C0X7 c0x7 = c140876Yp.A04;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (str.length() > 0 && str.charAt(0) == '/') {
                sb = new StringBuilder();
                sb.append("/x");
            } else {
                sb = new StringBuilder();
                sb.append("/x/");
            }
            sb.append(str);
            c0x7.A00(c0xj, null, sb.toString(), timeUnit, i, j2);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerRestart(C0XX c0xx) {
        Map map;
        C140876Yp c140876Yp;
        C14360o3.A0B(c0xx, 0);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId())) && (map = (Map) this.A03.get(Integer.valueOf(c0xx.getMarkerId()))) != null && (c140876Yp = (C140876Yp) map.get(Integer.valueOf(c0xx.BIb()))) != null) {
            c140876Yp.A03.A06("x__restarted", true);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerStart(C0XX c0xx) {
        Collection values;
        C14360o3.A0B(c0xx, 0);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId()))) {
            C140876Yp c140876Yp = new C140876Yp(c0xx.BIb(), c0xx.BUr());
            Map map = this.A03;
            Integer valueOf = Integer.valueOf(c0xx.getMarkerId());
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new LinkedHashMap();
                map.put(valueOf, obj);
            }
            ((Map) obj).put(Integer.valueOf(c0xx.BIb()), c140876Yp);
            c140876Yp.A00 = A00(c0xx.getMarkerId()).size();
            c140876Yp.A04.A00(null, null, "/x_start", TimeUnit.NANOSECONDS, 7, c0xx.BUr());
        } else {
            Map map2 = this.A04;
            if (map2.containsKey(Integer.valueOf(c0xx.getMarkerId()))) {
                C9GV c9gv = new C9GV(null, null, 1);
                Map map3 = this.A02;
                Integer valueOf2 = Integer.valueOf(c0xx.getMarkerId());
                Object obj2 = map3.get(valueOf2);
                if (obj2 == null) {
                    obj2 = new LinkedHashMap();
                    map3.put(valueOf2, obj2);
                }
                ((Map) obj2).put(Integer.valueOf(c0xx.BIb()), c9gv);
                Object obj3 = map2.get(Integer.valueOf(c0xx.getMarkerId()));
                if (obj3 != null) {
                    Map map4 = (Map) this.A03.get(Integer.valueOf(((Number) obj3).intValue()));
                    if (map4 != null && (values = map4.values()) != null) {
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((C140876Yp) it.next()).A00++;
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (this.A05.contains(Integer.valueOf(c0xx.getMarkerId()))) {
            A02(c0xx, c0xx.AYZ());
        } else if (this.A04.containsKey(Integer.valueOf(c0xx.getMarkerId()))) {
            A01(c0xx);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        C14360o3.A0B(quickPerformanceLogger, 0);
        this.A00 = quickPerformanceLogger;
    }

    private final ArrayList A00(int i) {
        Map map;
        Collection values;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A04.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (((Number) entry.getValue()).intValue() == i && (map = (Map) this.A02.get(Integer.valueOf(intValue))) != null && (values = map.values()) != null) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        return arrayList;
    }

    private final void A01(C0XX c0xx) {
        C9GV c9gv;
        int i;
        Object next;
        Map map = (Map) this.A02.get(Integer.valueOf(c0xx.getMarkerId()));
        if (map != null && (c9gv = (C9GV) map.remove(Integer.valueOf(c0xx.BIb()))) != null) {
            Object obj = this.A04.get(Integer.valueOf(c0xx.getMarkerId()));
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                Map map2 = (Map) this.A03.get(Integer.valueOf(intValue));
                Collection collection = null;
                if (map2 != null) {
                    collection = map2.values();
                }
                C0Wv Ac2 = c0xx.Ac2();
                Ac2.A05("x__marker", intValue);
                List list = c9gv.A00;
                int size = list.size();
                if (collection != null) {
                    i = collection.size();
                } else {
                    i = 0;
                }
                Ac2.A05("x__numCoterminous", size + i);
                if (!list.isEmpty()) {
                    next = list.get(0);
                } else if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            long j = ((C140876Yp) next).A02;
                            do {
                                Object next2 = it.next();
                                long j2 = ((C140876Yp) next2).A02;
                                if (j > j2) {
                                    next = next2;
                                    j = j2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    return;
                }
                C140876Yp c140876Yp = (C140876Yp) next;
                if (c140876Yp != null) {
                    Ac2.A05("x__instance", c140876Yp.A01);
                    C0Wv c0Wv = c140876Yp.A03;
                    synchronized (Ac2) {
                        Ac2.A08 = null;
                        Ac2.A07 = null;
                        Ac2.A05.addAll(c0Wv.A05);
                        Ac2.A06.addAll(c0Wv.A06);
                        double[] copyOf = Arrays.copyOf(Ac2.A0A, Math.max(Ac2.A00 + c0Wv.A00, 15));
                        Ac2.A0A = copyOf;
                        System.arraycopy(c0Wv.A0A, 0, copyOf, Ac2.A00, c0Wv.A00);
                        long[] copyOf2 = Arrays.copyOf(Ac2.A0B, Math.max(Ac2.A02 + c0Wv.A02, 15));
                        Ac2.A0B = copyOf2;
                        System.arraycopy(c0Wv.A0B, 0, copyOf2, Ac2.A02, c0Wv.A02);
                        byte[] copyOf3 = Arrays.copyOf(Ac2.A09, Math.max(Ac2.A03 + c0Wv.A03, 20));
                        Ac2.A09 = copyOf3;
                        System.arraycopy(c0Wv.A09, 0, copyOf3, Ac2.A03, c0Wv.A03);
                        Ac2.A00 += c0Wv.A00;
                        Ac2.A02 += c0Wv.A02;
                        Ac2.A03 += c0Wv.A03;
                    }
                    C0X7 c0x7 = c140876Yp.A04;
                    for (int i2 = 0; i2 < c0x7.A01; i2++) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeUnit.toMillis(c0x7.A03[i2]);
                        long j3 = c0x7.A03[i2];
                        int i3 = c0x7.A02[i2];
                        String str = c0x7.A06[i2];
                        C0XJ c0xj = c0x7.A04[i2];
                        InterfaceC07540aT interfaceC07540aT = c0x7.A05[i2];
                        C14360o3.A0B(str, 3);
                        c0xx.ASo().A00(c0xj, interfaceC07540aT, str, timeUnit, i3, j3 - c0xx.BUr());
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A02(C0XX c0xx, short s) {
        C140876Yp c140876Yp;
        String str;
        Map map = (Map) this.A03.get(Integer.valueOf(c0xx.getMarkerId()));
        if (map != null && (c140876Yp = (C140876Yp) map.remove(Integer.valueOf(c0xx.BIb()))) != null) {
            c0xx.Ac2().A05("x__numCoterminous", c140876Yp.A00);
            ArrayList A00 = A00(c0xx.getMarkerId());
            if (!A00.isEmpty()) {
                if (s == 2) {
                    str = "/x_success";
                } else if (s == 4) {
                    str = "/x_cancel";
                } else if (s == 615) {
                    str = "/x_cancel_navigation";
                } else if (s == 630) {
                    str = "/x_cancel_background";
                } else if (s == 3) {
                    str = "/x_fail";
                } else if (s == 216) {
                    str = "/x_drop";
                } else if (s == 113) {
                    str = "/x_timeout";
                } else {
                    str = "/x_end";
                }
                c140876Yp.A04.A00(null, null, str, TimeUnit.NANOSECONDS, 7, c0xx.BUr() + c0xx.Azo());
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    ((C9GV) it.next()).A00.add(c140876Yp);
                }
            }
        }
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        C06650Xb c06650Xb;
        if (this.A01) {
            Map map = this.A04;
            int[] A0x = AbstractC001800i.A0x(AnonymousClass090.A00(map.values(), map.keySet()));
            c06650Xb = new C06650Xb(Arrays.copyOf(A0x, A0x.length), null);
        } else {
            c06650Xb = C06650Xb.A03;
        }
        C14360o3.A0A(c06650Xb);
        return c06650Xb;
    }

    public C1J3() {
        LinkedHashMap A062 = AbstractC06930Yk.A06(new C09530e4(220137552, 31784974), new C09530e4(220145054, 31795699), new C09530e4(220137409, 31795699), new C09530e4(220142847, 1060769838), new C09530e4(220143470, 31784972), new C09530e4(220149885, 31784973), new C09530e4(220151529, 31784979), new C09530e4(220145534, 31784979), new C09530e4(220141661, 17313040));
        C14360o3.A0B(A062, 1);
        this.A04 = A062;
        this.A05 = AbstractC001800i.A0k(A062.values());
        this.A03 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
    }
}
