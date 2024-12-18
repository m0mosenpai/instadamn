package X;

import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.X6d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71825X6d implements C3T8, Decoder {
    public boolean A00;
    public final ArrayList A01 = new ArrayList();

    public static C100764ff A01(Object obj, String str, String str2, AbstractC71824X6c abstractC71824X6c) {
        Map map = C0YZ.A03;
        String A01 = AbstractC13230m9.A01(JsonPrimitive.class);
        Class<?> cls = obj.getClass();
        C14360o3.A0B(cls, 1);
        return WG2.A01(obj.toString(), AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", str, " at element: ", AnonymousClass001.A0T(abstractC71824X6c.A0E(), str2, '.')), -1);
    }

    public final byte A02(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                int A00 = AbstractC100754fe.A00(jsonPrimitive);
                if (-128 <= A00 && A00 <= 127) {
                    byte b = (byte) A00;
                    if (Byte.valueOf(b) != null) {
                        return b;
                    }
                }
                AbstractC71823X6b.A00("byte", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("byte", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "byte", A0Q, abstractC71823X6b);
    }

    public final char A03(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                return C00Q.A01(jsonPrimitive.A00());
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("char", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "char", A0Q, abstractC71823X6b);
    }

    public final double A04(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        JsonElement A0I = abstractC71823X6b.A0I(str);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                SerialDescriptor serialDescriptor = AbstractC100754fe.A00;
                C14360o3.A0B(jsonPrimitive, 0);
                double parseDouble = Double.parseDouble(jsonPrimitive.A00());
                if (abstractC71823X6b.A01.A00.A04 || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    return parseDouble;
                }
                throw WG2.A02(Double.valueOf(parseDouble), str, abstractC71823X6b.A0H().toString());
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("double", str, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "double", str, abstractC71823X6b);
    }

    public final float A05(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        JsonElement A0I = abstractC71823X6b.A0I(str);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                SerialDescriptor serialDescriptor = AbstractC100754fe.A00;
                C14360o3.A0B(jsonPrimitive, 0);
                float parseFloat = Float.parseFloat(jsonPrimitive.A00());
                if (abstractC71823X6b.A01.A00.A04 || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    return parseFloat;
                }
                throw WG2.A02(Float.valueOf(parseFloat), str, abstractC71823X6b.A0H().toString());
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("float", str, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "float", str, abstractC71823X6b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    public final int A06(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        String str = "int";
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                str = AbstractC100754fe.A00(jsonPrimitive);
                return str;
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00(str, A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "int", A0Q, abstractC71823X6b);
    }

    public final long A07(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        JsonElement A0I = abstractC71823X6b.A0I(str);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                SerialDescriptor serialDescriptor = AbstractC100754fe.A00;
                C14360o3.A0B(jsonPrimitive, 0);
                try {
                    return new C3T2(jsonPrimitive.A00()).A07();
                } catch (C100764ff e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("long", str, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "long", str, abstractC71823X6b);
    }

    public final String A09(Object obj) {
        String A16;
        StringBuilder sb;
        String A0T;
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            if (jsonPrimitive instanceof JsonLiteral) {
                JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
                if (!jsonLiteral.A01 && !abstractC71823X6b.A01.A00.A0C) {
                    sb = new StringBuilder();
                    sb.append("String literal for key '");
                    sb.append(A0Q);
                    sb.append("' should be quoted at element: ");
                    sb.append(AnonymousClass001.A0T(abstractC71823X6b.A0E(), A0Q, '.'));
                    A0T = ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";
                } else {
                    return jsonLiteral.A00;
                }
            } else {
                sb = new StringBuilder();
                sb.append("Expected string value for a non-null key '");
                sb.append(A0Q);
                sb.append("', got null literal instead at element: ");
                A0T = AnonymousClass001.A0T(abstractC71823X6b.A0E(), A0Q, '.');
            }
            A16 = AbstractC166997dE.A0x(A0T, sb);
            A0I = abstractC71823X6b.A0H();
        } else {
            Map map = C0YZ.A03;
            String A01 = AbstractC13230m9.A01(JsonPrimitive.class);
            Class<?> cls = A0I.getClass();
            C14360o3.A0B(cls, 1);
            A16 = AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", IgNetworkingModule.REQUEST_BODY_KEY_STRING, " at element: ", AnonymousClass001.A0T(abstractC71823X6b.A0E(), A0Q, '.'));
        }
        throw WG2.A01(A0I.toString(), A16, -1);
    }

    public final String A0A(SerialDescriptor serialDescriptor, int i) {
        AbstractC71824X6c abstractC71824X6c = (AbstractC71824X6c) this;
        String A0F = abstractC71824X6c.A0F(serialDescriptor, i);
        C14360o3.A0B(A0F, 0);
        AbstractC001800i.A0L(abstractC71824X6c.A01);
        return A0F;
    }

    public final Decoder A0B(Object obj, SerialDescriptor serialDescriptor) {
        C3T2 c3t2;
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String str = (String) obj;
        boolean A1a = AbstractC167017dG.A1a(str, serialDescriptor);
        java.util.Set set = AbstractC22806A3z.A00;
        if (serialDescriptor.isInline() && AbstractC22806A3z.A00.contains(serialDescriptor)) {
            AbstractC73763Sg abstractC73763Sg = abstractC71823X6b.A01;
            JsonElement A0I = abstractC71823X6b.A0I(str);
            String BtR = serialDescriptor.BtR();
            if (A0I instanceof JsonPrimitive) {
                String A00 = ((JsonPrimitive) A0I).A00();
                C14360o3.A0B(A00, A1a ? 1 : 0);
                if (!abstractC73763Sg.A00.A03) {
                    c3t2 = new C3T2(A00);
                } else {
                    c3t2 = new C3T2(A00);
                }
                return new X6N(abstractC73763Sg, c3t2);
            }
            Map map = C0YZ.A03;
            String A01 = AbstractC13230m9.A01(JsonPrimitive.class);
            Class<?> cls = A0I.getClass();
            C14360o3.A0B(cls, A1a ? 1 : 0);
            throw WG2.A01(A0I.toString(), AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", BtR, " at element: ", AnonymousClass001.A0T(abstractC71823X6b.A0E(), str, '.')), -1);
        }
        ((AbstractC71825X6d) abstractC71823X6b).A01.add(str);
        return abstractC71823X6b;
    }

    public final short A0C(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                int A00 = AbstractC100754fe.A00(jsonPrimitive);
                if (-32768 <= A00 && A00 <= 32767) {
                    short s = (short) A00;
                    if (Short.valueOf(s) != null) {
                        return s;
                    }
                }
                AbstractC71823X6b.A00("short", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("short", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "short", A0Q, abstractC71823X6b);
    }

    public final boolean A0D(Object obj) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String A0Q = AbstractC167027dH.A0Q(obj);
        JsonElement A0I = abstractC71823X6b.A0I(A0Q);
        if (A0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0I;
            try {
                Boolean A01 = AbstractC100754fe.A01(jsonPrimitive);
                if (A01 != null) {
                    return A01.booleanValue();
                }
                AbstractC71823X6b.A00("boolean", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            } catch (IllegalArgumentException unused) {
                AbstractC71823X6b.A00("boolean", A0Q, jsonPrimitive, abstractC71823X6b);
                throw C00O.createAndThrow();
            }
        }
        throw A01(A0I, "boolean", A0Q, abstractC71823X6b);
    }

    @Override // X.C3T8
    public final boolean ANs(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A0D(A0A(serialDescriptor, i));
    }

    @Override // X.C3T8
    public final byte ANu(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A02(A0A(serialDescriptor, i));
    }

    @Override // X.C3T8
    public final char ANw(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A03(A0A(serialDescriptor, i));
    }

    @Override // X.C3T8
    public final double ANy(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A04(A0A(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int AO0(SerialDescriptor serialDescriptor) {
        C14360o3.A0B(serialDescriptor, 0);
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        String str = (String) A08();
        C14360o3.A0B(str, 0);
        AbstractC73763Sg abstractC73763Sg = abstractC71823X6b.A01;
        JsonElement A0I = abstractC71823X6b.A0I(str);
        String BtR = serialDescriptor.BtR();
        if (A0I instanceof JsonPrimitive) {
            return C3TL.A00(((JsonPrimitive) A0I).A00(), "", serialDescriptor, abstractC73763Sg);
        }
        Map map = C0YZ.A03;
        String A01 = AbstractC13230m9.A01(JsonPrimitive.class);
        Class<?> cls = A0I.getClass();
        C14360o3.A0B(cls, 1);
        throw WG2.A01(A0I.toString(), AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", BtR, " at element: ", AnonymousClass001.A0T(abstractC71823X6b.A0E(), str, '.')), -1);
    }

    @Override // X.C3T8
    public final float AO2(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A05(A0A(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder AO6(SerialDescriptor serialDescriptor) {
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        if (AbstractC001800i.A0L(((AbstractC71825X6d) abstractC71823X6b).A01) != null) {
            return abstractC71823X6b.A0B(abstractC71823X6b.A08(), serialDescriptor);
        }
        return new X6X(abstractC71823X6b.A00, abstractC71823X6b.A01, abstractC71823X6b.A0G()).AO6(serialDescriptor);
    }

    @Override // X.C3T8
    public final Decoder AO7(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A0B(A0A(serialDescriptor, i), serialDescriptor.B0r(i));
    }

    @Override // X.C3T8
    public final int AO9(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A06(A0A(serialDescriptor, i));
    }

    @Override // X.C3T8
    public final long AOC(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A07(A0A(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object AOG(C3RB c3rb) {
        String str;
        AbstractC71823X6b abstractC71823X6b = (AbstractC71823X6b) this;
        if (c3rb instanceof C3TB) {
            AbstractC73763Sg abstractC73763Sg = abstractC71823X6b.A01;
            if (!abstractC73763Sg.A00.A0F) {
                C3TB c3tb = (C3TB) c3rb;
                String A00 = AbstractC68615VXq.A00(c3tb.getDescriptor(), abstractC73763Sg);
                JsonElement A0H = abstractC71823X6b.A0H();
                String BtR = c3tb.getDescriptor().BtR();
                if (A0H instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) A0H;
                    JsonElement jsonElement = (JsonElement) jsonObject.get(A00);
                    try {
                        if (jsonElement != null) {
                            JsonPrimitive A06 = AbstractC100754fe.A06(jsonElement);
                            if (!(A06 instanceof JsonNull)) {
                                str = A06.A00();
                                C3RB A002 = AbstractC69996VzG.A00(str, abstractC71823X6b, c3tb);
                                C14360o3.A0C(A002, AbstractC111324zv.A00(2807));
                                C14360o3.A0B(A00, 1);
                                return new C71822X6a(A00, A002.getDescriptor(), abstractC73763Sg, jsonObject).AOG(A002);
                            }
                        }
                        C3RB A0022 = AbstractC69996VzG.A00(str, abstractC71823X6b, c3tb);
                        C14360o3.A0C(A0022, AbstractC111324zv.A00(2807));
                        C14360o3.A0B(A00, 1);
                        return new C71822X6a(A00, A0022.getDescriptor(), abstractC73763Sg, jsonObject).AOG(A0022);
                    } catch (AnonymousClass403 e) {
                        String message = e.getMessage();
                        C14360o3.A0A(message);
                        throw WG2.A01(jsonObject.toString(), message, -1);
                    }
                    str = null;
                } else {
                    Map map = C0YZ.A03;
                    String A01 = AbstractC13230m9.A01(JsonObject.class);
                    Class<?> cls = A0H.getClass();
                    C14360o3.A0B(cls, 1);
                    throw WG2.A01(A0H.toString(), AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", BtR, " at element: ", abstractC71823X6b.A0E()), -1);
                }
            }
        }
        return c3rb.deserialize(abstractC71823X6b);
    }

    @Override // X.C3T8
    public final short AOI(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A0C(A0A(serialDescriptor, i));
    }

    @Override // X.C3T8
    public final String AOK(SerialDescriptor serialDescriptor, int i) {
        C14360o3.A0B(serialDescriptor, 0);
        return A09(A0A(serialDescriptor, i));
    }

    public final Object A08() {
        ArrayList arrayList = this.A01;
        C14360o3.A0B(arrayList, 0);
        Object remove = arrayList.remove(arrayList.size() - 1);
        this.A00 = true;
        return remove;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean ANr() {
        return A0D(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte ANt() {
        return A02(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char ANv() {
        return A03(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double ANx() {
        return A04(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float AO1() {
        return A05(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int AO8() {
        return A06(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long AOB() {
        return A07(A08());
    }

    @Override // X.C3T8
    public final Object AOE(Object obj, C3RB c3rb, SerialDescriptor serialDescriptor, int i) {
        Object AOG;
        AbstractC167017dG.A1O(serialDescriptor, c3rb);
        this.A01.add(A0A(serialDescriptor, i));
        if (!c3rb.getDescriptor().CZW() && !AOD()) {
            AOG = null;
        } else {
            AOG = AOG(c3rb);
        }
        if (!this.A00) {
            A08();
        }
        this.A00 = false;
        return AOG;
    }

    @Override // X.C3T8
    public final Object AOF(Object obj, C3RB c3rb, SerialDescriptor serialDescriptor, int i) {
        AbstractC167017dG.A1O(serialDescriptor, c3rb);
        this.A01.add(A0A(serialDescriptor, i));
        Object AOG = AOG(c3rb);
        if (!this.A00) {
            A08();
        }
        this.A00 = false;
        return AOG;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short AOH() {
        return A0C(A08());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String AOJ() {
        return A09(A08());
    }
}
