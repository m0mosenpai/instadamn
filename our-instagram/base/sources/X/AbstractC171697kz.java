package X;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC171697kz {
    public static final List A01() {
        return AbstractC009903n.A0J(new EnumC1828489f[]{EnumC1828489f.A0H, EnumC1828489f.A0B, EnumC1828489f.A09, EnumC1828489f.A0M, EnumC1828489f.A0L});
    }

    public static final String A00(float f) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        C14360o3.A07(numberFormat);
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        String format = numberFormat.format(Float.valueOf(f));
        C14360o3.A07(format);
        return format;
    }
}
