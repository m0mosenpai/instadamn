package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Wz9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71700Wz9 implements C3R9 {
    public static final C71700Wz9 A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A02("com.meta.NumberSerializer", C3RR.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return Float.valueOf(decoder.AO1());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Number number = (Number) obj;
        AbstractC167017dG.A1N(encoder, number);
        if (number instanceof Double) {
            if (!Double.isNaN(number.doubleValue())) {
                encoder.AS5(number.doubleValue());
                return;
            }
        } else if (number instanceof Float) {
            if (!Float.isNaN(number.floatValue())) {
                encoder.AS7(number.floatValue());
                return;
            }
        } else if (number instanceof Long) {
            encoder.ASD(number.longValue());
            return;
        } else {
            if (!(number instanceof Integer)) {
                return;
            }
            encoder.ASB(number.intValue());
            return;
        }
        encoder.ASF();
    }
}
