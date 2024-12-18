package com.shopify.checkout.models.errors.violations;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import X.AbstractC70142W6u;
import X.C14360o3;
import X.C3R9;
import X.C3RE;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class InventoryErrorCodeSerializer implements C3R9 {
    public static final InventoryErrorCodeSerializer A00 = new Object();
    public static final SerialDescriptor A01 = AbstractC70142W6u.A02("InventoryErrorCode", C3RE.A00);

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InventoryErrorCode inventoryErrorCode = (InventoryErrorCode) obj;
        AbstractC167017dG.A1N(encoder, inventoryErrorCode);
        encoder.ASK(inventoryErrorCode.A00);
    }

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0i = AbstractC65702TsY.A0i(decoder);
        for (InventoryErrorCode inventoryErrorCode : InventoryErrorCode.values()) {
            if (C14360o3.A0K(inventoryErrorCode.A00, A0i)) {
                return inventoryErrorCode;
            }
        }
        throw AbstractC167007dF.A0c("Unknown InventoryErrorCode value: ", A0i);
    }
}
