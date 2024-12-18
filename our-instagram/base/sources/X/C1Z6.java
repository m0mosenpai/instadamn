package X;

import android.app.Notification;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.1Z6, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Z6 implements InterfaceC13050lr {
    public static C1Z5 A00 = C1Z7.A00;
    public static C1Z6 A01;

    public abstract void A01();

    public abstract void A02();

    public abstract void A03(Notification notification, Context context, List list);

    public abstract boolean A04();

    public static C1Z6 A00(final UserSession userSession) {
        C1Z6 c1z6;
        if (userSession == null) {
            synchronized (C1Z6.class) {
                c1z6 = A01;
                if (c1z6 == null) {
                    c1z6 = A00.ALL(AbstractC12290kX.A00, null);
                    A01 = c1z6;
                }
            }
            return c1z6;
        }
        return (C1Z6) userSession.A01(C1Z6.class, new InterfaceC16820sZ() { // from class: X.2Jg
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C1Z6.A00.ALL(AbstractC12290kX.A00, UserSession.this);
            }
        });
    }
}
