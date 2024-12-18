package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.AdF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23620AdF implements InterfaceC60602pj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C189478aR A02;

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
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C23620AdF(C189478aR c189478aR, int i, int i2) {
        this.A02 = c189478aR;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        C189478aR c189478aR = this.A02;
        c189478aR.A03.unregisterLifecycleListener(this);
        c189478aR.A0C(this.A00, this.A01);
    }
}
