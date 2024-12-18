package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.1N9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N9 implements C1NB {
    public final User A00;

    public C1N9(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    @Override // X.C1NB
    public final void ESL(ImageUrl imageUrl) {
    }

    @Override // X.C1NB
    public final EnumC73093Pk Ai9() {
        return EnumC73093Pk.A07;
    }

    @Override // X.C1NB
    public final String AsH() {
        return this.A00.getUsername();
    }

    @Override // X.C1NB
    public final ImageUrl AsM() {
        return this.A00.Bhu();
    }

    @Override // X.C1NB
    public final Integer BWG() {
        return C05F.A01;
    }

    @Override // X.C1NB
    public final Integer CBs() {
        return C05F.A01;
    }

    @Override // X.C1NB
    public final User CDj() {
        return this.A00;
    }

    @Override // X.C1NB
    public final String getId() {
        return this.A00.getId();
    }

    @Override // X.C1NB
    public final String getName() {
        return this.A00.getUsername();
    }

    public final String toString() {
        User user = this.A00;
        return AnonymousClass001.A0v("{user_id: ", user.getId(), " username: ", user.getUsername(), '}');
    }
}
