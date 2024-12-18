package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2qL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60972qL extends AbstractC12990ll {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C60972qL(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.AbstractC12990ll
    public final boolean hasEnded() {
        return false;
    }

    @Override // X.AbstractC12990ll
    public final C18720vz getDeviceSession() {
        return this.A01.deviceSession;
    }

    @Override // X.AbstractC12990ll
    public final String getToken() {
        return this.A01.token;
    }
}
