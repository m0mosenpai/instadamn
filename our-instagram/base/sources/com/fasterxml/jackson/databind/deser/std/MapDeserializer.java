package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC62638SJv;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C44W;
import X.C45Y;
import X.C63173SeY;
import X.C63242Sfw;
import X.C64523THw;
import X.C912845h;
import X.C914045z;
import X.InterfaceC102444jN;
import X.InterfaceC102464je;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.MSY;
import X.R97;
import X.R9r;
import X.R9z;
import X.RBL;
import X.SG8;
import X.TII;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class MapDeserializer extends ContainerDeserializerBase implements InterfaceC102464je, InterfaceC102474jf {
    public JsonDeserializer A00;
    public C63173SeY A01;
    public C64523THw A02;
    public Set A03;
    public Set A04;
    public boolean A05;
    public final JsonDeserializer A06;
    public final AbstractC62638SJv A07;
    public final AbstractC63035SbA A08;
    public final AbstractC63020Sal A09;
    public final boolean A0A;

    public final boolean A0y(AbstractC910944l abstractC910944l, AbstractC62638SJv abstractC62638SJv) {
        AbstractC910944l A04;
        Class cls;
        return abstractC62638SJv == null || (A04 = abstractC910944l.A04()) == null || (((cls = A04.A00) == String.class || cls == Object.class) && C914045z.A0K(abstractC62638SJv));
    }

    public MapDeserializer(JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, InterfaceC102444jN interfaceC102444jN, MapDeserializer mapDeserializer, AbstractC63020Sal abstractC63020Sal, Set set, Set set2) {
        super(interfaceC102444jN, mapDeserializer, ((ContainerDeserializerBase) mapDeserializer).A02);
        this.A07 = abstractC62638SJv;
        this.A06 = jsonDeserializer;
        this.A09 = abstractC63020Sal;
        this.A08 = mapDeserializer.A08;
        this.A01 = mapDeserializer.A01;
        this.A00 = mapDeserializer.A00;
        this.A0A = mapDeserializer.A0A;
        this.A03 = set;
        this.A04 = set2;
        this.A02 = C63242Sfw.A00(set, set2);
        this.A05 = A0y(((ContainerDeserializerBase) this).A00, abstractC62638SJv);
    }

    private void A00(AnonymousClass469 anonymousClass469, R97 r97, SG8 sg8, Object obj) {
        if (sg8 == null) {
            anonymousClass469.A0h(AbstractC167017dG.A0n(r97, "Unresolved forward reference but no identity info: ", AbstractC166987dD.A1C()), AbstractC58318PtA.A1b());
            throw C00O.createAndThrow();
        }
        R9z r9z = new R9z(r97, sg8, sg8.A02, obj);
        sg8.A00.add(r9z);
        r97.A00.A00(r9z);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f4: INVOKE (r9v0 ?? I:X.469), (r10v1 ?? I:java.lang.Object), (r2 I:java.lang.String), (r0 I:java.lang.Throwable) STATIC call: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:244), block:B:75:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x004a -> B:19:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00b1 -> B:51:0x009a). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0C(X.C16L r8, X.AnonymousClass469 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0C(X.16L, X.469, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:19:0x0076, B:25:0x0054, B:27:0x0058, B:29:0x005c, B:32:0x0063, B:33:0x0068, B:38:0x007e), top: B:24:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0126 -> B:76:0x0113). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0035 -> B:8:0x0022). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.C16L r11, X.AnonymousClass469 r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0C;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A06 == null && this.A07 == null && this.A09 == null && this.A03 == null && this.A04 == null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0058 -> B:15:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0x(X.C16L r11, X.AnonymousClass469 r12, java.util.Map r13) {
        /*
            r10 = this;
            X.SJv r6 = r10.A07
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r10.A06
            X.Sal r4 = r10.A09
            X.THn r0 = r5.A0F()
            r8 = 0
            boolean r9 = X.AbstractC167007dF.A1W(r0)
            r7 = 0
            if (r9 == 0) goto L3b
            X.44l r0 = r10.A00
            X.44l r0 = r0.A03()
            java.lang.Class r0 = r0.A00
            X.SG8 r3 = new X.SG8
            r3.<init>(r0, r13)
        L1f:
            boolean r0 = r11.A17()
            if (r0 != 0) goto L58
            X.16R r2 = r11.A10()
            X.16R r1 = X.C16R.A0A
            if (r2 == r1) goto L3d
            X.16R r0 = X.C16R.A09
            if (r2 == r0) goto La0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r12.A0V(r1, r7, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3b:
            r3 = r7
            goto L1f
        L3d:
            java.lang.String r8 = r11.A0Y()
        L41:
            if (r8 == 0) goto La0
            java.lang.Object r7 = r6.A00(r12, r8)
            X.16R r1 = r11.A1J()
            X.THw r0 = r10.A02
            if (r0 == 0) goto L5d
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L5d
            r11.A0z()
        L58:
            java.lang.String r8 = r11.A1N()
            goto L41
        L5d:
            X.16R r0 = X.C16R.A0G     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            if (r1 != r0) goto L6a
            boolean r0 = r10.A03     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            if (r0 != 0) goto L58
            java.lang.Object r2 = X.AbstractC58318PtA.A0d(r12, r10)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            goto L75
        L6a:
            if (r4 != 0) goto L71
            java.lang.Object r2 = r5.A0D(r11, r12)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            goto L75
        L71:
            java.lang.Object r2 = r5.A0J(r11, r12, r4)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
        L75:
            if (r9 == 0) goto L8e
            java.util.List r1 = r3.A00     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            boolean r0 = r1.isEmpty()     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            if (r0 == 0) goto L85
            java.util.Map r0 = r3.A01     // Catch: X.R97 -> L92 java.lang.Exception -> L97
        L81:
            r0.put(r7, r2)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            goto L58
        L85:
            java.lang.Object r0 = X.AbstractC58320PtC.A0u(r1)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            X.R9z r0 = (X.R9z) r0     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            java.util.Map r0 = r0.A02     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            goto L81
        L8e:
            r13.put(r7, r2)     // Catch: X.R97 -> L92 java.lang.Exception -> L97
            goto L58
        L92:
            r0 = move-exception
            r10.A00(r12, r0, r3, r7)
            goto L58
        L97:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r12, r13, r8, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0x(X.16L, X.469, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashSet] */
    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        Set set;
        Set set2;
        AbstractC62638SJv abstractC62638SJv = this.A07;
        if (abstractC62638SJv == null) {
            abstractC62638SJv = anonymousClass469.A0G(((ContainerDeserializerBase) this).A00.A04());
        }
        JsonDeserializer jsonDeserializer = this.A06;
        if (interfaceC65620ToB != null) {
            jsonDeserializer = StdDeserializer.A05(interfaceC65620ToB, anonymousClass469, jsonDeserializer);
        }
        JsonDeserializer A0b = AbstractC58320PtC.A0b(interfaceC65620ToB, anonymousClass469, ((ContainerDeserializerBase) this).A00, jsonDeserializer);
        AbstractC63020Sal abstractC63020Sal = this.A09;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        ?? r15 = this.A03;
        Set set3 = this.A04;
        C44W A00 = anonymousClass469.A02.A00();
        r15 = r15;
        r15 = r15;
        if (A00 != null && interfaceC65620ToB != null) {
            RBL BSA = interfaceC65620ToB.BSA();
            r15 = r15;
            if (BSA != null) {
                TII A05 = A00.A05(BSA);
                if (A05.A02) {
                    set2 = Collections.emptySet();
                } else {
                    set2 = A05.A00;
                }
                if (!set2.isEmpty()) {
                    if (r15 == 0) {
                        r15 = AbstractC166987dD.A1H();
                    } else {
                        r15 = AbstractC31171DnF.A0k(r15);
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        AbstractC58318PtA.A1W(r15, it);
                    }
                }
                Set set4 = A00.A07(BSA).A00;
                r15 = r15;
                if (set4 != null) {
                    set = AbstractC166987dD.A1H();
                    if (set3 == null) {
                        set = AbstractC31171DnF.A0k(set4);
                    } else {
                        for (Object obj : set4) {
                            if (set3.contains(obj)) {
                                set.add(obj);
                            }
                        }
                    }
                    InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0b);
                    return (abstractC62638SJv != abstractC62638SJv && jsonDeserializer == A0b && abstractC63020Sal == abstractC63020Sal && ((ContainerDeserializerBase) this).A01 == A0V && this.A03 == r15 && this.A04 == set) ? this : new MapDeserializer(A0b, abstractC62638SJv, A0V, this, abstractC63020Sal, r15, set);
                }
            }
        }
        set = set3;
        InterfaceC102444jN A0V2 = A0V(interfaceC65620ToB, anonymousClass469, A0b);
        if (abstractC62638SJv != abstractC62638SJv) {
        }
    }

    @Override // X.InterfaceC102464je
    public final void EK8(AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        Object[] objArr;
        String str;
        AbstractC910944l abstractC910944l2;
        AbstractC63035SbA abstractC63035SbA = this.A08;
        if (abstractC63035SbA.A0M()) {
            if (!(abstractC63035SbA instanceof R9r) || (abstractC910944l2 = ((R9r) abstractC63035SbA).A01) == null) {
                abstractC910944l = ((ContainerDeserializerBase) this).A00;
                objArr = new Object[]{abstractC910944l, MSY.A0h(abstractC63035SbA)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, str, objArr);
                throw C00O.createAndThrow();
            }
            this.A00 = anonymousClass469.A0B(null, abstractC910944l2);
        } else if (abstractC63035SbA.A0K()) {
            if (!(abstractC63035SbA instanceof R9r) || (abstractC910944l2 = ((R9r) abstractC63035SbA).A00) == null) {
                abstractC910944l = ((ContainerDeserializerBase) this).A00;
                objArr = new Object[]{abstractC910944l, MSY.A0h(abstractC63035SbA)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, str, objArr);
                throw C00O.createAndThrow();
            }
            this.A00 = anonymousClass469.A0B(null, abstractC910944l2);
        }
        if (abstractC63035SbA.A0I()) {
            C912845h c912845h = anonymousClass469.A02;
            this.A01 = C63173SeY.A01(anonymousClass469, abstractC63035SbA, abstractC63035SbA.A0O(c912845h), c912845h.A08(C45Y.A04));
        }
        this.A05 = A0y(((ContainerDeserializerBase) this).A00, this.A07);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }

    public MapDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, AbstractC63035SbA abstractC63035SbA, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l, (InterfaceC102444jN) null, (Boolean) null);
        this.A07 = abstractC62638SJv;
        this.A06 = jsonDeserializer;
        this.A09 = abstractC63020Sal;
        this.A08 = abstractC63035SbA;
        this.A0A = abstractC63035SbA.A0L();
        this.A00 = null;
        this.A01 = null;
        this.A05 = A0y(abstractC910944l, abstractC62638SJv);
        this.A02 = null;
    }
}
