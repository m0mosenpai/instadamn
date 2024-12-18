package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;

/* renamed from: X.NzB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54291NzB {
    /* JADX WARN: Multi-variable type inference failed */
    public static final SpannableStringBuilder A00(Context context, OUX oux) {
        String A03;
        boolean z = oux.A0B;
        long j = oux.A04;
        if (z) {
            A03 = C23831Eq.A06(context, j * 1000);
        } else {
            A03 = C23831Eq.A03(context, j);
        }
        SpannableString spannableString = new SpannableString(context.getString(2131965734));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.green_5)), 0, spannableString.length(), 0);
        String str = spannableString;
        if (!oux.A0A) {
            str = A03;
        }
        return AbstractC25225BEi.A0H(str);
    }
}
