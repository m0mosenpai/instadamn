package X;

import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import java.io.IOException;

/* renamed from: X.INt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41253INt {
    public static CommentGiphyMediaInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CommentGiphyMediaImages commentGiphyMediaImages = null;
            String str = null;
            CommentGiphyMediaImages commentGiphyMediaImages2 = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC58317Pt9.A00(102).equals(A0s)) {
                    commentGiphyMediaImages = AbstractC41252INs.parseFromJson(c16l);
                } else if ("gif_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("images".equals(A0s)) {
                    commentGiphyMediaImages2 = AbstractC41252INs.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1P(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37309GcB.A01().equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CommentGiphyMediaInfo commentGiphyMediaInfo) {
        anonymousClass182.A0d();
        CommentGiphyMediaImages commentGiphyMediaImages = commentGiphyMediaInfo.A00;
        if (commentGiphyMediaImages != null) {
            anonymousClass182.A0r(AbstractC58317Pt9.A00(102));
            AbstractC41252INs.A00(anonymousClass182, commentGiphyMediaImages);
        }
        String str = commentGiphyMediaInfo.A03;
        if (str != null) {
            anonymousClass182.A0S("gif_media_id", str);
        }
        CommentGiphyMediaImages commentGiphyMediaImages2 = commentGiphyMediaInfo.A01;
        if (commentGiphyMediaImages2 != null) {
            anonymousClass182.A0r("images");
            AbstractC41252INs.A00(anonymousClass182, commentGiphyMediaImages2);
        }
        Boolean bool = commentGiphyMediaInfo.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_sticker", bool.booleanValue());
        }
        AbstractC37301Gc2.A1F(anonymousClass182, commentGiphyMediaInfo.A04);
        String str2 = commentGiphyMediaInfo.A05;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC37309GcB.A01(), str2);
        }
        anonymousClass182.A0a();
    }
}
