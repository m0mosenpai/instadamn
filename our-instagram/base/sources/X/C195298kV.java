package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195298kV {
    public long A00;
    public long A01;
    public boolean A02;
    public final InterfaceC19630xq A03;
    public final List A04;
    public final ConcurrentMap A05;
    public final InterfaceC195278kT A06;
    public final C13920nI A07;
    public final String A08;
    public final Comparator A09;

    public C195298kV(InterfaceC195278kT interfaceC195278kT, InterfaceC19630xq interfaceC19630xq, String str, Comparator comparator) {
        C14360o3.A0B(interfaceC19630xq, 1);
        C14360o3.A0B(interfaceC195278kT, 3);
        this.A03 = interfaceC19630xq;
        this.A08 = str;
        this.A06 = interfaceC195278kT;
        this.A09 = comparator;
        this.A07 = C13920nI.A00;
        this.A00 = -1L;
        this.A01 = -1L;
        this.A04 = new ArrayList();
        this.A05 = new ConcurrentHashMap();
    }

    public final synchronized void A06(Object obj) {
        if (this.A05.remove(this.A06.AhL(obj)) != null) {
            A00();
            A04();
        }
    }

    public final void A07(List list) {
        C14360o3.A0B(list, 0);
        A01();
        for (Object obj : list) {
            this.A05.put(this.A06.AhL(obj), obj);
        }
        this.A00 = -1L;
        this.A01 = System.currentTimeMillis();
        A00();
        this.A02 = true;
        A04();
    }

    private final void A00() {
        List list = this.A04;
        list.clear();
        Comparator comparator = this.A09;
        if (comparator != null) {
            list.addAll(this.A05.values());
            C01T.A1D(list, comparator);
        }
    }

    public final void A01() {
        this.A00 = -1L;
        this.A01 = -1L;
        this.A05.clear();
        this.A04.clear();
        this.A02 = false;
    }

    public final void A02() {
        InterfaceC19630xq interfaceC19630xq = this.A03;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        List A0X = AbstractC001800i.A0X(AbstractC06930Yk.A0B(interfaceC19630xq.getAll()).keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0X) {
            if (AbstractC002300n.A0h((String) obj, this.A08, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ARD.EEj((String) it.next());
        }
        ARD.EEj("expiration_timestamp_ms");
        ARD.EEj("last_fetched_time_ms");
        ARD.apply();
    }

    public final void A05(long j) {
        this.A00 = j;
        InterfaceC19610xo ARD = this.A03.ARD();
        ARD.E7G("expiration_timestamp_ms", this.A00);
        ARD.apply();
    }

    public final void A03() {
        A01();
        for (Map.Entry entry : this.A03.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && value != null && AbstractC002300n.A0h(str, this.A08, false)) {
                try {
                    InterfaceC195278kT interfaceC195278kT = this.A06;
                    Object AOx = interfaceC195278kT.AOx((String) value);
                    this.A05.put(interfaceC195278kT.AhL(AOx), AOx);
                } catch (IOException e) {
                    C0w9.A07("BootstrapSource", e);
                }
            }
        }
        A00();
        this.A02 = true;
    }

    public final void A04() {
        A02();
        InterfaceC19610xo ARD = this.A03.ARD();
        for (Object obj : this.A05.values()) {
            if (obj != null) {
                try {
                    String str = this.A08;
                    InterfaceC195278kT interfaceC195278kT = this.A06;
                    ARD.E7K(AnonymousClass001.A0R(str, interfaceC195278kT.AhL(obj)), interfaceC195278kT.EOt(obj));
                } catch (IOException e) {
                    C0w9.A07("BootstrapSource", e);
                }
            }
        }
        ARD.E7G("expiration_timestamp_ms", this.A00);
        ARD.E7G("last_fetched_time_ms", this.A01);
        ARD.apply();
    }
}
