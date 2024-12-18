package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;

/* renamed from: X.Efn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32981Efn extends G9Q implements InterfaceC60602pj {
    public Dialog A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AbstractC59962oe A03;
    public final C07270a1 A04;
    public final EnumC31713DwI A05;

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
    public final void onDestroy() {
        this.A03.unregisterLifecycleListener(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        Dialog dialog = this.A00;
        if (dialog != null) {
            A00(dialog, this);
        }
    }

    public C32981Efn(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, EnumC31713DwI enumC31713DwI) {
        super(fragmentActivity);
        this.A01 = context;
        this.A04 = c07270a1;
        this.A03 = abstractC59962oe;
        this.A02 = fragmentActivity;
        this.A05 = enumC31713DwI;
        abstractC59962oe.registerLifecycleListener(this);
    }

    public static final void A00(Dialog dialog, C32981Efn c32981Efn) {
        String str;
        C0fJ.A00(dialog);
        C07270a1 c07270a1 = c32981Efn.A04;
        EnumC31713DwI enumC31713DwI = c32981Efn.A05;
        if (enumC31713DwI == null || (str = enumC31713DwI.A01) == null) {
            str = "";
        }
        C63378Siq.A04(c07270a1, str, "login", "invalid_saved_credentials");
        AbstractC27461Uz abstractC27461Uz = AbstractC27461Uz.getInstance();
        if (abstractC27461Uz != null) {
            ((SmartLockPluginImpl) abstractC27461Uz).A00 = false;
        }
    }
}
