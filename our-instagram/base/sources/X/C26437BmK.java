package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BmK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26437BmK extends AbstractC51572Yf {
    public final int A00;
    public final int A01 = R.dimen.abc_text_size_menu_header_material;
    public final C51722Yv A02;
    public final String A03;
    public final InterfaceC16820sZ A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.appreciation_reels_grid_item_width);
        Integer num = C05F.A0C;
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, num, 0, A0D), C05F.A0E, 0, AbstractC77623dm.A06(c76223bS));
        Integer num2 = C05F.A01;
        C51722Yv A002 = C9CV.A00(A00, num2, true, 4).A00(this.A02);
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A1F, DRT.A00(this, 2), 4);
        if (A002 == c75933ay) {
            A002 = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(A002, A0o);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int A03 = AbstractC77623dm.A03(A12, R.color.grey_9);
        float A0m = AbstractC25232BEp.A0m(A12, 28.0d);
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num2, 100.0f, 0);
        Integer num3 = C05F.A00;
        C51722Yv A0I = AbstractC25234BEr.A0I(AbstractC25230BEn.A0d(A0d, num3, 100.0f, 0), AbstractC25225BEi.A0o(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num3, 3);
        String str = this.A03;
        if (str != null) {
            A0I = C9CV.A00(A0I, C05F.A0N, str, 0);
        }
        A12.A00(new C26629BpQ(C9CV.A00(A0I, num2, "android.widget.Button", 0), A0m, A03));
        int A02 = A12.BoZ().A02(this.A00);
        long A0D2 = AbstractC77623dm.A0D(A12, this.A01);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A0D3 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A02, A0D2);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(create, A12, A0a, A0D3);
        A0a.A0X(num);
        AbstractC25234BEr.A1B(A0a, num2);
        A0a.A0M(1);
        AbstractC25234BEr.A15(A12, A0a, false);
        return AbstractC76963ci.A0F(A12, c76223bS, A0h);
    }

    public /* synthetic */ C26437BmK(C51722Yv c51722Yv, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A02 = c51722Yv;
        this.A04 = interfaceC16820sZ;
    }
}
