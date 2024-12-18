package X;

import com.instagram.music.common.model.MusicDataSource;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1N {
    public static MusicDataSource parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MusicDataSource musicDataSource = new MusicDataSource();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("progressive_download_url".equals(A0s)) {
                    musicDataSource.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(75).equals(A0s)) {
                    musicDataSource.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("downloaded_track_uri".equals(A0s)) {
                    musicDataSource.A00 = android.net.Uri.parse(c16l.A1Q());
                } else if ("asset_id".equals(A0s)) {
                    musicDataSource.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("artist_id".equals(A0s)) {
                    musicDataSource.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return musicDataSource;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
