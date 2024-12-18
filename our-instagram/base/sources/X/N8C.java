package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N8C extends AbstractC52176N7l implements InterfaceC60072op, InterfaceC58184Pqp, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureFragment";
    public C64842wi A00;
    public boolean A01;
    public final C64752wZ A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvB(boolean z) {
        return false;
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        C14360o3.A0B(user, 0);
        A02(this).A05(user);
        InterfaceC09390do interfaceC09390do = super.A01;
        AbstractC55148OdB.A04(this, AbstractC166987dD.A0r(interfaceC09390do), __redex_internal_original_name);
        LL0.A05(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0U, AbstractC167007dF.A0n("brand_id", user.getId()));
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean DkH() {
        return false;
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
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(super.A01);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0C;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A00 = new C56500P6y(this, 2);
        A0S.A08 = P76.A00;
        C64842wi A0T = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
        this.A00 = A0T;
        EnumSet of = EnumSet.of(Trigger.A0F);
        C14360o3.A07(of);
        A0T.AVr(of);
        View inflate = AbstractC167007dF.A0M(view, R.id.action_bar).inflate();
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.action_bar_title);
        int i = 2131972588;
        if (A02(this).A0D) {
            i = 2131961583;
        }
        AbstractC25227BEk.A12(A0N, this, i);
        ViewOnClickListenerC55467OkM.A00(AbstractC166997dE.A0S(inflate, R.id.action_bar_button_back), 42, this);
        View A0S2 = AbstractC166997dE.A0S(inflate, R.id.action_bar_button_done);
        C0fQ.A00(new ViewOnClickListenerC55464OkJ(12, this, A0S2), A0S2);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), A02(this).A00, new C50259MHo(this, 20), 41);
        if (A02(this).A0A) {
            MSY.A1M(this, AbstractC25235BEs.A0S(this), 17);
        }
        BrandedContentDisclosureViewModel A02 = A02(this);
        String str2 = "";
        if (!OO4.A00(((BrandedContentDisclosureBaseViewModel) A02(this)).A01)) {
            str = "";
        } else {
            str = getString(2131968953);
        }
        C14360o3.A0A(str);
        if (OO4.A01(((BrandedContentDisclosureBaseViewModel) A02(this)).A01)) {
            str2 = AbstractC55199Oe9.A03(requireContext(), ((BrandedContentDisclosureBaseViewModel) A02(this)).A01);
        }
        AbstractC167007dF.A1K(str, str2);
        A02.A04();
        A02(this).A04();
        JQ0.A11(this, new MC7((InterfaceC23621Ds) null, this, view, 14), A02(this).A0H);
    }

    public static final BrandedContentDisclosureViewModel A02(N8C n8c) {
        return (BrandedContentDisclosureViewModel) n8c.A03.getValue();
    }

    public static final void A03(N8C n8c) {
        boolean z;
        String str;
        InterfaceC09390do interfaceC09390do = ((AbstractC52176N7l) n8c).A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean z2 = A02(n8c).A0D;
        BrandedContentDisclosureViewModel A02 = A02(n8c);
        if (AbstractC166987dD.A1b(A02.A06)) {
            z = ((BrandedContentTag) A02.A06.get(0)).A04;
        } else {
            z = false;
        }
        String A1H = AbstractC25226BEj.A1H(", ", A02(n8c).A06, C57616PhS.A00);
        String str2 = A02(n8c).A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(n8c, A0r, 0), "instagram_bc_settings_exit");
        A0f.A7v("is_permission_enabled", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z2), "is_editing", z));
        A0f.AAP("sponsor_igid", A1H);
        AbstractC50523MSb.A10(A0f, null, str2);
        AbstractC37300Gc1.A0n(A0f, __redex_internal_original_name);
        A0f.Cht();
        if (!A02(n8c).A0D) {
            String str3 = A02(n8c).A05;
            switch (str3.hashCode()) {
                case 3138974:
                    if (!str3.equals("feed")) {
                        return;
                    }
                    AbstractC43593JPy.A1P(AbstractC166987dD.A0r(interfaceC09390do));
                    if (!n8c.A01) {
                        return;
                    }
                    AbstractC43593JPy.A1P(AbstractC166987dD.A0r(interfaceC09390do));
                    return;
                case 3230752:
                    str = "igtv";
                    break;
                case 3322092:
                    if (!str3.equals("live")) {
                        return;
                    }
                    AbstractC25231BEo.A16(n8c);
                    return;
                case 3496474:
                    str = "reel";
                    break;
                case 109770997:
                    str = "story";
                    break;
                default:
                    return;
            }
            if (!str3.equals(str)) {
                return;
            }
            AbstractC25226BEj.A1P(n8c);
            if (!n8c.A01) {
                return;
            }
        }
        AbstractC25226BEj.A1P(n8c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        NED ned = new NED(this);
        InterfaceC09390do interfaceC09390do = super.A01;
        return AbstractC16960so.A1Q(ned, new EXW(this, this, this, AbstractC166987dD.A0r(interfaceC09390do)), new NEO(this, AbstractC166987dD.A0r(interfaceC09390do)), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57617PhT.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A01);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2wZ, java.lang.Object] */
    public N8C() {
        C50150MDd c50150MDd = new C50150MDd(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50150MDd(new C50150MDd(this, 40), 41));
        this.A03 = AbstractC25225BEi.A0a(new C50150MDd(A00, 42), c50150MDd, new MHW(48, (Object) null, A00), AbstractC25225BEi.A1D(BrandedContentDisclosureViewModel.class));
        this.A01 = true;
        AbstractC54912fq.A00();
        this.A02 = new Object();
    }

    public static final void A04(N8C n8c) {
        C193328hC A0O = AbstractC31175DnJ.A0O(n8c);
        A0O.A0A(2131975167);
        A0O.A09(2131960932);
        A0O.A0L(DialogInterfaceOnClickListenerC55319Ogh.A00(n8c, 11), 2131960921);
        A0O.A0H(null, 2131964718);
        AbstractC166987dD.A1W(A0O);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.NKj, X.MZs] */
    @Override // X.InterfaceC58184Pqp
    public final void CvJ() {
        InterfaceC09390do interfaceC09390do;
        if (C14360o3.A0K(A02(this).A05, "feed") && !A02(this).A0D) {
            interfaceC09390do = super.A01;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            BrandedContentGatingInfo brandedContentGatingInfo = ((BrandedContentDisclosureBaseViewModel) A02(this)).A01;
            ?? abstractC50697MZs = new AbstractC50697MZs("media_audience_restrictions");
            abstractC50697MZs.A00 = brandedContentGatingInfo;
            C50695MZq.A00(A0r, abstractC50697MZs);
        } else {
            FragmentActivity requireActivity = requireActivity();
            interfaceC09390do = super.A01;
            C140966Yy A00 = FT2.A00(requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
            A00.A0D(AbstractC55149OdC.A01(((BrandedContentDisclosureBaseViewModel) A02(this)).A01, A02(this).A05, A02(this).A0D, false));
            A00.A04();
        }
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0V);
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvK() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A02(this).A06.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0n = MSW.A0n(it);
            User user = A0n.A00;
            if (user != null || (user = AnonymousClass189.A00(AbstractC166987dD.A0r(super.A01)).A02(A0n.A01)) != null) {
                A1E.add(user);
            }
        }
        C55853Or3 c55853Or3 = new C55853Or3(this);
        N8G n8g = new N8G();
        String str = A02(this).A05;
        boolean z = A02(this).A0D;
        BrandedContentGatingInfo brandedContentGatingInfo = ((BrandedContentDisclosureBaseViewModel) A02(this)).A01;
        boolean z2 = A02(this).A09;
        n8g.A01 = c55853Or3;
        n8g.A07 = true;
        MSZ.A1J(brandedContentGatingInfo, n8g, str, A1E, z);
        n8g.A08 = z2;
        C6WI.A01().A0E = true;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = super.A01;
        AbstractC31177DnL.A16(n8g, requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0T);
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvW(boolean z) {
        BrandedContentDisclosureViewModel A02 = A02(this);
        A02.A0E = z;
        if (!z) {
            A02.A06 = AbstractC166987dD.A1E();
            ((BrandedContentDisclosureBaseViewModel) A02).A01 = new BrandedContentGatingInfo(null, null, null, null, null);
        }
        A02.A04();
        return true;
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CwP(boolean z) {
        return A0D(A02(this), super.A00, z);
    }

    @Override // X.InterfaceC58184Pqp
    public final void DQD(View view) {
        String str;
        Context A05 = AbstractC31176DnK.A05(this, view);
        UserSession A0r = AbstractC166987dD.A0r(super.A01);
        List list = ((BrandedContentDisclosureBaseViewModel) A02(this)).A01.A04;
        if (list != null) {
            str = AbstractC31175DnJ.A0b(list);
            C14360o3.A0A(str);
        } else {
            str = "";
        }
        Map singletonMap = Collections.singletonMap("blocked_countries_str", str);
        C14360o3.A07(singletonMap);
        OO2.A01(A05, view, this, A0r, singletonMap);
    }

    @Override // X.InterfaceC58184Pqp
    public final void DTc(View view) {
        Context A05 = AbstractC31176DnK.A05(this, view);
        UserSession A0r = AbstractC166987dD.A0r(super.A01);
        BrandedContentGatingInfo brandedContentGatingInfo = ((BrandedContentDisclosureBaseViewModel) A02(this)).A01;
        HashMap A1G = AbstractC166987dD.A1G();
        Integer num = brandedContentGatingInfo.A00;
        if (num != null) {
            A1G.put("default_age", num);
        }
        HashMap hashMap = brandedContentGatingInfo.A02;
        if (hashMap != null) {
            A1G.putAll(hashMap);
        }
        String A0d = AbstractC31175DnJ.A0d(A1G);
        C14360o3.A07(A0d);
        Map singletonMap = Collections.singletonMap("countries_and_ages_str", A0d);
        C14360o3.A07(singletonMap);
        OO2.A00(A05, view, this, A0r, singletonMap);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 32779 && i2 == -1 && intent != null && intent.hasExtra("bloks_on_activity_result")) {
            BrandedContentDisclosureViewModel A02 = A02(this);
            UserSession A0r = AbstractC166987dD.A0r(super.A01);
            BrandedContentGatingInfo brandedContentGatingInfo = ((BrandedContentDisclosureBaseViewModel) A02(this)).A01;
            Serializable serializableExtra = intent.getSerializableExtra("bloks_on_activity_result");
            C14360o3.A0C(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            ((BrandedContentDisclosureBaseViewModel) A02).A01 = AbstractC172137li.A00(brandedContentGatingInfo, this, A0r, (BrandedContentTag) AbstractC001800i.A0O(AbstractC001800i.A0a(A02(this).A06), 0), (HashMap) serializableExtra);
            BrandedContentDisclosureViewModel A022 = A02(this);
            String str2 = "";
            if (!OO4.A00(((BrandedContentDisclosureBaseViewModel) A02(this)).A01)) {
                str = "";
            } else {
                str = getString(2131968953);
            }
            C14360o3.A0A(str);
            if (OO4.A01(((BrandedContentDisclosureBaseViewModel) A02(this)).A01)) {
                str2 = AbstractC55199Oe9.A03(requireContext(), ((BrandedContentDisclosureBaseViewModel) A02(this)).A01);
            }
            AbstractC167007dF.A1K(str, str2);
            A022.A04();
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BrandedContentDisclosureViewModel A02 = A02(this);
        if (C14360o3.A0K(A02.A06, A02.A07) && C14360o3.A0K(((BrandedContentDisclosureBaseViewModel) A02).A02, ((BrandedContentDisclosureBaseViewModel) A02).A01) && !this.A01) {
            A03(this);
            return true;
        }
        A04(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList A0U;
        InterfaceC43551JLl interfaceC43551JLl;
        int A02 = C0f9.A02(-177280278);
        super.onCreate(bundle);
        super.A00 = requireArguments().getString("ARGUMENT_MEDIA_ID");
        BrandedContentDisclosureViewModel A022 = A02(this);
        List A0l = MSY.A0l(requireArguments().getParcelableArrayList("brand_partners"));
        BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) requireArguments().getParcelable("BRANDED_CONTENT_GATING_INFO");
        if (brandedContentGatingInfo == null) {
            brandedContentGatingInfo = new BrandedContentGatingInfo(null, null, null, null, null);
        }
        boolean z = requireArguments().getBoolean("disclosure_fragment_is_edit_flow");
        boolean z2 = requireArguments().getBoolean("disclosure_fragment_is_paid_partnership_on");
        String string = requireArguments().getString("ARGUMENT_MEDIA_TYPE");
        if (string == null) {
            string = "feed";
        }
        String str = super.A00;
        boolean z3 = requireArguments().getBoolean("has_interactive_elements_for_story");
        boolean z4 = requireArguments().getBoolean("includes_suspected_sponsor");
        boolean z5 = requireArguments().getBoolean("argument_create_ad_code");
        if (z4) {
            A022.A0A = z4;
            A022.A0E = true;
            A022.A08 = A0l;
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            A022.A07 = c16930sl;
            A0U = AbstractC166987dD.A1E();
        } else {
            A022.A0E = z2;
            A022.A07 = A0l;
            ArrayList A0q = AbstractC167017dG.A0q(A0l);
            Iterator it = A0l.iterator();
            while (it.hasNext()) {
                A0q.add(new BrandedContentTag(MSW.A0n(it)));
            }
            A0U = AbstractC001800i.A0U(A0q);
        }
        A022.A06 = A0U;
        ((BrandedContentDisclosureBaseViewModel) A022).A02 = brandedContentGatingInfo;
        HashMap hashMap = brandedContentGatingInfo.A02;
        ((BrandedContentDisclosureBaseViewModel) A022).A01 = AbstractC39781Hkr.A00(brandedContentGatingInfo.A00, brandedContentGatingInfo.A01, brandedContentGatingInfo.A03, brandedContentGatingInfo.A04, hashMap);
        A022.A0D = z;
        A022.A05 = string;
        A022.A04 = str;
        A022.A09 = z3;
        A022.A0B = z5;
        if (str != null) {
            C38321qM A0h = AbstractC25229BEm.A0h(A022.A02, str);
            if (A0h != null) {
                interfaceC43551JLl = A0h.A1F();
            } else {
                interfaceC43551JLl = null;
            }
            ((BrandedContentDisclosureBaseViewModel) A022).A00 = interfaceC43551JLl;
            if (interfaceC43551JLl != null) {
                A022.A0B = true;
            }
        }
        this.A01 = requireArguments().getBoolean("disclosure_fragment_entered_from_brand_search");
        C06C.A01(this, "request_key_audience_restrictions", new C30480DbP(this, 35));
        C0f9.A09(2017930012, A02);
    }
}
