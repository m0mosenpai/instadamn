package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;

/* renamed from: X.0SQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0SQ extends AbstractC12480kr {
    @Override // X.C011304b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SQ)) {
            return false;
        }
        AbstractC17720u9 abstractC17720u9 = (AbstractC17720u9) obj;
        return C02O.A00(this.A04, abstractC17720u9.A04) && C02O.A00(((AbstractC17720u9) this).A00, abstractC17720u9.A00);
    }

    @Override // X.C011304b
    public final C007402o A07() {
        DisplayCutout displayCutout = this.A04.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C007402o(displayCutout);
    }

    @Override // X.C011304b
    public final C011504d A08() {
        WindowInsets consumeDisplayCutout = this.A04.consumeDisplayCutout();
        C011504d c011504d = C011504d.A01;
        consumeDisplayCutout.getClass();
        return new C011504d(consumeDisplayCutout);
    }

    @Override // X.C011304b
    public final int hashCode() {
        return this.A04.hashCode();
    }
}
