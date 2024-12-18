package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1vX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41221vX {
    public static final void A01(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C41241vZ.A0E = (C41241vZ) userSession.A01(C41241vZ.class, new C9F8(30, context, userSession));
    }

    public static final C41241vZ A00() {
        C41241vZ c41241vZ = C41241vZ.A0E;
        if (c41241vZ != null) {
            return c41241vZ;
        }
        throw new IllegalStateException("IgSystemAudioVolumeObserver never initialized");
    }
}
