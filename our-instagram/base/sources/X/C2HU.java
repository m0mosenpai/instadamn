package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2HU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HU implements InterfaceC47612Gm {
    public final /* synthetic */ C2HT A00;

    public C2HU(C2HT c2ht) {
        this.A00 = c2ht;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.rawType == Number.class) {
            return this.A00;
        }
        return null;
    }
}
