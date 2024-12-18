package X;

/* renamed from: X.5aW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119145aW implements Comparable {
    public final float A00;

    public static final boolean A01(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((C119145aW) obj).A00);
    }

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C119145aW) || Float.compare(f, ((C119145aW) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }

    public static String A00(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(".dp");
        return sb.toString();
    }
}
