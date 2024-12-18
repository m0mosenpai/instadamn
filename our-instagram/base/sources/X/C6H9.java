package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.6H9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6H9 {
    public static final Integer A00(LineType lineType, Integer num) {
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 2 && intValue != 4) {
            int ordinal = lineType.ordinal();
            if (ordinal != 3) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 0) {
                        throw new RuntimeException();
                    }
                } else {
                    return C05F.A0C;
                }
            } else {
                return C05F.A0N;
            }
        } else if (lineType != LineType.A05) {
            return num;
        }
        return C05F.A00;
    }
}
