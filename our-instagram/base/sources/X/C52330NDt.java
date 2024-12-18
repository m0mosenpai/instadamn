package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;

/* renamed from: X.NDt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52330NDt extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C15750qV A02;
    public final O8I A03;
    public final N2B A04;
    public final InterfaceC168017ew A05;
    public final C34698FQj A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C52330NDt(Application application, InterfaceC11380iw interfaceC11380iw, UserSession userSession, O8I o8i, N2B n2b, InterfaceC168017ew interfaceC168017ew, C34698FQj c34698FQj, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167027dH.A0a(1, userSession, interfaceC11380iw, o8i, n2b);
        C14360o3.A0B(c34698FQj, 6);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = o8i;
        this.A04 = n2b;
        this.A05 = interfaceC168017ew;
        this.A06 = c34698FQj;
        this.A07 = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A0D = z5;
        this.A0B = z6;
        this.A09 = z7;
        this.A02 = new C15750qV(application);
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        N2B n2b = this.A04;
        boolean z = this.A0B;
        FollowRequestsRepository followRequestsRepository = new FollowRequestsRepository(userSession, n2b, z);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        FR5 fr5 = new FR5(interfaceC11380iw, userSession);
        C166237bs c166237bs = new C166237bs();
        FollowRequestsActionDataSource followRequestsActionDataSource = new FollowRequestsActionDataSource(interfaceC11380iw, userSession, this.A02, F9N.A00(userSession), this.A05);
        C166257bu c166257bu = new C166257bu(userSession, followRequestsActionDataSource, c166237bs);
        N83 n83 = new N83(userSession, this.A03, followRequestsActionDataSource, followRequestsRepository, c166257bu, this.A06);
        N82 n82 = new N82(userSession, followRequestsRepository, c166257bu, new C63702ur(interfaceC11380iw, userSession), this.A0A);
        return new N86(followRequestsRepository, n83, new N81(followRequestsRepository), n82, fr5, this.A07, this.A08, this.A0C, this.A0D, z, C18U.A06(C06090Tz.A05, userSession, 36329646593163736L), this.A09, AbstractC31177DnL.A1a(AbstractC166997dE.A0Y(userSession).A0J()));
    }
}
