package com.instagram.sharetofriendsstory.v2.drawer;

import X.AbstractC09440dt;
import X.AnonymousClass825;
import X.C14360o3;
import X.C70569Wd3;
import X.C8BD;
import X.C9F7;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC143326dX;
import X.InterfaceC56392iX;
import X.InterfaceC60082oq;
import X.InterfaceC60602pj;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ShareToFriendsStoryDrawerController implements InterfaceC60602pj, InterfaceC60082oq, C8BD {
    public final UserSession A00;
    public final InterfaceC143326dX A01;
    public final AnonymousClass825 A02;
    public final InterfaceC09390do A03;
    public InterfaceC56392iX drawerContainerViewStubber;
    public View postCaptureVideoContainer;

    public ShareToFriendsStoryDrawerController(View view, Fragment fragment, UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC143326dX interfaceC143326dX, AnonymousClass825 anonymousClass825) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(anonymousClass825, 4);
        C14360o3.A0B(fragment, 6);
        this.A00 = userSession;
        this.drawerContainerViewStubber = interfaceC56392iX;
        this.postCaptureVideoContainer = view;
        this.A02 = anonymousClass825;
        this.A01 = interfaceC143326dX;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9F7(26, fragment, this));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBx() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBz() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DCM() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DCN() {
    }

    @Override // X.InterfaceC60082oq
    public final void DCP(C70569Wd3 c70569Wd3, float f, float f2, float f3) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DhK() {
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean ABG() {
        return true;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean CWB() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EiT() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EjE() {
        return true;
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean DmT(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean Eis(MotionEvent motionEvent) {
        return false;
    }
}
