package X;

import com.facebook.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114775Gk extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C54719OEw A07;
    public final Map A08;
    public final C05A A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;

    public C114775Gk(C54719OEw c54719OEw, O3Y o3y) {
        C14360o3.A0B(c54719OEw, 1);
        C14360o3.A0B(o3y, 2);
        this.A07 = c54719OEw;
        this.A03 = TimeUnit.SECONDS.toMillis((int) C18U.A01(C06090Tz.A05, o3y.A00, 36592760585847469L));
        EnumC53152Nf7 enumC53152Nf7 = EnumC53152Nf7.A02;
        C09530e4 c09530e4 = new C09530e4(enumC53152Nf7, new C51752Mtb(enumC53152Nf7, R.drawable.ig_illustrations_qp_activity_refresh, 2131975634));
        EnumC53152Nf7 enumC53152Nf72 = EnumC53152Nf7.A03;
        C09530e4 c09530e42 = new C09530e4(enumC53152Nf72, new C51752Mtb(enumC53152Nf72, R.drawable.ig_illustrations_qp_activity_refresh, 2131975635));
        EnumC53152Nf7 enumC53152Nf73 = EnumC53152Nf7.A05;
        C09530e4 c09530e43 = new C09530e4(enumC53152Nf73, new C51752Mtb(enumC53152Nf73, R.drawable.ig_illustrations_qp_search_refresh, 2131975637));
        EnumC53152Nf7 enumC53152Nf74 = EnumC53152Nf7.A04;
        this.A08 = AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, new C09530e4(enumC53152Nf74, new C51752Mtb(enumC53152Nf74, R.drawable.ig_illustrations_qp_new_post_refresh, 2131975636)));
        C008002u c008002u = new C008002u(new Object());
        this.A0B = c008002u;
        C008002u c008002u2 = new C008002u(new Object());
        this.A09 = c008002u2;
        C05A c05a = c54719OEw.A06;
        this.A0A = c05a;
        PVB pvb = new PVB(this, c05a);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A06 = AbstractC58232lf.A00(anonymousClass191, pvb);
        this.A05 = AbstractC58232lf.A00(anonymousClass191, new PV5(new C15340po(new PZH(this, null, 49), C10Q.A03(new C57182PaB(this, (InterfaceC23621Ds) null, 32, 42), c05a, c008002u))));
        this.A04 = AbstractC58232lf.A00(anonymousClass191, new C15340po(new PZS(this, null, 32), C10Q.A03(new C57182PaB(this, (InterfaceC23621Ds) null, 31, 42), c05a, c008002u2)));
    }

    public final void A00() {
        this.A01 = true;
        this.A0B.Egh(new Object());
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
    }
}
