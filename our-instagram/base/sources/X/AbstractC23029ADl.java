package X;

/* renamed from: X.ADl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23029ADl {
    public static final float A00(C6RC c6rc, float f) {
        float f2 = 0.3f;
        switch (c6rc.ordinal()) {
            case 0:
                f2 = 0.8f;
                break;
            case 1:
            case 2:
            case 5:
                break;
            case 3:
                f2 = 0.15f;
                break;
            case 4:
                return 0.0f;
            default:
                throw B4Z.A00();
        }
        return f * f2;
    }

    public static final float A01(C6RC c6rc, float f) {
        float f2 = 0.5f;
        switch (c6rc.ordinal()) {
            case 0:
                f2 = 1.2f;
                break;
            case 1:
            case 2:
            case 5:
                break;
            case 3:
                f2 = 0.25f;
                break;
            case 4:
                return 0.0f;
            default:
                throw B4Z.A00();
        }
        return f * f2;
    }
}
