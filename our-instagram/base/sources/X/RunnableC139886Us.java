package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC139886Us implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C138746Qe A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public RunnableC139886Us(C138746Qe c138746Qe, String str, Map map, long j) {
        this.A02 = str;
        this.A01 = c138746Qe;
        this.A03 = map;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map = C138746Qe.A08;
        String str = this.A02;
        Number number = (Number) map.get(str);
        C139446Sz c139446Sz = C139446Sz.A00;
        C138746Qe c138746Qe = this.A01;
        int hashCode = c138746Qe.A05.hashCode();
        int A00 = C139446Sz.A00(str, 906037831, hashCode);
        if (number == null || A00 < number.intValue()) {
            Map map2 = this.A03;
            if (map2 == null) {
                C139446Sz.A02(c138746Qe.A04, str, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            } else {
                AbstractC139906Uu abstractC139906Uu = new AbstractC139906Uu(str, map2);
                c139446Sz.A05(c138746Qe.A04, abstractC139906Uu, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            }
            C138746Qe.A02(c138746Qe, str);
            C138746Qe.A00(c138746Qe, hashCode);
        }
    }
}
