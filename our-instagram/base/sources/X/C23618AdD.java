package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.AdD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23618AdD implements InterfaceC60602pj {
    public final /* synthetic */ Fragment A00;
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

    public C23618AdD(Fragment fragment, C189478aR c189478aR) {
        this.A01 = c189478aR;
        this.A00 = fragment;
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        C189478aR c189478aR = this.A01;
        BottomSheetFragment bottomSheetFragment = c189478aR.A03;
        bottomSheetFragment.unregisterLifecycleListener(this);
        bottomSheetFragment.A0V(this.A00, c189478aR.A02, true, true, false);
    }
}
