package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CWU {
    public final CRZ A00;

    public final SpannableStringBuilder A01(Context context, C25993Beh c25993Beh, int i, int i2) {
        String A19;
        User A2D;
        C14360o3.A0B(c25993Beh, 1);
        CRZ crz = this.A00;
        C38321qM c38321qM = c25993Beh.A01;
        C75113Zb c75113Zb = c25993Beh.A02;
        User user = c25993Beh.A03;
        AbstractC25233BEq.A0v(1, c38321qM, c75113Zb, user);
        boolean A2N = user.A2N();
        UserSession userSession = crz.A00;
        if (A2N) {
            A19 = AbstractC41071vF.A0J(AbstractC41071vF.A0G(userSession, c38321qM));
        } else {
            A19 = AbstractC166987dD.A19(AbstractC76333bd.A00(userSession, c38321qM));
        }
        C38321qM A1e = c38321qM.A1e(i2);
        String str = null;
        if (A1e == null || (A2D = A1e.A0C.Azy()) == null || !AbstractC41071vF.A0Q(userSession, c38321qM)) {
            A2D = c38321qM.A2D();
        }
        if (A2D != null) {
            if (A2D.A2N()) {
                String fullName = A2D.getFullName();
                if (fullName != null) {
                    str = AbstractC41071vF.A0J(fullName);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                str = A2D.getUsername();
            }
        }
        int i3 = 2131953774;
        if (AbstractC41071vF.A0a(c38321qM)) {
            i3 = 2131953784;
        }
        String A0u = AbstractC25227BEk.A0u(context, i3);
        C29937DHz c29937DHz = new C29937DHz(c38321qM, A2D, crz, c75113Zb, i, 6);
        C14360o3.A0B(A0u, 0);
        C14360o3.A0B(A19, 1);
        if (str != null && str.length() != 0) {
            SpannableStringBuilder A02 = AbstractC75103Za.A02(A19, str, A0u);
            AnonymousClass773.A03(A02, new C31745Dwy(c29937DHz, 2), str);
            return A02;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A19);
        A0H.setSpan(new CharacterStyle(), 0, A0H.length(), 33);
        return A0H;
    }

    public final View.OnTouchListener A02(InterfaceC60442pS interfaceC60442pS, C25993Beh c25993Beh) {
        String str;
        C14360o3.A0B(c25993Beh, 0);
        CRZ crz = this.A00;
        C38321qM c38321qM = c25993Beh.A01;
        User user = c25993Beh.A03;
        AbstractC167007dF.A1K(c38321qM, user);
        InterfaceC75453aC interfaceC75453aC = crz.A01;
        String id = user.getId();
        if (interfaceC60442pS == null || (str = interfaceC60442pS.getModuleName()) == null) {
            str = "";
        }
        return interfaceC75453aC.DuM(c38321qM, id, str);
    }

    public CWU(CRZ crz) {
        this.A00 = crz;
    }

    public final Drawable A00(Context context, C25993Beh c25993Beh, String str, int i) {
        User user;
        String str2;
        AbstractC167017dG.A1Q(c25993Beh, str);
        CRZ crz = this.A00;
        C38321qM c38321qM = c25993Beh.A01;
        C14360o3.A0B(c38321qM, 1);
        if (AbstractC41071vF.A0Q(crz.A00, c38321qM)) {
            C57332k8 c57332k8 = crz.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            C38321qM A1e = c38321qM.A1e(i);
            String str3 = null;
            if (A1e != null) {
                user = A1e.A0C.Azy();
            } else {
                user = null;
            }
            User A2E = c38321qM.A2E(c57332k8.A0J);
            if (user != null) {
                A1E.add(user);
            }
            if (A2E != null) {
                A1E.add(A2E);
                str2 = A2E.getId();
            } else {
                str2 = null;
            }
            if (user != null) {
                str3 = user.getId();
            }
            return C57332k8.A02(context, c57332k8, AnonymousClass001.A0T(str2, str3, '_'), str, A1E);
        }
        return crz.A02.A06(context, c38321qM, str);
    }

    public final void A03(View view, C25993Beh c25993Beh, int i) {
        boolean A1a = AbstractC167017dG.A1a(view, c25993Beh);
        CRZ crz = this.A00;
        C38321qM c38321qM = c25993Beh.A01;
        C75113Zb c75113Zb = c25993Beh.A02;
        User user = c25993Beh.A03;
        AbstractC25233BEq.A0w(2, c38321qM, c75113Zb, user);
        C71313Hs.A00(crz.A00).A07(view, EnumC71343Hv.A0h, new String[0], A1a ? 1 : 0);
        if (user.A2N()) {
            crz.A01.D3k(c38321qM, c75113Zb, i, false);
        } else {
            crz.A01.D4g(c38321qM, c75113Zb, user.getId(), i, false);
        }
    }
}
