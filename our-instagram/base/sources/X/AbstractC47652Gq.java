package X;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: X.2Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47652Gq {
    public static final TypeAdapter A00;
    public static final TypeAdapter A01;
    public static final TypeAdapter A02;
    public static final TypeAdapter A03;
    public static final TypeAdapter A04;
    public static final TypeAdapter A05;
    public static final TypeAdapter A06;
    public static final TypeAdapter A07;
    public static final TypeAdapter A08;
    public static final TypeAdapter A09;
    public static final TypeAdapter A0A;
    public static final TypeAdapter A0B;
    public static final TypeAdapter A0C;
    public static final TypeAdapter A0D;
    public static final TypeAdapter A0E;
    public static final TypeAdapter A0F;
    public static final TypeAdapter A0G;
    public static final TypeAdapter A0H;
    public static final TypeAdapter A0I;
    public static final TypeAdapter A0J;
    public static final TypeAdapter A0K;
    public static final TypeAdapter A0L;
    public static final TypeAdapter A0M;
    public static final TypeAdapter A0N;
    public static final TypeAdapter A0O;
    public static final TypeAdapter A0P;
    public static final InterfaceC47612Gm A0Q;
    public static final InterfaceC47612Gm A0R;
    public static final InterfaceC47612Gm A0S;
    public static final InterfaceC47612Gm A0T;
    public static final InterfaceC47612Gm A0U;
    public static final InterfaceC47612Gm A0V;
    public static final InterfaceC47612Gm A0W;
    public static final InterfaceC47612Gm A0X;
    public static final InterfaceC47612Gm A0Y;
    public static final InterfaceC47612Gm A0Z;
    public static final InterfaceC47612Gm A0a;
    public static final InterfaceC47612Gm A0b;
    public static final InterfaceC47612Gm A0c;
    public static final InterfaceC47612Gm A0d;
    public static final InterfaceC47612Gm A0e;
    public static final InterfaceC47612Gm A0f;
    public static final InterfaceC47612Gm A0g;
    public static final InterfaceC47612Gm A0h;
    public static final InterfaceC47612Gm A0i;
    public static final InterfaceC47612Gm A0j;
    public static final InterfaceC47612Gm A0k;
    public static final InterfaceC47612Gm A0l;

    static {
        C47672Gt c47672Gt = new C47672Gt(new TypeAdapter() { // from class: X.2Gr
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                throw new UnsupportedOperationException(AnonymousClass001.A0g("Attempted to serialize java.lang.Class: ", ((Class) obj).getName(), ". Forgot to register a type adapter?"));
            }
        });
        A0B = c47672Gt;
        A0Y = new C47682Gu(c47672Gt, Class.class);
        C47672Gt c47672Gt2 = new C47672Gt(new TypeAdapter() { // from class: X.2Gv
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                BitSet bitSet = new BitSet();
                jsonReader.A0M();
                Integer A0G2 = jsonReader.A0G();
                int i = 0;
                while (A0G2 != C05F.A01) {
                    int intValue = A0G2.intValue();
                    if (intValue != 6 && intValue != 5) {
                        if (intValue == 7) {
                            if (!jsonReader.A0T()) {
                                i++;
                                A0G2 = jsonReader.A0G();
                            }
                            bitSet.set(i);
                            i++;
                            A0G2 = jsonReader.A0G();
                        } else {
                            throw new RuntimeException(AnonymousClass001.A0u("Invalid bitset value type: ", SSW.A01(A0G2), "; at path ", jsonReader.A0H()));
                        }
                    } else {
                        int A0D2 = jsonReader.A0D();
                        if (A0D2 == 0) {
                            continue;
                            i++;
                            A0G2 = jsonReader.A0G();
                        } else {
                            if (A0D2 != 1) {
                                throw new RuntimeException(AnonymousClass001.A05(A0D2, "Invalid bitset value ", ", expected 0 or 1; at path ", jsonReader.A0I()));
                            }
                            bitSet.set(i);
                            i++;
                            A0G2 = jsonReader.A0G();
                        }
                    }
                }
                jsonReader.A0O();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                BitSet bitSet = (BitSet) obj;
                jsonWriter.A06();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.A0C(bitSet.get(i) ? 1L : 0L);
                }
                jsonWriter.A08();
            }
        });
        A05 = c47672Gt2;
        A0T = new C47682Gu(c47672Gt2, BitSet.class);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: X.2Gw
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0D((Boolean) obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                boolean A0T2;
                Integer A0G2 = jsonReader.A0G();
                if (A0G2 == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                if (A0G2 == C05F.A0j) {
                    A0T2 = Boolean.parseBoolean(jsonReader.A0K());
                } else {
                    A0T2 = jsonReader.A0T();
                }
                return Boolean.valueOf(A0T2);
            }
        };
        A06 = typeAdapter;
        A07 = new TypeAdapter() { // from class: X.2Gx
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String obj2;
                if (obj == null) {
                    obj2 = "null";
                } else {
                    obj2 = obj.toString();
                }
                jsonWriter.A0H(obj2);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return Boolean.valueOf(jsonReader.A0K());
            }
        };
        A0U = new C2Gy(typeAdapter, Boolean.TYPE, Boolean.class);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: X.2Gz
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.A0A();
                } else {
                    jsonWriter.A0C(r4.byteValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                try {
                    int A0D2 = jsonReader.A0D();
                    if (A0D2 <= 255 && A0D2 >= -128) {
                        return Byte.valueOf((byte) A0D2);
                    }
                    throw new RuntimeException(AnonymousClass001.A05(A0D2, "Lossy conversion from ", " to byte; at path ", jsonReader.A0I()));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A08 = typeAdapter2;
        A0V = new C2Gy(typeAdapter2, Byte.TYPE, Byte.class);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: X.2H0
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.A0A();
                } else {
                    jsonWriter.A0C(r4.shortValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                try {
                    int A0D2 = jsonReader.A0D();
                    if (A0D2 <= 65535 && A0D2 >= -32768) {
                        return Short.valueOf((short) A0D2);
                    }
                    throw new RuntimeException(AnonymousClass001.A05(A0D2, "Lossy conversion from ", " to short; at path ", jsonReader.A0I()));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A0J = typeAdapter3;
        A0f = new C2Gy(typeAdapter3, Short.TYPE, Short.class);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: X.2H1
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.A0A();
                } else {
                    jsonWriter.A0C(r4.intValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.A0D());
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        A0E = typeAdapter4;
        A0c = new C2Gy(typeAdapter4, Integer.TYPE, Integer.class);
        C47672Gt c47672Gt3 = new C47672Gt(new TypeAdapter() { // from class: X.2H2
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0C(((AtomicInteger) obj).get());
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.A0D());
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        A01 = c47672Gt3;
        A0S = new C47682Gu(c47672Gt3, AtomicInteger.class);
        C47672Gt c47672Gt4 = new C47672Gt(new TypeAdapter() { // from class: X.2H3
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0I(((AtomicBoolean) obj).get());
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.A0T());
            }
        });
        A00 = c47672Gt4;
        A0Q = new C47682Gu(c47672Gt4, AtomicBoolean.class);
        C47672Gt c47672Gt5 = new C47672Gt(new TypeAdapter() { // from class: X.2H4
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.A0M();
                while (jsonReader.A0S()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.A0D()));
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
                jsonReader.A0O();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Number) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A06();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.A0C(r6.get(i));
                }
                jsonWriter.A08();
            }
        });
        A02 = c47672Gt5;
        A0R = new C47682Gu(c47672Gt5, AtomicIntegerArray.class);
        A0I = new TypeAdapter() { // from class: X.2H5
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.A0A();
                } else {
                    jsonWriter.A0C(number.longValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.A0F());
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: X.2H6
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String valueOf;
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(obj);
                }
                jsonWriter.A0H(valueOf);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                String A0K2 = jsonReader.A0K();
                if (A0K2.length() == 1) {
                    return Character.valueOf(A0K2.charAt(0));
                }
                throw new RuntimeException(AnonymousClass001.A0u("Expecting character, got: ", A0K2, "; at ", jsonReader.A0I()));
            }
        };
        A0A = typeAdapter5;
        A0X = new C2Gy(typeAdapter5, Character.TYPE, Character.class);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: X.2H7
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0H((String) obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                Integer A0G2 = jsonReader.A0G();
                if (A0G2 == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                if (A0G2 == C05F.A15) {
                    return Boolean.toString(jsonReader.A0T());
                }
                return jsonReader.A0K();
            }
        };
        A0K = typeAdapter6;
        A03 = new TypeAdapter() { // from class: X.2H8
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0E((Number) obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                String A0K2 = jsonReader.A0K();
                try {
                    return new BigDecimal(A0K2);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K2, "' as BigDecimal; at path ", jsonReader.A0I()), e);
                }
            }
        };
        A04 = new TypeAdapter() { // from class: X.2H9
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0E((Number) obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                String A0K2 = jsonReader.A0K();
                try {
                    return new BigInteger(A0K2);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K2, "' as BigInteger; at path ", jsonReader.A0I()), e);
                }
            }
        };
        A0G = new TypeAdapter() { // from class: X.2HA
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0E((Number) obj);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return new C2HX(jsonReader.A0K());
            }
        };
        A0i = new C47682Gu(typeAdapter6, String.class);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: X.2HB
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String obj2;
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj.toString();
                }
                jsonWriter.A0H(obj2);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return new StringBuilder(jsonReader.A0K());
            }
        };
        A0M = typeAdapter7;
        A0h = new C47682Gu(typeAdapter7, StringBuilder.class);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: X.2HC
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String obj2;
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj.toString();
                }
                jsonWriter.A0H(obj2);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return new StringBuffer(jsonReader.A0K());
            }
        };
        A0L = typeAdapter8;
        A0g = new C47682Gu(typeAdapter8, StringBuffer.class);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: X.2HD
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String externalForm;
                java.net.URL url = (java.net.URL) obj;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                jsonWriter.A0H(externalForm);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                } else {
                    String A0K2 = jsonReader.A0K();
                    if (!"null".equals(A0K2)) {
                        return new java.net.URL(A0K2);
                    }
                }
                return null;
            }
        };
        A0O = typeAdapter9;
        A0k = new C47682Gu(typeAdapter9, java.net.URL.class);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: X.2HE
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String aSCIIString;
                java.net.URI uri = (java.net.URI) obj;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                jsonWriter.A0H(aSCIIString);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                } else {
                    try {
                        String A0K2 = jsonReader.A0K();
                        if (!"null".equals(A0K2)) {
                            return new java.net.URI(A0K2);
                        }
                    } catch (URISyntaxException e) {
                        throw new RuntimeException(e);
                    }
                }
                return null;
            }
        };
        A0N = typeAdapter10;
        A0j = new C47682Gu(typeAdapter10, java.net.URI.class);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: X.2HF
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String hostAddress;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                jsonWriter.A0H(hostAddress);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return InetAddress.getByName(jsonReader.A0K());
            }
        };
        A0D = typeAdapter11;
        A0b = new C2HG(typeAdapter11, InetAddress.class);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: X.2HH
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String obj2;
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj.toString();
                }
                jsonWriter.A0H(obj2);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                String A0K2 = jsonReader.A0K();
                try {
                    return UUID.fromString(A0K2);
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K2, "' as UUID; at path ", jsonReader.A0I()), e);
                }
            }
        };
        A0P = typeAdapter12;
        A0l = new C47682Gu(typeAdapter12, UUID.class);
        C47672Gt c47672Gt6 = new C47672Gt(new TypeAdapter() { // from class: X.2HI
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                jsonWriter.A0H(((Currency) obj).getCurrencyCode());
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                String A0K2 = jsonReader.A0K();
                try {
                    return Currency.getInstance(A0K2);
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(AnonymousClass001.A0u("Failed parsing '", A0K2, "' as Currency; at path ", jsonReader.A0I()), e);
                }
            }
        });
        A0C = c47672Gt6;
        A0Z = new C47682Gu(c47672Gt6, Currency.class);
        final TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: X.2HJ
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                if (((Calendar) obj) == null) {
                    jsonWriter.A0A();
                    return;
                }
                jsonWriter.A07();
                jsonWriter.A0G("year");
                jsonWriter.A0C(r4.get(1));
                jsonWriter.A0G("month");
                jsonWriter.A0C(r4.get(2));
                jsonWriter.A0G("dayOfMonth");
                jsonWriter.A0C(r4.get(5));
                jsonWriter.A0G("hourOfDay");
                jsonWriter.A0C(r4.get(11));
                jsonWriter.A0G("minute");
                jsonWriter.A0C(r4.get(12));
                jsonWriter.A0G("second");
                jsonWriter.A0C(r4.get(13));
                jsonWriter.A09();
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                jsonReader.A0N();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.A0G() != C05F.A0N) {
                    String A0J2 = jsonReader.A0J();
                    int A0D2 = jsonReader.A0D();
                    if ("year".equals(A0J2)) {
                        i = A0D2;
                    } else if ("month".equals(A0J2)) {
                        i2 = A0D2;
                    } else if ("dayOfMonth".equals(A0J2)) {
                        i3 = A0D2;
                    } else if ("hourOfDay".equals(A0J2)) {
                        i4 = A0D2;
                    } else if ("minute".equals(A0J2)) {
                        i5 = A0D2;
                    } else if ("second".equals(A0J2)) {
                        i6 = A0D2;
                    }
                }
                jsonReader.A0P();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
        };
        A09 = typeAdapter13;
        A0W = new InterfaceC47612Gm() { // from class: X.2HK
            @Override // X.InterfaceC47612Gm
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class cls = typeToken.rawType;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return TypeAdapter.this;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Factory[type=");
                sb.append(Calendar.class.getName());
                sb.append("+");
                sb.append(GregorianCalendar.class.getName());
                sb.append(",adapter=");
                sb.append(TypeAdapter.this);
                sb.append("]");
                return sb.toString();
            }
        };
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: X.2HL
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                String obj2;
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj.toString();
                }
                jsonWriter.A0H(obj2);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                String str;
                String str2;
                String str3 = null;
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.A0K(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null) {
                    if (str3 == null) {
                        return new Locale(str);
                    }
                } else if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }
        };
        A0H = typeAdapter14;
        A0e = new C47682Gu(typeAdapter14, Locale.class);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: X.2HM
            @Override // com.google.gson.TypeAdapter
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final void write(JsonElement jsonElement, JsonWriter jsonWriter) {
                if (jsonElement != null && !(jsonElement instanceof RVZ)) {
                    if (jsonElement instanceof JsonPrimitive) {
                        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                        Object obj = asJsonPrimitive.value;
                        if (obj instanceof Number) {
                            jsonWriter.A0E(asJsonPrimitive.getAsNumber());
                            return;
                        } else if (obj instanceof Boolean) {
                            jsonWriter.A0I(asJsonPrimitive.getAsBoolean());
                            return;
                        } else {
                            jsonWriter.A0H(asJsonPrimitive.getAsString());
                            return;
                        }
                    }
                    if (jsonElement instanceof JsonArray) {
                        jsonWriter.A06();
                        Iterator it = jsonElement.getAsJsonArray().iterator();
                        while (it.hasNext()) {
                            write((JsonElement) it.next(), jsonWriter);
                        }
                        jsonWriter.A08();
                        return;
                    }
                    if (jsonElement instanceof JsonObject) {
                        jsonWriter.A07();
                        for (Map.Entry entry : jsonElement.getAsJsonObject().entrySet()) {
                            jsonWriter.A0G((String) entry.getKey());
                            write((JsonElement) entry.getValue(), jsonWriter);
                        }
                        jsonWriter.A09();
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't write ");
                    sb.append(jsonElement.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
                jsonWriter.A0A();
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x007d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x004f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
            @Override // com.google.gson.TypeAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r8) {
                /*
                    r7 = this;
                    boolean r0 = r8 instanceof X.C5MW
                    if (r0 == 0) goto L26
                    X.5MW r8 = (X.C5MW) r8
                    java.lang.Integer r1 = r8.A0G()
                    java.lang.Integer r0 = X.C05F.A0Y
                    if (r1 == r0) goto Lb4
                    java.lang.Integer r0 = X.C05F.A01
                    if (r1 == r0) goto Lb4
                    java.lang.Integer r0 = X.C05F.A0N
                    if (r1 == r0) goto Lb4
                    java.lang.Integer r0 = X.C05F.A1I
                    if (r1 == r0) goto Lb4
                    java.lang.Object[] r1 = r8.A01
                    int r0 = r8.A00
                    int r0 = r0 + (-1)
                    r6 = r1[r0]
                    r8.A0R()
                L25:
                    return r6
                L26:
                    java.lang.Integer r2 = r8.A0G()
                    int r1 = r2.intValue()
                    r0 = 0
                    if (r1 == r0) goto L39
                    r0 = 2
                    if (r1 == r0) goto L42
                    com.google.gson.JsonElement r6 = A00(r8, r2)
                    return r6
                L39:
                    r8.A0M()
                    com.google.gson.JsonArray r6 = new com.google.gson.JsonArray
                    r6.<init>()
                    goto L4a
                L42:
                    r8.A0N()
                    com.google.gson.JsonObject r6 = new com.google.gson.JsonObject
                    r6.<init>()
                L4a:
                    java.util.ArrayDeque r5 = new java.util.ArrayDeque
                    r5.<init>()
                L4f:
                    boolean r0 = r8.A0S()
                    if (r0 == 0) goto L9c
                    r4 = 0
                    boolean r0 = r6 instanceof com.google.gson.JsonObject
                    if (r0 == 0) goto L5e
                    java.lang.String r4 = r8.A0J()
                L5e:
                    java.lang.Integer r3 = r8.A0G()
                    int r1 = r3.intValue()
                    r0 = 0
                    if (r1 == r0) goto L92
                    r0 = 2
                    if (r1 == r0) goto L89
                    r2 = 0
                    com.google.gson.JsonElement r0 = A00(r8, r3)
                L71:
                    boolean r1 = r6 instanceof com.google.gson.JsonArray
                    if (r1 == 0) goto L82
                    r1 = r6
                    com.google.gson.JsonArray r1 = (com.google.gson.JsonArray) r1
                    r1.add(r0)
                L7b:
                    if (r2 == 0) goto L4f
                    r5.addLast(r6)
                    r6 = r0
                    goto L4f
                L82:
                    r1 = r6
                    com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1
                    r1.add(r4, r0)
                    goto L7b
                L89:
                    r8.A0N()
                    com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                    r0.<init>()
                    goto L9a
                L92:
                    r8.A0M()
                    com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
                    r0.<init>()
                L9a:
                    r2 = 1
                    goto L71
                L9c:
                    boolean r0 = r6 instanceof com.google.gson.JsonArray
                    if (r0 == 0) goto Lb0
                    r8.A0O()
                La3:
                    boolean r0 = r5.isEmpty()
                    if (r0 != 0) goto L25
                    java.lang.Object r6 = r5.removeLast()
                    com.google.gson.JsonElement r6 = (com.google.gson.JsonElement) r6
                    goto L4f
                Lb0:
                    r8.A0P()
                    goto La3
                Lb4:
                    java.lang.String r2 = "Unexpected "
                    java.lang.String r1 = X.SSW.A01(r1)
                    java.lang.String r0 = " when reading a JsonElement."
                    java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2HM.read(com.google.gson.stream.JsonReader):java.lang.Object");
            }

            public static JsonElement A00(JsonReader jsonReader, Integer num) {
                int intValue = num.intValue();
                if (intValue != 6) {
                    if (intValue != 5) {
                        if (intValue != 7) {
                            if (intValue == 8) {
                                jsonReader.A0Q();
                                return RVZ.A00;
                            }
                            throw new IllegalStateException(AnonymousClass001.A0R("Unexpected token: ", SSW.A01(num)));
                        }
                        return new JsonPrimitive(Boolean.valueOf(jsonReader.A0T()));
                    }
                    return new JsonPrimitive(jsonReader.A0K());
                }
                return new JsonPrimitive(new C2HX(jsonReader.A0K()));
            }
        };
        A0F = typeAdapter15;
        A0d = new C2HG(typeAdapter15, JsonElement.class);
        A0a = new InterfaceC47612Gm() { // from class: X.2HO
            @Override // X.InterfaceC47612Gm
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                final Class cls = typeToken.rawType;
                if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new TypeAdapter(cls) { // from class: X.2I4
                        public final Map A01 = new HashMap();
                        public final Map A02 = new HashMap();
                        public final Map A00 = new HashMap();

                        @Override // com.google.gson.TypeAdapter
                        public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                            String str;
                            if (obj == null) {
                                str = null;
                            } else {
                                str = (String) this.A00.get(obj);
                            }
                            jsonWriter.A0H(str);
                        }

                        {
                            try {
                                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: X.2I5
                                    @Override // java.security.PrivilegedAction
                                    public final /* bridge */ /* synthetic */ Object run() {
                                        Field[] declaredFields = cls.getDeclaredFields();
                                        ArrayList arrayList = new ArrayList(declaredFields.length);
                                        for (Field field2 : declaredFields) {
                                            if (field2.isEnumConstant()) {
                                                arrayList.add(field2);
                                            }
                                        }
                                        AccessibleObject[] accessibleObjectArr = (AccessibleObject[]) arrayList.toArray(new Field[0]);
                                        AccessibleObject.setAccessible(accessibleObjectArr, true);
                                        return accessibleObjectArr;
                                    }
                                })) {
                                    Enum r6 = (Enum) field.get(null);
                                    String name = r6.name();
                                    String obj = r6.toString();
                                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                                    if (serializedName != null) {
                                        name = serializedName.value();
                                        for (String str : serializedName.alternate()) {
                                            this.A01.put(str, r6);
                                        }
                                    }
                                    this.A01.put(name, r6);
                                    this.A02.put(obj, r6);
                                    this.A00.put(r6, name);
                                }
                            } catch (IllegalAccessException e) {
                                throw new AssertionError(e);
                            }
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                            if (jsonReader.A0G() == C05F.A1F) {
                                jsonReader.A0Q();
                                return null;
                            }
                            String A0K2 = jsonReader.A0K();
                            Object obj = this.A01.get(A0K2);
                            if (obj != null) {
                                return obj;
                            }
                            return this.A02.get(A0K2);
                        }
                    };
                }
                return null;
            }
        };
    }
}
