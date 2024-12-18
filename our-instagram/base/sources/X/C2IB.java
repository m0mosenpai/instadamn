package X;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.2IB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2IB extends TypeAdapter {
    public final Map A00;

    public abstract Object A00();

    public abstract Object A01(Object obj);

    public abstract void A02(C2I3 c2i3, JsonReader jsonReader, Object obj);

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        Object obj2;
        TypeAdapter c2i9;
        if (obj == null) {
            jsonWriter.A0A();
            return;
        }
        jsonWriter.A07();
        try {
            for (C2I3 c2i3 : this.A00.values()) {
                if (c2i3.A04) {
                    Method method = c2i3.A09;
                    if (method != null) {
                        try {
                            obj2 = method.invoke(obj, new Object[0]);
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException(AnonymousClass001.A0g("Accessor ", AbstractC47872Hw.A00(method), " threw exception"), e.getCause());
                        }
                    } else {
                        obj2 = c2i3.A02.get(obj);
                    }
                    if (obj2 != obj) {
                        jsonWriter.A0G(c2i3.A01);
                        if (c2i3.A0C) {
                            c2i9 = c2i3.A06;
                        } else {
                            c2i9 = new C2I9(c2i3.A05, c2i3.A06, c2i3.A08.type);
                        }
                        c2i9.write(jsonWriter, obj2);
                    }
                }
            }
            jsonWriter.A09();
        } catch (IllegalAccessException e2) {
            AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    public C2IB(Map map) {
        this.A00 = map;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        if (jsonReader.A0G() == C05F.A1F) {
            jsonReader.A0Q();
            return null;
        }
        Object A00 = A00();
        try {
            jsonReader.A0N();
            while (jsonReader.A0S()) {
                C2I3 c2i3 = (C2I3) this.A00.get(jsonReader.A0J());
                if (c2i3 != null && c2i3.A03) {
                    A02(c2i3, jsonReader, A00);
                } else {
                    jsonReader.A0R();
                }
            }
            jsonReader.A0P();
            return A01(A00);
        } catch (IllegalAccessException e) {
            AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new RuntimeException(e2);
        }
    }
}
