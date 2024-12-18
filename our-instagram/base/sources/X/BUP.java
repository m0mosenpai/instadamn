package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BUP extends AbstractC23611Dp implements InterfaceC16600sD {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUP(OLC olc, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A04 = 2;
        this.A00 = olc;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a;
        BUP bup;
        switch (this.A04) {
            case 0:
                boolean A1a2 = AbstractC166987dD.A1a(obj2);
                A1a = AbstractC166987dD.A1a(obj3);
                bup = new BUP(this.A01, (InterfaceC23621Ds) obj4, 0);
                bup.A00 = obj;
                bup.A02 = A1a2;
                bup.A03 = A1a;
                break;
            case 1:
                boolean A1a3 = AbstractC166987dD.A1a(obj);
                A1a = AbstractC166987dD.A1a(obj3);
                bup = new BUP(this.A01, (InterfaceC23621Ds) obj4, 1);
                bup.A02 = A1a3;
                bup.A00 = obj2;
                bup.A03 = A1a;
                break;
            default:
                boolean A1a4 = AbstractC166987dD.A1a(obj);
                boolean A1a5 = AbstractC166987dD.A1a(obj2);
                bup = new BUP((OLC) this.A00, (InterfaceC23621Ds) obj4);
                bup.A02 = A1a4;
                bup.A03 = A1a5;
                bup.A01 = obj3;
                break;
        }
        return bup.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C3PO c3po;
        switch (this.A04) {
            case 0:
                AbstractC09560e7.A00(obj);
                List<C45126Jxv> list = (List) this.A00;
                boolean z3 = this.A02;
                boolean z4 = this.A03;
                UserSession userSession = ((C25879Bce) this.A01).A01;
                boolean A01 = AbstractC35051FcO.A01(userSession);
                ArrayList A1E = AbstractC166987dD.A1E();
                if (!A01) {
                    User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
                    if (A02 == null) {
                        A02 = AbstractC166997dE.A0Y(userSession);
                    }
                    if (C18U.A06(C06090Tz.A05, userSession, 36322929265814263L) && !A02.A2L()) {
                        A1E.add(new C26087BgG(BHS.A00(new Object[0], 2131952758), BHS.A00(new Object[0], 2131952732), new SimpleImageUrl(AbstractC166997dE.A0Y(userSession).Bhu()), "creator_ai_coming_soon"));
                    }
                }
                for (C45126Jxv c45126Jxv : list) {
                    A1E.add(new C26087BgG(MVZ.A00(c45126Jxv.A03), MVZ.A00(c45126Jxv.A01), new SimpleImageUrl((ImageUrl) ((QJ0) AbstractC001800i.A0I((List) c45126Jxv.A00)).A00), c45126Jxv.A02));
                }
                return new C51748MtX(A1E, z4, z3, A01);
            case 1:
                AbstractC09560e7.A00(obj);
                boolean z5 = this.A02;
                Rect rect = (Rect) this.A00;
                boolean z6 = this.A03;
                if (z5 && z6 && rect != null) {
                    C183608Cl c183608Cl = (C183608Cl) this.A01;
                    if (!c183608Cl.A01 || (c183608Cl.A02 && rect.top == 0)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                AbstractC09560e7.A00(obj);
                boolean z7 = this.A02;
                boolean z8 = this.A03;
                C51709Mse c51709Mse = (C51709Mse) this.A01;
                OLC olc = (OLC) this.A00;
                if (z7) {
                    if (c51709Mse != null) {
                        c3po = c51709Mse.A06;
                    } else {
                        c3po = null;
                    }
                    if (c3po != C3PO.A07 || !z8) {
                        z2 = true;
                        AbstractC166997dE.A1Y(olc.A0S, z2);
                        return C0eB.A00;
                    }
                }
                z2 = false;
                AbstractC166997dE.A1Y(olc.A0S, z2);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUP(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(4, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
    }
}
