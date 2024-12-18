package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFi {
    public final InterfaceC19630xq A00;

    public final Boolean A01(InterfaceC83713oG interfaceC83713oG, int i) {
        String A00 = A00(interfaceC83713oG, i);
        if (A00 == null) {
            return null;
        }
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (!interfaceC19630xq.contains(A00)) {
            return null;
        }
        return Boolean.valueOf(interfaceC19630xq.getBoolean(A00, false));
    }

    public static final String A00(InterfaceC83713oG interfaceC83713oG, int i) {
        if (interfaceC83713oG instanceof C83693oE) {
            return AnonymousClass001.A07(i, "thread:", ((C83693oE) interfaceC83713oG).A00, "_capability:");
        }
        return null;
    }

    public LFi(UserSession userSession) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A1j, LFi.class);
        C14360o3.A0B(A04, 1);
        this.A00 = A04;
    }
}
