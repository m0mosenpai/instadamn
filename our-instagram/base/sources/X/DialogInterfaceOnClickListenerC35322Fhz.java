package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Fhz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35322Fhz implements DialogInterface.OnClickListener {
    public final Resources A00;
    public final FL6 A01;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C14360o3.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
        Resources resources = this.A00;
        CharSequence charSequence = new CharSequence[]{resources.getString(2131976910), resources.getString(2131972271)}[i];
        if (C14360o3.A0K(resources.getString(2131976910), charSequence)) {
            FL6 fl6 = this.A01;
            GBV gbv = fl6.A01;
            UserSession userSession = gbv.A02;
            String str = userSession.userId;
            String id = fl6.A02.getId();
            UserDetailFragment userDetailFragment = gbv.A04;
            C14360o3.A0B(str, 0);
            AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
            C19280xC A002 = C19280xC.A00(userDetailFragment, "profile_tagging_tap_your_profile_visit_click");
            A002.A0C("self_user_id", str);
            A002.A0C("profile_user_id", id);
            A00.EHW(A002);
            InterfaceC81913lB CDh = fl6.A00.CDh();
            if (CDh != null) {
                Fragment A02 = AbstractC31364DqT.A02().A02(userSession, AbstractC31402Dr6.A03(userSession, CDh.getId(), "self_profile_bio_text_entity", gbv.A03.getModuleName()));
                C70C c70c = gbv.A05;
                c70c.A03(A02, "profile", true);
                c70c.A00();
                return;
            }
            return;
        }
        if (!C14360o3.A0K(resources.getString(2131972271), charSequence)) {
            return;
        }
        FL6 fl62 = this.A01;
        GBV gbv2 = fl62.A01;
        Context requireContext = gbv2.A04.requireContext();
        FL5 fl5 = new FL5(fl62.A00, gbv2, fl62.A02);
        C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
        A0I.A0A(2131972273);
        A0I.A09(2131972272);
        A0I.A0J(new DialogInterfaceOnClickListenerC35319Fhu(fl5, 21), 2131972271);
        AbstractC31176DnK.A14(new DialogInterfaceOnClickListenerC35319Fhu(fl5, 22), A0I);
    }

    public DialogInterfaceOnClickListenerC35322Fhz(Resources resources, FL6 fl6) {
        this.A00 = resources;
        this.A01 = fl6;
    }
}
