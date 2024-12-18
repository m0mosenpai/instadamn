package X;

import android.content.Context;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FRR {
    public final /* synthetic */ ELT A00;

    public FRR(ELT elt) {
        this.A00 = elt;
    }

    public final void A00() {
        ELT elt = this.A00;
        AbstractC35174FfR.A00(EnumC72435Xdf.A08, elt.A02, "upsell_impressions");
        C18920wW A02 = AbstractC12220kQ.A02(elt.A02);
        long currentTimeMillis = System.currentTimeMillis();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "register_avatar_clicked");
        AbstractC31177DnL.A1B(A0f, currentTimeMillis, A00);
        AbstractC31175DnJ.A0y(A0f);
        A0f.AAP("app_device_id", AbstractC35274Fh9.A00());
        AbstractC31175DnJ.A10(A0f, currentTimeMillis);
        AbstractC35274Fh9.A05(A0f);
        A0f.A7v("is_internal_build", AbstractC166997dE.A0a());
        A0f.A7v("is_standalone", Boolean.valueOf(elt.A09));
        AbstractC31171DnF.A1D(A0f, "register_flow_add_profile_photo");
        UserSession userSession = elt.A02;
        C14360o3.A0B(userSession, 0);
        AbstractC31177DnL.A1G(A0f, CacheBehaviorLogger.SOURCE, AbstractC31179DnN.A0c(userSession), A00);
        AbstractC31171DnF.A1A(A0f, "profile_photo");
        A0f.Cht();
        C36325G0u c36325G0u = elt.A01;
        Context requireContext = elt.requireContext();
        boolean A1W = AbstractC167007dF.A1W(elt.A00);
        boolean A022 = AbstractC35081Fcs.A02(elt.mArguments, elt.A02);
        FH3 fh3 = new FH3(this);
        DialogInterfaceOnCancelListenerC35300FhZ dialogInterfaceOnCancelListenerC35300FhZ = new DialogInterfaceOnCancelListenerC35300FhZ(this, 8);
        ELT elt2 = c36325G0u.A02;
        if (elt2 != null) {
            c36325G0u.A05 = A1W;
            ArrayList A1E = AbstractC166987dD.A1E();
            AbstractC31173DnH.A17(requireContext, A1E, 2131964344);
            AbstractC31173DnH.A17(requireContext, A1E, 2131975213);
            AbstractC31173DnH.A17(requireContext, A1E, 2131955165);
            if (c36325G0u.A05) {
                AbstractC31173DnH.A17(requireContext, A1E, 2131972281);
            }
            CharSequence[] charSequenceArr = new CharSequence[A1E.size()];
            c36325G0u.A06 = charSequenceArr;
            A1E.toArray(charSequenceArr);
            CharSequence[] charSequenceArr2 = c36325G0u.A06;
            int i = 1;
            if (A022) {
                i = 0;
            }
            DialogInterfaceOnClickListenerC35450Fk7 dialogInterfaceOnClickListenerC35450Fk7 = new DialogInterfaceOnClickListenerC35450Fk7(i, requireContext, c36325G0u, fh3);
            C193328hC A0b = AbstractC31176DnK.A0b(elt2);
            A0b.A0A(2131955025);
            A0b.A0m(elt2, c36325G0u.A07);
            A0b.A0f(dialogInterfaceOnClickListenerC35450Fk7, charSequenceArr2);
            A0b.A04();
            A0b.A0C(dialogInterfaceOnCancelListenerC35300FhZ);
            AbstractC166987dD.A1W(A0b);
        }
    }

    public final void A01() {
        ELT elt = this.A00;
        C35111FeD.A00(elt.A02, Boolean.valueOf(elt.A09), "profile_photo");
        ELT.A01(elt, false);
    }

    public final void A02(boolean z) {
        ELT elt = this.A00;
        C02R.A03(elt.A04, "Complete action is null.");
        if (elt.A03.A05) {
            elt.A04.ABw(Boolean.valueOf(z));
        }
        ELT.A01(elt, true);
    }
}
