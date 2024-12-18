package kotlinx.serialization;

import X.AbstractC09440dt;
import X.AbstractC167017dG;
import X.C16930sl;
import X.C3TB;
import X.C71678WyW;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC16510rw;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes11.dex */
public final class PolymorphicSerializer extends C3TB {
    public final InterfaceC16510rw A01;
    public List A00 = C16930sl.A00;
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A03, new C71678WyW(this, 3));

    @Override // X.C3TB
    public final InterfaceC16510rw A00() {
        return this.A01;
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public PolymorphicSerializer(InterfaceC16510rw interfaceC16510rw) {
        this.A01 = interfaceC16510rw;
    }
}
