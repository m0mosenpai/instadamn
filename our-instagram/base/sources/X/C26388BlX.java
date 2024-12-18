package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.BlX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26388BlX extends AbstractC51572Yf {
    public final C167297di A00;
    public final L5U A01;
    public final C27936CSv A02;
    public final InterfaceC60442pS A03;

    public C26388BlX(C167297di c167297di, L5U l5u, C27936CSv c27936CSv, InterfaceC60442pS interfaceC60442pS) {
        AbstractC25233BEq.A0w(2, l5u, c27936CSv, interfaceC60442pS);
        this.A00 = c167297di;
        this.A01 = l5u;
        this.A02 = c27936CSv;
        this.A03 = interfaceC60442pS;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C27936CSv c27936CSv = this.A02;
        gradientDrawable.setColor(c27936CSv.A02);
        gradientDrawable.setCornerRadius(AbstractC25232BEp.A0l(c76223bS, 64.0d));
        gradientDrawable.setStroke(AbstractC25232BEp.A0l(c76223bS, 2.0d), c27936CSv.A03);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(C05F.A0D, AbstractC43591JPw.A00(1268), 4));
        long A0K = AbstractC25230BEn.A0K();
        long doubleToRawLongBits = Double.doubleToRawLongBits(-8.0d);
        Integer num = C05F.A07;
        C51722Yv A0R = AbstractC25233BEq.A0R(AbstractC25234BEr.A0G(A0h, AbstractC25225BEi.A0n(num, 0, A0K), 0, doubleToRawLongBits), AbstractC25227BEk.A0Y(0, AbstractC25229BEm.A0J()), 0, AbstractC25229BEm.A0B());
        Integer num2 = C05F.A00;
        C51722Yv A00 = C9CV.A00(C9CV.A00(A0R, num2, gradientDrawable, 4), C05F.A0N, EnumC77763e0.END, 3);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C51722Yv A002 = C9CV.A00(A00, num2, enumC77683ds, 3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        int A05 = AbstractC25228BEl.A05(context, A12);
        long A09 = AbstractC77623dm.A09(A12);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, "❤️", 0);
        AbstractC25233BEq.A1B(A12, A0a, A05, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num2, false);
        A0a.A0E();
        A0a.A0c(false);
        A0a.A0Z(false);
        A0a.A0a(true);
        A0a.A06(null);
        AbstractC25227BEk.A1J(A12, A0a);
        C167297di c167297di = this.A00;
        if (c167297di.A0T) {
            A12.A00(new C77973eP(AbstractC25233BEq.A0V(AbstractC25234BEr.A0L(null, num2, 0, AbstractC25230BEn.A0H()), AbstractC25225BEi.A0n(num, 0, A0K), num2, enumC77683ds, 3), this.A03, AbstractC25225BEi.A0t(this.A01.A04), null, A12.BoZ().A02(AbstractC53242c7.A04(context)), 0, -16777216, false, true, false));
        }
        String valueOf = String.valueOf(c167297di.A0G);
        int A052 = AbstractC25228BEl.A05(context, A12);
        long A092 = AbstractC77623dm.A09(A12);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        C51722Yv A0V = AbstractC25233BEq.A0V(null, AbstractC25225BEi.A0n(num, 0, A0K), num2, enumC77683ds, 3);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, valueOf, 0);
        AbstractC25233BEq.A1B(A12, A0a2, A052, A092);
        A0a2.A0S(0);
        AbstractC25234BEr.A0o(create, A12, A0a2, A0D);
        AbstractC25234BEr.A1I(A0a2, num2, false);
        A0a2.A0E();
        AbstractC25229BEm.A1E(A0a2);
        AbstractC25233BEq.A1A(A12, A0V, A0a2);
        return AbstractC76963ci.A0I(A12, c76223bS, A002);
    }
}
