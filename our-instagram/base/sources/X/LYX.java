package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LYX implements InterfaceC60602pj {
    public final long A00;
    public final InterfaceC09390do A02;
    public final C41761wQ A03 = AbstractC31174DnI.A0S();
    public final C42201xA A01 = AbstractC42021ws.A00();

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
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
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        JQn.A00(((C137766Ly) this.A02.getValue()).A0B.A0L(new C43597JQd(Long.valueOf(this.A00), 45)), this.A03, this, 53);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A03.A02(C43597JQd.A01(this.A01, C50367MLu.A01(this, 15), 52), C49761LyU.A00);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A03.A02(C43597JQd.A01(this.A01, C50367MLu.A01(this, 16), 52), C49762LyV.A00);
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        this.A03.A01();
    }

    public LYX(UserSession userSession, long j) {
        this.A00 = j;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, MHJ.A00(userSession, 4));
    }
}
