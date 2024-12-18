package X;

/* renamed from: X.880, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass880 {
    public EnumC1810481g A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(AnonymousClass881.A00);

    public final AnonymousClass883 A00() {
        InterfaceC09390do interfaceC09390do;
        int ordinal;
        if (C2B0.A00(C05F.A01) && (ordinal = this.A00.ordinal()) != 0) {
            if (ordinal == 1) {
                interfaceC09390do = this.A02;
            } else {
                throw new RuntimeException();
            }
        } else {
            interfaceC09390do = this.A01;
        }
        return (AnonymousClass883) interfaceC09390do.getValue();
    }

    public AnonymousClass880(InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = AbstractC09440dt.A01(new C9E0(interfaceC16820sZ, 49));
        C1810581h c1810581h = ((C1809981b) interfaceC1810081c).A00;
        this.A00 = c1810581h.A00;
        if (C2B0.A00(C05F.A01)) {
            int ordinal = this.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.A02.getValue();
                } else {
                    throw new RuntimeException();
                }
            } else {
                AnonymousClass882 anonymousClass882 = (AnonymousClass882) this.A01.getValue();
                anonymousClass882.A0S.A00(anonymousClass882.A0N, anonymousClass882.A0O);
            }
            c1810581h.A01.add(new C82O() { // from class: X.88B
                @Override // X.C82O
                public final /* bridge */ /* synthetic */ void F8V(Object obj) {
                    EnumC1810481g enumC1810481g = (EnumC1810481g) obj;
                    C14360o3.A0B(enumC1810481g, 0);
                    AnonymousClass880 anonymousClass880 = AnonymousClass880.this;
                    EnumC1810481g enumC1810481g2 = anonymousClass880.A00;
                    EnumC1810481g enumC1810481g3 = EnumC1810481g.A02;
                    if (enumC1810481g == enumC1810481g3 && enumC1810481g2 == EnumC1810481g.A03) {
                        boolean z = ((C198348pj) anonymousClass880.A02.getValue()).A00;
                        AnonymousClass882 anonymousClass8822 = (AnonymousClass882) anonymousClass880.A01.getValue();
                        anonymousClass8822.A0C = z;
                        anonymousClass8822.A0S.A00(anonymousClass8822.A0N, anonymousClass8822.A0O);
                    } else if (enumC1810481g == EnumC1810481g.A03 && enumC1810481g2 == enumC1810481g3) {
                        AnonymousClass882 anonymousClass8823 = (AnonymousClass882) anonymousClass880.A01.getValue();
                        boolean z2 = anonymousClass8823.A0C;
                        anonymousClass8823.hide();
                        C87x c87x = anonymousClass8823.A0S;
                        InterfaceC58362lv interfaceC58362lv = anonymousClass8823.A0N;
                        InterfaceC58362lv interfaceC58362lv2 = anonymousClass8823.A0O;
                        C14360o3.A0B(interfaceC58362lv2, 1);
                        AnonymousClass860 anonymousClass860 = c87x.A05;
                        if (anonymousClass860 != null) {
                            if (interfaceC58362lv != null) {
                                AbstractC58232lf.A00(AnonymousClass191.A00, anonymousClass860.A0c).A08(interfaceC58362lv);
                            }
                            anonymousClass860.A01().A08(interfaceC58362lv2);
                        }
                        ((C198348pj) anonymousClass880.A02.getValue()).A00 = z2;
                    }
                    anonymousClass880.A00 = enumC1810481g;
                }
            });
        }
    }
}
