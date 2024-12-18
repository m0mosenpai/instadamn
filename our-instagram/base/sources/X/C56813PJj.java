package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PJj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56813PJj implements C8YD {
    public final Boolean A00;

    @Override // X.C8YD
    public final boolean CZ0() {
        return false;
    }

    @Override // X.C8YD
    public final boolean Ej9(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            bool = AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36310753032077579L);
        }
        return bool.booleanValue();
    }

    @Override // X.C8YD
    public final int BfT(UserSession userSession) {
        return AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36592228008984949L);
    }

    @Override // X.C8YD
    public final int BoD(UserSession userSession) {
        return AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36594014715446828L);
    }

    @Override // X.C8YD
    public final boolean EiG(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36310753032012042L) || C18U.A06(c06090Tz, userSession, 36312539738408096L) || C18U.A06(c06090Tz, userSession, 36312539738539169L)) && AbstractC31177DnL.A06() >= AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "caption_warning_earliest_next_request_time")) {
            return true;
        }
        return false;
    }

    @Override // X.C8YD
    public final boolean Ej8(UserSession userSession) {
        return C18U.A06(C06090Tz.A05, userSession, 36310753032208652L);
    }

    public C56813PJj(Boolean bool) {
        this.A00 = bool;
    }
}
