package X;

/* renamed from: X.ORz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54949ORz {
    public static final String A00 = A00(999);

    public static final String A00(int i) {
        EnumC40111tc A002 = AbstractC40091ta.A00(Integer.valueOf(i));
        if (A002 == null) {
            return "IGMediaTypeUnavailable";
        }
        switch (A002.ordinal()) {
            case 0:
                return "IGMediaTypePhoto";
            case 1:
                return "IGMediaTypeVideo";
            case 2:
                return "IGMediaTypeMap";
            case 3:
                return "IGMediaTypeLive";
            case 4:
                return "IGMediaTypeCarousel";
            case 5:
                return "IGMediaTypePostLive";
            case 6:
                return "IGMediaTypeCollection";
            case 7:
                return "IGMediaTypeAudio";
            case 8:
                return "IGMediaTypeShowreelNative";
            case 9:
                return "IGMediaTypeGuideFacade";
            default:
                return "IGMediaTypeUnavailable";
        }
    }
}
