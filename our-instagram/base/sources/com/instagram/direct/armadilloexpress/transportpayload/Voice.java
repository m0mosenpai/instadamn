package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45378K6l;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65671Tr1;
import X.RWB;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Voice extends RYn implements InterfaceC65445TkH {
    public static final Voice DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int WAVEFORMS_FIELD_NUMBER = 3;
    public static final int WAVEFORM_SAMPLING_FREQUENCY_HZ_FIELD_NUMBER = 4;
    public int bitField0_;
    public int duration_;
    public CommonMediaTransport mediaTransport_;
    public int waveformSamplingFrequencyHz_;
    public int waveformsMemoizedSerializedSize = -1;
    public InterfaceC65671Tr1 waveforms_ = RWB.A02;

    static {
        Voice voice = new Voice();
        DEFAULT_INSTANCE = voice;
        RYn.A0B(voice, Voice.class);
    }

    @Override // X.RYn
    public final Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003$\u0004င\u0002", new Object[]{"bitField0_", "mediaTransport_", "duration_", "waveforms_", "waveformSamplingFrequencyHz_"});
            case 3:
                return new Voice();
            case 4:
                return new C45378K6l();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Voice.class) {
                        interfaceC50386MMo = PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                            PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo2;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}