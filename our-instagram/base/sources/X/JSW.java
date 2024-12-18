package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes8.dex */
public final class JSW {
    public final GoogleApiAvailability A00;

    public final boolean A00(Context context) {
        if (this.A00.A03(context, 222116045) == 0) {
            return true;
        }
        return false;
    }

    public JSW(GoogleApiAvailability googleApiAvailability) {
        this.A00 = googleApiAvailability;
    }
}
