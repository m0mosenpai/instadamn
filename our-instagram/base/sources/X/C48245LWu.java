package X;

import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.session.UserSession;

/* renamed from: X.LWu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48245LWu implements MRT {
    public final boolean A00;
    public final /* synthetic */ C48246LWv A01;

    @Override // X.MRT
    public final boolean Cal() {
        return this.A01.Cal();
    }

    @Override // X.MRT
    public final int AZ5() {
        return 5;
    }

    @Override // X.MRT
    public final boolean Akx() {
        return this.A00;
    }

    @Override // X.MRT
    public final boolean Al1() {
        return false;
    }

    @Override // X.MRT
    public final boolean Axv() {
        return false;
    }

    @Override // X.MRT
    public final boolean BDs() {
        return true;
    }

    @Override // X.MRT
    public final int BPt() {
        return 30;
    }

    @Override // X.MRT
    public final TextPostAppHeaderFollowVariant BcR() {
        return this.A01.A00;
    }

    @Override // X.MRT
    public final boolean BwK() {
        return this.A01.A03;
    }

    @Override // X.MRT
    public final boolean Bwh() {
        return false;
    }

    @Override // X.MRT
    public final boolean CQ0() {
        return this.A01.A01;
    }

    @Override // X.MRT
    public final boolean CYF() {
        return false;
    }

    @Override // X.MRT
    public final boolean CYH() {
        return this.A01.A02;
    }

    @Override // X.MRT
    public final boolean CbB() {
        return false;
    }

    @Override // X.MRT
    public final boolean CbV() {
        return false;
    }

    @Override // X.MRT
    public final boolean CcO() {
        return false;
    }

    @Override // X.MRT
    public final boolean CeZ() {
        return false;
    }

    public C48245LWu(C44508JmE c44508JmE) {
        UserSession userSession = c44508JmE.A07;
        this.A01 = new C48246LWv(userSession);
        this.A00 = C18U.A06(C06090Tz.A05, userSession, 36322735990974913L);
    }
}
