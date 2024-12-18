package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AMT {
    public int A00;
    public int A01;
    public Drawable A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D;
    public int[] A0E;
    public int[] A0F;
    public final Context A0G;
    public final Resources A0H;
    public final UserSession A0I;

    public AMT(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A0I = userSession;
        this.A0G = context;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A0H = A0M;
        int color = context.getColor(R.color.fds_transparent);
        this.A0D = AbstractC166987dD.A04(A0M, R.dimen.abc_dialog_padding_top_material);
        this.A01 = R.dimen.abc_edit_text_inset_top_material;
        this.A00 = R.dimen.contextual_sticker_tray_text_size;
        this.A08 = true;
        this.A0E = new int[]{color, color};
        this.A0F = new int[]{color, color};
        this.A05 = "";
    }

    public final void A0A(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        this.A0E = iArr;
    }

    public final void A0B(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        this.A0F = iArr;
    }

    private final SpannableStringBuilder A00() {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        Drawable drawable = this.A02;
        if (drawable != null) {
            if (!this.A09) {
                if (this.A0A) {
                    str = "  ";
                } else {
                    str = " ";
                }
                spannableStringBuilder.insert(0, (CharSequence) str);
            }
            Integer num = this.A04;
            if (num != null) {
                drawable = C3LQ.A01(this.A0G, drawable, num.intValue());
            } else if (this.A08) {
                int[] iArr = this.A0E;
                int length = iArr.length;
                Context context = this.A0G;
                if (length == 1) {
                    drawable = C3LQ.A01(context, drawable, iArr[0]);
                } else {
                    drawable = C3LQ.A02(context, drawable, iArr[0], iArr[1]);
                }
            }
            float f = this.A0D;
            drawable.setBounds(0, 0, (int) f, (int) ((f / drawable.getIntrinsicWidth()) * AbstractC166987dD.A06(drawable)));
            if (this.A06) {
                C4GL.A02(drawable, spannableStringBuilder, 0, 0, 0);
            } else {
                ImageSpan imageSpan = new ImageSpan(drawable, 1);
                spannableStringBuilder.insert(0, (CharSequence) " ");
                spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static AMT A01(Context context, UserSession userSession) {
        return new AMT(userSession, context);
    }

    public static final C6RB A02(AMT amt, double d, float f, float f2) {
        C6RB A0z;
        EnumC15950qp enumC15950qp;
        boolean z = amt.A07;
        Resources resources = amt.A0H;
        int i = R.dimen.abc_dialog_padding_material;
        if (z) {
            i = R.dimen.abc_dropdownitem_icon_width;
        }
        amt.A0D = (float) (resources.getDimensionPixelSize(i) * d);
        amt.A06 = true;
        UserSession userSession = amt.A0I;
        if (C18U.A06(C06090Tz.A05, userSession, 36322044501436388L)) {
            amt.A0E = amt.A0F;
        }
        Context context = amt.A0G;
        int A01 = AbstractC188878Yd.A01(context);
        if (amt.A07) {
            A0z = new C221499qE(context, amt.A02, A01, true);
        } else {
            A0z = AbstractC166987dD.A0z(context, A01);
        }
        A0z.A0L(amt.A00());
        float dimensionPixelSize = (int) (resources.getDimensionPixelSize(amt.A00) * d);
        boolean A012 = AbstractC172687md.A01(userSession);
        C15980qs A00 = AbstractC15960qq.A00(context);
        if (A012) {
            enumC15950qp = EnumC15950qp.A0Y;
        } else {
            enumC15950qp = EnumC15950qp.A0V;
        }
        AbstractC166987dD.A1U(enumC15950qp, A00, A0z);
        AbstractC167007dF.A1A(A0z, dimensionPixelSize, f, f2);
        return A0z;
    }

    public final C6RB A04() {
        C6RB A0z;
        Spannable spannable;
        Object c221439q8;
        int i;
        Context context = this.A0G;
        int A01 = AbstractC188878Yd.A01(context);
        if (this.A07) {
            A0z = new C221499qE(context, this.A02, A01, false);
        } else {
            A0z = AbstractC166987dD.A0z(context, A01);
        }
        A0z.A0L(A00());
        Resources resources = this.A0H;
        int A09 = AbstractC166997dE.A09(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(this.A01);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(this.A00);
        AbstractC167017dG.A1N(this.A0I, context);
        AbstractC167017dG.A0z(context, A0z);
        AbstractC167007dF.A1A(A0z, dimensionPixelSize2, A09, dimensionPixelSize);
        if (this.A0B) {
            spannable = A0z.A0F;
            C14360o3.A07(spannable);
            int[] iArr = this.A0E;
            C14360o3.A0B(iArr, 4);
            c221439q8 = new APq(iArr, AbstractC166997dE.A07(resources), A09, dimensionPixelSize);
        } else {
            if (this.A0E.length == 1) {
                Integer num = this.A03;
                if (num != null) {
                    i = num.intValue();
                } else if (this.A0C) {
                    i = context.getColor(R.color.primary_text_disabled_material_dark);
                } else {
                    i = -1;
                }
                Spannable spannable2 = A0z.A0F;
                C14360o3.A07(spannable2);
                AMr.A0B(spannable2, AbstractC166997dE.A07(resources), A09, dimensionPixelSize, i, this.A0E[0]);
                return A0z;
            }
            spannable = A0z.A0F;
            C14360o3.A07(spannable);
            int[] iArr2 = this.A0E;
            C14360o3.A0B(iArr2, 4);
            c221439q8 = new C221439q8(iArr2, AbstractC166997dE.A07(resources), A09, dimensionPixelSize, dimensionPixelSize);
        }
        AbstractC167017dG.A15(spannable, c221439q8);
        return A0z;
    }

    public final C6RB A05() {
        UserSession userSession = this.A0I;
        double A00 = AbstractC172687md.A00(userSession);
        Resources resources = this.A0H;
        int A0A = (int) (AbstractC166997dE.A0A(resources) * A00);
        int A0C = (int) (AbstractC166997dE.A0C(resources) * A00);
        int A0A2 = (int) (AbstractC166997dE.A0A(resources) * A00);
        C6RB A02 = A02(this, A00, A0C, A0A2);
        Rect A0U = AbstractC166987dD.A0U();
        A02.A0b.getTextBounds(A02.A0F.toString(), 0, A02.A0F.length(), A0U);
        int i = A0A2 - A0U.bottom;
        Spannable spannable = A02.A0F;
        C14360o3.A07(spannable);
        int[] iArr = this.A0E;
        C14360o3.A0B(iArr, 6);
        if (C18U.A06(C06090Tz.A05, userSession, 36322044501436388L)) {
            AbstractC167017dG.A15(spannable, new C221439q8(iArr, A0A, A0C, A0A2, i));
            return A02;
        }
        spannable.setSpan(new C209849Pv(-1, A0A, A0C, false, A0A2, i), 0, spannable.length(), 18);
        spannable.setSpan(new ForegroundColorSpan(-16777216), 0, spannable.length(), 18);
        return A02;
    }

    public final void A06(int i) {
        this.A02 = this.A0G.getDrawable(i);
    }

    public final void A07(int i) {
        this.A0D = AbstractC166987dD.A04(this.A0H, i);
    }

    public final void A08(int i) {
        int color = this.A0G.getColor(i);
        this.A0E = new int[]{color, color};
    }

    public final void A09(int i) {
        this.A05 = AbstractC166997dE.A0q(this.A0G.getResources(), i);
    }

    public static void A03(Context context, AMT amt, int i) {
        amt.A0A(new int[]{context.getColor(AbstractC53242c7.A0H(context, i))});
    }
}
