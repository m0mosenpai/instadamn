package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192308fY implements C3R9 {
    public static final C192308fY A00 = new Object();
    public static final SerialDescriptor A01 = new C3RH("kotlin.Char", C192318fZ.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return Character.valueOf(decoder.ANv());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        C14360o3.A0B(encoder, 0);
        encoder.AS4(charValue);
    }
}
