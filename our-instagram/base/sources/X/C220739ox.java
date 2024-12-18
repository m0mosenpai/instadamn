package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220739ox extends AbstractC130945vi {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final C216229hf A04;
    public final C6RB A05;
    public final int A06;
    public final int A07;
    public final List A08;

    @Override // X.AbstractC130945vi
    public final boolean A0A() {
        return false;
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A05.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A04.A00 + this.A07 + this.A06 + this.A00;
        C6RB c6rb = this.A05;
        return (i + c6rb.A06) - c6rb.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A02 / 2.0f;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f3 = A03 - A06;
        float f4 = A03 + A06;
        C216229hf c216229hf = this.A04;
        int i5 = c216229hf.A00;
        C6RB c6rb = this.A05;
        int i6 = c6rb.A0A;
        int i7 = c6rb.A06;
        int i8 = c6rb.A08;
        int i9 = this.A07;
        int i10 = ((i9 + i7) - i8) + this.A00;
        AbstractC166997dE.A1E(c216229hf, f - f2, f3, f2 + f, f4);
        float f5 = i6 / 2.0f;
        float f6 = f3 + i5;
        float f7 = i8;
        c6rb.setBounds((int) (f - f5), (int) ((i9 + f6) - f7), (int) (f + f5), (int) (f6 + i10 + f7));
    }

    public C220739ox(Context context) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A08 = A1E;
        this.A03 = context;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A02 = dimensionPixelSize;
        int A05 = AbstractC166997dE.A05(resources);
        this.A01 = resources.getDimensionPixelSize(R.dimen.fundraiser_sticker_title_text_size);
        this.A07 = AbstractC166997dE.A0C(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A00 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int i = dimensionPixelSize - (A05 * 2);
        C216229hf c216229hf = new C216229hf(context);
        this.A04 = c216229hf;
        c216229hf.A0F(GradientDrawable.Orientation.TL_BR);
        c216229hf.A09(AbstractC166997dE.A01(context));
        c216229hf.setCallback(this);
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        this.A05 = A0z;
        Collections.addAll(A1E, c216229hf, A0z);
        Context context2 = this.A03;
        C6RB c6rb = this.A05;
        AMr.A06(context2, c6rb, this.A01, this.A00);
        c6rb.A0F(-16777216);
        c6rb.setCallback(this);
    }
}
