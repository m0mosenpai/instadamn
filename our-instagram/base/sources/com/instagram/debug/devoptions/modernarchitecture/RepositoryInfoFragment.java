package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25319BIo;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragment extends AbstractC59962oe {
    public static final int $stable = 8;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final InterfaceC09390do viewModel$delegate;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "repository_info";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RepositoryInfoViewModel getViewModel() {
        return (RepositoryInfoViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public RepositoryInfoFragment() {
        RepositoryInfoFragment$viewModel$2 repositoryInfoFragment$viewModel$2 = new RepositoryInfoFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new RepositoryInfoFragment$special$$inlined$viewModels$default$2(new RepositoryInfoFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new RepositoryInfoFragment$special$$inlined$viewModels$default$3(A00), repositoryInfoFragment$viewModel$2, new RepositoryInfoFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(RepositoryInfoViewModel.class));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1550472876);
        ComposeView A00 = AbstractC25319BIo.A00(this, new RepositoryInfoFragment$onCreateView$1(this), -1271490811);
        C0f9.A09(-901738958, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
