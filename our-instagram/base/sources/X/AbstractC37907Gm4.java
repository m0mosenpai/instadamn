package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicConsumptionModel;

/* renamed from: X.Gm4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37907Gm4 {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        MusicConsumptionModel musicConsumptionModel;
        C3x9 A0u;
        MusicInfo BVc;
        if (c38321qM != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null && (BVc = A0u.BVc()) != null) {
            musicConsumptionModel = BVc.BVa();
        } else {
            musicConsumptionModel = null;
        }
        if (musicConsumptionModel == null || !AbstractC166997dE.A1Z(musicConsumptionModel.Buu(), true)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316396619174251L)) {
            return true;
        }
        return C18U.A06(c06090Tz, userSession, 36316396619043177L);
    }
}
