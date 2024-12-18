package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class Jx8 extends C0T6 {
    public final int A00;
    public final long A01;
    public final LatLng A02;
    public final C4F5 A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        Jx8 jx8;
        if (obj instanceof Jx8) {
            jx8 = (Jx8) obj;
        } else {
            jx8 = null;
        }
        if (jx8 == null || !C14360o3.A0K(this.A09, jx8.A09) || this.A0E != jx8.A0E || this.A0C != jx8.A0C || this.A0B != jx8.A0B || this.A05 != jx8.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0B, (((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0D, AbstractC25236BEt.A01(this.A01, AbstractC166997dE.A0J(this.A04, (AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0J(this.A09) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31))))))) + this.A00) * 31) + AbstractC167017dG.A0O(this.A07)) * 31)) + AbstractC25227BEk.A07(this.A06)) * 31) + AbstractC40653I0l.A00(this.A05);
    }

    public Jx8(LatLng latLng, C4F5 c4f5, User user, Integer num, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A09 = str;
        this.A08 = str2;
        this.A02 = latLng;
        this.A03 = c4f5;
        this.A04 = user;
        this.A01 = j;
        this.A0D = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A00 = i;
        this.A07 = str3;
        this.A0B = z6;
        this.A0G = z7;
        this.A06 = str4;
        this.A05 = num;
    }
}
