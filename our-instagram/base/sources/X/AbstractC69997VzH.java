package X;

import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.VzH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69997VzH {
    public static final C3TA A00(Decoder decoder) {
        C3TA c3ta;
        if ((decoder instanceof C3TA) && (c3ta = (C3TA) decoder) != null) {
            return c3ta;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        throw AbstractC58320PtC.A0n(AbstractC25229BEm.A0r(decoder), sb);
    }

    public static final void A01(Encoder encoder) {
        if ((encoder instanceof C4D7) && encoder != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        throw AbstractC58320PtC.A0n(AbstractC25229BEm.A0r(encoder), sb);
    }
}
