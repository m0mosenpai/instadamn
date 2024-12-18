package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SYZ {
    public static final List A02 = Collections.unmodifiableList(AbstractC16960so.A1Q(EnumC61218RhI.IAB_LANDING_PAGE_STARTED, EnumC61218RhI.IAB_LANDING_PAGE_INTERACTIVE, EnumC61218RhI.IAB_LANDING_PAGE_FINISHED, EnumC61218RhI.IAB_LANDING_PAGE_VIEW_ENDED));
    public C2JJ A00;
    public final UserSession A01;

    public final String A00(String str) {
        if (this.A00 != null && C2JJ.A00 && str != null) {
            return "[Sanitized for ePD Compliance]";
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2JJ, java.lang.Object] */
    public SYZ(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 2342156145952622382L)) {
            ?? obj = new Object();
            this.A00 = obj;
            obj.A00(userSession);
        }
        this.A01 = userSession;
    }
}
