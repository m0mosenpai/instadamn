package X;

import java.util.Calendar;

/* renamed from: X.Jer, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44127Jer extends AbstractRunnableC14200nk {
    public final /* synthetic */ C44125Jep A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44127Jer(C44125Jep c44125Jep) {
        super(1927605572, 3, false, true);
        this.A00 = c44125Jep;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C44125Jep c44125Jep = this.A00;
        long j = c44125Jep.A06.A01.getLong("copresence_model_expiration", 0L);
        long j2 = 604800000 + j;
        if (j > 0 && Calendar.getInstance().getTimeInMillis() < j2) {
            z = false;
        } else if (j > 0) {
            z = true;
        } else {
            C44125Jep.A01(c44125Jep);
            return;
        }
        c44125Jep.A04.ATO(new C44133Jey(c44125Jep, z));
    }
}
