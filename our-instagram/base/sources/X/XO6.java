package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class XO6 {
    public int A00;
    public XO7 A0E;
    public String A0F;
    public long A01 = -1;
    public C0JO A0D = AwakeTimeSinceBootClock.INSTANCE;
    public C20030yX A06 = new C005001p(0);
    public C20030yX A02 = new C005001p(0);
    public C20030yX A05 = new C005001p(0);
    public C20030yX A0B = new C005001p(0);
    public C20030yX A08 = new C005001p(0);
    public C20030yX A09 = new C005001p(0);
    public C20030yX A07 = new C005001p(0);
    public C20030yX A03 = new C005001p(0);
    public C20030yX A04 = new C005001p(0);
    public C20030yX A0A = new C005001p(0);
    public C012504o A0C = new C012504o();

    public static void A00(XO6 xo6, Long l, Object obj, String str) {
        C20030yX c20030yX = xo6.A05;
        Number number = (Number) c20030yX.get(str);
        if (number != null) {
            long longValue = l.longValue() - number.longValue();
            c20030yX.remove(str);
            if (xo6.A00 == 0) {
                xo6.A06.put(str, obj);
                C20030yX c20030yX2 = xo6.A09;
                if (c20030yX2.get(str) != null) {
                    c20030yX2.get(str);
                }
                C20030yX c20030yX3 = xo6.A07;
                if (c20030yX3.get(str) != null) {
                    c20030yX3.get(str);
                }
                if (longValue >= 0) {
                    xo6.A0F.getClass();
                    obj.getClass();
                    boolean contains = xo6.A0C.contains(str);
                    if (xo6.A01 != -1) {
                        TimeUnit.MILLISECONDS.toMillis(xo6.A0D.now() - xo6.A01);
                    }
                    C34961Fal c34961Fal = new C34961Fal(obj, 1, longValue, longValue, longValue, longValue, contains);
                    xo6.A0E.A00.Ck7(c34961Fal, c34961Fal.A06);
                    return;
                }
                return;
            }
            long j = longValue;
            C20030yX c20030yX4 = xo6.A08;
            Number number2 = (Number) c20030yX4.get(str);
            if (number2 != null) {
                j = Math.max(number2.longValue(), longValue);
            }
            c20030yX4.put(str, Long.valueOf(j));
            long j2 = longValue;
            C20030yX c20030yX5 = xo6.A0B;
            Number number3 = (Number) c20030yX5.get(str);
            if (number3 != null) {
                j2 = longValue + number3.longValue();
            }
            c20030yX5.put(str, Long.valueOf(j2));
            C20030yX c20030yX6 = xo6.A03;
            if (!c20030yX6.containsKey(str)) {
                c20030yX6.put(str, Long.valueOf(longValue));
            }
            xo6.A04.put(str, Long.valueOf(longValue));
            long j3 = -1;
            if (xo6.A01 != -1) {
                j3 = TimeUnit.MILLISECONDS.toMillis(xo6.A0D.now() - xo6.A01);
            }
            xo6.A0A.put(str, Long.valueOf(j3));
            if (xo6.A00 != 1) {
                return;
            }
            xo6.A06.put(str, obj);
        }
    }
}
