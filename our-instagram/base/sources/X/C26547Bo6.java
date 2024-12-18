package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.Bo6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26547Bo6 extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final boolean A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        int i = 0;
        C14360o3.A0B(c76223bS, 0);
        int A00 = AbstractC28406CgC.A00(c76223bS, C88.A0B);
        Object A002 = AbstractC77183d4.A00(c76223bS, C29890DGe.A00(c76223bS, 44), new Object[0]);
        C75933ay c75933ay = C51722Yv.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(250.0d);
        Integer num = C05F.A0N;
        C93E c93e = null;
        C51722Yv A003 = C9CU.A00(null, num, 0, doubleToRawLongBits);
        long A0F = AbstractC25229BEm.A0F();
        long A0N = AbstractC25230BEn.A0N();
        Integer num2 = C05F.A04;
        C51722Yv A004 = C9CU.A00(A003, num2, 0, A0N);
        Integer num3 = C05F.A05;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(A004, num3, 0, A0F), C05F.A0C, 0.0f, 1);
        C51722Yv A0c = AbstractC25233BEq.A0c(C9CV.A00(null, num3, A002, 4), num, true);
        GradientDrawable A0O = AbstractC25228BEl.A0O(0);
        A0O.setCornerRadius(12.0f);
        A0O.setColor(A00);
        A0O.setStroke(AbstractC25232BEp.A0l(c76223bS, 1.0d), 0);
        Integer num4 = C05F.A00;
        C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(C9CV.A00(A0c, num4, A0O, 4), C05F.A0G, 0, AbstractC25229BEm.A0J()), num4, EnumC77683ds.FLEX_START);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        boolean z = this.A02;
        if (!z) {
            str = AbstractC77623dm.A0F(A12, 2131966549);
        } else {
            str = null;
            A12.A00(new C26567BoQ(C9CU.A00(C9CU.A00(null, num2, 0, A0N), num3, 0, A0F), c93e, C88.A0i, AbstractC77623dm.A0F(A12, 2131966549), C05F.A1F, i, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
        }
        A12.A00(new C26457Bme(A03(A12, C87.A0M, AbstractC77623dm.A0F(A12, 2131966552)), null, A0d, AbstractC77623dm.A0F(A12, 2131966550), str, C29890DGe.A00(this, 42)));
        if (z) {
            A12.A00(new C26457Bme(A03(A12, C87.A0e, AbstractC77623dm.A0F(A12, 2131966449)), null, A0d, AbstractC77623dm.A0F(A12, 2131966551), null, C29890DGe.A00(this, 43)));
        }
        return AbstractC76963ci.A03(A12, c76223bS, A15);
    }

    public static final C26511BnW A03(C2Z1 c2z1, C87 c87, String str) {
        int A00 = AbstractC28406CgC.A00(c2z1, C88.A0X);
        C75933ay c75933ay = C51722Yv.A02;
        return new C26511BnW(AbstractC25234BEr.A0L(null, C05F.A00, 0, AbstractC25230BEn.A0J()), c87, null, null, Integer.valueOf(A00), str, null, 12, true);
    }

    public C26547Bo6(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A02 = z;
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }
}
