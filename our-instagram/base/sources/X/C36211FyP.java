package X;

import com.instagram.user.model.User;

/* renamed from: X.FyP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36211FyP implements InterfaceC66482zP {
    public final int A00;
    public final C51752Mtb A01;
    public final E6X A02;
    public final User A03;
    public final Float A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C36211FyP(C51752Mtb c51752Mtb, E6X e6x, User user, Float f, Integer num, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A03 = user;
        this.A07 = str2;
        this.A02 = e6x;
        this.A01 = c51752Mtb;
        this.A04 = f;
        this.A05 = num;
        this.A00 = i;
        this.A09 = z;
        this.A0D = z2;
        this.A08 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0E = z6;
        this.A0C = z7;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C36211FyP c36211FyP = (C36211FyP) obj;
        C14360o3.A0B(c36211FyP, 0);
        if (C14360o3.A0K(this.A06, c36211FyP.A06)) {
            User user = this.A03;
            String str2 = null;
            if (user != null) {
                str = AbstractC76433bn.A00(user);
            } else {
                str = null;
            }
            User user2 = c36211FyP.A03;
            if (user2 != null) {
                str2 = AbstractC76433bn.A00(user2);
            }
            if (C14360o3.A0K(str, str2) && C14360o3.A0K(this.A07, c36211FyP.A07) && C14360o3.A0K(this.A02, c36211FyP.A02) && C14360o3.A0K(this.A05, c36211FyP.A05) && this.A00 == c36211FyP.A00 && this.A0D == c36211FyP.A0D && this.A08 == c36211FyP.A08 && this.A0A == c36211FyP.A0A && this.A0B == c36211FyP.A0B) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }
}
