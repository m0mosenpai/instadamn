package X;

/* renamed from: X.77S, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C77S {
    public static final boolean A00(C83403nh c83403nh, C93384Gr c93384Gr, String str, boolean z) {
        C14360o3.A0B(str, 2);
        boolean z2 = c83403nh.A2P;
        if (C93384Gr.A00(c83403nh, c93384Gr, true)) {
            if (z2) {
                if (!z) {
                    if (!str.equals(c83403nh.A1u) && C93384Gr.A00(c83403nh, c93384Gr, false)) {
                        return true;
                    }
                    return false;
                }
            } else if (z) {
                if (!c93384Gr.A01(c83403nh)) {
                    return true;
                }
                return false;
            }
            return C93384Gr.A00(c83403nh, c93384Gr, false);
        }
        return false;
    }
}
