package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.BkO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26317BkO extends AbstractC51572Yf {
    public final InterfaceC88183wS A00;
    public final C47444KxZ A01;

    public C26317BkO(InterfaceC88183wS interfaceC88183wS, C47444KxZ c47444KxZ) {
        C14360o3.A0B(c47444KxZ, 2);
        this.A00 = interfaceC88183wS;
        this.A01 = c47444KxZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC39593He3 A01;
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A00 = C9CU.A00(null, C05F.A06, A1Z ? 1 : 0, AbstractC25229BEm.A0F());
        C50355MLh c50355MLh = new C50355MLh(this, 11);
        Integer num = C05F.A1F;
        C51722Yv A16 = AbstractC25232BEp.A16(A00, num, c50355MLh);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        InterfaceC88183wS interfaceC88183wS = this.A00;
        if (interfaceC88183wS.BwU() && (A01 = IQd.A01(interfaceC88183wS.getId())) != null) {
            int i = A01.A00;
            C2XE c2xe = A12.A00;
            Context context = c2xe.A0C;
            Drawable drawable = context.getResources().getDrawable(i, null);
            if (drawable != null) {
                boolean A0K = C14360o3.A0K(interfaceC88183wS.C39(), "destructive");
                int i2 = R.attr.igds_color_primary_icon;
                if (A0K) {
                    i2 = R.attr.igds_color_error_or_destructive;
                }
                AbstractC25231BEo.A0y(drawable, A12, AbstractC53242c7.A0H(context, i2));
                AbstractC25234BEr.A0r(drawable, c2xe, A12, AbstractC25233BEq.A0Z(null, num, 12.0d, A1Z ? 1 : 0));
            }
        }
        String text = interfaceC88183wS.getText();
        long A0r = AbstractC25232BEp.A0r(16.0f);
        C2XE c2xe2 = A12.A00;
        Context A0E = AbstractC25225BEi.A0E(c2xe2);
        boolean A0K2 = C14360o3.A0K(interfaceC88183wS.C39(), "destructive");
        int i3 = R.attr.igds_color_primary_icon;
        if (A0K2) {
            i3 = R.attr.igds_color_error_or_destructive;
        }
        int A06 = AbstractC25228BEl.A06(A0E, A12, i3);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, text, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A12, A0a, A06, A0r);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        A0a.A0X(num2);
        A0a.A0C();
        A0a.A0Y(num2);
        AbstractC25230BEn.A1J(A0a, 1.25f, A1Z);
        A0a.A0E();
        A0a.A0c(true);
        AbstractC25232BEp.A1N(A0a, A1Z);
        AbstractC25227BEk.A1J(A12, A0a);
        return AbstractC76963ci.A0I(A12, c76223bS, A16);
    }
}
