package kotlinx.serialization.json;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25230BEn;
import X.AbstractC69997VzH;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.C71707WzY;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonObjectSerializer implements C3R9 {
    public static final JsonObjectSerializer A01 = new Object();
    public static final SerialDescriptor A00 = C71707WzY.A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        AbstractC69997VzH.A00(decoder);
        C3RD c3rd = C3RD.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        AbstractC167007dF.A1K(c3rd, jsonElementSerializer);
        return new JsonObject((Map) new C3RL(c3rd, jsonElementSerializer).deserialize(decoder));
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean A1a = AbstractC167017dG.A1a(encoder, obj);
        AbstractC69997VzH.A01(encoder);
        C3RD c3rd = C3RD.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        AbstractC25230BEn.A15(A1a ? 1 : 0, c3rd, jsonElementSerializer);
        new C3RL(c3rd, jsonElementSerializer).serialize(encoder, obj);
    }
}
