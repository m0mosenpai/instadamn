package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.G8i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36510G8i implements InterfaceC58152PqH {
    public final /* synthetic */ C57932l6 A00;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36510G8i(C57932l6 c57932l6) {
        this.A00 = c57932l6;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C57932l6 c57932l6 = this.A00;
        UserSession userSession = c57932l6.A07;
        userSession.getClass();
        if (AbstractC54472f1.A02()) {
            if (!C31518Dt2.A05()) {
                C31518Dt2.A02(c57932l6.A02, EnumC31512Dsw.A0B, userSession, C05F.A00);
                return;
            }
            return;
        }
        String str = userSession.token;
        C14360o3.A0B(str, 0);
        Bundle A09 = AbstractC31176DnK.A09(str);
        AbstractC31171DnF.A13(A09, "login_snack_bar");
        A09.putBoolean(AbstractC111324zv.A00(268), AbstractC35181FfY.A02(userSession));
        A09.putBoolean(AbstractC111324zv.A00(433), false);
        A09.putBoolean(AbstractC111324zv.A00(434), false);
        C189478aR A0N = AbstractC31175DnJ.A0N(userSession);
        Context context = c57932l6.A02;
        ENI eni = new ENI();
        eni.setArguments(A09);
        A0N.A03(context, eni);
    }
}
