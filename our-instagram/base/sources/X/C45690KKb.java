package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import java.util.List;

/* renamed from: X.KKb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45690KKb extends C5RN {
    public float A00;
    public boolean A01;
    public final ValueAnimator A02;
    public final Paint A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;
    public final NoteBubbleView A07;
    public final C45128JyU A08;
    public final KKZ A09;
    public final AbstractC44205Jg9 A0A;
    public final C44201Jg4 A0B;
    public final InterfaceC16820sZ A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;

    private final void A00() {
        int i;
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        NoteBubbleView noteBubbleView = this.A07;
        if (noteBubbleView != null) {
            noteBubbleView.measure(makeMeasureSpec, makeMeasureSpec);
        }
        C44201Jg4 c44201Jg4 = this.A0B;
        int A0H = AbstractC166997dE.A0H(c44201Jg4);
        int A0G = AbstractC166997dE.A0G(c44201Jg4);
        RectF rectF = this.A06;
        float f2 = this.A0D;
        float f3 = A0H / 2.0f;
        float f4 = this.A0E;
        rectF.set(f2 - f3, f4 - A0G, f2 + f3, f4);
        if (noteBubbleView != null) {
            i = noteBubbleView.getMeasuredWidth();
        } else {
            i = 0;
        }
        float max = Math.max(A0H, i) / 2.0f;
        this.A05.set(f2 - max, f4 - ((A0G + (noteBubbleView != null ? noteBubbleView.getMeasuredHeight() : 0)) - this.A0H), f2 + max, f4);
        Path path = this.A04;
        path.reset();
        float f5 = this.A0F;
        float f6 = f5 / 2.0f;
        float f7 = 0.0f;
        if (noteBubbleView != null) {
            f = noteBubbleView.getMeasuredWidth();
        } else {
            f = 0.0f;
        }
        float f8 = f - f6;
        if (noteBubbleView != null) {
            f7 = noteBubbleView.getMeasuredHeight();
        }
        path.addRoundRect(new RectF(f6, f6, f8, f7 - f6), f5, f5, Path.Direction.CW);
        KKZ kkz = this.A09;
        float f9 = f2 - (r2 / 2);
        float f10 = f4 + this.A0G;
        RectF rectF2 = new RectF(f9, f10, kkz.A05 + f9, kkz.A02 + f10);
        Rect A0U = AbstractC166987dD.A0U();
        rectF2.roundOut(A0U);
        kkz.setBounds(A0U);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        A00();
        canvas.save();
        float f = this.A00;
        RectF rectF = this.A05;
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
        canvas.save();
        RectF rectF2 = this.A06;
        canvas.translate(rectF2.left, rectF2.top);
        this.A0B.draw(canvas);
        canvas.restore();
        NoteBubbleView noteBubbleView = this.A07;
        if (noteBubbleView != null) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.drawPath(this.A04, this.A03);
            JQ0.A0z(noteBubbleView);
            noteBubbleView.draw(canvas);
            canvas.restore();
        }
        if (!this.A01) {
            this.A09.draw(canvas);
        }
        canvas.restore();
    }

    public C45690KKb(Context context, UserSession userSession, C45128JyU c45128JyU, InterfaceC16820sZ interfaceC16820sZ, float f, float f2, int i, int i2) {
        AbstractC44205Jg9 abstractC44205Jg9;
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A0I = context;
        this.A0D = f;
        this.A0E = f2;
        this.A08 = c45128JyU;
        this.A0C = interfaceC16820sZ;
        if (c45128JyU.A05()) {
            abstractC44205Jg9 = C45991KXf.A00;
        } else if (c45128JyU.A05 != null) {
            abstractC44205Jg9 = C45989KXd.A00;
        } else {
            abstractC44205Jg9 = C44206JgA.A00;
        }
        this.A0A = abstractC44205Jg9;
        this.A0B = new C44201Jg4(context, userSession, AbstractC44199Jg2.A00(c45128JyU), abstractC44205Jg9, new C50158MDl(this, 40));
        this.A05 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0X();
        this.A0H = AbstractC166997dE.A04(context, R.dimen.ad4ad_button_bottom_margin);
        this.A0G = AbstractC166997dE.A04(context, R.dimen.action_bar_item_spacing_left);
        float A04 = AbstractC166997dE.A04(context, R.dimen.abc_edit_text_inset_top_material);
        this.A0F = A04;
        Path A0T = AbstractC166987dD.A0T();
        A0T.setFillType(Path.FillType.WINDING);
        this.A04 = A0T;
        Paint A0S = AbstractC166987dD.A0S(A1V ? 1 : 0);
        A0S.setColor(0);
        A0S.setShadowLayer(A04, 0.0f, 0.0f, context.getColor(R.color.black_30_transparent));
        this.A03 = A0S;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, -5.0f, 0.0f, 5.0f, 0.0f).setDuration(250L);
        LMA.A01(duration, this, 28);
        LLs.A00(duration, this, 12);
        LLs.A00(duration, this, 11);
        LLs.A00(duration, this, 13);
        this.A02 = duration;
        this.A07 = AbstractC47028Kql.A00(context, null, userSession, c45128JyU.A05, c45128JyU.A07, c45128JyU.A0K);
        this.A09 = new KKZ(context, AbstractC44198Jg1.A05(context, c45128JyU.A02()), AbstractC43593JPy.A07(), false);
        setBounds(0, 0, i, i2);
        A00();
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A0B, this.A09);
    }
}
