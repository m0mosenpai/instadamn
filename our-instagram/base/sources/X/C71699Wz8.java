package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Wz8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71699Wz8 implements C3R9 {
    public static final C71699Wz8 A00 = new Object();
    public static final SerialDescriptor A01 = new C192718gD(AbstractC70142W6u.A01("Any", new C71679WyX(6), new SerialDescriptor[0]));

    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        return AbstractC111324zv.A00(87);
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        String obj2;
        C14360o3.A0B(encoder, 0);
        if (encoder instanceof C4D7) {
            if (obj == null) {
                encoder.ASF();
                return;
            }
            if (obj instanceof Integer) {
                encoder.ASB(((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                encoder.ASD(((Number) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else {
                if (obj instanceof Boolean) {
                    encoder.AS1(((Boolean) obj).booleanValue());
                    return;
                }
                if (obj instanceof Double) {
                    encoder.AS5(((Number) obj).doubleValue());
                    return;
                }
                if (obj instanceof Float) {
                    encoder.AS7(((Number) obj).floatValue());
                    return;
                }
                if (!(obj instanceof Object[]) && !(obj instanceof List)) {
                    if (obj instanceof Map) {
                        C3RD c3rd = C3RD.A01;
                        C71699Wz8 c71699Wz8 = A00;
                        AbstractC167007dF.A1K(c3rd, c71699Wz8);
                        C3RA c3rl = new C3RL(c3rd, c71699Wz8);
                        Map map = (Map) obj;
                        LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
                        Iterator A15 = AbstractC166997dE.A15(map);
                        while (A15.hasNext()) {
                            Map.Entry entry = (Map.Entry) A15.next();
                            A0y.put(String.valueOf(entry.getKey()), entry.getValue());
                        }
                        encoder.ASI(A0y, c3rl);
                        return;
                    }
                    obj2 = obj.toString();
                } else {
                    C71699Wz8 c71699Wz82 = A00;
                    C14360o3.A0B(c71699Wz82, 0);
                    encoder.ASI(obj, new C3SG(c71699Wz82));
                    return;
                }
            }
            encoder.ASK(obj2);
            return;
        }
        throw new IllegalArgumentException("This class can be saved only by JSON");
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }
}
