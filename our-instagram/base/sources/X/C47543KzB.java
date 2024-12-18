package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.KzB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47543KzB {
    public final LruCache A00 = new LruCache(10);
    public final UserSession A01;

    public C47543KzB(UserSession userSession) {
        this.A01 = userSession;
    }
}
