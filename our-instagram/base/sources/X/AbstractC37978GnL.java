package X;

import android.os.Parcelable;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.GnL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37978GnL {
    public static MusicNoteResponseInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            MusicInfoImpl musicInfoImpl = null;
            Integer num = null;
            User user = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_reshare_eligible".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_spotify_save_eligible".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("music_info".equals(A0q)) {
                    musicInfoImpl = C3XO.parseFromJson(c16l);
                } else if ("num_spotify_saves".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("original_author".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("selected_lyrics".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (musicInfoImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("music_info", c16l, "MusicNoteResponseInfo");
                throw C00O.createAndThrow();
            }
            return new MusicNoteResponseInfo(musicInfoImpl, user, bool, bool2, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
