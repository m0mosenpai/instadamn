package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CEj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27564CEj {
    public static final String A00(InterfaceC137046Ii interfaceC137046Ii) {
        String obj = ((C137036Ig) interfaceC137046Ii).A0B.toString();
        C14360o3.A0B(obj, 0);
        List A0Q = AbstractC001900j.A0Q(obj, new char[]{'_'}, 0);
        String str = (String) AbstractC001800i.A0O(A0Q, 2);
        String str2 = (String) AbstractC001800i.A0O(A0Q, 3);
        if (str != null && str2 != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            return AnonymousClass001.A0T(str, str2, '_');
        }
        return null;
    }
}
