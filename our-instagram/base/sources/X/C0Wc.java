package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.0Wc, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wc implements C0Zo {
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0Wc)) {
            return false;
        }
        C0Wc c0Wc = (C0Wc) obj;
        if (this.A01 != c0Wc.A01 || this.A00 != c0Wc.A00) {
            return false;
        }
        return true;
    }

    @Override // X.C0Zo
    public final boolean isEmpty() {
        if (this.A01 == 0 && this.A00 == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "%d,%d", Integer.valueOf(this.A01), Integer.valueOf(this.A00));
    }

    @Override // X.C0Zo
    public final void E7t(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer.getInt();
        this.A00 = byteBuffer.getInt();
    }
}
