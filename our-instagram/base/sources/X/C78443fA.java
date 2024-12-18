package X;

/* renamed from: X.3fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78443fA {
    public static final C78443fA A00 = new Object();

    public final long A00(int i, int i2, int i3, int i4) {
        AbstractC78423f8 abstractC78423f8;
        AbstractC78423f8 abstractC78423f82;
        if (i == i2) {
            abstractC78423f8 = C78413f7.A00;
        } else if (i == 0) {
            abstractC78423f8 = C78433f9.A00;
        } else {
            abstractC78423f8 = C26670Bq5.A00;
        }
        if (i3 == i4) {
            abstractC78423f82 = C78413f7.A00;
        } else if (i3 == 0) {
            abstractC78423f82 = C78433f9.A00;
        } else {
            abstractC78423f82 = C26670Bq5.A00;
        }
        C17u c17u = abstractC78423f8.A01;
        int i5 = c17u.A00;
        int i6 = c17u.A01;
        C17u c17u2 = abstractC78423f82.A01;
        int i7 = c17u2.A00;
        int i8 = c17u2.A01;
        if (i >= 0) {
            if (i3 >= 0) {
                if (i > i5 && i != Integer.MAX_VALUE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("minWidth must be <= ");
                    sb.append(i5);
                    sb.append(", but was: ");
                    sb.append(i);
                    sb.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
                    sb.append(i);
                    sb.append(", maxWidth=");
                    sb.append(i2);
                    sb.append(", minHeight=");
                    sb.append(i3);
                    sb.append(", maxHeight=");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (i2 > i6 && i2 != Integer.MAX_VALUE) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("maxWidth must be <= ");
                    sb2.append(i6);
                    sb2.append(", but was: ");
                    sb2.append(i2);
                    sb2.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
                    sb2.append(i);
                    sb2.append(", maxWidth=");
                    sb2.append(i2);
                    sb2.append(", minHeight=");
                    sb2.append(i3);
                    sb2.append(", maxHeight=");
                    sb2.append(i4);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (i3 > i7 && i3 != Integer.MAX_VALUE) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("minHeight must be <= ");
                    sb3.append(i7);
                    sb3.append(", but was: ");
                    sb3.append(i3);
                    sb3.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
                    sb3.append(i);
                    sb3.append(", maxWidth=");
                    sb3.append(i2);
                    sb3.append(", minHeight=");
                    sb3.append(i3);
                    sb3.append(", maxHeight=");
                    sb3.append(i4);
                    throw new IllegalArgumentException(sb3.toString());
                }
                if (i4 > i8 && i4 != Integer.MAX_VALUE) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("maxHeight must be <= ");
                    sb4.append(i8);
                    sb4.append(", but was: ");
                    sb4.append(i4);
                    sb4.append(". Components this big may affect performance and lead to out of memory errors. minWidth=");
                    sb4.append(i);
                    sb4.append(", maxWidth=");
                    sb4.append(i2);
                    sb4.append(", minHeight=");
                    sb4.append(i3);
                    sb4.append(", maxHeight=");
                    sb4.append(i4);
                    throw new IllegalArgumentException(sb4.toString());
                }
                if (i <= i2) {
                    if (i3 <= i4) {
                        return (abstractC78423f8.A04(i, i2) << 32) | abstractC78423f82.A04(i3, i4);
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("maxHeight must be >= minHeight, but was: maxHeight=");
                    sb5.append(i4);
                    sb5.append("; minHeight=");
                    sb5.append(i3);
                    sb5.append(". minWidth=");
                    sb5.append(i);
                    sb5.append(", maxWidth=");
                    sb5.append(i2);
                    sb5.append(", minHeight=");
                    sb5.append(i3);
                    sb5.append(", maxHeight=");
                    sb5.append(i4);
                    throw new IllegalArgumentException(sb5.toString());
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("maxWidth must be >= minWidth, but was: maxWidth=");
                sb6.append(i2);
                sb6.append("; minWidth=");
                sb6.append(i);
                sb6.append(". minWidth=");
                sb6.append(i);
                sb6.append(", maxWidth=");
                sb6.append(i2);
                sb6.append(", minHeight=");
                sb6.append(i3);
                sb6.append(", maxHeight=");
                sb6.append(i4);
                throw new IllegalArgumentException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("minHeight must be >= 0, but was: ");
            sb7.append(i3);
            sb7.append(". minWidth=");
            sb7.append(i);
            sb7.append(", maxWidth=");
            sb7.append(i2);
            sb7.append(", minHeight=");
            sb7.append(i3);
            sb7.append(", maxHeight=");
            sb7.append(i4);
            throw new IllegalArgumentException(sb7.toString());
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append("minWidth must be >= 0, but was: ");
        sb8.append(i);
        sb8.append(". minWidth=");
        sb8.append(i);
        sb8.append(", maxWidth=");
        sb8.append(i2);
        sb8.append(", minHeight=");
        sb8.append(i3);
        sb8.append(", maxHeight=");
        sb8.append(i4);
        throw new IllegalArgumentException(sb8.toString());
    }
}
