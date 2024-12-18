package X;

import com.instagram.music.common.model.MusicAssetModel;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4V {
    public static ICT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MusicAssetModel musicAssetModel = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "track")) {
                    musicAssetModel = AbstractC37895Glq.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (musicAssetModel == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("track", c16l, "AudioAssetsResponse.AudioAssetHolder");
                throw C00O.createAndThrow();
            }
            return new ICT(musicAssetModel);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
