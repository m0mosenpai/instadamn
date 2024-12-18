package X;

import android.graphics.Typeface;
import com.instagram.user.model.User;

/* renamed from: X.BlM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26377BlM extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31137Dmc A02;

    public C26377BlM(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 3);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String CAk;
        C14360o3.A0B(c76223bS, 0);
        User user = this.A00.A0K;
        if (user == null || (CAk = user.A03.CAk()) == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25233BEq.A0d(C9CU.A00(C9CV.A00(AbstractC25232BEp.A14(null, 0, AbstractC25230BEn.A0K()), C05F.A01, "android.widget.Button", 0), C05F.A1I, 0, AbstractC25230BEn.A0L()), C30170DRa.A00(this, user, 47)), C05F.A0Y, DRV.A00(this, 35), null);
        long A05 = AbstractC77623dm.A05(c76223bS);
        Typeface create = Typeface.create("sans-serif", 0);
        int A04 = AbstractC25236BEt.A04(c76223bS);
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c76223bS.A05, null, CAk, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A04, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(create, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        return AbstractC25227BEk.A0X(A0e, A0a);
    }
}
