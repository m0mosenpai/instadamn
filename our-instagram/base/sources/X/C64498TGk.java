package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.TGk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64498TGk implements C5OV {
    public final Context A00;
    public final UserSession A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        Context context = this.A00;
        if (C1VW.isLocationPermitted(context, this.A01, "LOCATION_SERVICE_ENABLED_FILTER") && C1VW.isLocationEnabled(context)) {
            return true;
        }
        return false;
    }

    public C64498TGk(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
