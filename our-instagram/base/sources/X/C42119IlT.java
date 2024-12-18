package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* renamed from: X.IlT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42119IlT implements C2I0 {
    public final /* synthetic */ Type A00;

    public C42119IlT(Type type) {
        this.A00 = type;
    }

    @Override // X.C2I0
    public final Object AJW() {
        Type type = this.A00;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException(AnonymousClass001.A0R("Invalid EnumMap type: ", type.toString()));
        }
        throw new RuntimeException(AnonymousClass001.A0R("Invalid EnumMap type: ", type.toString()));
    }
}
