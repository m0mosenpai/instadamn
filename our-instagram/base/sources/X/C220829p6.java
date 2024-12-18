package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9p6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220829p6 extends AbstractC130945vi implements C5RP, BCB {
    public C202728xq A00;
    public C6RB A01;
    public C6RB A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Medium A07;
    public final C6RL A08;
    public final int A09;
    public final Resources A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final List A0F;

    @Override // X.AbstractC130945vi
    public final String A09() {
        return "polaroid_sticker_bundle_id";
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A00.A9I(interfaceC25177BCa);
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A00.EFh(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C202728xq c202728xq = this.A00;
        if (c202728xq.A01 != null) {
            RectF rectF = this.A0D;
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.A0C);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.A0B);
            c202728xq.draw(canvas);
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            C6RB c6rb = this.A01;
            if (c6rb != null) {
                c6rb.draw(canvas);
            }
            C6RB c6rb2 = this.A02;
            if (c6rb2 != null) {
                c6rb2.draw(canvas);
            }
            this.A08.draw(canvas);
        }
    }

    public C220829p6(Context context, Medium medium, String str) {
        C6RB c6rb;
        this.A06 = context;
        this.A07 = medium;
        Resources resources = context.getResources();
        this.A0A = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        this.A04 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        this.A09 = dimensionPixelSize2;
        this.A05 = AbstractC166997dE.A05(resources);
        this.A03 = AbstractC166997dE.A06(resources);
        int A05 = AbstractC166997dE.A05(resources);
        this.A0D = AbstractC166987dD.A0X();
        int A03 = AbstractC166997dE.A03(context);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(A03);
        this.A0B = A0R;
        int color = context.getColor(R.color.black_15_transparent);
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setColor(A03);
        A0S.setAlpha(255);
        A0S.setShadowLayer(A05, 0.0f, 0.0f, color);
        this.A0C = A0S;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0F = A1E;
        Drawable drawable = context.getDrawable(R.drawable.polaroid_sticker_image_shadow);
        this.A0E = drawable;
        C6RK c6rk = new C6RK(context, this, this.A04 + (this.A05 * 2));
        c6rk.A01(2131969712);
        c6rk.A02(R.dimen.abc_text_size_menu_header_material);
        Integer num = C05F.A00;
        C14360o3.A0B(num, 0);
        c6rk.A06 = num;
        c6rk.A03 = 4000L;
        this.A08 = c6rk.A00();
        C6RB c6rb2 = null;
        if (medium.A0D > 0) {
            c6rb = AbstractC166987dD.A0z(context, dimensionPixelSize);
            long j = this.A07.A0D;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            AbstractC166997dE.A1Q(c6rb, AnonymousClass001.A0g(DateFormat.getDateInstance().format(calendar.getTime()), " • ", AbstractC209279Nj.A01(this.A06, j)));
            Context context2 = c6rb.A0Z;
            AbstractC166997dE.A1A(context2, c6rb, AbstractC53242c7.A09(context2));
            c6rb.A09();
            AbstractC166997dE.A1B(resources, c6rb, R.dimen.abc_text_size_menu_header_material);
            AbstractC166987dD.A1U(EnumC15950qp.A0t, AbstractC15960qq.A00(context2), c6rb);
        } else {
            c6rb = null;
        }
        this.A02 = c6rb;
        if (str != null && !AbstractC001900j.A0T(str)) {
            c6rb2 = AbstractC166987dD.A0z(context, dimensionPixelSize);
            AbstractC166997dE.A1Q(c6rb2, str);
            Context context3 = c6rb2.A0Z;
            AbstractC167017dG.A10(context3, c6rb2, R.attr.igds_color_text_on_white);
            c6rb2.A09();
            AbstractC166997dE.A1B(resources, c6rb2, R.dimen.backup_codes_text_size);
            AbstractC166987dD.A1U(EnumC15950qp.A0t, AbstractC15960qq.A00(context3), c6rb2);
            c6rb2.A0K(Layout.Alignment.ALIGN_NORMAL);
        }
        this.A01 = c6rb2;
        C202728xq c202728xq = new C202728xq(context, null, medium, null, C8OK.A0A, null, dimensionPixelSize, dimensionPixelSize2, false, false, false, true);
        this.A00 = c202728xq;
        Collections.addAll(A1E, this.A02, this.A01, c202728xq, drawable);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0F;
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A00.AHq();
    }

    @Override // X.BCB
    public final Rect BIv() {
        return AbstractC166987dD.A0W(this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A09;
        C6RB c6rb = this.A01;
        if (c6rb != null) {
            int i6 = c6rb.A06;
            if (this.A02 != null) {
                i4 = this.A03;
            } else {
                i4 = 0;
            }
            i = i6 + i4;
        } else {
            i = 0;
        }
        int i7 = i5 + i;
        C6RB c6rb2 = this.A02;
        if (c6rb2 != null) {
            i2 = c6rb2.A06;
        } else {
            i2 = 0;
        }
        int i8 = i7 + i2;
        if (c6rb2 == null && c6rb == null) {
            i3 = this.A05;
        } else {
            i3 = 0;
        }
        return i8 + i3 + (this.A05 * 3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04 + (this.A05 * 2);
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A00.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.setBounds(i, i2, i3, i4);
        int intrinsicHeight = ((i2 + i4) / 2) - (getIntrinsicHeight() / 2);
        RectF rectF = this.A0D;
        rectF.left = i;
        rectF.top = intrinsicHeight;
        rectF.right = i3;
        rectF.bottom = r2 + r0;
        int i7 = this.A05;
        int i8 = i7 + intrinsicHeight;
        int i9 = i + i7;
        int i10 = i3 - i7;
        int i11 = this.A09;
        Rect A0V = AbstractC166987dD.A0V(i9, i8, i10, i11 + i8);
        this.A00.setBounds(A0V);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setBounds(A0V);
        }
        int i12 = intrinsicHeight + i11 + (i7 * 2);
        C6RB c6rb = this.A01;
        if (c6rb != null) {
            int i13 = c6rb.A06;
            if (this.A02 != null) {
                i6 = this.A03;
            } else {
                i6 = 0;
            }
            i5 = i13 + i6;
        } else {
            i5 = 0;
        }
        int i14 = i5 + i12;
        if (c6rb != null) {
            c6rb.setBounds(i9, i12, i10, i14);
        }
        C6RB c6rb2 = this.A02;
        if (c6rb2 != null) {
            c6rb2.setBounds(i9, i14, i10, getIntrinsicHeight() - i7);
        }
    }
}
