package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F2L {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareTarget directShareTarget, User user, C34567FLb c34567FLb, String str) {
        boolean A1a = AbstractC167017dG.A1a(context, user);
        C14360o3.A0B(userSession, 4);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0B(EnumC142006bJ.A03);
        A0K.A06();
        A0K.A0L = A1a;
        A0K.A09 = user.Bhu();
        A0K.A0D = AbstractC31178DnM.A0c(context, user, 2131960438);
        AbstractC31175DnJ.A0l(context, A0K, 2131960830);
        A0K.A0A = new C36526G8y(context, interfaceC11380iw, userSession, directShareTarget, c34567FLb, str);
        AbstractC25233BEq.A1F(A0K);
    }
}
