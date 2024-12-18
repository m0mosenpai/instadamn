package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.BnW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26511BnW extends AbstractC51572Yf {
    public final C87 A00;
    public final C87 A01;
    public final Integer A02;
    public final int A03 = 1;
    public final int A04;
    public final C51722Yv A05;
    public final Integer A06;
    public final String A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;

    public C26511BnW(C51722Yv c51722Yv, C87 c87, C87 c872, Integer num, Integer num2, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        this.A00 = c87;
        this.A07 = str;
        this.A06 = num;
        this.A02 = num2;
        this.A04 = i;
        this.A09 = z;
        this.A08 = interfaceC16820sZ;
        this.A01 = c872;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        GradientDrawable gradientDrawable;
        C14360o3.A0B(c76223bS, 0);
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, new D8K(13, c76223bS, this), new Object[]{this.A00, this.A02, this.A01});
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            int i = this.A04;
            int i2 = this.A03;
            gradientDrawable = AbstractC25228BEl.A0O(0);
            gradientDrawable.setColor(intValue);
            gradientDrawable.setStroke(AbstractC25232BEp.A0l(c76223bS, i2), 0);
            gradientDrawable.setCornerRadius(AbstractC25232BEp.A0l(c76223bS, i));
        } else {
            gradientDrawable = null;
        }
        boolean z = this.A09;
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CV.A00(C9CU.A00(null, C05F.A1F, 2, AbstractC25229BEm.A0E()), C05F.A0F, Boolean.valueOf(z), 4);
        String str = this.A07;
        if (str != null) {
            A002 = C9CV.A00(A002, C05F.A0N, str, 0);
        }
        Integer num2 = C05F.A00;
        C51722Yv A003 = C9CV.A00(A002, num2, gradientDrawable, 4);
        Integer num3 = C05F.A01;
        C51722Yv A004 = AbstractC171007jr.A00(C9CV.A00(A003, num3, "android.widget.Button", 0), f);
        InterfaceC16820sZ interfaceC16820sZ = this.A08;
        if (interfaceC16820sZ != null && z) {
            C2WH A0l = AbstractC25226BEj.A0l(new C26611Bp8(A00, ImageView.ScaleType.CENTER_CROP, null, 0, false), AbstractC167007dF.A0P(c76223bS.ArD()), c76223bS, A004);
            C29472Cym c29472Cym = new C29472Cym(num2, C05F.A0C, num3);
            C51722Yv c51722Yv = this.A05;
            if (c51722Yv == null) {
                c51722Yv = c75933ay;
            }
            return new C26555BoE(A0l, c51722Yv, c29472Cym, interfaceC16820sZ, null);
        }
        return AbstractC25226BEj.A0l(new C26611Bp8(A00, ImageView.ScaleType.CENTER_CROP, null, 0, false), AbstractC167007dF.A0P(c76223bS.ArD()), c76223bS, A004.A00(this.A05));
    }
}
