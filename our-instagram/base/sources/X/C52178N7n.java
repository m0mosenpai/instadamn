package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.N7n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52178N7n extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC58184Pqp {
    public static final String __redex_internal_original_name = "MediaAudienceRestrictionsFragment";
    public String A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC58184Pqp
    public final boolean CvB(boolean z) {
        return false;
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvJ() {
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvK() {
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvW(boolean z) {
        return false;
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CwP(boolean z) {
        return false;
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
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("ARGUMENT_MEDIA_TYPE", "feed");
        this.A02 = requireArguments.getBoolean("ARGUMENT_IS_EDITING", false);
        this.A01 = requireArguments.getBoolean("entered_from_disclosure_menu", false);
        View inflate = AbstractC167007dF.A0M(view, R.id.action_bar).inflate();
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(inflate, R.id.action_bar_title), this, 2131954171);
        ViewOnClickListenerC55467OkM.A00(AbstractC166997dE.A0S(inflate, R.id.action_bar_button_back), 35, this);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C50972Mff) interfaceC09390do.getValue()).A04, new C50259MHo(this, 18), 40);
        JQ0.A11(this, new MC5(this, null, 29), ((C50972Mff) interfaceC09390do.getValue()).A07);
        BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) requireArguments.getParcelable("BRANDED_CONTENT_GATING_INFO");
        if (brandedContentGatingInfo == null) {
            brandedContentGatingInfo = new BrandedContentGatingInfo(null, null, null, null, null);
        }
        C50972Mff c50972Mff = (C50972Mff) interfaceC09390do.getValue();
        String str2 = "";
        if (!OO4.A00(brandedContentGatingInfo)) {
            str = "";
        } else {
            str = getString(2131968953);
        }
        C14360o3.A0A(str);
        if (OO4.A01(brandedContentGatingInfo)) {
            str2 = AbstractC55199Oe9.A03(requireContext(), brandedContentGatingInfo);
        }
        c50972Mff.A00(brandedContentGatingInfo, str, str2);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new NED(this), new NEO(this, AbstractC166987dD.A0r(this.A03)));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57612PhO.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (C14360o3.A0K(this.A00, "feed") && !this.A02 && !this.A01) {
            AbstractC43593JPy.A1P(AbstractC166987dD.A0r(this.A03));
            return true;
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    public C52178N7n() {
        C50150MDd c50150MDd = new C50150MDd(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50150MDd(new C50150MDd(this, 30), 31));
        this.A04 = AbstractC25225BEi.A0a(new C50150MDd(A00, 32), c50150MDd, new MHW(41, (Object) null, A00), AbstractC25225BEi.A1D(C50972Mff.class));
        this.A00 = "feed";
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC58184Pqp
    public final void DQD(View view) {
        String str;
        Context A05 = AbstractC31176DnK.A05(this, view);
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        List list = ((C50972Mff) this.A04.getValue()).A00.A04;
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
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        BrandedContentGatingInfo brandedContentGatingInfo = ((C50972Mff) this.A04.getValue()).A00;
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
        HashMap hashMap;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 32779 && i2 == -1 && intent != null && intent.hasExtra("bloks_on_activity_result")) {
            InterfaceC09390do interfaceC09390do = this.A04;
            C50972Mff c50972Mff = (C50972Mff) interfaceC09390do.getValue();
            UserSession A0r = AbstractC166987dD.A0r(this.A03);
            BrandedContentGatingInfo brandedContentGatingInfo = ((C50972Mff) interfaceC09390do.getValue()).A00;
            Serializable serializableExtra = intent.getSerializableExtra("bloks_on_activity_result");
            if (serializableExtra instanceof HashMap) {
                hashMap = (HashMap) serializableExtra;
            } else {
                hashMap = null;
            }
            c50972Mff.A00 = AbstractC172137li.A00(brandedContentGatingInfo, this, A0r, null, hashMap);
            C50972Mff c50972Mff2 = (C50972Mff) interfaceC09390do.getValue();
            BrandedContentGatingInfo brandedContentGatingInfo2 = ((C50972Mff) interfaceC09390do.getValue()).A00;
            String str2 = "";
            if (!OO4.A00(((C50972Mff) interfaceC09390do.getValue()).A00)) {
                str = "";
            } else {
                str = getString(2131968953);
            }
            C14360o3.A0A(str);
            if (OO4.A01(((C50972Mff) interfaceC09390do.getValue()).A00)) {
                str2 = AbstractC55199Oe9.A03(requireContext(), ((C50972Mff) interfaceC09390do.getValue()).A00);
            }
            c50972Mff2.A00(brandedContentGatingInfo2, str, str2);
            C06C.A00(AbstractC31178DnM.A06("bundle_key_gating_info", ((C50972Mff) interfaceC09390do.getValue()).A00), this, "request_key_audience_restrictions");
        }
    }
}
