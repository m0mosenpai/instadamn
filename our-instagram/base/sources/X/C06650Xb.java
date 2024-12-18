package X;

import java.util.Arrays;

/* renamed from: X.0Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06650Xb {
    public static final C06650Xb A01 = new C06650Xb(-1);
    public static final C06650Xb A02 = new C06650Xb(-2);
    public static final C06650Xb A03 = new C06650Xb(new int[0]);
    public final int[] A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C06650Xb) obj).A00) && Arrays.equals((int[]) null, (int[]) null));
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode((int[]) null);
    }

    public C06650Xb(int... iArr) {
        this.A00 = iArr;
    }

    public final String toString() {
        return AnonymousClass001.A11("{normalMarkers: ", Arrays.toString(this.A00), ", metadataMarkers: ", Arrays.toString((int[]) null), "}");
    }

    public C06650Xb(int[] iArr, int[] iArr2) {
        this.A00 = iArr;
    }
}
