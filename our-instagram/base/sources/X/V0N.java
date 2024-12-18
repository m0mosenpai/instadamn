package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0N extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AdToolsHighlightsHubSeeAllFragment";
    public W6I A00;
    public C67920V2k A01;
    public C69785VvQ A02;
    public C3FR A03;
    public InterfaceC70513Em A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public String A08;
    public C70399WUb A09;
    public final List A0A = new ArrayList();
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970329);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        AbstractC31176DnK.A1C(new WNN(this, 66), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ads_manager_highlights_hub_see_all_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = AbstractC31180DnO.A0V(view);
        InterfaceC09390do interfaceC09390do = this.A0B;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 1);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(C33L.A00(view, userSession, C05F.A0u), R.id.ad_tools_recycler_view);
        C67920V2k c67920V2k = this.A01;
        if (c67920V2k == null) {
            str = "promoteAdToolsAdapter";
        } else {
            recyclerView.setAdapter(c67920V2k);
            AbstractC31174DnI.A16(getContext(), recyclerView, 1, false);
            this.A04 = AbstractC1571573u.A01(view, (UserSession) interfaceC09390do.getValue(), new C71092Wno(this, 0));
            C3FQ A00 = C3FN.A00(recyclerView);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C3FR c3fr = (C3FR) A00;
            this.A03 = c3fr;
            if (c3fr != null) {
                c3fr.ARj();
                InterfaceC70513Em interfaceC70513Em = this.A04;
                str = "pullToRefresh";
                if (interfaceC70513Em != null) {
                    if (interfaceC70513Em instanceof C71094Wnq) {
                        C3FR c3fr2 = this.A03;
                        if (c3fr2 != null) {
                            c3fr2.setUpPTRSpinner((C71094Wnq) interfaceC70513Em);
                        }
                    }
                    A00(this);
                    return;
                }
            }
            C14360o3.A0F("recyclerViewProxy");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(V0N v0n) {
        SpinnerImageView spinnerImageView;
        List list = v0n.A0A;
        list.clear();
        C3FR c3fr = v0n.A03;
        String str = "recyclerViewProxy";
        if (c3fr != null) {
            c3fr.EWc(true);
            C3FR c3fr2 = v0n.A03;
            if (c3fr2 != null) {
                c3fr2.APU();
                C3FR c3fr3 = v0n.A03;
                if (c3fr3 != null) {
                    c3fr3.setIsLoading(true);
                    InterfaceC70513Em interfaceC70513Em = v0n.A04;
                    str = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(true);
                        if (list.isEmpty()) {
                            InterfaceC70513Em interfaceC70513Em2 = v0n.A04;
                            if (interfaceC70513Em2 != null) {
                                if (!(interfaceC70513Em2 instanceof C71094Wnq) && (spinnerImageView = v0n.A05) != null) {
                                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                }
                            }
                        }
                        C69785VvQ c69785VvQ = v0n.A02;
                        if (c69785VvQ == null) {
                            str = "promoteAdsManagerDataFetcher";
                        } else {
                            c69785VvQ.A00(new C66081TzI(v0n, 5), "IG_BOOST");
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(V0N v0n) {
        C3FR c3fr = v0n.A03;
        String str = "recyclerViewProxy";
        if (c3fr != null) {
            c3fr.EWc(false);
            C3FR c3fr2 = v0n.A03;
            if (c3fr2 != null) {
                c3fr2.ARj();
                C3FR c3fr3 = v0n.A03;
                if (c3fr3 != null) {
                    c3fr3.setIsLoading(false);
                    InterfaceC70513Em interfaceC70513Em = v0n.A04;
                    if (interfaceC70513Em == null) {
                        str = "pullToRefresh";
                    } else {
                        interfaceC70513Em.setIsLoading(false);
                        SpinnerImageView spinnerImageView = v0n.A05;
                        if (spinnerImageView != null) {
                            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(V0N v0n) {
        W6I w6i = v0n.A00;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A07("ads_manager_highlights_hub", AppStateModule.APP_STATE_ACTIVE, v0n.A07, "FB Login failed or cancelled");
        AbstractC65702TsY.A17(v0n);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0B.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int A02 = C0f9.A02(-683373706);
        super.onCreate(bundle);
        this.A01 = new C67920V2k(requireContext(), this);
        InterfaceC09390do interfaceC09390do = this.A0B;
        this.A02 = new C69785VvQ(requireContext(), this, (UserSession) interfaceC09390do.getValue());
        this.A09 = AbstractC43594JPz.A0N(interfaceC09390do);
        this.A00 = VRC.A00((UserSession) interfaceC09390do.getValue());
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString("media_id");
        } else {
            str = null;
        }
        this.A07 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("page_id");
        } else {
            str2 = null;
        }
        this.A08 = str2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("boosted_id");
        }
        this.A06 = str3;
        C0f9.A09(-1541801031, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1902344945);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        C0f9.A09(-2083055216, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1834237049);
        this.A05 = null;
        super.onDestroyView();
        C0f9.A09(-806887161, A02);
    }
}
