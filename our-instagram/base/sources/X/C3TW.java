package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3TW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TW implements C3R9 {
    public static final C3TW A00 = new Object();
    public static final SerialDescriptor A01 = new C3RH("kotlin.Float", C3TX.A00);

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
        float floatValue = ((Number) obj).floatValue();
        C14360o3.A0B(encoder, 0);
        encoder.AS7(floatValue);
    }
}
