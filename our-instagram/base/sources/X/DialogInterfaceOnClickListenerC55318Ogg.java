package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ogg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55318Ogg implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public DialogInterfaceOnClickListenerC55318Ogg(Activity activity, DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, UserSession userSession, C41181vS c41181vS, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A03 = c41181vS;
            this.A01 = activity;
            this.A02 = abstractC10360h2;
            this.A05 = userSession;
            this.A04 = onDismissListener;
        } else {
            this.A04 = c41181vS;
            this.A01 = activity;
            this.A03 = abstractC10360h2;
            this.A05 = userSession;
            this.A02 = onDismissListener;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String id;
        Context context;
        int i2;
        String str2;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        switch (this.A00) {
            case 0:
                W4F w4f = (W4F) this.A05;
                InterfaceC94534Ng interfaceC94534Ng = (InterfaceC94534Ng) this.A03;
                InterfaceC55722hD interfaceC55722hD = (InterfaceC55722hD) this.A02;
                Object obj = this.A04;
                Context context2 = (Context) this.A01;
                C69797Vvh c69797Vvh = new C69797Vvh(context2);
                c69797Vvh.A08("Force Mode Options");
                Integer[] numArr = w4f.A01;
                int length = numArr.length;
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i3 = 0; i3 < length; i3++) {
                    switch (MSW.A07(numArr, i3)) {
                        case 1:
                            str = "Force On";
                            break;
                        case 2:
                            str = "Force Off";
                            break;
                        case 3:
                            str = "Ignore Enable Time";
                            break;
                        default:
                            str = ServerW3CShippingAddressConstants.DEFAULT;
                            break;
                    }
                    charSequenceArr[i3] = str;
                }
                int B7q = interfaceC55722hD.B7q(((C94524Nf) interfaceC94534Ng).A01.A0D);
                DialogInterfaceOnClickListenerC35369Fik dialogInterfaceOnClickListenerC35369Fik = new DialogInterfaceOnClickListenerC35369Fik(0, context2, interfaceC55722hD, w4f, charSequenceArr, interfaceC94534Ng, obj);
                C69487VoA c69487VoA = c69797Vvh.A01;
                c69487VoA.A0J = charSequenceArr;
                c69487VoA.A03 = dialogInterfaceOnClickListenerC35369Fik;
                c69487VoA.A00 = B7q;
                c69487VoA.A0I = true;
                AbstractC50523MSb.A0p(c69797Vvh);
                return;
            case 1:
                C14360o3.A0B(dialogInterface, 0);
                C38321qM c38321qM3 = (C38321qM) this.A04;
                if (c38321qM3 != null && (id = c38321qM3.getId()) != null) {
                    new C48639LfH((Context) this.A02, (Fragment) this.A03, (InterfaceC11380iw) this.A01, (UserSession) this.A05, id).Eo2(null, null, null, C05F.A05, null, null);
                    return;
                } else {
                    C9GR.A0B((Context) this.A02, "missing_media_id_for_unavailable_audio_dialog");
                    return;
                }
            case 2:
                C41181vS c41181vS = (C41181vS) this.A04;
                if (c41181vS.A0e == EnumC41231vY.A09 && (c38321qM = c41181vS.A0b) != null) {
                    new OIy((Context) this.A01, (AbstractC10360h2) this.A03, (UserSession) this.A05, c38321qM).A00((DialogInterface.OnDismissListener) this.A02);
                    return;
                }
                context = (Context) this.A01;
                i2 = 2131971745;
                str2 = "reel_media_hard_delete_failed";
                break;
            default:
                C41181vS c41181vS2 = (C41181vS) this.A03;
                if (c41181vS2.A0e == EnumC41231vY.A09 && (c38321qM2 = c41181vS2.A0b) != null) {
                    new OIy((Context) this.A01, (AbstractC10360h2) this.A02, (UserSession) this.A05, c38321qM2).A00((DialogInterface.OnDismissListener) this.A04);
                    return;
                }
                context = (Context) this.A01;
                i2 = 2131971746;
                str2 = "reel_media_recover_failed";
                break;
        }
        C9GR.A0F(context, str2, i2);
    }

    public DialogInterfaceOnClickListenerC55318Ogg(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj5;
        this.A02 = obj;
        this.A05 = obj4;
        this.A03 = obj2;
        this.A01 = obj3;
    }
}
