package kotlinx.serialization.json;

import X.AbstractC167017dG;
import X.AbstractC69997VzH;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71706WzX;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonArraySerializer implements C3R9 {
    public static final JsonArraySerializer A01 = new Object();
    public static final SerialDescriptor A00 = C71706WzX.A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        AbstractC69997VzH.A00(decoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C14360o3.A0B(jsonElementSerializer, 0);
        return new JsonArray((List) new C3SG(jsonElementSerializer).deserialize(decoder));
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AbstractC167017dG.A1N(encoder, obj);
        AbstractC69997VzH.A01(encoder);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C14360o3.A0B(jsonElementSerializer, 0);
        new C3SG(jsonElementSerializer).serialize(encoder, obj);
    }
}
