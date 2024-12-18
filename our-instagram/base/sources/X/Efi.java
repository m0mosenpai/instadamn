package X;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Efi extends C32547EUx {
    public Activity A00;
    public Context A01;
    public C07270a1 A02;
    public InterfaceC37227Gac A03;
    public EnumC31713DwI A04;
    public final /* synthetic */ ELC A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Efi(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, ELC elc, EnumC31713DwI enumC31713DwI, Integer num) {
        super(activity, uri, interfaceC11380iw, c07270a1, interfaceC37227Gac, null, enumC31713DwI, num, null, null, null, null);
        this.A05 = elc;
        this.A00 = activity;
        this.A01 = activity.getApplicationContext();
        this.A03 = interfaceC37227Gac;
        this.A04 = enumC31713DwI;
        this.A02 = c07270a1;
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        String A0g;
        ELC elc = this.A05;
        String username = user.getUsername();
        EditText editText = elc.A02;
        if (editText == null) {
            A0g = null;
        } else {
            A0g = AbstractC167007dF.A0g(editText);
        }
        AbstractC31710DwF.A02(elc, userSession, user.Bhu(), new G9Y(1, userSession, user, this), EnumC31713DwI.A1C, username, A0g, false);
    }

    @Override // X.C32547EUx
    public final void A04(EfU efU) {
        int i;
        int A03 = C0f9.A03(396259598);
        int A032 = C0f9.A03(-1062797401);
        C1Q9 c1q9 = C1Q9.A13;
        C07270a1 c07270a1 = this.A02;
        AbstractC31173DnH.A1S(c1q9.A02(c07270a1).A05(null, this.A04), c07270a1);
        Activity activity = this.A00;
        if (activity != null) {
            AbstractC31175DnJ.A0j(activity, false);
        }
        if (((C32196ECr) efU).A02) {
            this.A03.DoB(c07270a1, efU);
            i = 551409831;
        } else {
            super.A04(efU);
            Context context = this.A01;
            if (context != null) {
                C9GR.A08(context, 2131969372, 0);
            }
            i = -1858998121;
        }
        C0f9.A0A(i, A032);
        ELC elc = this.A05;
        if (ELC.A03(elc)) {
            C07270a1 c07270a12 = elc.A05;
            String str = elc.A08;
            C14360o3.A0B(c07270a12, 0);
            AbstractC34214F7m.A00(c07270a12, "passwordless_flow_password_create_success", str, null);
        }
        C0f9.A0A(1633892559, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C07270a1 c07270a1;
        String str;
        Object A00;
        int A03 = C0f9.A03(244530207);
        int A032 = C0f9.A03(1127326693);
        C1Q9 c1q9 = C1Q9.A12;
        C07270a1 c07270a12 = this.A02;
        AbstractC31173DnH.A1S(c1q9.A02(c07270a12).A05(null, this.A04), c07270a12);
        Activity activity = this.A00;
        if (activity != null) {
            AbstractC31175DnJ.A0j(activity, false);
        }
        if (!(abstractC115105If instanceof C115115Ig)) {
            C9GR.A07(this.A01, 2131972429);
        }
        super.onFail(abstractC115105If);
        C0f9.A0A(1691682230, A032);
        ELC elc = this.A05;
        if (ELC.A03(elc)) {
            if (abstractC115105If != null && (A00 = abstractC115105If.A00()) != null) {
                c07270a1 = elc.A05;
                str = ((C40781ul) A00).getErrorMessage();
            } else {
                c07270a1 = elc.A05;
                str = null;
            }
            String str2 = elc.A08;
            HashMap A11 = AbstractC31174DnI.A11(c07270a1, 0);
            A11.put("exception", str);
            AbstractC34214F7m.A00(c07270a1, "passwordless_flow_password_create_fail", str2, A11);
        }
        C0f9.A0A(-434743349, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1040291915);
        super.onStart();
        Activity activity = this.A00;
        if (activity != null) {
            AbstractC31175DnJ.A0j(activity, true);
        }
        C0f9.A0A(795864463, A03);
    }

    @Override // X.C32547EUx, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(-123856867, C32547EUx.A00(this, obj, -554310235));
    }

    public static void A01(UserSession userSession, Efi efi, User user) {
        super.A03(userSession, user);
    }
}
