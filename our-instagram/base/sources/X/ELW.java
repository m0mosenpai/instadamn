package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ELW extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37191Ga2, InterfaceC60122ou, InterfaceC37190Ga1 {
    public static final String __redex_internal_original_name = "RenewProfessionalAccountFragment";
    public BusinessFlowAnalyticsLogger A00;
    public InterfaceC37222GaX A01;
    public SpinnerImageView A02;
    public String A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public EVM A0B;
    public IgdsBottomButtonLayout A0C;
    public final Handler A0D = AbstractC167007dF.A0J();
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfz() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "renew_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        InterfaceC37222GaX A01 = AbstractC35211Fg4.A01(this);
        if (A01 != null) {
            this.A01 = A01;
            return;
        }
        throw AbstractC166987dD.A14("controller must not be null");
    }

    public static final void A00(ELW elw) {
        InterfaceC37222GaX interfaceC37222GaX = elw.A01;
        if (interfaceC37222GaX != null) {
            interfaceC37222GaX.EUd(EnumC151596s5.A08);
            InterfaceC37222GaX interfaceC37222GaX2 = elw.A01;
            if (interfaceC37222GaX2 != null) {
                ((BusinessConversionActivity) interfaceC37222GaX2).A0p(null, false);
                return;
            }
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    private final void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        businessFlowAnalyticsLogger.Cm3(new Y7A("renew", this.A03, str, null, null, A02(), null, null));
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        A01("continue");
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        if (interfaceC37222GaX == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        ((BusinessConversionActivity) interfaceC37222GaX).A0o(requireContext(), this, this, EnumC222416a.A05, "renew", false);
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfs(String str, String str2, String str3) {
        String str4;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str4 = "logger";
        } else {
            businessFlowAnalyticsLogger.Clv(new Y7A("renew", this.A03, "switch_to_professional", str2, str3, null, null, null));
            EVM evm = this.A0B;
            if (evm == null) {
                str4 = "navBarHelper";
            } else {
                evm.A00();
                C9GR.A09(requireContext(), str);
                return;
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgF() {
        EVM evm = this.A0B;
        if (evm == null) {
            C14360o3.A0F("navBarHelper");
            throw C00O.createAndThrow();
        }
        evm.A01();
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgQ(EnumC222416a enumC222416a) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        businessFlowAnalyticsLogger.Clu(new Y7A("renew", this.A03, "switch_to_professional", null, null, null, null, null));
        AbstractC34025F0e.A00(new C32548EUy(this, 20), AbstractC166987dD.A0o(this.A0E), this, false);
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        A01("skip");
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        if (interfaceC37222GaX != null) {
            interfaceC37222GaX.EUd(EnumC151596s5.A08);
            InterfaceC37222GaX interfaceC37222GaX2 = this.A01;
            if (interfaceC37222GaX2 != null) {
                ((BusinessConversionActivity) interfaceC37222GaX2).A0p(null, true);
                return;
            }
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.Cid(new Y7A("renew", this.A03, null, null, null, A02(), null, null));
            InterfaceC37222GaX interfaceC37222GaX = this.A01;
            if (interfaceC37222GaX == null) {
                str = "controller";
            } else {
                ((BusinessConversionActivity) interfaceC37222GaX).EL3(null);
                return true;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final HashMap A02() {
        String str;
        String str2;
        EnumC222416a enumC222416a;
        EnumC222416a enumC222416a2;
        HashMap A1G = AbstractC166987dD.A1G();
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        String str3 = null;
        if (interfaceC37222GaX != null) {
            BusinessInfo businessInfo = AbstractC31176DnK.A0K(interfaceC37222GaX).A02;
            if (businessInfo != null) {
                str = businessInfo.A09;
            } else {
                str = null;
            }
            A1G.put("category_id", str);
            InterfaceC37222GaX interfaceC37222GaX2 = this.A01;
            if (interfaceC37222GaX2 != null) {
                BusinessInfo businessInfo2 = AbstractC31176DnK.A0K(interfaceC37222GaX2).A02;
                if (businessInfo2 != null && (enumC222416a2 = businessInfo2.A02) != null) {
                    str2 = enumC222416a2.A01;
                } else {
                    str2 = null;
                }
                A1G.put("category_account_type", str2);
                InterfaceC37222GaX interfaceC37222GaX3 = this.A01;
                if (interfaceC37222GaX3 != null) {
                    BusinessInfo businessInfo3 = AbstractC31176DnK.A0K(interfaceC37222GaX3).A02;
                    if (businessInfo3 != null && (enumC222416a = businessInfo3.A03) != null) {
                        str3 = enumC222416a.A01;
                    }
                    A1G.put("previous_account_type", str3);
                    return A1G;
                }
            }
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        ViewOnClickListenerC35690FpP.A02(AbstractC31176DnK.A0I(), interfaceC56362iU, this, 37);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1214956724);
        super.onCreate(bundle);
        this.A03 = AbstractC31180DnO.A0b(this);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0E);
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        if (interfaceC37222GaX != null) {
            EnumC151596s5 B77 = interfaceC37222GaX.B77();
            InterfaceC37222GaX interfaceC37222GaX2 = this.A01;
            if (interfaceC37222GaX2 != null) {
                BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(B77, this, A0o, (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX2).A0C));
                if (A00 != null) {
                    this.A00 = A00;
                    C0f9.A09(-1554861809, A02);
                    return;
                } else {
                    IllegalStateException A14 = AbstractC166987dD.A14("received null flowType or unexpected value for flowType");
                    C0f9.A09(-1802025524, A02);
                    throw A14;
                }
            }
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1818122296);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.renew_professional_account_fragment, viewGroup, false);
        this.A02 = (SpinnerImageView) inflate.requireViewById(R.id.loading_indicator);
        this.A04 = inflate.requireViewById(R.id.renew_layout_container);
        this.A0A = AbstractC31180DnO.A06(inflate);
        this.A09 = AbstractC31176DnK.A0E(inflate);
        this.A06 = AbstractC31173DnH.A0F(inflate, R.id.category_row);
        this.A05 = AbstractC31173DnH.A0F(inflate, R.id.account_type_row);
        this.A08 = AbstractC166997dE.A0T(inflate, R.id.category_subtitle);
        this.A07 = AbstractC166997dE.A0T(inflate, R.id.account_type_subtitle);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.navigation_bar);
        this.A0C = A0j;
        String str = "navBar";
        if (A0j != null) {
            this.A0B = new EVM(this, A0j, 2131972347, 2131972348);
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0C;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setVisibility(8);
                EVM evm = this.A0B;
                if (evm == null) {
                    str = "navBarHelper";
                } else {
                    registerLifecycleListener(evm);
                    SpinnerImageView spinnerImageView = this.A02;
                    if (spinnerImageView == null) {
                        str = "loadingSpinner";
                    } else {
                        spinnerImageView.setVisibility(0);
                        Context requireContext = requireContext();
                        C08790ch A00 = AbstractC018607g.A00(this);
                        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0E);
                        C35923Fth c35923Fth = new C35923Fth(this);
                        C14360o3.A0B(A0o, 2);
                        C25621Ms A0c = AbstractC167017dG.A0c(A0o);
                        A0c.A0B("business/account/fetch_account_type_quick_conversion_settings/");
                        C32548EUy.A00(requireContext, A00, AbstractC31178DnM.A0J(A0c, C32174EBv.class, FX0.class), c35923Fth, 32);
                        C0f9.A09(1210128910, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1227860402);
        EVM evm = this.A0B;
        if (evm == null) {
            C14360o3.A0F("navBarHelper");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(evm);
        super.onDestroyView();
        C0f9.A09(-1352171080, A02);
    }
}
