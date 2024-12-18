package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62762tF implements InterfaceC62772tG {
    public final String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9EQ(this, 13));
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC62772tG
    public final boolean Axz() {
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    @Override // X.InterfaceC62772tG
    public final C1BZ BMf() {
        return (C1BZ) this.A02.getValue();
    }

    @Override // X.InterfaceC62772tG
    public final boolean BvU() {
        Object value = this.A03.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    @Override // X.InterfaceC62772tG
    public final String getFileName() {
        return this.A00;
    }

    public C62762tF(UserSession userSession, String str) {
        this.A00 = str;
        this.A01 = AbstractC09440dt.A01(new C9EQ(userSession, 12));
        this.A03 = AbstractC09440dt.A01(new C9EQ(userSession, 14));
    }
}
