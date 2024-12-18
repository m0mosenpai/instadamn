package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2mG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58572mG {
    public final long A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public C58572mG(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = TimeUnit.HOURS.toSeconds(C18U.A01(C06090Tz.A05, userSession, 36597712681962397L));
        this.A02 = AbstractC09440dt.A01(new C9E1(this, 44));
    }

    public final void A00(Context context) {
        C14360o3.A0B(context, 0);
        new C77433dT(context, this.A01).A00(new C9FA(33, this, context));
    }
}
