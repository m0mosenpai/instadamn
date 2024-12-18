package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.user.model.User;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;

/* renamed from: X.EtV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33619EtV {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.OQ5, java.lang.Object] */
    public final void A00(EDA eda) {
        if (this instanceof C32997Egk) {
            C32997Egk c32997Egk = (C32997Egk) this;
            C1P1 c1p1 = c32997Egk.A00;
            if (c1p1 != null) {
                c1p1.onSuccess(c32997Egk.A01);
                return;
            }
            return;
        }
        C32998Egl c32998Egl = (C32998Egl) this;
        if (eda.A00.A0M() == C05F.A0C) {
            if (c32998Egl.A02) {
                C33226ElG c33226ElG = c32998Egl.A00;
                if (c33226ElG.A01 == null) {
                    User user = c32998Egl.A01;
                    C193328hC A0O = AbstractC31175DnJ.A0O(c33226ElG);
                    A0O.A0A(2131955031);
                    A0O.A09(2131955029);
                    A0O.A08(R.drawable.instagram_users_outline_96);
                    DialogInterfaceOnClickListenerC35455FkC.A01(A0O, user, c33226ElG, 56, 2131955030);
                    DialogInterfaceOnClickListenerC35454FkB.A01(A0O, c33226ElG, 65);
                    DialogInterfaceOnCancelListenerC35300FhZ.A00(A0O, c33226ElG, 9);
                    c33226ElG.A01 = A0O.A02();
                }
                AbstractC31175DnJ.A1N(c33226ElG.A03, "remove_self_followers_dialog_impression");
                Dialog dialog = c33226ElG.A01;
                if (dialog != null) {
                    C0fJ.A00(dialog);
                }
            }
            C33226ElG c33226ElG2 = c32998Egl.A00;
            if (c33226ElG2.A0B) {
                InterfaceC09390do interfaceC09390do = c33226ElG2.A0E;
                if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36318926354848533L)) {
                    C56142Ow4 A00 = AbstractC54193NxX.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25230BEn.A0l(interfaceC09390do), new Object());
                    DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0A;
                    A00.A02(new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions.A0E, directMessageInteropReachabilityOptions), MSV.A00(214));
                    try {
                        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2143), AbstractC166987dD.A1G());
                        FragmentActivity requireActivity = c33226ElG2.requireActivity();
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(AbstractC166987dD.A0r(interfaceC09390do));
                        AbstractC31171DnF.A17(c33226ElG2, A0C, 2131961912);
                        AbstractC31173DnH.A14(requireActivity, A0C, A01);
                    } catch (Exception unused) {
                        C0w9.A03("account_privacy_options", "navigation failed to review settings screen:private");
                    }
                }
            }
        }
        C33226ElG c33226ElG3 = c32998Egl.A00;
        InterfaceC09390do interfaceC09390do2 = c33226ElG3.A0E;
        if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do2), 36318410958903429L)) {
            HashMap A0F = AbstractC25230BEn.A0l(interfaceC09390do2).A0F();
            A0F.put("UPDATE_ACCOUNT_PRIVACY_SETTING", new IGSupervisionUpsellEligibilityStatus(true));
            AbstractC25230BEn.A0l(interfaceC09390do2).A17(A0F);
        }
        c33226ElG3.setItems(C33226ElG.A00(c33226ElG3));
    }
}
