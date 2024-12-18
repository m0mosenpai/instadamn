package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48372Ke extends AbstractC48382Kf {
    @Override // X.AbstractC48382Kf
    public final /* bridge */ /* synthetic */ C2L0 A01() {
        if (this.A02 && this.A00.A0B.A06) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        C48412Ki c48412Ki = this.A00;
        if (!c48412Ki.A0J) {
            return new C2L0(c48412Ki, this.A03, this.A01);
        }
        throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
    }

    public C48372Ke(Class cls, TimeUnit timeUnit, long j) {
        super(cls);
        C48412Ki c48412Ki = this.A00;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            C48442Kl.A00();
            android.util.Log.w(C48412Ki.A0O, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        millis = millis < 900000 ? 900000L : millis;
        c48412Ki.A01(millis, millis);
    }
}
