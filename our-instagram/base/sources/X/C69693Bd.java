package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69693Bd implements InterfaceC12870lZ, InterfaceC60602pj {
    public final InterfaceC09390do A00;

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
    public final /* synthetic */ void onDestroy() {
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
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        ((C70013Cl) value).A03("MainFeedFragment.onCreate");
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        ((C70013Cl) value).A03("MainFeedFragment.onPause");
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        ((C70013Cl) value).A03("MainFeedFragment.onResume");
    }

    public C69693Bd(UserSession userSession) {
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E5(userSession, 5));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1708049740);
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        ((C70013Cl) value).A03("MainFeedFragment.onAppBackgrounded");
        C0f9.A0A(12946900, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1494567215);
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        ((C70013Cl) value).A03("MainFeedFragment.onAppForegrounded");
        C0f9.A0A(-934438236, A03);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C218914p.A06(this);
    }
}
