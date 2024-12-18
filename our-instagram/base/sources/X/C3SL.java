package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3SL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SL implements C3R9 {
    public static final C3SL A00 = new Object();
    public static final SerialDescriptor A01 = new C3RH("kotlin.Boolean", C3SM.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return Boolean.valueOf(decoder.ANr());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C14360o3.A0B(encoder, 0);
        encoder.AS1(booleanValue);
    }
}
