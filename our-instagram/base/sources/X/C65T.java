package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.65T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65T implements C65U {
    public final float A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65T) && this.A00 == ((C65T) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public C65T(float f) {
        this.A00 = f;
    }

    @Override // X.C65U
    public final float Art(RectF rectF) {
        return this.A00;
    }
}
