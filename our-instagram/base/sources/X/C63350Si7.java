package X;

import android.util.JsonWriter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Si7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63350Si7 {
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x004b. Please report as an issue. */
    public static void A02(JsonWriter jsonWriter, Object obj) {
        ReadableMap asMap;
        ReadableArray asArray;
        if (obj instanceof Map) {
            A04(jsonWriter, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                A03(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (obj instanceof ReadableMap) {
            asMap = (ReadableMap) obj;
        } else {
            if (obj instanceof ReadableArray) {
                asArray = (ReadableArray) obj;
            } else if (obj instanceof Dynamic) {
                Dynamic dynamic = (Dynamic) obj;
                switch (dynamic.getType().ordinal()) {
                    case 0:
                        jsonWriter.nullValue();
                        return;
                    case 1:
                        jsonWriter.value(dynamic.asBoolean());
                        return;
                    case 2:
                        jsonWriter.value(dynamic.asDouble());
                        return;
                    case 3:
                        jsonWriter.value(dynamic.asString());
                        return;
                    case 4:
                        asMap = dynamic.asMap();
                        break;
                    case 5:
                        asArray = dynamic.asArray();
                        break;
                    default:
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Unknown data type: ");
                        throw AbstractC43594JPz.A0n(dynamic.getType(), A1C);
                }
            } else {
                A03(jsonWriter, obj);
                return;
            }
            A00(jsonWriter, asArray);
            return;
        }
        A01(jsonWriter, asMap);
    }

    public static void A03(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else {
            if (obj instanceof Boolean) {
                jsonWriter.value(AbstractC166987dD.A1a(obj));
                return;
            }
            throw AbstractC37303Gc4.A0M(obj, "Unknown value: ", AbstractC166987dD.A1C());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    public static void A00(JsonWriter jsonWriter, ReadableArray readableArray) {
        jsonWriter.beginArray();
        for (int i = 0; i < readableArray.size(); i++) {
            try {
                switch (readableArray.getType(i).ordinal()) {
                    case 0:
                        jsonWriter.nullValue();
                    case 1:
                        jsonWriter.value(readableArray.getBoolean(i));
                    case 2:
                        jsonWriter.value(readableArray.getDouble(i));
                    case 3:
                        jsonWriter.value(readableArray.getString(i));
                    case 4:
                        A01(jsonWriter, readableArray.getMap(i));
                    case 5:
                        A00(jsonWriter, readableArray.getArray(i));
                    default:
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Unknown data type: ");
                        throw AbstractC43594JPz.A0n(readableArray.getType(i), A1C);
                }
            } finally {
                jsonWriter.endArray();
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    public static void A01(JsonWriter jsonWriter, ReadableMap readableMap) {
        jsonWriter.beginObject();
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.CLQ()) {
                String Csu = keySetIterator.Csu();
                jsonWriter.name(Csu);
                switch (readableMap.getType(Csu).ordinal()) {
                    case 0:
                        jsonWriter.nullValue();
                    case 1:
                        jsonWriter.value(readableMap.getBoolean(Csu));
                    case 2:
                        jsonWriter.value(readableMap.getDouble(Csu));
                    case 3:
                        jsonWriter.value(readableMap.getString(Csu));
                    case 4:
                        A01(jsonWriter, readableMap.getMap(Csu));
                    case 5:
                        A00(jsonWriter, readableMap.getArray(Csu));
                    default:
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Unknown data type: ");
                        throw AbstractC43594JPz.A0n(readableMap.getType(Csu), A1C);
                }
            }
        } finally {
            jsonWriter.endObject();
        }
    }

    public static void A04(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            jsonWriter.name(A1K.getKey().toString());
            A02(jsonWriter, A1K.getValue());
        }
        jsonWriter.endObject();
    }
}
