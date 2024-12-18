package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5LZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LZ {
    public final InterfaceC19630xq A00;

    public final boolean A00(String str) {
        return (str == null || str.length() == 0 || !this.A00.getBoolean(str, false)) ? false : true;
    }

    public C5LZ(UserSession userSession) {
        this.A00 = C1AT.A01(userSession).A04(C1AV.A27, C5LZ.class);
    }
}
