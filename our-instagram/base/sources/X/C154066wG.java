package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154066wG implements InterfaceC60602pj {
    public String A00;
    public final EnumC125615m7 A01;
    public final UserSession A02;
    public final String A03;
    public final InterfaceC153516vM A04;
    public final C62832tM A05;

    public C154066wG(EnumC125615m7 enumC125615m7, UserSession userSession, InterfaceC153516vM interfaceC153516vM, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = interfaceC153516vM;
        this.A01 = enumC125615m7;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        this.A05 = A00;
    }

    public final void A00(InterfaceC111084zP interfaceC111084zP, EnumC125615m7 enumC125615m7, List list, boolean z) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC111084zP, 1);
        C14360o3.A0B(enumC125615m7, 4);
        C62832tM c62832tM = this.A05;
        String str = this.A00;
        if (str == null) {
            C14360o3.A0F("gridKey");
            throw C00O.createAndThrow();
        }
        c62832tM.A03(interfaceC111084zP, enumC125615m7, str, list, z, true);
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        InterfaceC153516vM interfaceC153516vM = this.A04;
        this.A00 = interfaceC153516vM.BAK();
        for (InterfaceC62852tO interfaceC62852tO : interfaceC153516vM.AoI()) {
            C62832tM c62832tM = this.A05;
            String str = this.A00;
            if (str == null) {
                C14360o3.A0F("gridKey");
                throw C00O.createAndThrow();
            }
            c62832tM.A04(interfaceC62852tO, str);
        }
        interfaceC153516vM.AoO().A03(new C37929GmR(this));
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A05.A07(this.A04.BAK());
    }
}
