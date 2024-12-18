package X;

/* renamed from: X.3fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78553fN {
    public static final int A00(EnumC78563fO enumC78563fO) {
        C14360o3.A0B(enumC78563fO, 0);
        int ordinal = enumC78563fO.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 0) {
                    return 2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown YogaDirection ");
                sb.append(enumC78563fO);
                throw new IllegalArgumentException(sb.toString());
            }
            return 1;
        }
        return 0;
    }

    public static final EnumC78563fO A01(int i) {
        if (i == 0) {
            return EnumC78563fO.LTR;
        }
        if (i == 1) {
            return EnumC78563fO.RTL;
        }
        if (i == 2) {
            return EnumC78563fO.INHERIT;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown LayoutDirection ");
        sb.append((Object) AnonymousClass001.A0I("LayoutDirection(value=", ')', i));
        throw new IllegalArgumentException(sb.toString());
    }
}
