package X;

import java.util.List;

/* renamed from: X.GlK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37865GlK {
    public static final String A00(InterfaceC101404gy interfaceC101404gy) {
        C14360o3.A0B(interfaceC101404gy, 0);
        String pollId = interfaceC101404gy.getPollId();
        if (pollId == null) {
            return "";
        }
        return pollId;
    }

    public static final List A01(InterfaceC101404gy interfaceC101404gy) {
        C14360o3.A0B(interfaceC101404gy, 0);
        List C5D = interfaceC101404gy.C5D();
        if (C5D == null) {
            return C16930sl.A00;
        }
        return C5D;
    }

    public static final boolean A02(InterfaceC101404gy interfaceC101404gy) {
        C14360o3.A0B(interfaceC101404gy, 0);
        return AbstractC167007dF.A1T(interfaceC101404gy.CYz());
    }
}
