package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.TRt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64735TRt implements GenericArrayType, Serializable {
    public final Type A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && AbstractC47822Hp.A06(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0R(AbstractC47822Hp.A01(this.A00), "[]");
    }

    public C64735TRt(Type type) {
        type.getClass();
        this.A00 = AbstractC47822Hp.A04(type);
    }
}
