package X;

import com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.X0d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71738X0d implements InterfaceC73823Sp {
    public static final C71738X0d A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        str2 = AbstractC65702TsY.A0e(str2, serialDescriptor, ADQ, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new LauncherBasedSuggestedPrompt(str, str2, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, X.X0d, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt", obj, 2);
        c73833Sq.A00("text");
        c73833Sq.A01("display", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, AbstractC192698gB.A00(c3rd)};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt = (LauncherBasedSuggestedPrompt) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, launcherBasedSuggestedPrompt);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASL(launcherBasedSuggestedPrompt.A01, serialDescriptor, 0);
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || launcherBasedSuggestedPrompt.A00 != null) {
            ADR.ASG(launcherBasedSuggestedPrompt.A00, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}