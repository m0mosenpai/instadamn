package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ND9 extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C677733r A03;

    public ND9(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = c677733r;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C50664MYh(userSession, AbstractC677833s.A00(this.A00, userSession, this.A02, this.A03, "AudioPreviewViewModel", AbstractC677833s.A02(userSession)));
    }
}
