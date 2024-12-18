package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes8.dex */
public final class LHp {
    public static final LHp A00 = new Object();

    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C14360o3.A07(googleApiAvailability);
        return AbstractC167007dF.A1N(googleApiAvailability.A03(context, 12451000));
    }
}
