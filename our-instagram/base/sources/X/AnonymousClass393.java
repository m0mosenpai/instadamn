package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.393, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass393 {
    public static final C57112jm A00(final InterfaceC59992oh interfaceC59992oh) {
        final C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        interfaceC59992oh.registerLifecycleListener(new InterfaceC60602pj() { // from class: X.394
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
            public final /* synthetic */ void onStart() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onStop() {
            }

            @Override // X.InterfaceC60602pj
            public final void onViewCreated(View view, Bundle bundle) {
                C14360o3.A0B(view, 0);
                A01.A08(view, C71163Hc.A00((InterfaceC60062oo) interfaceC59992oh), new InterfaceC57142jp[0]);
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
            }
        });
        return A01;
    }
}
