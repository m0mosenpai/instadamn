package X;

import com.instagram.user.model.User;

/* renamed from: X.E8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32091E8p extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final C5QE A01;
    public final C5QE A02;
    public final C5QE A03;
    public final EnumC99704do A04;
    public final EnumC99704do A05;
    public final User A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;

    public /* synthetic */ C32091E8p(C5QE c5qe, C5QE c5qe2, EnumC99704do enumC99704do, User user, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        c5qe = (i & 4) != 0 ? MVZ.A00("") : c5qe;
        enumC99704do = (i & 8) != 0 ? EnumC99704do.A06 : enumC99704do;
        if ((i & 16) != 0) {
            num2 = C05F.A0Y;
        } else {
            num2 = null;
        }
        BQO A00 = (i & 32) != 0 ? MVZ.A00("") : null;
        EnumC99704do enumC99704do2 = (i & 64) != 0 ? EnumC99704do.A08 : null;
        z = (i & 128) != 0 ? false : z;
        z2 = (i & 256) != 0 ? false : z2;
        c5qe2 = (i & 1024) != 0 ? MVZ.A00("") : c5qe2;
        AbstractC167017dG.A1Q(user, c5qe);
        AbstractC25234BEr.A0k(4, enumC99704do, num2, A00, enumC99704do2);
        C14360o3.A0B(c5qe2, 11);
        this.A06 = user;
        this.A07 = num;
        this.A02 = c5qe;
        this.A04 = enumC99704do;
        this.A08 = num2;
        this.A03 = A00;
        this.A05 = enumC99704do2;
        this.A00 = z;
        this.A09 = z2;
        this.A01 = c5qe2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32091E8p) {
                C32091E8p c32091E8p = (C32091E8p) obj;
                if (!C14360o3.A0K(this.A06, c32091E8p.A06) || this.A07 != c32091E8p.A07 || !C14360o3.A0K(this.A02, c32091E8p.A02) || this.A04 != c32091E8p.A04 || this.A08 != c32091E8p.A08 || !C14360o3.A0K(this.A03, c32091E8p.A03) || this.A05 != c32091E8p.A05 || this.A00 != c32091E8p.A00 || this.A09 != c32091E8p.A09 || !C14360o3.A0K(this.A01, c32091E8p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06.getId();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A00, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0G(this.A06) + F0D.A00(this.A07)) * 31)) + F0D.A00(this.A08)) * 31)))) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
