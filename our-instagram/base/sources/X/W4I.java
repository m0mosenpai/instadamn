package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* loaded from: classes11.dex */
public final class W4I {
    public final InterfaceC71843X7b A00;
    public final int A01;
    public final int A02;

    public final void A01(SpannableStringBuilder spannableStringBuilder, int i) {
        if (i >= 0) {
            int i2 = 34;
            int i3 = this.A02;
            if (i3 == 0) {
                i2 = 18;
            }
            int i4 = 255 - i;
            if (i4 < 0) {
                C0I2.A04("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
            }
            spannableStringBuilder.setSpan(this.A00, i3, this.A01, ((Math.max(i4, 0) << 16) & 16711680) | ((-16711681) & i2));
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public static void A00(InterfaceC71843X7b interfaceC71843X7b, List list, int i, int i2) {
        list.add(new W4I(interfaceC71843X7b, i, i2));
    }

    public W4I(InterfaceC71843X7b interfaceC71843X7b, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = interfaceC71843X7b;
    }
}
