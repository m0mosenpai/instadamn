package X;

import java.util.List;

/* renamed from: X.Do8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31225Do8 {
    public static final boolean A00(C2EE c2ee) {
        if (!c2ee.CVQ()) {
            List BSH = c2ee.BSH();
            C14360o3.A0B(BSH, 0);
            if (BSH.size() == 1) {
                if (((C17H) BSH.get(0)).CYY() || ((C17I) BSH.get(0)).CQf()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
