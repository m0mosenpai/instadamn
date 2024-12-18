package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spannable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216099hS extends C5RN {
    public final GradientDrawable A00;
    public final LayerDrawable A01;
    public final C6RB A02;
    public final List A03;

    @Override // X.C5RN
    public final List A07() {
        return this.A03;
    }

    public final void A08(int[] iArr, int[] iArr2) {
        this.A00.setColors(iArr);
        C6RB c6rb = this.A02;
        C4GL.A05(c6rb.A0F, APp.class);
        C4GL.A05(c6rb.A0F, C9T8.class);
        Spannable spannable = c6rb.A0F;
        spannable.setSpan(new APp(null, iArr2), 0, spannable.length(), 33);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A01.draw(canvas);
        this.A02.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
        C6RB c6rb = this.A02;
        int i7 = c6rb.A0A / 2;
        int i8 = c6rb.A06 / 2;
        c6rb.setBounds(i5 - i7, i6 - i8, i5 + i7, i6 + i8);
    }

    public C216099hS(Context context, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        Resources resources = context.getResources();
        LayerDrawable layerDrawable = (LayerDrawable) context.getDrawable(R.drawable.quiz_sticker_answer_icon_outline);
        this.A01 = layerDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.gradient_layer);
        findDrawableByLayerId.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId.mutate();
        this.A00 = gradientDrawable;
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        Spannable spannable = C6RB.A0d;
        C6RB A0Y = AbstractC167007dF.A0Y(context, resources, R.dimen.abc_dialog_padding_material);
        this.A02 = A0Y;
        A0Y.A0M(str);
        AbstractC166997dE.A1B(resources, A0Y, R.dimen.challenge_sticker_button_text_size);
        AEZ.A00(context, A0Y);
        Collections.addAll(A1E, layerDrawable, A0Y);
    }
}
