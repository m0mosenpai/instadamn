package X;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: X.TRz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64740TRz implements ParameterizedType, Serializable {
    public final ImmutableList A00;
    public final Class A01;
    public final Type A02;

    public final boolean equals(Object other) {
        if (!(other instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) other;
        if (!getRawType().equals(parameterizedType.getRawType()) || !AbstractC50102Ry.A00(getOwnerType(), parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.A00.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.A02;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A02) ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }

    public C64740TRz(Class ownerType, Type rawType, Type[] typeArguments) {
        C18C.A0E(AbstractC167007dF.A1P(typeArguments.length, ownerType.getTypeParameters().length));
        AbstractC63322ShW.A01("type parameter", typeArguments);
        this.A02 = rawType;
        this.A01 = ownerType;
        EnumC61069Rej enumC61069Rej = EnumC61069Rej.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : typeArguments) {
            builder.add((Object) enumC61069Rej.A02(type));
        }
        this.A00 = builder.build();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Type type = this.A02;
        if (type != null) {
            EnumC61069Rej enumC61069Rej = EnumC61069Rej.A00;
            if (3 - ((C60783RSu) enumC61069Rej).A00 != 0) {
                A1C.append(enumC61069Rej.A00(type));
                A1C.append('.');
            }
        }
        AbstractC58318PtA.A1Q(this.A01, A1C);
        A1C.append('<');
        C71473Il c71473Il = AbstractC63322ShW.A00;
        ImmutableList immutableList = this.A00;
        C64285T7u c64285T7u = new C64285T7u(EnumC61069Rej.A00, 3);
        immutableList.getClass();
        A1C.append(c71473Il.A02(new C60756RQi(1, c64285T7u, immutableList)));
        return MSX.A0l(A1C, '>');
    }
}
