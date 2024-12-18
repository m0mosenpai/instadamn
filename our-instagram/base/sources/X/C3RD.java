package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3RD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RD implements C3R9 {
    public static final C3RD A01 = new Object();
    public static final SerialDescriptor A00 = new C3RH("kotlin.String", C3RE.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return decoder.AOJ();
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        C14360o3.A0B(encoder, 0);
        C14360o3.A0B(str, 1);
        encoder.ASK(str);
    }
}
