package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JK, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8JK implements C8JL {
    public boolean A00 = true;
    public final Context A01;
    public final UserSession A02;

    public C8JK(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A01 = context;
    }

    public final boolean A03() {
        AbstractC55106ObM A00;
        C190298bn A01 = C190298bn.A03.A01(this.A02);
        if (A01 != null && (A00 = A01.A00()) != null && A00.A0J()) {
            return true;
        }
        return false;
    }

    @Override // X.C8JL
    public final void DtV() {
        if (A03()) {
            APQ();
        }
    }
}
