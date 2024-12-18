package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.shopping.ProductSource;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class HD9 extends C38K implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, JPR {
    public static final EnumC39617HeR A0N = EnumC39617HeR.A04;
    public static final String __redex_internal_original_name = "CatalogSelectionFragment";
    public View.OnClickListener A00;
    public IgdsBottomButtonLayout A01;
    public HEW A02;
    public C41762Ied A03;
    public C41148IJn A04;
    public IMJ A05;
    public RefreshableListView A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public InterfaceC56392iX A0F;
    public EmptyStateView A0G;
    public String A0H;
    public boolean A0J;
    public final ID6 A0M = new ID6(this);
    public final ID5 A0L = new ID5(this);
    public final InterfaceC09390do A0K = AbstractC60492pY.A02(this);
    public String A0I = "";

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A0J) {
            ?? obj = new Object();
            obj.A02 = AbstractC166997dE.A0N(this).getString(2131970020);
            obj.A01 = new ViewOnClickListenerC42033Ik2(this, 59);
            interfaceC56362iU.Ehj(new C31722DwR(obj));
        } else {
            int i = 2131970020;
            if (this.A0B) {
                i = 2131964387;
            }
            interfaceC56362iU.Efu(i);
        }
        interfaceC56362iU.ARS(false);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "product_source_selection";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A0K;
        Boolean CdC = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A03.CdC();
        if (CdC != null && CdC.booleanValue()) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                C1XJ.A00.A0T();
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                String string = bundle2.getString("waterfall_id");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle2.getString("prior_module_name");
                String A00 = MSV.A00(423);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00);
                A1G.put("waterfall_id", string);
                if (string2 == null) {
                    string2 = "";
                }
                A1G.put("prior_module", string2);
                A1G.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                A1G.put(AbstractC111324zv.A00(1035), String.valueOf(true));
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2144), A1G);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A0o);
                A0C.A0U = "";
                C72743Nv A02 = W6d.A02(A0C, A01);
                C14240no c14240no = new C14240no(getParentFragmentManager());
                c14240no.A09(A02, R.id.seller_access_revoked_bloks_container);
                c14240no.A00();
                return;
            }
            return;
        }
        ListView A022 = AbstractC37300Gc1.A02(this);
        C14360o3.A0C(A022, MSV.A00(16));
        RefreshableListView refreshableListView = (RefreshableListView) A022;
        this.A06 = refreshableListView;
        if (refreshableListView != null) {
            HEW hew = this.A02;
            if (hew == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            refreshableListView.setAdapter((ListAdapter) hew);
        }
        if (!this.A0B) {
            return;
        }
        RefreshableListView refreshableListView2 = this.A06;
        if (refreshableListView2 != null) {
            refreshableListView2.setPullToRefreshBackgroundColor(requireContext().getColor(AbstractC53242c7.A0H(getContext(), R.attr.backgroundColorSecondary)));
        }
        RefreshableListView refreshableListView3 = this.A06;
        if (refreshableListView3 == null) {
            return;
        }
        refreshableListView3.setupAndEnableRefresh(new ViewOnClickListenerC42033Ik2(this, 62));
        refreshableListView3.A07 = false;
    }

    public static final void A01(HD9 hd9, EnumC153216up enumC153216up) {
        int i;
        EmptyStateView emptyStateView = hd9.A0G;
        if (emptyStateView != null) {
            emptyStateView.A0P(enumC153216up);
        }
        int ordinal = enumC153216up.ordinal();
        EmptyStateView emptyStateView2 = hd9.A0G;
        if (ordinal == 4) {
            if (emptyStateView2 != null) {
                i = 8;
            } else {
                return;
            }
        } else if (emptyStateView2 == null) {
            return;
        } else {
            i = 0;
        }
        emptyStateView2.setVisibility(i);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0K);
    }

    @Override // X.JPR
    public final void DXZ() {
        String str;
        HEW hew = this.A02;
        if (hew == null) {
            str = "adapter";
        } else {
            if (hew.isEmpty()) {
                IMJ imj = this.A05;
                if (imj == null) {
                    str = "networkHelper";
                } else if (imj.A00 != C05F.A00) {
                    imj.A00(this.A08);
                    A01(this, EnumC153216up.A06);
                }
            }
            C41762Ied c41762Ied = this.A03;
            if (c41762Ied == null) {
                str = "logger";
            } else {
                c41762Ied.A01 = A0N;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        FragmentActivity activity;
        if (this.A03 == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        if (this.A0C && (activity = getActivity()) != null) {
            int i = 0;
            if (this.A09) {
                i = -1;
            }
            activity.setResult(i);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.HjN, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String A06;
        String A0g;
        String str;
        int A02 = C0f9.A02(1730656552);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0B = requireArguments.getBoolean("in_app_signup_flow");
        this.A0E = requireArguments.getInt("in_app_signup_stepper_index");
        this.A0D = requireArguments.getInt("in_app_signup_stepper_capacity");
        String string = requireArguments.getString("in_app_signup_catalog_selection_title_text");
        if (string != null) {
            this.A0I = string;
        }
        this.A0H = requireArguments.getString("in_app_signup_bottom_button_text");
        String string2 = requireArguments.getString("in_app_signup_bottom_button_route");
        if (string2 != null) {
            this.A07 = string2;
        }
        this.A0J = requireArguments.getBoolean("is_onboarding");
        this.A0C = requireArguments.getBoolean("should_return_result");
        this.A0A = requireArguments.getBoolean("is_tabbed", false);
        InterfaceC09390do interfaceC09390do = this.A0K;
        this.A03 = new C41762Ied(AbstractC166987dD.A0r(interfaceC09390do), this, requireArguments.getString("prior_module_name"), requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), requireArguments.getString("waterfall_id"), this.A0A);
        ProductSource A00 = C41768Iek.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C41762Ied c41762Ied = this.A03;
        if (c41762Ied == null) {
            str = "logger";
        } else {
            c41762Ied.A07(A00, A0N, requireArguments.getString("initial_tab"));
            ?? obj = new Object();
            obj.A01 = null;
            obj.A00 = null;
            this.A02 = new HEW(obj, this);
            ID5 id5 = this.A0L;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Context requireContext = requireContext();
            C08790ch A002 = AbstractC018607g.A00(this);
            if (this.A0B) {
                A06 = "commerce/catalogs/signup/";
            } else {
                A06 = AbstractC13670mt.A06("commerce/user/%s/available_catalogs/", AbstractC31173DnH.A0t(interfaceC09390do));
            }
            this.A05 = new IMJ(requireContext, A002, A0r, id5, A06);
            ID6 id6 = this.A0M;
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Context requireContext2 = requireContext();
            C08790ch A003 = AbstractC018607g.A00(this);
            if (this.A0B) {
                A0g = "commerce/catalogs/signup/%s/";
            } else {
                A0g = AnonymousClass001.A0g("commerce/user/", AbstractC31173DnH.A0t(interfaceC09390do), "/available_catalogs/%s/");
                C14360o3.A07(A0g);
            }
            this.A04 = new C41148IJn(requireContext2, A003, A0r2, id6, A0g);
            HEW hew = this.A02;
            if (hew == null) {
                str = "adapter";
            } else {
                String str2 = hew.A03.A01;
                this.A08 = str2;
                IMJ imj = this.A05;
                if (imj == null) {
                    str = "networkHelper";
                } else {
                    imj.A00(str2);
                    A01(this, EnumC153216up.A06);
                    C0f9.A09(-1046479665, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1281010148);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_source_selection_fragment, viewGroup, false);
        String str = "adapter";
        if (this.A0B) {
            Context context = inflate.getContext();
            String A0p = AbstractC166997dE.A0p(context, 2131964382);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, A0p, 2131964384));
            AnonymousClass773.A05(A0H, new C39403Han(context, this, AbstractC31174DnI.A02(context), 2), A0p);
            HEW hew = this.A02;
            if (hew != null) {
                String str2 = this.A0I;
                if (str2 == null || str2.length() == 0) {
                    str2 = AbstractC166997dE.A0N(this).getString(2131964385);
                }
                C14360o3.A0A(str2);
                hew.A00 = new IFF(str2, A0H);
                HEW.A00(hew);
                InterfaceC56392iX A0U = AbstractC31173DnH.A0U(inflate, R.id.in_app_signup_flow_stepper_header);
                this.A0F = A0U;
                if (A0U == null) {
                    str = "stepperHeader";
                } else {
                    ((IgdsStepperHeader) A0U.getView()).A02(this.A0E, this.A0D);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.bottom_buttons);
                    this.A01 = igdsBottomButtonLayout;
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
                    if (igdsBottomButtonLayout2 != null) {
                        igdsBottomButtonLayout2.setPrimaryAction(this.A0H, ViewOnClickListenerC38053Gog.A02(context, this, 15));
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
                    if (igdsBottomButtonLayout3 != null) {
                        igdsBottomButtonLayout3.setSecondaryAction(getString(2131970010), new ViewOnClickListenerC42033Ik2(this, 60));
                    }
                    if (getRootActivity() instanceof InterfaceC53712dA) {
                        ComponentCallbacks2 rootActivity = getRootActivity();
                        C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
                        ((InterfaceC53712dA) rootActivity).EfL(8);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        HEW hew2 = this.A02;
        if (hew2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                String A0p2 = AbstractC166997dE.A0p(context2, 2131970013);
                SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context2, A0p2, 2131970014));
                AnonymousClass773.A05(A0H2, new C39403Han(context2, this, context2.getColor(R.color.text_view_link_color), 1), A0p2);
                hew2.A01 = A0H2;
                HEW.A00(hew2);
                EmptyStateView emptyStateView = (EmptyStateView) inflate.requireViewById(android.R.id.empty);
                this.A0G = emptyStateView;
                if (emptyStateView != null) {
                    EnumC153216up enumC153216up = EnumC153216up.A04;
                    emptyStateView.A0R(enumC153216up, R.drawable.loadmore_icon_refresh_compound);
                    emptyStateView.A0N(new ViewOnClickListenerC42033Ik2(this, 61), enumC153216up);
                }
                C0f9.A09(-566728739, A02);
                return inflate;
            }
            throw AbstractC166997dE.A0g();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2066034494);
        super.onDestroyView();
        this.A01 = null;
        if (this.A0B && (getRootActivity() instanceof InterfaceC53712dA)) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        C0f9.A09(-1875337963, A02);
    }
}
