package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.E9f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32107E9f extends C0T6 implements AnonymousClass172 {
    public final User A00;
    public final String A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C32107E9f(User user, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A07 = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A04 = z4;
        this.A09 = z5;
        this.A0D = z6;
        this.A0C = z7;
        this.A0B = z8;
        this.A05 = z9;
        this.A0F = z10;
        this.A0E = z11;
        this.A06 = z12;
        this.A01 = str;
        this.A02 = C37054GUk.A00(this, 11);
        this.A03 = C37054GUk.A00(this, 12);
    }

    public static User A00(E70 e70) {
        return ((C32107E9f) e70.A09().get(0)).A00;
    }

    @Override // X.AnonymousClass176
    public final FollowStatus B7L() {
        return this.A00.B7L();
    }

    @Override // X.AnonymousClass172
    public final String B8y() {
        return this.A00.B8y();
    }

    @Override // X.C17G
    public final int BJ8() {
        return this.A00.BJ8();
    }

    @Override // X.C17K
    public final Long BTC() {
        return this.A00.BTC();
    }

    @Override // X.AnonymousClass173
    public final ImageUrl Bhu() {
        return this.A00.Bhu();
    }

    @Override // X.AnonymousClass175
    public final Integer Bkb() {
        return this.A00.Bkb();
    }

    @Override // X.C17I
    public final boolean CQf() {
        return this.A00.CQf();
    }

    @Override // X.C17A
    public final boolean CQw() {
        return this.A00.CQw();
    }

    @Override // X.AnonymousClass178
    public final boolean CS0(C150866ql c150866ql) {
        return this.A00.CS0(c150866ql);
    }

    @Override // X.C17H
    public final boolean CYY() {
        return this.A00.CYY();
    }

    @Override // X.C17J
    public final boolean CYb() {
        return this.A00.CYb();
    }

    @Override // X.AnonymousClass177
    public final boolean Cey() {
        return this.A00.Cey();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32107E9f) {
                C32107E9f c32107E9f = (C32107E9f) obj;
                if (!C14360o3.A0K(this.A00, c32107E9f.A00) || this.A07 != c32107E9f.A07 || this.A08 != c32107E9f.A08 || this.A0A != c32107E9f.A0A || this.A04 != c32107E9f.A04 || this.A09 != c32107E9f.A09 || this.A0D != c32107E9f.A0D || this.A0C != c32107E9f.A0C || this.A0B != c32107E9f.A0B || this.A05 != c32107E9f.A05 || this.A0F != c32107E9f.A0F || this.A0E != c32107E9f.A0E || this.A06 != c32107E9f.A06 || !C14360o3.A0K(this.A01, c32107E9f.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C17F
    public final String getFullName() {
        return this.A00.getFullName();
    }

    @Override // X.C17D
    public final String getId() {
        return this.A00.getId();
    }

    @Override // X.C17B
    public final String getShortName() {
        return this.A00.getShortName();
    }

    @Override // X.C17E
    public final String getUsername() {
        return this.A00.getUsername();
    }

    @Override // X.AnonymousClass172
    public final boolean isConnected() {
        return this.A00.isConnected();
    }

    @Override // X.AnonymousClass172
    public final boolean isRestricted() {
        return this.A00.isRestricted();
    }

    @Override // X.AnonymousClass172
    public final boolean isVerified() {
        return this.A00.isVerified();
    }

    @Override // X.AnonymousClass174
    public final boolean CPk() {
        return this.A00.A06;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166987dD.A0G(this.A00))))))))))))) + AbstractC167017dG.A0O(this.A01);
    }

    public static User A01(Iterator it) {
        return ((C32107E9f) it.next()).A00;
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C32107E9f) it.next()).A00);
    }
}
