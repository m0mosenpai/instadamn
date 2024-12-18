package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192648g6 implements C3R9 {
    public static final C192648g6 A00 = new Object();
    public static final SerialDescriptor A01 = C192658g7.A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }
}
