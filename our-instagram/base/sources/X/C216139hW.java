package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216139hW extends C5RN {
    public final int A00;
    public final Context A01;
    public final Drawable A02;
    public final C6RB A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A03.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable drawable = this.A02;
        C6RB c6rb = this.A03;
        if (drawable != null) {
            return AbstractC16960so.A1Q(drawable, c6rb);
        }
        return AbstractC166987dD.A1J(c6rb);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i;
        Drawable drawable = this.A02;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        return i + this.A00 + this.A03.A0A;
    }

    public C216139hW(Context context, int i) {
        this.A01 = context;
        this.A00 = AbstractC167017dG.A05(context);
        Drawable drawable = null;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_camera_filled_16);
        if (drawable2 != null) {
            AbstractC166997dE.A1F(drawable2, i);
            drawable2.setCallback(this);
            drawable = drawable2;
        }
        this.A02 = drawable;
        Spannable spannable = C6RB.A0d;
        C6RB A0Y = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.browser_error_screen_description_width);
        Integer num = C05F.A01;
        Context context2 = A0Y.A0Z;
        C14360o3.A07(context2);
        AbstractC180577zl.A00(context2, AbstractC167017dG.A0R(context2), A0Y, num);
        AbstractC166997dE.A1B(context2.getResources(), A0Y, R.dimen.account_discovery_bottom_gap);
        A0Y.A0F(i);
        AbstractC166987dD.A1Q(context2, A0Y, 2131971064);
        A0Y.setCallback(this);
        this.A03 = A0Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float A032 = AbstractC167007dF.A03(this, f);
        float A01 = AbstractC167007dF.A01(this, A03);
        float A02 = AbstractC167007dF.A02(this, f);
        float A05 = AbstractC166987dD.A05(this) + A03;
        Drawable drawable = this.A02;
        if (drawable != null) {
            int i5 = (int) A032;
            drawable.setBounds(i5, (int) A01, drawable.getIntrinsicWidth() + i5, (int) A05);
        }
        AbstractC167017dG.A1M(this.A03, A02 - r1.A0A, A03, A02);
    }
}
