package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25371Lr {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C25371Lr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A04 = AbstractC09440dt.A01(new C9E7(this, 25));
        this.A02 = AbstractC09440dt.A01(new C9E7(this, 23));
        this.A03 = AbstractC09440dt.A01(new C9E7(this, 24));
        this.A01 = AbstractC09440dt.A01(new C9E7(this, 22));
    }

    public static final boolean A00(C25371Lr c25371Lr) {
        Object value = c25371Lr.A04.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    public final boolean A01() {
        return C18U.A06(C06090Tz.A05, this.A00, 36330273658454811L);
    }
}
