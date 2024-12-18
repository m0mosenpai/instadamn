package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192508fs implements C3R9 {
    public static final C192508fs A01 = new Object();
    public static final SerialDescriptor A00 = AbstractC100784fh.A00("X.8fr", C192468fo.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return new C192498fr(decoder.AO6(A00).AOH());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        short s = ((C192498fr) obj).A00;
        C14360o3.A0B(encoder, 0);
        encoder.AS9(A00).ASJ(s);
    }
}
