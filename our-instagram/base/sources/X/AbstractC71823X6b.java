package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.X6b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71823X6b extends AbstractC71824X6c implements C3TA {
    public final String A00;
    public final AbstractC73763Sg A01;
    public final C73783Si A02;
    public final JsonElement A03;

    public C3T8 ADQ(SerialDescriptor serialDescriptor) {
        String BtR;
        StringBuilder A11;
        Class cls;
        C14360o3.A0B(serialDescriptor, 0);
        JsonElement A0H = A0H();
        C3RG BKw = serialDescriptor.BKw();
        if (!C14360o3.A0K(BKw, C3TH.A00) && !(BKw instanceof C3TG)) {
            boolean A0K = C14360o3.A0K(BKw, C3TI.A00);
            AbstractC73763Sg abstractC73763Sg = this.A01;
            if (A0K) {
                SerialDescriptor A00 = C3TC.A00(serialDescriptor.B0r(0), abstractC73763Sg.A02);
                C3RG BKw2 = A00.BKw();
                if (!(BKw2 instanceof C3RF) && !C14360o3.A0K(BKw2, C4DE.A00)) {
                    if (!abstractC73763Sg.A00.A05) {
                        throw WG2.A04(A00);
                    }
                } else {
                    BtR = serialDescriptor.BtR();
                    if (A0H instanceof JsonObject) {
                        return new X6Z(abstractC73763Sg, (JsonObject) A0H);
                    }
                }
            } else {
                BtR = serialDescriptor.BtR();
                if (A0H instanceof JsonObject) {
                    return new C71822X6a(this.A00, null, abstractC73763Sg, (JsonObject) A0H);
                }
            }
            A11 = AbstractC166997dE.A11("Expected ");
            cls = JsonObject.class;
            Map map = C0YZ.A03;
            A11.append(AbstractC13230m9.A01(cls));
            A11.append(", but had ");
            Class<?> cls2 = A0H.getClass();
            C14360o3.A0B(cls2, 1);
            AbstractC58320PtC.A1N(AbstractC13230m9.A01(cls2), " as the serialized body of ", BtR, A11);
            A11.append(" at element: ");
            throw WG2.A01(A0H.toString(), AbstractC166997dE.A0x(A0E(), A11), -1);
        }
        AbstractC73763Sg abstractC73763Sg2 = this.A01;
        BtR = serialDescriptor.BtR();
        if (A0H instanceof JsonArray) {
            return new X6Y(abstractC73763Sg2, (JsonArray) A0H);
        }
        A11 = AbstractC166997dE.A11("Expected ");
        cls = JsonArray.class;
        Map map2 = C0YZ.A03;
        A11.append(AbstractC13230m9.A01(cls));
        A11.append(", but had ");
        Class<?> cls22 = A0H.getClass();
        C14360o3.A0B(cls22, 1);
        AbstractC58320PtC.A1N(AbstractC13230m9.A01(cls22), " as the serialized body of ", BtR, A11);
        A11.append(" at element: ");
        throw WG2.A01(A0H.toString(), AbstractC166997dE.A0x(A0E(), A11), -1);
    }

    public static final void A00(String str, String str2, JsonPrimitive jsonPrimitive, AbstractC71823X6b abstractC71823X6b) {
        StringBuilder sb;
        String str3;
        if (AbstractC002300n.A0h(str, "i", false)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        String A0u = MSZ.A0u(str3, str, sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to parse literal '");
        sb2.append(jsonPrimitive);
        sb2.append("' as ");
        sb2.append(A0u);
        sb2.append(" value at element: ");
        throw WG2.A01(abstractC71823X6b.A0H().toString(), AbstractC166997dE.A0x(AnonymousClass001.A0T(abstractC71823X6b.A0E(), str2, '.'), sb2), -1);
    }

    public final JsonElement A0G() {
        if (this instanceof X6Y) {
            return ((X6Y) this).A01;
        }
        if (this instanceof C71822X6a) {
            C71822X6a c71822X6a = (C71822X6a) this;
            if (c71822X6a instanceof X6Z) {
                return ((X6Z) c71822X6a).A03;
            }
            return c71822X6a.A02;
        }
        return ((X6X) this).A00;
    }

    public final JsonElement A0H() {
        JsonElement A0I;
        String str = (String) AbstractC001800i.A0L(super.A01);
        if (str == null || (A0I = A0I(str)) == null) {
            return A0G();
        }
        return A0I;
    }

    public final JsonElement A0I(String str) {
        JsonObject jsonObject;
        Object A01;
        if (this instanceof X6Y) {
            JsonArray jsonArray = ((X6Y) this).A01;
            A01 = jsonArray.A00.get(Integer.parseInt(str));
        } else if (this instanceof C71822X6a) {
            C71822X6a c71822X6a = (C71822X6a) this;
            if (c71822X6a instanceof X6Z) {
                X6Z x6z = (X6Z) c71822X6a;
                if (x6z.A00 % 2 == 0) {
                    A01 = AbstractC100754fe.A05(str);
                } else {
                    jsonObject = x6z.A03;
                }
            } else {
                jsonObject = c71822X6a.A02;
            }
            A01 = AbstractC06930Yk.A01(str, jsonObject);
        } else {
            X6X x6x = (X6X) this;
            if (str == "primitive") {
                return x6x.A00;
            }
            throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
        }
        return (JsonElement) A01;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean AOD() {
        if (this instanceof C71822X6a) {
            if (!((C71822X6a) this).A00 && (!(r1.A0H() instanceof JsonNull))) {
                return true;
            }
            return false;
        }
        return !(A0H() instanceof JsonNull);
    }

    @Override // X.C3T8
    public final void ASc(SerialDescriptor serialDescriptor) {
        Iterable iterable;
        Object obj;
        if (this instanceof C71822X6a) {
            C71822X6a c71822X6a = (C71822X6a) this;
            if (!(c71822X6a instanceof X6Z)) {
                C14360o3.A0B(serialDescriptor, 0);
                C73783Si c73783Si = ((AbstractC71823X6b) c71822X6a).A02;
                if (!c73783Si.A0B && !(serialDescriptor.BKw() instanceof C3TG)) {
                    AbstractC73763Sg abstractC73763Sg = ((AbstractC71823X6b) c71822X6a).A01;
                    C14360o3.A0K(serialDescriptor.BKw(), C3TE.A00);
                    boolean z = c73783Si.A0E;
                    java.util.Set A00 = AbstractC192728gE.A00(serialDescriptor);
                    if (z) {
                        C73813Sl c73813Sl = abstractC73763Sg.A01;
                        C3TM c3tm = C3TL.A00;
                        C14360o3.A0B(c3tm, 1);
                        Map map = (Map) c73813Sl.A00.get(serialDescriptor);
                        Object obj2 = null;
                        if (map != null && (obj = map.get(c3tm)) != null) {
                            obj2 = obj;
                        }
                        Map map2 = (Map) obj2;
                        if (map2 == null || (iterable = map2.keySet()) == null) {
                            iterable = C16910sj.A00;
                        }
                        A00 = AnonymousClass090.A00(iterable, A00);
                    }
                    JsonObject jsonObject = c71822X6a.A02;
                    for (String str : jsonObject.keySet()) {
                        if (!A00.contains(str) && !C14360o3.A0K(str, ((AbstractC71823X6b) c71822X6a).A00)) {
                            String obj3 = jsonObject.toString();
                            C14360o3.A0B(str, 0);
                            StringBuilder sb = new StringBuilder();
                            sb.append(AbstractC111324zv.A00(1604));
                            sb.append(str);
                            sb.append("'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                            String A0v = AbstractC166997dE.A0v(WG2.A00(-1, obj3), sb);
                            C14360o3.A0B(A0v, 1);
                            throw new IllegalArgumentException(A0v);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C3T8, kotlinx.serialization.encoding.Decoder
    public final C73803Sk BtX() {
        return this.A01.A02;
    }

    public AbstractC71823X6b(String str, AbstractC73763Sg abstractC73763Sg, JsonElement jsonElement) {
        this.A01 = abstractC73763Sg;
        this.A03 = jsonElement;
        this.A00 = str;
        this.A02 = abstractC73763Sg.A00;
    }

    @Override // X.C3TA
    public final JsonElement AOA() {
        return A0H();
    }
}
