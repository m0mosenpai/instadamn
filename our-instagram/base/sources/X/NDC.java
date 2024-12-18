package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDC extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        NYV nyv;
        UserSession userSession = this.A02;
        EnumC142806cg enumC142806cg = this.A03;
        C52817NZa A00 = AbstractC54266Nym.A00(userSession, enumC142806cg);
        C190308bo c190308bo = C190298bn.A03;
        Context context = this.A00;
        C190298bn A002 = c190308bo.A00(context, userSession);
        C56805PIw c56805PIw = null;
        if (enumC142806cg == EnumC142806cg.A03) {
            nyv = OQX.A01(this.A01, userSession);
        } else {
            nyv = null;
        }
        MTU A03 = A00.A03();
        OLC A02 = A00.A02();
        AbstractC55106ObM A003 = A002.A00();
        if (nyv != null) {
            C14360o3.A0B(context, 0);
            c56805PIw = nyv.A01(context);
        }
        return new C50957MfQ(AnonymousClass229.A01(userSession), A003, c56805PIw, A02, A03);
    }

    public NDC(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        MSZ.A1O(userSession, enumC142806cg);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = enumC142806cg;
    }
}
