package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.55T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55T {
    public final int A00;
    public final HashSet A01 = new HashSet();
    public final UserSession A02;

    public C55T(UserSession userSession) {
        this.A02 = userSession;
        C85013qp A00 = AbstractC84973ql.A00(userSession);
        this.A00 = A00.A02 - ((C23031Ai) A00.A06.A07.getValue()).A01.getInt("content_note_rec_nux_shown_count", 0);
    }
}
