package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8EB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EB implements C8EC {
    public final C8EC A00;
    public final C85R A01;
    public final UserSession A02;
    public final List A03;
    public final List A04;

    @Override // X.C8EC
    public final void AV9(C8EF c8ef, boolean z) {
        this.A00.AV9(c8ef, z);
    }

    public C8EB(C85R c85r, UserSession userSession, List list, List list2) {
        C8EC c8ed;
        this.A01 = c85r;
        this.A03 = list;
        this.A02 = userSession;
        this.A04 = list2;
        if (c85r != null) {
            c8ed = new C23292AUd(c85r, list);
        } else {
            c8ed = new C8ED(userSession, list2);
        }
        this.A00 = c8ed;
    }
}
