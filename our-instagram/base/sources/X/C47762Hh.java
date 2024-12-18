package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: X.2Hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47762Hh extends TypeAdapter {
    public static final InterfaceC47612Gm A02 = new InterfaceC47612Gm() { // from class: X.2Hi
        @Override // X.InterfaceC47612Gm
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            Type componentType;
            Type type = typeToken.type;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new C47762Hh(gson, gson.A03(new TypeToken(componentType)), AbstractC47822Hp.A00(componentType));
        }
    };
    public final TypeAdapter A00;
    public final Class A01;

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.A0A();
            return;
        }
        jsonWriter.A06();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.A00.write(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.A08();
    }

    public C47762Hh(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.A00 = new C2I9(gson, typeAdapter, cls);
        this.A01 = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.A0M();
        while (jsonReader.A0S()) {
            arrayList.add(this.A00.read(jsonReader));
        }
        jsonReader.A0O();
        int size = arrayList.size();
        Class cls = this.A01;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }
}
