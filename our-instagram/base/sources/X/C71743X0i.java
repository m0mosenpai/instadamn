package X;

import java.util.HashMap;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71743X0i implements InterfaceC73823Sp {
    public static final C71743X0i A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = W8w.A02;
        HashMap hashMap = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        j = ADQ.AOC(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    hashMap = (HashMap) ADQ.AOF(hashMap, c3r9Arr[0], serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new W8w(hashMap, i, j);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X0i, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.igsignals.signals.odin.IgSignalsOdinServerFeaturesProvider.ServerFeaturesData", obj, 2);
        c73833Sq.A00("features");
        c73833Sq.A00("timestamp");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{W8w.A02[0], C3RJ.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        W8w w8w = (W8w) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, w8w);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(w8w.A01, W8w.A02[0], serialDescriptor, 0);
        ADR.ASE(serialDescriptor, A1R ? 1 : 0, w8w.A00);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
