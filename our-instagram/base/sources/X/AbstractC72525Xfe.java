package X;

/* renamed from: X.Xfe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72525Xfe {
    public static final Integer A00(String str) {
        Integer num = C05F.A00;
        if (!str.equals("Success")) {
            Integer num2 = C05F.A01;
            if (!str.equals("CDL Not Ready")) {
                Integer num3 = C05F.A0C;
                if (!str.equals("CDL Error")) {
                    Integer num4 = C05F.A0N;
                    if (!str.equals("No Current Avatar")) {
                        Integer num5 = C05F.A0Y;
                        if (!str.equals("Unknown Request Id")) {
                            Integer num6 = C05F.A0j;
                            if (!str.equals("Duplicate Request Id")) {
                                Integer num7 = C05F.A0u;
                                if (!str.equals("Skipped Request")) {
                                    Integer num8 = C05F.A15;
                                    if (!str.equals("Internal Error")) {
                                        return C05F.A1F;
                                    }
                                    return num8;
                                }
                                return num7;
                            }
                            return num6;
                        }
                        return num5;
                    }
                    return num4;
                }
                return num3;
            }
            return num2;
        }
        return num;
    }
}
