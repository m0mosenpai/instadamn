package X;

import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.MediaType;
import java.io.IOException;

/* renamed from: X.Hka, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39764Hka {
    public static AvatarNoteResponseInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MediaType mediaType = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("avatar_sticker_media_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaType = (MediaType) MediaType.A01.get(A1P);
                    if (mediaType == null) {
                        mediaType = MediaType.A06;
                    }
                } else if ("avatar_sticker_template_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cdn_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (mediaType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("avatar_sticker_media_type", c16l, "AvatarNoteResponseInfoImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("avatar_sticker_template_id", c16l, "AvatarNoteResponseInfoImpl");
            } else {
                return new AvatarNoteResponseInfoImpl(mediaType, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
