package X;

import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0LW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LW {
    public static Runnable A0F;
    public static Runnable A0G;
    public static Runnable A0H;
    public static Runnable A0I;
    public static final java.util.Set A0J = new HashSet();
    public final AnonymousClass096 A00;
    public final C10760hk A01;
    public final C0Pe A02;
    public final boolean A08;
    public final int A09;
    public final C08I A0A;
    public final boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public final Map A06 = new HashMap(C0OP.values().length, 1.0f);
    public final Object A03 = new Object();
    public final Map A0B = new HashMap();
    public final java.util.Set A07 = new HashSet();
    public final Map A05 = new HashMap();
    public final Map A04 = new HashMap();

    public final void A08(C024209q c024209q, C0M6 c0m6, C0OO c0oo) {
        A0A(c024209q, c0m6, c0oo, c0oo.BNJ(), null, 0);
    }

    public final void A09(final C024209q c024209q, final C0M6 c0m6, final C0OO c0oo) {
        if (this.A08) {
            C04590Mb.A04.execute(new Runnable() { // from class: X.0LT
                @Override // java.lang.Runnable
                public final void run() {
                    C0LW c0lw = this;
                    C0OO c0oo2 = c0oo;
                    C0M6 c0m62 = c0m6;
                    C024209q c024209q2 = c024209q;
                    try {
                        c0lw.A0E(c0m62, c0oo2);
                        c0lw.A0A(c024209q2, c0m62, c0oo2, c0oo2.BNJ(), null, 0);
                        c0lw.A0D(c0m62, c0oo2);
                    } catch (Throwable th) {
                        C0PC.A00().DEh("CMNotifyAndApplyInBackground", th, null);
                        C0K8.A0M("lacrima", "Failed to apply collectors: %s", th, c0oo2.BW2());
                    }
                }
            });
            return;
        }
        A0E(c0m6, c0oo);
        A0A(c024209q, c0m6, c0oo, c0oo.BNJ(), null, 0);
        A0D(c0m6, c0oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.C024209q r31, X.C0M6 r32, X.C0OO r33, X.C0Z0 r34, java.lang.Integer r35, int r36) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LW.A0A(X.09q, X.0M6, X.0OO, X.0Z0, java.lang.Integer, int):void");
    }

    public static String A00(C0M6 c0m6, C0OP c0op, String str, int i) {
        String A03;
        String str2 = c0m6.A00;
        String str3 = "";
        if (i == 0) {
            A03 = "";
        } else {
            A03 = AnonymousClass001.A03(i, "_");
        }
        if (c0op.A01) {
            str3 = "suppl_";
        }
        return AnonymousClass001.A11(str2, A03, str3, c0op.A00, str);
    }

    public static HashMap A01(C0LR c0lr, C0M6 c0m6, C0OO c0oo, Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("DetectorName", c0oo.BW2().toString());
        if (c0lr != null) {
            hashMap.put("CollectorName", C0LX.A00(c0lr.BW4()));
        }
        hashMap.put("ReportCategory", c0m6.A00);
        if (num != null) {
            hashMap.put("SubSession", Integer.toString(num.intValue()));
        }
        return hashMap;
    }

    private List A02(C0M6 c0m6, C0OO c0oo, Map map) {
        List list;
        synchronized (this.A03) {
            Map map2 = (Map) map.get(c0m6);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(c0m6, map2);
            }
            list = (List) map2.get(c0oo);
            if (list == null) {
                list = new ArrayList();
                map2.put(c0oo, list);
            }
        }
        return list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void A03(C024209q c024209q, C0M6 c0m6, C0OO c0oo, String str) {
        C10850hu c10850hu;
        String str2;
        if (this.A0C) {
            C0OP BW2 = c0oo.BW2();
            if (!BW2.A01) {
                String A0g = AnonymousClass001.A0g("android_", c0m6.A00, BW2.A00);
                C10850hu c10850hu2 = C0LK.AA0;
                Map map = c024209q.A09;
                String str3 = (String) map.get(c10850hu2);
                String str4 = (String) map.get(C0LK.A3b);
                String str5 = (String) map.get(C0LK.A3X);
                HashMap hashMap = new HashMap();
                C0MP.A03(str3, str4, str5, str, hashMap);
                String A00 = DirectReports.A00(A0g);
                switch (A00.hashCode()) {
                    case -1829592345:
                        if (A00.equals("android_critical_native")) {
                            c10850hu = C0LK.A4Q;
                            str2 = "s";
                            break;
                        }
                        c10850hu = C0LK.A4Q;
                        str2 = "i";
                        break;
                    case -1554081515:
                        if (A00.equals("android_critical_anr")) {
                            c10850hu = C0LK.A4Q;
                            str2 = "q";
                            break;
                        }
                        c10850hu = C0LK.A4Q;
                        str2 = "i";
                        break;
                    case -931630862:
                        if (A00.equals("android_critical_java")) {
                            c10850hu = C0LK.A4Q;
                            str2 = "j";
                            break;
                        }
                        c10850hu = C0LK.A4Q;
                        str2 = "i";
                        break;
                    default:
                        c10850hu = C0LK.A4Q;
                        str2 = "i";
                        break;
                }
                C0MP.A02(c10850hu, str2, hashMap);
                C0MP.A00().A05(DirectReports.A00(A0g), hashMap);
            }
        }
    }

    public final C0OO A05(Class cls) {
        synchronized (this.A03) {
            for (C0OO c0oo : this.A07) {
                if (cls.isInstance(c0oo)) {
                    return c0oo;
                }
            }
            return null;
        }
    }

    public final List A06(C0M6 c0m6, C0OO c0oo, Integer num) {
        List<C0LR> list;
        synchronized (this.A03) {
            Map map = this.A0B;
            Map map2 = (Map) map.get(c0m6);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(c0m6, map2);
            }
            list = (List) map2.get(c0oo);
            if (list == null) {
                list = new ArrayList();
                map2.put(c0oo, list);
            } else if (num != null) {
                ArrayList arrayList = new ArrayList();
                for (C0LR c0lr : list) {
                    if (c0lr.CKv(num)) {
                        arrayList.add(c0lr);
                    }
                }
                list = arrayList;
            }
        }
        return list;
    }

    public final void A07(C0LR c0lr, C0M6 c0m6, C0OO c0oo) {
        synchronized (this.A03) {
            A06(c0m6, c0oo, null).add(c0lr);
        }
    }

    public final void A0B(C0LV c0lv, C0M6 c0m6, C0OO c0oo) {
        synchronized (this.A03) {
            A02(c0m6, c0oo, this.A04).add(c0lv);
        }
    }

    public final void A0C(C0LV c0lv, C0M6 c0m6, C0OO c0oo) {
        synchronized (this.A03) {
            A02(c0m6, c0oo, this.A05).add(c0lv);
        }
    }

    public final void A0D(C0M6 c0m6, C0OO c0oo) {
        A04(c0m6, c0oo, A02(c0m6, c0oo, this.A04));
    }

    public final void A0E(C0M6 c0m6, C0OO c0oo) {
        A04(c0m6, c0oo, A02(c0m6, c0oo, this.A05));
    }

    public C0LW(AnonymousClass096 anonymousClass096, C10760hk c10760hk, C0Pe c0Pe, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = c0Pe;
        this.A01 = c10760hk;
        this.A00 = anonymousClass096;
        this.A0C = z;
        this.A08 = z2;
        if (i > 0 && i < 64) {
            i = 64;
        }
        this.A09 = i;
        this.A0A = new C08I(i, z3);
    }

    public static void A04(C0M6 c0m6, C0OO c0oo, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((C0LV) it.next()).DWC(c0m6, c0oo);
            } catch (Throwable th) {
                C0PC.A00().DEh("CMNotifyListener", th, null);
                C0K8.A0H("lacrima", "onNotify failed...", th);
            }
        }
    }
}
