package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;

/* loaded from: classes7.dex */
public final class IN3 {
    public UQ6 A00;
    public C41106IHx A01;
    public IgVideoRealtimeEventPayload$Type A02;
    public String A03;
    public String A04;

    public final IgVideoRealtimeEventPayload$Type A00() {
        IgVideoRealtimeEventPayload$Type igVideoRealtimeEventPayload$Type = this.A02;
        if (igVideoRealtimeEventPayload$Type != null) {
            return igVideoRealtimeEventPayload$Type;
        }
        C14360o3.A0F("messageType");
        throw C00O.createAndThrow();
    }

    public final String toString() {
        String str;
        String str2 = this.A03;
        String str3 = this.A04;
        IgVideoRealtimeEventPayload$Type A00 = A00();
        UQ6 uq6 = this.A00;
        if (uq6 != null) {
            str = uq6.A08;
        } else {
            str = null;
        }
        return AbstractC13670mt.A06("IgVideoRealtimeEventPayload[broadcast=%s, videocallId=%s, type=%s, transaction=%s]", str2, str3, A00, str);
    }
}
