package X;

import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModelImpl;
import java.io.IOException;

/* renamed from: X.3XO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XO {
    public static MusicInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackDataImpl trackDataImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MusicConsumptionModelImpl musicConsumptionModelImpl = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("music_asset_info".equals(A0q)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else if ("music_canonical_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("music_consumption_info".equals(A0q)) {
                    musicConsumptionModelImpl = AbstractC84403pb.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (trackDataImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("music_asset_info", "MusicInfoImpl");
            } else if (musicConsumptionModelImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("music_consumption_info", "MusicInfoImpl");
            } else {
                return new MusicInfoImpl(trackDataImpl, musicConsumptionModelImpl, l);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MusicInfoImpl musicInfoImpl) {
        anonymousClass182.A0d();
        TrackData trackData = musicInfoImpl.A00;
        if (trackData != null) {
            anonymousClass182.A0r("music_asset_info");
            AbstractC84383pX.A00(anonymousClass182, trackData.F3P());
        }
        Long l = musicInfoImpl.A02;
        if (l != null) {
            anonymousClass182.A0R("music_canonical_id", l.longValue());
        }
        MusicConsumptionModel musicConsumptionModel = musicInfoImpl.A01;
        if (musicConsumptionModel != null) {
            anonymousClass182.A0r("music_consumption_info");
            AbstractC84403pb.A00(anonymousClass182, musicConsumptionModel.F6i(new C37761pD(null)));
        }
        anonymousClass182.A0a();
    }
}
