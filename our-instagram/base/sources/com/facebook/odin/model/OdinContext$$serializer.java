package com.facebook.odin.model;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC54355O0n;
import X.AbstractC68219VIb;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3T8;
import X.C4D8;
import X.C73833Sq;
import X.InterfaceC73823Sp;
import X.MSW;
import X.X6K;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes9.dex */
public final /* synthetic */ class OdinContext$$serializer implements InterfaceC73823Sp {
    public static final OdinContext$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    @Override // X.C3RB
    public final OdinContext deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = OdinContext.A06;
        String str = null;
        Type type = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    map3 = (Map) MSW.A12(map3, serialDescriptor, ADQ, c3r9Arr, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                map2 = (Map) MSW.A12(map2, serialDescriptor, ADQ, c3r9Arr, 3);
                                i |= 8;
                            }
                        } else {
                            map = (Map) MSW.A12(map, serialDescriptor, ADQ, c3r9Arr, 2);
                            i |= 4;
                        }
                    } else {
                        type = (Type) MSW.A12(type, serialDescriptor, ADQ, c3r9Arr, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new OdinContext(type, str, map, map2, map3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // X.C3RA
    public final void serialize(Encoder encoder, OdinContext odinContext) {
        boolean A1R = AbstractC167007dF.A1R(0, encoder, odinContext);
        SerialDescriptor serialDescriptor = descriptor;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = OdinContext.A06;
        if (ADR.EiY(serialDescriptor, 0) || !C14360o3.A0K(odinContext.A01, "")) {
            ADR.ASL(odinContext.A01, serialDescriptor, 0);
        }
        if (ADR.EiY(serialDescriptor, A1R ? 1 : 0) || odinContext.A00 != Type.A0C) {
            ADR.ASH(odinContext.A00, c3r9Arr[A1R ? 1 : 0], serialDescriptor, A1R ? 1 : 0);
        }
        if (ADR.EiY(serialDescriptor, 2) || !C14360o3.A0K(odinContext.A03, AbstractC166987dD.A1I())) {
            ADR.ASH(odinContext.A03, c3r9Arr[2], serialDescriptor, 2);
        }
        if (ADR.EiY(serialDescriptor, 3) || !C14360o3.A0K(odinContext.A02, AbstractC166987dD.A1I())) {
            ADR.ASH(odinContext.A02, c3r9Arr[3], serialDescriptor, 3);
        }
        if (ADR.EiY(serialDescriptor, 4) || !C14360o3.A0K(odinContext.A04, AbstractC166987dD.A1I())) {
            ADR.ASH(odinContext.A04, c3r9Arr[4], serialDescriptor, 4);
        }
        ADR.ASc(serialDescriptor);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, com.facebook.odin.model.OdinContext$$serializer, java.lang.Object] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.model.OdinContext", obj, 5);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        c73833Sq.A01("longMap", true);
        c73833Sq.A01("doubleMap", true);
        c73833Sq.A01("stringMap", true);
        descriptor = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = OdinContext.A06;
        return new C3R9[]{C3RD.A01, c3r9Arr[1], c3r9Arr[2], c3r9Arr[3], c3r9Arr[4]};
    }

    @Override // X.InterfaceC73823Sp
    public C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
