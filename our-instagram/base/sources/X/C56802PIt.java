package X;

import com.instagram.user.model.User;

/* renamed from: X.PIt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56802PIt implements InterfaceC58171Pqb {
    public int A00;
    public int A01;
    public long A02;
    public QJ0 A03;
    public User A04;
    public EnumC53245Ngi A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C56802PIt() {
        EnumC53245Ngi enumC53245Ngi = EnumC53245Ngi.A0D;
        boolean A1Y = AbstractC25229BEm.A1Y(enumC53245Ngi);
        this.A05 = enumC53245Ngi;
        this.A01 = A1Y ? 1 : 0;
        this.A07 = null;
        this.A03 = null;
        this.A04 = null;
        this.A09 = null;
        this.A08 = null;
        this.A02 = AbstractC43593JPy.A07();
        this.A00 = 2;
    }

    @Override // X.InterfaceC58171Pqb
    public final long Asb() {
        return this.A02;
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        switch (this.A05.ordinal()) {
            case 0:
                if (this.A01 > 1) {
                    return EnumC53264Nh2.A08;
                }
                return EnumC53264Nh2.A0G;
            case 1:
                return EnumC53264Nh2.A0H;
            case 2:
                return EnumC53264Nh2.A0I;
            case 3:
            case 5:
            case 6:
            default:
                return EnumC53264Nh2.A0K;
            case 4:
                return EnumC53264Nh2.A0M;
            case 7:
                return EnumC53264Nh2.A0B;
            case 8:
                return EnumC53264Nh2.A05;
            case 9:
                return EnumC53264Nh2.A0L;
            case 10:
                return EnumC53264Nh2.A0O;
            case 11:
                return EnumC53264Nh2.A07;
        }
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A04;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getPk() {
        return this.A06;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A09;
    }
}
