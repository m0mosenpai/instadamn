package X;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TS0 implements WildcardType, Serializable {
    public final ImmutableList A00;
    public final ImmutableList A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (!this.A00.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A01, Arrays.asList(wildcardType.getUpperBounds()));
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return (Type[]) this.A00.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return (Type[]) this.A01.toArray(new Type[0]);
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("?");
        C1LC it = this.A00.iterator();
        while (it.hasNext()) {
            Type type = (Type) it.next();
            A0s.append(" super ");
            A0s.append(EnumC61069Rej.A00.A00(type));
        }
        ImmutableList immutableList = this.A01;
        T83 t83 = new T83(new T82());
        immutableList.getClass();
        Iterator it2 = new C60756RQi(0, immutableList, t83).iterator();
        while (it2.hasNext()) {
            Type type2 = (Type) it2.next();
            A0s.append(" extends ");
            A0s.append(EnumC61069Rej.A00.A00(type2));
        }
        return A0s.toString();
    }

    public TS0(Type[] lowerBounds, Type[] upperBounds) {
        AbstractC63322ShW.A01("lower bound for wildcard", lowerBounds);
        AbstractC63322ShW.A01("upper bound for wildcard", upperBounds);
        EnumC61069Rej enumC61069Rej = EnumC61069Rej.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        int length = lowerBounds.length;
        for (int i = 0; i < length; i = 1) {
            builder.add((Object) enumC61069Rej.A02(lowerBounds[i]));
        }
        this.A00 = builder.build();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add((Object) enumC61069Rej.A02(upperBounds[0]));
        this.A01 = builder2.build();
    }
}
