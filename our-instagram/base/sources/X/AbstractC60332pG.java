package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.scanner.MediaScannerScheduler;

/* renamed from: X.2pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60332pG {
    public static final MediaScannerScheduler A00(Context context, UserSession userSession, C60322pF c60322pF) {
        C14360o3.A0B(c60322pF, 2);
        return (MediaScannerScheduler) userSession.A01(MediaScannerScheduler.class, new C9FM(22, context.getApplicationContext(), userSession, c60322pF));
    }
}
