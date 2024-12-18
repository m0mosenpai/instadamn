package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class EOG extends AbstractC43842Ja5 implements InterfaceC60122ou, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "FanClubMemberListCategoryFragment";
    public FanClubCategoryType A00;
    public AbstractC33556EsU A01;
    public SpinnerImageView A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public IgdsBottomButtonLayout A07;
    public final InterfaceC09390do A08 = C37049GUf.A00(this, 30);
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        C14360o3.A0B(user, 0);
        String username = user.getUsername();
        C50674MYs A0W = AbstractC31177DnL.A0W(requireContext(), this.A0A);
        A0W.A07(username);
        A0W.A09(AbstractC25227BEk.A0v(this, 2131976526), new ViewOnClickListenerC35585Fnc(user, this, username, 4));
        C31727DwY.A02(this, A0W);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A04;
        if (str == null) {
            C14360o3.A0F("categoryName");
            throw C00O.createAndThrow();
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, str);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31180DnO.A0V(view);
        if (AbstractC2051396d.A01(AbstractC166987dD.A0r(this.A0A))) {
            this.A07 = AbstractC31172DnG.A0j(view, R.id.create_group_chat_button);
            A00(this);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 25), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(EOG eog) {
        boolean isEmpty = eog.A05.isEmpty();
        IgdsBottomButtonLayout igdsBottomButtonLayout = eog.A07;
        if (isEmpty) {
            AbstractC167007dF.A0x(igdsBottomButtonLayout);
        } else {
            AbstractC167007dF.A0w(igdsBottomButtonLayout);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = eog.A07;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryAction(AbstractC166997dE.A0N(eog).getString(2131957212), ViewOnClickListenerC35685FpK.A00(eog, 9));
            }
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = eog.A07;
        if (igdsBottomButtonLayout3 != null) {
            F7P.A00(igdsBottomButtonLayout3, eog.A06);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new EXW(this, this, this, AbstractC166987dD.A0r(this.A0A)), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37071GVg.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public EOG() {
        C37049GUf c37049GUf = new C37049GUf(this, 34);
        C37049GUf c37049GUf2 = new C37049GUf(this, 31);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37049GUf(c37049GUf2, 32));
        this.A0B = AbstractC25225BEi.A0a(new C37049GUf(A00, 33), c37049GUf, new C50171MDy(35, null, A00), AbstractC25225BEi.A1D(C32941EeM.class));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C37012GSr(this));
        this.A03 = "";
        this.A05 = AbstractC166987dD.A1E();
        this.A01 = C32939EeK.A00;
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(535619461);
        super.onCreate(bundle);
        this.A00 = (FanClubCategoryType) AbstractC153636vY.A00(requireArguments(), FanClubCategoryType.class, "fan_club_category_type");
        this.A04 = AbstractC153636vY.A01(requireArguments(), "fan_club_category_name");
        C0f9.A09(672478617, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1295608868);
        super.onResume();
        SpinnerImageView spinnerImageView = this.A02;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            AbstractC31171DnF.A1M(spinnerImageView);
            C32941EeM c32941EeM = (C32941EeM) this.A0B.getValue();
            FanClubCategoryType fanClubCategoryType = this.A00;
            if (fanClubCategoryType == null) {
                str = "categoryType";
            } else {
                c32941EeM.A04(fanClubCategoryType, true, true);
                C0f9.A09(1417339688, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
