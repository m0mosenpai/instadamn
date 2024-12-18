package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.Bko, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26343Bko extends AbstractC51572Yf {
    public final EnumC76383bi A00;
    public final String A01;
    public final boolean A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String A0G;
        C14360o3.A0B(c76223bS, 0);
        int ordinal = this.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal == 11) {
                AbstractC151756sL.A00().A03();
                boolean z = this.A02;
                String str = this.A01;
                Context A0A = AbstractC25227BEk.A0A(c76223bS);
                C14360o3.A0B(str, 1);
                if (z) {
                    A0G = A0A.getString(2131969028);
                } else {
                    A0G = AbstractC167007dF.A0f(A0A, str, 2131969027);
                }
                C14360o3.A07(A0G);
            } else {
                throw AbstractC166987dD.A12("Unsupported MediaAudience in AudienceDisclaimerComponent");
            }
        } else if (this.A02) {
            A0G = AbstractC77623dm.A0F(c76223bS, 2131955372);
        } else {
            A0G = AbstractC77623dm.A0G(c76223bS, this.A01, 2131955373);
        }
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        C2XE c2xe = A0P.A00;
        int A07 = AbstractC25229BEm.A07(c2xe.A0C, A0P);
        long A09 = AbstractC77623dm.A09(A0P);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0F = AbstractC25234BEr.A0F(null, AbstractC25227BEk.A0Y(0, AbstractC25230BEn.A0I()), 0, AbstractC77623dm.A0B(A0P));
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0G, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A07, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
        A0a.A0B();
        AbstractC25234BEr.A1J(A0a, num, false, true);
        AbstractC77743dy.A00(A0a, A0F);
        AbstractC25227BEk.A1J(A0P, A0a);
        return new C2WF(null, null, null, A0P.A01, false);
    }

    public C26343Bko(EnumC76383bi enumC76383bi, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = enumC76383bi;
    }
}
