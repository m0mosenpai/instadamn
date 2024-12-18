package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.E8l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32087E8l extends C0T6 implements InterfaceC66482zP {
    public final C5QE A00;
    public final EnumC99704do A01;
    public final User A02;
    public final boolean A03;
    public final Reel A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32087E8l) {
                C32087E8l c32087E8l = (C32087E8l) obj;
                if (!C14360o3.A0K(this.A02, c32087E8l.A02) || !C14360o3.A0K(this.A00, c32087E8l.A00) || this.A01 != c32087E8l.A01 || this.A03 != c32087E8l.A03 || !C14360o3.A0K(this.A04, c32087E8l.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.getId();
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02)))) + AbstractC167017dG.A0M(this.A04);
    }

    public C32087E8l(C5QE c5qe, EnumC99704do enumC99704do, Reel reel, User user, boolean z) {
        this.A02 = user;
        this.A00 = c5qe;
        this.A01 = enumC99704do;
        this.A03 = z;
        this.A04 = reel;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
