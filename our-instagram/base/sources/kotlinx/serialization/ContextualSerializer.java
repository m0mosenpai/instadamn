package kotlinx.serialization;

import X.AbstractC06960Yn;
import X.AbstractC167017dG;
import X.AbstractC192728gE;
import X.AbstractC70142W6u;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3TO;
import X.C71680WyY;
import X.C71705WzW;
import X.C71708WzZ;
import X.C73803Sk;
import X.InterfaceC16510rw;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes11.dex */
public final class ContextualSerializer implements C3R9 {
    public final InterfaceC16510rw A00;
    public final List A01;
    public final SerialDescriptor A02;

    @Override // X.C3RB
    public final Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        C73803Sk BtX = decoder.BtX();
        InterfaceC16510rw interfaceC16510rw = this.A00;
        C14360o3.A0B(interfaceC16510rw, 0);
        BtX.A00.get(interfaceC16510rw);
        AbstractC192728gE.A01(interfaceC16510rw);
        throw C00O.createAndThrow();
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A02;
    }

    public ContextualSerializer(InterfaceC16510rw interfaceC16510rw, C3R9[] c3r9Arr) {
        this.A00 = interfaceC16510rw;
        this.A01 = AbstractC06960Yn.A0S(c3r9Arr);
        C71708WzZ A00 = AbstractC70142W6u.A00("kotlinx.serialization.ContextualSerializer", new C71680WyY(this, 2), C3TO.A00, new SerialDescriptor[0]);
        C14360o3.A0B(interfaceC16510rw, 1);
        this.A02 = new C71705WzW(interfaceC16510rw, A00);
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC167017dG.A1N(encoder, obj);
        C73803Sk BtX = encoder.BtX();
        InterfaceC16510rw interfaceC16510rw = this.A00;
        C14360o3.A0B(interfaceC16510rw, 0);
        BtX.A00.get(interfaceC16510rw);
        AbstractC192728gE.A01(interfaceC16510rw);
        throw C00O.createAndThrow();
    }
}
