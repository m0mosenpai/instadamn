package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OkX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLongClickListenerC55478OkX implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnLongClickListenerC55478OkX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                C54391O1x c54391O1x = ((C51166MjA) this.A02).A04;
                if (c54391O1x == null) {
                    return true;
                }
                C3OO c3oo = (C3OO) this.A01;
                View A06 = AbstractC31171DnF.A06(c3oo);
                InterfaceC58195Pr1 interfaceC58195Pr1 = ((C51224Mk9) c3oo).A00;
                if (interfaceC58195Pr1 == null) {
                    return true;
                }
                Bitmap AzJ = interfaceC58195Pr1.AzJ(view.getWidth(), view.getHeight());
                C52254NAu c52254NAu = c54391O1x.A00;
                InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
                if (interfaceC58203Pr9.indexOfChild(A06) != interfaceC58203Pr9.AuK()) {
                    return true;
                }
                C52254NAu.A0I(AzJ, A06, c52254NAu);
                return true;
            case 1:
                return true;
            case 2:
                C38522Gwi c38522Gwi = (C38522Gwi) this.A01;
                UserSession userSession = (UserSession) this.A02;
                view.getClass();
                Context context = view.getContext();
                JPd jPd = c38522Gwi.A01;
                jPd.getClass();
                String str = c38522Gwi.A0G;
                return c38522Gwi.A03(context, userSession, c38522Gwi.A06, c38522Gwi.A07, jPd, str);
            default:
                C54445O3z c54445O3z = (C54445O3z) this.A01;
                AbstractC151906sa abstractC151906sa = (AbstractC151906sa) this.A02;
                C56765PHi c56765PHi = c54445O3z.A00.A00;
                if (c56765PHi != null) {
                    c56765PHi.A01 = true;
                    c56765PHi.A00(abstractC151906sa);
                    return true;
                }
                return true;
        }
    }
}
