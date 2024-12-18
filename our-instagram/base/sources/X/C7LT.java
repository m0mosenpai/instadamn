package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7LT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7LT {
    public static final String A00(C7U0 c7u0, String str, InterfaceC16820sZ interfaceC16820sZ) {
        List BSH;
        C14360o3.A0B(c7u0, 2);
        if (str != null) {
            C2EG c2eg = (C2EG) interfaceC16820sZ.invoke();
            if (c2eg == null) {
                return null;
            }
            BSH = c2eg.BSH();
        } else {
            InterfaceC163837Ux C7r = c7u0.C7r();
            if (!C7r.CeQ()) {
                return null;
            }
            BSH = C7r.BSH();
        }
        User user = (User) AbstractC001800i.A0J(BSH);
        if (user == null) {
            return null;
        }
        return user.getId();
    }
}
