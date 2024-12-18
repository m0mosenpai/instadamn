package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7dZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167207dZ {
    public Object A00;
    public WeakReference A01;

    public C167207dZ(UserSession userSession, Object obj) {
        C14360o3.A0B(userSession, 2);
        if (AbstractC65492xl.A00(userSession).A0C) {
            this.A01 = new WeakReference(obj);
        } else {
            this.A00 = obj;
        }
    }
}
