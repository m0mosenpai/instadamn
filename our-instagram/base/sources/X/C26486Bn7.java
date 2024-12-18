package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bn7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26486Bn7 extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final float A01;
    public final int A02;
    public final C51722Yv A03;
    public final InterfaceC60442pS A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Drawable mutate;
        double d;
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C2XE c2xe = c76223bS.A05;
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        float A0l = AbstractC25232BEp.A0l(c76223bS, 30.0d);
        long A0K = AbstractC25230BEn.A0K();
        BYF byf = new BYF(A0E, A0l, AbstractC25228BEl.A07(c76223bS, A0K));
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, byf, 4));
        long doubleToRawLongBits = Double.doubleToRawLongBits(106.0d);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CU.A00(C9CU.A00(A0h, num2, A1Z ? 1 : 0, doubleToRawLongBits), num, A1Z ? 1 : 0, doubleToRawLongBits);
        long A0B = AbstractC25229BEm.A0B();
        C51722Yv A002 = AbstractC25230BEn.A0d(AbstractC25231BEo.A0Y(C9CU.A00(A00, C05F.A06, A1Z ? 1 : 0, A0B), new DRQ(this, 39)), C05F.A0Y, this.A01, 2).A00(this.A03);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C2XE c2xe2 = A0P.A00;
        Context context = c2xe2.A0C;
        Drawable drawable = context.getDrawable(R.drawable.instagram_add_pano_filled_24);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            if (this.A07) {
                d = 28.0d;
            } else {
                d = 24.0d;
            }
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(d);
            AbstractC166997dE.A1F(mutate, A0P.BoZ().A01(R.attr.igds_color_primary_text));
            AbstractC25234BEr.A0r(mutate, c2xe2, A0P, AbstractC25234BEr.A0E(C9CU.A00(null, num2, A1Z ? 1 : 0, doubleToRawLongBits2), AbstractC25225BEi.A0n(num, A1Z ? 1 : 0, doubleToRawLongBits2), A1Z ? 1 : 0, A0K));
        }
        String str = this.A05;
        if (str != null && !this.A07) {
            long A0r = AbstractC25232BEp.A0r(12.0f);
            int A05 = AbstractC25228BEl.A05(context, A0P);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str, A1Z ? 1 : 0);
            AbstractC25233BEq.A1B(A0P, A0a, A05, A0r);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
            AbstractC25234BEr.A1G(A0a, num, A1Z);
            A0a.A0M(1);
            A0a.A0c(true);
            AbstractC25232BEp.A1N(A0a, A1Z);
            AbstractC25227BEk.A1J(A0P, A0a);
        }
        List list = this.A06;
        if (AbstractC166987dD.A1b(list) && !this.A07) {
            int max = Math.max(A1Z ? 1 : 0, this.A02 - list.size());
            Context A003 = AbstractC77363dM.A00(A0P);
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(AbstractC25226BEj.A15(it).Bhu());
            }
            L9I l9i = new L9I(A003, this.A04.getModuleName(), A0i, AbstractC166987dD.A0C(AbstractC77363dM.A00(A0P), 20));
            l9i.A0B = true;
            l9i.A07 = num;
            l9i.A01(AbstractC166987dD.A0C(AbstractC77363dM.A00(A0P), 2));
            l9i.A0G = true;
            l9i.A02 = max;
            l9i.A0E = true;
            l9i.A05 = Integer.valueOf(AbstractC25228BEl.A05(context, A0P));
            l9i.A06 = 10;
            l9i.A0C = true;
            l9i.A01 = AbstractC166987dD.A0C(AbstractC77363dM.A00(A0P), 20);
            l9i.A04 = Integer.valueOf(A0P.BoZ().A02(R.color.context_line_color));
            AbstractC25234BEr.A0r(l9i.A00(), c2xe2, A0P, C9CU.A00(null, C05F.A08, A1Z ? 1 : 0, A0B));
        }
        return AbstractC76963ci.A05(A0P, c76223bS, A002);
    }

    public C26486Bn7(C51722Yv c51722Yv, InterfaceC60442pS interfaceC60442pS, String str, List list, InterfaceC16820sZ interfaceC16820sZ, float f, int i, boolean z) {
        AbstractC167017dG.A1U(interfaceC60442pS, interfaceC16820sZ);
        this.A07 = z;
        this.A01 = f;
        this.A05 = str;
        this.A06 = list;
        this.A02 = i;
        this.A04 = interfaceC60442pS;
        this.A00 = interfaceC16820sZ;
        this.A03 = c51722Yv;
    }
}
