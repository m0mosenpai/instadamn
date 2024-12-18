package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132125xp {
    public final InterfaceC132105xl A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public C132125xp(InterfaceC132105xl interfaceC132105xl, Integer num, String str, List list) {
        C14360o3.A0B(num, 3);
        this.A00 = interfaceC132105xl;
        this.A03 = list;
        this.A01 = num;
        this.A02 = str;
        this.A04 = new LinkedHashMap();
    }

    public final void A00(String str, String str2, String str3) {
        long j;
        InterfaceC132105xl interfaceC132105xl;
        List list;
        Integer num;
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.A04;
        int i = -1;
        int i2 = 0;
        Integer num2 = null;
        if (!map.containsKey(str)) {
            interfaceC132105xl = this.A00;
            list = this.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!C14360o3.A0K(((C38321qM) it.next()).getId(), str)) {
                        i2++;
                    } else {
                        i = i2;
                        break;
                    }
                }
                num2 = Integer.valueOf(i);
                num = Integer.valueOf(list.size());
            }
            num = null;
        } else {
            Number number = (Number) map.get(str);
            if (number != null) {
                j = number.longValue();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j > TimeUnit.SECONDS.toMillis(60L)) {
                interfaceC132105xl = this.A00;
                z = true;
                list = this.A03;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!C14360o3.A0K(((C38321qM) it2.next()).getId(), str)) {
                            i2++;
                        } else {
                            i = i2;
                            break;
                        }
                    }
                    num2 = Integer.valueOf(i);
                    num = Integer.valueOf(list.size());
                }
                num = null;
            } else {
                return;
            }
        }
        interfaceC132105xl.EIL(num2, num, str, str2, str3, AbstractC123875j1.A00(this.A01), this.A02, z);
        map.put(str, Long.valueOf(currentTimeMillis));
    }
}
