package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216159hY extends C5RN {
    public final int A00;
    public final Drawable A01;
    public final C6RB A02;
    public final int A03;
    public final Context A04;

    public C216159hY(Context context, Integer num) {
        int i;
        Integer valueOf;
        Drawable drawable;
        Drawable drawable2;
        C14360o3.A0B(num, 2);
        this.A04 = context;
        int A03 = AbstractC167017dG.A03(context);
        this.A00 = A03;
        this.A03 = AbstractC167017dG.A05(context);
        int A00 = AEQ.A00(context, num);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                valueOf = null;
                drawable = null;
                if (valueOf != null && (drawable2 = context.getDrawable(valueOf.intValue())) != null) {
                    AbstractC166997dE.A1F(drawable2, A00);
                    drawable2.setCallback(this);
                    drawable2.setBounds(0, 0, A03, A03);
                    drawable = drawable2;
                }
                this.A01 = drawable;
                Spannable spannable = C6RB.A0d;
                C6RB A0Y = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.ar_effect_picker_background_height);
                Integer num2 = C05F.A01;
                Context context2 = A0Y.A0Z;
                C14360o3.A07(context2);
                AbstractC180577zl.A00(context2, AbstractC167017dG.A0R(context2), A0Y, num2);
                AbstractC166997dE.A1B(context2.getResources(), A0Y, R.dimen.challenge_sticker_button_text_size);
                A0Y.A0F(A00);
                A0Y.A0M(AEQ.A01(context2, num));
                A0Y.setCallback(this);
                this.A02 = A0Y;
            }
            i = R.drawable.instagram_alert_pano_filled_24;
        } else {
            i = R.drawable.instagram_alert_check_pano_filled_24;
        }
        valueOf = Integer.valueOf(i);
        drawable = null;
        if (valueOf != null) {
            AbstractC166997dE.A1F(drawable2, A00);
            drawable2.setCallback(this);
            drawable2.setBounds(0, 0, A03, A03);
            drawable = drawable2;
        }
        this.A01 = drawable;
        Spannable spannable2 = C6RB.A0d;
        C6RB A0Y2 = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.ar_effect_picker_background_height);
        Integer num22 = C05F.A01;
        Context context22 = A0Y2.A0Z;
        C14360o3.A07(context22);
        AbstractC180577zl.A00(context22, AbstractC167017dG.A0R(context22), A0Y2, num22);
        AbstractC166997dE.A1B(context22.getResources(), A0Y2, R.dimen.challenge_sticker_button_text_size);
        A0Y2.A0F(A00);
        A0Y2.A0M(AEQ.A01(context22, num));
        A0Y2.setCallback(this);
        this.A02 = A0Y2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A02.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable drawable = this.A01;
        C6RB c6rb = this.A02;
        if (drawable != null) {
            return AbstractC16960so.A1Q(drawable, c6rb);
        }
        return AbstractC166987dD.A1J(c6rb);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        if (this.A01 == null) {
            i = 0;
        } else {
            i = this.A00;
        }
        int i2 = this.A02.A06;
        if (i <= i2) {
            return i2;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i;
        if (this.A01 == null) {
            i = 0;
        } else {
            i = this.A00;
        }
        return i + this.A03 + this.A02.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float intrinsicWidth = getIntrinsicWidth() / 2.0f;
        float f2 = f - intrinsicWidth;
        float A01 = AbstractC167007dF.A01(this, A03);
        float f3 = f + intrinsicWidth;
        int A0C = AbstractC166987dD.A0C(this.A04, 16);
        Drawable drawable = this.A01;
        if (drawable != null) {
            int i5 = (int) f2;
            int i6 = (int) A01;
            drawable.setBounds(i5, i6, i5 + A0C, A0C + i6);
        }
        AbstractC167017dG.A1M(this.A02, f3 - r1.A0A, A03, f3);
    }
}
