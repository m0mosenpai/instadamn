package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.SSt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62821SSt {
    public static final void A00(JsonReader jsonReader, C19260xA c19260xA, C62821SSt c62821SSt) {
        Object valueOf;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                JsonToken peek = jsonReader.peek();
                if (peek != null) {
                    int A06 = AbstractC58318PtA.A06(peek, AbstractC22801A3u.A00);
                    if (A06 != 1) {
                        if (A06 != 2) {
                            if (A06 != 3) {
                                if (A06 == 4) {
                                    C19260xA c19260xA2 = new C19260xA();
                                    A00(jsonReader, c19260xA2, c62821SSt);
                                    C19260xA.A00(c19260xA, c19260xA2, nextName);
                                }
                            } else {
                                valueOf = Boolean.valueOf(jsonReader.nextBoolean());
                            }
                        } else {
                            valueOf = jsonReader.nextString();
                        }
                    } else {
                        valueOf = Double.valueOf(jsonReader.nextDouble());
                    }
                    C19260xA.A00(c19260xA, valueOf, nextName);
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }
    }
}
