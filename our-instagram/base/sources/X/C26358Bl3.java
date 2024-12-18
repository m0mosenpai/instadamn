package X;

import java.util.Arrays;

/* renamed from: X.Bl3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26358Bl3 extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C29463Cyd A01;
    public final CharSequence A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        AbstractC27453C9v abstractC27453C9v;
        C14360o3.A0B(c76223bS, 0);
        CWG cwg = (CWG) AbstractC28337CeP.A02(c76223bS, this.A01);
        Object A00 = AbstractC77183d4.A00(c76223bS, DH2.A01(cwg, c76223bS, this, 10), Arrays.copyOf(new Object[]{cwg}, 1));
        if (A00 == null) {
            A00 = null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0A = AbstractC25225BEi.A0A(cwg.A02);
        long A0A2 = AbstractC25225BEi.A0A(cwg.A01);
        long A0D = AbstractC25229BEm.A0D();
        C51722Yv A0D2 = AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(C05F.A0u, 0, A0A), 0, A0D), AbstractC25225BEi.A0n(C05F.A1F, 0, A0A2), 0, A0D);
        if (A00 == null) {
            A00 = null;
        }
        C51722Yv A16 = AbstractC25232BEp.A16(A0D2, C05F.A00, A00);
        Integer num = cwg.A06;
        Integer num2 = cwg.A05;
        if (num != null && num2 != null) {
            abstractC27453C9v = new C3F(AbstractC25229BEm.A0L(num), AbstractC25229BEm.A0L(num2));
        } else {
            abstractC27453C9v = C3G.A00;
        }
        return new C26471Bms(A16.A00(this.A00), C93E.TEXT_START, C93G.TOP, cwg.A03, abstractC27453C9v, this.A02, 1);
    }

    public C26358Bl3(C51722Yv c51722Yv, C29463Cyd c29463Cyd, CharSequence charSequence) {
        AbstractC167017dG.A1Q(charSequence, c51722Yv);
        this.A02 = charSequence;
        this.A01 = c29463Cyd;
        this.A00 = c51722Yv;
    }
}
