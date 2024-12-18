package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOM extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CampfireMemberListFragment";
    public C18920wW A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("hallPassName");
            throw C00O.createAndThrow();
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC35685FpK.A00(this, 41), AbstractC31179DnN.A0B(interfaceC56362iU, str), interfaceC56362iU);
        ActionButton Eha = interfaceC56362iU.Eha(ViewOnClickListenerC35685FpK.A00(this, 43), R.drawable.instagram_more_horizontal_pano_outline_24);
        Eha.setColorFilter(C3DY.A00(AbstractC167007dF.A09(Eha.getContext(), R.attr.igds_color_primary_icon)));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_add_users_pano_outline_24;
        A0B.A03 = AbstractC53242c7.A0H(getContext(), R.attr.igds_color_primary_icon);
        A0B.A05 = 2131954708;
        A0B.A0G = ViewOnClickListenerC35685FpK.A00(this, 44);
        interfaceC56362iU.A8u(new C3LY(A0B));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "campfire_member_list";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C31828Dym) interfaceC09390do.getValue()).A00, new C57561PgZ(this, 5), 26);
        C31828Dym c31828Dym = (C31828Dym) interfaceC09390do.getValue();
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("hallPassId");
            throw C00O.createAndThrow();
        }
        c31828Dym.A00(str);
    }

    public final UserSession A0C() {
        return AbstractC166987dD.A0r(this.A05);
    }

    public final void A0D(HallPassMemberViewModel hallPassMemberViewModel) {
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        FragmentActivity requireActivity = requireActivity();
        String id = hallPassMemberViewModel.A00.getId();
        C14360o3.A0B(A0r, 0);
        C31368DqX.A02(AbstractC31173DnH.A0P(requireActivity, A0r), A0r, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(A0r, id, "campfire_member_list", "campfire_member_list"));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37077GVm.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A05);
    }

    public EOM() {
        C57241PbP c57241PbP = new C57241PbP(this, 1);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(new C57241PbP(this, 2), 3));
        this.A04 = AbstractC25225BEi.A0a(new C57241PbP(A00, 4), c57241PbP, new C57251PbZ(3, null, A00), AbstractC25225BEi.A1D(C31828Dym.class));
        this.A05 = AbstractC60492pY.A02(this);
    }

    public static final void A00(EOM eom) {
        C193328hC A0O = AbstractC31175DnJ.A0O(eom);
        A0O.A04();
        A0O.A0A(2131954739);
        A0O.A09(2131954738);
        A0O.A0R(DialogInterfaceOnClickListenerC35453FkA.A00(eom, 35), EnumC193348hE.A05, 2131965069);
        A0O.A03();
        AbstractC166987dD.A1W(A0O);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C32636EYk(requireContext(), this));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-512037909);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC153636vY.A01(requireArguments, "hall_pass_id");
        this.A02 = AbstractC153636vY.A01(requireArguments, "hall_pass_name");
        requireArguments.getBoolean("should_show_add_story_button", false);
        this.A00 = AbstractC12220kQ.A01(this, AbstractC166987dD.A0r(this.A05));
        C0f9.A09(1504964572, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1678339497);
        super.onResume();
        if (this.A03) {
            C31828Dym c31828Dym = (C31828Dym) this.A04.getValue();
            String str = this.A01;
            if (str == null) {
                C14360o3.A0F("hallPassId");
                throw C00O.createAndThrow();
            }
            c31828Dym.A00(str);
            this.A03 = false;
        }
        C0f9.A09(-1604263831, A02);
    }
}
