package X;

import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import java.io.IOException;

/* renamed from: X.4cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99304cw {
    public static C99314cz parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            C38321qM c38321qM = null;
            Boolean bool8 = null;
            Integer num = null;
            C38321qM c38321qM2 = null;
            String str = null;
            RepostRestrictedReason repostRestrictedReason = null;
            C38321qM c38321qM3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_quote_attachment".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    xDTTextAppQuoteAttachmentEligibility = (XDTTextAppQuoteAttachmentEligibility) XDTTextAppQuoteAttachmentEligibility.A01.get(A1P2);
                    if (xDTTextAppQuoteAttachmentEligibility == null) {
                        xDTTextAppQuoteAttachmentEligibility = XDTTextAppQuoteAttachmentEligibility.A09;
                    }
                } else if ("can_quote_post".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("can_repost".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("can_unlink_quote".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("can_unlink_quoted_attachment".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reposted_by_viewer".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reshared_to_ig_by_viewer".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("quoted_attachment_author_attribution_allowed".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("quoted_attachment_post".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("quoted_attachment_post_unavailable".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("quoted_attachment_usage_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("quoted_post".equals(A0q)) {
                    c38321qM2 = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("quoted_post_caption".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("repost_restricted_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    repostRestrictedReason = (RepostRestrictedReason) RepostRestrictedReason.A01.get(A1P);
                    if (repostRestrictedReason == null) {
                        repostRestrictedReason = RepostRestrictedReason.A07;
                    }
                } else if ("reposted_post".equals(A0q)) {
                    c38321qM3 = C38321qM.A0h.A0C(c16l, true, false);
                }
                c16l.A0z();
            }
            return new C99314cz(repostRestrictedReason, xDTTextAppQuoteAttachmentEligibility, c38321qM, c38321qM2, c38321qM3, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
