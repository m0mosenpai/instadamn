package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Wz5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71697Wz5 implements C3R9 {
    public final C3R9 A00;
    public final C3R9 A01;

    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        Object c71664WyG;
        C14360o3.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C3T8 ADQ = decoder.ADQ(descriptor);
        Object obj = VZ8.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        while (true) {
            int ANz = ADQ.ANz(getDescriptor());
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        obj3 = ADQ.AOF(null, this.A01, getDescriptor(), 1);
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Invalid index: ", ANz));
                    }
                } else {
                    obj2 = ADQ.AOF(null, this.A00, getDescriptor(), 0);
                }
            } else {
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (this instanceof X6T) {
                            c71664WyG = new C09530e4(obj2, obj3);
                        } else {
                            c71664WyG = new C71664WyG(obj2, obj3);
                        }
                        ADQ.ASc(descriptor);
                        return c71664WyG;
                    }
                    throw new IllegalArgumentException("Element 'value' is missing");
                }
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        C14360o3.A0B(encoder, 0);
        C4D8 ADR = encoder.ADR(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        C3R9 c3r9 = this.A00;
        boolean z = this instanceof X6T;
        if (z) {
            C09530e4 c09530e4 = (C09530e4) obj;
            C14360o3.A0B(c09530e4, 0);
            key = c09530e4.A00;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            C14360o3.A0B(entry, 0);
            key = entry.getKey();
        }
        ADR.ASH(key, c3r9, descriptor, 0);
        SerialDescriptor descriptor2 = getDescriptor();
        C3R9 c3r92 = this.A01;
        if (z) {
            C09530e4 c09530e42 = (C09530e4) obj;
            C14360o3.A0B(c09530e42, 0);
            value = c09530e42.A01;
        } else {
            Map.Entry entry2 = (Map.Entry) obj;
            C14360o3.A0B(entry2, 0);
            value = entry2.getValue();
        }
        ADR.ASH(value, c3r92, descriptor2, 1);
        ADR.ASc(getDescriptor());
    }

    public AbstractC71697Wz5(C3R9 c3r9, C3R9 c3r92) {
        this.A00 = c3r9;
        this.A01 = c3r92;
    }
}
