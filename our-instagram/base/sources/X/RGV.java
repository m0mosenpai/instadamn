package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes10.dex */
public final class RGV extends C61Q {
    public static int A00 = 1;

    public static final synchronized int A02(RGV rgv) {
        int i;
        synchronized (rgv) {
            i = A00;
            if (i == 1) {
                Context context = rgv.A01;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                int A05 = AbstractC58318PtA.A05(context, googleApiAvailability);
                if (A05 == 0) {
                    A00 = 4;
                    i = 4;
                } else if (googleApiAvailability.A04(context, null, A05) == null && C63392SjE.A00(context, "com.google.android.gms.auth.api.fallback") != 0) {
                    A00 = 3;
                    i = 3;
                } else {
                    A00 = 2;
                    i = 2;
                }
            }
        }
        return i;
    }

    public final C5KS A03() {
        BasePendingResult A07;
        AbstractC1335861e abstractC1335861e = this.A05;
        Context context = this.A01;
        boolean A1P = AbstractC167007dF.A1P(A02(this), 3);
        AbstractC63257SgF.A02(context);
        if (A1P) {
            C61j c61j = Status.A08;
            C3U5.A03(c61j, "Result must not be null");
            A07 = new BasePendingResult(abstractC1335861e);
            A07.A06(c61j);
        } else {
            A07 = abstractC1335861e.A07(new AbstractC60658RGk(SA2.A05, abstractC1335861e));
        }
        return AbstractC63093Sct.A00(A07);
    }
}
