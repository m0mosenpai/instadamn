package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.AdE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23619AdE implements InterfaceC60602pj {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C189478aR A01;

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
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
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

    public C23619AdE(Drawable drawable, C189478aR c189478aR) {
        this.A01 = c189478aR;
        this.A00 = drawable;
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        BottomSheetFragment bottomSheetFragment = this.A01.A03;
        bottomSheetFragment.unregisterLifecycleListener(this);
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null) {
            viewGroup.setBackground(this.A00);
        }
    }
}
