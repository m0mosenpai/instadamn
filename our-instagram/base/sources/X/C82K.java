package X;

/* renamed from: X.82K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82K {
    public EnumC1810481g A00;
    public final Integer A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C82K(InterfaceC1810081c interfaceC1810081c, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        InterfaceC09390do interfaceC09390do;
        Object value;
        C14360o3.A0B(interfaceC1810081c, 1);
        this.A01 = num;
        C1810581h c1810581h = ((C1809981b) interfaceC1810081c).A00;
        this.A00 = c1810581h.A00;
        C17050sx A01 = AbstractC09440dt.A01(new C9E4(interfaceC16820sZ, 45));
        this.A04 = A01;
        C17050sx A012 = AbstractC09440dt.A01(new C9E4(interfaceC16820sZ2, 46));
        this.A03 = A012;
        C17050sx A013 = AbstractC09440dt.A01(new C9E4(interfaceC16820sZ3, 47));
        this.A02 = A013;
        if (!z) {
            if (C2B0.A00(num)) {
                A012.getValue().hashCode();
                value = A013.getValue();
            } else {
                value = A01.getValue();
            }
            value.hashCode();
        }
        if (C2B0.A00(num)) {
            int ordinal = this.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    interfaceC09390do = this.A02;
                } else {
                    throw new RuntimeException();
                }
            } else {
                interfaceC09390do = this.A03;
            }
            ((C82M) interfaceC09390do.getValue()).A7T(null);
            c1810581h.A01.add(new C82O() { // from class: X.82N
                @Override // X.C82O
                public final /* bridge */ /* synthetic */ void F8V(Object obj) {
                    EnumC1810481g enumC1810481g = (EnumC1810481g) obj;
                    C14360o3.A0B(enumC1810481g, 0);
                    C82K c82k = C82K.this;
                    if (C2B0.A00(c82k.A01)) {
                        EnumC1810481g enumC1810481g2 = c82k.A00;
                        C82M c82m = (C82M) c82k.A03.getValue();
                        C82M c82m2 = (C82M) c82k.A02.getValue();
                        EnumC1810481g enumC1810481g3 = EnumC1810481g.A02;
                        if (enumC1810481g == enumC1810481g3 && enumC1810481g2 == EnumC1810481g.A03) {
                            c82m.A7T(c82m2.ANh());
                        } else if (enumC1810481g == EnumC1810481g.A03 && enumC1810481g2 == enumC1810481g3) {
                            c82m2.A7T(c82m.ANh());
                        }
                    }
                    c82k.A00 = enumC1810481g;
                }
            });
        }
    }

    public final C82M A00() {
        InterfaceC09390do interfaceC09390do;
        if (C2B0.A00(this.A01)) {
            int ordinal = this.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    interfaceC09390do = this.A02;
                } else {
                    throw new RuntimeException();
                }
            } else {
                interfaceC09390do = this.A03;
            }
        } else {
            interfaceC09390do = this.A04;
        }
        return (C82M) interfaceC09390do.getValue();
    }
}
