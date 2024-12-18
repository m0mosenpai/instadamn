package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cvk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29289Cvk implements InterfaceC76323bc, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC76323bc
    public final C79743hP AXa(UserSession userSession, C75113Zb c75113Zb, String str, boolean z) {
        AbstractC25233BEq.A0v(0, str, userSession, c75113Zb);
        return ((AnonymousClass399) this.A01).A00(userSession, c75113Zb, str, z);
    }

    public C29289Cvk(AnonymousClass399 anonymousClass399, int i) {
        this.A00 = i;
        this.A01 = anonymousClass399;
    }

    public final boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                if (!(obj instanceof InterfaceC76323bc) || !(obj instanceof InterfaceC14180ni)) {
                    return false;
                }
                return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
            default:
                return super.equals(obj);
        }
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(4, this.A01, AnonymousClass399.class, AbstractC111324zv.A00(2428), AbstractC111324zv.A00(2429), 0);
    }

    public final int hashCode() {
        switch (this.A00) {
            case 0:
            case 1:
                return getFunctionDelegate().hashCode();
            default:
                return super.hashCode();
        }
    }
}
