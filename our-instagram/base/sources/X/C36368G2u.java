package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.G2u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36368G2u implements InterfaceC37156GYt {
    public final Context A00;
    public final UserSession A01;
    public final Capabilities A02;
    public final E70 A03;

    public C36368G2u(Context context, UserSession userSession, Capabilities capabilities, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = e70;
        this.A02 = capabilities;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A00;
        return AbstractC166987dD.A1J(new GHY(context, ViewOnClickListenerC35658Fos.A00, 2131959128, AbstractC53242c7.A0H(context, R.attr.textColorPrimary)));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        UserSession userSession = this.A01;
        if (((C32107E9f) AbstractC166987dD.A16(AbstractC31171DnF.A0n(this.A03.A0c))).A00.CQw() && C18U.A06(C06090Tz.A05, userSession, 36329865636692532L)) {
            return true;
        }
        return false;
    }
}
