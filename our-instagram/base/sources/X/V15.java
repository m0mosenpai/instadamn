package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V15 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC62612t0, InterfaceC60122ou, InterfaceC71976XDj {
    public static final String __redex_internal_original_name = "PromoteAdToolsPastPromotionsFragment";
    public int A00;
    public W6I A01;
    public C67920V2k A02;
    public C69785VvQ A03;
    public C3FR A04;
    public InterfaceC70513Em A05;
    public SpinnerImageView A06;
    public String A07;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public C70399WUb A0F;
    public final List A0H = new ArrayList();
    public final List A0G = new ArrayList();
    public String A08 = "ads_manager";
    public final InterfaceC41501vz A0J = new C70723Wfo(this, 4);
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    public static final void A02(V15 v15, boolean z) {
        v15.A0D = true;
        W6f.A00(v15.requireActivity(), new C70619Wdx(v15, z), (UserSession) v15.A0I.getValue());
    }

    @Override // X.InterfaceC71976XDj
    public final void CuY(PromoteAdsManagerActionType promoteAdsManagerActionType, InterfaceC72003XEr interfaceC72003XEr) {
        C14360o3.A0B(promoteAdsManagerActionType, 1);
        if (this.A0E) {
            WGU.A04(requireContext(), this.A0A, this.A09);
            return;
        }
        C70654Wea c70654Wea = (C70654Wea) interfaceC72003XEr;
        int ordinal = promoteAdsManagerActionType.ordinal();
        boolean z = true;
        if (ordinal != 6) {
            if (ordinal != 7) {
                return;
            }
            ImageUrl C89 = c70654Wea.C89();
            if (c70654Wea.BIP() != InstagramMediaProductType.A0K) {
                z = false;
            }
            WGU.A03(requireContext(), new DialogInterfaceOnClickListenerC70206WHe(4, c70654Wea, this), this, C89, z);
            return;
        }
        W6I w6i = this.A01;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A08("past_promotion_list", MSV.A00(1517), c70654Wea.BZZ(), null);
        C1Y6 A00 = AbstractC69888VxF.A00();
        C1Y5 A002 = VRF.A00();
        String BZZ = c70654Wea.BZZ();
        String str = this.A08;
        WEX A003 = A002.A00(requireContext(), (UserSession) this.A0I.getValue(), BZZ, str);
        A003.A01 = BoostFlowType.A04;
        A00.A06(this, A003, this);
    }

    @Override // X.InterfaceC71976XDj
    public final void E0g(InterfaceC72003XEr interfaceC72003XEr) {
        String str;
        W6I w6i = this.A01;
        String str2 = "adsManagerLogger";
        if (w6i != null) {
            if (AbstractC001800i.A0J(interfaceC72003XEr.BzE()) != null) {
                str = "view_ad_comparison_insights";
            } else {
                str = "view_insights";
            }
            w6i.A0A("past_promotion_list", str, interfaceC72003XEr.BZZ(), null);
            if (this.A0E) {
                WGU.A04(requireContext(), this.A0A, this.A09);
                return;
            }
            C70654Wea c70654Wea = (C70654Wea) interfaceC72003XEr;
            W6I w6i2 = this.A01;
            if (w6i2 != null) {
                String str3 = c70654Wea.A0C;
                if (str3 != null) {
                    w6i2.A08("past_promotion_list", "view_insights", str3, null);
                    UserSession userSession = (UserSession) this.A0I.getValue();
                    FragmentActivity requireActivity = requireActivity();
                    String str4 = c70654Wea.A0C;
                    if (str4 != null) {
                        WGU.A05(requireActivity, c70654Wea, userSession, str4, "ads_manager", new HashMap(), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A0K), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A0F), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A06));
                        return;
                    }
                }
                str2 = "adsMediaIgId";
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970342);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        AbstractC31176DnK.A1C(new WNT(this, 4), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ads_manager_past_promotions_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = AbstractC31180DnO.A0V(view);
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 1);
        View A00 = C33L.A00(view, userSession, C05F.A0u);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(A00, R.id.ad_tools_recycler_view);
        C67920V2k c67920V2k = this.A02;
        if (c67920V2k == null) {
            str = "pastPromotionsAdapter";
        } else {
            recyclerView.setAdapter(c67920V2k);
            AbstractC31174DnI.A15(requireContext(), recyclerView);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            this.A05 = AbstractC1571573u.A01(A00, (UserSession) interfaceC09390do.getValue(), new C71092Wno(this, 2));
            AbstractC37304Gc5.A0y(linearLayoutManager, recyclerView, this, C153146ui.A0A);
            C3FQ A002 = C3FN.A00(recyclerView);
            C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C3FR c3fr = (C3FR) A002;
            this.A04 = c3fr;
            str = "recyclerViewProxy";
            if (c3fr != null) {
                c3fr.ARj();
                InterfaceC70513Em interfaceC70513Em = this.A05;
                if (interfaceC70513Em == null) {
                    C14360o3.A0F("pullToRefresh");
                    throw C00O.createAndThrow();
                }
                if (interfaceC70513Em instanceof C71094Wnq) {
                    C3FR c3fr2 = this.A04;
                    if (c3fr2 != null) {
                        c3fr2.setUpPTRSpinner((C71094Wnq) interfaceC70513Em);
                        list = this.A0H;
                        if (list != null || list.isEmpty()) {
                            A02(this, true);
                            return;
                        }
                        return;
                    }
                } else {
                    List list2 = this.A0H;
                    if (list2 == null || list2.isEmpty()) {
                        SpinnerImageView spinnerImageView = this.A06;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            spinnerImageView.setLoadingStatus(C3T1.LOADING);
                        }
                    }
                    C3FR c3fr3 = this.A04;
                    if (c3fr3 != null) {
                        c3fr3.Ehc(new RunnableC71310Wre(this));
                        list = this.A0H;
                        if (list != null) {
                        }
                        A02(this, true);
                        return;
                    }
                }
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C9CN A00() {
        Map map = C0YZ.A03;
        CallerContext A01 = CallerContext.A01(AbstractC13230m9.A01(V15.class));
        C14360o3.A0A(A01);
        return new C9CN(A01, "ig_android_promote_ads_manager_ig_to_fb_fetch_promotions", "ads_manager", VG4.A05.toString(), "past_promotion_list");
    }

    public static final void A01(V15 v15, String str, boolean z) {
        int A01 = (int) C18U.A01(C06090Tz.A05, (AbstractC12990ll) v15.A0I.getValue(), 36612526024235412L);
        C69785VvQ c69785VvQ = v15.A03;
        if (c69785VvQ == null) {
            C14360o3.A0F("pastPromotionsDataFetcher");
            throw C00O.createAndThrow();
        }
        int i = v15.A00;
        C67953V3s c67953V3s = new C67953V3s(v15, A01, z);
        C1ON A00 = VRS.A00(c69785VvQ.A02, "INACTIVE", str, A01, i);
        A00.A00 = c67953V3s;
        c69785VvQ.A01.schedule(A00);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A0C && !this.A0D) {
            A02(this, false);
        }
    }

    @Override // X.InterfaceC71976XDj
    public final void E0j(InterfaceC72003XEr interfaceC72003XEr) {
        String A0R = AnonymousClass001.A0R("promote_ads_manager_past_promotions_fragment", ".BACK_STACK");
        WFR wfr = AbstractC68626VYc.A00;
        String BZY = interfaceC72003XEr.BZY();
        wfr.A05(requireActivity(), (UserSession) this.A0I.getValue(), A0R, BZY);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0I.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        W6I w6i = this.A01;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A01(VG4.A06.toString());
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // X.InterfaceC71976XDj
    public final void Dsy(InterfaceC72003XEr interfaceC72003XEr) {
        XIGIGBoostCallToAction Ax0 = interfaceC72003XEr.Ax0();
        W6I w6i = this.A01;
        String str = null;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A08("past_promotion_list", "promotion_preview", interfaceC72003XEr.BZZ(), null);
        Context requireContext = requireContext();
        UserSession userSession = (UserSession) this.A0I.getValue();
        String BZZ = interfaceC72003XEr.BZZ();
        if (Ax0 != null) {
            str = Ax0.toString();
        }
        AbstractC138316On.A02(requireContext, userSession, "ads_manager", BZZ, str, interfaceC72003XEr.BeH(), interfaceC72003XEr.BIS());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-189339832);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0I;
        this.A02 = new C67920V2k(requireContext(), this, this, (UserSession) interfaceC09390do.getValue());
        this.A03 = new C69785VvQ(requireContext(), this, (UserSession) interfaceC09390do.getValue());
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0J, C70702WfR.class);
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C9CN A00 = A00();
        C70616Wdu c70616Wdu = new C70616Wdu(this, 2);
        C14360o3.A0B(userSession, 0);
        C97N.A00(C97M.A00(userSession)).AV3(A00, C97J.A00, c70616Wdu);
        AbstractC68461VRr.A00(A00(), new C70616Wdu(this, 3), (UserSession) interfaceC09390do.getValue());
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string != null) {
            this.A08 = string;
        }
        this.A01 = VRC.A00((UserSession) interfaceC09390do.getValue());
        this.A0F = AbstractC43594JPz.A0N(interfaceC09390do);
        C0f9.A09(1949339255, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-689883828);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        C0f9.A09(1403042457, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-975635243);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0I).A02(this.A0J, C70702WfR.class);
        this.A00 = 0;
        this.A0G.clear();
        this.A0C = false;
        C0f9.A09(-385831837, A02);
    }
}
