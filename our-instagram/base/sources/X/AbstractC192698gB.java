package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192698gB {
    public static final C3R9 A00(final C3R9 c3r9) {
        C14360o3.A0B(c3r9, 0);
        if (!c3r9.getDescriptor().CZW()) {
            return new C3R9(c3r9) { // from class: X.8gC
                public final C3R9 A00;
                public final SerialDescriptor A01;

                @Override // X.C3RB
                public final Object deserialize(Decoder decoder) {
                    C14360o3.A0B(decoder, 0);
                    if (decoder.AOD()) {
                        return decoder.AOG(this.A00);
                    }
                    return null;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj != null && getClass() == obj.getClass() && C14360o3.A0K(this.A00, ((C192708gC) obj).A00));
                }

                @Override // X.C3RA
                public final void serialize(Encoder encoder, Object obj) {
                    C14360o3.A0B(encoder, 0);
                    if (obj != null) {
                        encoder.ASI(obj, this.A00);
                    } else {
                        encoder.ASF();
                    }
                }

                @Override // X.C3R9, X.C3RA, X.C3RB
                public final SerialDescriptor getDescriptor() {
                    return this.A01;
                }

                public final int hashCode() {
                    return this.A00.hashCode();
                }

                {
                    this.A00 = c3r9;
                    this.A01 = new C192718gD(c3r9.getDescriptor());
                }
            };
        }
        return c3r9;
    }
}
