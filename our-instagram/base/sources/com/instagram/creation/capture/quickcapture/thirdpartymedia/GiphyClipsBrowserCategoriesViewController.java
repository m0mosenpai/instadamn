package com.instagram.creation.capture.quickcapture.thirdpartymedia;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC59962oe;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C14360o3;
import X.C44549Jmt;
import X.C47295Kv6;
import X.C57160PZe;
import X.E0E;
import X.InterfaceC23621Ds;
import X.InterfaceC60602pj;
import X.Jng;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class GiphyClipsBrowserCategoriesViewController implements InterfaceC60602pj {
    public Jng A00;
    public ValueAnimator A01;
    public Integer A02;
    public final C44549Jmt A03;
    public final AbstractC59962oe A04;
    public RecyclerView categoryRecyclerView;

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
    public final void onDestroy() {
        this.categoryRecyclerView = null;
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
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        Context A0L = AbstractC166997dE.A0L(view);
        Jng jng = new Jng(A0L);
        this.A00 = jng;
        jng.A00 = new C47295Kv6(this);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.giphy_clips_tabs_recyclerview);
        this.categoryRecyclerView = A0G;
        if (A0G != null) {
            AbstractC31174DnI.A17(A0L, A0G, false);
        }
        RecyclerView recyclerView = this.categoryRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A00);
        }
        RecyclerView recyclerView2 = this.categoryRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.A10(new E0E(0, this, view));
        }
        RecyclerView recyclerView3 = this.categoryRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        AbstractC59962oe abstractC59962oe = this.A04;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 37), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0.getVisibility() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r1 != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(int r8, boolean r9) {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.A02
            if (r0 == 0) goto Lb
            int r0 = r0.intValue()
            if (r0 != r8) goto Lb
            return
        Lb:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L18
            int r0 = r0.getVisibility()
            r4 = 1
            if (r0 == 0) goto L19
        L18:
            r4 = 0
        L19:
            boolean r3 = X.AbstractC167007dF.A1N(r8)
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L28
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 == r5) goto L29
        L28:
            r0 = 0
        L29:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L63
            if (r9 == 0) goto L63
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L36
            r0.setVisibility(r6)
        L36:
            float[] r1 = X.AbstractC43592JPx.A1b()
            r0 = 0
            if (r4 == 0) goto L3f
            r0 = 1065353216(0x3f800000, float:1.0)
        L3f:
            r1[r6] = r0
            if (r3 != 0) goto L44
            r2 = 0
        L44:
            r1[r5] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            X.Of8 r0 = new X.Of8
            r0.<init>(r5, r7, r3)
            r2.addUpdateListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r7.A01 = r2
            r2.start()
        L5c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.A02 = r0
            return
        L63:
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L6a
            r0.cancel()
        L6a:
            androidx.recyclerview.widget.RecyclerView r1 = r7.categoryRecyclerView
            if (r1 == 0) goto L76
            r0 = 0
            if (r3 == 0) goto L73
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            r1.setAlpha(r0)
        L76:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L80
            if (r3 != 0) goto L7d
            r2 = 0
        L7d:
            r0.setScaleY(r2)
        L80:
            androidx.recyclerview.widget.RecyclerView r0 = r7.categoryRecyclerView
            if (r0 == 0) goto L5c
            r0.setVisibility(r8)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController.A00(int, boolean):void");
    }

    public GiphyClipsBrowserCategoriesViewController(AbstractC59962oe abstractC59962oe, C44549Jmt c44549Jmt) {
        this.A04 = abstractC59962oe;
        this.A03 = c44549Jmt;
    }
}
