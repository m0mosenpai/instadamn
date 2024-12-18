package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* renamed from: X.IlS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42118IlS implements C2I0 {
    public final /* synthetic */ Type A00;

    public C42118IlS(Type type) {
        this.A00 = type;
    }

    @Override // X.C2I0
    public final Object AJW() {
        Type type = this.A00;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException(AnonymousClass001.A0R("Invalid EnumSet type: ", type.toString()));
        }
        throw new RuntimeException(AnonymousClass001.A0R("Invalid EnumSet type: ", type.toString()));
    }
}
