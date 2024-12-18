package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.Fia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35359Fia implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public DialogInterfaceOnClickListenerC35359Fia(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = obj5;
        this.A04 = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer num;
        switch (this.A00) {
            case 0:
                FRX frx = (FRX) this.A05;
                C36297Fzr c36297Fzr = frx.A02;
                C2EE c2ee = (C2EE) this.A04;
                C36297Fzr.A01(c36297Fzr, c2ee.C7I(), c2ee.C7q(), "daily_prompt_reply_reminder_dialog_create_new_daily_prompt", "tap", "daily_prompt_button", "daily_prompt_reply_reminder_dialog", c2ee.AdZ());
                frx.A02((EnumC33364Eox) this.A01, (EnumC33420Epr) this.A02, (DirectThreadKey) this.A03, c2ee.C7g(), c2ee.AdZ());
                return;
            case 1:
                if (i == 0) {
                    ((C54748OGw) this.A02).A00(C05F.A0u);
                    Context context = (Context) this.A01;
                    C12260kU.A0G(context, AbstractC08820cl.A03(AbstractC63260SgI.A01(context.getApplicationContext(), MSV.A00(1237))));
                    return;
                }
                if (i != 1) {
                    ((C54748OGw) this.A02).A00(C05F.A0C);
                }
                Context context2 = (Context) this.A03;
                int i2 = 2131971483;
                if (i == 1) {
                    i2 = 2131973286;
                }
                String A0p = AbstractC166997dE.A0p(context2, i2);
                int i3 = 2131954361;
                if (i == 1) {
                    i3 = 2131964353;
                }
                String A0p2 = AbstractC166997dE.A0p(context2, i3);
                AbstractC35237FgW.A01((Activity) this.A01, (BugReportSource) this.A04, (UserSession) this.A05, A0p, A0p2);
                return;
            case 2:
                InterfaceC02900Bo interfaceC02900Bo = (InterfaceC02900Bo) this.A03;
                Activity activity = (Activity) this.A02;
                interfaceC02900Bo.E47(activity, (Intent) this.A04, (UserSession) this.A05, (User) this.A01, "horizontal_switch", true, true);
                if (!activity.isTaskRoot()) {
                    return;
                }
                activity.finish();
                return;
            case 3:
                C57312k6 A00 = C07Y.A00((ComponentActivity) this.A02);
                UserSession userSession = (UserSession) this.A03;
                AbstractC166987dD.A1Z(new C57157PZb(this.A04, userSession, (InterfaceC23621Ds) null, 20), A00);
                InterfaceC11380iw interfaceC11380iw = AbstractC206099Aq.A00;
                AbstractC167017dG.A1N(userSession, interfaceC11380iw);
                C65761Ttc.A02(new C65761Ttc(interfaceC11380iw, userSession), ((C71603Jf) this.A05).A03(0L), "ig_quiet_mode_upsell_dialog_try_tap", "in_app_upsell");
                Context context3 = (Context) this.A01;
                AbstractC166987dD.A10(userSession).A1A(true);
                C9GR.A07(context3, 2131971420);
                AbstractC167017dG.A1N(userSession, interfaceC11380iw);
                C65761Ttc.A02(new C65761Ttc(interfaceC11380iw, userSession), new C71603Jf(userSession).A03(0L), "ig_quiet_mode_confirmation_toast_shown", "in_app_upsell");
                return;
            case 4:
                C75R.A02((C18920wW) this.A05, (EnumC1579076z) this.A02, (EnumC33464Eqz) this.A03, (EnumC33371Ep4) this.A04, "click", "optimistic_restrict_dismiss_button", AbstractC31171DnF.A0g(this.A01));
                return;
            default:
                C56135Ovv c56135Ovv = (C56135Ovv) this.A04;
                if (this.A02 == BonusPromoDialogType.A05) {
                    num = C05F.A0j;
                } else {
                    num = C05F.A1F;
                }
                c56135Ovv.A00(num, null, null, null);
                E6I e6i = (E6I) this.A03;
                BonusPromoDialogAudienceType bonusPromoDialogAudienceType = e6i.A00;
                if (bonusPromoDialogAudienceType != null) {
                    int ordinal = bonusPromoDialogAudienceType.ordinal();
                    if (ordinal != 1 && ordinal != 3) {
                        if (ordinal == 2) {
                            UserSession userSession2 = (UserSession) this.A05;
                            FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                            String str = e6i.A01;
                            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession2);
                            A0r.A0B(null, AbstractC34897FZj.A00().A01(userSession2, str, "NATIVE_PROMO_DIALOG"));
                            A0r.A04();
                            return;
                        }
                        return;
                    }
                    UserSession userSession3 = (UserSession) this.A05;
                    C140966Yy A0r2 = AbstractC25225BEi.A0r((FragmentActivity) this.A01, userSession3);
                    A0r2.A0B(null, AbstractC34897FZj.A00().A03(userSession3, "NATIVE_PROMO_DIALOG", null, "Bonuses"));
                    A0r2.A04();
                    return;
                }
                return;
        }
    }
}
