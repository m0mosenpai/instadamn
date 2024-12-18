package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.N9b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52212N9b extends C1P1 {
    public InterfaceC57917PmN A00;
    public String A01;
    public final /* synthetic */ C54838OLx A02;

    public C52212N9b(InterfaceC57917PmN interfaceC57917PmN, C54838OLx c54838OLx, String str) {
        this.A02 = c54838OLx;
        this.A01 = str;
        this.A00 = interfaceC57917PmN;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1650844737);
        C54838OLx c54838OLx = this.A02;
        C11T.A03(new PLN(c54838OLx));
        Context context = c54838OLx.A00;
        C9GR.A03(context, context.getResources().getString(2131976159), "DeleteHighlightReel_unknown_error_occured", 0);
        C0f9.A0A(-11522592, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1873542779);
        int A032 = C0f9.A03(1336010352);
        C54838OLx c54838OLx = this.A02;
        C11T.A03(new PLN(c54838OLx));
        UserSession userSession = c54838OLx.A05;
        ReelStore A04 = C1OU.A04(userSession);
        String str = this.A01;
        Reel A0M = A04.A0M(str);
        if (A0M != null) {
            for (C41181vS c41181vS : A0M.A0O(userSession)) {
                if (c41181vS.A0e == EnumC41231vY.A09) {
                    C38321qM c38321qM = c41181vS.A0b;
                    c38321qM.getClass();
                    c38321qM.A4O(str);
                }
            }
            C1OU.A04(userSession).A0c(str);
            c54838OLx.A04.A05(new C142656cR(A0M));
        }
        InterfaceC57917PmN interfaceC57917PmN = this.A00;
        if (interfaceC57917PmN != null) {
            interfaceC57917PmN.D9o();
        }
        C0f9.A0A(1370542398, A032);
        C0f9.A0A(973775680, A03);
    }
}
