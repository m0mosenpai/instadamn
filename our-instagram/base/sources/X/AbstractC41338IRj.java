package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModelImpl;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import java.io.IOException;

/* renamed from: X.IRj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41338IRj {
    public static MusicQuestionResponseModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackDataImpl trackDataImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MusicConsumptionModelImpl musicConsumptionModelImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("music_asset_info".equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else if ("music_consumption_info".equals(A0s)) {
                    musicConsumptionModelImpl = AbstractC84403pb.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (trackDataImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("music_asset_info", c16l, "MusicQuestionResponseModel");
            } else if (musicConsumptionModelImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("music_consumption_info", c16l, "MusicQuestionResponseModel");
            } else {
                return new MusicQuestionResponseModel(trackDataImpl, musicConsumptionModelImpl);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MusicQuestionResponseModel musicQuestionResponseModel) {
        anonymousClass182.A0d();
        TrackData trackData = musicQuestionResponseModel.A00;
        if (trackData != null) {
            anonymousClass182.A0r("music_asset_info");
            AbstractC84383pX.A00(anonymousClass182, trackData.F3P());
        }
        MusicConsumptionModel musicConsumptionModel = musicQuestionResponseModel.A01;
        if (musicConsumptionModel != null) {
            anonymousClass182.A0r("music_consumption_info");
            AbstractC84403pb.A00(anonymousClass182, musicConsumptionModel.F6i(AbstractC37301Gc2.A08()));
        }
        anonymousClass182.A0a();
    }
}
