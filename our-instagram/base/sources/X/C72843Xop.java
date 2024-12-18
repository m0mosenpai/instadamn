package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Xop, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72843Xop {
    public C62989SaD A00 = C62989SaD.A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass().equals(obj.getClass()) && Util.A0F(this.A00, ((C72843Xop) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) (0 >>> 32);
        return AbstractC166987dD.A0I(this.A00, (((6464647 + i) * 31) + i) * 31 * 31);
    }
}
