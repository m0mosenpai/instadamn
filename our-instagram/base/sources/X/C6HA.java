package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.common.ui.threaddecoration.ThreadDecorationModifierElement;

/* renamed from: X.6HA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6HA {
    public static final Modifier A00(Modifier modifier, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(modifier, 0);
        C14360o3.A0B(num, 1);
        if (z) {
            if (num != C05F.A00) {
                modifier = modifier.Eq3(new ThreadDecorationModifierElement(num));
            }
            if (z2 && num != C05F.A0Y) {
                return modifier.Eq3(AbstractC118175Wb.A0E(Modifier.A00, 60.0f - 12.0f, 0.0f, 0.0f, 0.0f));
            }
            return modifier;
        }
        return modifier;
    }
}
