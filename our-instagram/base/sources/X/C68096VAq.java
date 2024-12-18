package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.VAq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68096VAq extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePaymentsInterstitialFragment";
    public AbstractC018607g A00;
    public BaseFragmentActivity A01;
    public C70399WUb A02;
    public C18920wW A03;
    public EnumC68189VFh A04;
    public C69426VnB A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953858);
        interfaceC56362iU.setIsLoading(this.A07);
        interfaceC56362iU.EkG(this.A07);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_payments_interstitial_settings";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A08.getValue();
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1953150286);
        super.onCreate(bundle);
        this.A00 = AbstractC018607g.A00(this);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        this.A01 = (BaseFragmentActivity) requireActivity;
        InterfaceC09390do interfaceC09390do = this.A08;
        this.A03 = AbstractC12220kQ.A02((AbstractC12990ll) interfaceC09390do.getValue());
        this.A02 = AbstractC43594JPz.A0N(interfaceC09390do);
        C18920wW c18920wW = this.A03;
        if (c18920wW != null) {
            UserSession userSession = (UserSession) interfaceC09390do.getValue();
            BaseFragmentActivity baseFragmentActivity = this.A01;
            if (baseFragmentActivity == null) {
                str = "activity";
            } else {
                C70399WUb c70399WUb = this.A02;
                if (c70399WUb == null) {
                    str = "promotedPostsLogger";
                } else {
                    String str2 = c70399WUb.A03;
                    C14360o3.A07(str2);
                    this.A05 = new C69426VnB(baseFragmentActivity, c18920wW, userSession, this, this, str2);
                    C18920wW c18920wW2 = this.A03;
                    if (c18920wW2 != null) {
                        C25531Mh c25531Mh = new C25531Mh(c18920wW2.A00(c18920wW2.A00, "fulcrum_event"), 156);
                        c25531Mh.A0k("fulcrum_nexus_entry");
                        c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "fulcrum_nexus");
                        c25531Mh.A0R("flow", "fulcrum_nexus_main");
                        c25531Mh.A0j("view");
                        c25531Mh.Cht();
                        if (C18U.A06(C06090Tz.A06, (AbstractC12990ll) interfaceC09390do.getValue(), 36319566304976406L)) {
                            AbstractC12990ll A0M = AbstractC31178DnM.A0M(interfaceC09390do);
                            ((C69589Vrs) ((C68717Vat) A0M.A01(C68717Vat.class, new X31(A0M, 1))).A00.getValue()).A00(new C50679MYx("AD_PAYMENTS", (String) null, 20));
                        }
                        C0f9.A09(-788502099, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "logger";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1747215634);
        super.onStart();
        this.A07 = true;
        BaseFragmentActivity baseFragmentActivity = this.A01;
        String str = "activity";
        if (baseFragmentActivity != null) {
            AbstractC31175DnJ.A0i(baseFragmentActivity);
            BaseFragmentActivity baseFragmentActivity2 = this.A01;
            if (baseFragmentActivity2 != null) {
                AbstractC018607g abstractC018607g = this.A00;
                if (abstractC018607g == null) {
                    str = "loaderManager";
                } else {
                    C70187WFq.A01(baseFragmentActivity2, abstractC018607g, new C70660Weg(this, 3), (UserSession) this.A08.getValue());
                    C0f9.A09(1689583736, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
