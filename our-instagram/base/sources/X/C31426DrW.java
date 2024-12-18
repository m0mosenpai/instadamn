package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.DrW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31426DrW implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
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

    public C31426DrW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        ScheduledFuture scheduledFuture;
        if (this.A00 == 0) {
            C36010Fv8 c36010Fv8 = (C36010Fv8) this.A01;
            if (i == 15739 && intent != null && intent.getBooleanExtra(AbstractC111324zv.A00(1893), false)) {
                FragmentActivity activity = c36010Fv8.A0A.getActivity();
                if (activity != null) {
                    activity.getOnBackPressedDispatcher().A04();
                    return;
                }
                return;
            }
            C34721FRi c34721FRi = c36010Fv8.A0F.A01;
            if (c34721FRi == null || (scheduledFuture = c34721FRi.A09) == null) {
                return;
            }
            scheduledFuture.cancel(true);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
        if (1 - this.A00 == 0) {
            C31250DoY c31250DoY = (C31250DoY) this.A01;
            UserSession userSession = c31250DoY.A0A;
            AbstractC25651Mw.A00(userSession).A02(c31250DoY.A01, C36058Fvu.class);
            AbstractC25651Mw.A00(userSession).A02(c31250DoY.A02, C36059Fvv.class);
            c31250DoY.A07.unregisterLifecycleListener(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
        if (2 - this.A00 == 0) {
            C35150Fes c35150Fes = (C35150Fes) this.A01;
            UserSession userSession = c35150Fes.A07;
            AbstractC25651Mw.A00(userSession).A02(c35150Fes.A06, AbstractC36052Fvo.class);
            AbstractC25651Mw.A00(userSession).A02(c35150Fes.A05, C36061Fvx.class);
        }
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
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }
}
