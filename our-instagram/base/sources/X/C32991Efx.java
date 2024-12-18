package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Efx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32991Efx extends Eg1 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C34561FKv A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32991Efx(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, InterfaceC11380iw interfaceC11380iw2, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, C34561FKv c34561FKv, EnumC31713DwI enumC31713DwI, String str, String str2) {
        super(fragment, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, str, str2);
        this.A02 = c34561FKv;
        this.A01 = interfaceC11380iw2;
        this.A00 = fragmentActivity;
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        if (this.A02.A02) {
            C83743oJ A01 = C83743oJ.A01(userSession);
            String id = user.getId();
            A01.A09(this.A00, this.A01, userSession, C05F.A05, id, true);
        }
        super.A03(userSession, user);
    }
}
