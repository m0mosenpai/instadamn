package X;

import android.graphics.Typeface;

/* renamed from: X.Bk0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26293Bk0 extends AbstractC51572Yf {
    public final String A00;

    public C26293Bk0(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        String str = this.A00;
        long A09 = AbstractC77623dm.A09(c76223bS);
        C2XE ArD = c76223bS.ArD();
        int A092 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A09(ArD.A0C));
        Typeface A0R = AbstractC167017dG.A0R(AbstractC77363dM.A00(c76223bS));
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A03 = C51682Yq.A03(ArD, 0);
        A03.A0W(str);
        A03.A0V(null);
        AbstractC25233BEq.A19(c76223bS, A03, A092, A09);
        A03.A0S(0);
        AbstractC25234BEr.A0n(A0R, c76223bS, A03, A0D);
        A03.A0X(num);
        AbstractC25234BEr.A1H(A03, num, false);
        A03.A0M(1);
        A03.A0c(true);
        AbstractC25232BEp.A1N(A03, false);
        return A03.A0A();
    }
}
