package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.Wfv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70729Wfv implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C70729Wfv(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        if (this.A00 != 0) {
            ((C62832tM) this.A01).A07(this.A03);
            C6BQ.A0L((C6FQ) this.A02, this);
        } else {
            ((C6T7) this.A01).A03();
            WjT wjT = (WjT) this.A02;
            wjT.A00.remove(this.A03);
            ((C62862tP) wjT.A01.getValue()).A06(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        if (this.A00 == 0) {
            ((C6T7) this.A01).A04();
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }
}
