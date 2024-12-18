package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2CW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CW {
    public final WeakReference A00;
    public final C2CV A01;

    public C2CW(UserSession userSession, C2CV c2cv) {
        this.A01 = c2cv;
        this.A00 = new WeakReference(userSession);
    }
}
