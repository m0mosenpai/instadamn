package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.6kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147446kU implements InterfaceC145136gY {
    public IgShowreelCompositionView A00;
    public String A01;
    public boolean A02;
    public final C147466kW A03;
    public final C62862tP A04;
    public final UserSession A05;

    public C147446kU(C62862tP c62862tP, UserSession userSession) {
        C14360o3.A0B(c62862tP, 1);
        C14360o3.A0B(userSession, 2);
        this.A04 = c62862tP;
        this.A05 = userSession;
        this.A03 = AbstractC147456kV.A00(c62862tP);
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(c41181vS, 1);
        if (!AbstractC130925vf.A0e(c41181vS)) {
            A00();
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
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public final void A00() {
        C147466kW c147466kW;
        C138276Oi A00;
        String str = this.A01;
        if (str != null && (A00 = (c147466kW = this.A03).A00(str)) != null) {
            c147466kW.A02(A00, "fragment_paused", true);
        }
        this.A01 = null;
        this.A00 = null;
        this.A02 = false;
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
    public final void DXv(String str) {
        C147466kW c147466kW;
        C138276Oi A00;
        C68106VBk c68106VBk;
        String str2 = this.A01;
        if (str2 != null && (A00 = (c147466kW = this.A03).A00(str2)) != null && (c68106VBk = (C68106VBk) c147466kW.A03.get(A00)) != null) {
            c68106VBk.A00(true);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        String str = this.A01;
        if (str != null) {
            this.A03.A03(str);
            IgShowreelCompositionView igShowreelCompositionView = this.A00;
            if (igShowreelCompositionView != null) {
                igShowreelCompositionView.getCompositionController().Dzl();
            }
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
    public final void Dz0() {
        IgShowreelCompositionView igShowreelCompositionView;
        if (this.A01 != null && (igShowreelCompositionView = this.A00) != null) {
            igShowreelCompositionView.getCompositionController().Dzk();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
        IgShowreelCompositionView igShowreelCompositionView;
        if (this.A01 != null && (igShowreelCompositionView = this.A00) != null) {
            igShowreelCompositionView.getCompositionController().Dzm();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        A00();
    }
}
