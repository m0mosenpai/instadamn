package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.9pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221169pe extends AbstractC210159Re {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final RectF A07;
    public final RectF A08;
    public final C9SG A09;
    public final C6RB A0A;
    public final C6RB A0B;
    public final int A0C;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0C;
    }

    @Override // X.AbstractC210159Re, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        super.A00.setAlpha(i);
        this.A09.setAlpha(i);
    }

    public C221169pe(Context context, User user, String str, int i) {
        String str2;
        this.A0C = i;
        Resources resources = context.getResources();
        this.A04 = AbstractC166997dE.A05(resources);
        this.A05 = AbstractC166997dE.A0A(resources);
        this.A06 = AbstractC166997dE.A06(resources);
        this.A02 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A00 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        C9SG c9sg = new C9SG(context);
        if (user != null) {
            c9sg.A00(user.Bhu());
        }
        c9sg.A01 = AbstractC166987dD.A04(resources, R.dimen.action_sheet_divider_margin_top);
        c9sg.invalidateSelf();
        int i2 = this.A01;
        c9sg.setBounds(0, 0, i2, i2);
        this.A09 = c9sg;
        Paint paint = super.A00;
        AbstractC166987dD.A1R(paint);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A0H(context, R.attr.igds_color_media_background));
        int i3 = ((i - (this.A04 * 2)) - this.A01) - this.A00;
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z, R.dimen.account_group_management_row_text_size);
        A0z.A0M(str);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        AbstractC166997dE.A1A(context, A0z, AbstractC53242c7.A0A(context));
        AEZ.A00(context, A0z);
        this.A0A = A0z;
        if (user != null) {
            str2 = user.getUsername();
        } else {
            str2 = "";
        }
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z2, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        A0z2.A0M(str2);
        A0z2.A0K(alignment);
        AbstractC167017dG.A10(context, A0z2, R.attr.igds_color_creation_tools_grey_05);
        AbstractC167017dG.A1N(context, A0z2);
        AbstractC166987dD.A1U(EnumC15950qp.A12, AbstractC15960qq.A00(context), A0z2);
        this.A0B = A0z2;
        int max = Math.max(this.A01, A0z2.A06 + this.A0A.A06) + (this.A04 * 2);
        this.A03 = max;
        float f = i;
        this.A08 = AbstractC166987dD.A0Y(f, max);
        this.A07 = new RectF(0.0f, this.A02, f, this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, AbstractC167017dG.A0Q(this, canvas));
        RectF rectF = this.A08;
        float f = this.A02;
        Paint paint = super.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.save();
        float f2 = this.A04;
        canvas.translate(f2, f2);
        this.A09.draw(canvas);
        canvas.restore();
        canvas.translate(f2 + this.A01 + this.A00, this.A05);
        this.A0A.draw(canvas);
        canvas.translate(0.0f, r0.A06 + this.A06);
        this.A0B.draw(canvas);
        canvas.restore();
    }
}
