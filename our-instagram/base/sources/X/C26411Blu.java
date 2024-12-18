package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.Blu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26411Blu extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final int A01 = R.drawable.rounded_white_button;
    public final int A02;
    public final String A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, "android.widget.Button", 0));
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.appreciation_reels_grid_item_width);
        Integer num2 = C05F.A0C;
        C51722Yv A00 = AbstractC25233BEq.A0c(C9CV.A00(AbstractC25233BEq.A0R(C9CU.A00(C9CU.A00(A0h, num2, 0, A0D), C05F.A0E, 0, AbstractC77623dm.A06(c76223bS)), AbstractC25227BEk.A0Y(0, AbstractC77623dm.A04(c76223bS)), 0, AbstractC77623dm.A07(c76223bS)), C05F.A00, AbstractC77623dm.A0E(c76223bS, this.A01), 4), num, true).A00(null);
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A1F, DRT.A00(this, 3), 4);
        if (A00 == c75933ay) {
            A00 = null;
        }
        C51722Yv A0h2 = AbstractC25225BEi.A0h(A00, A0o);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int A03 = AbstractC77623dm.A03(A12, this.A02);
        long A05 = AbstractC77623dm.A05(A12);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        String str = this.A03;
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A03, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(create, A12, A0a, A0D2);
        A0a.A0X(num2);
        AbstractC25234BEr.A1B(A0a, num);
        A0a.A0M(1);
        AbstractC25234BEr.A15(A12, A0a, false);
        return AbstractC76963ci.A0F(A12, c76223bS, A0h2);
    }

    public C26411Blu(InterfaceC16820sZ interfaceC16820sZ, String str, int i) {
        this.A03 = str;
        this.A02 = i;
        this.A00 = interfaceC16820sZ;
    }
}
