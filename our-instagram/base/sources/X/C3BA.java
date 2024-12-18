package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.3BA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BA {
    public WeakReference A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C61222qk A03;

    public static final C60662pp A00(C3BA c3ba) {
        WeakReference weakReference = c3ba.A00;
        if (weakReference != null) {
            return (C60662pp) weakReference.get();
        }
        return null;
    }

    public C3BA(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C60662pp c60662pp, C61222qk c61222qk) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = c61222qk;
        this.A00 = new WeakReference(c60662pp);
    }
}
