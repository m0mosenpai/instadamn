package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class JVZ {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, C206379Bu c206379Bu, int i) {
        AbstractC167017dG.A1N(context, spannableStringBuilder);
        try {
            context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        } catch (Resources.NotFoundException unused) {
        }
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.RoleIndicatorStyle), i, AbstractC167007dF.A0A(c206379Bu.A03) + i, 33);
    }
}
