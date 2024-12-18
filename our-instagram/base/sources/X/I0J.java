package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I0J {
    public static final ImageUrl A00(C3XR c3xr) {
        User BFU;
        TrackData BVV;
        ImageUrl AsF;
        MusicInfo BVc = c3xr.BVc();
        if (BVc == null || (BVV = BVc.BVV()) == null || (AsF = BVV.AsF()) == null) {
            OriginalSoundDataIntf BZw = c3xr.BZw();
            if (BZw != null && (BFU = BZw.BFU()) != null) {
                return BFU.A0C();
            }
            return null;
        }
        return AsF;
    }
}
