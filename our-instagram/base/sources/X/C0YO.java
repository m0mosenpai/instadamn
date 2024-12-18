package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.0YO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YO implements C0Zo {
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0YO)) {
            return false;
        }
        C0YO c0yo = (C0YO) obj;
        if (this.A01 != c0yo.A01 || this.A00 != c0yo.A00) {
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
