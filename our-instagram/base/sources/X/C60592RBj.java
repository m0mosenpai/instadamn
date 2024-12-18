package X;

import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: X.RBj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C60592RBj extends AbstractC64178T2h {
    public final C44z A00;

    @Override // X.InterfaceC65565Tmr
    public final String Awq() {
        return "class name used as type id";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r4.A00(r3, r2, r5) != r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC910944l A00(X.AbstractC913445n r8, java.lang.String r9) {
        /*
            r7 = this;
            X.44l r3 = r7.A00
            X.44z r4 = r7.A00
            r0 = 60
            int r0 = r9.indexOf(r0)
            X.45T r5 = r8.A03()
            if (r0 <= 0) goto L47
            java.lang.String r0 = X.AbstractC58318PtA.A0j(r9, r0)
            java.lang.Integer r6 = r4.A02(r3, r5, r0)
            java.lang.Integer r0 = X.C05F.A01
            if (r6 == r0) goto L36
            X.44k r0 = r8.A05()
            X.44l r2 = r0.A08(r9)
            java.lang.Class r0 = r3.A00
            boolean r0 = r2.A0Q(r0)
            if (r0 == 0) goto L77
            java.lang.Integer r1 = X.C05F.A00
            if (r6 == r1) goto Lbe
            java.lang.Integer r0 = r4.A00(r3, r2, r5)
            if (r0 == r1) goto Lbe
        L36:
            java.lang.String r2 = "Configured `PolymorphicTypeValidator` (of type "
            java.lang.String r1 = X.C914045z.A07(r4)
            java.lang.String r0 = ") denied resolution"
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.RB8 r0 = r8.A04(r3, r9, r0)
            throw r0
        L47:
            java.lang.Integer r6 = r4.A02(r3, r5, r9)
            java.lang.Integer r0 = X.C05F.A01
            if (r6 == r0) goto L36
            X.44k r0 = r8.A05()     // Catch: java.lang.Exception -> L7e java.lang.ClassNotFoundException -> L96
            java.lang.Class r2 = r0.A0D(r9)     // Catch: java.lang.Exception -> L7e java.lang.ClassNotFoundException -> L96
            java.lang.Class r0 = r3.A00
            if (r0 == r2) goto L61
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L77
        L61:
            X.451 r0 = r5.A01
            X.44k r1 = r0.A07
            r0 = 0
            X.44l r2 = r1.A05(r3, r2, r0)
            java.lang.Integer r0 = X.C05F.A0C
            if (r6 != r0) goto L98
            java.lang.Integer r1 = r4.A00(r3, r2, r5)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L98
            goto L36
        L77:
            java.lang.String r0 = "Not a subtype"
            X.RB8 r0 = r8.A04(r3, r9, r0)
            throw r0
        L7e:
            r0 = move-exception
            java.lang.String r1 = X.MSY.A0h(r0)
            java.lang.String r0 = X.C914045z.A09(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "problem: (%s) %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.RB8 r0 = r8.A04(r3, r9, r0)
            throw r0
        L96:
            r2 = 0
            goto L9a
        L98:
            if (r2 != 0) goto Lbe
        L9a:
            boolean r0 = r8 instanceof X.AnonymousClass469
            if (r0 == 0) goto Lbe
            X.469 r8 = (X.AnonymousClass469) r8
            java.lang.String r2 = "no such class found"
            X.45h r0 = r8.A02
            X.56v r0 = r0.A08
            r1 = 0
            if (r0 == 0) goto Lb0
            java.lang.String r0 = "handleUnknownTypeId"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        Lb0:
            X.45i r0 = X.EnumC912945i.A09
            boolean r0 = r8.A0j(r0)
            if (r0 != 0) goto Lb9
            return r1
        Lb9:
            X.RB8 r0 = r8.A04(r3, r9, r2)
            throw r0
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60592RBj.A00(X.45n, java.lang.String):X.44l");
    }

    public final String A01(C910844k c910844k, Class cls, Object obj) {
        Class cls2;
        AbstractC911744t A0B;
        Class cls3;
        Iterator it = C914045z.A00;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (!abstractCollection.isEmpty()) {
                    cls3 = ((Enum) abstractCollection.iterator().next()).getDeclaringClass();
                } else {
                    C63145Sdr c63145Sdr = C63145Sdr.A04;
                    Field field = c63145Sdr.A03;
                    if (field != null) {
                        try {
                            cls3 = (Class) field.get(abstractCollection);
                        } catch (Exception e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else {
                        throw AbstractC31175DnJ.A0V("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: ", c63145Sdr.A01);
                    }
                }
                A0B = c910844k.A0A(c910844k.A06(null, C910844k.A09, cls3), EnumSet.class);
            } else {
                if (!(obj instanceof EnumMap)) {
                    return name;
                }
                AbstractMap abstractMap = (AbstractMap) obj;
                if (!abstractMap.isEmpty()) {
                    cls2 = ((Enum) AbstractC167007dF.A0l(abstractMap).next()).getDeclaringClass();
                } else {
                    C63145Sdr c63145Sdr2 = C63145Sdr.A04;
                    Field field2 = c63145Sdr2.A02;
                    if (field2 != null) {
                        try {
                            cls2 = (Class) field2.get(abstractMap);
                        } catch (Exception e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    } else {
                        throw AbstractC31175DnJ.A0V("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: ", c63145Sdr2.A00);
                    }
                }
                C911244o c911244o = C910844k.A09;
                A0B = c910844k.A0B(c910844k.A06(null, c911244o, cls2), c910844k.A06(null, c911244o, Object.class), EnumMap.class);
            }
            return A0B.A0R();
        }
        if (name.indexOf(36) < 0 || C914045z.A00(cls) == null) {
            return name;
        }
        Class cls4 = super.A00.A00;
        if (C914045z.A00(cls4) != null) {
            return name;
        }
        return cls4.getName();
    }

    @Override // X.InterfaceC65565Tmr
    public final String CN6(Object obj) {
        if (this instanceof C60591RBi) {
            String A0h = MSY.A0h(obj);
            if (A0h.startsWith(((C60591RBi) this).A00)) {
                return A0h.substring(r1.length() - 1);
            }
            return A0h;
        }
        return A01(this.A01, obj.getClass(), obj);
    }

    @Override // X.InterfaceC65565Tmr
    public final String CN7(Class cls, Object obj) {
        return A01(this.A01, cls, obj);
    }

    public C60592RBj(AbstractC910944l abstractC910944l, C44z c44z, C910844k c910844k) {
        super(abstractC910944l, c910844k);
        this.A00 = c44z;
    }

    @Override // X.InterfaceC65565Tmr
    public final AbstractC910944l F8w(AbstractC913445n abstractC913445n, String str) {
        return A00(abstractC913445n, str);
    }
}
