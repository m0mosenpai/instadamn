package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class LHC {
    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, String str, int i) {
        String A0R = AnonymousClass001.A0R(str, " ");
        spannableStringBuilder.append((CharSequence) A0R);
        int length = spannableStringBuilder.length() - (AbstractC167007dF.A0A(A0R) + 1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.igds_emphasized_body_2), length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, length2, 33);
    }

    public static final String A00(String str, String str2) {
        String A1A = AbstractC25228BEl.A1A(str);
        String A1A2 = AbstractC25228BEl.A1A(str2);
        boolean A0V = AbstractC001900j.A0V(A1A, '.');
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (A0V) {
            A1C.append(A1A);
            A1C.append(' ');
        } else {
            A1C.append(A1A);
            A1C.append(". ");
        }
        return AbstractC166997dE.A0x(A1A2, A1C);
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_lock_filled_12);
        if (drawable != null) {
            int A0A = AbstractC167017dG.A0A(context);
            drawable.setBounds(0, 0, A0A, A0A);
            AbstractC166997dE.A1F(drawable.mutate(), i);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new C85973sR(drawable), 0, 1, 33);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
