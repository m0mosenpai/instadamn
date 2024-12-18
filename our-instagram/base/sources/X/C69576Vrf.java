package X;

import android.graphics.Paint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vrf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69576Vrf {
    public float A00;
    public final Paint A01;
    public final Map A02 = new HashMap();

    public final float A00(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Map map = this.A02;
        Character valueOf = Character.valueOf(c);
        if (map.containsKey(valueOf)) {
            Object obj = map.get(valueOf);
            if (obj != null) {
                return ((Number) obj).floatValue();
            }
            throw AbstractC166997dE.A0g();
        }
        return this.A01.measureText(String.valueOf(c));
    }

    public C69576Vrf(Paint paint) {
        this.A01 = paint;
        this.A00 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        this.A02.clear();
    }
}
