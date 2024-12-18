package X;

import android.content.Context;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.73a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1569673a implements C73R {
    public final Context A00;
    public final UserSession A01;
    public final User A02;
    public final boolean A03;
    public final InterfaceC151446rm A04;
    public final C73S A05;

    public C1569673a(Context context, UserSession userSession, InterfaceC151446rm interfaceC151446rm, User user, boolean z) {
        C14360o3.A0B(interfaceC151446rm, 2);
        this.A00 = context;
        this.A04 = interfaceC151446rm;
        this.A02 = user;
        this.A01 = userSession;
        this.A03 = z;
        this.A05 = C73S.A0J;
    }

    @Override // X.C73R
    public final String Aj7() {
        return A00(this, false);
    }

    @Override // X.C73R
    public final String AjD() {
        return "shop";
    }

    public static final String A00(C1569673a c1569673a, boolean z) {
        Context context;
        int i;
        User user = c1569673a.A02;
        UserSession userSession = c1569673a.A01;
        if (AbstractC1566271k.A0A(userSession, user) == C05F.A0N) {
            context = c1569673a.A00;
            i = 2131952357;
        } else if (user.A0A() == SellerShoppableFeedType.A09) {
            context = c1569673a.A00;
            i = 2131976860;
        } else if (c1569673a.A03) {
            context = c1569673a.A00;
            i = 2131970251;
        } else {
            return FBU.A00(c1569673a.A00, userSession, user, z);
        }
        String string = context.getString(i);
        C14360o3.A0A(string);
        return string;
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A05;
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final void onClick() {
        this.A04.D0y(this.A02, "button_tray");
    }
}
