package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.E9x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32124E9x extends MTJ {
    public final C69613Av A00;
    public final C69613Av A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32124E9x(UserSession userSession) {
        super(userSession, "suggested_users", 31792371);
        C14360o3.A0B(userSession, 1);
        this.A00 = A02("new_suggestions_follow_statuses");
        this.A01 = A02("suggestions_follow_statuses");
    }
}
