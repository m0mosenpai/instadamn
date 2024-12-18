package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NCp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52300NCp extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C52300NCp(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A02;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, EnumC142806cg.A03);
        NYV A01 = OQX.A01(this.A01, userSession);
        return new C50938Mf7(AbstractC23021Ah.A00(userSession), A01.A01(this.A00), A00.A02(), A00.A03());
    }
}
