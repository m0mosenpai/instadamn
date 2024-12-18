package X;

import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.rsys.models.EngineModel;

/* renamed from: X.OTw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54988OTw {
    public RtcCallKey A00;
    public C19L A01;
    public final PES A02;
    public final C54446O4a A03;

    public static EngineModel A0K(C51759Mti c51759Mti) {
        return (EngineModel) c51759Mti.A00;
    }

    public AbstractC54988OTw(C54446O4a c54446O4a) {
        this.A03 = c54446O4a;
        PES pes = new PES(this);
        this.A02 = pes;
        c54446O4a.A00.add(pes);
    }
}
