package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3RS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RS {
    public final C3SD A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final Context A03;

    public C3RS(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A03 = context;
        C17050sx A01 = AbstractC09440dt.A01(new C206859Dq(this, 46));
        this.A02 = A01;
        this.A00 = C3RV.A00(context, (C3RT) A01.getValue(), userSession);
    }
}
