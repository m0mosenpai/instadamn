package X;

import androidx.paging.PageFetcher;
import androidx.paging.PagingConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mei, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50913Mei extends AbstractC52922bZ {
    public final int A00;
    public final InterfaceC09390do A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final C0UO A04;

    public C50913Mei(UserSession userSession, C52680NSk c52680NSk) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36601384880640183L);
        this.A01 = C57536PgA.A00(c52680NSk, new C8CY(c52680NSk.A00), 8);
        C008002u A00 = C10E.A00(null);
        this.A03 = A00;
        this.A04 = AbstractC208910l.A02(A00);
        this.A02 = PageFetcher.A01(this, new PagingConfig(3, 3, 3, true), new C57527Pg1(this, 19));
    }
}
