package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: X.2I9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2I9 extends TypeAdapter {
    public final Gson A00;
    public final TypeAdapter A01;
    public final Type A02;

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        return this.A01.read(jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        TypeAdapter A00;
        TypeAdapter typeAdapter = this.A01;
        ?? r1 = this.A02;
        Class<?> cls = r1;
        if (obj != null && ((r1 instanceof Class) || (r1 instanceof TypeVariable))) {
            cls = obj.getClass();
        }
        if (cls != r1) {
            typeAdapter = this.A00.A03(new TypeToken(cls));
            if (typeAdapter instanceof C2IB) {
                TypeAdapter typeAdapter2 = typeAdapter;
                while ((typeAdapter2 instanceof AbstractC47852Ht) && (A00 = ((AbstractC47852Ht) typeAdapter2).A00()) != typeAdapter2) {
                    typeAdapter2 = A00;
                }
                if (!(typeAdapter2 instanceof C2IB)) {
                    typeAdapter = typeAdapter;
                }
            }
        }
        typeAdapter.write(jsonWriter, obj);
    }

    public C2I9(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.A00 = gson;
        this.A01 = typeAdapter;
        this.A02 = type;
    }
}
