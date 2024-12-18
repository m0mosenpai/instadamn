package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.PresenceSubscriptionIDStore;

/* renamed from: X.4Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C94064Kq implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public /* synthetic */ C94064Kq(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        UserSession userSession = this.A01;
        Context context = this.A00;
        C41981wo A00 = C41981wo.A00(userSession);
        return new C94054Kp(context, new C41761wQ(null), userSession, AbstractC42291xJ.A00(userSession), A00, PresenceSubscriptionIDStore.getInstance(userSession));
    }
}
