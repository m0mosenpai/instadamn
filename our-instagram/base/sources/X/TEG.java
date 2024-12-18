package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes10.dex */
public final class TEG implements InterfaceC47612Gm {
    public final /* synthetic */ TypeAdapter A00;
    public final /* synthetic */ TypeToken A01;

    public TEG(TypeAdapter typeAdapter, TypeToken typeToken) {
        this.A01 = typeToken;
        this.A00 = typeAdapter;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.equals(this.A01)) {
            return this.A00;
        }
        return null;
    }
}
