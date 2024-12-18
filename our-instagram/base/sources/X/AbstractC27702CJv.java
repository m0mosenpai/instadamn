package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.CJv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27702CJv {
    public static final String A00(Context context) {
        C14360o3.A0B(context, 0);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s: v%s (Build #%d) \nBuild time: %s", EnumC12920le.A02.A00(), AbstractC12880la.A04(context), Integer.valueOf(AbstractC12880la.A00()), DateFormat.getDateTimeInstance(3, 3, C1Q2.A02()).format((Date) new java.sql.Date(AbstractC12880la.A01(context))));
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
