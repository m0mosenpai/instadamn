package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EOR extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC37206GaH, InterfaceC60122ou, InterfaceC37123GXi {
    public static final String __redex_internal_original_name = "CreatorMessagingSelectionScreenFragment";
    public int A00;
    public IgTextView A01;
    public AbstractC33556EsU A02;
    public SpinnerImageView A03;
    public String A04;
    public ArrayList A05;
    public List A06;
    public List A07;
    public Map A08;
    public boolean A09;
    public boolean A0A;
    public InterfaceC83733oI A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public final C34723FRm A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;

    @Override // X.InterfaceC37206GaH
    public final void D2o() {
        this.A09 = false;
        A01(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A0B = (InterfaceC83733oI) AbstractC2054897w.A00(requireArguments, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A0C = requireArguments.getString("thread_v2_id");
        this.A0A = AbstractC167007dF.A1W(this.A0B);
        this.A0D = requireArguments.getStringArrayList("excluded_ids");
        this.A05 = requireArguments.getParcelableArrayList("existing_thread_members");
        this.A0E = requireArguments.getBoolean("has_epd_restricted_members");
        boolean z = this.A0A;
        int i2 = R.id.recipients_bar;
        if (z) {
            i2 = R.id.add_people_recipients_bar;
        }
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, i2);
        C34723FRm c34723FRm = this.A0F;
        InterfaceC09390do interfaceC09390do = this.A0J;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC83733oI interfaceC83733oI = this.A0B;
        String str = this.A0C;
        List list = this.A0D;
        ArrayList arrayList = this.A05;
        boolean z2 = this.A0E;
        C14360o3.A0B(A0r, 1);
        C14360o3.A0B(viewGroup, 3);
        c34723FRm.A00 = requireContext();
        c34723FRm.A01 = A0r;
        c34723FRm.A02 = this;
        c34723FRm.A07 = AbstractC167007dF.A1W(interfaceC83733oI);
        c34723FRm.A05 = list;
        c34723FRm.A04 = new C35151Fet(viewGroup, A0r, c34723FRm.A08);
        if (interfaceC83733oI != null) {
            C7TQ A00 = AbstractC34091F2t.A00(A0r, interfaceC83733oI);
            C31600DuS A002 = C31600DuS.A00(A0r, false);
            A002.A04(2);
            if (arrayList != null) {
                c34723FRm.A03 = new C35012Fbj(this, A0r, A00, A002, interfaceC83733oI, EnumC31337Dq2.A05, str, arrayList, 28, 2, false, false, z2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        this.A03 = AbstractC31180DnO.A0V(view);
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, A0k, 36320274974777578L)) {
            i = 2131957242;
        } else {
            i = 2131957240;
            if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320274974646504L)) {
                i = 2131957241;
            }
        }
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.text_banner);
        AbstractC25227BEk.A12(A0X, this, i);
        this.A01 = A0X;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 36), C07Y.A00(viewLifecycleOwner));
        getRecyclerView().A14(new C153156uj(getRecyclerView().A0D, new G7M(this, 0), C153146ui.A0A, false, false));
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        AbstractC31171DnF.A1M(spinnerImageView);
        ((C32940EeL) this.A0L.getValue()).A04(true, null);
    }

    public static final void A00(FanClubCategoryType fanClubCategoryType, EOR eor, String str) {
        EnumC33514Ern enumC33514Ern;
        Bundle A0b;
        Bundle bundle;
        Serializable serializable;
        C36296Fzq A0b2 = AbstractC31172DnG.A0b(eor.A0I);
        int ordinal = fanClubCategoryType.ordinal();
        if (ordinal != 3) {
            if (ordinal != 2) {
                if (ordinal == 1) {
                    enumC33514Ern = EnumC33514Ern.A0J;
                }
                A0b = AbstractC166987dD.A0b();
                A0b.putParcelable("fan_club_category_type", fanClubCategoryType);
                A0b.putString("fan_club_category_name", str);
                bundle = eor.mArguments;
                if (bundle != null && (serializable = bundle.getSerializable("entrypoint")) != null) {
                    A0b.putSerializable("entrypoint", serializable);
                }
                C140966Yy A0c = AbstractC25231BEo.A0c(eor.requireActivity(), eor.A0J);
                A0c.A0B(A0b, new EOQ());
                A0c.A04();
            }
            enumC33514Ern = EnumC33514Ern.A0K;
        } else {
            enumC33514Ern = EnumC33514Ern.A0L;
        }
        C36296Fzq.A02(enumC33514Ern, EnumC33512Erl.NEW_SUBSCRIBER_CHAT, A0b2, "chat_creation_sheet_rendered", "tap", null);
        A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("fan_club_category_type", fanClubCategoryType);
        A0b.putString("fan_club_category_name", str);
        bundle = eor.mArguments;
        if (bundle != null) {
            A0b.putSerializable("entrypoint", serializable);
        }
        C140966Yy A0c2 = AbstractC25231BEo.A0c(eor.requireActivity(), eor.A0J);
        A0c2.A0B(A0b, new EOQ());
        A0c2.A04();
    }

    public static final void A01(EOR eor) {
        SpinnerImageView spinnerImageView;
        C3T1 c3t1;
        boolean z = eor.A09;
        Window A0H = AbstractC31174DnI.A0H(eor);
        if (z) {
            A0H.addFlags(16);
            spinnerImageView = eor.A03;
            if (spinnerImageView != null) {
                c3t1 = C3T1.LOADING;
                spinnerImageView.setLoadingStatus(c3t1);
                C14360o3.A0C(eor.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                AbstractC31178DnM.A0w(eor);
                return;
            }
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        A0H.clearFlags(16);
        spinnerImageView = eor.A03;
        if (spinnerImageView != null) {
            c3t1 = C3T1.SUCCESS;
            spinnerImageView.setLoadingStatus(c3t1);
            C14360o3.A0C(eor.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            AbstractC31178DnM.A0w(eor);
            return;
        }
        C14360o3.A0F("spinner");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37123GXi
    public final void D2e(FanClubCategoryType fanClubCategoryType, String str) {
        if (!this.A08.isEmpty()) {
            this.A0F.A03(new DialogInterfaceOnClickListenerC35451Fk8(fanClubCategoryType, this, str, 4), DialogInterfaceOnClickListenerC35452Fk9.A00(this, 37));
        } else {
            A00(fanClubCategoryType, this, str);
        }
    }

    @Override // X.InterfaceC37206GaH
    public final void F9p() {
        ((AbstractC31827Dyl) this.A0L.getValue()).A02();
    }

    @Override // X.InterfaceC37206GaH
    public final void FC4(User user) {
        int i;
        if (!this.A08.containsKey(user.getUsername())) {
            C34723FRm c34723FRm = this.A0F;
            List list = c34723FRm.A05;
            if (list == null || (i = AbstractC31172DnG.A03(list, 1)) < 0) {
                i = 0;
            }
            int size = i + c34723FRm.A06.size();
            InterfaceC09390do interfaceC09390do = c34723FRm.A09;
            if (size >= AbstractC167027dH.A01(interfaceC09390do)) {
                C193328hC A0O = AbstractC31175DnJ.A0O(this);
                A0O.A0A(2131957220);
                AbstractC31177DnL.A1A(this, A0O, Integer.valueOf(AbstractC167027dH.A01(interfaceC09390do)), 2131957219);
                AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 38), A0O, 2131968948);
                return;
            }
        }
        ((AbstractC31827Dyl) this.A0L.getValue()).A03(user);
        this.A0F.A06(this.A08, true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new EYS(this), new C32634EYi(this, AbstractC166987dD.A0r(this.A0J), this.A0F), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(GVN.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0J);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0A && (!this.A08.isEmpty())) {
            this.A0F.A03(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 35), DialogInterfaceOnClickListenerC35452Fk9.A00(this, 36));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37206GaH
    public final void onSearchTextChanged(String str) {
        this.A04 = str;
        ((C32940EeL) this.A0L.getValue()).A04(true, this.A04);
    }

    public EOR() {
        D87 d87 = new D87(this, 31);
        D87 d872 = new D87(this, 28);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D87(d872, 29));
        this.A0L = AbstractC25225BEi.A0a(new D87(A00, 30), d87, new C50169MDw(22, A00, null), AbstractC25225BEi.A1D(C32940EeL.class));
        this.A0I = C1XM.A00(new D87(this, 27));
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new GSo(this));
        this.A0G = AbstractC09440dt.A00(enumC09460dv, new C37010GSp(this));
        this.A0K = AbstractC09440dt.A00(enumC09460dv, new C37011GSq(this));
        this.A0F = new C34723FRm();
        this.A07 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1I();
        this.A02 = C32939EeK.A00;
        this.A0J = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC37206GaH
    public final void DdQ() {
        String str;
        C14360o3.A0C(getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        AbstractC31178DnM.A0w(this);
        if (this.A07.isEmpty() && (((str = this.A04) == null || str.length() == 0) && !C14360o3.A0K(this.A02, C32938EeJ.A00))) {
            C35151Fet c35151Fet = this.A0F.A04;
            if (c35151Fet == null) {
                C14360o3.A0F("recipientsBarController");
                throw C00O.createAndThrow();
            }
            AbstractC167007dF.A0x(c35151Fet.A00);
            return;
        }
        this.A0F.A02();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        int i2;
        AbstractC25235BEs.A1H(interfaceC56362iU);
        boolean z = this.A0A;
        Resources A0N = AbstractC166997dE.A0N(this);
        if (z) {
            interfaceC56362iU.setTitle(A0N.getString(2131957232));
            if (!this.A08.isEmpty()) {
                i = 2131957230;
                i2 = 62;
            } else {
                return;
            }
        } else {
            interfaceC56362iU.setTitle(A0N.getString(2131957214));
            if (this.A08.size() >= 2 && !this.A09) {
                i = 2131957210;
                i2 = 63;
            } else {
                interfaceC56362iU.AAC(2131957210);
                return;
            }
        }
        interfaceC56362iU.AAF(ViewOnClickListenerC35679FpE.A00(this, i2), i);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(10353221);
        super.onDestroy();
        C35012Fbj c35012Fbj = this.A0F.A03;
        if (c35012Fbj != null) {
            c35012Fbj.A04.A01();
        }
        C0f9.A09(-1844037793, A02);
    }
}
