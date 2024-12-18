package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.CiX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28539CiX implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC28539CiX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC24901Jp interfaceC24901Jp;
        EnumC27369C5y enumC27369C5y;
        FragmentActivity fragmentActivity;
        UserSession userSession;
        C2Fb c2Fb;
        String A00;
        String str;
        String str2;
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_SCROLL_TO_AUTO_SAVE_SETTINGS", true);
                A0b.putBoolean(MSV.A00(837), true);
                AbstractC25228BEl.A1G(((CSP) this.A01).A00, A0b, (AbstractC12990ll) this.A02, ModalActivity.class, AbstractC111324zv.A00(1217));
                return;
            case 1:
                interfaceC24901Jp = (InterfaceC24901Jp) this.A01;
                enumC27369C5y = EnumC27369C5y.A03;
                AbstractC25231BEo.A1G(enumC27369C5y, interfaceC24901Jp);
                return;
            case 2:
                dialogInterface.dismiss();
                interfaceC24901Jp = (InterfaceC24901Jp) this.A01;
                enumC27369C5y = EnumC27369C5y.A02;
                AbstractC25231BEo.A1G(enumC27369C5y, interfaceC24901Jp);
                return;
            case 3:
                fragmentActivity = (FragmentActivity) this.A01;
                userSession = (UserSession) this.A02;
                c2Fb = C2Fb.A1f;
                A00 = AbstractC43591JPw.A00(379);
                str = "EncryptedBackupsOneTimeCodeExpirationUtils";
                AbstractC41776Ies.A09(fragmentActivity, userSession, c2Fb, A00, str);
                return;
            case 4:
                fragmentActivity = (FragmentActivity) this.A01;
                userSession = (UserSession) this.A02;
                c2Fb = C2Fb.A1f;
                A00 = AbstractC43591JPw.A00(379);
                str = "EncryptedBackupsOneTimeCodeNotificationUtils";
                AbstractC41776Ies.A09(fragmentActivity, userSession, c2Fb, A00, str);
                return;
            case 5:
                C59952od c59952od = (C59952od) this.A02;
                C120985dq A02 = c59952od.A0O().A02();
                if (A02 != null && (c38321qM = A02.A02) != null) {
                    str2 = c38321qM.getId();
                } else {
                    str2 = null;
                }
                C40031tU c40031tU = (C40031tU) this.A01;
                String str3 = c40031tU.A01;
                if (str3 == null) {
                    return;
                }
                if (str3.startsWith("instagram://bloks/")) {
                    AbstractC70160WDy.A03(C59952od.A01(c59952od), c59952od.requireContext(), str3);
                } else {
                    AbstractC41776Ies.A03(c59952od.requireContext(), str3);
                }
                C59952od.A0F(c40031tU, c59952od, str2, AbstractC111324zv.A00(1890));
                return;
            default:
                C59952od c59952od2 = (C59952od) this.A02;
                C59952od.A0F((C40031tU) this.A01, c59952od2, c59952od2.getMediaId(), "actionable_insights_tip_dismiss");
                return;
        }
    }
}
