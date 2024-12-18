package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2NN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2NN {
    public C49352Or A00;
    public C49082Nb A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final UserSession A05;

    public final C49082Nb A00() {
        C49082Nb c49082Nb = this.A01;
        if (c49082Nb != null) {
            return c49082Nb;
        }
        C14360o3.A0F("uplLogger");
        throw C00O.createAndThrow();
    }

    public C2NN(Context context, UserSession userSession) {
        this.A04 = context;
        this.A05 = userSession;
    }

    public C2NN() {
    }
}
