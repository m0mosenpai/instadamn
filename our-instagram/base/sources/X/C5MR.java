package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.5MR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MR implements WildcardType, Serializable {
    public final Type A00;
    public final Type A01;

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && AbstractC47822Hp.A06(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.A00;
        if (type != null) {
            return new Type[]{type};
        }
        return AbstractC47822Hp.A00;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.A01};
    }

    public final int hashCode() {
        int i;
        Type type = this.A00;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.A01.hashCode() + 31);
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        Type type = this.A00;
        if (type != null) {
            sb = new StringBuilder();
            str = "? super ";
        } else {
            type = this.A01;
            if (type == Object.class) {
                return "?";
            }
            sb = new StringBuilder();
            str = "? extends ";
        }
        sb.append(str);
        sb.append(AbstractC47822Hp.A01(type));
        return sb.toString();
    }

    public C5MR(Type[] typeArr, Type[] typeArr2) {
        Type A04;
        int length = typeArr2.length;
        C2I6.A00(length <= 1);
        C2I6.A00(typeArr.length == 1);
        if (length == 1) {
            typeArr2[0].getClass();
            AbstractC47822Hp.A05(typeArr2[0]);
            A04 = Object.class;
            C2I6.A00(typeArr[0] == A04);
            this.A00 = AbstractC47822Hp.A04(typeArr2[0]);
        } else {
            typeArr[0].getClass();
            AbstractC47822Hp.A05(typeArr[0]);
            A04 = AbstractC47822Hp.A04(typeArr[0]);
        }
        this.A01 = A04;
    }
}
