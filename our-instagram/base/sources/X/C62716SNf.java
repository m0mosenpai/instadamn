package X;

import java.util.Arrays;

/* renamed from: X.SNf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62716SNf {
    public final EnumC61229Riq A00;
    public final Integer A01;

    public /* synthetic */ C62716SNf(EnumC61229Riq enumC61229Riq, Integer num) {
        this.A00 = enumC61229Riq;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C62716SNf) {
                C62716SNf c62716SNf = (C62716SNf) obj;
                if (!SSI.A01(this.A00, c62716SNf.A00) || !SSI.A01(this.A01, c62716SNf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, null, null});
    }
}
