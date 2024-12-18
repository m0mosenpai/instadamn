package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.3z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89673z8 extends AbstractC51572Yf {
    public final C206249Bh A00;
    public final boolean A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C51722Yv c51722Yv2;
        C14360o3.A0B(c76223bS, 0);
        C206249Bh c206249Bh = this.A00;
        if (c206249Bh == null) {
            return null;
        }
        final C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new C9EG(this, 5));
        InterfaceC89793zL interfaceC89793zL = AbstractC51432Xq.A01;
        C89803zM c89803zM = new C89803zM(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        EnumC76913cd enumC76913cd = EnumC76913cd.LOCAL;
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "VIEW_ALL_COMMENTS_BUTTON_TEXT");
        A002.A03(AbstractC79463gt.A00);
        A002.A01(0.0f);
        A002.A03(AbstractC79463gt.A05);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        A002.A04(C89893zV.A00(context, 10));
        A002.A02 = c89803zM;
        AbstractC89903zW.A00(c76223bS, A002);
        AbstractC77313dH.A00(c76223bS, new C9F4(12, new C3QU() { // from class: X.478
            @Override // X.C3QU
            public final void DFc() {
            }

            @Override // X.C3QU
            public final void DFe(float f) {
            }

            @Override // X.C3QU
            public final void DFd() {
                C51762Yz.this.A01(true);
            }
        }, this), new Object[]{new Object()});
        if (!((Boolean) A00.A03).booleanValue()) {
            return null;
        }
        if (c206249Bh.A04) {
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = new C51722Yv(null, new C76933cf(c2xe, enumC76913cd, "VIEW_ALL_COMMENTS_BUTTON_TEXT"));
        } else {
            c51722Yv = null;
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A003 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A0u, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_right))), new C9CU(C05F.A1I, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material))), new C9CV(C05F.A01, "android.widget.Button", 0)), new C9CV(C05F.A0E, AbstractC77703du.A00(EnumC77673dr.A0V), 4)).A00(c51722Yv);
        if (this.A01) {
            c51722Yv2 = new C51722Yv(null, new C9CV(C05F.A0j, 4, 0));
        } else {
            c51722Yv2 = null;
        }
        C51722Yv A004 = A003.A00(c51722Yv2);
        C9CV c9cv = new C9CV(C05F.A1F, new C206849Dp(this, 22), 4);
        if (A004 == c75933ay2) {
            A004 = null;
        }
        C51722Yv c51722Yv3 = new C51722Yv(A004, c9cv);
        CharSequence charSequence = (CharSequence) c206249Bh.A03;
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_text_size_menu_header_material);
        int A02 = c76223bS.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_control_corner_material);
        Integer num = C05F.A0N;
        Typeface typeface = Typeface.DEFAULT;
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        Integer num2 = C05F.A00;
        C77723dw A03 = C51682Yq.A03(c2xe, 0);
        A03.A0W(charSequence);
        A03.A0V(null);
        A03.A0Q(A02);
        A03.A0R(C2Z3.A00(c76223bS.BoZ(), A0D));
        A03.A0S(0);
        A03.A0T(typeface);
        A03.A0P(-7829368);
        A03.A0K(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0I(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0J(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0H(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0X(num);
        A03.A0C();
        A03.A0Y(num2);
        A03.A0L(1.0f);
        A03.A0b(false);
        A03.A0N(0);
        A03.A0M(1);
        A03.A01.A00 = C2Z3.A00(c76223bS.BoZ(), A0D2);
        A03.A0c(false);
        A03.A0Z(false);
        A03.A0a(true);
        A03.A06(null);
        AbstractC77743dy.A00(A03, c51722Yv3);
        return A03.A0A();
    }

    public C89673z8(C206249Bh c206249Bh, boolean z) {
        this.A00 = c206249Bh;
        this.A01 = z;
    }
}
