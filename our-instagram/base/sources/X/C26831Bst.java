package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bst, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26831Bst extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, MOE {
    public static final String __redex_internal_original_name = "ThirdPartyAppPivotPageFragment";
    public C26732BrD A00;
    public C26837Bsz A01;
    public C26829Bsr A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public ImageUrl A08;
    public ImageUrl A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final String A0D = AbstractC167017dG.A0j();
    public final C05A A0H = C10E.A00(null);
    public final C05A A0G = C10E.A00(null);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131975472);
        ViewOnClickListenerC28666ClE.A02(interfaceC56362iU, this, 55);
        C3LO c3lo = new C3LO();
        c3lo.A02(C05F.A01);
        c3lo.A0G = ViewOnClickListenerC28666ClE.A00(this, 56);
        interfaceC56362iU.AA9(new C3LY(c3lo));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "third_party_app_pivot_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        ((C25833Bbo) this.A0F.getValue()).A01.A00.A04(null, null, C16930sl.A00, false);
        view.requireViewById(R.id.use_in_camera_button_scene_root).setVisibility(8);
    }

    @Override // X.MOE
    public final void DyL() {
        String str;
        String str2;
        C26029BfI c26029BfI = (C26029BfI) this.A0H.getValue();
        if (c26029BfI != null && (str = c26029BfI.A08) != null) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            AbstractC25236BEt.A0h(AbstractC31364DqT.A03().A01.A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31402Dr6.A02(AbstractC166987dD.A0r(interfaceC09390do), str, "clips_third_party_app_pivot_page", "third_party_app_pivot_page").A03()), this, AbstractC166987dD.A0o(interfaceC09390do));
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            String str3 = this.A06;
            if (str3 == null) {
                str2 = "mediaId";
            } else {
                String str4 = this.A03;
                if (str4 == null) {
                    str2 = "attributionAppId";
                } else {
                    C14360o3.A0B(A0o, 0);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "instagram_clips_viewer_link_tap");
                    if (A0f.isSampled()) {
                        AbstractC25225BEi.A1O(A0f, "third_party_app_pivot_page");
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        String A06 = C38801rC.A06(str3);
                        C14360o3.A0B(A06, 0);
                        AbstractC25236BEt.A0m(A0f, 0, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A06)));
                        A0f.A8R(BQL.A1L, "action");
                        AbstractC25225BEi.A1M(EnumC120795dP.A0l, A0f);
                        A0f.A9K("app_attribution_id", AbstractC003100w.A0k(10, str4));
                        A0f.Cht();
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public C26831Bst() {
        C29888DGc A00 = C29888DGc.A00(this, 26);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C29888DGc.A00(C29888DGc.A00(this, 23), 24));
        this.A0F = AbstractC25225BEi.A0a(C29888DGc.A00(A002, 25), A00, new D8J(14, null, A002), AbstractC25225BEi.A1D(C25833Bbo.class));
        this.A0E = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object value;
        String str;
        String str2;
        int A02 = C0f9.A02(-1701142296);
        super.onCreate(bundle);
        this.A03 = AbstractC153636vY.A01(requireArguments(), "attribution_app_id");
        this.A04 = AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(1946));
        this.A06 = AbstractC153636vY.A01(requireArguments(), "media_id");
        String string = requireArguments().getString("media_count");
        if (string == null) {
            string = "";
        }
        this.A0A = string;
        String string2 = requireArguments().getString("content_url");
        if (string2 == null) {
            string2 = "";
        }
        this.A05 = string2;
        this.A08 = (ImageUrl) requireArguments().getParcelable(AbstractC58317Pt9.A00(10));
        this.A0B = requireArguments().getString(AbstractC111324zv.A00(1193));
        this.A0C = requireArguments().getBoolean(AbstractC111324zv.A00(2927));
        this.A09 = (ImageUrl) requireArguments().getParcelable("profile_picture_url");
        requireArguments().getString("profile_id");
        ImageUrl imageUrl = this.A08;
        if (imageUrl == null) {
            imageUrl = AbstractC25225BEi.A0t("");
        }
        String str3 = this.A04;
        String str4 = "attributionAppName";
        if (str3 != null) {
            String string3 = getString(2131975470, str3);
            C14360o3.A07(string3);
            String str5 = this.A06;
            if (str5 == null) {
                str4 = "mediaId";
            } else {
                this.A07 = AnonymousClass001.A0R("https://www.instagram.com/reels/app?media_id=", str5);
                C05A c05a = this.A0H;
                do {
                    value = c05a.getValue();
                    str = this.A04;
                    if (str != null) {
                        str2 = this.A0B;
                    }
                } while (!c05a.AIi(value, new C26029BfI(null, null, null, this.A09, imageUrl, Boolean.valueOf(this.A0C), str, str2, this.A0A, false)));
                C05A c05a2 = this.A0G;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), new C27841CPe(string3)));
                C0f9.A09(1543507961, A02);
                return;
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(307712400);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        InterfaceC09390do interfaceC09390do = this.A0E;
        this.A02 = CLF.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A00 = new C26732BrD();
        String str = this.A06;
        String str2 = "mediaId";
        if (str != null) {
            this.A01 = CLE.A00(ClipsViewerSource.A2U, str, this.A0D, "third_party_app_pivot_page", false);
            C14240no c14240no = new C14240no(getChildFragmentManager());
            C26829Bsr c26829Bsr = this.A02;
            if (c26829Bsr == null) {
                str2 = "headerFragment";
            } else {
                c14240no.A09(c26829Bsr, R.id.header_container);
                C26732BrD c26732BrD = this.A00;
                if (c26732BrD != null) {
                    c14240no.A09(c26732BrD, R.id.middle_container);
                    C26837Bsz c26837Bsz = this.A01;
                    if (c26837Bsz == null) {
                        str2 = "gridFragment";
                    } else {
                        c14240no.A09(c26837Bsz, R.id.grid_container);
                        c14240no.A0H(new D1H(this));
                        c14240no.A0K();
                        if (this.A0B != null) {
                            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                            String str3 = this.A06;
                            if (str3 != null) {
                                String str4 = this.A03;
                                if (str4 != null) {
                                    C14360o3.A0B(A0o, 0);
                                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), AbstractC111324zv.A00(448));
                                    if (A0f.isSampled()) {
                                        AbstractC25225BEi.A1O(A0f, "third_party_app_pivot_page");
                                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                                        String A06 = C38801rC.A06(str3);
                                        C14360o3.A0B(A06, 0);
                                        AbstractC25236BEt.A0m(A0f, 0, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A06)));
                                        A0f.A9K("app_attribution_id", AbstractC003100w.A0k(10, str4));
                                        A0f.A8R(BQL.A1L, "action");
                                        AbstractC25225BEi.A1M(EnumC120795dP.A0l, A0f);
                                        A0f.Cht();
                                    }
                                }
                                C14360o3.A0F("attributionAppId");
                                throw C00O.createAndThrow();
                            }
                        }
                        String str5 = this.A05;
                        if (str5 == null) {
                            str2 = "contentUrl";
                        } else {
                            if (str5.length() == 0) {
                                AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                                C14360o3.A07(childFragmentManager);
                                C14240no c14240no2 = new C14240no(childFragmentManager);
                                C26732BrD c26732BrD2 = this.A00;
                                if (c26732BrD2 != null) {
                                    c14240no2.A03(c26732BrD2);
                                    c14240no2.A00();
                                }
                            } else {
                                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
                                String str6 = this.A06;
                                if (str6 != null) {
                                    String str7 = this.A03;
                                    if (str7 != null) {
                                        C14360o3.A0B(A0o2, 0);
                                        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o2), AbstractC111324zv.A00(448));
                                        if (A0f2.isSampled()) {
                                            AbstractC25225BEi.A1O(A0f2, "third_party_app_pivot_page");
                                            AtomicBoolean atomicBoolean2 = C38321qM.A0i;
                                            String A062 = C38801rC.A06(str6);
                                            C14360o3.A0B(A062, 0);
                                            AbstractC25236BEt.A0m(A0f2, 0, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, A062)));
                                            A0f2.A9K("app_attribution_id", AbstractC003100w.A0k(10, str7));
                                            A0f2.A8R(BQL.A1K, "action");
                                            AbstractC25225BEi.A1M(EnumC120795dP.A0l, A0f2);
                                            A0f2.Cht();
                                        }
                                    }
                                    C14360o3.A0F("attributionAppId");
                                    throw C00O.createAndThrow();
                                }
                            }
                            C14360o3.A0A(inflate);
                            C0f9.A09(1020268441, A02);
                            return inflate;
                        }
                    }
                }
                C14360o3.A0F("ctaFragment");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
