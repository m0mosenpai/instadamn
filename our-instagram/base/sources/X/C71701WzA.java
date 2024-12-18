package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WzA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71701WzA implements C3R9 {
    public static final C71701WzA A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A02("Feature", C3RE.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        List A0m = AbstractC167007dF.A0m(decoder.AOJ(), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        return new C66623UPk((String) A0m.get(0), Integer.parseInt((String) A0m.get(1)));
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C66623UPk c66623UPk = (C66623UPk) obj;
        AbstractC167017dG.A1N(encoder, c66623UPk);
        encoder.ASK(AnonymousClass001.A0G(c66623UPk.A01, ',', c66623UPk.A00));
    }
}
