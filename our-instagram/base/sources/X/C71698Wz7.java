package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Wz7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71698Wz7 implements C3R9 {
    public final C3R9 A00;
    public final C3R9 A01;
    public final C3R9 A02;
    public final SerialDescriptor A03 = AbstractC70142W6u.A01("X.51u", new C71680WyY(this, 7), new SerialDescriptor[0]);

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = this.A03;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        Object obj = VZ8.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        Object obj4 = obj;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            obj4 = ADQ.AOF(null, this.A02, serialDescriptor, 2);
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0O(AbstractC111324zv.A00(1835), ANz));
                        }
                    } else {
                        obj3 = ADQ.AOF(null, this.A01, serialDescriptor, 1);
                    }
                } else {
                    obj2 = ADQ.AOF(null, this.A00, serialDescriptor, 0);
                }
            } else {
                ADQ.ASc(serialDescriptor);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new C51u(obj2, obj3, obj4);
                        }
                        throw new IllegalArgumentException("Element 'third' is missing");
                    }
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                throw new IllegalArgumentException("Element 'first' is missing");
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A03;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C51u c51u = (C51u) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, c51u);
        SerialDescriptor serialDescriptor = this.A03;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(c51u.A00, this.A00, serialDescriptor, 0);
        ADR.ASH(c51u.A01, this.A01, serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(c51u.A02, this.A02, serialDescriptor, 2);
        ADR.ASc(serialDescriptor);
    }

    public C71698Wz7(C3R9 c3r9, C3R9 c3r92, C3R9 c3r93) {
        this.A00 = c3r9;
        this.A01 = c3r92;
        this.A02 = c3r93;
    }
}
