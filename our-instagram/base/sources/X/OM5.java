package X;

import androidx.paging.PageEvent$Insert;
import androidx.paging.PagingConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OM5 {
    public int A00;
    public int A01;
    public int A02;
    public OMK A03;
    public final PagingConfig A04;
    public final List A05;
    public final List A06;
    public final Map A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC24731Iq A09;

    public final PageEvent$Insert A00(EnumC53109NeM enumC53109NeM, C51077MhX c51077MhX) {
        int i;
        int i2;
        OX8 A01;
        OX8 ox8;
        EnumC53109NeM enumC53109NeM2;
        boolean A1R = AbstractC167007dF.A1R(0, c51077MhX, enumC53109NeM);
        int ordinal = enumC53109NeM.ordinal();
        int i3 = 0;
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal == 2) {
                    i3 = (this.A06.size() - this.A02) - 1;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i3 = -this.A02;
            }
        }
        List A1J = AbstractC166987dD.A1J(new C55090Oaw(i3, c51077MhX.A04));
        if (ordinal != 0) {
            ox8 = null;
            PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
            boolean z = this.A04.A03;
            if (ordinal != A1R) {
                if (z) {
                    i2 = this.A00;
                } else {
                    i2 = 0;
                }
                A01 = this.A03.A01();
                C14360o3.A0B(A01, 2);
                enumC53109NeM2 = EnumC53109NeM.APPEND;
                i = -1;
            } else {
                if (z) {
                    i = this.A01;
                } else {
                    i = 0;
                }
                A01 = this.A03.A01();
                C14360o3.A0B(A01, 2);
                enumC53109NeM2 = EnumC53109NeM.PREPEND;
                i2 = -1;
            }
        } else {
            PageEvent$Insert pageEvent$Insert2 = PageEvent$Insert.A06;
            if (this.A04.A03) {
                i = this.A01;
                i2 = this.A00;
            } else {
                i = 0;
                i2 = 0;
            }
            A01 = this.A03.A01();
            ox8 = null;
            C14360o3.A0B(A01, 3);
            enumC53109NeM2 = EnumC53109NeM.REFRESH;
        }
        return new PageEvent$Insert(A01, ox8, enumC53109NeM2, A1J, i, i2);
    }

    public final boolean A02(EnumC53109NeM enumC53109NeM, C51077MhX c51077MhX, int i) {
        Map map;
        EnumC53109NeM enumC53109NeM2;
        int i2;
        int i3;
        int A06 = AbstractC167007dF.A06(1, enumC53109NeM, c51077MhX);
        int ordinal = enumC53109NeM.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == A06) {
                    if (AbstractC166987dD.A1b(this.A06)) {
                        if (i == 0) {
                            this.A05.add(c51077MhX);
                            int i4 = c51077MhX.A00;
                            if (i4 == Integer.MIN_VALUE) {
                                if (this.A04.A03) {
                                    i3 = this.A00;
                                } else {
                                    i3 = 0;
                                }
                                i4 = i3 - c51077MhX.A04.size();
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                            }
                            if (i4 == Integer.MIN_VALUE) {
                                i4 = 0;
                            }
                            this.A00 = i4;
                            map = this.A07;
                            enumC53109NeM2 = EnumC53109NeM.APPEND;
                            map.remove(enumC53109NeM2);
                        }
                        return false;
                    }
                    throw AbstractC166987dD.A14("should've received an init before append");
                }
            } else {
                if (AbstractC166987dD.A1b(this.A06)) {
                    if (i == 0) {
                        this.A05.add(0, c51077MhX);
                        this.A02++;
                        int i5 = c51077MhX.A01;
                        if (i5 == Integer.MIN_VALUE) {
                            if (this.A04.A03) {
                                i2 = this.A01;
                            } else {
                                i2 = 0;
                            }
                            i5 = i2 - c51077MhX.A04.size();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                        }
                        if (i5 == Integer.MIN_VALUE) {
                            i5 = 0;
                        }
                        this.A01 = i5;
                        map = this.A07;
                        enumC53109NeM2 = EnumC53109NeM.PREPEND;
                        map.remove(enumC53109NeM2);
                    }
                    return false;
                }
                throw AbstractC166987dD.A14("should've received an init before prepend");
            }
            return true;
        }
        if (this.A06.isEmpty()) {
            if (i == 0) {
                this.A05.add(c51077MhX);
                this.A02 = 0;
                int i6 = c51077MhX.A00;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = 0;
                }
                this.A00 = i6;
                int i7 = c51077MhX.A01;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = 0;
                }
                this.A01 = i7;
                return true;
            }
            throw AbstractC166987dD.A14("init loadId must be the initial value, 0");
        }
        throw AbstractC166987dD.A14("cannot receive multiple init calls");
    }

    public final C54827OLm A01(C51082Mhh c51082Mhh) {
        Integer num;
        int i;
        int i2;
        int size;
        List list = this.A06;
        List A0a = AbstractC001800i.A0a(list);
        if (c51082Mhh != null) {
            PagingConfig pagingConfig = this.A04;
            if (pagingConfig.A03) {
                i2 = this.A01;
            } else {
                i2 = 0;
            }
            int i3 = -this.A02;
            int A09 = AbstractC25229BEm.A09(list) - this.A02;
            int i4 = c51082Mhh.A01;
            for (int i5 = i3; i5 < i4; i5++) {
                if (i5 > A09) {
                    size = pagingConfig.A01;
                } else {
                    size = ((C51077MhX) list.get(this.A02 + i5)).A04.size();
                }
                i2 += size;
            }
            int i6 = i2 + c51082Mhh.A00;
            if (i4 < i3) {
                i6 -= pagingConfig.A01;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        PagingConfig pagingConfig2 = this.A04;
        if (pagingConfig2.A03) {
            i = this.A01;
        } else {
            i = 0;
        }
        return new C54827OLm(pagingConfig2, num, A0a, i);
    }

    public OM5(PagingConfig pagingConfig) {
        this.A04 = pagingConfig;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A05 = A1E;
        this.A06 = A1E;
        Integer num = C05F.A01;
        this.A09 = new C71533It(1, num);
        this.A08 = new C71533It(1, num);
        this.A07 = AbstractC166987dD.A1I();
        OMK omk = new OMK();
        omk.A02(C51059MhD.A00, EnumC53109NeM.REFRESH);
        this.A03 = omk;
    }
}
