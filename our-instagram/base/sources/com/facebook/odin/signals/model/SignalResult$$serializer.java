package com.facebook.odin.signals.model;

import X.AbstractC06930Yk;
import X.AbstractC167007dF;
import X.AbstractC192698gB;
import X.AbstractC54355O0n;
import X.AbstractC68219VIb;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RJ;
import X.C3T8;
import X.C4D8;
import X.C73833Sq;
import X.InterfaceC73823Sp;
import X.X6K;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.OdinContext;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class SignalResult$$serializer implements InterfaceC73823Sp {
    public static final SignalResult$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    @Override // X.C3RB
    public final SignalResult deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = SignalResult.A09;
        String str = null;
        String str2 = null;
        Map map = null;
        Map map2 = null;
        OdinContext odinContext = null;
        Map map3 = null;
        long j = 0;
        int i = 0;
        String str3 = null;
        Map map4 = null;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            switch (ANz) {
                case -1:
                    ADQ.ASc(serialDescriptor);
                    return new SignalResult(odinContext, str, str3, str2, map4, map, map2, map3, i, j);
                case 0:
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    map4 = (Map) ADQ.AOF(map4, c3r9Arr[2], serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) ADQ.AOF(map, c3r9Arr[3], serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    map2 = (Map) ADQ.AOF(map2, c3r9Arr[4], serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    map3 = (Map) ADQ.AOF(map3, c3r9Arr[5], serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ADQ.AOC(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    odinContext = (OdinContext) ADQ.AOE(odinContext, c3r9Arr[8], serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, SignalResult signalResult) {
        boolean A1R = AbstractC167007dF.A1R(0, encoder, signalResult);
        SerialDescriptor serialDescriptor = descriptor;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = SignalResult.A09;
        if (ADR.EiY(serialDescriptor, 0) || !C14360o3.A0K(signalResult.A03, "")) {
            ADR.ASL(signalResult.A03, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || signalResult.A04 != null) {
            ADR.ASG(signalResult.A04, C3RD.A01, serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || !C14360o3.A0K(signalResult.A06, AbstractC06930Yk.A0E())) {
            ADR.ASH(signalResult.A06, c3r9Arr[2], serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || !C14360o3.A0K(signalResult.A05, AbstractC06930Yk.A0E())) {
            ADR.ASH(signalResult.A05, c3r9Arr[3], serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || !C14360o3.A0K(signalResult.A08, AbstractC06930Yk.A0E())) {
            ADR.ASH(signalResult.A08, c3r9Arr[4], serialDescriptor, 4);
        }
        if (ADR.EiY(serialDescriptor, 5) || !C14360o3.A0K(signalResult.A07, AbstractC06930Yk.A0E())) {
            ADR.ASH(signalResult.A07, c3r9Arr[5], serialDescriptor, 5);
        }
        if (ADR.EiY(serialDescriptor, 6) || signalResult.A02 != null) {
            ADR.ASG(signalResult.A02, C3RD.A01, serialDescriptor, 6);
        }
        if (ADR.EiY(serialDescriptor, 7) || signalResult.A00 != 0) {
            ADR.ASE(serialDescriptor, 7, signalResult.A00);
        }
        if (ADR.EiY(serialDescriptor, 8) || signalResult.A01 != null) {
            ADR.ASG(signalResult.A01, c3r9Arr[8], serialDescriptor, 8);
        }
        ADR.ASc(serialDescriptor);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, com.facebook.odin.signals.model.SignalResult$$serializer] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.signals.model.SignalResult", obj, 9);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        c73833Sq.A01("longs", true);
        c73833Sq.A01("floats", true);
        c73833Sq.A01("strings", true);
        c73833Sq.A01("stringLists", true);
        c73833Sq.A01("error", true);
        c73833Sq.A01("timestampInMillis", true);
        c73833Sq.A01("odinContext", true);
        descriptor = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = SignalResult.A09;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, AbstractC192698gB.A00(c3rd), c3r9Arr[2], c3r9Arr[3], c3r9Arr[4], c3r9Arr[5], AbstractC192698gB.A00(c3rd), C3RJ.A00, AbstractC192698gB.A00(c3r9Arr[8])};
    }

    @Override // X.InterfaceC73823Sp
    public C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
