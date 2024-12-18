package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IL2 {
    public final Context A00;

    public final void A00(DialogInterface.OnClickListener onClickListener, UserSession userSession, C38321qM c38321qM, Integer num) {
        int i;
        int A06 = AbstractC167007dF.A06(0, num, userSession);
        Context context = this.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        C55101ObE c55101ObE = new C55101ObE(userSession, context);
        switch (num.intValue()) {
            case 0:
                A0I.A0A(2131969130);
                A0I.A09(2131969129);
                A0I.A0L(new DialogInterfaceOnClickListenerC41837Ifr(userSession, c38321qM, this, c55101ObE, 1), 2131963446);
                A0I.A0s(true);
                A0I.A0t(true);
                A0I.A0D(onClickListener);
                break;
            case 1:
                A0I.A0A(2131969209);
                A0I.A09(2131969207);
                A0I.A0L(new DialogInterfaceOnClickListenerC41837Ifr(userSession, c38321qM, this, c55101ObE, A06), 2131969208);
                A0I.A0s(true);
                A0I.A0t(true);
                A0I.A06();
                break;
            case 2:
                A0I.A0A(2131969122);
                A0I.A09(2131969120);
                A0I.A07();
                A0I.A0I(onClickListener, 2131969121);
                A0I.A0s(true);
                A0I.A0t(true);
                c55101ObE.A06(true);
                break;
            case 3:
                A0I.A0A(2131969187);
                A0I.A09(2131969186);
                A0I.A07();
                A0I.A0s(true);
                A0I.A0t(true);
                c55101ObE.A06(false);
                break;
            case 4:
                A0I.A0A(2131969189);
                i = 2131969188;
                A0I.A09(i);
                A0I.A07();
                A0I.A0s(true);
                A0I.A0t(true);
                break;
            case 5:
                A0I.A0A(2131969189);
                i = 2131969190;
                A0I.A09(i);
                A0I.A07();
                A0I.A0s(true);
                A0I.A0t(true);
                break;
            case 6:
                A0I.A0A(2131969189);
                i = 2131969185;
                A0I.A09(i);
                A0I.A07();
                A0I.A0s(true);
                A0I.A0t(true);
                break;
            default:
                A0I.A0A(2131969124);
                i = 2131969123;
                A0I.A09(i);
                A0I.A07();
                A0I.A0s(true);
                A0I.A0t(true);
                break;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        try {
            AbstractC166987dD.A1W(A0I);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public IL2(Context context) {
        this.A00 = context;
    }
}
