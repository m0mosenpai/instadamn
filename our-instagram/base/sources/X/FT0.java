package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FT0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC83713oG c122145g6;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        Object A02 = c6fw.A02();
        String A0f = AbstractC31171DnF.A0f(A02);
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, A0f);
        String str2 = (String) A00;
        Object A032 = c6fw.A03(3);
        C14360o3.A0C(A032, A0f);
        String str3 = (String) A032;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        C2DS A002 = AbstractC28761aE.A00(userSession);
        User user = new User(str2, "");
        List A0j = AbstractC31177DnL.A0j(user);
        C81663kb BZR = A002.BZR(null, null, null, A0j);
        String str4 = BZR.BKb().A00;
        if (str4 != null) {
            c122145g6 = AbstractC31171DnF.A0N(str4);
        } else {
            c122145g6 = new C122145g6(AbstractC31177DnL.A0j(user));
        }
        C41761wQ A0S = AbstractC31173DnH.A0S();
        C7TG A003 = AbstractC165967bO.A00(userSession);
        List A1J = AbstractC166987dD.A1J(user);
        A0S.A02(A003.EOb(null, null, null, null, C2EY.A1i, c122145g6, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, null, null, null, null, A1J, false, false), new GK5(A04, A08, c6fg, c6fq, A0S, userSession, BZR, A002, str2, str4, str3, A0j));
        return null;
    }

    public static final void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EC c2ec, String str, List list) {
        ImageUrl imageUrl;
        User CDl = c2ec.CDl(str);
        if (c2ec.CDl(str) != null) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0B(EnumC142006bJ.A03);
            A0K.A06();
            A0K.A0L = true;
            if (CDl != null) {
                imageUrl = CDl.Bhu();
            } else {
                imageUrl = null;
            }
            A0K.A09 = imageUrl;
            AbstractC25226BEj.A1N(context, A0K, 2131964905);
            AbstractC31175DnJ.A0l(context, A0K, 2131960830);
            A0K.A0A(new G98(0, context, list, c2ec, userSession, interfaceC11380iw));
            AbstractC25233BEq.A1F(A0K);
        }
    }
}
