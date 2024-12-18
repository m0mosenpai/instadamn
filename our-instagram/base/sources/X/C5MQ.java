package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.5MQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MQ implements ParameterizedType, Serializable {
    public final Type A00;
    public final Type A01;
    public final Type[] A02;

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && AbstractC47822Hp.A06(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.A02.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.A00;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.A01;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.A02) ^ this.A01.hashCode();
        Type type = this.A00;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.A02;
        int length = typeArr.length;
        if (length == 0) {
            return AbstractC47822Hp.A01(this.A01);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC47822Hp.A01(this.A01));
        sb.append("<");
        sb.append(AbstractC47822Hp.A01(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC47822Hp.A01(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.getEnclosingClass() == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5MQ(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
        /*
            r4 = this;
            r4.<init>()
            r6.getClass()
            boolean r0 = r6 instanceof java.lang.Class
            r3 = 0
            if (r0 == 0) goto L29
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r2 = 1
            if (r0 != 0) goto L20
            java.lang.Class r1 = r1.getEnclosingClass()
            r0 = 0
            if (r1 != 0) goto L21
        L20:
            r0 = 1
        L21:
            if (r5 != 0) goto L26
            if (r0 != 0) goto L26
            r2 = 0
        L26:
            X.C2I6.A00(r2)
        L29:
            if (r5 != 0) goto L5a
            r0 = 0
        L2c:
            r4.A00 = r0
            java.lang.reflect.Type r0 = X.AbstractC47822Hp.A04(r6)
            r4.A01 = r0
            java.lang.Object r0 = r7.clone()
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r4.A02 = r0
            int r2 = r0.length
        L3d:
            if (r3 >= r2) goto L5f
            java.lang.reflect.Type[] r0 = r4.A02
            r0 = r0[r3]
            r0.getClass()
            java.lang.reflect.Type[] r0 = r4.A02
            r0 = r0[r3]
            X.AbstractC47822Hp.A05(r0)
            java.lang.reflect.Type[] r1 = r4.A02
            r0 = r1[r3]
            java.lang.reflect.Type r0 = X.AbstractC47822Hp.A04(r0)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L3d
        L5a:
            java.lang.reflect.Type r0 = X.AbstractC47822Hp.A04(r5)
            goto L2c
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5MQ.<init>(java.lang.reflect.Type, java.lang.reflect.Type, java.lang.reflect.Type[]):void");
    }
}
