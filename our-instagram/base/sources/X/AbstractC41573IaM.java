package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;

/* renamed from: X.IaM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41573IaM {
    public static final EnumSet A01 = EnumSet.of(AnonymousClass341.A0R, AnonymousClass341.A0J, AnonymousClass341.A0W);
    public static final EnumSet A00 = EnumSet.of(AnonymousClass341.A0H, AnonymousClass341.A0U);

    public static final String A00(UserSession userSession, C38321qM c38321qM, EnumC37745GjK enumC37745GjK) {
        long j;
        int ordinal = enumC37745GjK.ordinal();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (ordinal != 0) {
            j = 36327804052716415L;
        } else {
            j = 36327804052454267L;
        }
        if (!AbstractC31177DnL.A1U(c06090Tz, userSession, j)) {
            return null;
        }
        return AbstractC87103uT.A00(IGAdTransparencyDisclaimerPlacement.A06, AbstractC41071vF.A02(userSession, c38321qM));
    }
}
