package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177847vJ extends JsonWriter {
    public JsonElement A00;
    public String A01;
    public final List A02;
    public static final Writer A04 = new Writer() { // from class: X.9rp
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    public static final JsonPrimitive A03 = new JsonPrimitive("closed");

    public C177847vJ() {
        super(A04);
        this.A02 = new ArrayList();
        this.A00 = RVZ.A00;
    }

    public static void A00(JsonElement jsonElement, C177847vJ c177847vJ) {
        if (c177847vJ.A01 != null) {
            if (!(jsonElement instanceof RVZ) || c177847vJ.A05) {
                ((JsonObject) ((JsonElement) c177847vJ.A02.get(r1.size() - 1))).add(c177847vJ.A01, jsonElement);
            }
            c177847vJ.A01 = null;
            return;
        }
        List list = c177847vJ.A02;
        if (list.isEmpty()) {
            c177847vJ.A00 = jsonElement;
            return;
        }
        JsonElement jsonElement2 = (JsonElement) list.get(list.size() - 1);
        if (jsonElement2 instanceof JsonArray) {
            ((JsonArray) jsonElement2).add(jsonElement);
            return;
        }
        throw new IllegalStateException();
    }
}
