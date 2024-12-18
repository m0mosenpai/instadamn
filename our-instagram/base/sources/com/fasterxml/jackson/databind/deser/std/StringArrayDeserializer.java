package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC167007dF;
import X.AbstractC58320PtC;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C2I7;
import X.C64175T2e;
import X.C912845h;
import X.C914045z;
import X.EnumC61060ReZ;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.SQ8;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class StringArrayDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public JsonDeserializer A00;
    public final InterfaceC102444jN A01;
    public final boolean A02;
    public final Boolean A03;
    public static final String[] A05 = new String[0];
    public static final StringArrayDeserializer A04 = new StringArrayDeserializer();

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, Boolean bool) {
        super(String[].class);
        this.A00 = jsonDeserializer;
        this.A01 = interfaceC102444jN;
        this.A03 = bool;
        this.A02 = AbstractC167007dF.A1X(interfaceC102444jN, C64175T2e.A02);
    }

    private final String[] A00(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0k;
        Boolean bool = this.A03;
        if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
            if (c16l.A19(C16R.A0G)) {
                A0k = this.A01.BXX(anonymousClass469);
            } else {
                A0k = A0k(c16l, anonymousClass469);
            }
            return new String[]{(String) A0k};
        }
        if (c16l.A19(C16R.A0J)) {
            return (String[]) A0h(c16l, anonymousClass469);
        }
        anonymousClass469.A0T(c16l, super.A00);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0B() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        String[] strArr = (String[]) obj;
        if (!c16l.A16()) {
            String[] A00 = A00(c16l, anonymousClass469);
            if (A00 != null) {
                int length = strArr.length;
                int length2 = A00.length;
                String[] strArr2 = new String[length2 + length];
                System.arraycopy(strArr, 0, strArr2, 0, length);
                System.arraycopy(A00, 0, strArr2, length, length2);
                return strArr2;
            }
            return strArr;
        }
        if (this.A00 != null) {
            return A0x(c16l, anonymousClass469, strArr);
        }
        SQ8 A0M = anonymousClass469.A0M();
        int length3 = strArr.length;
        Object[] A052 = A0M.A05(strArr, length3);
        while (true) {
            try {
                String A1O = c16l.A1O();
                if (A1O == null) {
                    C16R A10 = c16l.A10();
                    if (A10 != C16R.A08) {
                        if (A10 == C16R.A0G) {
                            if (this.A02) {
                                return A05;
                            }
                            A1O = (String) this.A01.BXX(anonymousClass469);
                        } else {
                            A1O = A0k(c16l, anonymousClass469);
                        }
                    } else {
                        Object[] A06 = A0M.A06(A052, length3, String.class);
                        anonymousClass469.A0b(A0M);
                        return A06;
                    }
                }
                if (length3 >= A052.length) {
                    A052 = A0M.A04(A052);
                    length3 = 0;
                }
                int i = length3 + 1;
                try {
                    A052[length3] = A1O;
                    length3 = i;
                } catch (Exception e) {
                    e = e;
                    length3 = i;
                    throw C102314j6.A03(A052, e, A0M.A00 + length3);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A00;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer A0D;
        JsonDeserializer jsonDeserializer = this.A00;
        JsonDeserializer A052 = StdDeserializer.A05(interfaceC65620ToB, anonymousClass469, jsonDeserializer);
        AbstractC910944l A0A = anonymousClass469.A0A(String.class);
        if (A052 == null) {
            A0D = anonymousClass469.A0B(interfaceC65620ToB, A0A);
        } else {
            A0D = anonymousClass469.A0D(interfaceC65620ToB, A0A, A052);
        }
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, String[].class).A01(EnumC61060ReZ.A01);
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0D);
        if (A0D != null && C914045z.A0K(A0D)) {
            A0D = null;
        }
        if (jsonDeserializer == A0D && C2I7.A00(this.A03, A01) && this.A01 == A0V) {
            return this;
        }
        return new StringArrayDeserializer(A0D, A0V, A01);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        int i;
        if (!c16l.A16()) {
            return A00(c16l, anonymousClass469);
        }
        if (this.A00 != null) {
            return A0x(c16l, anonymousClass469, null);
        }
        SQ8 A0M = anonymousClass469.A0M();
        Object[] A03 = A0M.A03();
        int i2 = 0;
        while (true) {
            try {
                String A1O = c16l.A1O();
                try {
                    if (A1O == null) {
                        C16R A10 = c16l.A10();
                        if (A10 != C16R.A08) {
                            if (A10 == C16R.A0G) {
                                if (this.A02) {
                                    continue;
                                } else {
                                    A1O = (String) this.A01.BXX(anonymousClass469);
                                }
                            } else {
                                A1O = A0k(c16l, anonymousClass469);
                            }
                        } else {
                            Object[] A06 = A0M.A06(A03, i2, String.class);
                            anonymousClass469.A0b(A0M);
                            return A06;
                        }
                    }
                    A03[i2] = A1O;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw C102314j6.A03(A03, e, A0M.A00 + i2);
                }
                if (i2 >= A03.length) {
                    A03 = A0M.A04(A03);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return A05;
    }

    public final String[] A0x(C16L c16l, AnonymousClass469 anonymousClass469, String[] strArr) {
        int length;
        Object[] A052;
        String str;
        int i;
        SQ8 A0M = anonymousClass469.A0M();
        if (strArr == null) {
            A052 = A0M.A03();
            length = 0;
        } else {
            length = strArr.length;
            A052 = A0M.A05(strArr, length);
        }
        JsonDeserializer jsonDeserializer = this.A00;
        while (true) {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                if (c16l.A1O() == null) {
                    C16R A10 = c16l.A10();
                    if (A10 != C16R.A08) {
                        if (A10 == C16R.A0G) {
                            if (this.A02) {
                                continue;
                            } else {
                                str = (String) this.A01.BXX(anonymousClass469);
                            }
                        } else {
                            str = (String) jsonDeserializer.A0D(c16l, anonymousClass469);
                        }
                    } else {
                        String[] strArr2 = (String[]) A0M.A06(A052, length, String.class);
                        anonymousClass469.A0b(A0M);
                        return strArr2;
                    }
                } else {
                    str = (String) jsonDeserializer.A0D(c16l, anonymousClass469);
                }
                A052[length] = str;
                length = i;
            } catch (Exception e2) {
                e = e2;
                length = i;
                throw C102314j6.A03(String.class, e, length);
            }
            if (length >= A052.length) {
                A052 = A0M.A04(A052);
                length = 0;
            }
            i = length + 1;
        }
    }

    public StringArrayDeserializer() {
        this(null, null, null);
    }
}
