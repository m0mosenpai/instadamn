package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EON extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HallPassMemberListFragment";
    public C18920wW A00;
    public IgTextView A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AbstractC018607g A07;
    public C56352iT A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A03;
        if (str == null) {
            C14360o3.A0F("hallPassName");
            throw C00O.createAndThrow();
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC35685FpK.A00(this, 54), AbstractC31179DnN.A0B(interfaceC56362iU, str), interfaceC56362iU);
        ActionButton Eha = interfaceC56362iU.Eha(ViewOnClickListenerC35685FpK.A00(this, 56), R.drawable.instagram_more_horizontal_pano_outline_24);
        Eha.setColorFilter(AbstractC31174DnI.A09(Eha.getContext(), R.color.igds_primary_icon));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "hall_pass_member_list";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsInlineSearchBox) requireView().requireViewById(R.id.search_box)).A02 = new C36509G8h(this, 8);
        this.A01 = AbstractC31172DnG.A0X(requireView(), R.id.followers_count);
        ViewOnClickListenerC35685FpK.A01(AbstractC166997dE.A0S(requireView(), R.id.add_people_button), 59, this);
        C64P c64p = (C64P) AbstractC166997dE.A0R(requireView(), R.id.cta);
        c64p.setVisibility(AbstractC167007dF.A05(this.A06 ? 1 : 0));
        c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 57));
        InterfaceC09390do interfaceC09390do = this.A09;
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C31828Dym) interfaceC09390do.getValue()).A00, new C57561PgZ(this, 8), 28);
        C31828Dym c31828Dym = (C31828Dym) interfaceC09390do.getValue();
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("hallPassId");
            throw C00O.createAndThrow();
        }
        c31828Dym.A00(str);
    }

    public final UserSession A0C() {
        return AbstractC166987dD.A0r(this.A0A);
    }

    public final void A0D(HallPassMemberViewModel hallPassMemberViewModel) {
        UserSession A0r = AbstractC166987dD.A0r(this.A0A);
        FragmentActivity requireActivity = requireActivity();
        String id = hallPassMemberViewModel.A00.getId();
        C14360o3.A0B(A0r, 0);
        C31368DqX.A02(AbstractC31173DnH.A0P(requireActivity, A0r), A0r, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(A0r, id, "hall_pass_member_list", "hall_pass_member_list"));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37078GVn.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0A);
    }

    public EON() {
        C57241PbP c57241PbP = new C57241PbP(this, 9);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(new C57241PbP(this, 10), 11));
        this.A09 = AbstractC25225BEi.A0a(new C57241PbP(A00, 12), c57241PbP, new C57251PbZ(5, null, A00), AbstractC25225BEi.A1D(C31828Dym.class));
        this.A0A = AbstractC60492pY.A02(this);
    }

    public static final void A00(EON eon) {
        C193328hC A0O = AbstractC31175DnJ.A0O(eon);
        A0O.A04();
        A0O.A0A(2131963429);
        A0O.A09(2131963427);
        A0O.A0R(DialogInterfaceOnClickListenerC35453FkA.A00(eon, 36), EnumC193348hE.A05, 2131965069);
        A0O.A03();
        AbstractC166987dD.A1W(A0O);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new C32644EYs(requireContext(), this, AbstractC166987dD.A0r(this.A0A), this), new Object());
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1325621489);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC153636vY.A01(requireArguments, "hall_pass_id");
        this.A03 = AbstractC153636vY.A01(requireArguments, "hall_pass_name");
        this.A06 = AbstractC31172DnG.A1X(requireArguments, "should_show_add_story_button");
        this.A08 = C56352iT.A0t.A04(this);
        this.A00 = AbstractC12220kQ.A01(this, AbstractC166987dD.A0r(this.A0A));
        this.A07 = AbstractC018607g.A00(this);
        C0f9.A09(722090664, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1298081088);
        super.onResume();
        if (this.A04) {
            this.A04 = false;
            C31828Dym c31828Dym = (C31828Dym) this.A09.getValue();
            String str = this.A02;
            if (str == null) {
                C14360o3.A0F("hallPassId");
                throw C00O.createAndThrow();
            }
            c31828Dym.A00(str);
        }
        C0f9.A09(-1009465299, A02);
    }
}
