package X;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.44o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C911244o implements Serializable {
    public static final C911244o A04;
    public static final AbstractC910944l[] A05;
    public static final String[] A06;
    public final int A00;
    public final AbstractC910944l[] A01;
    public final String[] A02;
    public final String[] A03;

    static {
        String[] strArr = new String[0];
        A06 = strArr;
        AbstractC910944l[] abstractC910944lArr = new AbstractC910944l[0];
        A05 = abstractC910944lArr;
        A04 = new C911244o(abstractC910944lArr, strArr, null);
    }

    public static C911244o A02(Class cls, AbstractC910944l[] abstractC910944lArr) {
        String[] strArr;
        String str;
        int length;
        int i = 0;
        if (abstractC910944lArr == null) {
            abstractC910944lArr = A05;
        } else {
            int length2 = abstractC910944lArr.length;
            if (length2 != 1) {
                if (length2 == 2) {
                    return A00(abstractC910944lArr[0], abstractC910944lArr[1], cls);
                }
            } else {
                return A01(abstractC910944lArr[0], cls);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && (length = typeParameters.length) != 0) {
            strArr = new String[length];
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
        } else {
            strArr = A06;
        }
        int length3 = strArr.length;
        int length4 = abstractC910944lArr.length;
        if (length3 != length4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(length4);
            sb.append(" type parameter");
            if (length4 == 1) {
                str = "";
            } else {
                str = "s";
            }
            sb.append(str);
            sb.append(": class expects ");
            sb.append(length3);
            throw new IllegalArgumentException(sb.toString());
        }
        return new C911244o(abstractC910944lArr, strArr, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r9.getClass() != r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r9 == r8) goto L31
            java.lang.Class r2 = r8.getClass()
            X.460[] r0 = X.C914045z.A01
            if (r9 == 0) goto L12
            java.lang.Class r1 = r9.getClass()
            r0 = 1
            if (r1 == r2) goto L13
        L12:
            r0 = 0
        L13:
            r6 = 0
            if (r0 == 0) goto L30
            X.44o r9 = (X.C911244o) r9
            X.44l[] r5 = r8.A01
            int r4 = r5.length
            X.44l[] r3 = r9.A01
            int r0 = r3.length
            if (r4 != r0) goto L30
            r2 = 0
        L21:
            if (r2 >= r4) goto L31
            r1 = r3[r2]
            r0 = r5[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L30
            int r2 = r2 + 1
            goto L21
        L30:
            return r6
        L31:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911244o.equals(java.lang.Object):boolean");
    }

    public static C911244o A00(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, Class cls) {
        TypeVariable[] typeParameters;
        int length;
        TypeVariable[] typeVariableArr = SVF.A00;
        if (cls == Map.class) {
            typeParameters = SVF.A07;
        } else if (cls == HashMap.class) {
            typeParameters = SVF.A03;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = SVF.A05;
        } else {
            typeParameters = cls.getTypeParameters();
        }
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 2) {
                return new C911244o(new AbstractC910944l[]{abstractC910944l, abstractC910944l2}, new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, null);
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 2 type parameters: class expects "));
    }

    public static C911244o A01(AbstractC910944l abstractC910944l, Class cls) {
        TypeVariable[] typeParameters;
        int length;
        TypeVariable[] typeVariableArr = SVF.A00;
        if (cls == Collection.class) {
            typeParameters = SVF.A02;
        } else if (cls == List.class) {
            typeParameters = SVF.A06;
        } else if (cls == ArrayList.class) {
            typeParameters = SVF.A01;
        } else if (cls == AbstractList.class) {
            typeParameters = SVF.A00;
        } else if (cls == Iterable.class) {
            typeParameters = SVF.A04;
        } else {
            typeParameters = cls.getTypeParameters();
        }
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 1) {
                return new C911244o(new AbstractC910944l[]{abstractC910944l}, new String[]{typeParameters[0].getName()}, null);
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects "));
    }

    public final List A03() {
        AbstractC910944l[] abstractC910944lArr = this.A01;
        if (abstractC910944lArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(abstractC910944lArr);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        AbstractC910944l[] abstractC910944lArr = this.A01;
        int length = abstractC910944lArr.length;
        if (length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int i = 0;
        while (true) {
            AbstractC910944l abstractC910944l = abstractC910944lArr[i];
            StringBuilder sb2 = new StringBuilder(40);
            abstractC910944l.A0I(sb2);
            sb.append(sb2.toString());
            i++;
            if (i < length) {
                if (i > 0) {
                    sb.append(',');
                }
            } else {
                sb.append('>');
                return sb.toString();
            }
        }
    }

    public C911244o(AbstractC910944l[] abstractC910944lArr, String[] strArr, String[] strArr2) {
        strArr = strArr == null ? A06 : strArr;
        this.A02 = strArr;
        abstractC910944lArr = abstractC910944lArr == null ? A05 : abstractC910944lArr;
        this.A01 = abstractC910944lArr;
        int length = strArr.length;
        int length2 = abstractC910944lArr.length;
        if (length == length2) {
            int i = 1;
            for (AbstractC910944l abstractC910944l : abstractC910944lArr) {
                i += abstractC910944l.hashCode();
            }
            this.A03 = strArr2;
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("Mismatching names (", "), types (", ")", length, length2));
    }
}
