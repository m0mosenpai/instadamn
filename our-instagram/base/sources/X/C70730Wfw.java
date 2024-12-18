package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70730Wfw implements InterfaceC60602pj {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ BaseFragmentActivity A02;
    public final /* synthetic */ C1Y6 A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ UserSession A05;

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

    public C70730Wfw(Bundle bundle, FragmentActivity fragmentActivity, BaseFragmentActivity baseFragmentActivity, C1Y6 c1y6, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = c1y6;
        this.A05 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = bundle;
        this.A02 = baseFragmentActivity;
        this.A04 = interfaceC11380iw;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r0 = 17
            r2 = r17
            r3 = r18
            r1 = r19
            if (r3 != r0) goto Lc2
            r0 = 1797(0x705, float:2.518E-42)
            if (r1 != r0) goto Lc2
            X.1Y6 r11 = r2.A03
            X.XDF r0 = r11.A00
            if (r0 == 0) goto L17
            r0.Dpa()
        L17:
            r1 = 0
            r7 = r20
            if (r20 == 0) goto L7f
            java.lang.String r0 = "destination_submitted"
            android.os.Parcelable r10 = r7.getParcelableExtra(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r10 = (com.instagram.api.schemas.XIGIGBoostDestination) r10
        L24:
            r3 = 0
            if (r20 == 0) goto L31
            java.lang.String r0 = "is_ab_test"
            boolean r0 = r7.getBooleanExtra(r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L31:
            com.instagram.common.session.UserSession r13 = r2.A05
            boolean r0 = X.AbstractC31177DnL.A1b(r1)
            if (r0 != 0) goto L81
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36327984440884248(0x81101c00013c18, double:3.037301869242652E-306)
            boolean r5 = X.C18U.A06(r4, r13, r0)
            r0 = 36327984440949785(0x81101c00023c19, double:3.037301869284098E-306)
            boolean r1 = X.C18U.A06(r4, r13, r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            if (r10 != r0) goto L53
            if (r5 != 0) goto L59
        L53:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r10 != r0) goto L81
            if (r1 == 0) goto L81
        L59:
            r0 = 36609459417520014(0x82101c0000178e, double:3.2153077778758676E-306)
            long r0 = X.C18U.A01(r4, r13, r0)
            int r6 = (int) r0
            r0 = 3
            java.lang.Integer[] r5 = X.C05F.A00(r0)
            int r4 = r5.length
            r1 = 0
        L6a:
            if (r1 >= r4) goto L81
            r15 = r5[r1]
            int r0 = r15.intValue()
            switch(r0) {
                case 1: goto L7b;
                case 2: goto L7d;
                default: goto L75;
            }
        L75:
            r0 = 0
        L76:
            if (r0 == r6) goto L83
            int r1 = r1 + 1
            goto L6a
        L7b:
            r0 = 1
            goto L76
        L7d:
            r0 = 2
            goto L76
        L7f:
            r10 = r1
            goto L24
        L81:
            java.lang.Integer r15 = X.C05F.A00
        L83:
            if (r20 == 0) goto L9d
            java.lang.String r0 = "is_eligible_for_meta_verified_upsell"
            boolean r16 = r7.getBooleanExtra(r0, r3)
        L8b:
            java.lang.Integer r0 = X.C05F.A0C
            if (r15 != r0) goto La0
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r1.getString(r0)
            X.AbstractC68464VRu.A00(r3, r10, r13, r0)
            goto Lc5
        L9d:
            r16 = 0
            goto L8b
        La0:
            if (r20 == 0) goto Lc5
            java.lang.String r0 = "media_image_url"
            android.os.Parcelable r14 = r7.getParcelableExtra(r0)
            com.instagram.common.typedurl.ImageUrl r14 = (com.instagram.common.typedurl.ImageUrl) r14
            if (r14 == 0) goto Lc5
            androidx.fragment.app.FragmentActivity r9 = r2.A01
            X.0iw r12 = r2.A04
            android.os.Bundle r8 = r2.A00
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            X.Wxi r6 = new X.Wxi
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r6, r0)
            goto Lc5
        Lc2:
            r0 = -1
            if (r1 == r0) goto Lcf
        Lc5:
            X.1Y6 r0 = r2.A03
            X.C1Y6.A01(r0)
            com.instagram.base.activity.BaseFragmentActivity r0 = r2.A02
            r0.unregisterOnActivityResultListener(r2)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70730Wfw.onActivityResult(int, int, android.content.Intent):void");
    }
}
