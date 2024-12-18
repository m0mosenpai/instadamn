package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89683z9 extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final C9BW A09;
    public final EnumC77683ds A0A;
    public final UserSession A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final boolean A0E;
    public final boolean A0F;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        TestimonialDict testimonialDict;
        User Ae9;
        String text;
        int A02;
        C14360o3.A0B(c76223bS, 0);
        C9BW c9bw = this.A09;
        if (c9bw != null && (testimonialDict = (TestimonialDict) c9bw.A01) != null && (Ae9 = testimonialDict.Ae9()) != null && (text = testimonialDict.getText()) != null) {
            UserSession userSession = this.A0B;
            if (C18U.A06(C06090Tz.A05, userSession, 36330522766623634L)) {
                InterfaceC80043ht interfaceC80043ht = (InterfaceC80043ht) ((InterfaceC16820sZ) ((C9BH) c9bw.A00).A00).invoke();
                long A0D = AbstractC77623dm.A0D(c76223bS, this.A04);
                long A0D2 = AbstractC77623dm.A0D(c76223bS, this.A00);
                long A0D3 = AbstractC77623dm.A0D(c76223bS, this.A05);
                Integer num = this.A0D;
                if (num != null) {
                    A02 = num.intValue();
                } else {
                    A02 = c76223bS.BoZ().A02(AbstractC53242c7.A0H(c76223bS.A05.A0C, R.attr.igds_color_primary_text));
                }
                C169607ha c169607ha = C169607ha.A00;
                C2XE c2xe = c76223bS.A05;
                Context context = c2xe.A0C;
                C14360o3.A07(context);
                SpannableStringBuilder A022 = c169607ha.A02(context, userSession, Ae9, text, C16930sl.A00, new C9EL(interfaceC80043ht, 49), new C206849Dp(interfaceC80043ht, 0), BAR.A00, this.A01, this.A06, false, this.A0E, this.A0F);
                C75933ay c75933ay = C51722Yv.A02;
                EnumC77683ds enumC77683ds = this.A0A;
                Integer num2 = C05F.A00;
                C51722Yv c51722Yv = new C51722Yv(null, new C9CV(num2, enumC77683ds, 3));
                long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
                C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CU(C05F.A0u, 0, A0D));
                Integer num3 = C05F.A1F;
                C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(c51722Yv2, new C9CU(num3, 0, A0D2)), new C9CU(C05F.A1I, 0, doubleToRawLongBits));
                Integer num4 = C05F.A01;
                C51722Yv A00 = new C51722Yv(new C51722Yv(c51722Yv3, new C9CT(num4, 1.0f, 1)), new C9CV(num3, new C9EL(interfaceC80043ht, 48), 4)).A00(interfaceC80043ht.B5a());
                int i = this.A02;
                Typeface A03 = AbstractC14710oj.A03(context, Typeface.DEFAULT, num2);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                long A0D4 = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_control_corner_material);
                long j = this.A08;
                int i2 = this.A03;
                long j2 = this.A07;
                Integer num5 = this.A0C;
                C77723dw A032 = C51682Yq.A03(c2xe, 0);
                A032.A0W(A022);
                A032.A0V(null);
                A032.A0Q(A02);
                A032.A0R(C2Z3.A00(c76223bS.BoZ(), A0D3));
                A032.A0S(0);
                A032.A0T(A03);
                A032.A0P(i2);
                A032.A0K(C2Z3.A00(c76223bS.BoZ(), j));
                A032.A0I(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
                A032.A0J(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
                A032.A0H(C2Z3.A00(c76223bS.BoZ(), j2));
                if (num5 != null) {
                    A032.A0O(num5.intValue());
                }
                A032.A0X(num2);
                A032.A0C();
                A032.A0Y(num4);
                A032.A0L(1.0f);
                A032.A0b(false);
                A032.A0N(0);
                A032.A0M(i);
                A032.A01.A00 = C2Z3.A00(c76223bS.BoZ(), A0D4);
                A032.A0c(true);
                A032.A0Z(false);
                A032.A0a(false);
                A032.A0U(truncateAt);
                A032.A06(null);
                AbstractC77743dy.A00(A032, A00);
                return A032.A0A();
            }
            return null;
        }
        return null;
    }

    public /* synthetic */ C89683z9(C9BW c9bw, EnumC77683ds enumC77683ds, UserSession userSession, Integer num, Integer num2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, boolean z, boolean z2) {
        Integer num3 = num2;
        Integer num4 = num;
        EnumC77683ds enumC77683ds2 = enumC77683ds;
        int i9 = i2;
        int i10 = i7;
        int i11 = i6;
        int i12 = i5;
        int i13 = i4;
        int i14 = i3;
        boolean z3 = z2;
        boolean z4 = z;
        long j3 = j2;
        long j4 = j;
        int i15 = (i8 & 4) != 0 ? R.attr.textColorBoldLink : i;
        i9 = (i8 & 8) != 0 ? R.attr.igds_color_link : i9;
        i14 = (i8 & 16) != 0 ? 5 : i14;
        enumC77683ds2 = (i8 & 32) != 0 ? EnumC77683ds.FLEX_START : enumC77683ds2;
        i13 = (i8 & 64) != 0 ? R.dimen.abc_text_size_menu_header_material : i13;
        i12 = (i8 & 128) != 0 ? 0 : i12;
        i11 = (i8 & 256) != 0 ? 0 : i11;
        j4 = (i8 & 512) != 0 ? Double.doubleToRawLongBits(0.0d) : j4;
        i10 = (i8 & 1024) != 0 ? -7829368 : i10;
        j3 = (i8 & C3OO.FLAG_MOVED) != 0 ? Double.doubleToRawLongBits(0.0d) : j3;
        num4 = (i8 & 4096) != 0 ? null : num4;
        num3 = (i8 & 8192) != 0 ? null : num3;
        z4 = (i8 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? false : z4;
        z3 = (i8 & Constants.LOAD_RESULT_PGO) != 0 ? false : z3;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(enumC77683ds2, 6);
        this.A09 = c9bw;
        this.A0B = userSession;
        this.A06 = i15;
        this.A01 = i9;
        this.A02 = i14;
        this.A0A = enumC77683ds2;
        this.A05 = i13;
        this.A04 = i12;
        this.A00 = i11;
        this.A08 = j4;
        this.A03 = i10;
        this.A07 = j3;
        this.A0D = num4;
        this.A0C = num3;
        this.A0E = z4;
        this.A0F = z3;
    }
}
