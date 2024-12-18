package com.instagram.nme.contextualpromo;

import X.AbstractC23641Du;
import X.AbstractC59962oe;
import X.C05F;
import X.C07Y;
import X.C12L;
import X.C14360o3;
import X.C25A;
import X.C47Z;
import X.C57312k6;
import X.C9D4;
import X.InterfaceC60442pS;
import X.InterfaceC60602pj;
import X.InterfaceC65982ya;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ClipsUploadPromoHelper implements InterfaceC60602pj, InterfaceC65982ya {
    public C47Z A00;
    public final UserSession A01;
    public final Set A02;
    public final AbstractC59962oe A03;
    public final InterfaceC60442pS A04;
    public final PendingMediaStore A05;

    public ClipsUploadPromoHelper(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = abstractC59962oe;
        this.A04 = interfaceC60442pS;
        this.A05 = C25A.A00(userSession);
        this.A02 = new HashSet();
    }

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

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r11, X.C47Z r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 15
            boolean r0 = X.C206489Cf.A00(r14, r3)
            if (r0 == 0) goto L75
            r10 = r14
            X.9Cf r10 = (X.C206489Cf) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r10.A00 = r2
        L16:
            java.lang.Object r5 = r10.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L4c
            if (r0 != r3) goto L7b
            java.lang.Object r2 = r10.A03
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r11 = r10.A01
            com.instagram.nme.contextualpromo.ClipsUploadPromoHelper r11 = (com.instagram.nme.contextualpromo.ClipsUploadPromoHelper) r11
            X.AbstractC09560e7.A00(r5)
        L2c:
            X.Oe3 r5 = (X.C55196Oe3) r5
            X.12W r0 = r10.getContext()
            boolean r0 = X.C57Z.A03(r0)
            if (r0 == 0) goto L49
            if (r5 == 0) goto L49
            X.2oe r0 = r11.A03
            r0.requireContext()
            com.instagram.common.session.UserSession r1 = r11.A01
            X.2pS r0 = r11.A04
            X.C77453dV.A08(r1, r0)
            r5.A07(r2)
        L49:
            X.0eB r4 = X.C0eB.A00
            return r4
        L4c:
            X.AbstractC09560e7.A00(r5)
            X.2oe r0 = r11.A03
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r11.A01
            X.2k6 r0 = X.C07Y.A00(r2)
            com.instagram.nme.contextualpromo.ContextualPromoHelper r5 = new com.instagram.nme.contextualpromo.ContextualPromoHelper
            r5.<init>(r1, r0)
            X.Nht r6 = X.EnumC53317Nht.BOTTOMSHEET
            r8 = 0
            r10.A01 = r11
            r10.A02 = r12
            r10.A03 = r2
            r10.A00 = r3
            java.lang.String r7 = "IG_REELS_POST_PUBLISHING"
            r9 = r13
            java.lang.Object r5 = r5.A01(r6, r7, r8, r9, r10)
            if (r5 != r4) goto L2c
            return r4
        L75:
            X.9Cf r10 = new X.9Cf
            r10.<init>(r11, r14, r3)
            goto L16
        L7b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ClipsUploadPromoHelper.A00(com.instagram.nme.contextualpromo.ClipsUploadPromoHelper, X.47Z, java.lang.String, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C57312k6 A00 = C07Y.A00(this.A03.getViewLifecycleOwner());
        AbstractC23641Du.A03(C05F.A00, C12L.A00.A04, new C9D4(this, null, 14), A00);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            c47z.A0X(this);
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        List A08 = this.A05.A08();
        if (!A08.isEmpty()) {
            C47Z c47z = (C47Z) A08.get(A08.size() - 1);
            this.A00 = c47z;
            if (c47z != null) {
                c47z.A0W(this);
            }
        }
    }
}
