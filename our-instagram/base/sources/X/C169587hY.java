package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.7hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169587hY extends AbstractC51572Yf {
    public final C166047bW A00;
    public final C25814BbV A01;
    public final UserSession A02;
    public final C167207dZ A03;
    public final User A04;
    public final Long A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C167297di A0B;
    public final InterfaceC60442pS A0C;
    public final C131325wL A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public C169587hY(C167297di c167297di, C166047bW c166047bW, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C167207dZ c167207dZ, C131325wL c131325wL, User user, Long l, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(userSession, 16);
        C14360o3.A0B(interfaceC60442pS, 18);
        this.A05 = l;
        this.A04 = user;
        this.A06 = str;
        this.A0A = z;
        this.A0M = z2;
        this.A0H = z3;
        this.A0I = z4;
        this.A0F = z5;
        this.A0G = z6;
        this.A0K = z7;
        this.A09 = z8;
        this.A07 = z9;
        this.A0J = z10;
        this.A0L = z11;
        this.A00 = c166047bW;
        this.A02 = userSession;
        this.A01 = c25814BbV;
        this.A0C = interfaceC60442pS;
        this.A03 = c167207dZ;
        this.A08 = z12;
        this.A0B = c167297di;
        this.A0D = c131325wL;
        this.A0E = z13;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        User user;
        EnumC168547fo enumC168547fo;
        C131325wL c131325wL;
        long doubleToRawLongBits;
        ImageUrl simpleImageUrl;
        User user2;
        long A0D;
        C14360o3.A0B(c76223bS, 0);
        Long l = this.A05;
        String str = (String) AbstractC77183d4.A00(c76223bS, new C9F8(47, c76223bS, this), new Object[]{l, Boolean.valueOf(this.A07)});
        Object A00 = AbstractC77183d4.A00(c76223bS, new C9F8(46, c76223bS, this), new Object[]{l});
        User user3 = this.A04;
        Boolean valueOf = Boolean.valueOf(this.A0A);
        String str2 = this.A06;
        UserSession userSession = this.A02;
        C166047bW c166047bW = this.A00;
        C25814BbV c25814BbV = this.A01;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) AbstractC77183d4.A00(c76223bS, new C9F8(48, c76223bS, this), new Object[]{user3, valueOf, str2, userSession, c166047bW, c25814BbV, Boolean.valueOf(this.A09)});
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CU(C05F.A0A, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material)));
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        C2XE c2xe = c2z0.A00;
        Context context = c2xe.A0C;
        int A03 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
        long A0D2 = AbstractC77623dm.A0D(c2z0, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        Integer num = C05F.A0N;
        Integer num2 = C05F.A0C;
        C51722Yv c51722Yv2 = new C51722Yv(null, new C9CT(num2, 0.0f, 1));
        float f = 0.4f;
        if (this.A0M) {
            f = 1.0f;
        }
        C51722Yv A002 = AbstractC171007jr.A00(c51722Yv2, f);
        Typeface typeface = Typeface.DEFAULT;
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
        Integer num3 = C05F.A00;
        C77723dw A032 = C51682Yq.A03(c2xe, 0);
        A032.A0W(spannableStringBuilder);
        A032.A0V(null);
        A032.A0Q(A03);
        A032.A0R(C2Z3.A00(c2z0.BoZ(), A0D2));
        A032.A0S(1);
        A032.A0T(typeface);
        A032.A0P(-7829368);
        A032.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
        A032.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
        A032.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
        A032.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
        A032.A0X(num);
        A032.A0C();
        A032.A0Y(num3);
        A032.A0L(1.0f);
        A032.A0b(true);
        A032.A0N(0);
        A032.A0M(Integer.MAX_VALUE);
        A032.A0c(true);
        A032.A0Z(true);
        A032.A0a(true);
        A032.A06(null);
        AbstractC77743dy.A00(A032, A002);
        c2z0.A00(A032.A0A());
        if (c166047bW != null) {
            user = c166047bW.A0A;
        } else {
            user = null;
        }
        if (this.A0J && user != null) {
            c2z0.A00(new AbstractC51572Yf());
            c2z0.A00(new C77573dh(null, null, this.A0C, null, userSession, null, null, EnumC77553df.A0F, null, null, null, null, null, user, Integer.valueOf(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button)), null, null, null, null, 0.0f, 0.0f, 0, 0, false, true, false, false, false, false, false, false));
        }
        if (this.A0L && str != null) {
            C51722Yv c51722Yv3 = c75933ay;
            if (A00 != null) {
                c51722Yv3 = new C51722Yv(null, new C9CV(num, A00, 0));
            }
            C9CU c9cu = new C9CU(C05F.A07, 0, Double.doubleToRawLongBits(4.0d));
            if (c51722Yv3 == c75933ay) {
                c51722Yv3 = null;
            }
            C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, c9cu);
            int A033 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            long A0D3 = AbstractC77623dm.A0D(c2z0, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            Typeface A034 = AbstractC14710oj.A03(context, typeface, num3);
            C77723dw A035 = C51682Yq.A03(c2xe, 0);
            A035.A0W(str);
            A035.A0V(null);
            A035.A0Q(A033);
            A035.A0R(C2Z3.A00(c2z0.BoZ(), A0D3));
            A035.A0S(0);
            A035.A0T(A034);
            A035.A0P(-7829368);
            A035.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A035.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A035.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A035.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A035.A0X(num);
            A035.A0C();
            A035.A0Y(num3);
            A035.A0L(1.0f);
            A035.A0b(true);
            A035.A0N(0);
            A035.A0M(Integer.MAX_VALUE);
            A035.A0c(true);
            A035.A0Z(false);
            A035.A0a(true);
            A035.A0U(truncateAt);
            A035.A06(null);
            AbstractC77743dy.A00(A035, c51722Yv4);
            C50932Vp A0a = ((AbstractC77733dx) A035).A00.A0a();
            A0a.A01 |= 2;
            A0a.A07 = "row_comment_textview_time_ago";
            c2z0.A00(A035.A0A());
        }
        if (this.A0F && this.A0G) {
            c2z0.A00(new AbstractC51572Yf());
            int i = 2131956439;
            if (this.A0E) {
                i = 2131953341;
            }
            String A0F = AbstractC77623dm.A0F(c2z0, i);
            int A036 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
            long A0D4 = AbstractC77623dm.A0D(c2z0, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            Typeface A037 = AbstractC14710oj.A03(context, typeface, num3);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            C77723dw A038 = C51682Yq.A03(c2xe, 0);
            A038.A0W(A0F);
            A038.A0V(null);
            A038.A0Q(A036);
            A038.A0R(C2Z3.A00(c2z0.BoZ(), A0D4));
            A038.A0S(0);
            A038.A0T(A037);
            A038.A0P(-7829368);
            A038.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A038.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A038.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A038.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A038.A0X(num3);
            A038.A0C();
            A038.A0Y(num3);
            A038.A0L(1.0f);
            A038.A0b(false);
            A038.A0N(0);
            A038.A0M(1);
            A038.A0c(true);
            A038.A0Z(false);
            A038.A0a(true);
            A038.A0U(truncateAt2);
            A038.A06(null);
            AbstractC77743dy.A00(A038, null);
            c2z0.A00(A038.A0A());
        }
        if (this.A0I) {
            c2z0.A00(new AbstractC51572Yf());
            String A0F2 = AbstractC77623dm.A0F(c2z0, 2131975282);
            int A039 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A09(context));
            long A09 = AbstractC77623dm.A09(c2z0);
            Typeface A0310 = AbstractC14710oj.A03(context, typeface, num3);
            C77723dw A0311 = C51682Yq.A03(c2xe, 0);
            A0311.A0W(A0F2);
            A0311.A0V(null);
            A0311.A0Q(A039);
            A0311.A0R(C2Z3.A00(c2z0.BoZ(), A09));
            A0311.A0S(0);
            A0311.A0T(A0310);
            A0311.A0F();
            A0311.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A0311.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A0311.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A0311.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits2));
            A0311.A0X(num3);
            A0311.A0C();
            A0311.A0Y(num3);
            A0311.A0L(1.0f);
            A0311.A0b(false);
            A0311.A0N(0);
            A0311.A0M(1);
            A0311.A0c(true);
            A0311.A0Z(false);
            A0311.A0a(true);
            A0311.A0D();
            A0311.A06(null);
            AbstractC77743dy.A00(A0311, null);
            c2z0.A00(A0311.A0A());
        }
        boolean z = this.A0H;
        if (z && C18U.A06(C06090Tz.A05, userSession, 36321035183793232L)) {
            Drawable A0E = AbstractC77623dm.A0E(c2z0, R.drawable.instagram_pin_pano_filled_24);
            A0E.mutate().setTint(AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_icon)));
            C14360o3.A07(context);
            if (BO8.A01(context, userSession)) {
                A0D = AbstractC77623dm.A09(c2z0);
            } else {
                A0D = AbstractC77623dm.A0D(c2z0, R.dimen.account_discovery_bottom_gap);
            }
            C51722Yv c51722Yv5 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num3, 0, A0D)), new C9CU(C05F.A01, 0, A0D)), new C9CU(C05F.A07, 0, AbstractC77623dm.A0D(c2z0, R.dimen.abc_action_bar_elevation_material))), new C9CU(C05F.A08, 0, AbstractC77623dm.A0D(c2z0, R.dimen.audience_lists_text_in_badge_horizontal_margin_right)));
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            C80403iV A0312 = C80393iU.A03(c2xe);
            A0312.A0D(A0E);
            A0312.A0E(scaleType);
            A0312.A0C();
            AbstractC77743dy.A00(A0312, c51722Yv5);
            c2z0.A00(A0312.A0A());
        } else if (z) {
            c2z0.A00(new AbstractC51572Yf());
            c2z0.A00(new AbstractC51572Yf());
        }
        if (this.A0K && !C18U.A06(C06090Tz.A05, userSession, 36324621481488674L)) {
            C14360o3.A07(context);
            if (BO8.A01(context, userSession)) {
                doubleToRawLongBits = Float.floatToRawIntBits(12.0f) | 9221683186994511872L;
            } else {
                doubleToRawLongBits = Double.doubleToRawLongBits(12.0d);
            }
            C51722Yv c51722Yv6 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num3, 0, doubleToRawLongBits)), new C9CU(C05F.A01, 0, doubleToRawLongBits)), new C9CT(num2, 0.0f, 1));
            long doubleToRawLongBits3 = Double.doubleToRawLongBits(4.0d);
            C51722Yv c51722Yv7 = new C51722Yv(new C51722Yv(c51722Yv6, new C9CU(C05F.A07, 0, doubleToRawLongBits3)), new C9CU(C05F.A08, 0, doubleToRawLongBits3));
            c2z0.A00(new AbstractC51572Yf());
            c2z0.A00(new C78133ef(AbstractC77623dm.A0E(c2z0, R.drawable.ufi_heart_icon), ImageView.ScaleType.FIT_CENTER, null, new C51722Yv(c51722Yv7, new C9CV(C05F.A06, true, 4)), AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_icon)), AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_badge))));
            if (c166047bW != null && (user2 = c166047bW.A0A) != null) {
                simpleImageUrl = user2.Bhu();
            } else {
                simpleImageUrl = new SimpleImageUrl("");
            }
            c2z0.A00(new C77973eP(c51722Yv7, this.A0C, simpleImageUrl, null, AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_highlight_background)), 0, -16777216, false, true, false));
        }
        C167297di c167297di = this.A0B;
        if (c167297di != null) {
            enumC168547fo = c167297di.A01;
        } else {
            enumC168547fo = null;
        }
        if (enumC168547fo == EnumC168547fo.A04 && c167297di.A0H == num3 && c167297di.A00 == EnumC168517fl.A02 && c25814BbV != null && (c131325wL = this.A0D) != null) {
            C51722Yv c51722Yv8 = new C51722Yv(null, new C9CT(C05F.A01, 1.0f, 1));
            C2Z0 c2z02 = new C2Z0(c2xe, new ArrayList());
            long j = C26569BoS.A09;
            c2z02.A00(new C26569BoS(new C51722Yv(null, new C9CU(C05F.A0u, 0, Double.doubleToRawLongBits(4.0d))), c167297di, c166047bW, c25814BbV, userSession, c131325wL, this.A0C.getModuleName(), false, C18U.A06(C06090Tz.A05, userSession, 36324621481488674L)));
            c2z0.A00(AbstractC76963ci.A0B(c2z02, c2z0, c51722Yv8));
        }
        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv, null, null, null, null, null, false);
    }
}
