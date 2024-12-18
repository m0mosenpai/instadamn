package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes7.dex */
public final class HGD extends C1P1 {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C14510oO A02;

    public HGD(C1P1 c1p1, UserSession userSession, C14510oO c14510oO) {
        this.A00 = c1p1;
        this.A01 = userSession;
        this.A02 = c14510oO;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1620715466);
        this.A00.onFinish();
        C0f9.A0A(-1393865576, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1446004226);
        this.A00.onStart();
        C0f9.A0A(-2000267774, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(496087343);
        C105824pt c105824pt = (C105824pt) obj;
        int A0N = AbstractC167017dG.A0N(c105824pt, -867738294);
        Reel A0G = C1OU.A04(this.A01).A0G(c105824pt);
        C14510oO c14510oO = this.A02;
        C1P1 c1p1 = this.A00;
        C105824pt c105824pt2 = A0G.A0H;
        if (c105824pt2 != null && !c14510oO.A00) {
            c1p1.onSuccess(c105824pt2);
        }
        C0f9.A0A(2001634518, A0N);
        C0f9.A0A(-1441352603, A03);
    }
}
