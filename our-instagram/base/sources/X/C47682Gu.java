package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47682Gu implements InterfaceC47612Gm {
    public final /* synthetic */ TypeAdapter A00;
    public final /* synthetic */ Class A01;

    public C47682Gu(TypeAdapter typeAdapter, Class cls) {
        this.A01 = cls;
        this.A00 = typeAdapter;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.rawType == this.A01) {
            return this.A00;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factory[type=");
        sb.append(this.A01.getName());
        sb.append(",adapter=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
