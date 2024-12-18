package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Io3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42279Io3 implements InterfaceC60602pj, InterfaceC43441JHf {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final J0U A04;
    public final MediaGridArguments A05;
    public final C38332GtR A06;
    public final Product A07;
    public final boolean A08;
    public final C41728Idz A09;

    /* JADX WARN: Type inference failed for: r14v0, types: [X.2pS, X.0iw, java.lang.Object] */
    public C42279Io3(Context context, Fragment fragment, UserSession userSession, MediaGridArguments mediaGridArguments) {
        AbstractC167007dF.A1F(fragment, 2, mediaGridArguments);
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
        this.A05 = mediaGridArguments;
        ?? obj = new Object();
        this.A03 = obj;
        Product product = mediaGridArguments.A01;
        String str = mediaGridArguments.A03;
        String str2 = mediaGridArguments.A09;
        String str3 = mediaGridArguments.A0A;
        String str4 = mediaGridArguments.A0B;
        String str5 = mediaGridArguments.A0C;
        C1DX A00 = C1DW.A00(userSession);
        String str6 = mediaGridArguments.A06;
        C41728Idz c41728Idz = new C41728Idz(mediaGridArguments.A00, obj, userSession, A00.A02(str6), product, str, str2, str3, str4, str5, mediaGridArguments.A02, mediaGridArguments.A04, null);
        this.A09 = c41728Idz;
        this.A06 = new C38332GtR(userSession, c41728Idz, product, str6, mediaGridArguments.A0E, AbstractC13880nE.A0A(context));
        this.A04 = new J0U(context, userSession, product);
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 2342156244736935766L);
        this.A07 = product;
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

    @Override // X.InterfaceC43441JHf
    public final void Cve() {
        this.A06.A04(true);
    }

    @Override // X.InterfaceC43441JHf
    public final void D13() {
        this.A06.A05(true);
    }

    @Override // X.InterfaceC43441JHf
    public final void E0f() {
        String str;
        MediaGridArguments mediaGridArguments = this.A05;
        Product product = mediaGridArguments.A01;
        User user = product.A0B;
        String str2 = null;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        String str3 = mediaGridArguments.A06;
        if (str3 != null) {
            str2 = AbstractC41071vF.A0I(this.A02, str3);
        }
        if (str != null) {
            C1XJ.A00.A0m(this.A01.requireActivity(), EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, this.A02, null, str, mediaGridArguments.A0C, this.A03.getModuleName(), "view_in_cart_cta", null, str2, null, null, mediaGridArguments.A03, product.A0H, str3, mediaGridArguments.A02, null, null, false);
            return;
        }
        C1XJ.A00.A0p(this.A01.requireActivity(), EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, this.A02, mediaGridArguments.A0C, this.A03.getModuleName(), "view_in_cart_cta", str2, str3, mediaGridArguments.A02, false);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C38332GtR c38332GtR = this.A06;
        IMV imv = c38332GtR.A06;
        AbstractC166997dE.A1Y(imv.A03, imv.A01.A08(C38332GtR.A01(c38332GtR)));
    }
}
