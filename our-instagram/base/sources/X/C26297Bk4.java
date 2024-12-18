package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bk4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26297Bk4 extends AbstractC51572Yf {
    public final Jn5 A00;

    public C26297Bk4(Jn5 jn5) {
        C14360o3.A0B(jn5, 1);
        this.A00 = jn5;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long doubleToRawLongBits = Double.doubleToRawLongBits(56.0d);
        long A0J = AbstractC25230BEn.A0J();
        long A0B = AbstractC25229BEm.A0B();
        C51722Yv A00 = C9CU.A00(null, C05F.A05, A1Z ? 1 : 0, A0B);
        Integer num = C05F.A0u;
        C51722Yv A002 = C9CU.A00(A00, num, A1Z ? 1 : 0, doubleToRawLongBits);
        Integer num2 = C05F.A1F;
        C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(A002, num2, A1Z ? 1 : 0, A0J), num2, new MM0(this, 20));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Integer num3 = C05F.A00;
        C51722Yv A0b = AbstractC25233BEq.A0b(null, num3, A1Z ? 1 : 0);
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        Drawable A0E = AbstractC77623dm.A0E(A0K, R.drawable.instagram_eye_off_pano_outline_24);
        C2XE c2xe = A0K.A00;
        Context context = c2xe.A0C;
        A0E.setTint(AbstractC25229BEm.A07(context, A0K));
        boolean A1a = AbstractC25233BEq.A1a(A0K, AbstractC25233BEq.A0Z(AbstractC25234BEr.A0L(null, num3, A1Z ? 1 : 0, AbstractC25229BEm.A0F()), num2, 4.0d, A1Z ? 1 : 0), AbstractC25231BEo.A0Z(A0E, c2xe));
        String A0F = AbstractC77623dm.A0F(A0K, 2131954282);
        long A0r = AbstractC25232BEp.A0r(12.0f);
        int A07 = AbstractC25229BEm.A07(context, A0K);
        Typeface create = Typeface.create("sans-serif-medium", A1Z ? 1 : 0);
        Integer num4 = C05F.A0N;
        C51722Yv A003 = C9CU.A00(C9CU.A00(null, num, A1Z ? 1 : 0, A0B), num2, A1Z ? 1 : 0, Double.doubleToRawLongBits(18.0d));
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A0K, A0a, A07, A0r);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(create, A0K, A0a, A0D);
        A0a.A0X(num4);
        AbstractC25234BEr.A1J(A0a, num3, A1Z, A1a);
        AbstractC25231BEo.A1A(AbstractC25227BEk.A0X(A003, A0a), A0K, A12, A0b);
        return AbstractC76963ci.A03(A12, c76223bS, A16);
    }
}
