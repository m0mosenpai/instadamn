package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.9Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC207699Gz {
    public static final C9H2 A01(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 3 && intValue != 4 && intValue != 2) {
                throw B4Z.A00();
            }
            return C9H2.A03;
        }
        return C9H2.A02;
    }

    public static final C9H2 A00(CameraTool cameraTool) {
        if (cameraTool != null) {
            int ordinal = cameraTool.ordinal();
            if (ordinal != 74 && ordinal != 79) {
                if (ordinal != 77 && ordinal != 103 && ordinal != 78) {
                    return null;
                }
                return C9H2.A03;
            }
            return C9H2.A02;
        }
        return null;
    }
}
