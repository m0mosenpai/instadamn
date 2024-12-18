package X;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.7cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166737cl extends AbstractC51572Yf {
    public final C25814BbV A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC16660sJ A03;
    public final boolean A04;
    public final InterfaceC166367c5 A05;

    public C166737cl(C25814BbV c25814BbV, InterfaceC166367c5 interfaceC166367c5, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(interfaceC166367c5, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c25814BbV, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        C14360o3.A0B(interfaceC16660sJ, 5);
        this.A05 = interfaceC166367c5;
        this.A01 = userSession;
        this.A00 = c25814BbV;
        this.A02 = interfaceC60442pS;
        this.A03 = interfaceC16660sJ;
        this.A04 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
    
        if (r2.A02 != true) goto L14;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r36) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166737cl.A0Y(X.3bS):X.2Vc");
    }

    private final C2WH A03(C2Z1 c2z1, InterfaceC60442pS interfaceC60442pS, User user, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        String A0G;
        C51722Yv c51722Yv;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num, 100.0f, 0)), new C9CU(C05F.A0Y, 0, Double.doubleToRawLongBits(48.0d))), new C9CV(num, new ColorDrawable(i), 4));
        Integer num2 = C05F.A08;
        C51722Yv c51722Yv3 = new C51722Yv(c51722Yv2, new C9CV(num2, "dismissable_callout_info_banner", 4));
        C2XE ArD = c2z1.ArD();
        C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, new C76933cf(ArD, EnumC76913cd.LOCAL, "replying_to_bar"));
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 c2z0 = new C2Z0(ArD, new ArrayList());
        if (z2) {
            c2z0.A00(new C77973eP(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num, 0, AbstractC77623dm.A0D(c2z0, R.dimen.add_account_icon_circle_radius))), new C9CU(C05F.A01, 0, AbstractC77623dm.A0D(c2z0, R.dimen.add_account_icon_circle_radius))), new C9CV(C05F.A0N, AbstractC77623dm.A0F(c2z0, 2131970234), 0)), new C9CU(C05F.A07, 0, Double.doubleToRawLongBits(16.0d))), new C9CU(C05F.A09, 0, AbstractC77623dm.A0D(c2z0, R.dimen.abc_edit_text_inset_top_material))), new C9CT(C05F.A0C, 0.0f, 1)), interfaceC60442pS, user.Bhu(), null, AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(c2z0.A00.A0C, R.attr.igds_color_highlight_background)), 0, -16777216, false, true, false));
        }
        if (z) {
            A0G = AbstractC77623dm.A0G(c2z0, user.getUsername(), 2131956497);
        } else {
            A0G = AbstractC77623dm.A0G(c2z0, user.getUsername(), 2131972367);
        }
        C2XE c2xe = c2z0.A00;
        int A03 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(c2xe.A0C, R.attr.igds_color_secondary_text));
        long A0D = AbstractC77623dm.A0D(c2z0, R.dimen.abc_text_size_menu_header_material);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Integer num3 = C05F.A01;
        C51722Yv c51722Yv5 = new C51722Yv(null, new C9CT(num3, 1.0f, 1));
        if (!z2) {
            c51722Yv = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A0u, 0, Double.doubleToRawLongBits(16.0d))), new C9CU(C05F.A1F, 0, Double.doubleToRawLongBits(32.0d)));
        } else {
            c51722Yv = null;
        }
        C51722Yv A00 = c51722Yv5.A00(c51722Yv);
        Typeface typeface = Typeface.DEFAULT;
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        C77723dw A032 = C51682Yq.A03(c2xe, 0);
        A032.A0W(A0G);
        A032.A0V(null);
        A032.A0Q(A03);
        A032.A0R(C2Z3.A00(c2z0.BoZ(), A0D));
        A032.A0S(0);
        A032.A0T(typeface);
        A032.A0P(-7829368);
        A032.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A032.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A032.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A032.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A032.A0X(num);
        A032.A0C();
        A032.A0Y(num);
        A032.A0L(1.0f);
        A032.A0b(false);
        A032.A0N(0);
        A032.A0M(1);
        A032.A0c(true);
        A032.A0Z(false);
        A032.A0a(true);
        A032.A0U(truncateAt);
        A032.A06(null);
        AbstractC77743dy.A00(A032, A00);
        c2z0.A00(A032.A0A());
        C51722Yv c51722Yv6 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num3, 100.0f, 0)), new C9CV(num3, "android.widget.Button", 0)), new C9CV(C05F.A0N, AbstractC77623dm.A0F(c2z0, 2131972365), 0)), new C9CV(C05F.A1F, new C9EB(interfaceC16820sZ, 3), 4));
        C2Z0 c2z02 = new C2Z0(c2z0.ArD(), new ArrayList());
        Drawable A0E = AbstractC77623dm.A0E(c2z02, R.drawable.instagram_x_pano_outline_12);
        C2XE c2xe2 = c2z02.A00;
        A0E.setTint(AbstractC77623dm.A03(c2z02, AbstractC53242c7.A0H(c2xe2.A0C, R.attr.igds_color_primary_icon)));
        C51722Yv c51722Yv7 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(num2, "dismiss_button", 4)), new C9CU(C05F.A07, 0, Double.doubleToRawLongBits(14.0d))), new C9CU(C05F.A09, 0, Double.doubleToRawLongBits(22.0d))), new C9CT(C05F.A0C, 0.0f, 1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        C80403iV A033 = C80393iU.A03(c2xe2);
        A033.A0D(A0E);
        A033.A0E(scaleType);
        A033.A0C();
        AbstractC77743dy.A00(A033, c51722Yv7);
        c2z02.A00(A033.A0A());
        c2z0.A00(AbstractC76963ci.A0J(c2z02, c2z0, c51722Yv6, null, null, enumC77683ds, null, null, false));
        return AbstractC76963ci.A0J(c2z0, c2z1, c51722Yv4, null, null, enumC77683ds, null, null, false);
    }
}
