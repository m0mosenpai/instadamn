package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GA5 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        boolean A1R = AbstractC167007dF.A1R(0, c5hw, enumC33370Ep3);
        C31250DoY c31250DoY = this.A00;
        C51693MsO A0a = AbstractC31173DnH.A0a(mud, enumC33370Ep3, i);
        UserSession userSession = c31250DoY.A0A;
        AbstractC59962oe abstractC59962oe = c31250DoY.A07;
        FragmentActivity fragmentActivity = c31250DoY.A05;
        String str = c5hw.A04.A0b;
        str.getClass();
        String str2 = c5hw.A04.A0c;
        str2.getClass();
        String str3 = c5hw.A04.A0f;
        str3.getClass();
        String str4 = c5hw.A04.A0h;
        str4.getClass();
        ImageUrl imageUrl = c5hw.A04.A0E;
        imageUrl.getClass();
        C22P c22p = C22P.A5W;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1D(abstractC59962oe, A1R ? 1 : 0, fragmentActivity);
        AbstractC23021Ah.A00(userSession).A0M();
        User user = new User(str3, str4);
        user.A0i(imageUrl);
        INH A0C = AbstractC86593tX.A0C(c22p);
        A0C.A05 = AKE.A00(user, str, str2);
        AbstractC41671Ic3.A00(fragmentActivity, A0C.A00(), abstractC59962oe, c22p, userSession);
        C31250DoY.A0C(c31250DoY, A0a, c5hw);
    }

    public GA5(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A0A) {
            C5HX c5hx = c5hw.A04;
            if (c5hx.A0b != null && c5hx.A0c != null && c5hx.A0f != null && c5hx.A0h != null && c5hx.A0E != null) {
                return true;
            }
        }
        return false;
    }
}
