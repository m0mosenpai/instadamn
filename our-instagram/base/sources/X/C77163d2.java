package X;

import android.content.Context;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.3d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77163d2 {
    public static final void A00(Context context) {
        int hashCode = Arrays.hashCode(new Object[]{context.getTheme(), Boolean.valueOf(AbstractC72723Nt.A00(context))});
        Integer num = C77143d0.A0D;
        if (num == null || hashCode != num.intValue()) {
            C77143d0.A0B = null;
        }
        C77143d0.A0D = Integer.valueOf(hashCode);
    }

    public final C77143d0 A01(Context context) {
        A00(context);
        C77143d0 c77143d0 = C77143d0.A0B;
        if (c77143d0 == null) {
            int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
            C77143d0 c77143d02 = new C77143d0(context.getColor(AbstractC53242c7.A0H(context, R.attr.textColorPrimary)), context.getColor(AbstractC53242c7.A0H(context, R.attr.textColorBoldLink)), context.getColor(AbstractC53242c7.A0H(context, R.attr.textColorLocation)), context.getColor(AbstractC53242c7.A0H(context, R.attr.textColorPrimary)), color, context.getColor(AbstractC53242c7.A0H(context, R.attr.glyphColorPrimary)), context.getColor(AbstractC53242c7.A0H(context, R.attr.glyphColorSecondaryActive)), AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text), AbstractC53242c7.A0H(context, R.attr.igds_color_stroke), color, true);
            C77143d0.A0B = c77143d02;
            return c77143d02;
        }
        return c77143d0;
    }
}
