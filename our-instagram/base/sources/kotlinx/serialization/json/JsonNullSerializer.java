package kotlinx.serialization.json;

import X.AbstractC69997VzH;
import X.AbstractC70142W6u;
import X.C14360o3;
import X.C3R9;
import X.C4DE;
import X.C71687Wyk;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonNullSerializer implements C3R9 {
    public static final JsonNullSerializer A01 = new Object();
    public static final SerialDescriptor A00 = AbstractC70142W6u.A00("kotlinx.serialization.json.JsonNull", new C71687Wyk(), C4DE.A00, new SerialDescriptor[0]);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        AbstractC69997VzH.A00(decoder);
        if (!decoder.AOD()) {
            return JsonNull.A00;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        AbstractC69997VzH.A01(encoder);
        encoder.ASF();
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }
}
