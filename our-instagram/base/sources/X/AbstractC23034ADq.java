package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.ADq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23034ADq {
    public static SpannableStringBuilder A00(Context context, String str, int i, int i2) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.append((CharSequence) str.toUpperCase(C1Q2.A02()));
        int[] iArr = C6QG.A0A;
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_wellbeing_illustrations_ballot_box, iArr[0]);
        AMr.A0A(resources, spannableStringBuilder, iArr, i);
        C4GL.A01(resources, A05, i2);
        C14360o3.A0B(A05, 2);
        ImageSpan imageSpan = new ImageSpan(A05, 1);
        spannableStringBuilder.insert(0, (CharSequence) " ");
        spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
        return spannableStringBuilder;
    }

    public static C194808jg A01(Context context, UserSession userSession, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null && !list.isEmpty()) {
            A1E.addAll(list);
        } else {
            A1E.add(context.getResources().getString(2131976940));
        }
        C202568xa c202568xa = new C202568xa(context, A1E);
        String str = (String) AbstractC166997dE.A0k(A1E);
        int A0F = AbstractC167017dG.A0F(context);
        float A0E = AbstractC166997dE.A0E(context.getResources());
        SpannableStringBuilder A00 = A00(context, str, A0F, R.dimen.asset_picker_static_sticker_last_row_padding);
        float f = A0F;
        AMr.A08(context, c202568xa, A0E, f, f);
        c202568xa.A0L(A00);
        return new C194808jg(context, userSession, Arrays.asList(c202568xa));
    }
}
