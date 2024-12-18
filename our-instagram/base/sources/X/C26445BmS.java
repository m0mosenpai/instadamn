package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BmS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26445BmS extends AbstractC51572Yf {
    public final String A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final int A04;
    public final int A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        long A05 = AbstractC77623dm.A05(c76223bS);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        Integer num = C05F.A00;
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num);
        int i = this.A05;
        String str = this.A00;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, i, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A0Q, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        C51682Yq A0A = A0a.A0A();
        C75933ay c75933ay = C51722Yv.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(36.0d);
        Integer num2 = C05F.A01;
        return AbstractC76963ci.A0G(AbstractC25232BEp.A11(A0A, c2xe), c76223bS, AbstractC25230BEn.A0e(AbstractC25233BEq.A0c(AbstractC25231BEo.A0Y(C9CV.A00(AbstractC25234BEr.A0H(C9CV.A00(AbstractC25233BEq.A0R(C9CU.A00(null, num2, 0, doubleToRawLongBits), AbstractC25227BEk.A0Y(0, AbstractC25229BEm.A0J()), 0, AbstractC25230BEn.A0M()), num2, "android.widget.Button", 0), AbstractC25225BEi.A0m(C05F.A0C, 0.0f, 1), num), num, AbstractC77623dm.A0E(c76223bS, this.A04), 4), C30185DRq.A02(this, 7)), num2, true), C05F.A0Y, new C50369MLw(40, this, c76223bS), null));
    }

    public C26445BmS(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        C14360o3.A0B(interfaceC16660sJ2, 7);
        this.A00 = str;
        this.A05 = i;
        this.A04 = R.drawable.quick_replies_base_component;
        this.A01 = interfaceC16820sZ;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
    }
}
