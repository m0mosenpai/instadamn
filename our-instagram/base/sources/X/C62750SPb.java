package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.SPb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C62750SPb {
    public long A00;
    public long A01;
    public final Map A02 = new LinkedHashMap(100, 0.75f, true);

    public final synchronized Object A00(Object obj) {
        Object obj2;
        SDM sdm = (SDM) this.A02.get(obj);
        if (sdm != null) {
            obj2 = sdm.A01;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public final synchronized void A01(long j) {
        while (this.A00 > j) {
            Iterator A15 = AbstractC166997dE.A15(this.A02);
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            SDM sdm = (SDM) A1K.getValue();
            this.A00 -= sdm.A00;
            Object key = A1K.getKey();
            A15.remove();
            A02(key, sdm.A01);
        }
    }

    public final synchronized void A03(Object obj, Object obj2) {
        int i;
        InterfaceC65558Tme interfaceC65558Tme;
        if ((this instanceof C58821QBe) && (interfaceC65558Tme = (InterfaceC65558Tme) obj2) != null) {
            i = interfaceC65558Tme.getSize();
        } else {
            i = 1;
        }
        long j = i;
        long j2 = this.A01;
        SDM sdm = null;
        if (j >= j2) {
            A02(obj, obj2);
        } else {
            if (obj2 != null) {
                this.A00 += j;
            }
            Map map = this.A02;
            if (obj2 != null) {
                sdm = new SDM(obj2, i);
            }
            SDM sdm2 = (SDM) map.put(obj, sdm);
            if (sdm2 != null) {
                this.A00 -= sdm2.A00;
                Object obj3 = sdm2.A01;
                if (!obj3.equals(obj2)) {
                    A02(obj, obj3);
                }
            }
            A01(j2);
        }
    }

    public final void A02(Object obj, Object obj2) {
        C63182Seh c63182Seh;
        if (this instanceof C58822QBf) {
            Queue queue = SZW.A01;
            synchronized (queue) {
                queue.offer(obj);
            }
        } else if ((this instanceof C58821QBe) && (c63182Seh = ((C58821QBe) this).A00) != null && obj2 != null) {
            SDE sde = c63182Seh.A05;
            synchronized (sde) {
                AbstractC58318PtA.A1F(sde.A01, obj2, 1);
            }
        }
    }

    public C62750SPb(long j) {
        this.A01 = j;
    }
}
