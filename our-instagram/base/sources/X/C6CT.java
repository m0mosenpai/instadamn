package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6CT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6CT {
    public static final List A00(UserSession userSession, C47142Eg c47142Eg) {
        ArrayList A1M = AbstractC16960so.A1M(16, 27, 44, 202, 95, 28, 89);
        if (!C18U.A06(C06090Tz.A05, userSession, 36322791825353276L)) {
            A1M.add(106);
        }
        if (((Boolean) c47142Eg.A0j.get()).booleanValue()) {
            A1M.add(1);
        }
        if (((Boolean) c47142Eg.A0J.get()).booleanValue()) {
            A1M.add(2);
        }
        if (c47142Eg.A05() || c47142Eg.A04() || c47142Eg.A06()) {
            A1M.add(6);
        }
        if (C6CE.A00(userSession).A00()) {
            A1M.add(108);
            A1M.add(198);
        }
        if (C47142Eg.A00()) {
            A1M.add(197);
        }
        return AbstractC001800i.A0a(A1M);
    }
}
