package X;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.proxygen.ProxygenRadioMeter;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41341vj {
    public static C41341vj A06;
    public SHs A00;
    public final C02950Bt A01;
    public final C0CP A02;
    public final C62907SWo A03;
    public final C63930Sw5 A04;
    public final C62556SGh A05;

    /* JADX WARN: Type inference failed for: r13v0, types: [X.Sw5, X.0CC, java.lang.Object] */
    public C41341vj(final Context context, InterfaceC11360iu interfaceC11360iu, C18920wW c18920wW, boolean z, boolean z2, boolean z3) {
        ?? obj = new Object();
        obj.A01 = interfaceC11360iu;
        obj.A00 = null;
        this.A04 = obj;
        C05630Rn c05630Rn = new C05630Rn();
        Object obj2 = new Object();
        C005001p c005001p = c05630Rn.A00;
        c005001p.put(C0YK.class, obj2);
        c005001p.put(C0WB.class, new Object());
        c005001p.put(C0VK.class, new Object());
        c005001p.put(C06130Ud.class, new Object());
        C0RS c0rs = new C0RS();
        c0rs.A00 = false;
        c005001p.put(C05660Rq.class, c0rs);
        c005001p.put(C05680Rs.class, new Object());
        c005001p.put(C0SO.class, new Object());
        c005001p.put(C06340Va.class, new Object());
        this.A02 = new C0CP(obj, c05630Rn);
        C005001p c005001p2 = new C005001p(0);
        c005001p2.put(C0YK.class, new C0Y2());
        c005001p2.put(C0WB.class, new C06410Vi());
        c005001p2.put(C0VK.class, new C0V3());
        c005001p2.put(C06130Ud.class, new AbstractC02970Bv(context) { // from class: X.0UY
            public final C05960Tk A01;
            public boolean A00 = true;
            public final long[] A02 = new long[8];
            public final long[] A03 = new long[8];

            public static void A00(C06130Ud c06130Ud, long[] jArr, int i) {
                c06130Ud.A01 += jArr[i | 3];
                c06130Ud.A00 += jArr[i | 2];
                c06130Ud.A03 += jArr[i | 1];
                c06130Ud.A02 += jArr[i];
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
            @Override // X.AbstractC02970Bv
            public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
                return new Object();
            }

            @Override // X.AbstractC02970Bv
            public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
                boolean z4;
                C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
                synchronized (this) {
                    if (this.A00) {
                        C05960Tk c05960Tk = this.A01;
                        long[] jArr = this.A02;
                        try {
                            Arrays.fill(jArr, 0L);
                            C05960Tk.A00(c05960Tk, jArr, 0, 2);
                            C05960Tk.A00(c05960Tk, jArr, 1, 0);
                            long[] jArr2 = this.A03;
                            int i = 0;
                            while (true) {
                                int length = jArr.length;
                                if (i < length) {
                                    if (jArr[i] < jArr2[i]) {
                                        android.util.Log.e("NetworkMetricsCollector", AnonymousClass001.A0u("Network Bytes decreased from ", Arrays.toString(jArr2), " to ", Arrays.toString(jArr)), null);
                                        z4 = false;
                                        break;
                                    }
                                    i++;
                                } else {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                    z4 = true;
                                    break;
                                }
                            }
                            this.A00 = z4;
                            if (z4) {
                                c06130Ud.A01 = 0L;
                                c06130Ud.A00 = 0L;
                                c06130Ud.A03 = 0L;
                                c06130Ud.A02 = 0L;
                                A00(c06130Ud, jArr, 0);
                                A00(c06130Ud, jArr, 4);
                                return true;
                            }
                        } catch (RemoteException | IllegalArgumentException | NullPointerException e) {
                            android.util.Log.e("NetworkStatsManagerBytesCollector", "Unable to get bytes transferred", e);
                        }
                    }
                    return false;
                }
            }

            {
                this.A01 = new C05960Tk(context);
            }
        });
        c005001p2.put(C05660Rq.class, C0BX.A00);
        c005001p2.put(C05680Rs.class, new Object());
        C0SN c0sn = C0BV.A00;
        c005001p2.put(C0SO.class, c0sn);
        c005001p2.put(C06340Va.class, new C0VW(context));
        C0XI c0xi = new C0XI(c005001p2);
        C02950Bt c02950Bt = new C02950Bt(c0xi.A03(), c0xi.A03(), c0xi.A03(), c0xi);
        c02950Bt.A01 = c0xi.A04(c02950Bt.A00) & c02950Bt.A01;
        this.A01 = c02950Bt;
        C0BU.A00(new XOG((C0Y2) ((AbstractC02970Bv) ((C0XI) c02950Bt.A03).A00.get(C0YK.class))));
        c0sn.A00 = new Y9R(ProxygenRadioMeter.getInstance(false));
        C1GJ.A05(new C60938Rbs(context.getApplicationContext(), c02950Bt, this), 502, 4, 5000, false, false);
        if (z) {
            C005001p c005001p3 = new C005001p(0);
            int i = 0;
            Class[] clsArr = {C05680Rs.class, C05660Rq.class};
            do {
                Class cls = clsArr[i];
                c005001p3.put(cls, c0xi.A00.get(cls));
                i++;
            } while (i < 2);
            C0XI c0xi2 = new C0XI(c005001p3);
            C0XO A03 = c0xi2.A03();
            ((C05660Rq) A03.A04(C05660Rq.class)).A02 = true;
            C0XO A032 = c0xi2.A03();
            ((C05660Rq) A032.A04(C05660Rq.class)).A02 = true;
            C005001p c005001p4 = A032.A00;
            int size = c005001p4.size();
            for (int i2 = 0; i2 < size; i2++) {
                A032.A07((Class) c005001p4.A05(i2), true);
            }
            ((AbstractC02970Bv) c0xi2.A00.get(C05680Rs.class)).A04(A032.A04(C05680Rs.class));
            C0XO A033 = c0xi2.A03();
            ((C05660Rq) A033.A04(C05660Rq.class)).A02 = true;
            C62556SGh c62556SGh = new C62556SGh(new C02950Bt(A03, A032, A033, c0xi2), c18920wW);
            this.A05 = c62556SGh;
            c62556SGh.A01 = z3;
        } else {
            this.A05 = null;
        }
        if (z2) {
            this.A03 = new C62907SWo(c18920wW);
        } else {
            this.A03 = null;
        }
    }

    public static synchronized C18920wW A00(AbstractC12990ll abstractC12990ll) {
        C18920wW A01;
        synchronized (C41341vj.class) {
            A01 = AbstractC12220kQ.A01(new InterfaceC11380iw() { // from class: X.1vl
                public static final String __redex_internal_original_name = "InstagramBatteryMetrics$2";

                @Override // X.InterfaceC11380iw
                public final String getModuleName() {
                    return "battery";
                }
            }, abstractC12990ll);
        }
        return A01;
    }

    public static void A01(C41341vj c41341vj, String str) {
        C0XO c0xo;
        SHs sHs = c41341vj.A00;
        if (sHs != null) {
            synchronized (sHs) {
                c0xo = (C0XO) sHs.A00.A01();
                C24261Gv c24261Gv = sHs.A02;
                if (c24261Gv.CKd("previous_session")) {
                    c24261Gv.EEk("previous_session");
                }
            }
            C0CC A00 = c41341vj.A02.A00(c0xo, str);
            if (A00 != null) {
                A00.CiO();
            }
            C62556SGh c62556SGh = c41341vj.A05;
            if (c62556SGh != null) {
                synchronized (c62556SGh) {
                    C18920wW c18920wW = c62556SGh.A00;
                    InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "mobile_power_attribution_stats");
                    if (A002.isSampled()) {
                        C0XO c0xo2 = (C0XO) c62556SGh.A02.A01();
                        c0xo2.getClass();
                        if (c62556SGh.A01 && c0xo2.A08(C05660Rq.class)) {
                            try {
                                JSONObject A04 = ((C05660Rq) c0xo2.A04(C05660Rq.class)).A04();
                                if (A04 != null) {
                                    A002.AAP("wakelock_attribution", A04.toString());
                                }
                            } catch (JSONException e) {
                                android.util.Log.e("InstagramBatteryAttributionMetricsReporter", "Failed to serialize wakelock attribution data", e);
                            }
                        }
                        C05680Rs c05680Rs = (C05680Rs) c0xo2.A04(C05680Rs.class);
                        c05680Rs.getClass();
                        A002.A9K("realtime_ms", Long.valueOf(c05680Rs.A00));
                        A002.A9K("uptime_ms", Long.valueOf(c05680Rs.A01));
                        A002.AAP("dimension", str);
                        A002.Cht();
                    }
                }
            }
        }
    }

    public static synchronized void A02(InterfaceC11360iu interfaceC11360iu) {
        synchronized (C41341vj.class) {
            C41341vj c41341vj = A06;
            if (c41341vj != null) {
                c41341vj.A04.A01 = interfaceC11360iu;
            }
        }
    }

    public static synchronized void A03(C18920wW c18920wW) {
        C62556SGh c62556SGh;
        synchronized (C41341vj.class) {
            C41341vj c41341vj = A06;
            if (c41341vj != null && (c62556SGh = c41341vj.A05) != null) {
                c62556SGh.A00 = c18920wW;
            }
        }
    }
}
