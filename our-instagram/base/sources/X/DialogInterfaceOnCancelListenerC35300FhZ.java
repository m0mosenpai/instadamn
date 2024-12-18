package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.url.UrlHandlerActivity;
import com.instagram.user.model.User;

/* renamed from: X.FhZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35300FhZ implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnCancelListenerC35300FhZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0C(new DialogInterfaceOnCancelListenerC35300FhZ(obj, i));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC02590Ai A0f;
        switch (this.A00) {
            case 0:
                C36114Fwo.A00(((C35233FgQ) this.A01).A02);
                return;
            case 1:
                ((JH0) this.A01).onCancel();
                return;
            case 2:
            case 3:
            default:
                ((GZ5) this.A01).D1p();
                return;
            case 4:
                Runnable runnable = (Runnable) this.A01;
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            case 5:
                ((InterfaceC37198Ga9) this.A01).onCancel();
                return;
            case 6:
                if (dialogInterface == null) {
                    return;
                }
                ((DialogInterface.OnClickListener) this.A01).onClick(dialogInterface, 0);
                return;
            case 7:
                EUR eur = (EUR) this.A01;
                User A10 = AbstractC166987dD.A10(eur.A02);
                Integer num = C05F.A01;
                A10.A0n(num);
                AbstractC33619EtV abstractC33619EtV = eur.A00;
                if (abstractC33619EtV == null || !(abstractC33619EtV instanceof C32998Egl)) {
                    return;
                }
                C14360o3.A0B(num, 0);
                C33226ElG.A04(((C32998Egl) abstractC33619EtV).A00, false);
                return;
            case 8:
                ELT elt = ((FRR) this.A01).A00;
                C18920wW A02 = AbstractC12220kQ.A02(elt.A02);
                long currentTimeMillis = System.currentTimeMillis();
                double A00 = AbstractC31171DnF.A00();
                A0f = AbstractC166987dD.A0f(A02, "set_profile_photo_dialog_canceled");
                AbstractC31175DnJ.A10(A0f, currentTimeMillis);
                AbstractC31179DnN.A17(A0f, currentTimeMillis, A00);
                AbstractC31178DnM.A19(A0f, "profile_photo");
                AbstractC35274Fh9.A0D(A0f, "module", "register_flow_add_profile_photo");
                A0f.A7v("is_standalone", Boolean.valueOf(elt.A09));
                AbstractC35274Fh9.A0A(A0f, elt.A02);
                A0f.AAP("fb_family_device_id", AbstractC35274Fh9.A02(elt.A02));
                break;
            case 9:
                A0f = AbstractC166987dD.A0f(((C33226ElG) this.A01).A03, "remove_self_followers_dialog_dismissed");
                break;
            case 10:
                ((C54748OGw) this.A01).A00(C05F.A0N);
                return;
            case 11:
                Fragment fragment = (Fragment) ((C31714DwJ) this.A01).A01;
                AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
                if (abstractC10360h2 != null && abstractC10360h2.A0L() > 0 && !abstractC10360h2.A0G) {
                    abstractC10360h2.A0b();
                    return;
                } else {
                    AbstractC31177DnL.A12(fragment);
                    return;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((UrlHandlerActivity) ((GIH) this.A01).A00).onBackPressed();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((GZW) this.A01).onCancel();
                return;
        }
        A0f.Cht();
    }
}
