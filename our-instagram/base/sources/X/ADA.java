package X;

/* loaded from: classes4.dex */
public abstract class ADA {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                return -1;
        }
    }

    public static Integer A01(EnumC185798Lz enumC185798Lz) {
        switch (enumC185798Lz) {
            case VIRTUAL:
                return C05F.A00;
            case PREVIEW:
                return C05F.A01;
            case CAPTURE:
                return C05F.A0C;
            case CAPTURE_IMAGE:
                return C05F.A0N;
            case OVERLAY:
                return C05F.A0Y;
            case PEER:
                return C05F.A0j;
            default:
                throw AbstractC166987dD.A18(AbstractC167017dG.A0n(enumC185798Lz, "Not FrameTargetHint for output: ", AbstractC166987dD.A1C()));
        }
    }
}
