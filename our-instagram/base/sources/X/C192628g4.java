package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192628g4 implements C3R9 {
    public List A00 = C16930sl.A00;
    public final Object A01;
    public final InterfaceC09390do A02;

    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C3T8 ADQ = decoder.ADQ(descriptor);
        int ANz = ADQ.ANz(getDescriptor());
        if (ANz == -1) {
            ADQ.ASc(descriptor);
            return this.A01;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O(AbstractC111324zv.A00(1835), ANz));
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        encoder.ADR(getDescriptor()).ASc(getDescriptor());
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public C192628g4(final String str, Object obj) {
        this.A01 = obj;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A03, new InterfaceC16820sZ() { // from class: X.8g5
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                String str2 = str;
                final C192628g4 c192628g4 = this;
                C14360o3.A0B(c192628g4, 1);
                return AbstractC70142W6u.A00(str2, new InterfaceC16660sJ() { // from class: X.Wyl
                    @Override // X.InterfaceC16660sJ
                    public final Object invoke(Object obj2) {
                        C192628g4 c192628g42 = C192628g4.this;
                        C69634Vsb c69634Vsb = (C69634Vsb) obj2;
                        AbstractC167017dG.A1N(c192628g42, c69634Vsb);
                        c69634Vsb.A00 = c192628g42.A00;
                        return C0eB.A00;
                    }
                }, C192668g8.A00, new SerialDescriptor[0]);
            }
        });
    }
}
