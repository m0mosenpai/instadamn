package X;

import android.content.Context;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class GPC implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;

    public GPC(Context context, UserSession userSession, ImageUrl imageUrl) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = imageUrl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2OG A01 = C2OG.A01();
        UserSession userSession = this.A01;
        C34648FOf A00 = C35129FeW.A00(userSession.userId);
        A00.A0G = "promote_sent_for_approval_rebranding";
        A00.A0H = this.A00.getString(2131970939);
        A00.A04 = this.A02;
        A00.A0I = false;
        A00.A03 = PushChannelType.A09;
        A00.A08 = new G8M(userSession, 1);
        C35129FeW.A01(A00, A01);
    }
}
