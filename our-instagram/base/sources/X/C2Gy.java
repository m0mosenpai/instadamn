package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2Gy, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Gy implements InterfaceC47612Gm {
    public final /* synthetic */ TypeAdapter A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Class A02;

    public C2Gy(TypeAdapter typeAdapter, Class cls, Class cls2) {
        this.A02 = cls;
        this.A01 = cls2;
        this.A00 = typeAdapter;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class cls = typeToken.rawType;
        if (cls != this.A02 && cls != this.A01) {
            return null;
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factory[type=");
        sb.append(this.A01.getName());
        sb.append("+");
        sb.append(this.A02.getName());
        sb.append(",adapter=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
