package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110204xp extends C0T6 implements InterfaceC110214xq {
    public final long A00;
    public final C38698H2j A01;
    public final C110094xe A02;
    public final C110124xh A03;
    public final C38704H2p A04;
    public final JK2 A05;
    public final C110154xk A06;
    public final Boolean A07;
    public final Integer A08;
    public final List A09;
    public final List A0A;

    public C110204xp(C38698H2j c38698H2j, C110094xe c110094xe, C110124xh c110124xh, C38704H2p c38704H2p, JK2 jk2, C110154xk c110154xk, Boolean bool, Integer num, List list, List list2, long j) {
        C14360o3.A0B(list, 5);
        this.A02 = c110094xe;
        this.A03 = c110124xh;
        this.A08 = num;
        this.A04 = c38704H2p;
        this.A09 = list;
        this.A07 = bool;
        this.A01 = c38698H2j;
        this.A00 = j;
        this.A05 = jk2;
        this.A06 = c110154xk;
        this.A0A = list2;
    }

    @Override // X.InterfaceC110214xq
    public final C110204xp F4L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110204xp) {
                C110204xp c110204xp = (C110204xp) obj;
                if (!C14360o3.A0K(this.A02, c110204xp.A02) || !C14360o3.A0K(this.A03, c110204xp.A03) || !C14360o3.A0K(this.A08, c110204xp.A08) || !C14360o3.A0K(this.A04, c110204xp.A04) || !C14360o3.A0K(this.A09, c110204xp.A09) || !C14360o3.A0K(this.A07, c110204xp.A07) || !C14360o3.A0K(this.A01, c110204xp.A01) || this.A00 != c110204xp.A00 || !C14360o3.A0K(this.A05, c110204xp.A05) || !C14360o3.A0K(this.A06, c110204xp.A06) || !C14360o3.A0K(this.A0A, c110204xp.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC110214xq
    public final /* bridge */ /* synthetic */ InterfaceC110104xf AdG() {
        return this.A02;
    }

    @Override // X.InterfaceC110214xq
    public final /* bridge */ /* synthetic */ InterfaceC110134xi B0l() {
        return this.A03;
    }

    @Override // X.InterfaceC110214xq
    public final Integer BTu() {
        return this.A08;
    }

    @Override // X.InterfaceC110214xq
    public final /* bridge */ /* synthetic */ InterfaceC43505JJr Bp4() {
        return this.A04;
    }

    @Override // X.InterfaceC110214xq
    public final List BsT() {
        return this.A09;
    }

    @Override // X.InterfaceC110214xq
    public final Boolean Bv7() {
        return this.A07;
    }

    @Override // X.InterfaceC110214xq
    public final /* bridge */ /* synthetic */ InterfaceC43503JJp Bxu() {
        return this.A01;
    }

    @Override // X.InterfaceC110214xq
    public final JK2 C8X() {
        return this.A05;
    }

    @Override // X.InterfaceC110214xq
    public final /* bridge */ /* synthetic */ InterfaceC110164xl C8Y() {
        return this.A06;
    }

    @Override // X.InterfaceC110214xq
    public final List CAa() {
        return this.A0A;
    }

    @Override // X.InterfaceC110214xq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateInfo", AbstractC225849y3.A00(this));
    }

    @Override // X.InterfaceC110214xq
    public final long getTemplateClipsMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        C110094xe c110094xe = this.A02;
        int i = 0;
        if (c110094xe == null) {
            hashCode = 0;
        } else {
            hashCode = c110094xe.hashCode();
        }
        int i2 = hashCode * 31;
        C110124xh c110124xh = this.A03;
        if (c110124xh == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c110124xh.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.A08;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C38704H2p c38704H2p = this.A04;
        if (c38704H2p == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c38704H2p.hashCode();
        }
        int hashCode9 = (((i4 + hashCode4) * 31) + this.A09.hashCode()) * 31;
        Boolean bool = this.A07;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i5 = (hashCode9 + hashCode5) * 31;
        C38698H2j c38698H2j = this.A01;
        if (c38698H2j == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c38698H2j.hashCode();
        }
        long j = this.A00;
        int i6 = (((i5 + hashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        JK2 jk2 = this.A05;
        if (jk2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = jk2.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        C110154xk c110154xk = this.A06;
        if (c110154xk == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c110154xk.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        List list = this.A0A;
        if (list != null) {
            i = list.hashCode();
        }
        return i8 + i;
    }
}
