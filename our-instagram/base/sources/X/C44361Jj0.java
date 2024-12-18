package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;

/* renamed from: X.Jj0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44361Jj0 extends Drawable implements Animator.AnimatorListener {
    public float A00;
    public C6RB A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final RectF A08;
    public final OvershootInterpolator A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        AbstractC166987dD.A0a(this.A0A).draw(canvas);
        RectF rectF = this.A08;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        canvas.save();
        float f = this.A00;
        canvas.scale(f, f, centerX, centerY);
        canvas.translate((centerX - (this.A01.A0A / 2)) - (this.A06 / 2), AbstractC166987dD.A0D(AbstractC166987dD.A0a(r3)) + this.A05);
        this.A01.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A03 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A04 = false;
        this.A03 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.A03 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A03 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static final C6RB A00(C44361Jj0 c44361Jj0, CharSequence charSequence) {
        Spannable spannable = C6RB.A0d;
        Context context = c44361Jj0.A07;
        C6RB A0z = AbstractC166987dD.A0z(context, context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
        Context context2 = A0z.A0Z;
        A0z.A0A(context2.getResources().getDimension(R.dimen.account_group_management_row_text_size));
        A0z.A0F(context2.getColor(AbstractC53242c7.A0E(context2)));
        A0z.A0L(AbstractC43592JPx.A07(charSequence));
        return A0z;
    }

    public /* synthetic */ C44361Jj0(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A07 = context;
        this.A05 = dimensionPixelOffset;
        this.A06 = dimensionPixelOffset2;
        this.A09 = new OvershootInterpolator(1.1f);
        this.A0A = AbstractC37302Gc3.A0m(this, 17);
        this.A00 = 1.0f;
        this.A04 = true;
        String A0q = AbstractC166997dE.A0q(context.getResources(), 2131969682);
        this.A02 = A0q;
        this.A01 = A00(this, A0q);
        this.A0B = AbstractC37302Gc3.A0m(this, 18);
        this.A08 = AbstractC166987dD.A0X();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.A08;
        rectF.set(i, i2, i3, i4);
        int max = Math.max(0, (i3 - i) - (this.A06 * 2));
        C6RB c6rb = this.A01;
        if (c6rb.A07 != max) {
            c6rb.A0E(max);
        }
        int centerX = (int) rectF.centerX();
        int centerY = (int) rectF.centerY();
        InterfaceC09390do interfaceC09390do = this.A0A;
        int i5 = centerY - (((C138586Po) interfaceC09390do.getValue()).A08 / 2);
        int intrinsicWidth = centerX - (AbstractC166987dD.A0a(interfaceC09390do).getIntrinsicWidth() / 2);
        AbstractC166987dD.A0a(interfaceC09390do).setBounds(intrinsicWidth, i5, AbstractC166987dD.A0a(interfaceC09390do).getIntrinsicWidth() + intrinsicWidth, centerY + ((C138586Po) interfaceC09390do.getValue()).A08);
    }
}
