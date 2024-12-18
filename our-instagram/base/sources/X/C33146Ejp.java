package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ejp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33146Ejp extends ELn {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAudiencePickerFragment";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public String A00 = "call_settings";

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        AbstractC167007dF.A0N(view, R.id.audience_picker_disclaimer_text).setText(2131976606);
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view, R.id.done_button);
        igdsButton.setText(2131961124);
        igdsButton.setEnabled(true);
        igdsButton.setVisibility(0);
        ViewOnClickListenerC35689FpO.A01(igdsButton, 57, this);
        A0A().A00 = new C34624FNh(requireContext, AbstractC166997dE.A0p(requireContext, 2131976608), AbstractC166997dE.A0p(requireContext, 2131976607), R.drawable.participant_cell_outline, false);
        GFg A0B = A0B();
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A01;
        A0B.A01(AbstractC13670mt.A06("friendships/%s/following/", AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).getId()), "verified_user_calling_page");
        A03(this);
        AbstractC31175DnJ.A1N(AbstractC31176DnK.A0M(this, interfaceC09390do), "call_settings_user_selection_page_impression");
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C35167FfI c35167FfI = this.A03;
        ImmutableList A0L = AbstractC31173DnH.A0L(c35167FfI.A03);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator<E> it = A0L.iterator();
        while (it.hasNext()) {
            C32069E6v.A01(A0q, it);
        }
        FXS.A01(A0r, A0q);
        c35167FfI.A04();
        C35167FfI.A00(this, c35167FfI);
        C35167FfI.A01(this, c35167FfI);
        AbstractC31175DnJ.A1N(AbstractC31176DnK.A0M(this, interfaceC09390do), "call_settings_user_selection_page_bulk_remove");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public static final void A03(C33146Ejp c33146Ejp) {
        c33146Ejp.A0A().A03(c33146Ejp.requireContext(), null, EnumC153216up.A06);
        Context requireContext = c33146Ejp.requireContext();
        C08790ch A00 = AbstractC018607g.A00(c33146Ejp);
        C1ON A002 = FXS.A00(AbstractC166987dD.A0r(c33146Ejp.A01));
        C31714DwJ.A00(A002, c33146Ejp, 0);
        C1GJ.A00(requireContext, A00, A002);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        C18920wW A0M;
        String str;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        super.A0D(igdsCheckBox, c32069E6v);
        C35167FfI.A01(this, this.A03);
        boolean isChecked = igdsCheckBox.isChecked();
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        List A1J = AbstractC166987dD.A1J(c32069E6v.A02);
        if (isChecked) {
            C14360o3.A0B(A0r, 0);
            ArrayList A0q = AbstractC167017dG.A0q(A1J);
            Iterator it = A1J.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1V(A0q, it);
            }
            C51756Mtf c51756Mtf = new C51756Mtf((List) A0q, 19);
            C25621Ms A0c = AbstractC167017dG.A0c(A0r);
            A0c.A0B("video_call/add_user_to_allowlist/");
            C1GJ.A03(AbstractC31178DnM.A0K(A0c, "users_to_add", c51756Mtf.toString()));
            A0M = AbstractC31176DnK.A0M(this, interfaceC09390do);
            str = "call_settings_user_selection_page_add_people";
        } else {
            FXS.A01(A0r, A1J);
            A0M = AbstractC31176DnK.A0M(this, interfaceC09390do);
            str = "call_settings_user_selection_page_remove_people";
        }
        AbstractC31175DnJ.A1N(A0M, str);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31176DnK.A1C(ViewOnClickListenerC35689FpO.A00(this, 56), AbstractC31179DnN.A0B(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131976609)), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2002982627);
        super.onCreate(bundle);
        String A0b = AbstractC31180DnO.A0b(this);
        if (A0b != null) {
            this.A00 = A0b;
        }
        C0f9.A09(-807319415, A02);
    }
}
