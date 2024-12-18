package X;

import java.util.Iterator;

/* renamed from: X.81b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809981b implements InterfaceC1810081c {
    public final C1810581h A00;
    public final C1810281e A01 = new C1810281e(EnumC1810181d.A0V);
    public final C1810281e A02;

    @Override // X.InterfaceC1810081c
    public final void A82(InterfaceC1810781j interfaceC1810781j) {
        C14360o3.A0B(interfaceC1810781j, 0);
        this.A01.A02(interfaceC1810781j);
    }

    @Override // X.InterfaceC1810081c
    public final void A85(InterfaceC1810781j interfaceC1810781j) {
        C14360o3.A0B(interfaceC1810781j, 0);
        this.A02.A02(interfaceC1810781j);
    }

    @Override // X.InterfaceC1810081c
    public final boolean CRB(EnumC1810181d enumC1810181d) {
        C14360o3.A0B(enumC1810181d, 0);
        if (this.A01.A00.first != enumC1810181d) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1810081c
    public final void A83(EnumC1810181d enumC1810181d, EnumC1810181d enumC1810181d2, Class cls) {
        this.A01.A03(cls, enumC1810181d, enumC1810181d2);
    }

    @Override // X.InterfaceC1810081c
    public final EnumC1810181d AuG() {
        Object obj = this.A01.A00.first;
        C14360o3.A07(obj);
        return (EnumC1810181d) obj;
    }

    @Override // X.InterfaceC1810081c
    public final EnumC1810381f AuH() {
        Object obj = this.A02.A00.first;
        C14360o3.A07(obj);
        return (EnumC1810381f) obj;
    }

    @Override // X.InterfaceC1810081c
    public final boolean Cae() {
        if (this.A02.A00.first != EnumC1810381f.A02) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1810081c
    public final boolean Cap() {
        if (this.A02.A00.first != EnumC1810381f.A03) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1810081c
    public final void E4u(Object obj) {
        this.A01.A04(obj);
    }

    public C1809981b() {
        EnumC1810481g enumC1810481g;
        C1810281e c1810281e = new C1810281e(EnumC1810381f.A05);
        this.A02 = c1810281e;
        if (c1810281e.A00.first == EnumC1810381f.A02) {
            enumC1810481g = EnumC1810481g.A03;
        } else {
            enumC1810481g = EnumC1810481g.A02;
        }
        final C1810581h c1810581h = new C1810581h(enumC1810481g);
        this.A00 = c1810581h;
        c1810281e.A02(new InterfaceC1810781j(c1810581h) { // from class: X.81i
            public final C1810581h A00;

            @Override // X.InterfaceC1810781j
            public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
                C1810581h c1810581h2;
                EnumC1810481g enumC1810481g2;
                if (obj2 == EnumC1810381f.A02) {
                    c1810581h2 = this.A00;
                    enumC1810481g2 = EnumC1810481g.A03;
                } else if (obj2 != EnumC1810381f.A04) {
                    c1810581h2 = this.A00;
                    enumC1810481g2 = EnumC1810481g.A02;
                } else {
                    return;
                }
                if (enumC1810481g2 != c1810581h2.A00) {
                    c1810581h2.A00 = enumC1810481g2;
                    Iterator it = c1810581h2.A01.iterator();
                    while (it.hasNext()) {
                        ((C82O) it.next()).F8V(enumC1810481g2);
                    }
                }
            }

            {
                this.A00 = c1810581h;
            }
        });
    }
}
