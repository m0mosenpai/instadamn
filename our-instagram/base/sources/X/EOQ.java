package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EOQ extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC37206GaH, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorMessagingCategorySelectionScreenFragment";
    public int A00;
    public FanClubCategoryType A01;
    public IgTextView A02;
    public AbstractC33556EsU A03;
    public SpinnerImageView A04;
    public String A05;
    public String A06;
    public List A07;
    public Map A08;
    public boolean A09;
    public boolean A0A;
    public final C34723FRm A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;

    @Override // X.InterfaceC37206GaH
    public final void D2o() {
        this.A09 = false;
        A00(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("categoryName");
            throw C00O.createAndThrow();
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, str);
        if (this.A08.size() >= 2 && !this.A09) {
            interfaceC56362iU.AAF(ViewOnClickListenerC35679FpE.A00(this, 60), 2131957210);
        } else {
            interfaceC56362iU.AAC(2131957210);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.recipients_bar);
        C34723FRm c34723FRm = this.A0B;
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        AbstractC167017dG.A1Q(A0r, viewGroup);
        c34723FRm.A00 = requireContext();
        c34723FRm.A01 = A0r;
        c34723FRm.A02 = this;
        c34723FRm.A07 = false;
        c34723FRm.A05 = null;
        c34723FRm.A04 = new C35151Fet(viewGroup, A0r, c34723FRm.A08);
        this.A04 = AbstractC31180DnO.A0V(view);
        this.A02 = AbstractC31172DnG.A0X(view, R.id.text_banner);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 35), C07Y.A00(viewLifecycleOwner));
        SpinnerImageView spinnerImageView = this.A04;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            AbstractC31171DnF.A1M(spinnerImageView);
            C32941EeM c32941EeM = (C32941EeM) this.A0I.getValue();
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                str = "categoryType";
            } else {
                c32941EeM.A04(fanClubCategoryType, false, C18U.A06(C06090Tz.A06, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320274974646504L));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(EOQ eoq) {
        SpinnerImageView spinnerImageView;
        C3T1 c3t1;
        boolean z = eoq.A09;
        Window A0H = AbstractC31174DnI.A0H(eoq);
        if (z) {
            A0H.addFlags(16);
            spinnerImageView = eoq.A04;
            if (spinnerImageView != null) {
                c3t1 = C3T1.LOADING;
                spinnerImageView.setLoadingStatus(c3t1);
                C14360o3.A0C(eoq.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                AbstractC31178DnM.A0w(eoq);
                return;
            }
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        A0H.clearFlags(16);
        spinnerImageView = eoq.A04;
        if (spinnerImageView != null) {
            c3t1 = C3T1.SUCCESS;
            spinnerImageView.setLoadingStatus(c3t1);
            C14360o3.A0C(eoq.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            AbstractC31178DnM.A0w(eoq);
            return;
        }
        C14360o3.A0F("spinner");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37206GaH
    public final void F9p() {
        EnumC33512Erl enumC33512Erl;
        ((AbstractC31827Dyl) this.A0I.getValue()).A02();
        if (!this.A0A) {
            C36296Fzq A0b = AbstractC31172DnG.A0b(this.A0F);
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                C14360o3.A0F("categoryType");
                throw C00O.createAndThrow();
            }
            int ordinal = fanClubCategoryType.ordinal();
            if (ordinal != 3) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        enumC33512Erl = EnumC33512Erl.LEAST_INTERACTED_SUBSCRIBERS_LIST;
                    }
                    this.A0A = true;
                }
                enumC33512Erl = EnumC33512Erl.MOST_INTERACTED_SUBSCRIBERS_LIST;
            } else {
                enumC33512Erl = EnumC33512Erl.MOST_RECENT_SUBSCRIBERS_LIST;
            }
            C36296Fzq.A02(EnumC33514Ern.A0T, enumC33512Erl, A0b, "unselect_all", "tap", null);
            this.A0A = true;
        }
    }

    @Override // X.InterfaceC37206GaH
    public final void FC4(User user) {
        ((AbstractC31827Dyl) this.A0I.getValue()).A03(user);
        this.A0B.A06(this.A08, true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new C32634EYi(this, AbstractC166987dD.A0r(this.A0G), this.A0B), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(GVM.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A08.size() != this.A00) {
            this.A0B.A03(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 33), DialogInterfaceOnClickListenerC35452Fk9.A00(this, 34));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37206GaH
    public final void onSearchTextChanged(String str) {
        C05A c05a;
        ArrayList arrayList;
        this.A06 = str;
        C32941EeM c32941EeM = (C32941EeM) this.A0I.getValue();
        String str2 = this.A06;
        C05A c05a2 = ((AbstractC31827Dyl) c32941EeM).A00;
        c05a2.Egh(C32938EeJ.A00);
        FanClubMemberListCategoryRepository fanClubMemberListCategoryRepository = c32941EeM.A01;
        if (str2 != null && str2.length() != 0) {
            c05a = fanClubMemberListCategoryRepository.A01;
            Iterable A0w = AbstractC31172DnG.A0w(fanClubMemberListCategoryRepository.A00);
            arrayList = AbstractC166987dD.A1E();
            for (Object obj : A0w) {
                if (AbstractC002300n.A0h(((E7i) ((InterfaceC58223PrT) obj)).A00.getUsername(), str2, false)) {
                    arrayList.add(obj);
                }
            }
        } else {
            c05a = fanClubMemberListCategoryRepository.A01;
            arrayList = null;
        }
        c05a.Egh(arrayList);
        c05a2.Egh(C32937EeI.A00);
    }

    public EOQ() {
        D87 d87 = new D87(this, 24);
        D87 d872 = new D87(this, 21);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D87(d872, 22));
        this.A0I = AbstractC25225BEi.A0a(new D87(A00, 23), d87, new C50169MDw(21, A00, null), AbstractC25225BEi.A1D(C32941EeM.class));
        this.A0F = C1XM.A00(new D87(this, 20));
        this.A0B = new C34723FRm();
        this.A07 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1I();
        this.A03 = C32939EeK.A00;
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C50253MHi("unknown", this, "entrypoint", 48));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new GSl(this));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new GSm(this));
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new GSn(this));
        this.A0G = AbstractC60492pY.A02(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (X.C14360o3.A0K(r2.A03, X.C32938EeJ.A00) != false) goto L10;
     */
    @Override // X.InterfaceC37206GaH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DdQ() {
        /*
            r2 = this;
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C14360o3.A0C(r1, r0)
            X.AbstractC31178DnM.A0w(r2)
            java.util.List r0 = r2.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L29
        L1e:
            X.EsU r1 = r2.A03
            X.EeJ r0 = X.C32938EeJ.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r1 = 1
            if (r0 == 0) goto L2a
        L29:
            r1 = 0
        L2a:
            X.FRm r0 = r2.A0B
            if (r1 == 0) goto L42
            X.Fet r0 = r0.A04
            if (r0 != 0) goto L3c
            java.lang.String r0 = "recipientsBarController"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            android.view.ViewGroup r0 = r0.A00
            X.AbstractC167007dF.A0x(r0)
            return
        L42:
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOQ.DdQ():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-815028032);
        super.onCreate(bundle);
        this.A01 = (FanClubCategoryType) AbstractC153636vY.A00(requireArguments(), FanClubCategoryType.class, "fan_club_category_type");
        this.A05 = AbstractC153636vY.A01(requireArguments(), "fan_club_category_name");
        C0f9.A09(-547620466, A02);
    }
}
