package X;

import android.os.Parcelable;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.io.StringWriter;

/* renamed from: X.1rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38851rI {
    public static final User A01(C1DY c1dy, ImmutablePandoUserDict immutablePandoUserDict) {
        C14360o3.A0B(immutablePandoUserDict, 0);
        Parcelable.Creator creator = User.CREATOR;
        return (User) c1dy.A00(new User(new C39891tD(immutablePandoUserDict)));
    }

    public static final String A07(User user) {
        C14360o3.A0B(user, 0);
        C17O F7e = user.A03.F7e(new C37761pD(null));
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        AbstractC38861rJ.A00(A0A, F7e);
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A08(AnonymousClass182 anonymousClass182, User user) {
        C14360o3.A0B(user, 1);
        AbstractC38861rJ.A00(anonymousClass182, user.A03.F7e(new C37761pD(null)));
    }

    public static final User A02(MerchantCheckoutStyle merchantCheckoutStyle, SellerShoppableFeedType sellerShoppableFeedType, ImageUrl imageUrl, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3) {
        User user = new User(str, str3);
        C17P c17p = user.A03;
        c17p.ETJ(bool);
        c17p.Egl(bool2);
        c17p.EZ2(merchantCheckoutStyle);
        c17p.Ebk(imageUrl);
        c17p.Edb(sellerShoppableFeedType);
        c17p.EeI(bool3);
        c17p.Eer(str2);
        return user;
    }

    public static final User A03(ImageUrl imageUrl, String str, String str2) {
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.A06;
        SellerShoppableFeedType sellerShoppableFeedType = SellerShoppableFeedType.A06;
        Boolean bool = Boolean.FALSE;
        return A02(merchantCheckoutStyle, sellerShoppableFeedType, imageUrl, null, bool, bool, str, null, str2);
    }

    public static final User A05(String str, String str2) {
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.A06;
        SellerShoppableFeedType sellerShoppableFeedType = SellerShoppableFeedType.A06;
        Boolean bool = Boolean.FALSE;
        return A02(merchantCheckoutStyle, sellerShoppableFeedType, null, null, bool, bool, str, null, str2);
    }

    public static final User A00(C16L c16l, boolean z) {
        C17O parseFromJson = AbstractC38861rJ.parseFromJson(c16l);
        if (parseFromJson != null) {
            User user = new User(parseFromJson);
            if (c16l instanceof C07950bF) {
                user = ((C07950bF) c16l).A1U(user, z);
            } else if (!(c16l instanceof C07500aP)) {
                C0w9.A03("user_missing_session", "User JSON needs to be parsed using SessionAwareJsonParser");
            }
            if (user.A03.B8n() != null) {
                C17P c17p = user.A03;
                c17p.EWv(c17p.B7P());
            }
            return user;
        }
        return null;
    }

    public static final User A04(String str) {
        C17O parseFromJson = AbstractC38861rJ.parseFromJson(C16V.A00(str));
        if (parseFromJson != null) {
            return new User(parseFromJson);
        }
        return null;
    }

    public static final String A06(FollowStatus followStatus) {
        int ordinal;
        if (followStatus != null && (ordinal = followStatus.ordinal()) != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            C0K8.A0O("User", "Follow status: %s not handled. Using 'unknown' instead.", followStatus);
                        } else {
                            return "requested";
                        }
                    } else {
                        return "following";
                    }
                } else {
                    return "not_following";
                }
            } else {
                return "fetching";
            }
        }
        return "unknown";
    }
}
