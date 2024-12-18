package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42937Iyp implements C1PE {
    public final int A00;

    public C42937Iyp(int i) {
        this.A00 = i;
    }

    @Override // X.C1PE
    public final C1PY AMn(UserSession userSession) {
        int i;
        if (this.A00 != 0) {
            i = 4;
        } else {
            i = 0;
        }
        return new C37481Gez(i);
    }

    @Override // X.C1PE
    public final boolean ABH(UserSession userSession) {
        return false;
    }
}
