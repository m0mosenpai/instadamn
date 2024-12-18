package X;

/* renamed from: X.Rq7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61583Rq7 {
    public final long A00(EnumC61103RfI enumC61103RfI, int i, long j) {
        long j2;
        RF1 rf1 = (RF1) this;
        long C8K = j - rf1.A00.C8K();
        RF0 rf0 = (RF0) ((AbstractC61293RlD) rf1.A01.get(enumC61103RfI));
        long j3 = rf0.A00;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), C8K), rf0.A01);
    }
}
