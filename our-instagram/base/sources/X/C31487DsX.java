package X;

import com.instagram.user.model.User;

/* renamed from: X.DsX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31487DsX extends C3CI {
    public final AbstractC31433Drd A00;
    public final C31440Drk A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object A01 = this.A01.A01(i);
        if (A01 instanceof User) {
            User user = (User) A01;
            if (this.A02.add(user.getId())) {
                this.A00.A0B(user, i);
            }
        }
    }

    public C31487DsX(AbstractC31433Drd abstractC31433Drd, C31440Drk c31440Drk) {
        this.A01 = c31440Drk;
        this.A00 = abstractC31433Drd;
    }

    @Override // X.C36Z
    public final Class CAO() {
        return User.class;
    }
}
