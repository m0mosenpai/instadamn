package X;

import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class C0I extends AbstractC33632Eti {
    public final EfV A00;
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

    public C0I(EfV efV) {
        C14360o3.A0B(efV, 1);
        this.A00 = efV;
        this.A02 = AbstractC25235BEs.A0t(this, 40);
        this.A06 = AbstractC25235BEs.A0t(this, 43);
        this.A0A = AbstractC25235BEs.A0t(this, 47);
        this.A01 = AbstractC09440dt.A01(DDA.A00);
        this.A09 = AbstractC25235BEs.A0t(this, 46);
        this.A03 = AbstractC25235BEs.A0t(this, 41);
        this.A07 = AbstractC25235BEs.A0t(this, 44);
        this.A08 = AbstractC25235BEs.A0t(this, 45);
        this.A04 = AbstractC25235BEs.A0t(this, 42);
        this.A05 = AbstractC09440dt.A01(DDB.A00);
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

    @Override // X.AbstractC33632Eti
    public final boolean A0A() {
        return AbstractC25231BEo.A1J(this.A00.A00);
    }
}
