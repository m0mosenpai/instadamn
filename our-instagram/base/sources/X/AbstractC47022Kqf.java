package X;

import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kqf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC47022Kqf {
    public static Map A00(C4d0 c4d0) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str2 = null;
        if (c4d0.Akc() != null) {
            XDTTextAppQuoteAttachmentEligibility Akc = c4d0.Akc();
            if (Akc != null) {
                str = Akc.A00;
            } else {
                str = null;
            }
            A1I.put("can_quote_attachment", str);
        }
        if (c4d0.Akd() != null) {
            A1I.put("can_quote_post", c4d0.Akd());
        }
        if (c4d0.Akj() != null) {
            A1I.put("can_repost", c4d0.Akj());
        }
        if (c4d0.Al5() != null) {
            A1I.put("can_unlink_quote", c4d0.Al5());
        }
        if (c4d0.Al6() != null) {
            A1I.put("can_unlink_quoted_attachment", c4d0.Al6());
        }
        if (c4d0.Cbu() != null) {
            A1I.put("is_reposted_by_viewer", c4d0.Cbu());
        }
        if (c4d0.Cc0() != null) {
            A1I.put("is_reshared_to_ig_by_viewer", c4d0.Cc0());
        }
        if (c4d0.Bjr() != null) {
            A1I.put("quoted_attachment_author_attribution_allowed", c4d0.Bjr());
        }
        C38321qM Bjs = c4d0.Bjs();
        if (Bjs != null) {
            A1I.put("quoted_attachment_post", Bjs.A1D());
        }
        if (c4d0.Bjt() != null) {
            A1I.put("quoted_attachment_post_unavailable", c4d0.Bjt());
        }
        if (c4d0.Bju() != null) {
            A1I.put("quoted_attachment_usage_count", c4d0.Bju());
        }
        C38321qM Bjw = c4d0.Bjw();
        if (Bjw != null) {
            A1I.put("quoted_post", Bjw.A1D());
        }
        if (c4d0.Bjx() != null) {
            A1I.put("quoted_post_caption", c4d0.Bjx());
        }
        if (c4d0.Bnt() != null) {
            RepostRestrictedReason Bnt = c4d0.Bnt();
            if (Bnt != null) {
                str2 = Bnt.A00;
            }
            A1I.put("repost_restricted_reason", str2);
        }
        C38321qM Bnw = c4d0.Bnw();
        if (Bnw != null) {
            A1I.put("reposted_post", Bnw.A1D());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
