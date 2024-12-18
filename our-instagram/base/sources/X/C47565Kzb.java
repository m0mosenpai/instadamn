package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kzb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47565Kzb {
    public final LruCache A00;
    public final UserSession A01;

    public C47565Kzb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new LruCache(2);
    }
}
