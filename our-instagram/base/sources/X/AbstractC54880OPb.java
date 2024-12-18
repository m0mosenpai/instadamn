package X;

import android.os.Parcelable;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.OPb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54880OPb {
    public static BrandedContentTag parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            BrandedContentTag brandedContentTag = new BrandedContentTag();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sponsor_id".equals(A0s)) {
                    brandedContentTag.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31188DnX.A01().equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    brandedContentTag.A02 = A0m;
                } else if ("permission".equals(A0s)) {
                    brandedContentTag.A04 = c16l.A0d();
                } else if ("sponsor".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    brandedContentTag.A00 = AbstractC38851rI.A00(c16l, false);
                } else if ("is_pending".equals(A0s)) {
                    brandedContentTag.A03 = c16l.A0d();
                }
                c16l.A0z();
            }
            return brandedContentTag;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, BrandedContentTag brandedContentTag) {
        anonymousClass182.A0d();
        String str = brandedContentTag.A01;
        if (str != null) {
            anonymousClass182.A0S("sponsor_id", str);
        }
        String str2 = brandedContentTag.A02;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC31188DnX.A01(), str2);
        }
        anonymousClass182.A0T("permission", brandedContentTag.A04);
        if (brandedContentTag.A00 != null) {
            anonymousClass182.A0r("sponsor");
            User user = brandedContentTag.A00;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0T("is_pending", brandedContentTag.A03);
        anonymousClass182.A0a();
    }
}
