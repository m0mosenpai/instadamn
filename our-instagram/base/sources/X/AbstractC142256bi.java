package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* renamed from: X.6bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142256bi {
    public static final EffectCollectionService A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        return (EffectCollectionService) userSession.A01(EffectCollectionService.class, new C9F8(27, context, userSession));
    }
}
