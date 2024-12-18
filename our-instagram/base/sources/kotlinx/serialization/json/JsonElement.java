package kotlinx.serialization.json;

import X.C3R9;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonElementSerializer.class)
/* loaded from: classes2.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Object();

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return JsonElementSerializer.A00;
        }
    }
}
