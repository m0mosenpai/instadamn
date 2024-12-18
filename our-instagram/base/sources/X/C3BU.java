package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: X.3BU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BU implements InterfaceC60602pj, InterfaceC13050lr {
    public Dialog A00;
    public UserSession A01;
    public User A02;
    public WeakReference A03;
    public WeakReference A04;
    public final String A05;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            weakReference.clear();
            this.A04 = null;
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.A03 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BU.onStart():void");
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            weakReference.clear();
            this.A04 = null;
        }
        WeakReference weakReference2 = this.A03;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.A03 = null;
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public C3BU(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = C17060sy.A01.A01(userSession);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A05 = obj;
    }
}
