package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.NJn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52469NJn extends OX6 {
    public final C52457NJb A00;
    public final Reel A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52469NJn(UserSession userSession, C52457NJb c52457NJb, String str, String str2) {
        super(c52457NJb);
        Reel reel;
        C14360o3.A0B(userSession, 2);
        this.A00 = c52457NJb;
        this.A03 = str;
        this.A02 = str2;
        if (str2 != null) {
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            C14360o3.A07(A03);
            reel = A03.A0M(str);
        } else {
            reel = null;
        }
        this.A01 = reel;
    }
}
