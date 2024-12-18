package com.instagram.debug.devoptions.avatars;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C006802i;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0eR;
import X.C0f9;
import X.C14360o3;
import X.C50526MSf;
import X.C55555Olp;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerDebugFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public static final Companion Companion = new Object();
    public static final String QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY = "entry_point";
    public static final String QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE = "ig_settings";
    public final InterfaceC09390do qplLogger$delegate = AbstractC09440dt.A01(new ImmersiveAvatarViewerDebugFragment$qplLogger$2(this));
    public C55555Olp richAvatarViewHandler;
    public final InterfaceC09390do session$delegate;
    public final InterfaceC09390do viewModel$delegate;

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131957831);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "immersive_avatar_viewer_debug";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C006802i getQplLogger() {
        return (C006802i) this.qplLogger$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImmersiveAvatarViewerEffectConfigViewModel getViewModel() {
        return (ImmersiveAvatarViewerEffectConfigViewModel) this.viewModel$delegate.getValue();
    }

    private final void observeEffectConfigChanges() {
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, c07s, null, this), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public ImmersiveAvatarViewerDebugFragment() {
        ImmersiveAvatarViewerDebugFragment$viewModel$2 immersiveAvatarViewerDebugFragment$viewModel$2 = new ImmersiveAvatarViewerDebugFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$2(new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$3(A00), immersiveAvatarViewerDebugFragment$viewModel$2, new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(ImmersiveAvatarViewerEffectConfigViewModel.class));
        this.session$delegate = AbstractC60492pY.A02(this);
    }

    private final void observeAvatarViewStateChanges() {
        AbstractC166987dD.A1Z(new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this, null), AbstractC25229BEm.A0a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1010781734);
        super.onCreate(bundle);
        getQplLogger().markerStart(116928509);
        getQplLogger().markerAnnotate(116928509, QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        C0f9.A09(288552095, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-139409442);
        this.richAvatarViewHandler = new C55555Olp(null, AbstractC166987dD.A0r(this.session$delegate));
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C0eR c0eR = this.mLifecycleRegistry;
        C55555Olp c55555Olp = this.richAvatarViewHandler;
        if (c55555Olp != null) {
            c0eR.A09(c55555Olp);
            C55555Olp c55555Olp2 = this.richAvatarViewHandler;
            if (c55555Olp2 != null) {
                c55555Olp2.A00(requireContext(), frameLayout, new C50526MSf(3, 0, false), "", AbstractC25235BEs.A0S(this));
                observeEffectConfigChanges();
                observeAvatarViewStateChanges();
                C0f9.A09(639032289, A02);
                return frameLayout;
            }
        }
        C14360o3.A0F("richAvatarViewHandler");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(769755710);
        super.onDestroyView();
        C0eR c0eR = this.mLifecycleRegistry;
        C55555Olp c55555Olp = this.richAvatarViewHandler;
        if (c55555Olp == null) {
            C14360o3.A0F("richAvatarViewHandler");
            throw C00O.createAndThrow();
        }
        c0eR.A0A(c55555Olp);
        C0f9.A09(-1522443780, A02);
    }

    /* loaded from: classes8.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
