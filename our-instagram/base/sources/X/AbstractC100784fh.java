package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.4fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100784fh {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Sq, X.4fj] */
    public static final C100804fj A00(String str, final C3R9 c3r9) {
        return new C73833Sq(str, new InterfaceC73823Sp() { // from class: X.4fi
            @Override // X.InterfaceC73823Sp
            public final C3R9[] childSerializers() {
                return new C3R9[]{C3R9.this};
            }

            @Override // X.C3RB
            public final Object deserialize(Decoder decoder) {
                throw new IllegalStateException("unsupported");
            }

            @Override // X.C3R9, X.C3RA, X.C3RB
            public final SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // X.C3RA
            public final void serialize(Encoder encoder, Object obj) {
                throw new IllegalStateException("unsupported");
            }

            @Override // X.InterfaceC73823Sp
            public final C3R9[] typeParametersSerializers() {
                return AbstractC54355O0n.A00;
            }
        }, 1);
    }
}
