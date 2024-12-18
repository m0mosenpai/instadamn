package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAL {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IN3, java.lang.Object] */
    public static IN3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("messageType".equals(A0s)) {
                    IgVideoRealtimeEventPayload$Type fromServerValue = IgVideoRealtimeEventPayload$Type.fromServerValue(c16l.A1P());
                    C14360o3.A0B(fromServerValue, 0);
                    obj.A02 = fromServerValue;
                } else if ("sessionName".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("broadcastId".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("videoCallId".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    obj.A01 = I1O.parseFromJson(c16l);
                } else if ("header".equals(A0s)) {
                    obj.A00 = IAN.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (obj.A02 == null) {
                IgVideoRealtimeEventPayload$Type igVideoRealtimeEventPayload$Type = IgVideoRealtimeEventPayload$Type.UNKNOWN;
                C14360o3.A0B(igVideoRealtimeEventPayload$Type, 0);
                obj.A02 = igVideoRealtimeEventPayload$Type;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
