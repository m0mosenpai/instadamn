package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.TxJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65966TxJ {
    public final ConcurrentMap A01 = new ConcurrentHashMap();
    public final ConcurrentMap A00 = new ConcurrentHashMap();

    public final synchronized C38657Gyy A00(String str) {
        C38657Gyy c38657Gyy;
        C14360o3.A0B(str, 0);
        ConcurrentMap concurrentMap = this.A01;
        if (concurrentMap.containsKey(str)) {
            c38657Gyy = (C38657Gyy) concurrentMap.get(str);
        } else {
            c38657Gyy = null;
        }
        return c38657Gyy;
    }

    public final synchronized void A01(C38657Gyy c38657Gyy, String str) {
        C14360o3.A0B(str, 0);
        this.A01.put(str, c38657Gyy);
        String str2 = c38657Gyy.A05;
        if (str2 == null) {
            str2 = c38657Gyy.A06;
        }
        Boolean bool = c38657Gyy.A00;
        if (str2 != null) {
            ConcurrentMap concurrentMap = this.A00;
            if (!concurrentMap.containsKey(str2) && bool != null) {
                AbstractC43592JPx.A1W(str2, concurrentMap, AbstractC167007dF.A1N(bool.booleanValue() ? 1 : 0));
            }
        }
    }

    public final synchronized void A02(String str) {
        if (str != null) {
            ConcurrentMap concurrentMap = this.A00;
            if (concurrentMap.containsKey(str)) {
                AbstractC43592JPx.A1W(str, concurrentMap, true);
            }
        }
    }

    public final synchronized boolean A03(C38657Gyy c38657Gyy) {
        boolean z;
        String str = c38657Gyy.A05;
        if (str == null) {
            str = c38657Gyy.A06;
        }
        Boolean bool = (Boolean) this.A00.get(str);
        if (str != null && bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized boolean A04(String str) {
        boolean A03;
        C14360o3.A0B(str, 0);
        C38657Gyy c38657Gyy = (C38657Gyy) this.A01.get(str);
        if (c38657Gyy != null) {
            A03 = A03(c38657Gyy);
        } else {
            A03 = true;
        }
        return A03;
    }
}
