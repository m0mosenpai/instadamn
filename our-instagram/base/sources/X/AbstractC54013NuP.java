package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.NuP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54013NuP {
    public static OFR parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            OFR ofr = new OFR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("page_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    ofr.A0A = A1P;
                } else if ("app_signal_source".equals(A0s)) {
                    ofr.A09 = (EnumC53283NhL) EnumHelper.A00(c16l.A1Q(), EnumC53283NhL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("business_category_signal".equals(A0s)) {
                    ofr.A00 = AbstractC54004NuG.parseFromJson(c16l);
                } else if ("description_signal".equals(A0s)) {
                    ofr.A01 = AbstractC54005NuH.parseFromJson(c16l);
                } else if ("fb_badge_signal".equals(A0s)) {
                    ofr.A02 = AbstractC54006NuI.parseFromJson(c16l);
                } else if ("followers_signal".equals(A0s)) {
                    ofr.A03 = AbstractC54007NuJ.parseFromJson(c16l);
                } else if ("ig_badge_signal".equals(A0s)) {
                    ofr.A04 = AbstractC54008NuK.parseFromJson(c16l);
                } else if ("location_signal".equals(A0s)) {
                    ofr.A05 = AbstractC54009NuL.parseFromJson(c16l);
                } else if ("page_likes_signal".equals(A0s)) {
                    ofr.A06 = AbstractC54010NuM.parseFromJson(c16l);
                } else if ("price_range_signal".equals(A0s)) {
                    ofr.A07 = AbstractC54011NuN.parseFromJson(c16l);
                } else if ("rating_signal".equals(A0s)) {
                    ofr.A08 = AbstractC54012NuO.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ofr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
