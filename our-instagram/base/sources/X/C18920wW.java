package X;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18920wW implements InterfaceC02550Ad {
    public final C12180kM A00;
    public final AbstractC12990ll A01;
    public final InterfaceC11380iw A02;

    public C18920wW(C12180kM c12180kM, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(c12180kM, 2);
        this.A01 = abstractC12990ll;
        this.A02 = null;
        this.A00 = c12180kM;
    }

    public final InterfaceC02590Ai A00(C12180kM c12180kM, String str) {
        C14360o3.A0B(c12180kM, 1);
        final C19280xC A00 = C19280xC.A00(this.A02, str);
        C14360o3.A0A(A00);
        AbstractC12990ll abstractC12990ll = this.A01;
        boolean CU0 = AbstractC11060iN.A00(abstractC12990ll).CU0(A00);
        A00.A05 = true;
        if (!CU0) {
            C07250Zz c07250Zz = AbstractC02560Ae.A00;
            C14360o3.A0A(c07250Zz);
            return c07250Zz;
        }
        final AbstractC19330xH A002 = AbstractC11060iN.A00(abstractC12990ll);
        final Integer num = c12180kM.A00;
        final boolean z = c12180kM.A01;
        return new InterfaceC02590Ai(A00, A002, num, z) { // from class: X.0wX
            public final C19280xC A00;
            public final boolean A01;
            public final InterfaceC11360iu A02;
            public final Integer A03;

            @Override // X.InterfaceC02590Ai
            public final boolean isSampled() {
                return true;
            }

            @Override // X.InterfaceC02590Ai
            public final void A7v(String str2, Boolean bool) {
                this.A00.A09(str2, bool);
            }

            @Override // X.InterfaceC02590Ai
            public final void A8I(String str2, Double d) {
                this.A00.A0A(str2, d);
            }

            @Override // X.InterfaceC02590Ai
            public final void A8R(InterfaceC02530Ab interfaceC02530Ab, String str2) {
                C19280xC c19280xC;
                String str3;
                if (interfaceC02530Ab == null) {
                    c19280xC = this.A00;
                    str3 = null;
                } else {
                    Object value = interfaceC02530Ab.getValue();
                    if (value instanceof String) {
                        c19280xC = this.A00;
                        str3 = (String) value;
                    } else if (value instanceof Integer) {
                        this.A00.A08((Integer) value, str2);
                        return;
                    } else {
                        if (value instanceof Long) {
                            this.A00.A0B(str2, (Long) value);
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Enum type expects String, Integer or Long, but got: ");
                        sb.append(value);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                c19280xC.A0C(str2, str3);
            }

            @Override // X.InterfaceC02590Ai
            public final void A8c(String str2, Float f) {
                C19260xA.A00(this.A00.A06, f, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void A8p(String str2, Integer num2) {
                this.A00.A08(num2, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void A9K(String str2, Long l) {
                this.A00.A0B(str2, l);
            }

            @Override // X.InterfaceC02590Ai
            public final void A9M(String str2, Map map) {
                C19260xA c19260xA;
                C19280xC c19280xC;
                if (map != null) {
                    c19280xC = this.A00;
                    c19260xA = AbstractC11490j8.A01(map);
                } else {
                    c19260xA = null;
                    c19280xC = this.A00;
                }
                c19280xC.A05(c19260xA, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void A9T(String str2, Object obj) {
                String str3;
                if (obj == null) {
                    str3 = null;
                } else {
                    if (obj instanceof Integer) {
                        A8p(str2, (Integer) obj);
                        return;
                    }
                    if (obj instanceof Long) {
                        A9K(str2, (Long) obj);
                        return;
                    }
                    if (obj instanceof Boolean) {
                        A7v(str2, (Boolean) obj);
                        return;
                    }
                    if (obj instanceof String) {
                        str3 = (String) obj;
                    } else {
                        if (obj instanceof Float) {
                            A8c(str2, (Float) obj);
                            return;
                        }
                        if (obj instanceof Double) {
                            A8I(str2, (Double) obj);
                            return;
                        }
                        if (obj instanceof Map) {
                            A9M(str2, (Map) obj);
                            return;
                        }
                        if (obj instanceof java.util.Set) {
                            AAL(str2, (java.util.Set) obj);
                            return;
                        }
                        if (obj instanceof List) {
                            AAk(str2, (List) obj);
                            return;
                        } else if (obj instanceof InterfaceC02530Ab) {
                            A8R((InterfaceC02530Ab) obj, str2);
                            return;
                        } else {
                            if (obj instanceof C0Zx) {
                                AAQ((C0Zx) obj, str2);
                                return;
                            }
                            throw new RuntimeException("Not supported on IG yet.");
                        }
                    }
                }
                AAP(str2, str3);
            }

            @Override // X.InterfaceC02590Ai
            public final void AAK(InterfaceC02580Ag interfaceC02580Ag, String str2) {
                if (interfaceC02580Ag == null) {
                    this.A00.A0C(str2, null);
                } else {
                    A9T(str2, interfaceC02580Ag.F7g());
                }
            }

            @Override // X.InterfaceC02590Ai
            public final void AAL(String str2, java.util.Set set) {
                C0x9 c0x9;
                C19280xC c19280xC = this.A00;
                if (set != null) {
                    c0x9 = AbstractC11490j8.A02(set);
                } else {
                    c0x9 = null;
                }
                c19280xC.A06(c0x9, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void AAP(String str2, String str3) {
                this.A00.A0C(str2, str3);
            }

            @Override // X.InterfaceC02590Ai
            public final void AAQ(C0Zx c0Zx, String str2) {
                C19260xA c19260xA;
                C19280xC c19280xC = this.A00;
                if (c0Zx != null) {
                    c19260xA = AbstractC11490j8.A01(c0Zx.A00);
                } else {
                    c19260xA = null;
                }
                c19280xC.A05(c19260xA, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void AAk(String str2, List list) {
                C0x9 c0x9;
                C19280xC c19280xC = this.A00;
                if (list != null) {
                    c0x9 = AbstractC11490j8.A02(list);
                } else {
                    c0x9 = null;
                }
                c19280xC.A06(c0x9, str2);
            }

            @Override // X.InterfaceC02590Ai
            public final void Cht() {
                C19280xC c19280xC = this.A00;
                C14360o3.A0B(c19280xC, 0);
                EnumC11440j2 enumC11440j2 = EnumC11440j2.A0A;
                EnumSet enumSet = c19280xC.A07;
                enumSet.add(enumC11440j2);
                if (this.A01) {
                    enumSet.add(EnumC11440j2.A07);
                }
                Integer num2 = this.A03;
                Integer num3 = C05F.A01;
                InterfaceC11360iu interfaceC11360iu = this.A02;
                if (num2 == num3) {
                    interfaceC11360iu.EIu(c19280xC);
                } else {
                    interfaceC11360iu.EHW(c19280xC);
                }
            }

            {
                this.A02 = A002;
                this.A00 = A00;
                this.A03 = num;
                this.A01 = z;
            }
        };
    }

    public C18920wW(InterfaceC11380iw interfaceC11380iw, C12180kM c12180kM, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(c12180kM, 3);
        this.A01 = abstractC12990ll;
        this.A02 = interfaceC11380iw;
        this.A00 = c12180kM;
    }
}
