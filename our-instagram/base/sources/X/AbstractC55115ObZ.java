package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

/* renamed from: X.ObZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55115ObZ {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, User user, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1R(userSession, interfaceC16660sJ);
        C28261Yl.A00.A00(abstractC59962oe.requireContext(), null, userSession, user, new C36765GIo(interfaceC16660sJ, 8), abstractC59962oe.getModuleName(), null, user.getUsername());
    }

    public static final void A01(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C31368DqX.A02(AbstractC31175DnJ.A0C(abstractC59962oe, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(userSession, str, "wonder_wall", abstractC59962oe.getModuleName()));
    }

    public static final void A02(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C31368DqX.A02(AbstractC31175DnJ.A0C(abstractC59962oe, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A02(userSession, str, "wonder_wall", abstractC59962oe.getModuleName()));
    }

    public static final void A03(AbstractC59962oe abstractC59962oe, WallText wallText) {
        String str;
        C14360o3.A0B(abstractC59962oe, 0);
        Context context = abstractC59962oe.getContext();
        if (context != null) {
            if (wallText instanceof WallText.Res) {
                WallText.Res res = (WallText.Res) wallText;
                int i = res.A00;
                String[] strArr = res.A01;
                str = context.getString(i, Arrays.copyOf(strArr, strArr.length));
            } else if (wallText instanceof WallText.Raw) {
                str = ((WallText.Raw) wallText).A00;
            } else {
                throw B4Z.A00();
            }
            C14360o3.A0A(str);
            C9GR.A03(context, str, "wall", 0);
        }
    }
}
