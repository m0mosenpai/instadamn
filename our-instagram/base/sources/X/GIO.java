package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIO implements C7K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public GIO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A06 = obj6;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A07 = str;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
        Object obj;
        C6FQ c6fq;
        Object obj2;
        switch (this.A00) {
            case 0:
                obj = this.A03;
                c6fq = (C6FQ) obj;
                obj2 = this.A05;
                break;
            case 1:
                obj = this.A04;
                c6fq = (C6FQ) obj;
                obj2 = this.A05;
                break;
            default:
                c6fq = (C6FQ) this.A03;
                obj2 = this.A04;
                break;
        }
        AbstractC31171DnF.A1K(c6fq, (InterfaceC103384lE) obj2);
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(user, 0);
                ComponentActivity componentActivity = (ComponentActivity) this.A01;
                UserSession userSession = (UserSession) this.A06;
                InterfaceC37205GaG interfaceC37205GaG = (InterfaceC37205GaG) this.A04;
                String str = this.A07;
                C28151Xt c28151Xt = C28151Xt.A02;
                if (c28151Xt == null) {
                    return;
                }
                AbstractC31171DnF.A1O(componentActivity);
                c28151Xt.A03(componentActivity, AbstractC018607g.A00(componentActivity), userSession, interfaceC37205GaG, user.getId(), str, null, null);
                return;
            case 1:
                C14360o3.A0B(user, 0);
                Context context = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A06;
                InterfaceC37219GaU interfaceC37219GaU = (InterfaceC37219GaU) this.A02;
                String str2 = this.A07;
                String A00 = AbstractC34332FCa.A00(str2);
                user.getUsername();
                AbstractC167007dF.A1K(context, userSession2);
                AbstractC34336FCe.A00(context, userSession2, user, interfaceC37219GaU, str2, A00, null, 0, false);
                return;
            case 2:
                Activity activity = (Activity) this.A01;
                UserSession userSession3 = (UserSession) this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                AbstractC25234BEr.A1P(activity, userSession3, user);
                C6FQ c6fq = (C6FQ) this.A03;
                C189478aR A06 = AbstractC70200WGp.A06(C6BQ.A09(c6fq));
                C189448aO A0y = AbstractC25225BEi.A0y(userSession3);
                AbstractC25225BEi.A1Q(A0y, true);
                A0y.A19 = true;
                FYZ.A00(activity, interfaceC11380iw, c6fq, (InterfaceC103384lE) this.A04, (InterfaceC103384lE) this.A05, userSession3, A06, A0y, user, null, this.A07, null);
                return;
            default:
                C14360o3.A0B(user, 0);
                Activity activity2 = (Activity) this.A01;
                UserSession userSession4 = (UserSession) this.A06;
                InterfaceC77483dY interfaceC77483dY = (InterfaceC77483dY) this.A02;
                String str3 = this.A07;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A05;
                InterfaceC103384lE interfaceC103384lE2 = (InterfaceC103384lE) this.A04;
                C6FQ c6fq2 = (C6FQ) this.A03;
                AbstractC167017dG.A1N(activity2, userSession4);
                C14360o3.A0B(interfaceC77483dY, 3);
                AbstractC35271Fh6.A07(activity2, null, new C32540EUq(16, c6fq2, interfaceC103384lE2, interfaceC103384lE), userSession4, null, null, null, null, interfaceC77483dY, null, user, null, null, null, str3, null, str3, null, null, null, null, null);
                return;
        }
    }
}
