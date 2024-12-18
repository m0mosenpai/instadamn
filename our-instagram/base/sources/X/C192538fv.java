package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192538fv implements C3R9 {
    public static final C192538fv A00 = new Object();
    public static final SerialDescriptor A01 = new C3RH("kotlin.Byte", C192548fw.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return Byte.valueOf(decoder.ANt());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        C14360o3.A0B(encoder, 0);
        encoder.AS3(byteValue);
    }
}
