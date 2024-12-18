package X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: X.5J3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J3 {
    public static final AtomicBoolean A07 = new AtomicBoolean(false);
    public AbstractC12990ll A00;
    public InterfaceC19630xq A01;
    public boolean A02;
    public final VJB A03;
    public final C102524jl A04;
    public final Map A05 = new HashMap();
    public volatile AbstractC26671Qw A06;

    public final synchronized void A01(C26701Qz c26701Qz) {
        String str;
        HashSet hashSet = new HashSet();
        List<C62723SNn> list = c26701Qz.A00;
        for (C62723SNn c62723SNn : list) {
            String str2 = c62723SNn.A01;
            hashSet.add(str2);
            C69571Vra A00 = A00(str2);
            if (c62723SNn.A00 < 60) {
                c62723SNn = new C62723SNn(str2, c62723SNn.A02, 60);
            }
            W2Y w2y = A00.A01;
            if (w2y == null || !w2y.A01.equals(c62723SNn)) {
                A00.A00();
                A00.A01 = new W2Y(A00, c62723SNn);
            }
        }
        for (Map.Entry entry : this.A05.entrySet()) {
            C69571Vra c69571Vra = (C69571Vra) entry.getValue();
            if (!hashSet.contains(entry.getKey())) {
                c69571Vra.A00();
            }
        }
        if (!list.isEmpty()) {
            try {
                str = AbstractC103634lf.A00(c26701Qz).toString();
            } catch (JSONException unused) {
                str = null;
            }
            "zero_carrier_signal".getClass();
            C19280xC A01 = C19280xC.A01("zero_carrier_signal", null);
            A01.A0C("event_type", "config_update");
            A01.A0C(DexStore.CONFIG_FILENAME, str);
            A01.A0C("url", null);
            A01.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, null);
            A01.A0C("success", null);
            A01.A0C(AbstractC58317Pt9.A00(370), null);
            AbstractC11060iN.A00(this.A00).EHW(A01);
            A01.A03();
        }
    }

    private C69571Vra A00(String str) {
        Map map = this.A05;
        C69571Vra c69571Vra = (C69571Vra) map.get(str);
        if (c69571Vra == null) {
            c69571Vra = new C69571Vra(this);
            map.put(str, c69571Vra);
            InterfaceC19630xq interfaceC19630xq = this.A01;
            if (interfaceC19630xq != null) {
                long j = interfaceC19630xq.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE) {
                    synchronized (this) {
                        VJB vjb = this.A03;
                        long j2 = j - vjb.A00;
                        if (j2 <= vjb.A01.now()) {
                            A00(str).A00 = j2;
                        }
                    }
                }
            }
        }
        return c69571Vra;
    }

    public final void A02(C62723SNn c62723SNn, long j) {
        if (!this.A02) {
            this.A02 = true;
            InterfaceC19630xq interfaceC19630xq = this.A01;
            if (interfaceC19630xq != null) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G(c62723SNn.A01, j);
                ARD.apply();
                if (A07.compareAndSet(false, true)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    for (String str : interfaceC19630xq.getAll().keySet()) {
                        long j2 = currentTimeMillis - interfaceC19630xq.getLong(str, 0L);
                        if (j2 < 0 || j2 > 2592000000L) {
                            arrayList.add(str);
                        }
                    }
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ARD2.EEj((String) it.next());
                    }
                    ARD2.apply();
                }
            }
            C1ON A00 = SU9.A00(c62723SNn.A02);
            A00.A00 = new C60903RbI(c62723SNn, this);
            C1GJ.A03(A00);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.VJB, java.lang.Object] */
    public C5J3(C0JO c0jo, AbstractC12990ll abstractC12990ll, C102524jl c102524jl, C26661Qv c26661Qv) {
        C17320tT c17320tT;
        this.A06 = c26661Qv;
        this.A04 = c102524jl;
        ?? obj = new Object();
        obj.A01 = c0jo;
        obj.A00 = System.currentTimeMillis() - c0jo.now();
        this.A03 = obj;
        this.A02 = false;
        this.A00 = abstractC12990ll;
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36312479608931460L)) {
            c17320tT = AbstractC19750y3.A01("PrefCarrierSignalTimestamps");
        } else {
            c17320tT = null;
        }
        this.A01 = c17320tT;
    }
}
