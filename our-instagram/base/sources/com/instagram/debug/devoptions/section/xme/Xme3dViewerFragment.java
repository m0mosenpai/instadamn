package com.instagram.debug.devoptions.section.xme;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.C14360o3;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* loaded from: classes5.dex */
public final class Xme3dViewerFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public IgGltfSceneLayoutView scene;
    public final InterfaceC09390do viewModel$delegate;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "Xme3dViewerFragment";

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("XME 3D Viewer");
        interfaceC56362iU.EkS(true);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC166987dD.A1Z(new Xme3dViewerFragment$onViewCreated$1(this, null), AbstractC25229BEm.A0a(this));
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(true);
        }
        getViewModel().maybeFetchSampleFile(requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Xme3dViewModel getViewModel() {
        return (Xme3dViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public Xme3dViewerFragment() {
        Xme3dViewerFragment$viewModel$2 xme3dViewerFragment$viewModel$2 = new Xme3dViewerFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new Xme3dViewerFragment$special$$inlined$viewModels$default$2(new Xme3dViewerFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new Xme3dViewerFragment$special$$inlined$viewModels$default$3(A00), xme3dViewerFragment$viewModel$2, new Xme3dViewerFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(Xme3dViewModel.class));
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1481843041);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        IgGltfSceneLayoutView igGltfSceneLayoutView = new IgGltfSceneLayoutView(requireContext());
        this.scene = igGltfSceneLayoutView;
        C0f9.A09(-39843744, A02);
        return igGltfSceneLayoutView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(-1279282563);
        super.onDestroyView();
        this.scene = null;
        C0f9.A09(-618497263, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(-901921255);
        super.onPause();
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(false);
        }
        C0f9.A09(1274930081, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1026484148);
        super.onResume();
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(true);
        }
        C0f9.A09(2082783137, A02);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
