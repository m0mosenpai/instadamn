package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.AhS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23873AhS implements InterfaceC58281PsZ {
    public CreationActionBar A00;
    public CreationActionBar A01;
    public IgdsMediaButton A02;
    public IgdsMediaButton A03;
    public IgdsMediaButton A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final C89P A07;
    public final C187418Sj A08;
    public final C187358Sd A09;
    public final C5JK A0A;

    public C23873AhS(AbstractC59962oe abstractC59962oe, UserSession userSession, C89P c89p, C187418Sj c187418Sj, C187358Sd c187358Sd, C5JK c5jk) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c5jk, 6);
        this.A06 = userSession;
        this.A05 = abstractC59962oe;
        this.A09 = c187358Sd;
        this.A08 = c187418Sj;
        this.A07 = c89p;
        this.A0A = c5jk;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58281PsZ
    public final void ADl(EnumC189218Zt enumC189218Zt) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58281PsZ
    public final void ESO(View.OnClickListener onClickListener) {
    }

    @Override // X.InterfaceC58281PsZ
    public final void Eav(View.OnClickListener onClickListener) {
    }

    @Override // X.InterfaceC58281PsZ
    public final void Ecd(View.OnClickListener onClickListener) {
    }

    @Override // X.InterfaceC58281PsZ
    public final void Ecg(View.OnClickListener onClickListener) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23873AhS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC58281PsZ
    public final /* synthetic */ AbstractC187378Sf Auy() {
        return null;
    }

    @Override // X.InterfaceC58281PsZ
    public final int BMb() {
        return R.layout.clips_timeline_template_editor_creation_fragment;
    }
}
