package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Bkz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26354Bkz extends AbstractC51572Yf {
    public final InterfaceC84443pn A00;
    public final C47444KxZ A01;
    public final UserSession A02;

    public C26354Bkz(InterfaceC84443pn interfaceC84443pn, UserSession userSession, C47444KxZ c47444KxZ) {
        AbstractC167007dF.A1F(userSession, 2, c47444KxZ);
        this.A02 = userSession;
        this.A00 = interfaceC84443pn;
        this.A01 = c47444KxZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        InterfaceC84443pn interfaceC84443pn = this.A00;
        String AqK = interfaceC84443pn.AqK();
        long floatToRawIntBits = Float.floatToRawIntBits(16.0f) | 9221683186994511872L;
        Context context = c2xe.A0C;
        int A07 = AbstractC53242c7.A07(context);
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        int A02 = c2xh.A02(A07);
        C75933ay c75933ay = C51722Yv.A02;
        long A0L = AbstractC25230BEn.A0L();
        Integer num = C05F.A08;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0L);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0g = AbstractC25233BEq.A0g(c2xe, AqK, A02);
        AbstractC25230BEn.A1K(A0g, c2xh, 1, floatToRawIntBits);
        AbstractC25234BEr.A0p(typeface, A0g, c2xh, A0D);
        AbstractC25234BEr.A1J(A0g, num2, false, true);
        A1E.add(AbstractC25227BEk.A0X(A00, A0g));
        String AqH = interfaceC84443pn.AqH();
        long A0J = AbstractC25231BEo.A0J();
        int A022 = c2xh.A02(AbstractC53242c7.A09(context));
        long A0F = AbstractC25229BEm.A0F();
        C51722Yv A002 = C9CU.A00(null, num, 0, A0F);
        Integer num3 = C05F.A04;
        C51722Yv A003 = C9CU.A00(A002, num3, 0, A0F);
        C77723dw A0g2 = AbstractC25233BEq.A0g(c2xe, AqH, A022);
        AbstractC25230BEn.A1K(A0g2, c2xh, 0, A0J);
        AbstractC25234BEr.A0p(typeface, A0g2, c2xh, A0D);
        AbstractC25234BEr.A1J(A0g2, num2, false, true);
        A1E.add(AbstractC25227BEk.A0X(A003, A0g2));
        C2XF c2xf = c2xh.A02;
        CharSequence charSequence = (CharSequence) ((C2XG) c2xf).A00.A02(2131976066);
        if (charSequence == null) {
            charSequence = c2xh.A01.getText(2131976066);
            C14360o3.A07(charSequence);
            c2xf.A00(2131976066, charSequence);
        }
        int A023 = c2xh.A02(AbstractC53242c7.A07(context));
        C51722Yv A0F2 = AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(num3, 0, A0F), 0, A0L);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num4 = C05F.A0Y;
        C51722Yv A004 = C9CU.A00(C9CU.A00(AbstractC25232BEp.A15(A0F2, num4, enumC77933eL), C05F.A0N, 1, A0D), num4, 1, A0D);
        Integer num5 = C05F.A01;
        C51722Yv A0d = AbstractC25233BEq.A0d(C9CV.A00(A004, num5, "android.widget.Button", 0), new C50355MLh(this, 10));
        C77723dw A0g3 = AbstractC25233BEq.A0g(c2xe, charSequence, A023);
        AbstractC25230BEn.A1K(A0g3, c2xh, 0, floatToRawIntBits);
        A0g3.A0T(typeface);
        AbstractC25234BEr.A19(A0g3, c2xh, num2, A0D);
        A0g3.A0b(false);
        A0g3.A0N(0);
        A0g3.A0E();
        AbstractC25233BEq.A1D(A0d, A0g3, false);
        A1E.add(A0g3.A0A());
        C51722Yv A005 = C9CU.A00(AbstractC25233BEq.A0b(C9CU.A00(null, num5, 0, 9221401712017801217L), num2, 0), num, 0, A0F);
        int A024 = c2xh.A02(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_separator));
        C26280Bjn A03 = C26658Bpt.A03(c2xe);
        A03.A0B(A024);
        AbstractC77743dy.A00(A03, A005);
        A1E.add(A03.A0A());
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168887gN c168887gN = new C168887gN();
        List<InterfaceC88183wS> B7a = interfaceC84443pn.B7a();
        if (B7a != null) {
            for (InterfaceC88183wS interfaceC88183wS : B7a) {
                c168887gN.A00(new C26317BkO(interfaceC88183wS, this.A01), interfaceC88183wS.getId(), -1.0f, -1.0f, false);
            }
        }
        A1E.add(new C168977gW(c3f1, null, null, null, null, null, AbstractC168947gT.A00(c2xe, c2vf, C2Z3.A00(c2xh, A0D), z), c168887gN, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false));
        return new C2WF(null, null, null, A1E, false);
    }
}
