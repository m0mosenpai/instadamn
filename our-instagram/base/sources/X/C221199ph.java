package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import com.facebook.R;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.9ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221199ph extends AbstractC202558xZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final RectF A03;
    public final RectF A04;
    public final C6RL A05;
    public final C221159pd A06;
    public final C6RB A07;
    public final int A08;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01 + this.A06.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public C221199ph(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        super(questionResponseReshareModel);
        this.A08 = i;
        Resources resources = context.getResources();
        this.A02 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A00 = AbstractC166997dE.A0A(resources);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_grey_09);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        Paint paint = super.A00;
        AbstractC166987dD.A1R(paint);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A0A(context));
        this.A06 = new C221159pd(context, questionResponseReshareModel.A07, i);
        C6RK c6rk = new C6RK(context, this, -1);
        c6rk.A02(R.dimen.account_discovery_bottom_gap);
        this.A05 = c6rk.A00();
        C6RB A0X = AbstractC167007dF.A0X(context, dimensionPixelSize, i);
        AbstractC166997dE.A1B(resources, A0X, R.dimen.backup_codes_text_size);
        String str = questionResponseReshareModel.A08;
        A0X.A0M(str == null ? "" : str);
        A0X.A0G(5, "…");
        A0X.A0F(A09);
        A0X.A0K(Layout.Alignment.ALIGN_CENTER);
        AEZ.A00(context, A0X);
        this.A07 = A0X;
        int i2 = (this.A02 * 2) + A0X.A06;
        this.A01 = i2;
        float f = i;
        this.A04 = AbstractC166987dD.A0Y(f, i2);
        this.A03 = AbstractC166987dD.A0Y(f, this.A01 - this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, AbstractC167017dG.A0Q(this, canvas));
        this.A06.draw(canvas);
        canvas.translate(0.0f, r0.A01);
        RectF rectF = this.A04;
        float f = this.A00;
        Paint paint = super.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A03, paint);
        canvas.save();
        int i = this.A08;
        AbstractC167007dF.A0u(canvas, this.A07, (i - r2.A0A) / 2, this.A02);
        canvas.restore();
        this.A05.draw(canvas);
    }
}
