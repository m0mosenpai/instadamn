package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9G3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G3 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G3(Object obj, Object obj2, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
        this.A02 = obj2;
        this.A04 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            C6PU c6pu = (C6PU) this.A03;
            QuickPerformanceLogger quickPerformanceLogger = c6pu.A01;
            int hashCode = c6pu.A00.hashCode();
            long j = this.A01;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            HashMap hashMap = new HashMap();
            hashMap.put("error", "general_error");
            hashMap.put("error_msg", this.A04);
            C139446Sz.A04(quickPerformanceLogger, hashMap, timeUnit, 51511298, hashCode, j, (short) 3);
        } else {
            Map map = C6PU.A04;
            String str = this.A04;
            Number number = (Number) map.get(str);
            C139446Sz c139446Sz = C139446Sz.A00;
            C6PU c6pu2 = (C6PU) this.A03;
            int hashCode2 = c6pu2.A00.hashCode();
            int A00 = C139446Sz.A00(str, 51511298, hashCode2);
            if (number == null || A00 < number.intValue()) {
                Map map2 = (Map) this.A02;
                if (map2 == null) {
                    C139446Sz.A02(c6pu2.A01, str, TimeUnit.NANOSECONDS, 51511298, hashCode2, this.A01);
                } else {
                    AbstractC139906Uu abstractC139906Uu = new AbstractC139906Uu(str, map2);
                    c139446Sz.A05(c6pu2.A01, abstractC139906Uu, TimeUnit.NANOSECONDS, 51511298, hashCode2, this.A01);
                }
            }
        }
        return C0eB.A00;
    }
}
