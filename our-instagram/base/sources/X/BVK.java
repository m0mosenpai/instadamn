package X;

import android.graphics.Typeface;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BVK extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C51722Yv A04;
    public final InterfaceC16820sZ A05;
    public final C0UO A06;

    public /* synthetic */ BVK(C51722Yv c51722Yv, InterfaceC16820sZ interfaceC16820sZ, C0UO c0uo, int i, int i2, int i3, int i4) {
        c51722Yv = (i4 & 16) != 0 ? null : c51722Yv;
        int i5 = (i4 & 64) != 0 ? R.dimen.abc_text_size_menu_header_material : 0;
        i3 = (i4 & 128) != 0 ? R.dimen.account_discovery_bottom_gap : i3;
        C14360o3.A0B(c0uo, 1);
        this.A06 = c0uo;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = c51722Yv;
        this.A02 = i5;
        this.A03 = i3;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29891DGf.A00(this, 5));
        C0UO c0uo = this.A06;
        AbstractC18560vj.A03(AnonymousClass194.A01(), new C15340po(new C57153PYx(A00, this, (InterfaceC23621Ds) null, 21), c0uo));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A002 = C9CV.A00(null, num, "android.widget.Button", 0);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.appreciation_reels_grid_item_width);
        Integer num2 = C05F.A0C;
        C51722Yv A003 = AbstractC25233BEq.A0c(C9CV.A00(AbstractC25233BEq.A0R(C9CU.A00(C9CU.A00(A002, num2, 0, A0D), C05F.A0E, 0, AbstractC77623dm.A06(c76223bS)), AbstractC25227BEk.A0Y(0, AbstractC77623dm.A04(c76223bS)), 0, AbstractC77623dm.A0D(c76223bS, this.A03)), C05F.A00, AbstractC77623dm.A0E(c76223bS, this.A00), 4), num, true).A00(this.A04);
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A1F, C30180DRl.A00(this, 25), 4);
        if (A003 == c75933ay) {
            A003 = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(A003, A0o);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int A03 = AbstractC77623dm.A03(A12, this.A01);
        long A0D2 = AbstractC77623dm.A0D(A12, this.A02);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        String str = (String) c0uo.getValue();
        long A0D3 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A03, A0D2);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(create, A12, A0a, A0D3);
        A0a.A0X(num2);
        AbstractC25234BEr.A1B(A0a, num);
        A0a.A0M(1);
        AbstractC25234BEr.A15(A12, A0a, false);
        return AbstractC76963ci.A0F(A12, c76223bS, A0h);
    }
}
