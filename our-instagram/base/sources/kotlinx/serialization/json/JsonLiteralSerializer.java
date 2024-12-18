package kotlinx.serialization.json;

import X.AbstractC001900j;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC69995VzF;
import X.AbstractC69997VzH;
import X.AbstractC70142W6u;
import X.AnonymousClass010;
import X.C14360o3;
import X.C192358fd;
import X.C192368fe;
import X.C3R9;
import X.C3RE;
import X.WG2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class JsonLiteralSerializer implements C3R9 {
    public static final JsonLiteralSerializer A01 = new Object();
    public static final SerialDescriptor A00 = AbstractC70142W6u.A02("kotlinx.serialization.json.JsonLiteral", C3RE.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        JsonElement AOA = AbstractC69997VzH.A00(decoder).AOA();
        if (AOA instanceof JsonLiteral) {
            return AOA;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected JSON element, expected JsonLiteral, had ");
        throw WG2.A01(AOA.toString(), AbstractC166997dE.A0v(AbstractC25229BEm.A0r(AOA), sb), -1);
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        long j;
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        AbstractC167017dG.A1N(encoder, jsonLiteral);
        AbstractC69997VzH.A01(encoder);
        if (!jsonLiteral.A01) {
            String str = jsonLiteral.A00;
            Long A0j = AbstractC25231BEo.A0j(0, str);
            if (A0j != null) {
                j = A0j.longValue();
            } else {
                C14360o3.A0B(str, 0);
                C192358fd A012 = AbstractC69995VzF.A01(str);
                if (A012 != null) {
                    j = A012.A00;
                    encoder = encoder.AS9(C192368fe.A00);
                } else {
                    Double A0m = AnonymousClass010.A0m(str);
                    if (A0m != null) {
                        encoder.AS5(A0m.doubleValue());
                        return;
                    }
                    Boolean A0A = AbstractC001900j.A0A(str);
                    if (A0A != null) {
                        encoder.AS1(A0A.booleanValue());
                        return;
                    }
                }
            }
            encoder.ASD(j);
            return;
        }
        encoder.ASK(jsonLiteral.A00);
    }
}
