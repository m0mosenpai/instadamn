package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8CX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CX extends C8CU {
    public final UserSession A00;
    public final Application A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8CX(Application application, UserSession userSession) {
        super(new C9F5(24, application, userSession));
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(application, 2);
        this.A00 = userSession;
        this.A01 = application;
    }
}
