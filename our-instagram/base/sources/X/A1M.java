package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1M {
    public static MusicAssetBeatInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MusicAssetBeatInfo musicAssetBeatInfo = new MusicAssetBeatInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("time_in_ms".equals(A0s)) {
                    musicAssetBeatInfo.A00 = c16l.A1D();
                } else if ("is_strong".equals(A0s)) {
                    musicAssetBeatInfo.A03 = c16l.A0d();
                } else if ("is_downbeat".equals(A0s)) {
                    musicAssetBeatInfo.A01 = c16l.A0d();
                } else if ("is_phrase".equals(A0s)) {
                    musicAssetBeatInfo.A02 = c16l.A0d();
                } else if ("is_twobar".equals(A0s)) {
                    musicAssetBeatInfo.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return musicAssetBeatInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
