package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;

/* loaded from: classes11.dex */
public final class X6Y extends AbstractC71823X6b {
    public int A00;
    public final JsonArray A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6Y(AbstractC73763Sg abstractC73763Sg, JsonArray jsonArray) {
        super(null, abstractC73763Sg, jsonArray);
        C14360o3.A0B(jsonArray, 2);
        this.A01 = jsonArray;
        this.A02 = jsonArray.size();
        this.A00 = -1;
    }

    @Override // X.C3T8
    public final int ANz(SerialDescriptor serialDescriptor) {
        int i = this.A00;
        if (i >= this.A02 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.A00 = i2;
        return i2;
    }
}
