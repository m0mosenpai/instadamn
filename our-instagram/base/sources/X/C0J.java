package X;

import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class C0J extends AbstractC33632Eti {
    public final EfU A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    public C0J(EfU efU) {
        C14360o3.A0B(efU, 1);
        this.A00 = efU;
        this.A02 = AbstractC25235BEs.A0t(this, 49);
        this.A06 = AbstractC09440dt.A01(new C57510Pfk(this, 1));
        this.A0A = AbstractC09440dt.A01(new C57510Pfk(this, 3));
        this.A01 = AbstractC25235BEs.A0t(this, 48);
        this.A09 = AbstractC09440dt.A01(new C57510Pfk(this, 2));
        this.A03 = AbstractC09440dt.A01(DDC.A00);
        this.A07 = AbstractC09440dt.A01(DDE.A00);
        this.A08 = AbstractC09440dt.A01(DDF.A00);
        this.A05 = AbstractC09440dt.A01(new C57510Pfk(this, 0));
        this.A04 = AbstractC09440dt.A01(DDD.A00);
    }

    @Override // X.AbstractC33632Eti
    public final boolean A0A() {
        return false;
    }

    @Override // X.AbstractC33632Eti
    public final int A00() {
        return AbstractC167027dH.A01(this.A04);
    }

    @Override // X.AbstractC33632Eti
    public final C34447FGl A01() {
        return (C34447FGl) this.A07.getValue();
    }

    @Override // X.AbstractC33632Eti
    public final C32196ECr A02() {
        return (C32196ECr) this.A09.getValue();
    }

    @Override // X.AbstractC33632Eti
    public final User A03() {
        return (User) AbstractC166987dD.A17(this.A0A);
    }

    @Override // X.AbstractC33632Eti
    public final String A04() {
        return AbstractC25225BEi.A15(this.A02);
    }

    @Override // X.AbstractC33632Eti
    public final String A05() {
        return AbstractC25225BEi.A15(this.A03);
    }

    @Override // X.AbstractC33632Eti
    public final String A06() {
        return AbstractC25225BEi.A15(this.A05);
    }

    @Override // X.AbstractC33632Eti
    public final String A07() {
        return AbstractC25225BEi.A15(this.A06);
    }

    @Override // X.AbstractC33632Eti
    public final String A08() {
        return AbstractC25225BEi.A15(this.A08);
    }

    @Override // X.AbstractC33632Eti
    public final Collection A09() {
        return (Collection) this.A01.getValue();
    }
}
