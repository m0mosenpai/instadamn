package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class JVJ {
    public static final Drawable A00(Context context, UserSession userSession) {
        int i;
        if (C18U.A06(C06090Tz.A05, userSession, 36328890678918999L)) {
            Drawable drawable = context.getDrawable(R.drawable.instagram_view_once_pano_outline_24);
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            float f = i;
            float A04 = 1.0f - ((f - (AbstractC13880nE.A04(context, 4) * 2.0f)) / f);
            return new ScaleDrawable(drawable, 17, A04, A04);
        }
        return context.getDrawable(R.drawable.direct_visual_message_view_once_filled);
    }

    public static final Drawable A01(JU0 ju0, JVI jvi) {
        C7QL c7ql = jvi.A01;
        boolean z = c7ql.A06;
        Drawable drawable = ju0.A03;
        AbstractC1580577p.A07(drawable, c7ql, false, z, c7ql.A07);
        return drawable;
    }

    public static final SpannableStringBuilder A02(StyleSpan styleSpan, String str) {
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        A01.append((CharSequence) str);
        A01.setSpan(styleSpan, 0, str.length(), 33);
        return A01;
    }
}
