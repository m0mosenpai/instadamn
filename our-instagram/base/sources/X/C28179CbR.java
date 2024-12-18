package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CbR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28179CbR {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public C28179CbR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = C1XM.A00(C29888DGc.A00(this, 39));
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        int A04 = AbstractC001900j.A04(str, '_', 0);
        if (A04 != -1) {
            str = AbstractC25227BEk.A0w(str, 0, A04);
        }
        try {
            return AbstractC166997dE.A0j(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
