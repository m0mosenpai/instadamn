package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class IA4 {
    public static final UpcomingEventImpl A00(C38897HAt c38897HAt) {
        C14360o3.A0B(c38897HAt, 0);
        Long l = c38897HAt.A05;
        String str = c38897HAt.A08;
        if (str == null) {
            str = "0";
        }
        Long l2 = c38897HAt.A06;
        UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = c38897HAt.A03;
        UpcomingEventMediaImpl upcomingEventMediaImpl = c38897HAt.A02;
        User user = c38897HAt.A04;
        boolean z = c38897HAt.A0A;
        long A0t = AbstractC25232BEp.A0t(c38897HAt.A07);
        String str2 = c38897HAt.A09;
        if (str2 == null) {
            str2 = "";
        }
        UpcomingEventIDType upcomingEventIDType = c38897HAt.A01;
        if (upcomingEventIDType == null) {
            upcomingEventIDType = UpcomingEventIDType.A05;
        }
        return new UpcomingEventImpl(null, null, upcomingEventIDType, upcomingEventMediaImpl, null, upcomingEventLiveMetadataImpl, user, null, l, l2, str, null, str2, A0t, z);
    }
}
