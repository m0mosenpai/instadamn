package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: X.TRs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64734TRs implements GenericArrayType, Serializable {
    public final Type A00;

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC50102Ry.A00(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
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
        String obj;
        Type type = this.A00;
        if (type instanceof Class) {
            obj = ((Class) type).getName();
        } else {
            obj = type.toString();
        }
        return AnonymousClass001.A0R(obj, "[]");
    }

    public C64734TRs(Type componentType) {
        this.A00 = EnumC61069Rej.A00.A02(componentType);
    }
}
