package X;

import java.util.AbstractList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3SI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3SI extends C3RN {
    public final C3R9 A00;

    public void A07(Object obj, int i, Object obj2) {
        if (!(this instanceof C3SG) && !(this instanceof C3TZ)) {
            throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
        }
        AbstractList abstractList = (AbstractList) obj;
        C14360o3.A0B(abstractList, 0);
        abstractList.add(i, obj2);
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public SerialDescriptor getDescriptor() {
        if (this instanceof C3TV) {
            return ((C3TV) this).A00;
        }
        if (this instanceof C3SG) {
            return ((C3SG) this).A00;
        }
        return ((C3TZ) this).A01;
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor descriptor;
        C4D8 ADR;
        if (this instanceof C3TV) {
            C3TV c3tv = (C3TV) this;
            C14360o3.A0B(encoder, 0);
            int A01 = c3tv.A01(obj);
            descriptor = c3tv.A00;
            C14360o3.A0B(descriptor, 1);
            ADR = encoder.ADR(descriptor);
            c3tv.A09(obj, ADR, A01);
        } else {
            C14360o3.A0B(encoder, 0);
            int A012 = A01(obj);
            descriptor = getDescriptor();
            C14360o3.A0B(descriptor, 1);
            ADR = encoder.ADR(descriptor);
            Iterator A05 = A05(obj);
            for (int i = 0; i < A012; i++) {
                ADR.ASH(A05.next(), this.A00, descriptor, i);
            }
        }
        ADR.ASc(descriptor);
    }

    public C3SI(C3R9 c3r9) {
        this.A00 = c3r9;
    }
}
