package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2HG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HG implements InterfaceC47612Gm {
    public final /* synthetic */ TypeAdapter A00;
    public final /* synthetic */ Class A01;

    public C2HG(TypeAdapter typeAdapter, Class cls) {
        this.A01 = cls;
        this.A00 = typeAdapter;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class<?> cls = typeToken.rawType;
        if (!this.A01.isAssignableFrom(cls)) {
            return null;
        }
        return new C60842RVc(this, cls);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factory[typeHierarchy=");
        sb.append(this.A01.getName());
        sb.append(",adapter=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
