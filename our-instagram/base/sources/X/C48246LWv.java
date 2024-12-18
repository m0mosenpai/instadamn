package X;

import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.session.UserSession;

/* renamed from: X.LWv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48246LWv implements MRT {
    public final TextPostAppHeaderFollowVariant A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final UserSession A04;
    public final boolean A05;

    @Override // X.MRT
    public final int AZ5() {
        return 5;
    }

    @Override // X.MRT
    public final boolean Akx() {
        return true;
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
        return this.A00;
    }

    @Override // X.MRT
    public final boolean BwK() {
        return this.A03;
    }

    @Override // X.MRT
    public final boolean Bwh() {
        return false;
    }

    @Override // X.MRT
    public final boolean CQ0() {
        return this.A01;
    }

    @Override // X.MRT
    public final boolean CYF() {
        return this.A05;
    }

    @Override // X.MRT
    public final boolean CYH() {
        return this.A02;
    }

    @Override // X.MRT
    public final boolean Cal() {
        return C18U.A06(C06090Tz.A05, this.A04, 36330922198778963L);
    }

    @Override // X.MRT
    public final boolean CbB() {
        return false;
    }

    @Override // X.MRT
    public final boolean CbV() {
        return true;
    }

    @Override // X.MRT
    public final boolean CcO() {
        return true;
    }

    @Override // X.MRT
    public final boolean CeZ() {
        return false;
    }

    public C48246LWv(UserSession userSession) {
        this.A04 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = C18U.A06(c06090Tz, userSession, 36321606414378629L);
        C18U.A06(c06090Tz, userSession, 36322130400389129L);
        if (C18U.A06(c06090Tz, userSession, 36322130400454666L)) {
            C18U.A06(c06090Tz, userSession, 36322130400520203L);
        }
        this.A00 = TextPostAppHeaderFollowVariant.A04;
        this.A03 = C18U.A06(c06090Tz, userSession, 36326446842525571L);
        this.A01 = C18U.A06(c06090Tz, userSession, 36323921401753279L) || C18U.A06(c06090Tz, userSession, 36328023095524399L);
        this.A02 = C18U.A06(c06090Tz, userSession, 36331128356881590L);
    }
}
