package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A2V {
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0v1, java.lang.Object] */
    public static final C18160v1 A00(TextColorScheme textColorScheme) {
        int i;
        String str;
        C14360o3.A0B(textColorScheme, 0);
        ArrayList A1F = AbstractC166987dD.A1F(textColorScheme.A07);
        GradientDrawable.Orientation orientation = textColorScheme.A03;
        if (orientation == null) {
            i = -1;
        } else {
            i = AbstractC54345O0d.A00[orientation.ordinal()];
        }
        int i2 = 3;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            AbstractC002900t.A10(AbstractC001800i.A0U(A1F));
        }
        GradientDrawable.Orientation orientation2 = textColorScheme.A03;
        if (orientation2 != null) {
            switch (AbstractC54345O0d.A00[orientation2.ordinal()]) {
                case 1:
                case 5:
                    i2 = 0;
                    break;
                case 2:
                case 6:
                    i2 = 1;
                    break;
                case 4:
                case 8:
                    i2 = 2;
                    break;
            }
            List list = C18160v1.A03;
            Integer num = textColorScheme.A05;
            if (num != null) {
                str = AEX.A01(num);
            } else {
                str = null;
            }
            ?? obj = new Object();
            obj.A02 = A1F;
            obj.A00 = i2;
            obj.A01 = str;
            return obj;
        }
        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(orientation2, "Unknown drawable orientation ", AbstractC166987dD.A1C()));
    }
}
