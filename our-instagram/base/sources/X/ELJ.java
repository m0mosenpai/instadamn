package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes6.dex */
public final class ELJ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public static final String __redex_internal_original_name = "WhatsAppLinkingFragment";
    public InterfaceC37222GaX A00;
    public TextView A01;
    public TextView A02;
    public EVM A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "whats_app_linking_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A00 = AbstractC35211Fg4.A01(this);
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A05;
        if (AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A1a()) {
            InterfaceC37222GaX interfaceC37222GaX = this.A00;
            if (interfaceC37222GaX != null) {
                AbstractC31174DnI.A1S(interfaceC37222GaX);
                return;
            }
            return;
        }
        interfaceC09390do.getValue();
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(46), AbstractC31180DnO.A0p(__redex_internal_original_name, "whatsapp_linking_in_business_conversion_flow"));
        IgBloksScreenConfig A0O = AbstractC31177DnL.A0O(interfaceC09390do);
        AbstractC31171DnF.A17(this, A0O, 2131977078);
        C72743Nv A02 = W6d.A02(A0O, A01);
        C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
        A0j.A0A = __redex_internal_original_name;
        A0j.A0F = true;
        A0j.A0D(A02);
        A0j.A04();
        this.A04 = true;
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        InterfaceC37222GaX interfaceC37222GaX = this.A00;
        if (interfaceC37222GaX != null) {
            ((BusinessConversionActivity) interfaceC37222GaX).A0p(null, true);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC37222GaX interfaceC37222GaX = this.A00;
        if (interfaceC37222GaX != null) {
            AbstractC31179DnN.A1T(interfaceC37222GaX);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 49);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(920232911);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whats_app_linking_fragment, viewGroup, false);
        this.A02 = AbstractC166987dD.A0e(inflate, R.id.title);
        this.A01 = AbstractC166987dD.A0e(inflate, R.id.subtitle);
        EVM evm = new EVM((BusinessNavBar) inflate.findViewById(R.id.navigation_bar), this, 2131968535, 2131968688);
        this.A03 = evm;
        registerLifecycleListener(evm);
        C0f9.A09(502942580, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(793008175);
        EVM evm = this.A03;
        if (evm == null) {
            C14360o3.A0F("navBarHelper");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(evm);
        super.onDestroyView();
        C0f9.A09(-36214982, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        TextView textView;
        int i;
        String str2;
        int A02 = C0f9.A02(-1898471514);
        super.onResume();
        if (this.A04 && AbstractC31176DnK.A0g(C17060sy.A01, this.A05).A1a()) {
            AbstractC167007dF.A0J().post(new RunnableC36822GKv(this));
            this.A04 = false;
        } else {
            boolean A1a = AbstractC31176DnK.A0g(C17060sy.A01, this.A05).A1a();
            EVM evm = this.A03;
            if (A1a) {
                if (evm != null) {
                    evm.A02(false);
                    EVM evm2 = this.A03;
                    if (evm2 != null) {
                        BusinessNavBar businessNavBar = evm2.A00;
                        if (businessNavBar != null) {
                            businessNavBar.setPrimaryButtonText(2131968535);
                        } else {
                            IgdsBottomButtonLayout igdsBottomButtonLayout = evm2.A02;
                            if (igdsBottomButtonLayout != null) {
                                Resources resources = igdsBottomButtonLayout.getResources();
                                if (resources != null) {
                                    str2 = resources.getString(2131968535);
                                } else {
                                    str2 = null;
                                }
                                igdsBottomButtonLayout.setPrimaryActionText(str2);
                            }
                        }
                        TextView textView2 = this.A02;
                        if (textView2 != null) {
                            textView2.setText(2131977070);
                        }
                        textView = this.A01;
                        if (textView != null) {
                            i = 2131977069;
                            textView.setText(i);
                        }
                    }
                }
                C14360o3.A0F("navBarHelper");
                throw C00O.createAndThrow();
            }
            if (evm != null) {
                evm.A02(true);
                EVM evm3 = this.A03;
                if (evm3 != null) {
                    BusinessNavBar businessNavBar2 = evm3.A00;
                    if (businessNavBar2 != null) {
                        businessNavBar2.setPrimaryButtonText(2131956628);
                    } else {
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = evm3.A02;
                        if (igdsBottomButtonLayout2 != null) {
                            Resources resources2 = igdsBottomButtonLayout2.getResources();
                            if (resources2 != null) {
                                str = resources2.getString(2131956628);
                            } else {
                                str = null;
                            }
                            igdsBottomButtonLayout2.setPrimaryActionText(str);
                        }
                    }
                    TextView textView3 = this.A02;
                    if (textView3 != null) {
                        textView3.setText(2131956630);
                    }
                    textView = this.A01;
                    if (textView != null) {
                        i = 2131956629;
                        textView.setText(i);
                    }
                }
            }
            C14360o3.A0F("navBarHelper");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-277709916, A02);
    }
}
