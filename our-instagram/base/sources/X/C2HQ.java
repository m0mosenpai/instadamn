package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2HQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HQ implements InterfaceC47612Gm {
    public final /* synthetic */ InterfaceC47572Gi A00;

    public C2HQ(InterfaceC47572Gi interfaceC47572Gi) {
        this.A00 = interfaceC47572Gi;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (typeToken.rawType != Object.class) {
            return null;
        }
        return new C2HP(gson, this.A00);
    }
}
