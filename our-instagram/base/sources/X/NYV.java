package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NYV extends NYW {
    public C56805PIw A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public final C56805PIw A01(Context context) {
        C14360o3.A0B(context, 0);
        C56805PIw c56805PIw = this.A00;
        if (c56805PIw == null) {
            UserSession userSession = ((AbstractC147746kz) this).A01;
            InterfaceC11380iw interfaceC11380iw = ((AbstractC147746kz) this).A00;
            C56805PIw c56805PIw2 = new C56805PIw(context, AbstractC12220kQ.A01(interfaceC11380iw, userSession), interfaceC11380iw, userSession);
            this.A00 = c56805PIw2;
            return c56805PIw2;
        }
        return c56805PIw;
    }

    public NYV(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(interfaceC11380iw, userSession, EnumC142806cg.A03);
        this.A01 = AbstractC09440dt.A01(C57541PgF.A01(userSession, 2));
        this.A03 = AbstractC09440dt.A01(C57532Pg6.A00(interfaceC11380iw, userSession, 10));
        this.A02 = AbstractC09440dt.A01(C57541PgF.A01(userSession, 3));
    }
}
