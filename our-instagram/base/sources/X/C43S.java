package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.43S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43S extends AbstractC51572Yf {
    public final int A00;
    public final C77123cy A01;
    public final long A02;
    public final UserSession A03;
    public final C43R A04;
    public final String A05;

    public C43S(C77123cy c77123cy, UserSession userSession, C43R c43r, String str, int i, long j) {
        C14360o3.A0B(c43r, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(str, 4);
        this.A00 = i;
        this.A04 = c43r;
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = j;
        this.A01 = c77123cy;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C2Z3 c2z3;
        C51722Yv c51722Yv;
        C51722Yv c51722Yv2;
        C51722Yv c51722Yv3;
        C51722Yv c51722Yv4;
        C14360o3.A0B(c76223bS, 0);
        C43R c43r = this.A04;
        CharSequence charSequence = c43r.A04;
        int i = c43r.A00;
        InterfaceC16660sJ interfaceC16660sJ = c43r.A07;
        InterfaceC16620sF interfaceC16620sF = c43r.A08;
        InterfaceC16820sZ interfaceC16820sZ = c43r.A06;
        TextUtils.TruncateAt truncateAt = c43r.A01;
        EnumC77673dr enumC77673dr = c43r.A02;
        InterfaceC16820sZ interfaceC16820sZ2 = c43r.A05;
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36324411028025500L)) {
            c2z3 = new C2Z3(AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material));
        } else {
            c2z3 = null;
        }
        C51722Yv c51722Yv5 = c43r.A03;
        if (charSequence != null) {
            C9CV c9cv = new C9CV(C05F.A0N, charSequence, 0);
            if (c51722Yv5 == C51722Yv.A02) {
                c51722Yv5 = null;
            }
            c51722Yv5 = new C51722Yv(c51722Yv5, c9cv);
        }
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material);
        C9CU c9cu = new C9CU(C05F.A04, 0, this.A02);
        if (c51722Yv5 == C51722Yv.A02) {
            c51722Yv5 = null;
        }
        C51722Yv c51722Yv6 = new C51722Yv(c51722Yv5, c9cu);
        if (c2z3 != null) {
            c51722Yv6 = new C51722Yv(c51722Yv6, new C9CU(C05F.A15, 0, c2z3.A00));
        }
        C51722Yv c51722Yv7 = new C51722Yv(new C51722Yv(c51722Yv6, new C9CU(C05F.A1I, 0, A0D)), new C9CT(C05F.A01, 1.0f, 1));
        Integer num = C05F.A0B;
        Integer valueOf = Integer.valueOf(R.id.secondary_label);
        C51722Yv c51722Yv8 = new C51722Yv(c51722Yv7, new C9CV(num, valueOf, 4));
        Integer num2 = C05F.A0D;
        C51722Yv c51722Yv9 = new C51722Yv(c51722Yv8, new C9CV(num2, valueOf, 4));
        C2XE c2xe = c76223bS.A05;
        C51722Yv c51722Yv10 = new C51722Yv(c51722Yv9, new C76933cf(c2xe, EnumC76913cd.GLOBAL, this.A05));
        EnumC77683ds enumC77683ds = EnumC77683ds.STRETCH;
        Integer num3 = C05F.A00;
        C51722Yv c51722Yv11 = new C51722Yv(c51722Yv10, new C9CV(num3, enumC77683ds, 3));
        if (enumC77673dr != null) {
            c51722Yv = new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0E, AbstractC77703du.A00(enumC77673dr), 4)), new C9CV(num2, EnumC77663dq.A04, 4));
        } else {
            c51722Yv = null;
        }
        C51722Yv A00 = c51722Yv11.A00(c51722Yv);
        if (interfaceC16820sZ == null && interfaceC16820sZ2 == null) {
            c51722Yv2 = null;
        } else {
            c51722Yv2 = new C51722Yv(null, new C77863eE(num3, new C9FO(31, this, interfaceC16820sZ2, interfaceC16820sZ), "subtitle"));
        }
        C51722Yv A002 = A00.A00(c51722Yv2);
        if (interfaceC16620sF != null) {
            c51722Yv3 = new C51722Yv(null, new C9CV(C05F.A02, new C206849Dp(interfaceC16620sF, 40), 4));
        } else {
            c51722Yv3 = null;
        }
        C51722Yv A003 = A002.A00(c51722Yv3);
        if (interfaceC16660sJ != null) {
            c51722Yv4 = new C51722Yv(null, new C9CV(C05F.A1F, new C206849Dp(interfaceC16660sJ, 41), 4));
        } else {
            c51722Yv4 = null;
        }
        C51722Yv A004 = A003.A00(c51722Yv4);
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            Context context = c2xe.A0C;
            C14360o3.A07(context);
            SpannableString valueOf2 = SpannableString.valueOf(charSequence);
            Typeface typeface = Typeface.SANS_SERIF;
            C14360o3.A08(typeface);
            C25317BIm c25317BIm = new C25317BIm(context, AbstractC14710oj.A03(context, typeface, num3), null, valueOf2, userSession, R.dimen.add_payment_bottom_sheet_row_subtitle_size, i);
            c25317BIm.A02(Integer.valueOf((int) AbstractC13880nE.A00(context, 250.0f)), null);
            return new BNU(c25317BIm, ImageView.ScaleType.CENTER, A004, true);
        }
        Typeface A03 = AbstractC14710oj.A03(c2xe.A0C, Typeface.DEFAULT, num3);
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        Integer num4 = C05F.A0N;
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        C77723dw A032 = C51682Yq.A03(c2xe, 0);
        A032.A0W(charSequence);
        A032.A0V(null);
        A032.A0Q(i);
        A032.A0R(C2Z3.A00(c76223bS.BoZ(), A0D2));
        A032.A0S(0);
        A032.A0T(A03);
        A032.A0P(-7829368);
        A032.A0K(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A032.A0I(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A032.A0J(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A032.A0H(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A032.A0X(num4);
        A032.A0C();
        A032.A0Y(num3);
        A032.A0L(1.0f);
        A032.A0b(true);
        A032.A0N(0);
        A032.A0M(Integer.MAX_VALUE);
        A032.A0c(false);
        A032.A0Z(false);
        A032.A0a(true);
        if (truncateAt != null) {
            A032.A0U(truncateAt);
        }
        A032.A06(null);
        AbstractC77743dy.A00(A032, A004);
        return A032.A0A();
    }
}
