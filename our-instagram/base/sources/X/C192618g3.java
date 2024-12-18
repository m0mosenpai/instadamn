package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192618g3 implements C3R9 {
    public static final C192618g3 A01 = new C192618g3();
    public final /* synthetic */ C192628g4 A00 = new C192628g4("X.0eB", C0eB.A00);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        this.A00.deserialize(decoder);
        return C0eB.A00;
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A00.getDescriptor();
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        C14360o3.A0B(obj, 1);
        this.A00.serialize(encoder, obj);
    }
}
