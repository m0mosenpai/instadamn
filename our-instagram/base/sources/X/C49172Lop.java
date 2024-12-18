package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Lop, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49172Lop implements MRV {
    public final int A00;
    public final long A01;
    public final C2EY A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    @Override // X.MRV
    public final C101674hc Axj() {
        return null;
    }

    @Override // X.MRV
    public final String BtC() {
        return null;
    }

    @Override // X.MRV
    public final ImageUrl BtJ() {
        return null;
    }

    @Override // X.MRV
    public final String CGv() {
        return null;
    }

    @Override // X.MRV
    public final boolean CPN() {
        return false;
    }

    @Override // X.MRV
    public final boolean CSd() {
        return false;
    }

    @Override // X.MRV
    public final boolean CSg() {
        return false;
    }

    @Override // X.MRV
    public final boolean CYm() {
        return false;
    }

    @Override // X.MRV
    public final boolean CYn() {
        return false;
    }

    @Override // X.MRV
    public final Boolean Cg0() {
        return null;
    }

    @Override // X.MRV
    public final boolean Cg2() {
        return false;
    }

    @Override // X.MRV
    public final boolean Cg3() {
        return false;
    }

    @Override // X.MRV
    public final boolean EJS() {
        return false;
    }

    @Override // X.MRV
    public final C2EY Ar9() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0011, code lost:
    
        if (r1 != 6) goto L14;
     */
    @Override // X.MRV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer BN5() {
        /*
            r2 = this;
            int r1 = r2.A00
            if (r1 == 0) goto L13
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 4
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L16
            r0 = 6
            if (r1 == r0) goto L1c
        L13:
            java.lang.Integer r0 = X.C05F.A00
            return r0
        L16:
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        L19:
            java.lang.Integer r0 = X.C05F.A0Y
            return r0
        L1c:
            java.lang.Integer r0 = X.C05F.A0j
            return r0
        L1f:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49172Lop.BN5():java.lang.Integer");
    }

    @Override // X.MRV
    public final List BsH() {
        return this.A07;
    }

    @Override // X.MRV
    public final String BtF() {
        return this.A05;
    }

    @Override // X.MRV
    public final CharSequence ByE() {
        return this.A06;
    }

    @Override // X.MRV
    public final long C8g() {
        return this.A01;
    }

    @Override // X.MRV
    public final java.util.Set CGn() {
        return C16910sj.A00;
    }

    @Override // X.MRV
    public final /* bridge */ /* synthetic */ Collection CGo() {
        return C16910sj.A00;
    }

    @Override // X.MRV
    public final List CHI() {
        return C16930sl.A00;
    }

    @Override // X.MRV
    public final boolean CM6() {
        int i = this.A00;
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }

    @Override // X.MRV
    public final boolean CVA() {
        return AbstractC31174DnI.A1Y(this.A03, this.A05);
    }

    @Override // X.MRV
    public final boolean CVD() {
        return this.A03.A1U();
    }

    @Override // X.MRV
    public final boolean Cd1() {
        return this.A08;
    }

    @Override // X.MRV
    public final String getId() {
        return this.A04;
    }

    public C49172Lop(C2EY c2ey, User user, String str, String str2, String str3, List list, int i, long j, boolean z) {
        this.A03 = user;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A01 = j;
        this.A02 = c2ey;
        this.A07 = list;
        this.A08 = z;
    }
}
