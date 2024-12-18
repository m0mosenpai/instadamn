package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Bkf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26334Bkf extends AbstractC51572Yf {
    public final int A00;
    public final Integer A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC25700BXk enumC25700BXk;
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        InterfaceC31128DmB A002 = C28351CfB.A00(A00);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                enumC25700BXk = EnumC25700BXk.CIRCLE;
            } else {
                throw B4Z.A00();
            }
        } else {
            enumC25700BXk = EnumC25700BXk.RECTANGLE;
        }
        int A003 = AbstractC28406CgC.A00(c76223bS, C88.A0D);
        C09530e4 A1L = AbstractC166987dD.A1L(EnumC27373C6c.A03, EnumC27373C6c.A02);
        long A02 = AbstractC28406CgC.A02(c76223bS, C05F.A0Q);
        long A022 = AbstractC28406CgC.A02(c76223bS, C05F.A0R);
        Drawable A004 = AbstractC27723CKq.A00(c76223bS, new C29726D8w(A00, c76223bS, enumC25700BXk, A002, this, A1L, A003, A02), new Object[]{A00, A002, enumC25700BXk, Integer.valueOf(this.A00), Integer.valueOf(A003), AbstractC25225BEi.A0p(A02), A1L.A00, A1L.A01});
        C51722Yv c51722Yv = C51722Yv.A02;
        return new C26611Bp8(A004, ImageView.ScaleType.CENTER_CROP, c51722Yv.A00(c51722Yv).A00(c51722Yv).A00(C9CU.A00(null, C05F.A01, 0, A022)).A00(c51722Yv), 0, false);
    }

    public C26334Bkf(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
