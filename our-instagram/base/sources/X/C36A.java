package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.36A, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C36A {
    public static final boolean A00(MusicProduct musicProduct, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(musicProduct, 1);
        if (musicProduct != MusicProduct.A06) {
            if (musicProduct == MusicProduct.A0G) {
                C06090Tz c06090Tz = C06090Tz.A06;
                if (!C18U.A06(c06090Tz, userSession, 36323895632015023L) && !C18U.A06(c06090Tz, userSession, 36323895632080560L)) {
                    return false;
                }
            } else {
                if (AbstractC65993Txo.A02(musicProduct)) {
                    return C18U.A06(C06090Tz.A06, userSession, 36323895631949486L);
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return !C18U.A06(C06090Tz.A05, userSession, 36327116857555254L);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36330174874141409L);
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323440365546743L) && !C18U.A06(c06090Tz, userSession, 36323440365743354L) && !C18U.A06(c06090Tz, userSession, 36323895632080560L)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC180467za.A00(userSession).booleanValue();
    }

    public static final boolean A09(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A06, userSession, 36313974257682780L) && !C18U.A06(C06090Tz.A05, userSession, 36323895632015023L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36317191188321124L);
    }

    public static final boolean A0B(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36327718153239353L) && A09(userSession) && C18U.A06(c06090Tz, userSession, 36324539877044452L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36326223504291579L);
    }

    public static final boolean A0K(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        return z2 && z && A05(userSession);
    }

    public static final boolean A01(MusicProduct musicProduct, UserSession userSession) {
        if (musicProduct == MusicProduct.A06) {
            return true;
        }
        if (AbstractC65993Txo.A02(musicProduct)) {
            return C18U.A06(C06090Tz.A06, userSession, 36323895631949486L);
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (!C18U.A06(C06090Tz.A06, userSession, 36313974258600293L) && !C18U.A06(C06090Tz.A05, userSession, 36323895632015023L)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323440365612280L) && !C18U.A06(c06090Tz, userSession, 36323440365743354L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36324977963709051L) && !C18U.A06(c06090Tz, userSession, 36324977964036736L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36324977963840125L) && !C18U.A06(c06090Tz, userSession, 36324977964036736L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0H(UserSession userSession, User user) {
        if (user != null) {
            user.getId();
            if (C14360o3.A0K(user.getId(), userSession.userId)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0J(UserSession userSession, User user, boolean z) {
        if (z) {
            return false;
        }
        if (A0H(userSession, user)) {
            return true;
        }
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36313974258534756L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A06(UserSession userSession) {
        if (AbstractC180467za.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36312608458212550L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0C(UserSession userSession) {
        if (AbstractC180467za.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36327825527094167L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0E(UserSession userSession) {
        if (AbstractC180467za.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36327825527028630L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0I(UserSession userSession, User user) {
        if (!A0H(userSession, user) && !C18U.A06(C06090Tz.A06, userSession, 36313974257617243L)) {
            return false;
        }
        return true;
    }
}
