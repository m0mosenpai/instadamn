package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.4fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100744fd {
    public final Map A00 = new LinkedHashMap();

    public final void A01(String str, JsonElement jsonElement) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(jsonElement, 1);
        this.A00.put(str, jsonElement);
    }

    public final JsonObject A00() {
        return new JsonObject(this.A00);
    }
}
