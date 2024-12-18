package X;

import com.instagram.api.schemas.LinkStickerType;
import java.io.IOException;

/* renamed from: X.VOc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68368VOc {
    public static UR2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            LinkStickerType linkStickerType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("link_sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    linkStickerType = (LinkStickerType) LinkStickerType.A01.get(A1P);
                    if (linkStickerType == null) {
                        linkStickerType = LinkStickerType.A04;
                    }
                } else if ("link_sticker_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (linkStickerType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("link_sticker_type", c16l, "LinkStickerInfoImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("link_sticker_url", c16l, "LinkStickerInfoImpl");
            } else {
                return new UR2(linkStickerType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
