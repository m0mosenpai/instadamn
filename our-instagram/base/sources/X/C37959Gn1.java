package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.Gn1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37959Gn1 implements InterfaceC60602pj {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C37958Gn0 A01;

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

    public C37959Gn1(C62862tP c62862tP, C37958Gn0 c37958Gn0) {
        this.A01 = c37958Gn0;
        this.A00 = c62862tP;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        C37958Gn0 c37958Gn0 = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c37958Gn0.A00 = null;
        this.A00.A06(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C37958Gn0 c37958Gn0 = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C6T7 c6t7 = c37958Gn0.A00;
        if (c6t7 != null) {
            c6t7.A04();
        }
    }
}
