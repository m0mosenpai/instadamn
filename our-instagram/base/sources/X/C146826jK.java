package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146826jK implements InterfaceC145136gY, InterfaceC81993lL {
    public String A00;
    public final InterfaceC62872tQ A01;
    public final UserSession A02;
    public final ReelViewerConfig A03;
    public final C3G2 A04;
    public final C69583As A05;
    public final InterfaceC114805Gn A06;
    public final InterfaceC145416h0 A07;
    public final ReelViewerFragment A08;
    public final C146036i0 A09;
    public final java.util.Set A0A;

    public C146826jK(InterfaceC62872tQ interfaceC62872tQ, UserSession userSession, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C69583As c69583As, InterfaceC114805Gn interfaceC114805Gn, InterfaceC145416h0 interfaceC145416h0, ReelViewerFragment reelViewerFragment, C146036i0 c146036i0) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC114805Gn, 2);
        C14360o3.A0B(c3g2, 4);
        C14360o3.A0B(c69583As, 5);
        C14360o3.A0B(c146036i0, 6);
        C14360o3.A0B(interfaceC145416h0, 7);
        C14360o3.A0B(reelViewerConfig, 8);
        C14360o3.A0B(interfaceC62872tQ, 9);
        this.A02 = userSession;
        this.A06 = interfaceC114805Gn;
        this.A08 = reelViewerFragment;
        this.A04 = c3g2;
        this.A05 = c69583As;
        this.A09 = c146036i0;
        this.A07 = interfaceC145416h0;
        this.A03 = reelViewerConfig;
        this.A01 = interfaceC62872tQ;
        this.A0A = new HashSet();
        this.A00 = "";
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

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
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

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        C41551w4 Blv = this.A06.Blv(str);
        if (Blv != null) {
            UserSession userSession = this.A02;
            Blv.A0B(userSession);
            if (!Blv.A0E(userSession)) {
                this.A05.A02(Blv.A0H, Blv.A09(userSession), z);
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
    public final void onDestroyView() {
        UserSession userSession = this.A02;
        AbstractC82003lM.A00(userSession).A03(this);
        C82013lN A00 = AbstractC82003lM.A00(userSession);
        java.util.Set set = this.A0A;
        C14360o3.A0B(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A00.A03((InterfaceC81993lL) it.next());
        }
    }
}
