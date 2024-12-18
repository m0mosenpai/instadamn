package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.HnN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39932HnN {
    public static GIFNoteResponseInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CommentGiphyMediaInfo commentGiphyMediaInfo = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("gif_info".equals(AbstractC166997dE.A0s(c16l))) {
                    commentGiphyMediaInfo = AbstractC41253INt.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new GIFNoteResponseInfoImpl(commentGiphyMediaInfo);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
