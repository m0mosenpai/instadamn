package kotlinx.serialization.json;

import X.C3R9;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonPrimitiveSerializer.class)
/* loaded from: classes2.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Object();

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return JsonPrimitiveSerializer.A01;
        }
    }

    public String A00() {
        return ((JsonLiteral) this).A00;
    }

    public String toString() {
        return A00();
    }
}
