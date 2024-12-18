package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147396kP implements InterfaceC147406kQ {
    public C41181vS A00;
    public C41551w4 A01;
    public final UserSession A02;
    public final C147416kR A03;
    public final ReelViewerFragment A04;

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        if (!c41181vS.equals(this.A00) || c141596ac.A0m) {
            this.A03.A04();
            this.A00 = null;
            this.A01 = null;
        }
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
    public final void DXv(String str) {
        C14360o3.A0B(str, 0);
        if (!str.equals("end_scene")) {
            this.A03.A01();
        }
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
    public final void DhB() {
        C147416kR c147416kR;
        String str;
        if (this.A00 != null && (str = (c147416kR = this.A03).A01) != null) {
            C147416kR.A00(c147416kR, str);
        }
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
        this.A03.A04();
        this.A00 = null;
        this.A01 = null;
    }

    public C147396kP(Context context, UserSession userSession, ReelViewerFragment reelViewerFragment, String str) {
        this.A02 = userSession;
        this.A04 = reelViewerFragment;
        this.A03 = new C147416kR(context, userSession, reelViewerFragment, str, "reel_feed_timeline");
    }
}
