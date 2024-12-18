package X;

import android.R;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CST {
    public final C27101BxQ A00;
    public final C57112jm A01;
    public final C63622uj A02;
    public final C07 A03;
    public final UserSession A04;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.2uS, java.lang.Object] */
    public CST(Context context, C675432t c675432t, C18920wW c18920wW, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        AbstractC25233BEq.A0x(3, userSession, c57112jm, c675432t);
        this.A04 = userSession;
        this.A01 = c57112jm;
        this.A00 = new C27101BxQ(this, c18920wW, context.getResources().getInteger(R.integer.config_mediumAnimTime));
        this.A02 = new C63622uj();
        this.A03 = new C07(c675432t, userSession, interfaceC60442pS, AbstractC63462uT.A00(userSession), new Object());
    }
}
