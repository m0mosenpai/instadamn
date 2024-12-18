package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8LG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LG {
    public int A01;
    public Integer A05;
    public String A06;
    public int A02 = -1;
    public TextColors A04 = TextColors.A03;
    public final List A07 = new ArrayList();
    public float A00 = 0.8f;
    public GradientDrawable.Orientation A03 = GradientDrawable.Orientation.TL_BR;

    public final void A02(int... iArr) {
        C14360o3.A0B(iArr, 0);
        for (int i : iArr) {
            this.A07.add(Integer.valueOf(i));
        }
    }

    public static TextColorScheme A00(Context context, C8LG c8lg, int i) {
        c8lg.A01 = context.getColor(i);
        return new TextColorScheme(c8lg);
    }

    public static void A01(Context context, C8LG c8lg, int i, int i2) {
        c8lg.A02(i2, context.getColor(i));
    }
}
