package kotlinx.serialization.json;

import X.AbstractC001800i;
import X.C14360o3;
import X.C3R9;
import X.InterfaceC15590qF;
import X.InterfaceC16660sJ;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonObjectSerializer.class)
/* loaded from: classes2.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, InterfaceC15590qF {
    public static final Companion Companion = new Object();
    public final Map A00;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return JsonObjectSerializer.A01;
        }
    }

    public JsonObject(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        C14360o3.A0B(obj, 0);
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        C14360o3.A0B(obj, 0);
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C14360o3.A0K(this.A00, obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        C14360o3.A0B(obj, 0);
        return this.A00.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "{", "}", this.A00.entrySet(), new InterfaceC16660sJ() { // from class: X.4fu
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                C14360o3.A0B(entry, 0);
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC902640l.A00(sb, str);
                sb.append(':');
                sb.append(value);
                String obj2 = sb.toString();
                C14360o3.A07(obj2);
                return obj2;
            }
        });
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return this.A00.values();
    }
}
