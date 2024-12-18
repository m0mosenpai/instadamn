package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146966jY implements InterfaceC145136gY {
    public C6WQ A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC1119353f A03;
    public final InterfaceC1118853a A04;

    public C146966jY(Fragment fragment, UserSession userSession, InterfaceC1119353f interfaceC1119353f, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 2);
        this.A04 = interfaceC1118853a;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = interfaceC1119353f;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        FragmentActivity activity;
        C6WQ c6wq = this.A00;
        if (c6wq != null && (activity = this.A01.getActivity()) != null && !activity.isDestroyed()) {
            c6wq.dismiss();
        }
        this.A00 = null;
    }
}
