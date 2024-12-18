package X;

/* renamed from: X.AGx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23109AGx {
    public final int A01(EnumC77763e0 enumC77763e0, int[] iArr) {
        C14360o3.A0B(iArr, 0);
        return iArr[A00(enumC77763e0)];
    }

    public final void A02(EnumC77763e0 enumC77763e0, int[] iArr, int i) {
        int i2;
        int i3 = 0;
        switch (enumC77763e0.ordinal()) {
            case 6:
                iArr[0] = i;
                i2 = 2;
                iArr[i2] = i;
                return;
            case 7:
                iArr[1] = i;
                i2 = 3;
                iArr[i2] = i;
                return;
            case 8:
                break;
            default:
                i2 = A00(enumC77763e0);
                iArr[i2] = i;
                return;
        }
        do {
            iArr[i3] = i;
            i3++;
        } while (i3 < 4);
    }

    public static final int A00(EnumC77763e0 enumC77763e0) {
        switch (enumC77763e0) {
            case LEFT:
            case START:
                return 0;
            case TOP:
                return 1;
            case RIGHT:
            case END:
                return 2;
            case BOTTOM:
                return 3;
            default:
                throw AbstractC167007dF.A0c("Given unsupported edge ", enumC77763e0.name());
        }
    }
}
