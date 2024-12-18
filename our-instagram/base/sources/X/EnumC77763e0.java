package X;

/* renamed from: X.3e0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC77763e0 {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    public final int A00;

    EnumC77763e0(int i) {
        this.A00 = i;
    }

    public static EnumC77763e0 A00(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i));
        }
    }
}
