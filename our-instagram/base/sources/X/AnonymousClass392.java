package X;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.392, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass392 implements InterfaceC60602pj {
    public C3FQ A00;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A00 = C3FN.A00((ViewGroup) view.findViewById(R.id.list));
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
    public final void onDestroyView() {
        this.A00 = null;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r7 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7 != false) goto L22;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r16 = this;
            r0 = r16
            X.3FQ r4 = r0.A00
            if (r4 == 0) goto L9a
            int r3 = r4.B6q()
            int r2 = r4.BM3()
            if (r3 > r2) goto L91
        L10:
            X.3kI r1 = X.C81203jp.A0B(r4, r3)
            X.3kI r0 = X.EnumC81483kI.A02
            if (r1 != r0) goto L94
            android.view.View r0 = r4.AnW(r3)
            r0.getClass()
            java.lang.Object r8 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder"
            X.C14360o3.A0C(r8, r0)
            X.3k7 r8 = (X.C81373k7) r8
            X.5LT r4 = r8.A08
            if (r4 == 0) goto L91
            X.1qM r6 = r4.A02
            X.3Zb r5 = r4.A04
            boolean r7 = r8.A01(r6, r5)
            boolean r0 = X.AbstractC75103Za.A0J(r6)
            r3 = 1
            r15 = 0
            if (r0 != 0) goto L69
            X.5LS r1 = r4.A00
            X.0sJ r0 = r1.A03
            android.content.Context r2 = r8.A0G
            java.lang.Object r11 = r0.invoke(r2)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.5LU r9 = r4.A01
            X.0sF r1 = r1.A07
            X.2pS r0 = r8.A0W
            java.lang.Object r12 = r1.invoke(r2, r0)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            X.3cT r0 = r8.A0R
            java.util.List r13 = r0.Bre(r6, r5)
            X.3Zb r10 = r8.A09
            boolean r0 = r4.A0A
            if (r0 != 0) goto L65
            r14 = 0
            if (r7 == 0) goto L66
        L65:
            r14 = 1
        L66:
            r8.A00(r9, r10, r11, r12, r13, r14, r15)
        L69:
            boolean r1 = r5.A28
            boolean r0 = r4.A0A
            if (r0 != 0) goto L72
            r0 = 0
            if (r7 == 0) goto L73
        L72:
            r0 = 1
        L73:
            X.AbstractC115685Le.A01(r8, r1, r15, r0)
            X.3Zb r4 = r8.A09
            if (r4 == 0) goto L91
            long r0 = r8.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.instagram.common.session.UserSession r1 = r8.A0N
            boolean r0 = r8.A0B
            if (r0 != 0) goto L92
            boolean r0 = r8.A0A
            if (r0 == 0) goto L92
            boolean r0 = r8.A0C
            if (r0 == 0) goto L92
        L8e:
            X.AbstractC115685Le.A00(r1, r4, r2, r3)
        L91:
            return
        L92:
            r3 = 0
            goto L8e
        L94:
            if (r3 == r2) goto L91
            int r3 = r3 + 1
            goto L10
        L9a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass392.onResume():void");
    }
}
