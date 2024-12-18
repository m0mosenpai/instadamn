package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8MZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MZ {
    public final C185818Mb A00;
    public final C185808Ma A01;
    public final Context A02;
    public final UserSession A03;

    public C8MZ(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
        this.A01 = new C185808Ma(context, userSession);
        this.A00 = new C185818Mb(context, userSession);
    }
}
