package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.TFm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64476TFm implements InterfaceC60602pj {
    public final /* synthetic */ C62239S3k A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;

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

    public C64476TFm(C62239S3k c62239S3k, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        this.A00 = c62239S3k;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (r7 != null) goto L18;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 42625(0xa681, float:5.973E-41)
            if (r5 != r0) goto L22
            r3 = 0
            r2 = -1
            if (r6 != r2) goto L23
            if (r7 == 0) goto L11
            java.lang.String r0 = "extra_result_code"
            java.lang.String r3 = r7.getStringExtra(r0)
        L11:
            X.4lE r2 = r4.A03
            if (r3 == 0) goto L22
            X.6FX r0 = X.AbstractC31179DnN.A0I(r3)
        L19:
            X.6FW r1 = r0.A00()
            X.6FQ r0 = r4.A01
            X.C131845xK.A00(r0, r1, r2)
        L22:
            return
        L23:
            if (r7 == 0) goto L2d
            java.lang.String r0 = "extra_result_error_code"
            java.lang.String r1 = r7.getStringExtra(r0)
            if (r1 != 0) goto L33
        L2d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r7 == 0) goto L39
        L33:
            java.lang.String r0 = "extra_result_error_message"
            java.lang.String r3 = r7.getStringExtra(r0)
        L39:
            X.4lE r2 = r4.A02
            if (r3 == 0) goto L22
            X.6FX r0 = X.AbstractC31179DnN.A0I(r1)
            r0.A02(r3)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64476TFm.onActivityResult(int, int, android.content.Intent):void");
    }
}
