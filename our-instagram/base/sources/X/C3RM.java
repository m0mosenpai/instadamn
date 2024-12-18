package X;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3RM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3RM extends C3RN {
    public final C3R9 A00;
    public final C3R9 A01;

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        C14360o3.A0B(encoder, 0);
        A01(obj);
        SerialDescriptor descriptor = getDescriptor();
        C14360o3.A0B(descriptor, 1);
        C4D8 ADR = encoder.ADR(descriptor);
        Iterator A05 = A05(obj);
        int i = 0;
        while (A05.hasNext()) {
            Map.Entry entry = (Map.Entry) A05.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ADR.ASH(key, this.A00, descriptor, i);
            i = i2 + 1;
            ADR.ASH(value, this.A01, descriptor, i2);
        }
        ADR.ASc(descriptor);
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        if (this instanceof C73863Sv) {
            return ((C73863Sv) this).A00;
        }
        return ((C3RL) this).A00;
    }

    public C3RM(C3R9 c3r9, C3R9 c3r92) {
        this.A00 = c3r9;
        this.A01 = c3r92;
    }
}
