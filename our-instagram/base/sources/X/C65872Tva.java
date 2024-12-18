package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tva, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65872Tva implements InterfaceC60602pj {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C65872Tva(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
        this.A04 = AbstractC09440dt.A01(new X30(this, 42));
        this.A02 = AbstractC09440dt.A01(new X30(this, 40));
        this.A03 = AbstractC09440dt.A01(new X30(this, 41));
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

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (AbstractC167007dF.A1Z(this.A03)) {
            C56352iT c56352iT = (C56352iT) this.A02.getValue();
            ((Number) this.A04.getValue()).intValue();
            ViewGroup viewGroup = c56352iT.A0P;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        if (AbstractC167007dF.A1Z(this.A03)) {
            C56352iT c56352iT = (C56352iT) this.A02.getValue();
            int A01 = AbstractC167027dH.A01(this.A04);
            ViewGroup viewGroup = c56352iT.A0P;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = A01;
            viewGroup.setLayoutParams(layoutParams2);
        }
    }
}
