package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4UJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UJ {
    public static final C4UJ A04 = new C4UJ(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4UJ)) {
            return false;
        }
        C4UJ c4uj = (C4UJ) obj;
        return this.A03 == c4uj.A03 && this.A01 == c4uj.A01 && this.A02 == c4uj.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1501));
        sb.append(this.A03);
        sb.append(MSV.A00(StringTreeSet.MAX_SYMBOL_COUNT));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1411));
        sb.append(this.A02);
        sb.append(']');
        return sb.toString();
    }

    public C4UJ(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (Util.A0G(i3)) {
            i4 = Util.A03(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }
}
