package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes11.dex */
public final class X6X extends AbstractC71823X6b {
    public final JsonElement A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6X(String str, AbstractC73763Sg abstractC73763Sg, JsonElement jsonElement) {
        super(str, abstractC73763Sg, jsonElement);
        C14360o3.A0B(jsonElement, 2);
        this.A00 = jsonElement;
        ((AbstractC71825X6d) this).A01.add("primitive");
    }

    @Override // X.C3T8
    public final int ANz(SerialDescriptor serialDescriptor) {
        return 0;
    }
}
