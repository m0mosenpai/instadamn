package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CU implements InterfaceC60602pj {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C3CS A02;
    public final Context A03;

    public C3CU(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C3CS c3cs) {
        C14360o3.A0B(c3cs, 3);
        this.A03 = context;
        this.A00 = abstractC59962oe;
        this.A02 = c3cs;
        this.A01 = userSession;
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
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(Activity activity, Context context, UserSession userSession, C3CS c3cs) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0A(2131952973);
        c193328hC.A09(2131952971);
        c193328hC.A0J(new LMG(activity, userSession, c3cs), 2131952972);
        c193328hC.A0H(new LMD(userSession, c3cs), 2131952970);
        c193328hC.A0k(context.getDrawable(R.drawable.ig_illustrations_illo_settings_heart_refresh));
        c193328hC.A0t(true);
        C0fJ.A00(c193328hC.A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (X.C18U.A06(r3, r4, 36327451864939089L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r12.getLong(X.AbstractC111324zv.A00(1178), 0) + java.util.concurrent.TimeUnit.DAYS.toMillis(X.C18U.A01(r3, r4, 36601015511945311L)))) goto L39;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CU.onCreate():void");
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC59962oe abstractC59962oe = this.A00;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C9DG c9dg = new C9DG(viewLifecycleOwner, c07s, this, null, 1);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dg, A00);
    }
}
