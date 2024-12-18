package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;

/* renamed from: X.3zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89693zA extends AbstractC51572Yf {
    public final C9C3 A00;
    public final UserSession A01;
    public final ImageUrl A02;
    public final InterfaceC60442pS A03;
    public final boolean A04;

    public C89693zA(C9C3 c9c3, UserSession userSession, ImageUrl imageUrl, InterfaceC60442pS interfaceC60442pS, boolean z) {
        C14360o3.A0B(interfaceC60442pS, 1);
        C14360o3.A0B(userSession, 5);
        this.A03 = interfaceC60442pS;
        this.A02 = imageUrl;
        this.A00 = c9c3;
        this.A04 = z;
        this.A01 = userSession;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        long A0D;
        C14360o3.A0B(c76223bS, 0);
        final C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C89763zI.A00);
        InterfaceC89793zL interfaceC89793zL = AbstractC51432Xq.A01;
        C89803zM c89803zM = new C89803zM(100);
        EnumC76913cd enumC76913cd = EnumC76913cd.LOCAL;
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "COMPOSER_BUTTON_AVATAR");
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A00;
        A002.A03(interfaceC79483gv);
        A002.A01(0.0f);
        InterfaceC79483gv interfaceC79483gv2 = AbstractC79463gt.A05;
        A002.A03(interfaceC79483gv2);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        A002.A04(C89893zV.A00(context, 10));
        A002.A02 = c89803zM;
        C89813zN A003 = AbstractC51432Xq.A00(enumC76913cd, "COMPOSER_BUTTON_TEXT");
        A003.A03(interfaceC79483gv);
        A003.A01(0.0f);
        A003.A03(interfaceC79483gv2);
        A003.A04(C89893zV.A00(context, 10));
        A003.A02 = c89803zM;
        AbstractC89903zW.A00(c76223bS, new C51472Xu(A002, A003));
        AbstractC77313dH.A00(c76223bS, new C9F4(11, new C3QU() { // from class: X.3zY
            @Override // X.C3QU
            public final void DFc() {
            }

            @Override // X.C3QU
            public final void DFe(float f) {
            }

            @Override // X.C3QU
            public final void DFd() {
                C51762Yz.this.A03(C123775ir.A00);
            }
        }, this), new Object[]{new Object()});
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A04, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_right))), new C9CV(C05F.A1F, new C206849Dp(this, 21), 4));
        if (this.A04) {
            c51722Yv = new C51722Yv(null, new C9CV(C05F.A0j, 4, 0));
        } else {
            c51722Yv = null;
        }
        C51722Yv A004 = c51722Yv2.A00(c51722Yv);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        if (((Boolean) A00.A03).booleanValue()) {
            if (C3HM.A00.A04(this.A01)) {
                A0D = AbstractC77623dm.A0D(c2z0, R.dimen.abc_dialog_padding_top_material);
            } else {
                A0D = AbstractC77623dm.A0D(c2z0, R.dimen.add_account_icon_circle_radius);
            }
            C2XE c2xe2 = c2z0.A00;
            Context context2 = c2xe2.A0C;
            int A03 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context2, R.attr.igds_color_highlight_background));
            Integer num = C05F.A00;
            c2z0.A00(new C77973eP(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num, 0, A0D)), new C9CU(C05F.A01, 0, A0D)), new C76933cf(c2xe2, enumC76913cd, "COMPOSER_BUTTON_AVATAR")), new C9CU(C05F.A0F, 0, AbstractC77623dm.A0D(c2z0, R.dimen.abc_action_bar_elevation_material))), new C9CU(C05F.A09, 0, AbstractC77623dm.A0D(c2z0, R.dimen.abc_edit_text_inset_top_material))), new C9CT(C05F.A0C, 0.0f, 1)), this.A03, this.A02, null, A03, C2Z3.A00(c2z0.BoZ(), AbstractC77623dm.A0D(c2z0, R.dimen.circular_avatar_stroke_width)), AbstractC77623dm.A02(c2z0, R.attr.avatarInnerStroke), true, true, false));
            C51722Yv c51722Yv3 = new C51722Yv(null, new C76933cf(c2xe2, enumC76913cd, "COMPOSER_BUTTON_TEXT"));
            String A0F = AbstractC77623dm.A0F(c2z0, 2131956452);
            int A032 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_text));
            long A0D2 = AbstractC77623dm.A0D(c2z0, R.dimen.action_bar_item_spacing_right);
            Integer num2 = C05F.A0N;
            Typeface typeface = Typeface.DEFAULT;
            long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
            C77723dw A033 = C51682Yq.A03(c2xe2, 0);
            A033.A0W(A0F);
            A033.A0V(null);
            A033.A0Q(A032);
            A033.A0R(C2Z3.A00(c2z0.BoZ(), A0D2));
            A033.A0S(0);
            A033.A0T(typeface);
            A033.A0P(-7829368);
            A033.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
            A033.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
            A033.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
            A033.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
            A033.A0X(num2);
            A033.A0C();
            A033.A0Y(num);
            A033.A0L(1.0f);
            A033.A0b(false);
            A033.A0N(0);
            A033.A0M(2);
            A033.A0c(true);
            A033.A0Z(false);
            A033.A0a(true);
            A033.A06(null);
            AbstractC77743dy.A00(A033, c51722Yv3);
            c2z0.A00(A033.A0A());
        }
        return AbstractC76963ci.A0J(c2z0, c76223bS, A004, null, null, enumC77683ds, null, null, false);
    }
}
