package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BEw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25238BEw implements InterfaceC14180ni, InterfaceC76323bc {
    public final /* synthetic */ AnonymousClass399 A00;

    public C25238BEw(AnonymousClass399 anonymousClass399) {
        this.A00 = anonymousClass399;
    }

    @Override // X.InterfaceC76323bc
    public final C79743hP AXa(UserSession userSession, C75113Zb c75113Zb, String str, boolean z) {
        AbstractC25233BEq.A0v(0, str, userSession, c75113Zb);
        return this.A00.A00(userSession, c75113Zb, str, z);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(4, this.A00, AnonymousClass399.class, AbstractC111324zv.A00(2428), AbstractC111324zv.A00(2429), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC76323bc) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
