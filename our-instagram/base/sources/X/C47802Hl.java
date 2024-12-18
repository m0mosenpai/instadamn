package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: X.2Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47802Hl implements InterfaceC47612Gm {
    public final C47642Gp A00;

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.rawType.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return A00(gson, jsonAdapter, this.A00, typeToken);
    }

    public C47802Hl(C47642Gp c47642Gp) {
        this.A00 = c47642Gp;
    }

    public static final TypeAdapter A00(Gson gson, JsonAdapter jsonAdapter, C47642Gp c47642Gp, TypeToken typeToken) {
        InterfaceC65441TkD interfaceC65441TkD;
        InterfaceC65440TkC interfaceC65440TkC;
        TypeAdapter create;
        Object AJW = c47642Gp.A01(new TypeToken(jsonAdapter.value())).AJW();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (AJW instanceof TypeAdapter) {
            create = (TypeAdapter) AJW;
        } else if (AJW instanceof InterfaceC47612Gm) {
            create = ((InterfaceC47612Gm) AJW).create(gson, typeToken);
        } else {
            boolean z = AJW instanceof InterfaceC65441TkD;
            if (!z && !(AJW instanceof InterfaceC65440TkC)) {
                throw new IllegalArgumentException(AnonymousClass001.A11("Invalid attempt to bind an instance of ", AJW.getClass().getName(), " as a @JsonAdapter for ", typeToken.toString(), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."));
            }
            if (z) {
                interfaceC65441TkD = (InterfaceC65441TkD) AJW;
            } else {
                interfaceC65441TkD = null;
            }
            if (AJW instanceof InterfaceC65440TkC) {
                interfaceC65440TkC = (InterfaceC65440TkC) AJW;
            } else {
                interfaceC65440TkC = null;
            }
            return new C58580Pxy(gson, interfaceC65440TkC, interfaceC65441TkD, null, typeToken, nullSafe);
        }
        if (create != null && nullSafe) {
            return new C47672Gt(create);
        }
        return create;
    }
}
