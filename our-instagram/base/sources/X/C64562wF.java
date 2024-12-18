package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.2wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64562wF implements InterfaceC12870lZ, InterfaceC60602pj {
    public boolean A00;
    public final C006802i A01;
    public final InterfaceC64542wD A02;
    public final String A03;

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

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (this.A00) {
            this.A00 = false;
            this.A01.markerEnd(499003080, (short) 4);
        }
    }

    public C64562wF(C006802i c006802i, InterfaceC64542wD interfaceC64542wD, String str) {
        this.A03 = str;
        this.A01 = c006802i;
        this.A02 = interfaceC64542wD;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1066829884);
        if (this.A00) {
            this.A00 = false;
            this.A01.markerEnd(499003080, (short) 4);
        }
        C0f9.A0A(-1379571811, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1625328647, C0f9.A03(969511238));
    }
}
