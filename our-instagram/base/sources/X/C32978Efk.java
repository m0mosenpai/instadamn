package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Efk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32978Efk extends C32547EUx implements InterfaceC60602pj {
    public final AbstractC59962oe A00;
    public final C6WQ A01;

    public C32978Efk(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, String str) {
        super(abstractC59962oe.requireActivity(), null, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, C05F.A0C, str);
        this.A00 = abstractC59962oe;
        C6WQ c6wq = new C6WQ(abstractC59962oe.requireContext(), true);
        this.A01 = c6wq;
        c6wq.A00(abstractC59962oe.getString(2131965724));
        abstractC59962oe.registerLifecycleListener(this);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
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
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
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

    private final boolean A01() {
        FragmentActivity activity;
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.mView != null && (activity = abstractC59962oe.getActivity()) != null && abstractC59962oe.isAdded() && !abstractC59962oe.mRemoving && !abstractC59962oe.mDetached && !activity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A00.unregisterLifecycleListener(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A01.dismiss();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C0fJ.A00(this.A01);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1234794583);
        if (A01()) {
            this.A01.dismiss();
        }
        this.A00.unregisterLifecycleListener(this);
        super.onFinish();
        C0f9.A0A(-1511192229, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1260388047);
        if (A01()) {
            C0fJ.A00(this.A01);
        }
        super.onStart();
        C0f9.A0A(1059200533, A03);
    }
}
