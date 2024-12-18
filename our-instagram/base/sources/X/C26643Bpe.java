package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bpe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26643Bpe extends AbstractC77583di {
    public static final C51532Yb A08;
    public static final C51532Yb A09;
    public final int A00;
    public final ImageUrl A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC31137Dmc A03;
    public final AbstractC25398BLp A04;
    public final C51722Yv A05;
    public final UserSession A06;
    public final boolean A07;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C51532Yb c51532Yb;
        long A0D;
        C14360o3.A0B(c77993eR, 0);
        AbstractC25398BLp abstractC25398BLp = this.A04;
        if (abstractC25398BLp.A0E()) {
            c51532Yb = A08;
        } else {
            c51532Yb = A09;
        }
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C37616GhB c37616GhB = new C37616GhB(userSession, interfaceC60442pS);
        C29034CrN c29034CrN = new C29034CrN(c51532Yb);
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, c51532Yb, DFG.A00, DRT.A00(this, 10));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = c75933ay.A00(this.A05);
        if (this.A07 && this.A00 == 0) {
            A0D = AbstractC77623dm.A04(c77993eR);
        } else {
            A0D = AbstractC25229BEm.A0D();
        }
        return AbstractC25225BEi.A0g(A00.A00(AbstractC25232BEp.A14(null, 0, A0D)).A00(AbstractC25233BEq.A0d(AbstractC25396BLn.A00(EnumC71343Hv.A0g, c75933ay, null, abstractC25398BLp.A0D, userSession, interfaceC60442pS, Integer.valueOf(this.A00), false, false), C30170DRa.A00(this, c37616GhB, 29))), c29034CrN, A0c);
    }

    static {
        C29014Cr3 c29014Cr3 = C29014Cr3.A00;
        C77603dk c77603dk = C77603dk.A00;
        A08 = new C51532Yb(c77603dk, c29014Cr3, 3, false);
        A09 = new C51532Yb(c77603dk, C29015Cr4.A00, 3, false);
    }

    public C26643Bpe(C51722Yv c51722Yv, UserSession userSession, ImageUrl imageUrl, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc, AbstractC25398BLp abstractC25398BLp, int i, boolean z) {
        this.A06 = userSession;
        this.A01 = imageUrl;
        this.A00 = i;
        this.A04 = abstractC25398BLp;
        this.A02 = interfaceC60442pS;
        this.A03 = interfaceC31137Dmc;
        this.A07 = z;
        this.A05 = c51722Yv;
    }
}
