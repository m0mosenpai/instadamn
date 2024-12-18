package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.81I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81I implements InterfaceC60602pj {
    public final C60462pV A00 = new C60462pV();

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A0C(view);
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        this.A00.A09(configuration);
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        this.A00.A0A(bundle);
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A00.A0D(view, bundle);
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A00.A08(i, i2, intent);
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A00.A01();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A00.A02();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00.A03();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A00.A04();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A00.A05();
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        this.A00.A06();
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        this.A00.A07();
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
        this.A00.A0B(bundle);
    }
}
