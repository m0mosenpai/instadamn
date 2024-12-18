package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192368fe implements C3R9 {
    public static final C192368fe A01 = new Object();
    public static final SerialDescriptor A00 = AbstractC100784fh.A00("X.8fd", C3RJ.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return new C192358fd(decoder.AO6(A00).AOB());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        long j = ((C192358fd) obj).A00;
        C14360o3.A0B(encoder, 0);
        encoder.AS9(A00).ASD(j);
    }
}
