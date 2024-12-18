package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class RC7 extends RBU implements Serializable {
    public static final Object A0H = C45I.NON_EMPTY;
    public AbstractC910944l A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public AbstractC63023Sar A03;
    public final AnonymousClass164 A04;
    public final AbstractC910944l A05;
    public final AbstractC910944l A06;
    public final C913945y A07;
    public final RBL A08;
    public final Object A09;
    public final boolean A0A;
    public final Class[] A0B;
    public transient SZV A0C;
    public transient Field A0D;
    public transient Method A0E;
    public transient HashMap A0F;
    public final transient C45A A0G;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r2 != r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.45m] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.RC7, X.ToB] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.RC7] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.RC1, X.RC7, X.ToB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonSerializer A00(X.AbstractC913345m r5, X.RC7 r6, java.lang.Object r7) {
        /*
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A02
            if (r0 != 0) goto L69
            java.lang.Class r4 = r7.getClass()
            X.SZV r2 = r6.A0C
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A00(r4)
            if (r0 != 0) goto L69
            boolean r0 = r6 instanceof X.RC1
            if (r0 == 0) goto L4b
            X.RC1 r6 = (X.RC1) r6
            X.44l r0 = r6.A00
            if (r0 == 0) goto L46
            X.44l r0 = r5.A0A(r0, r4)
            com.fasterxml.jackson.databind.JsonSerializer r3 = r5.A0E(r6, r0)
        L22:
            X.SXY r2 = r6.A00
            boolean r0 = r3.A08()
            if (r0 == 0) goto L39
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
            if (r0 == 0) goto L39
            r0 = r3
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer r0 = (com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer) r0
            X.SXY r1 = r0.A00
            X.RDC r0 = new X.RDC
            r0.<init>(r2, r1)
            r2 = r0
        L39:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A07(r2)
            X.SZV r0 = r6.A0C
            X.SZV r0 = r0.A01(r1, r4)
        L43:
            r6.A0C = r0
        L45:
            return r1
        L46:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r5.A0I(r6, r4)
            goto L22
        L4b:
            X.44l r0 = r6.A00
            if (r0 == 0) goto L60
            X.44l r0 = r5.A0A(r0, r4)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.A0D(r6, r0)
            java.lang.Class r0 = r0.A00
            X.SZV r0 = r2.A01(r1, r0)
        L5d:
            if (r2 == r0) goto L45
            goto L43
        L60:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r5.A0H(r6, r4)
            X.SZV r0 = r2.A01(r1, r4)
            goto L5d
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC7.A00(X.45m, X.RC7, java.lang.Object):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public static boolean A01(JsonSerializer jsonSerializer, AbstractC913345m abstractC913345m, Object obj, Object obj2) {
        if (A0H == obj) {
            return jsonSerializer.A0B(abstractC913345m, obj2);
        }
        return obj.equals(obj2);
    }

    public final RC7 A02(SXY sxy) {
        if (this instanceof RC1) {
            RC1 rc1 = (RC1) this;
            String A00 = sxy.A00(rc1.A04.A03);
            return new RC1(new AnonymousClass164(A00), rc1, new RDC(sxy, rc1.A00));
        }
        if (this instanceof C60608RBz) {
            C60608RBz c60608RBz = (C60608RBz) this;
            return new C60608RBz(c60608RBz.A00.A02(sxy), c60608RBz.A01);
        }
        if (this instanceof C60607RBy) {
            C60607RBy c60607RBy = (C60607RBy) this;
            return new C60607RBy(c60607RBy.A00.A02(sxy), c60607RBy.A01);
        }
        AnonymousClass164 anonymousClass164 = this.A04;
        String A002 = sxy.A00(anonymousClass164.A03);
        if (A002.equals(anonymousClass164.toString())) {
            return this;
        }
        C913945y A003 = C913945y.A00(A002);
        if (this instanceof C60606RBx) {
            return new RC7(A003, this);
        }
        return new RC7(A003, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r1 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.AnonymousClass182 r7, X.AbstractC913345m r8, java.lang.Object r9) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C60608RBz
            if (r0 == 0) goto L21
            r2 = r6
            X.RBz r2 = (X.C60608RBz) r2
            java.lang.Class r1 = r8.A07
            if (r1 == 0) goto L1e
            java.lang.Class r0 = r2.A01
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1e
            X.RC7 r0 = r2.A00
        L15:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r0.A01
        L17:
            if (r1 == 0) goto La7
            r0 = 0
            r1.A0A(r7, r8, r0)
            return
        L1e:
            X.RC7 r0 = r2.A00
            goto L44
        L21:
            boolean r0 = r6 instanceof X.C60607RBy
            if (r0 == 0) goto L48
            r5 = r6
            X.RBy r5 = (X.C60607RBy) r5
            java.lang.Class r4 = r8.A07
            if (r4 == 0) goto L3d
            java.lang.Class[] r3 = r5.A01
            int r2 = r3.length
            r1 = 0
        L30:
            if (r1 >= r2) goto L3f
            r0 = r3[r1]
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L3d
            int r1 = r1 + 1
            goto L30
        L3d:
            r1 = 1
            goto L40
        L3f:
            r1 = 0
        L40:
            X.RC7 r0 = r5.A00
            if (r1 == 0) goto L15
        L44:
            r0.A03(r7, r8, r9)
            return
        L48:
            boolean r0 = r6 instanceof X.RC0
            if (r0 == 0) goto L77
            r3 = r6
            X.RC0 r3 = (X.RC0) r3
            java.lang.String r0 = r3.A00
            java.lang.Object r2 = r8.A0S(r0)
            if (r2 == 0) goto L65
            com.fasterxml.jackson.databind.JsonSerializer r1 = A00(r8, r3, r2)
            java.lang.Object r0 = r3.A09
            if (r0 == 0) goto L68
            boolean r0 = A01(r1, r8, r0, r2)
            if (r0 == 0) goto L68
        L65:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A01
            goto L17
        L68:
            if (r2 != r9) goto L71
            boolean r0 = r3.A07(r7, r1, r8)
            if (r0 == 0) goto L71
            return
        L71:
            X.Sar r0 = r3.A03
            X.AbstractC58322PtE.A1K(r7, r1, r8, r0, r2)
            return
        L77:
            java.lang.reflect.Method r0 = r6.A0E
            r3 = 0
            if (r0 != 0) goto L8c
            java.lang.reflect.Field r0 = r6.A0D
            java.lang.Object r2 = r0.get(r9)
        L82:
            if (r2 != 0) goto L91
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A01
            if (r0 == 0) goto La7
            r0.A0A(r7, r8, r3)
            return
        L8c:
            java.lang.Object r2 = r0.invoke(r9, r3)
            goto L82
        L91:
            com.fasterxml.jackson.databind.JsonSerializer r1 = A00(r8, r6, r2)
            java.lang.Object r0 = r6.A09
            if (r0 == 0) goto Lab
            boolean r0 = A01(r1, r8, r0, r2)
            if (r0 == 0) goto Lab
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A01
            if (r0 == 0) goto La7
            r0.A0A(r7, r8, r3)
            return
        La7:
            r7.A0b()
            return
        Lab:
            if (r2 != r9) goto Lb4
            boolean r0 = r6.A07(r7, r1, r8)
            if (r0 == 0) goto Lb4
            return
        Lb4:
            X.Sar r0 = r6.A03
            X.AbstractC58322PtE.A1K(r7, r1, r8, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC7.A03(X.182, X.45m, java.lang.Object):void");
    }

    public void A04(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Object invoke;
        Method method = this.A0E;
        if (method == null) {
            invoke = this.A0D.get(obj);
        } else {
            invoke = method.invoke(obj, null);
        }
        if (invoke == null) {
            if (this.A01 != null) {
                anonymousClass182.A0l(this.A04);
                this.A01.A0A(anonymousClass182, abstractC913345m, null);
                return;
            }
            return;
        }
        JsonSerializer A00 = A00(abstractC913345m, this, invoke);
        Object obj2 = this.A09;
        if (obj2 != null && A01(A00, abstractC913345m, obj2, invoke)) {
            return;
        }
        if (invoke == obj && A07(anonymousClass182, A00, abstractC913345m)) {
            return;
        }
        anonymousClass182.A0l(this.A04);
        AbstractC58322PtE.A1K(anonymousClass182, A00, abstractC913345m, this.A03, invoke);
    }

    public final void A05(JsonSerializer jsonSerializer) {
        RC7 rc7;
        if (this instanceof C60608RBz) {
            rc7 = ((C60608RBz) this).A00;
        } else if (this instanceof C60607RBy) {
            rc7 = ((C60607RBy) this).A00;
        } else {
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
                throw AbstractC58319PtB.A0l("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{C914045z.A07(jsonSerializer2), C914045z.A07(jsonSerializer)});
            }
            this.A01 = jsonSerializer;
            return;
        }
        rc7.A05(jsonSerializer);
    }

    public void A06(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.A02;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw AbstractC58319PtB.A0l("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{C914045z.A07(jsonSerializer2), C914045z.A07(jsonSerializer)});
        }
        this.A02 = jsonSerializer;
    }

    @Override // X.InterfaceC65620ToB
    public final C913945y B8w() {
        return new C913945y(this.A04.A03, null);
    }

    @Override // X.InterfaceC65620ToB
    public final RBL BSA() {
        return this.A08;
    }

    @Override // X.InterfaceC65620ToB
    public final AbstractC910944l CBP() {
        return this.A06;
    }

    @Override // X.InterfaceC65620ToB
    public final String getName() {
        return this.A04.A03;
    }

    public final String toString() {
        String str;
        String A0R;
        StringBuilder A0q = AbstractC58318PtA.A0q(40);
        A0q.append("property '");
        A0q.append(this.A04.A03);
        A0q.append("' (");
        Method method = this.A0E;
        if (method != null) {
            A0q.append("via method ");
            AbstractC58318PtA.A1Q(method.getDeclaringClass(), A0q);
            A0q.append("#");
            str = method.getName();
        } else {
            Field field = this.A0D;
            if (field != null) {
                A0q.append("field \"");
                AbstractC58318PtA.A1Q(field.getDeclaringClass(), A0q);
                A0q.append("#");
                str = field.getName();
            } else {
                str = "virtual";
            }
        }
        A0q.append(str);
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            A0R = ", no static serializer";
        } else {
            A0R = AnonymousClass001.A0R(", static serializer of type ", MSY.A0h(jsonSerializer));
        }
        return AbstractC25236BEt.A0Y(A0R, A0q);
    }

    public RC7(C913945y c913945y, RC7 rc7) {
        super(rc7);
        this.A04 = new AnonymousClass164(c913945y.A02);
        this.A07 = rc7.A07;
        this.A0G = rc7.A0G;
        this.A06 = rc7.A06;
        this.A08 = rc7.A08;
        this.A0E = rc7.A0E;
        this.A0D = rc7.A0D;
        this.A02 = rc7.A02;
        this.A01 = rc7.A01;
        HashMap hashMap = rc7.A0F;
        if (hashMap != null) {
            this.A0F = AbstractC58318PtA.A10(hashMap);
        }
        this.A05 = rc7.A05;
        this.A0C = rc7.A0C;
        this.A0A = rc7.A0A;
        this.A09 = rc7.A09;
        this.A0B = rc7.A0B;
        this.A03 = rc7.A03;
        this.A00 = rc7.A00;
    }

    public final boolean A07(AnonymousClass182 anonymousClass182, JsonSerializer jsonSerializer, AbstractC913345m abstractC913345m) {
        if (!jsonSerializer.A06()) {
            EnumC912645f enumC912645f = EnumC912645f.FAIL_ON_SELF_REFERENCES;
            C45R c45r = abstractC913345m.A05;
            if (c45r.A0C(enumC912645f)) {
                if (jsonSerializer instanceof BeanSerializerBase) {
                    abstractC913345m.A08(this.A06, "Direct self-reference leading to cycle");
                    throw C00O.createAndThrow();
                }
                return false;
            }
            if (c45r.A0C(EnumC912645f.WRITE_SELF_REFERENCES_AS_NULL)) {
                if (this.A01 != null) {
                    if (((C16Q) anonymousClass182.A0E()).A01 != 1) {
                        anonymousClass182.A0l(this.A04);
                    }
                    this.A01.A0A(anonymousClass182, abstractC913345m, null);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public RC7(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, JsonSerializer jsonSerializer, RBL rbl, AbstractC63037SbC abstractC63037SbC, AbstractC63023Sar abstractC63023Sar, C45A c45a, Object obj, Class[] clsArr, boolean z) {
        super(abstractC63037SbC.A0B());
        RC9 rc9;
        this.A08 = rbl;
        this.A0G = c45a;
        AnonymousClass166 anonymousClass166 = AnonymousClass164.A04;
        this.A04 = new AnonymousClass164(abstractC63037SbC.A0L());
        this.A07 = abstractC63037SbC.A0D();
        this.A06 = abstractC910944l;
        this.A02 = jsonSerializer;
        if (jsonSerializer == null) {
            rc9 = RC9.A00;
        } else {
            rc9 = null;
        }
        this.A0C = rc9;
        this.A03 = abstractC63023Sar;
        this.A05 = abstractC910944l2;
        if (rbl instanceof RBJ) {
            this.A0E = null;
            this.A0D = (Field) rbl.A0C();
        } else if (rbl instanceof RBK) {
            this.A0E = (Method) rbl.A0C();
            this.A0D = null;
        } else {
            this.A0E = null;
            this.A0D = null;
        }
        this.A0A = z;
        this.A09 = obj;
        this.A01 = null;
        this.A0B = clsArr;
    }

    public RC7(AnonymousClass164 anonymousClass164, RC7 rc7) {
        super(rc7);
        this.A04 = anonymousClass164;
        this.A07 = rc7.A07;
        this.A08 = rc7.A08;
        this.A0G = rc7.A0G;
        this.A06 = rc7.A06;
        this.A0E = rc7.A0E;
        this.A0D = rc7.A0D;
        this.A02 = rc7.A02;
        this.A01 = rc7.A01;
        HashMap hashMap = rc7.A0F;
        if (hashMap != null) {
            this.A0F = AbstractC58318PtA.A10(hashMap);
        }
        this.A05 = rc7.A05;
        this.A0C = rc7.A0C;
        this.A0A = rc7.A0A;
        this.A09 = rc7.A09;
        this.A0B = rc7.A0B;
        this.A03 = rc7.A03;
        this.A00 = rc7.A00;
    }

    public RC7() {
        super(TIH.A09);
        this.A08 = null;
        this.A0G = null;
        this.A04 = null;
        this.A07 = null;
        this.A0B = null;
        this.A06 = null;
        this.A02 = null;
        this.A0C = null;
        this.A03 = null;
        this.A05 = null;
        this.A0E = null;
        this.A0D = null;
        this.A0A = false;
        this.A09 = null;
        this.A01 = null;
    }
}
