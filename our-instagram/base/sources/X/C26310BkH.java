package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.BkH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26310BkH extends AbstractC51572Yf {
    public final CTH A00;
    public final C27936CSv A01;

    public C26310BkH(CTH cth, C27936CSv c27936CSv) {
        C14360o3.A0B(c27936CSv, 2);
        this.A00 = cth;
        this.A01 = c27936CSv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        CTH cth = this.A00;
        long A0A = AbstractC25225BEi.A0A(cth.A08);
        long A0A2 = AbstractC25225BEi.A0A(cth.A04);
        int i = cth.A06;
        C51722Yv A0E = AbstractC25234BEr.A0E(AbstractC25234BEr.A0G(null, AbstractC25225BEi.A0n(C05F.A07, A1Z ? 1 : 0, A0A), A1Z ? 1 : 0, AbstractC25225BEi.A0A(i)), AbstractC25227BEk.A0Z(A1Z ? 1 : 0, A0A2), A1Z ? 1 : 0, AbstractC25225BEi.A0A(cth.A05));
        int i2 = this.A01.A05;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        if (i > 0) {
            float A05 = AbstractC25233BEq.A05(A12);
            float[] fArr = new float[8];
            fArr[A1Z ? 1 : 0] = A05;
            fArr[1] = A05;
            fArr[2] = A05;
            fArr[3] = A05;
            AbstractC167017dG.A1X(fArr, 0.0f);
            gradientDrawable.setCornerRadii(fArr);
        }
        long A0M = AbstractC25230BEn.A0M();
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(null, num, A1Z ? 1 : 0, A0M), num, gradientDrawable);
        Integer num2 = C05F.A01;
        C51722Yv A0B = AbstractC25234BEr.A0B(A16, AbstractC25225BEi.A0m(num2, 1.0f, 1), 1.0f);
        float f = cth.A00;
        A12.A00(AbstractC76963ci.A0M(A12, AbstractC171007jr.A00(A0B, f)));
        if (cth.A09) {
            long A0A3 = AbstractC25225BEi.A0A(cth.A01 + 12);
            long A0F = AbstractC25229BEm.A0F();
            float A08 = AbstractC25228BEl.A08(A12, A0M);
            DID did = new DID(this, A12, AbstractC25232BEp.A0m(A12, cth.A03), AbstractC25232BEp.A0m(A12, cth.A07), AbstractC25232BEp.A0m(A12, 10.0d), AbstractC25232BEp.A0m(A12, cth.A02), 1, A0A3);
            COW cow = new COW();
            did.invoke(cow);
            C26104Bgo c26104Bgo = new C26104Bgo(A1Z ? 1 : 0, cow.A00);
            AbstractC25231BEo.A1A(new C26607Bp4(null, new BHT(c26104Bgo, A08, i2, 1)), AbstractC25233BEq.A0K(A12), A12, AbstractC171007jr.A00(C9CU.A00(C9CU.A00(null, num, A1Z ? 1 : 0, A0F), num2, A1Z ? 1 : 0, A0A3), f));
        }
        return AbstractC76963ci.A03(A12, c76223bS, A0E);
    }
}
