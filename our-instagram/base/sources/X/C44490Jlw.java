package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jlw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44490Jlw extends AbstractC52922bZ {
    public final UserSession A00;
    public final C1YY A01;
    public final User A02;
    public final C05A A03;
    public final C0UO A04;

    public /* synthetic */ C44490Jlw(HighlightReelTypeStr highlightReelTypeStr, UserSession userSession) {
        Boolean bool;
        C1YY A01 = FVI.A01();
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = A01;
        User A0Y = AbstractC166997dE.A0Y(userSession);
        this.A02 = A0Y;
        FanClubInfoDict B4O = A0Y.A03.B4O();
        if (B4O != null) {
            bool = B4O.AeJ();
        } else {
            bool = null;
        }
        C008002u A00 = C10E.A00(bool);
        this.A03 = A00;
        this.A04 = AbstractC208910l.A01(new C51758Mth((C5QE) null, (DefaultConstructorMarker) null, 3, 7, false), AbstractC141776au.A00(this), new C43818JZg(11, highlightReelTypeStr, A00), C10I.A01);
    }
}
