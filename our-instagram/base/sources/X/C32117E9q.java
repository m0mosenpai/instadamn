package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.E9q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32117E9q extends AbstractC32319ELj {
    public static final String __redex_internal_original_name = "PasswordCreationForUnlinkingFragment";
    public UserSession A00;
    public User A01;
    public String A02;
    public String A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Jk, java.lang.Object] */
    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        C34574FLj c34574FLj = new C34574FLj(requireContext(), AbstractC018607g.A00(this), new C32548EUy(this, 1), AbstractC167007dF.A0g(super.A03));
        C09Y c09y = C023409i.A0A;
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("targetUserId");
            throw C00O.createAndThrow();
        }
        c09y.A0A(new Object(), null, c34574FLj, str);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("currentUserSession");
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.AbstractC32319ELj, X.InterfaceC11380iw
    public final String getModuleName() {
        return "password_creation_unlinking";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String str;
        int A02 = C0f9.A02(1412811580);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments.getString("child_user_id_key");
        if (string != null) {
            this.A03 = string;
            UserSession userSession = this.A00;
            if (userSession == null) {
                str = "currentUserSession";
            } else {
                InterfaceC02900Bo A00 = C0BQ.A00(userSession);
                String str2 = this.A03;
                if (str2 == null) {
                    str = "targetUserId";
                } else {
                    User BOa = A00.BOa(str2);
                    if (BOa != null) {
                        this.A01 = BOa;
                        String string2 = requireArguments.getString("main_user_id_key");
                        if (string2 != null) {
                            this.A02 = string2;
                            EVO.A00(this);
                            C0f9.A09(1025407240, A02);
                            return;
                        }
                        A14 = AbstractC166987dD.A14("No MAIN_USER_ID_KEY in the argument!");
                        i = -1059155806;
                    } else {
                        A14 = AbstractC166987dD.A14("No targetUser in the argument!");
                        i = -1356892011;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A14 = AbstractC166987dD.A14("No CHILD_USER_ID_KEY in the argument!");
        i = -370070264;
        C0f9.A09(i, A02);
        throw A14;
    }
}
