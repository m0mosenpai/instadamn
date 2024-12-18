package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import java.util.List;

/* renamed from: X.Oyh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56272Oyh implements InterfaceC58282Psa {
    public AbstractC10360h2 A00;
    public final AbstractC59962oe A01;
    public final P01 A02;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AQM(float f) {
    }

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(A0L);
        MSZ.A13(fragmentContainerView);
        fragmentContainerView.setId(View.generateViewId());
        AbstractC10360h2 supportFragmentManager = ((FragmentActivity) AbstractC13320mI.A01(A0L, FragmentActivity.class)).getSupportFragmentManager();
        this.A00 = supportFragmentManager;
        if (supportFragmentManager != null) {
            C14240no c14240no = new C14240no(supportFragmentManager);
            c14240no.A09(this.A01, fragmentContainerView.getId());
            c14240no.A00();
        }
        viewGroup.addView(fragmentContainerView);
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRk() {
        return true;
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRl() {
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void DHV(float f, float f2) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AJN() {
        this.A02.AJN();
    }

    @Override // X.InterfaceC58282Psa
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53228NgQ.A03);
    }

    @Override // X.InterfaceC58282Psa
    public final void D01() {
        this.A02.A01.invoke();
    }

    @Override // X.InterfaceC58282Psa
    public final void cancel() {
        this.A02.cancel();
    }

    public C56272Oyh(AbstractC59962oe abstractC59962oe, P01 p01) {
        this.A01 = abstractC59962oe;
        this.A02 = p01;
    }
}
