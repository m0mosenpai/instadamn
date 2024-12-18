package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.4fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100754fe {
    public static final SerialDescriptor A00 = AbstractC100784fh.A00("kotlinx.serialization.json.JsonUnquotedLiteral", C3RD.A01);

    public static final int A00(JsonPrimitive jsonPrimitive) {
        C14360o3.A0B(jsonPrimitive, 0);
        try {
            String A002 = jsonPrimitive.A00();
            long A07 = new C3T2(A002).A07();
            if (-2147483648L <= A07 && A07 <= 2147483647L) {
                return (int) A07;
            }
            throw new NumberFormatException(AnonymousClass001.A0R(A002, " is not an Int"));
        } catch (C100764ff e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Boolean A01(JsonPrimitive jsonPrimitive) {
        C14360o3.A0B(jsonPrimitive, 0);
        String A002 = jsonPrimitive.A00();
        C14360o3.A0B(A002, 0);
        if (A002.equalsIgnoreCase("true")) {
            return true;
        }
        if (A002.equalsIgnoreCase("false")) {
            return false;
        }
        return null;
    }

    public static final JsonArray A02(JsonElement jsonElement) {
        JsonArray jsonArray;
        C14360o3.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonArray) && (jsonArray = (JsonArray) jsonElement) != null) {
            return jsonArray;
        }
        A07(AbstractC111324zv.A00(1676), jsonElement);
        throw C00O.createAndThrow();
    }

    public static final JsonObject A03(JsonElement jsonElement) {
        JsonObject jsonObject;
        C14360o3.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonObject) && (jsonObject = (JsonObject) jsonElement) != null) {
            return jsonObject;
        }
        A07(AbstractC111324zv.A00(1677), jsonElement);
        throw C00O.createAndThrow();
    }

    public static final JsonPrimitive A06(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        C14360o3.A0B(jsonElement, 0);
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null) {
            return jsonPrimitive;
        }
        A07("JsonPrimitive", jsonElement);
        throw C00O.createAndThrow();
    }

    public static final JsonPrimitive A04(Boolean bool) {
        if (bool == null) {
            return JsonNull.A00;
        }
        return new JsonLiteral(bool, false);
    }

    public static final JsonPrimitive A05(String str) {
        if (str == null) {
            return JsonNull.A00;
        }
        return new JsonLiteral(str, true);
    }

    public static final void A07(String str, JsonElement jsonElement) {
        StringBuilder sb = new StringBuilder();
        sb.append("Element ");
        sb.append(new C0YZ(jsonElement.getClass()));
        sb.append(" is not a ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final boolean A08(JsonPrimitive jsonPrimitive) {
        Boolean bool;
        String A002 = jsonPrimitive.A00();
        C14360o3.A0B(A002, 0);
        if (A002.equalsIgnoreCase("true")) {
            bool = true;
        } else if (A002.equalsIgnoreCase("false")) {
            bool = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(jsonPrimitive);
            sb.append(" does not represent a Boolean");
            throw new IllegalStateException(sb.toString());
        }
        return bool.booleanValue();
    }
}
