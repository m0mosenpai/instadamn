package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.0kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12240kS {
    public static final C19260xA A00(JsonReader jsonReader, C12240kS c12240kS) {
        Object valueOf;
        if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
            return null;
        }
        C19260xA c19260xA = new C19260xA();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (peek != null) {
                int i = AbstractC12230kR.A00[peek.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    valueOf = c12240kS.A01(jsonReader);
                                }
                            } else {
                                valueOf = A00(jsonReader, c12240kS);
                            }
                            if (valueOf != null) {
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
        return c19260xA;
    }

    private final C0x9 A01(JsonReader jsonReader) {
        InterfaceC11310in A00;
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            return null;
        }
        C0x9 c0x9 = new C0x9();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (peek != null) {
                int i = AbstractC12230kR.A00[peek.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    A00 = A01(jsonReader);
                                }
                            } else {
                                A00 = A00(jsonReader, this);
                            }
                            if (A00 != null) {
                                c0x9.A00.add(A00);
                            }
                        } else {
                            c0x9.A05(jsonReader.nextBoolean());
                        }
                    } else {
                        c0x9.A04(jsonReader.nextString());
                    }
                } else {
                    c0x9.A00(jsonReader.nextDouble());
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return c0x9;
    }
}
