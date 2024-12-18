package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.MTq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50559MTq extends C0T6 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50559MTq(Integer num, String str, long j) {
        this(num, (Long) null, str, j);
        this.A00 = 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50559MTq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A01;
        int A012;
        int A0C;
        int hashCode;
        switch (this.A00) {
            case 0:
                A01 = AbstractC25236BEt.A01(this.A01, AbstractC166987dD.A0G(this.A02));
                break;
            case 1:
                A012 = (AbstractC25236BEt.A01(this.A01, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0M(this.A02)) * 31;
                Integer num = (Integer) this.A03;
                A0C = AbstractC25230BEn.A0C(num, AbstractC54087Nvl.A00(num));
                return A0C + A012;
            case 2:
                return this.A03.hashCode();
            case 3:
                A012 = AbstractC25236BEt.A01(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A03)));
                A0C = AbstractC167017dG.A0M(this.A02);
                return A0C + A012;
            default:
                A01 = (AbstractC25235BEs.A03(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31;
                break;
        }
        Object obj = this.A03;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        A0C = (A01 + hashCode) * 31;
        A012 = AbstractC25227BEk.A07(this.A04);
        return A0C + A012;
    }

    public C50559MTq(Long l, Long l2, String str, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
        this.A03 = l2;
        this.A04 = str;
    }

    public C50559MTq(Integer num, Long l, String str, long j) {
        this.A00 = 1;
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A01 = j;
        this.A02 = l;
        this.A03 = num;
    }

    public C50559MTq(C41181vS c41181vS) {
        String A2u;
        Long A0k;
        this.A00 = 2;
        C14360o3.A0B(c41181vS, 1);
        this.A03 = c41181vS;
        String str = c41181vS.A0j;
        C14360o3.A07(str);
        this.A04 = str;
        C38321qM c38321qM = c41181vS.A0b;
        this.A01 = (c38321qM == null || (A2u = c38321qM.A2u()) == null || (A0k = AbstractC003100w.A0k(10, A2u)) == null) ? 0L : A0k.longValue();
        this.A02 = c41181vS.A06();
    }

    public C50559MTq(ImageUrl imageUrl, User user, String str, long j) {
        this.A00 = 3;
        this.A03 = user;
        this.A04 = str;
        this.A01 = j;
        this.A02 = imageUrl;
    }

    public C50559MTq(EnumC53207Ng5 enumC53207Ng5, MUD mud, String str, long j) {
        this.A00 = 0;
        C14360o3.A0B(mud, 1);
        this.A02 = mud;
        this.A01 = j;
        this.A03 = enumC53207Ng5;
        this.A04 = str;
    }
}
