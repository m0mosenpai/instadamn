package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.C03E;
import X.C06840Yb;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C69749Vuj;
import X.EPV;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.VSL;
import android.content.Context;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

/* loaded from: classes11.dex */
public final class SandboxSelectorFragment$onViewCreated$1$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ EPV $adapter;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final /* synthetic */ class AnonymousClass2 extends C06840Yb implements InterfaceC16820sZ {
        public AnonymousClass2(Object obj) {
            super(0, obj, SandboxSelectorViewModel.class, "onResetSandbox", "onResetSandbox()Lkotlinx/coroutines/Job;", 8);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            ((SandboxSelectorViewModel) this.receiver).onResetSandbox();
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return C0eB.A00;
        }
    }

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$1$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final /* synthetic */ class AnonymousClass3 extends C03E implements InterfaceC16820sZ {
        public AnonymousClass3(Object obj) {
            super(0, obj, SandboxSelectorViewModel.class, "onManualEntryClicked", "onManualEntryClicked()V", 0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            ((SandboxSelectorViewModel) this.receiver).onManualEntryClicked();
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$onViewCreated$1$1(EPV epv, SandboxSelectorFragment sandboxSelectorFragment) {
        super(1);
        this.$adapter = epv;
        this.this$0 = sandboxSelectorFragment;
    }

    public final void invoke(SandboxSelectorViewModel.ViewState viewState) {
        SandboxSelectorViewModel viewModel;
        SandboxSelectorViewModel viewModel2;
        SandboxSelectorViewModel viewModel3;
        EPV epv = this.$adapter;
        C14360o3.A0A(viewState);
        Context requireContext = this.this$0.requireContext();
        viewModel = this.this$0.getViewModel();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(viewModel);
        viewModel2 = this.this$0.getViewModel();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(viewModel2);
        viewModel3 = this.this$0.getViewModel();
        epv.setItems(SandboxViewStateConverterKt.toAdapterItems(viewState, requireContext, anonymousClass1, anonymousClass2, new AnonymousClass3(viewModel3)));
        if (viewState.isManualEntryDialogShowing) {
            this.this$0.showManualEntryDialog();
        }
        SandboxErrorInfo sandboxErrorInfo = viewState.errorInfo;
        if (sandboxErrorInfo != null) {
            SandboxSelectorFragment sandboxSelectorFragment = this.this$0;
            C69749Vuj c69749Vuj = sandboxErrorInfo.title;
            AbstractC167017dG.A1N(sandboxSelectorFragment, c69749Vuj);
            String A00 = VSL.A00(AbstractC31177DnL.A09(sandboxSelectorFragment), c69749Vuj);
            C69749Vuj c69749Vuj2 = sandboxErrorInfo.message;
            AbstractC167017dG.A1N(sandboxSelectorFragment, c69749Vuj2);
            sandboxSelectorFragment.showErrorDialog(A00, VSL.A00(AbstractC31177DnL.A09(sandboxSelectorFragment), c69749Vuj2));
        }
        this.this$0.updateOverlayIndicator();
    }

    /* renamed from: com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public final /* synthetic */ class AnonymousClass1 extends C03E implements InterfaceC16660sJ {
        public AnonymousClass1(Object obj) {
            super(1, obj, SandboxSelectorViewModel.class, "onSandboxSelected", "onSandboxSelected(Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;)V", 0);
        }

        public final void invoke(Sandbox sandbox) {
            C14360o3.A0B(sandbox, 0);
            ((SandboxSelectorViewModel) this.receiver).onSandboxSelected(sandbox);
        }

        @Override // X.InterfaceC16660sJ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Sandbox) obj);
            return C0eB.A00;
        }
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SandboxSelectorViewModel.ViewState) obj);
        return C0eB.A00;
    }
}
