package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HtJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40253HtJ {
    public static C51797Mv1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            TrackDataImpl trackDataImpl = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_trim_time_ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H5F parseFromJson = AbstractC40254HtK.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("track_data".equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "track_start_time");
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_ids", c16l, "SoundSyncInfo");
            } else if (arrayList2 != null || !(c16l instanceof C07950bF)) {
                if (trackDataImpl == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("track_data", c16l, "SoundSyncInfo");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("track_start_time", c16l, "SoundSyncInfo");
                } else {
                    return new C51797Mv1(trackDataImpl, arrayList, arrayList2, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("sound_sync_trim_time_ranges", c16l, "SoundSyncInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
