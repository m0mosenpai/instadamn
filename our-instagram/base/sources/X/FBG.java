package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FBG {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        C1P1 c32538EUo;
        C14360o3.A0B(userSession, 1);
        String str = C1F8.A00(userSession).A04;
        if (context != null) {
            Boolean valueOf = Boolean.valueOf(z2);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("accounts/fetch_onetap/");
            AbstractC31178DnM.A0n(context, A0c, AbstractC37314GcG.A01(0, 9, 28), C16030qx.A00(context));
            A0c.A0F("is_app_level_spi", valueOf);
            A0c.A0F("is_removal_only", Boolean.valueOf(z3));
            AbstractC31176DnK.A1O(C19T.A28, A0c, AbstractC31172DnG.A0P(userSession));
            C1ON A0D = AbstractC31175DnJ.A0D(A0c, C32197ECs.class, C34819FVv.class, true);
            if (z3) {
                c32538EUo = new C32494ESu(userSession);
            } else {
                c32538EUo = new C32538EUo(context, interfaceC11380iw, userSession, str, z4, z);
            }
            A0D.A00 = c32538EUo;
            C1GJ.A03(A0D);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
