package X;

import com.meta.flytrap.attachment.model.AttachmentCounter;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes9.dex */
public final /* synthetic */ class PVn implements InterfaceC73823Sp {
    public final SerialDescriptor A00;
    public final /* synthetic */ C3R9 A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = this.A00;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz == 0) {
                    arrayList = (ArrayList) ADQ.AOF(arrayList, new C3SG(this.A01), serialDescriptor, 0);
                    i |= 1;
                } else {
                    throw new X6K(ANz);
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new AttachmentCounter(arrayList, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{new C3SG(this.A01)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AttachmentCounter attachmentCounter = (AttachmentCounter) obj;
        AbstractC167017dG.A1N(encoder, attachmentCounter);
        SerialDescriptor serialDescriptor = this.A00;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9 c3r9 = this.A01;
        SerialDescriptor serialDescriptor2 = AttachmentCounter.A01;
        ADR.ASH(attachmentCounter.A00, new C3SG(c3r9), serialDescriptor, 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return new C3R9[]{this.A01};
    }

    public PVn(C3R9 c3r9) {
        this();
        this.A01 = c3r9;
    }

    public PVn() {
        C73833Sq c73833Sq = new C73833Sq("com.meta.flytrap.attachment.model.AttachmentCounter", this, 1);
        c73833Sq.A00("stack");
        this.A00 = c73833Sq;
    }
}
