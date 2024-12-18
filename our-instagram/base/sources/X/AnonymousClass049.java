package X;

import android.app.Application;
import android.os.SystemClock;
import java.util.Calendar;

/* renamed from: X.049, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass049 implements C0LR {
    public Application A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0c;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C0NN A00 = C0NN.A00(this.A00);
        c024209q.A02(C0LK.A1t, Long.valueOf((Calendar.getInstance().getTimeInMillis() - SystemClock.elapsedRealtime()) / 1000));
        C10860hv c10860hv = C0LK.A1s;
        String A01 = A00.A01(c10860hv.A00, "0");
        if (A01 != null) {
            c024209q.A02(c10860hv, Long.valueOf(Long.parseLong(A01)));
        }
        C10860hv c10860hv2 = C0LK.A1u;
        String A012 = A00.A01(c10860hv2.A00, "0");
        if (A012 != null) {
            c024209q.A02(c10860hv2, Long.valueOf(Long.parseLong(A012)));
        }
    }
}
