package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.Fk4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35447Fk4 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public DialogInterfaceOnClickListenerC35447Fk4(C83753oK c83753oK, C35272Fh7 c35272Fh7, int i, boolean z) {
        this.A00 = i;
        this.A01 = c35272Fh7;
        if (1 - i != 0) {
            this.A03 = z;
            this.A02 = c83753oK;
        } else {
            this.A02 = c83753oK;
            this.A03 = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.FLC, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                boolean z = this.A03;
                C26828Bsq c26828Bsq = (C26828Bsq) this.A02;
                if (z) {
                    DirectThreadThemeInfo directThreadThemeInfo = (DirectThreadThemeInfo) this.A01;
                    Intent A04 = AbstractC31171DnF.A04();
                    A04.putExtra("theme_info", directThreadThemeInfo);
                    AbstractC31176DnK.A18(A04, c26828Bsq);
                    AbstractC25227BEk.A1B(c26828Bsq);
                    return;
                }
                C26828Bsq.A02(c26828Bsq);
                return;
            case 1:
                C35272Fh7 c35272Fh7 = (C35272Fh7) this.A01;
                UserSession userSession = c35272Fh7.A04;
                C14360o3.A0B(userSession, 0);
                C83753oK.A01(userSession, "logout_password_saving_logout_clicked", "logout_spi", "logout", "logout_interaction");
                c35272Fh7.A0D(EnumC33353Eom.A05, this.A03);
                return;
            case 2:
                C35272Fh7 c35272Fh72 = (C35272Fh7) this.A01;
                UserSession userSession2 = c35272Fh72.A04;
                AbstractC35076Fcn.A01(c35272Fh72.A03, userSession2, "logout_d2_cancel_tapped");
                if (!this.A03) {
                    return;
                }
                C14360o3.A0B(userSession2, 0);
                C83753oK.A01(userSession2, "logout_password_saving_multiaccount_cancel_clicked", "logout_spi", "logout", "logout_interaction");
                return;
            case 3:
                C33225ElD c33225ElD = (C33225ElD) this.A01;
                C36731GHa c36731GHa = (C36731GHa) this.A02;
                boolean z2 = !this.A03;
                c36731GHa.A0D = z2;
                int i2 = c36731GHa.A04;
                if (i2 == c33225ElD.A05.A04) {
                    c33225ElD.A01.A1E(z2);
                    C33225ElD.A00(c33225ElD);
                }
                if (i2 == c33225ElD.A03.A04) {
                    c33225ElD.A01.A1g(z2);
                }
                if (i2 == c33225ElD.A04.A04) {
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(c33225ElD.A01);
                    A0w.E77(AbstractC58317Pt9.A00(47), z2);
                    A0w.apply();
                }
                dialogInterface.dismiss();
                ((C2UU) c33225ElD.getAdapter()).notifyDataSetChanged();
                return;
            case 4:
                if (this.A03) {
                    AbstractC31177DnL.A0u((Context) this.A01, (UserSession) this.A02, C2Fb.A0V, "https://help.instagram.com/contact/735502576838983");
                    return;
                } else {
                    AbstractC34910FZw.A00((FragmentActivity) this.A01, (UserSession) this.A02, "https://help.instagram.com/contact/735502576838983");
                    return;
                }
            default:
                boolean z3 = this.A03;
                C42509Iro c42509Iro = (C42509Iro) this.A02;
                AlC alC = (AlC) this.A01;
                if (z3) {
                    UserSession userSession3 = c42509Iro.A02;
                    C57742kn A00 = C57742kn.A00(userSession3);
                    String str = alC.A00.A06;
                    if (str != null) {
                        Boolean A0a = AbstractC166997dE.A0a();
                        ?? obj = new Object();
                        obj.A01 = str;
                        obj.A02 = null;
                        obj.A00 = A0a;
                        A00.A0H(str, obj);
                        Activity activity = c42509Iro.A00;
                        AbstractC018607g abstractC018607g = c42509Iro.A01;
                        C1ON A002 = FAY.A00(userSession3, obj);
                        A002.A00 = new HG2(1, alC, obj, c42509Iro, A00);
                        C1GJ.A00(activity, abstractC018607g, A002);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                UserSession userSession4 = c42509Iro.A02;
                String str2 = alC.A00.A06;
                if (str2 != null) {
                    C25621Ms A0M = AbstractC31173DnH.A0M(userSession4);
                    A0M.A0B(StringFormatUtil.formatStrLocaleSafe("media/%s/delete_story_countdown/", str2));
                    C1ON A0I = AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
                    A0I.A00 = new C37484Gf2(12, alC, c42509Iro);
                    C1GJ.A03(A0I);
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    public DialogInterfaceOnClickListenerC35447Fk4(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
