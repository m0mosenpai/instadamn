package X;

import java.util.Arrays;

/* renamed from: X.EkC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33165EkC extends AbstractC36214FyS {
    @Override // X.AbstractC36214FyS
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C33165EkC)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC36214FyS
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), false, 3, false});
    }

    public C33165EkC(E90 e90) {
        super(e90);
    }

    public C33165EkC() {
        super(null);
    }
}
