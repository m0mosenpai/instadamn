package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C102424jJ;
import X.C16L;
import X.C16R;
import X.C2I7;
import X.C45T;
import X.EnumC61060ReZ;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.SQ8;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Array;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public JsonDeserializer A00;
    public final AbstractC63020Sal A01;
    public final Class A02;
    public final boolean A03;
    public final Object[] A04;

    public ObjectArrayDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l, (InterfaceC102444jN) null, (Boolean) null);
        C102424jJ c102424jJ = (C102424jJ) abstractC910944l;
        Class cls = c102424jJ.A00.A00;
        this.A02 = cls;
        this.A03 = AbstractC167007dF.A1X(cls, Object.class);
        this.A00 = jsonDeserializer;
        this.A01 = abstractC63020Sal;
        this.A04 = (Object[]) c102424jJ.A01;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer = this.A00;
        AbstractC910944l abstractC910944l = ((ContainerDeserializerBase) this).A00;
        Class cls = abstractC910944l.A00;
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, cls).A01(EnumC61060ReZ.A01);
        JsonDeserializer A0b = AbstractC58320PtC.A0b(interfaceC65620ToB, anonymousClass469, abstractC910944l, StdDeserializer.A05(interfaceC65620ToB, anonymousClass469, jsonDeserializer));
        AbstractC63020Sal abstractC63020Sal = this.A01;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0b);
        if (C2I7.A00(A01, super.A02) && A0V == ((ContainerDeserializerBase) this).A01 && A0b == jsonDeserializer && abstractC63020Sal == abstractC63020Sal) {
            return this;
        }
        return new ObjectArrayDeserializer(A0b, A0V, this, abstractC63020Sal, A01);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0B() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Object[] A06;
        Object A0J;
        int i;
        Object[] objArr = (Object[]) obj;
        if (!c16l.A16()) {
            Object[] A0x = A0x(c16l, anonymousClass469);
            if (A0x != null) {
                int length = objArr.length;
                int length2 = A0x.length;
                Object[] objArr2 = new Object[length2 + length];
                System.arraycopy(objArr, 0, objArr2, 0, length);
                System.arraycopy(A0x, 0, objArr2, length, length2);
                return objArr2;
            }
            return objArr;
        }
        SQ8 A0M = anonymousClass469.A0M();
        int length3 = objArr.length;
        Object[] A05 = A0M.A05(objArr, length3);
        AbstractC63020Sal abstractC63020Sal = this.A01;
        while (true) {
            try {
                C16R A1J = c16l.A1J();
                if (A1J == C16R.A08) {
                    break;
                }
                try {
                    if (A1J == C16R.A0G) {
                        if (super.A03) {
                            continue;
                        } else {
                            A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
                        }
                    } else if (abstractC63020Sal == null) {
                        A0J = this.A00.A0D(c16l, anonymousClass469);
                    } else {
                        A0J = this.A00.A0J(c16l, anonymousClass469, abstractC63020Sal);
                    }
                    A05[length3] = A0J;
                    length3 = i;
                } catch (Exception e) {
                    e = e;
                    length3 = i;
                    throw C102314j6.A03(A05, e, A0M.A00 + length3);
                }
                if (length3 >= A05.length) {
                    A05 = A0M.A04(A05);
                    length3 = 0;
                }
                i = length3 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this.A03) {
            int i2 = A0M.A00 + length3;
            A06 = new Object[i2];
            A0M.A02(A05, i2, length3, A06);
            A0M.A00();
        } else {
            A06 = A0M.A06(A05, length3, this.A02);
        }
        anonymousClass469.A0b(A0M);
        return A06;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A00 == null && this.A01 == null) {
            return true;
        }
        return false;
    }

    public final Object[] A0x(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0J;
        Object[] objArr;
        Boolean bool = super.A02;
        if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
            if (c16l.A19(C16R.A0G)) {
                if (super.A03) {
                    return this.A04;
                }
                A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
            } else {
                AbstractC63020Sal abstractC63020Sal = this.A01;
                JsonDeserializer jsonDeserializer = this.A00;
                if (abstractC63020Sal == null) {
                    A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
                } else {
                    A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                }
            }
            if (this.A03) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance((Class<?>) this.A02, 1);
            }
            objArr[0] = A0J;
            return objArr;
        }
        if (c16l.A19(C16R.A0J)) {
            if (this.A02 == Byte.class) {
                byte[] A1S = c16l.A1S(((C45T) anonymousClass469.A02).A01.A00);
                int length = A1S.length;
                Byte[] bArr = new Byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = Byte.valueOf(A1S[i]);
                }
                return bArr;
            }
            return (Object[]) A0h(c16l, anonymousClass469);
        }
        anonymousClass469.A0R(c16l, ((ContainerDeserializerBase) this).A00);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object[] A06;
        Object A0J;
        int i;
        if (!c16l.A16()) {
            return A0x(c16l, anonymousClass469);
        }
        SQ8 A0M = anonymousClass469.A0M();
        Object[] A03 = A0M.A03();
        AbstractC63020Sal abstractC63020Sal = this.A01;
        int i2 = 0;
        while (true) {
            try {
                C16R A1J = c16l.A1J();
                if (A1J == C16R.A08) {
                    break;
                }
                try {
                    if (A1J == C16R.A0G) {
                        if (super.A03) {
                            continue;
                        } else {
                            A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
                        }
                    } else if (abstractC63020Sal == null) {
                        A0J = this.A00.A0D(c16l, anonymousClass469);
                    } else {
                        A0J = this.A00.A0J(c16l, anonymousClass469, abstractC63020Sal);
                    }
                    A03[i2] = A0J;
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
        if (this.A03) {
            int i3 = A0M.A00 + i2;
            A06 = new Object[i3];
            A0M.A02(A03, i3, i2, A06);
            A0M.A00();
        } else {
            A06 = A0M.A06(A03, i2, this.A02);
        }
        anonymousClass469.A0b(A0M);
        return A06;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    public ObjectArrayDeserializer(JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, ObjectArrayDeserializer objectArrayDeserializer, AbstractC63020Sal abstractC63020Sal, Boolean bool) {
        super(interfaceC102444jN, objectArrayDeserializer, bool);
        this.A02 = objectArrayDeserializer.A02;
        this.A03 = objectArrayDeserializer.A03;
        this.A04 = objectArrayDeserializer.A04;
        this.A00 = jsonDeserializer;
        this.A01 = abstractC63020Sal;
    }
}
