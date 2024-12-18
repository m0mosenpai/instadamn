package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BoC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26553BoC extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C167297di A01;
    public final Jn5 A02;
    public final boolean A03;
    public final boolean A04;

    public C26553BoC(C167297di c167297di, Jn5 jn5, boolean z, boolean z2) {
        C14360o3.A0B(jn5, 4);
        this.A01 = c167297di;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = jn5;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0e = AbstractC25233BEq.A0e(C05F.A00, 100.0f, 0);
        long A0E = AbstractC25229BEm.A0E();
        long A0M = AbstractC25230BEn.A0M();
        this.A00 = AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(A0e, AbstractC25227BEk.A0b(A0E), 0, A0M), AbstractC25225BEi.A0n(C05F.A1F, 0, AbstractC25229BEm.A0F()), 0, AbstractC25229BEm.A0J());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r9) {
        /*
            r8 = this;
            r7 = 0
            X.C14360o3.A0B(r9, r7)
            X.7di r6 = r8.A01
            X.7h4 r3 = r6.A02
            if (r3 == 0) goto L7d
            X.2XE r0 = r9.ArD()
            r5 = 0
            X.2Z0 r4 = X.AbstractC167007dF.A0P(r0)
            java.lang.Integer r2 = r3.A03
            r1 = 1
            boolean r0 = r3.A0A
            if (r0 != r1) goto L39
            r0 = 2131954272(0x7f130a60, float:1.9545039E38)
            java.lang.String r1 = X.AbstractC77623dm.A0F(r4, r0)
            X.2Yv r2 = r8.A00
            java.lang.Integer r0 = X.C05F.A00
        L25:
            X.2Yq r0 = A03(r4, r2, r1, r0)
            r4.A00(r0)
            r1 = 0
            java.util.List r6 = r4.A01
            X.2WH r0 = new X.2WH
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L39:
            java.lang.Integer r0 = X.C05F.A00
            if (r2 == r0) goto L71
            java.lang.Integer r0 = X.C05F.A01
            if (r2 == r0) goto L71
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L60
            X.2Yv r3 = r8.A00
            r0 = 17
        L49:
            X.MM0 r2 = new X.MM0
            r2.<init>(r8, r0)
        L4e:
            java.lang.Integer r0 = X.C05F.A1F
            X.9CV r2 = X.AbstractC25228BEl.A0o(r0, r2)
            X.3ay r0 = X.C51722Yv.A02
            if (r3 == r0) goto L59
            r5 = r3
        L59:
            X.2Yv r2 = X.AbstractC25225BEi.A0h(r5, r2)
            java.lang.Integer r0 = X.C05F.A0C
            goto L25
        L60:
            r0 = 2131954273(0x7f130a61, float:1.954504E38)
            java.lang.String r1 = X.AbstractC77623dm.A0F(r4, r0)
            X.2Yv r3 = r8.A00
            r0 = 27
            X.MLx r2 = new X.MLx
            r2.<init>(r0, r6, r8)
            goto L4e
        L71:
            r0 = 2131954271(0x7f130a5f, float:1.9545037E38)
            java.lang.String r1 = X.AbstractC77623dm.A0F(r4, r0)
            X.2Yv r3 = r8.A00
            r0 = 16
            goto L49
        L7d:
            java.lang.Integer r0 = r6.A0H
            java.lang.Integer r5 = X.C05F.A01
            if (r0 != r5) goto L91
            r0 = 2131954274(0x7f130a62, float:1.9545043E38)
            java.lang.String r3 = X.AbstractC77623dm.A0F(r9, r0)
            X.2Yv r0 = r8.A00
        L8c:
            X.2Yq r0 = A03(r9, r0, r3, r5)
            return r0
        L91:
            boolean r0 = r8.A04
            r4 = 0
            if (r0 == 0) goto Lc4
            X.7fk r1 = r6.A05
            X.7fk r0 = X.EnumC168507fk.A02
            if (r1 == r0) goto La4
            boolean r0 = r8.A03
            if (r0 == 0) goto Lc4
            X.7fk r0 = X.EnumC168507fk.A03
            if (r1 != r0) goto Lc4
        La4:
            r0 = 2131954281(0x7f130a69, float:1.9545057E38)
            java.lang.String r3 = X.AbstractC77623dm.A0F(r9, r0)
            X.2Yv r2 = r8.A00
            r0 = 18
            X.MM0 r1 = new X.MM0
            r1.<init>(r8, r0)
            java.lang.Integer r0 = X.C05F.A1F
            X.9CV r1 = X.AbstractC25228BEl.A0o(r0, r1)
            X.3ay r0 = X.C51722Yv.A02
            if (r2 == r0) goto Lbf
            r4 = r2
        Lbf:
            X.2Yv r0 = X.AbstractC25225BEi.A0h(r4, r1)
            goto L8c
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26553BoC.A0Y(X.3bS):X.2Vc");
    }

    public static final C51682Yq A03(C2Z1 c2z1, C51722Yv c51722Yv, CharSequence charSequence, Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                i = AbstractC53242c7.A03(AbstractC77363dM.A00(c2z1));
            } else {
                i = R.color.igds_secondary_text;
            }
        } else {
            i = R.color.igds_primary_text;
        }
        int A09 = AbstractC25228BEl.A09(c2z1, i);
        long A092 = AbstractC77623dm.A09(c2z1);
        Typeface A0R = AbstractC167017dG.A0R(AbstractC77363dM.A00(c2z1));
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A03 = C51682Yq.A03(c2z1.ArD(), 0);
        A03.A0W(charSequence);
        A03.A0V(null);
        A03.A0Q(A09);
        AbstractC25230BEn.A1K(A03, c2z1.BoZ(), 0, A092);
        A03.A0T(A0R);
        A03.A0F();
        AbstractC25234BEr.A18(A03, c2z1, AbstractC25228BEl.A0A(c2z1, A0D), A0D);
        A03.A0H(AbstractC25228BEl.A0A(c2z1, A0D));
        A03.A0X(num2);
        AbstractC25234BEr.A1H(A03, num2, false);
        A03.A0M(1);
        AbstractC25234BEr.A17(c51722Yv, A03, false);
        return A03.A0A();
    }
}
