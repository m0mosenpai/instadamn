package X;

import android.graphics.RectF;

/* renamed from: X.CfV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28369CfV {
    public final long A00;

    public static RectF A01(float f, float f2, long j) {
        return new RectF(f, f2, f + Float.intBitsToFloat((int) (j >> 32)), f2 + A00(j));
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C28369CfV) || j != ((C28369CfV) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("Size(packedValue=", ')', this.A00);
    }

    public static final float A00(long j) {
        return AbstractC25232BEp.A00(j);
    }
}
