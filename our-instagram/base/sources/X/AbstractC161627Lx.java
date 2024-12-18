package X;

/* renamed from: X.7Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161627Lx {
    public static final boolean A00(C7VC c7vc, C7VC c7vc2, boolean z) {
        if (c7vc != c7vc2) {
            if ((c7vc instanceof C160787Im) && (c7vc2 instanceof C160787Im)) {
                return C83403nh.A0B(((C160787Im) c7vc).A0e, ((C160787Im) c7vc2).A0e);
            }
            if (c7vc.getType() != c7vc2.getType()) {
                return false;
            }
            int type = c7vc.getType();
            if (type != 2) {
                if (type != 32) {
                    if (type == 157 || type == 158) {
                        return true;
                    }
                    switch (type) {
                        case 34:
                        case 35:
                            break;
                        case 36:
                            return true;
                        default:
                            switch (type) {
                                case 55:
                                    return true;
                                case 56:
                                case 57:
                                    break;
                                default:
                                    return false;
                            }
                    }
                } else if (z) {
                    if (!(c7vc instanceof C161717Mg) || !(c7vc2 instanceof C161717Mg)) {
                        return false;
                    }
                } else {
                    return true;
                }
                return c7vc.C8f() == c7vc2.C8f();
            }
            return true;
        }
        return true;
    }
}
