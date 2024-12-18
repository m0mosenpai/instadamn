package X;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.EditText;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;

/* renamed from: X.AHf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23116AHf {
    public static final void A01(EditText editText, TextColorScheme textColorScheme) {
        C14360o3.A0B(editText, 1);
        Editable A00 = A00(editText.getHint());
        if (A00 != null) {
            TextColors textColors = textColorScheme.A04;
            if (textColors != null) {
                Context A0L = AbstractC166997dE.A0L(editText);
                C190868ci c190868ci = (C190868ci) C4GL.A00(A00, C190868ci.class);
                if (c190868ci == null) {
                    C190868ci c190868ci2 = new C190868ci(A0L, textColors);
                    c190868ci2.A03 = 128;
                    AbstractC167017dG.A15(A00, c190868ci2);
                } else {
                    c190868ci.A00(textColors);
                }
            }
            editText.setHint(A00);
            editText.invalidate();
        }
    }

    public static final void A02(EditText editText, C190888ck c190888ck) {
        AbstractC167017dG.A1P(c190888ck, editText);
        Editable A00 = A00(editText.getHint());
        if (A00 != null) {
            Context A0L = AbstractC166997dE.A0L(editText);
            TextPaint paint = editText.getPaint();
            C14360o3.A07(paint);
            AbstractC202898y7.A01(A00, c190888ck, false);
            AbstractC202838y1.A02(A0L, A00, c190888ck);
            AbstractC202928yA.A01(A0L, paint, A00, c190888ck);
            AbstractC202948yC.A00(editText, c190888ck, null);
            AbstractC202958yD.A00(A00, c190888ck);
            editText.setHint(A00);
        }
    }

    public static final Editable A00(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Editable)) {
            charSequence = new SpannableStringBuilder(charSequence);
        }
        return (Editable) charSequence;
    }
}
