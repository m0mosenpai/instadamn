package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import com.facebook.R;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.user.model.User;

/* renamed from: X.9pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221209pi extends AbstractC202558xZ {
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
    public final C221169pe A0A;
    public final C6RB A0B;
    public final C6RB A0C;
    public final int A0D;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03 + this.A0A.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0D;
    }

    @Override // X.AbstractC202558xZ, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A09.setAlpha(i);
        this.A0C.setAlpha(i);
        super.A00.setAlpha(i);
        invalidateSelf();
    }

    public C221209pi(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        super(questionResponseReshareModel);
        this.A0D = i;
        Resources resources = context.getResources();
        this.A04 = AbstractC166997dE.A05(resources);
        this.A02 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A05 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A06 = AbstractC166997dE.A06(resources);
        this.A00 = AbstractC166997dE.A0A(resources);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        C9SG c9sg = new C9SG(context);
        c9sg.A01 = AbstractC166987dD.A04(resources, R.dimen.action_sheet_divider_margin_top);
        c9sg.invalidateSelf();
        User user = questionResponseReshareModel.A06;
        if (user != null) {
            c9sg.A00(user.Bhu());
        }
        int i2 = this.A01;
        c9sg.setBounds(0, 0, i2, i2);
        this.A09 = c9sg;
        int i3 = ((i - (this.A04 * 2)) - this.A01) - this.A00;
        Paint paint = super.A00;
        AbstractC166987dD.A1R(paint);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A0A(context));
        this.A0A = new C221169pe(context, questionResponseReshareModel.A05, questionResponseReshareModel.A07, i);
        C6RB A0z = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z, R.dimen.account_group_management_row_text_size);
        String str = questionResponseReshareModel.A08;
        A0z.A0M(str == null ? "" : str);
        A0z.A0G(5, "…");
        AbstractC167017dG.A10(context, A0z, R.attr.igds_color_text_on_white);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        AEZ.A00(context, A0z);
        this.A0B = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i3);
        AbstractC166997dE.A1B(resources, A0z2, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        if (user != null) {
            A0z2.A0M(user.getUsername());
        }
        A0z2.A0K(alignment);
        AbstractC167017dG.A10(context, A0z2, R.attr.igds_color_creation_tools_grey_05);
        AbstractC167017dG.A1N(context, A0z2);
        AbstractC166987dD.A1U(EnumC15950qp.A12, AbstractC15960qq.A00(context), A0z2);
        this.A0C = A0z2;
        int max = Math.max(this.A01, A0z2.A06 + this.A0B.A06) + (this.A04 * 2);
        this.A03 = max;
        float f = i;
        this.A08 = AbstractC166987dD.A0Y(f, max);
        this.A07 = AbstractC166987dD.A0Y(f, this.A03 - this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, AbstractC167017dG.A0Q(this, canvas));
        this.A0A.draw(canvas);
        canvas.translate(0.0f, r0.A03);
        RectF rectF = this.A08;
        float f = this.A02;
        Paint paint = super.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.save();
        float f2 = this.A04;
        canvas.translate(f2, f2);
        AbstractC167007dF.A0t(canvas, this.A09);
        canvas.translate(f2 + this.A01 + this.A00, this.A05);
        this.A0B.draw(canvas);
        canvas.translate(0.0f, r0.A06 + this.A06);
        this.A0C.draw(canvas);
        canvas.restore();
        canvas.restore();
    }
}
