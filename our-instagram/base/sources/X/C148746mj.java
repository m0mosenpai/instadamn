package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148746mj implements InterfaceC145136gY, InterfaceC147946lQ {
    public C41181vS A00;
    public final InterfaceC147516kc A01;
    public final UserSession A02;
    public final C3G2 A03;

    public C148746mj(UserSession userSession, C3G2 c3g2, InterfaceC147516kc interfaceC147516kc) {
        C14360o3.A0B(interfaceC147516kc, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3g2, 3);
        this.A01 = interfaceC147516kc;
        this.A02 = userSession;
        this.A03 = c3g2;
    }

    @Override // X.InterfaceC147946lQ
    public final boolean CoF(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        if (!AbstractC130925vf.A0O(this.A02, c41181vS, c41551w4, this.A03, c141596ac)) {
            InterfaceC147516kc interfaceC147516kc = this.A01;
            if (c141596ac.A0H != 0) {
                float f2 = c141596ac.A0A;
                int currentPositionMs = interfaceC147516kc.getCurrentPositionMs();
                int i = ((TextureViewSurfaceTextureListenerC147506ka) interfaceC147516kc).A03;
                Float valueOf = Float.valueOf(((currentPositionMs % i) + (c141596ac.A0E * i)) / f2);
                if (valueOf != null) {
                    c141596ac.A02(valueOf.floatValue());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        int i;
        InterfaceC104964oB But;
        Integer BPL;
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (But = c38321qM.A0C.But()) != null && (BPL = But.BPL()) != null) {
            i = BPL.intValue();
        } else {
            i = 0;
        }
        c141596ac.A0H = i;
        if (i > 0 && C14360o3.A0K(this.A00, c41181vS)) {
            c141596ac.A0E = ((TextureViewSurfaceTextureListenerC147506ka) this.A01).A08;
        }
        if (!C14360o3.A0K(this.A00, c41181vS)) {
            this.A00 = c41181vS;
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
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
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
    public final /* synthetic */ void onDestroyView() {
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
}
