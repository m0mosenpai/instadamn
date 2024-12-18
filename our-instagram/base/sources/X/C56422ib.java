package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.2ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56422ib {
    public Paint A00;
    public final C56432ic A01 = new C56432ic();

    public static Drawable A00(Resources resources, C3PQ c3pq, C56422ib c56422ib) {
        try {
            String str = c3pq.A05;
            if (str == null) {
                str = c3pq.A04;
            }
            return c56422ib.A04(resources, str, c3pq.A03, c3pq.A00, c3pq.A02);
        } finally {
            C3PQ.A06.EE6(c3pq);
        }
    }

    public static C3PQ A01(Resources resources, AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC55922hc.A1m);
        try {
            String A03 = A03(obtainAttributes.getString(2));
            String str = null;
            if (A03 != null) {
                if (!TextUtils.isEmpty(null)) {
                    A03 = AnonymousClass001.A0R(A03, null);
                }
            } else {
                string = obtainAttributes.getString(4);
                if (string != null) {
                    if (!TextUtils.isEmpty(null)) {
                        str = AnonymousClass001.A0R(string, null);
                    }
                    return C3PQ.A00(string, A03, i, obtainAttributes.getDimensionPixelSize(1, 0), obtainAttributes.getDimensionPixelSize(0, 0), obtainAttributes.getInteger(3, 0));
                }
            }
            string = str;
            return C3PQ.A00(string, A03, i, obtainAttributes.getDimensionPixelSize(1, 0), obtainAttributes.getDimensionPixelSize(0, 0), obtainAttributes.getInteger(3, 0));
        } finally {
            obtainAttributes.recycle();
        }
    }

    public static C3PQ A02(String str, int i) {
        String formatStrLocaleSafe;
        String[] split = str.split("\\|");
        if (split.length == 6) {
            String A03 = A03(split[2]);
            if (A03 != null) {
                formatStrLocaleSafe = null;
                if (!TextUtils.isEmpty(null)) {
                    A03 = AnonymousClass001.A0R(A03, null);
                }
            } else {
                String str2 = split[1];
                if (TextUtils.isEmpty(str2)) {
                    formatStrLocaleSafe = null;
                } else {
                    formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://lookaside.facebook.com/redrawable/%s/", str2);
                }
                if (formatStrLocaleSafe != null && !TextUtils.isEmpty(null)) {
                    formatStrLocaleSafe = AnonymousClass001.A0R(formatStrLocaleSafe, null);
                }
            }
            return C3PQ.A00(formatStrLocaleSafe, A03, i, Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]));
        }
        throw new RuntimeException(AnonymousClass001.A0R("Unexpected inline redrawable format: ", str));
    }

    public static String A03(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 12) {
            return null;
        }
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 100.0f);
        int i2 = i / 100;
        int i3 = (i / 10) % 10;
        int i4 = i % 10;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        if (i3 > 0) {
            sb.append('.');
            sb.append(i3);
            if (i4 > 0) {
                sb.append(i4);
            }
        }
        return StringFormatUtil.formatStrLocaleSafe("https://lookaside.facebook.com/ras/v2/?id=%s&cfg=d$%sx", str, sb.toString());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.3PR, android.graphics.drawable.Drawable] */
    public final C3PR A04(Resources resources, String str, int i, int i2, int i3) {
        Paint paint;
        float f = resources.getDisplayMetrics().densityDpi / i3;
        int ceil = (int) Math.ceil(i * f);
        int ceil2 = (int) Math.ceil(i2 * f);
        C17280tP A00 = C17280tP.A4E.A00();
        if (!((Boolean) A00.A2Q.CES(A00, C17280tP.A4G[15])).booleanValue()) {
            paint = null;
        } else {
            paint = this.A00;
            if (paint == null) {
                paint = new Paint();
                paint.setColor(-1996553985);
                this.A00 = paint;
            }
        }
        C14360o3.A0B(str, 1);
        ?? drawable = new Drawable();
        C3PS c3ps = new C3PS(paint);
        drawable.A00 = c3ps;
        C3PT c3pt = c3ps.A01;
        c3pt.A03 = new SimpleImageUrl(str, ceil, ceil2);
        C1OG A0J = C25821No.A00().A0J(c3pt.A03, null);
        A0J.A02(c3pt);
        A0J.A0I = false;
        c3pt.A02 = A0J.A00();
        return drawable;
    }
}
