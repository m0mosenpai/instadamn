package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes10.dex */
public abstract class TIZ implements Comparable {
    public final Type A00;

    public TIZ() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.A00 = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw AbstractC166987dD.A12("Internal error: TypeReference constructed without actual type information");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }
}
