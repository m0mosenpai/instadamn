package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.Ogf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55317Ogf implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnClickListenerC55317Ogf(DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, C55908Orz c55908Orz, int i) {
        this.A00 = i;
        this.A03 = c55908Orz;
        if (5 - i != 0) {
            this.A01 = abstractC10360h2;
            this.A02 = onDismissListener;
        } else {
            this.A02 = abstractC10360h2;
            this.A01 = onDismissListener;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity;
        int i2;
        String str;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C41181vS c41181vS;
        switch (this.A00) {
            case 0:
                C69797Vvh c69797Vvh = new C69797Vvh((Context) this.A01);
                try {
                    c69797Vvh.A01.A0C = ((W4F) this.A03).A00.A0F(this.A02);
                } catch (IOException e) {
                    c69797Vvh.A01.A0C = AbstractC50522MSa.A0m(e);
                }
                AbstractC50523MSb.A0p(c69797Vvh);
                return;
            case 1:
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A02;
                C54796OJo c54796OJo = (C54796OJo) this.A03;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                SUV.A00(context);
                C55170OdY A00 = OPL.A00(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = A00.A03.ARD();
                ARD.E7G("browser_last_clear_date_key", currentTimeMillis);
                ARD.apply();
                C9GR.A07(context, 2131954317);
                c54796OJo.A05.invoke();
                return;
            case 2:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                UserSession userSession2 = (UserSession) this.A02;
                C54796OJo c54796OJo2 = (C54796OJo) this.A03;
                dialogInterface.getClass();
                C2Fb c2Fb = C2Fb.A1z;
                SZ2 sz2 = c54796OJo2.A03;
                AbstractC41776Ies.A09(fragmentActivity, userSession2, c2Fb, "https://help.instagram.com/519522125107875", sz2.A02);
                SZ2.A00(sz2, "settings_data_policy_clicked", null);
                return;
            case 3:
                ((C14510oO) this.A02).A00 = true;
                C55196Oe3.A00((Context) this.A01, (C55196Oe3) this.A03);
                return;
            case 4:
                C55909Os0 c55909Os0 = (C55909Os0) this.A03;
                AbstractC166987dD.A1Z(new C57165PZj(this.A01, c55909Os0, this.A02, null, 36), C07Y.A00(c55909Os0.A06));
                return;
            case 5:
                C55908Orz c55908Orz = (C55908Orz) this.A03;
                C41181vS c41181vS2 = c55908Orz.A0A;
                if (c41181vS2.A0e == EnumC41231vY.A09 && (c38321qM = c41181vS2.A0b) != null) {
                    new OIy(c55908Orz.A01, (AbstractC10360h2) this.A02, c55908Orz.A07, c38321qM).A00((DialogInterface.OnDismissListener) this.A01);
                    return;
                } else {
                    activity = c55908Orz.A01;
                    i2 = 2131971745;
                    str = "reel_media_hard_delete_failed";
                    break;
                }
                break;
            case 6:
                C55908Orz c55908Orz2 = (C55908Orz) this.A03;
                C41181vS c41181vS3 = c55908Orz2.A0A;
                if (c41181vS3.A0e == EnumC41231vY.A09 && (c38321qM2 = c41181vS3.A0b) != null) {
                    new OIy(c55908Orz2.A01, (AbstractC10360h2) this.A01, c55908Orz2.A07, c38321qM2).A00((DialogInterface.OnDismissListener) this.A02);
                    return;
                } else {
                    activity = c55908Orz2.A01;
                    i2 = 2131971746;
                    str = "reel_media_recover_failed";
                    break;
                }
                break;
            case 7:
                AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) this.A01;
                if (abstractC10360h2 == null || (c41181vS = (C41181vS) this.A02) == null) {
                    return;
                }
                N7M n7m = (N7M) this.A03;
                new C55084Oag(n7m.requireContext(), abstractC10360h2, AbstractC166987dD.A0r(n7m.A0H), c41181vS).A03(new DialogInterfaceOnDismissListenerC55324Ogm(n7m, 18), MSW.A0o(n7m.A0E).A03);
                return;
            case 8:
            case 9:
            default:
                ((C14510oO) this.A02).A00 = true;
                C50685MZd.A00((C50685MZd) this.A03).A06((O5W) ((C51759Mti) this.A01).A00);
                return;
            case 10:
                UserSession userSession3 = (UserSession) this.A03;
                C55627OnC.A02(EnumC201098ur.OTHER, userSession3, (C38321qM) this.A02, null);
                OQ9.A00(userSession3).A01(userSession3, "upsell", true);
                InterfaceC57990Pna interfaceC57990Pna = (InterfaceC57990Pna) this.A01;
                if (interfaceC57990Pna == null) {
                    return;
                }
                interfaceC57990Pna.afterSelection(true);
                return;
            case 11:
                C55627OnC.A02(EnumC201098ur.ACCEPT, (UserSession) this.A03, (C38321qM) this.A02, null);
                MSY.A1G((InterfaceC57990Pna) this.A01);
                return;
        }
        C9GR.A0F(activity, str, i2);
    }

    public DialogInterfaceOnClickListenerC55317Ogf(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
