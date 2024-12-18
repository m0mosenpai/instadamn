package X;

import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;

/* renamed from: X.MVu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50609MVu {
    public static final UpcomingEventImpl A00(String str) {
        UpcomingEventImpl upcomingEventImpl = null;
        if (str != null) {
            try {
                C16L A03 = AbstractC221915u.A00.A03(str);
                A03.A12();
                upcomingEventImpl = IT3.parseFromJson(A03);
                return upcomingEventImpl;
            } catch (IOException e) {
                AbstractC12120kG.A06("UpcomingEventConverter", "Failed to deserialize UpcomingEvent from ClipsDraft", e);
            }
        }
        return upcomingEventImpl;
    }
}
