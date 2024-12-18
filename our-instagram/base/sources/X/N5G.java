package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;

/* loaded from: classes9.dex */
public final class N5G extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProductEligibilityStatusFragment";
    public UserMonetizationProductType A00;
    public boolean A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05 = C1XM.A00(C57383Pdh.A00);
    public final InterfaceC09390do A02 = C57526Pg0.A00(this, 30);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            C14360o3.A0F("productType");
            throw C00O.createAndThrow();
        }
        switch (userMonetizationProductType.ordinal()) {
            case 1:
                i = 2131966876;
                break;
            case 3:
                i = 2131954217;
                break;
            case 9:
                i = 2131966879;
                break;
            case 10:
                i = 2131966883;
                break;
            case 11:
                i = 2131964490;
                break;
            case Process.SIGTERM /* 15 */:
                i = 2131966877;
                break;
            default:
                throw AbstractC166987dD.A12("monetization type is not supported");
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.product_tool_eligibility_status_recycler_view);
        AbstractC31174DnI.A15(A0G.getContext(), A0G);
        AbstractC37304Gc5.A10(A0G, this.A02);
        C51016MgO c51016MgO = (C51016MgO) this.A03.getValue();
        c51016MgO.A01();
        if (c51016MgO.A01 == null) {
            AbstractC454427e.A00(c51016MgO.A06).A01(c51016MgO.A04, C57745PjY.A00(c51016MgO, 32));
        } else {
            C51016MgO.A00(c51016MgO);
        }
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), c51016MgO.A03, C57745PjY.A00(this, 31), 58);
        AbstractC166987dD.A1Z(new PZP(view, c51016MgO, this, null, 33), AbstractC25235BEs.A0S(this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public N5G() {
        C57526Pg0 c57526Pg0 = new C57526Pg0(this, 31);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57526Pg0(new C57526Pg0(this, 32), 33));
        this.A03 = AbstractC25225BEi.A0a(new C57526Pg0(A00, 34), c57526Pg0, C57531Pg5.A00(null, A00, 6), AbstractC25225BEi.A1D(C51016MgO.class));
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        int A02 = C0f9.A02(-43103896);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null && (string = bundle2.getString("ARGUMENT_PRODUCT_TYPE")) != null) {
            this.A00 = AbstractC104314mu.A00(string);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                z = bundle3.getBoolean("ARGUMENT_TEMPORARY_INELIGIBILITY_STATUS");
            } else {
                z = false;
            }
            this.A01 = z;
            InterfaceC09390do interfaceC09390do = this.A03;
            C51016MgO c51016MgO = (C51016MgO) interfaceC09390do.getValue();
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                str = bundle4.getString("ARGUMENT_ELIGIBILITY");
            }
            c51016MgO.A01 = str;
            ((C51016MgO) interfaceC09390do.getValue()).A02 = this.A01;
            C0f9.A09(479855933, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(908033960, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2141131933);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_tool_eligibility_status, viewGroup, false);
        C64P c64p = (C64P) inflate.requireViewById(R.id.bottom_button_layout);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            C14360o3.A0F("productType");
            throw C00O.createAndThrow();
        }
        if (userMonetizationProductType == UserMonetizationProductType.A06) {
            String str = ((C51016MgO) this.A03.getValue()).A01;
            if (C14360o3.A0K(str, "not_eligible")) {
                LL0.A01(this, AbstractC166987dD.A0r(this.A04), C05F.A00);
            } else if (C14360o3.A0K(str, "eligible_pending_opt_in")) {
                c64p.setVisibility(0);
                c64p.setPrimaryAction(getString(2131954181), new ViewOnClickListenerC55465OkK(69, this, this));
            }
        }
        C0f9.A09(1015726900, A02);
        return inflate;
    }
}
