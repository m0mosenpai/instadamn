package kotlinx.serialization.json;

import X.AbstractC167017dG;
import X.AbstractC69997VzH;
import X.AbstractC70142W6u;
import X.C14360o3;
import X.C3R9;
import X.C3RA;
import X.C71679WyX;
import X.X6M;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonElementSerializer implements C3R9 {
    public static final JsonElementSerializer A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A00("kotlinx.serialization.json.JsonElement", new C71679WyX(7), X6M.A00, new SerialDescriptor[0]);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return AbstractC69997VzH.A00(decoder).AOA();
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C3RA c3ra;
        AbstractC167017dG.A1N(encoder, obj);
        AbstractC69997VzH.A01(encoder);
        if (obj instanceof JsonPrimitive) {
            c3ra = JsonPrimitiveSerializer.A01;
        } else if (obj instanceof JsonObject) {
            c3ra = JsonObjectSerializer.A01;
        } else if (obj instanceof JsonArray) {
            c3ra = JsonArraySerializer.A01;
        } else {
            throw new RuntimeException();
        }
        encoder.ASI(obj, c3ra);
    }
}
