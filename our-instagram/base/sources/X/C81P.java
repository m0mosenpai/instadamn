package X;

import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.HashSet;

/* renamed from: X.81P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81P {
    public final C81O A00(UserSession userSession, C55U... c55uArr) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c55uArr, 1);
        HashSet hashSet = new HashSet(AbstractC16850sd.A0L(c55uArr.length));
        AbstractC009903n.A0M(hashSet, c55uArr);
        return A01(hashSet);
    }

    public final C81O A01(java.util.Set set) {
        EnumSet complementOf = EnumSet.complementOf(EnumSet.of(C81W.A0l));
        C14360o3.A07(complementOf);
        return new C81O(complementOf, set);
    }
}
