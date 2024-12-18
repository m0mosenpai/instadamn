package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5On, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116345On {
    public final InterfaceC09390do A00;

    public C116345On(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC09440dt.A01(new C9EW(userSession, 26));
    }

    public final Long A00(C83403nh c83403nh) {
        Long l;
        C14360o3.A0B(c83403nh, 0);
        if (c83403nh.A1S() && !((Boolean) this.A00.getValue()).booleanValue()) {
            l = null;
        } else {
            l = c83403nh.A1L;
        }
        AnonymousClass442 A0P = c83403nh.A0P();
        if (A0P == null || (A0P.A05() && !((Boolean) this.A00.getValue()).booleanValue())) {
            return l;
        }
        return (Long) AbstractC001800i.A06(AbstractC16960so.A1R(l, A0P.A0L));
    }
}
