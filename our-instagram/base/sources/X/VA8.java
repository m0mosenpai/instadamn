package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes11.dex */
public final class VA8 extends Tx3 {
    public final User A00;
    public final List A01;

    @Override // X.AbstractC127945qN
    /* renamed from: A03 */
    public final boolean isContentSame(AbstractC127945qN abstractC127945qN) {
        return false;
    }

    public VA8(User user, List list) {
        super("search_follow_chaining_unit");
        this.A00 = user;
        this.A01 = list;
    }

    @Override // X.AbstractC127945qN
    public final long A00() {
        return 30L;
    }

    @Override // X.AbstractC127945qN, X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
