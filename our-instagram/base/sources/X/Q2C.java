package X;

import android.graphics.Paint;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes10.dex */
public final class Q2C extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((AbstractC58322PtE.A03(i) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(AbstractC58322PtE.A03(i));
        }
    }
}
