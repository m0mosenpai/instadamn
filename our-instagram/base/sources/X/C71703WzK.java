package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WzK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71703WzK implements C3R9 {
    public static final C71703WzK A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A02("VaultedPaymentErrorCode", C3RE.A00);

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        EnumC68139VDb enumC68139VDb = (EnumC68139VDb) obj;
        AbstractC167017dG.A1N(encoder, enumC68139VDb);
        encoder.ASK(enumC68139VDb.A00);
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0i = AbstractC65702TsY.A0i(decoder);
        for (EnumC68139VDb enumC68139VDb : EnumC68139VDb.values()) {
            if (C14360o3.A0K(enumC68139VDb.A00, A0i)) {
                return enumC68139VDb;
            }
        }
        throw AbstractC167007dF.A0c("Unknown VaultedPaymentErrorCode value: ", A0i);
    }
}
