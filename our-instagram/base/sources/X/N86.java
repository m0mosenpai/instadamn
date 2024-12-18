package X;

import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1;
import java.io.Closeable;

/* loaded from: classes9.dex */
public final class N86 extends AbstractC61152qd {
    public final C92694De A00 = AbstractC166177bl.A00(MZG.A00);
    public final FollowRequestsRepository A01;
    public final N83 A02;
    public final N81 A03;
    public final N82 A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final FR5 A0I;

    public N86(FollowRequestsRepository followRequestsRepository, N83 n83, N81 n81, N82 n82, FR5 fr5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A02 = n83;
        this.A04 = n82;
        this.A03 = n81;
        this.A01 = followRequestsRepository;
        this.A0I = fr5;
        this.A0A = z;
        this.A0B = z2;
        this.A0G = z3;
        this.A0H = z4;
        this.A0F = z5;
        this.A0E = z6;
        this.A0D = z7;
        this.A0C = z8;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AnonymousClass111.A04(AbstractC07080Za.A03(A12), n83.A08, n82.A06, n81.A03);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A07 = A1A;
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        addCloseable((Closeable) followRequestsRepository);
        n83.A04(this, true);
        n82.A04(this, true);
        n81.A04(this, true);
        if (!this.A0F) {
            PZF.A02(this, AbstractC141776au.A00(this), 49);
        }
        this.A09 = AbstractC208910l.A01(new C28177CbP(C29332CwR.A00, C5HZ.A01, false), AbstractC141776au.A00(this), C10Q.A01(new FollowRequestsViewModel$state$1(this, null), followRequestsRepository.A06, A1A, n82.A07, A00), C10I.A01);
    }

    public static final void A00(N86 n86) {
        C05A c05a = n86.A07;
        do {
        } while (!c05a.AIi(c05a.getValue(), AbstractC166997dE.A0b()));
        if (!n86.A0F) {
            n86.A01.A01.Chh();
        }
    }

    public final CWX A01() {
        return (CWX) this.A02.A06.getValue();
    }

    public final void A03() {
        this.A0I.A00();
        PZF.A02(this, AbstractC141776au.A00(this), 48);
    }

    public final void A02() {
        PZF.A02(this, AbstractC141776au.A00(this), 47);
    }
}
