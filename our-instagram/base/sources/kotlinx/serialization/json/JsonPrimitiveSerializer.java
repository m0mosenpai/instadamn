package kotlinx.serialization.json;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC69997VzH;
import X.AbstractC70142W6u;
import X.C14360o3;
import X.C3R9;
import X.C3RE;
import X.C71687Wyk;
import X.WG2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonPrimitiveSerializer implements C3R9 {
    public static final JsonPrimitiveSerializer A01 = new Object();
    public static final SerialDescriptor A00 = AbstractC70142W6u.A00("kotlinx.serialization.json.JsonPrimitive", new C71687Wyk(), C3RE.A00, new SerialDescriptor[0]);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        JsonElement AOA = AbstractC69997VzH.A00(decoder).AOA();
        if (AOA instanceof JsonPrimitive) {
            return AOA;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected JSON element, expected JsonPrimitive, had ");
        throw WG2.A01(AOA.toString(), AbstractC166997dE.A0v(AbstractC25229BEm.A0r(AOA), sb), -1);
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AbstractC167017dG.A1N(encoder, obj);
        AbstractC69997VzH.A01(encoder);
        if (obj instanceof JsonNull) {
            encoder.ASI(JsonNull.A00, JsonNullSerializer.A01);
        } else {
            encoder.ASI(obj, JsonLiteralSerializer.A01);
        }
    }
}
