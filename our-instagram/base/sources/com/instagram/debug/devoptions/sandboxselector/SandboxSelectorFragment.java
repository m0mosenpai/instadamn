package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09440dt;
import X.AbstractC18560vj;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC33235ElU;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.C0YZ;
import X.C0f9;
import X.C0fJ;
import X.C14360o3;
import X.C15340po;
import X.C17280tP;
import X.C2d6;
import X.C55772hI;
import X.C60842q8;
import X.C69487VoA;
import X.C69797Vvh;
import X.EPV;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MTJ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.sandbox.SandboxUtil;

/* loaded from: classes11.dex */
public final class SandboxSelectorFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public MTJ navigationPerfLogger;
    public final InterfaceC09390do viewModel$delegate;
    public final C17280tP devPreferences = C17280tP.A4E.A00();
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958343);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "sandbox_selector";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EPV epv = new EPV(requireContext(), getSession(), this);
        getScrollingViewProxy().EPJ(epv);
        SandboxSelectorViewModel viewModel = getViewModel();
        viewModel.viewState.A06(getViewLifecycleOwner(), new SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0(new SandboxSelectorFragment$onViewCreated$1$1(epv, this)));
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new SandboxSelectorFragment$onViewCreated$1$2(this, null), viewModel.toasts));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SandboxSelectorViewModel getViewModel() {
        return (SandboxSelectorViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    public SandboxSelectorFragment() {
        SandboxSelectorFragment$viewModel$2 sandboxSelectorFragment$viewModel$2 = new SandboxSelectorFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new SandboxSelectorFragment$special$$inlined$viewModels$default$2(new SandboxSelectorFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = new C60842q8(new SandboxSelectorFragment$special$$inlined$viewModels$default$3(A00), sandboxSelectorFragment$viewModel$2, new SandboxSelectorFragment$special$$inlined$viewModels$default$4(null, A00), new C0YZ(SandboxSelectorViewModel.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorDialog(String str, String str2) {
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(str);
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69487VoA.A0C = str2;
        c69797Vvh.A04(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$showErrorDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, 2131968948);
        c69487VoA.A05 = new DialogInterface.OnDismissListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$showErrorDialog$2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SandboxSelectorViewModel viewModel;
                viewModel = SandboxSelectorFragment.this.getViewModel();
                viewModel.onErrorDialogDismissed();
            }
        };
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showManualEntryDialog() {
        Dialog sandboxDialog = SandboxUtil.getSandboxDialog(requireContext(), getSession(), null, null);
        sandboxDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$showManualEntryDialog$1$1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SandboxSelectorViewModel viewModel;
                viewModel = SandboxSelectorFragment.this.getViewModel();
                viewModel.onManualEntryDialogDismissed();
            }
        });
        C0fJ.A00(sandboxDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOverlayIndicator() {
        C2d6 c2d6;
        Object context = getContext();
        if ((context instanceof C2d6) && (c2d6 = (C2d6) context) != null) {
            c2d6.DA3(this.devPreferences);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2088573534);
        super.onCreate(bundle);
        MTJ mtj = new MTJ(getSession(), "sandbox", 31799736);
        this.navigationPerfLogger = mtj;
        mtj.A0Q(requireContext(), C55772hI.A00(getSession()), this);
        C0f9.A09(1281457185, A02);
    }
}
