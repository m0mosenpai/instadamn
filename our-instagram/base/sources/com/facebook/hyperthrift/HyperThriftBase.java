package com.facebook.hyperthrift;

import X.AbstractC225099wY;
import X.AnonymousClass001;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class HyperThriftBase {
    public static final Object A02 = new Object();
    public String A00;
    public Object[] A01;

    /* loaded from: classes3.dex */
    public abstract class Builder {
        public int A00 = -1;
        public final Object[] A01;

        public static final Object[] A01(Object[] objArr) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            return objArr2;
        }

        public static void A00(Object[] objArr, int i) {
            objArr[i] = AbstractC225099wY.A00(objArr[i]);
        }

        public Builder(int i) {
            this.A01 = new Object[i];
        }
    }

    public final Object A00(int i) {
        Object obj = this.A01[i];
        if (obj == A02 || obj == null) {
            return null;
        }
        return obj;
    }

    public final void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null && obj != A02) {
                if (i < 0) {
                    i = i2;
                } else {
                    throw new IllegalStateException(AnonymousClass001.A02(i, i2, "Multiple eligible values for union field: ", ", "));
                }
            }
        }
    }

    public final void A02(String str, Object[] objArr) {
        this.A00 = str;
        this.A01 = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HyperThriftBase) {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) obj;
            if (this.A00.equals(hyperThriftBase.A00)) {
                return Arrays.deepEquals(this.A01, hyperThriftBase.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode();
        for (Object obj : this.A01) {
            int i2 = hashCode * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            hashCode = i2 + i;
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('{');
        int length = this.A01.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = this.A01[i];
            if (obj2 != null) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(i);
                sb.append(':');
                if (obj2 == A02) {
                    obj = "null";
                } else {
                    obj = obj2.toString();
                }
                sb.append(obj);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
