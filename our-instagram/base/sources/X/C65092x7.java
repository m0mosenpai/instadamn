package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65092x7 implements InterfaceC60602pj {
    public WeakReference A00;
    public final Activity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public final void A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        C28531Zo c28531Zo = C28531Zo.A04;
        UserSession userSession = this.A03;
        Activity activity = this.A01;
        C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        c28531Zo.A03((FragmentActivity) activity, this.A02, userSession, str, str2, null, AbstractC111324zv.A00(2258), 1);
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

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        E00 e00;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (e00 = (E00) weakReference.get()) != null) {
            e00.A00();
        }
    }

    public C65092x7(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = activity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }
}
