package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Gmq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37948Gmq {
    public final int A00;
    public final UserSession A01;
    public final Reel A02;
    public final C41181vS A03;
    public final C41551w4 A04;
    public final C141596ac A05;
    public final boolean A06;
    public final boolean A07;

    public C37948Gmq(UserSession userSession, Reel reel, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, int i, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = c41551w4;
        this.A02 = reel;
        this.A03 = c41181vS;
        this.A05 = c141596ac;
        this.A00 = i;
        this.A06 = z;
        this.A07 = AbstractC141736aq.A02(c41551w4);
    }

    public final int A00() {
        return C41551w4.A00(this.A01, this.A04).indexOf(this.A03);
    }
}
