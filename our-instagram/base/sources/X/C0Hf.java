package X;

/* renamed from: X.0Hf, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Hf {
    public static void A00(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void A01(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A02(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A03(Object[] objArr, boolean z) {
        int i;
        if (z) {
            return;
        }
        String valueOf = String.valueOf("Bitmap size bigger than the total registered size: %d, %d");
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        int i2 = 0;
        int i3 = 0;
        do {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i3, indexOf));
            i = i2 + 1;
            sb.append(objArr[i2]);
            i3 = indexOf + 2;
            i2 = i;
        } while (i < 2);
        sb.append(valueOf.substring(i3));
        if (i2 < 2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i4 = i2 + 1; i4 < 2; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
