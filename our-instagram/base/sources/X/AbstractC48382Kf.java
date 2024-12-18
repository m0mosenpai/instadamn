package X;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48382Kf {
    public C48412Ki A00;
    public UUID A01;
    public boolean A02;
    public final java.util.Set A03;

    public abstract C2L0 A01();

    public final void A03(C48562Ky c48562Ky) {
        C14360o3.A0B(c48562Ky, 0);
        this.A00.A0B = c48562Ky;
    }

    public final void A04(Integer num, TimeUnit timeUnit, long j) {
        this.A02 = true;
        C48412Ki c48412Ki = this.A00;
        c48412Ki.A0F = num;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            C48442Kl.A00();
            android.util.Log.w(C48412Ki.A0O, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            C48442Kl.A00();
            android.util.Log.w(C48412Ki.A0O, "Backoff delay duration less than minimum value");
        }
        c48412Ki.A03 = C17s.A06(millis, 10000L, 18000000L);
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        this.A03.add(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1.A06 != false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.2Kv] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.2Kv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2L0 A00() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC48382Kf.A00():X.2L0");
    }

    public final void A02(long j, TimeUnit timeUnit) {
        this.A00.A05 = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.A00.A05) {
        } else {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public AbstractC48382Kf(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        C14360o3.A07(randomUUID);
        this.A01 = randomUUID;
        String obj = randomUUID.toString();
        C14360o3.A07(obj);
        String name = cls.getName();
        C14360o3.A07(name);
        this.A00 = new C48412Ki(obj, name);
        this.A03 = AbstractC16830sb.A06(name);
    }
}
