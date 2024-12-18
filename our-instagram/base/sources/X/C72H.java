package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.72H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72H implements C65U {
    public final float A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C72H) && this.A00 == ((C72H) obj).A00;
        }
        return true;
    }

    @Override // X.C65U
    public final float Art(RectF rectF) {
        return this.A00 * rectF.height();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public C72H(float f) {
        this.A00 = f;
    }
}
