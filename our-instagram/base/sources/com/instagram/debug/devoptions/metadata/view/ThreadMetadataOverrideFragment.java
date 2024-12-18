package com.instagram.debug.devoptions.metadata.view;

import X.AbstractC03240Dh;
import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC2054897w;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC31175DnJ;
import X.AbstractC43842Ja5;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.C14360o3;
import X.C193328hC;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC83713oG;
import X.L5L;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideFragment extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC60122ou, ThreadMetadataOverrideViewHolder.Delegate {
    public static final String BUNDLE_THREAD_ID = "thread_id";
    public static final Companion Companion = new Object();
    public final InterfaceC09390do session$delegate;
    public final InterfaceC09390do viewModel$delegate;

    public static final Bundle createArgs(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        return Companion.createArgs(userSession, interfaceC83713oG);
    }

    public static final AbstractC59962oe newInstance(Bundle bundle) {
        return Companion.newInstance(bundle);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkT(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment$configureActionBar$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-583693069);
                ThreadMetadataOverrideFragment.this.showConfirmationDialog();
                C0f9.A0C(2050979028, A05);
            }
        }, true);
        interfaceC56362iU.setTitle("Thread Metadata Overrider");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "direct_thread_metadata_override_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getViewModel().viewState.A06(getViewLifecycleOwner(), new ThreadMetadataOverrideFragment$sam$androidx_lifecycle_Observer$0(new ThreadMetadataOverrideFragment$onViewCreated$1(this)));
        getViewModel().fetch();
    }

    /* loaded from: classes6.dex */
    public final class Companion {
        public final AbstractC59962oe newInstance(Bundle bundle) {
            C14360o3.A0B(bundle, 0);
            ThreadMetadataOverrideFragment threadMetadataOverrideFragment = new ThreadMetadataOverrideFragment();
            threadMetadataOverrideFragment.setArguments(bundle);
            return threadMetadataOverrideFragment;
        }

        public final Bundle createArgs(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
            AbstractC167017dG.A1N(userSession, interfaceC83713oG);
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC2054897w.A02(A0b, interfaceC83713oG, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            AbstractC03240Dh.A00(A0b, userSession);
            return A0b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadMetadataOverrideViewModel getViewModel() {
        return (ThreadMetadataOverrideViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC43842Ja5
    public Collection getDefinitions() {
        return AbstractC166987dD.A1J(new ThreadMetadataOverrideItemDefinition(this));
    }

    @Override // X.AbstractC43842Ja5
    public L5L getRecyclerConfigBuilder() {
        return configBuilder(ThreadMetadataOverrideFragment$getRecyclerConfigBuilder$1.INSTANCE);
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public ThreadMetadataOverrideFragment() {
        ThreadMetadataOverrideFragment$viewModel$2 threadMetadataOverrideFragment$viewModel$2 = new ThreadMetadataOverrideFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$2(new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$3(A00), threadMetadataOverrideFragment$viewModel$2, new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(ThreadMetadataOverrideViewModel.class));
        this.session$delegate = AbstractC60492pY.A02(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmationDialog() {
        C193328hC A0O = AbstractC31175DnJ.A0O(this);
        A0O.A05 = "Override Metadata";
        A0O.A0d(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment$showConfirmationDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadMetadataOverrideViewModel viewModel;
                viewModel = ThreadMetadataOverrideFragment.this.getViewModel();
                viewModel.save();
                AbstractC25231BEo.A16(ThreadMetadataOverrideFragment.this);
            }
        }, "Save");
        A0O.A0b(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment$showConfirmationDialog$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ThreadMetadataOverrideViewModel viewModel;
                viewModel = ThreadMetadataOverrideFragment.this.getViewModel();
                viewModel.reset();
                AbstractC25231BEo.A16(ThreadMetadataOverrideFragment.this);
            }
        }, "Reset");
        AbstractC166987dD.A1W(A0O);
    }

    @Override // X.InterfaceC60072op
    public boolean onBackPressed() {
        showConfirmationDialog();
        return true;
    }

    @Override // com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder.Delegate
    public void onMetadataOverrideValueChanged() {
        getViewModel().update();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
