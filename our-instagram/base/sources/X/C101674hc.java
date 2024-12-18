package X;

import java.util.Arrays;

/* renamed from: X.4hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101674hc extends C0T6 {
    public int A00;
    public long A01;
    public EnumC101664hb A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C101674hc)) {
            return false;
        }
        C101674hc c101674hc = (C101674hc) obj;
        return this.A01 == c101674hc.A01 && this.A02 == c101674hc.A02 && this.A00 == c101674hc.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
