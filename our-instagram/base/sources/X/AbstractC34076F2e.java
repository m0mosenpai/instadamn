package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34076F2e {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83733oI interfaceC83733oI, String str, String str2, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1N(userSession, context);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, interfaceC83733oI, 3), "link_click_copy");
        if (A0f.isSampled()) {
            AbstractC31181DnP.A0g(A0f, interfaceC83733oI);
            A0f.Cht();
        }
        if (str != null) {
            AbstractC13900nG.A01(context, str, null);
            C9GR.A07(context, 2131963335);
            if (z2) {
                AbstractC147806l5.A00(userSession).A0M(C05F.A00, AbstractC1345466e.A07(interfaceC83733oI), str2, i, z);
            }
        }
    }
}
