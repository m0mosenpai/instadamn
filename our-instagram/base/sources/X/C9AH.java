package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;

/* renamed from: X.9AH, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9AH {
    public static final MsysMailboxSessionManagerImpl A00(UserSession userSession) {
        if (C28441Zf.A00 == null) {
            C14360o3.A0F("pluginInstance");
            throw C00O.createAndThrow();
        }
        return (MsysMailboxSessionManagerImpl) userSession.A01(MsysMailboxSessionManagerImpl.class, new C9E3(userSession, 17));
    }
}
