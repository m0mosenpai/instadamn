package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sag, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63016Sag {
    public final AbstractC910944l A00;
    public final C62578SHd[] A01;
    public final C914146b[] A02;
    public final String[] A03;
    public final Map A04;

    public final void A00(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        Object obj2 = this.A04.get(str);
        if (obj2 != null) {
            String A1P = c16l.A1P();
            if (obj2 instanceof List) {
                Iterator A1J = AbstractC25226BEj.A1J(obj2);
                while (A1J.hasNext()) {
                    int A0B = AbstractC167007dF.A0B(A1J);
                    if (str.equals(this.A01[A0B].A03)) {
                        if (obj != null) {
                            C914146b[] c914146bArr = this.A02;
                            if (c914146bArr[A0B] != null) {
                                A01(c16l, anonymousClass469, obj, A1P, A0B);
                                c914146bArr[A0B] = null;
                            }
                        }
                        this.A03[A0B] = A1P;
                    }
                }
                return;
            }
            int A0H = AbstractC166987dD.A0H(obj2);
            if (str.equals(this.A01[A0H].A03)) {
                if (obj != null) {
                    C914146b[] c914146bArr2 = this.A02;
                    if (c914146bArr2[A0H] != null) {
                        A01(c16l, anonymousClass469, obj, A1P, A0H);
                        c914146bArr2[A0H] = null;
                        return;
                    }
                }
                this.A03[A0H] = A1P;
            }
        }
    }

    public final void A02(Object obj, C16L c16l, AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        String str;
        Object[] objArr;
        String str2;
        C62578SHd[] c62578SHdArr = this.A01;
        int length = c62578SHdArr.length;
        for (int i = 0; i < length; i++) {
            String str3 = this.A03[i];
            C62578SHd c62578SHd = c62578SHdArr[i];
            C914146b c914146b = this.A02[i];
            if (str3 == null) {
                if (c914146b != null) {
                    if (C63216SfM.A04[((int) c914146b.A03.A00) & 15].A03) {
                        C60570R8k A11 = c914146b.A11(c16l);
                        A11.A1J();
                        RBV rbv = c62578SHd.A01;
                        Object A01 = AbstractC63020Sal.A01(A11, rbv.A04);
                        if (A01 != null) {
                            rbv.A0L(obj, A01);
                        }
                    }
                    RBd rBd = (RBd) c62578SHd.A02;
                    AbstractC910944l abstractC910944l2 = rBd.A03;
                    if (abstractC910944l2 != null) {
                        Iterator it = C914045z.A00;
                        Class cls = abstractC910944l2.A00;
                        if (cls == null || (str3 = rBd.A04.CN7(cls, null)) == null) {
                            abstractC910944l = this.A00;
                            str = c62578SHd.A01.A06.A02;
                            objArr = new Object[]{c62578SHd.A03};
                            str2 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver";
                        }
                    } else {
                        abstractC910944l = this.A00;
                        str = c62578SHd.A01.A06.A02;
                        objArr = new Object[]{c62578SHd.A03};
                        str2 = "Missing external type id property '%s' (and no 'defaultImpl' specified)";
                    }
                    Class cls2 = abstractC910944l.A00;
                    C102314j6 c102314j6 = new C102314j6(anonymousClass469.A07, String.format(str2, objArr));
                    if (str != null) {
                        c102314j6.A08(cls2, str);
                        throw c102314j6;
                    }
                    throw c102314j6;
                }
                continue;
            } else if (c914146b == null) {
                RBV rbv2 = c62578SHd.A01;
                Boolean bool = ((AbstractC64171T2a) rbv2).A00.A02;
                if ((bool != null && bool.booleanValue()) || anonymousClass469.A0j(EnumC912945i.A0B)) {
                    Class<?> cls3 = obj.getClass();
                    String str4 = rbv2.A06.A02;
                    C102314j6 c102314j62 = new C102314j6(anonymousClass469.A07, String.format("Missing property '%s' for external type id '%s'", str4, c62578SHd.A03));
                    if (str4 != null) {
                        c102314j62.A08(cls3, str4);
                        throw c102314j62;
                    }
                    throw c102314j62;
                }
                return;
            }
            A01(c16l, anonymousClass469, obj, str3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.46b[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C16L r13, X.AnonymousClass469 r14, java.lang.Object r15, java.lang.String r16) {
        /*
            r12 = this;
            r6 = r12
            java.util.Map r0 = r12.A04
            r2 = r16
            java.lang.Object r1 = r0.get(r2)
            r0 = 0
            if (r1 != 0) goto Ld
            return r0
        Ld:
            boolean r0 = r1 instanceof java.util.List
            r5 = 1
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L5f
            java.util.Iterator r4 = X.AbstractC25226BEj.A1J(r1)
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            X.SHd[] r0 = r12.A01
            int r3 = r1.intValue()
            r0 = r0[r3]
            java.lang.String r0 = r0.A03
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r2 = r13.A1P()
            r13.A0z()
            java.lang.String[] r1 = r12.A03
            r1[r3] = r2
        L39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8d
            int r0 = X.AbstractC167007dF.A0B(r4)
            r1[r0] = r2
            goto L39
        L46:
            X.46b r2 = new X.46b
            r2.<init>(r13, r14)
            r2.A14(r13)
            X.46b[] r1 = r12.A02
            r1[r3] = r2
        L52:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8d
            int r0 = X.AbstractC167007dF.A0B(r4)
            r1[r0] = r2
            goto L52
        L5f:
            int r11 = X.AbstractC166987dD.A0H(r1)
            X.SHd[] r0 = r12.A01
            r0 = r0[r11]
            java.lang.String r0 = r0.A03
            boolean r0 = r2.equals(r0)
            r9 = r15
            if (r0 == 0) goto L8e
            java.lang.String[] r2 = r12.A03
            java.lang.String r0 = r13.A1Q()
            r2[r11] = r0
            r13.A0z()
            if (r15 == 0) goto L8d
            X.46b[] r1 = r12.A02
            r0 = r1[r11]
        L81:
            if (r0 == 0) goto L8d
            r10 = r2[r11]
            r0 = 0
            r2[r11] = r0
            r6.A01(r7, r8, r9, r10, r11)
            r1[r11] = r0
        L8d:
            return r5
        L8e:
            X.46b r0 = new X.46b
            r0.<init>(r13, r14)
            r0.A14(r13)
            X.46b[] r1 = r12.A02
            r1[r11] = r0
            if (r15 == 0) goto L8d
            java.lang.String[] r2 = r12.A03
            r0 = r2[r11]
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63016Sag.A03(X.16L, X.469, java.lang.Object, java.lang.String):boolean");
    }

    public final void A01(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str, int i) {
        if (str == null) {
            C102314j6 c102314j6 = new C102314j6(anonymousClass469.A07, "Internal error in external Type Id handling: `null` type id passed");
            Iterator it = C914045z.A00;
            throw c102314j6;
        }
        C60570R8k A11 = this.A02[i].A11(c16l);
        if (A11.A1J() == C16R.A0G) {
            this.A01[i].A01.A0L(obj, null);
            return;
        }
        C914146b c914146b = new C914146b(c16l, anonymousClass469);
        c914146b.A0c();
        c914146b.A0u(str);
        c914146b.A14(A11);
        c914146b.A0Z();
        C60570R8k A112 = c914146b.A11(c16l);
        A112.A1J();
        this.A01[i].A01.A0K(obj, A112, anonymousClass469);
    }

    public C63016Sag(C63016Sag c63016Sag) {
        this.A00 = c63016Sag.A00;
        C62578SHd[] c62578SHdArr = c63016Sag.A01;
        this.A01 = c62578SHdArr;
        this.A04 = c63016Sag.A04;
        int length = c62578SHdArr.length;
        this.A03 = new String[length];
        this.A02 = new C914146b[length];
    }

    public C63016Sag(AbstractC910944l abstractC910944l, Map map, C62578SHd[] c62578SHdArr) {
        this.A00 = abstractC910944l;
        this.A01 = c62578SHdArr;
        this.A04 = map;
        this.A03 = null;
        this.A02 = null;
    }
}
